import java.io.IOException;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.webapp.WebAppContext;

public class FlameWebMain {

	private static final String rootPath = "d2cmall/d2cmall-main/d2cmall-main-web/";

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		int port = 8081;
		if (args.length > 0) {
			try {
				port = new Integer(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Invalid port '" + args[0] + "'. Port must be a number.");
				System.exit(1);
			}
		}
		Server server = new Server();
		QueuedThreadPool threadPool = new QueuedThreadPool();
		threadPool.setMaxThreads(100);
		server.setThreadPool(threadPool);
		Connector connector = new SelectChannelConnector();
		connector.setPort(port);
		server.setConnectors(new Connector[] { connector });
		WebAppContext context = new WebAppContext();
		context.setContextPath("/");
		context.setResourceBase(rootPath + "src/main/webapp");
		context.setDefaultsDescriptor(rootPath + "src/main/webapp/mywebdefaults.xml");
		ResourceHandler staticResourceHandler = new ResourceHandler();
		staticResourceHandler.setResourceBase("/home/www/upload");
		staticResourceHandler.setDirectoriesListed(true);
		ContextHandler staticContextHandler = new ContextHandler();
		staticContextHandler.setContextPath("/upload");
		staticContextHandler.setHandler(staticResourceHandler);
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { staticContextHandler, context });
		server.setHandler(handlers);
		try {
			server.start();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
