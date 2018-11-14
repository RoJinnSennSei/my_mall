package com.d2c.chest.provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.d2c.chest.api.dto.SimilarRuleDTO;
import com.d2c.chest.api.entity.SimilarRuleDO;
import com.d2c.chest.api.service.SimilarRuleService;
import com.d2c.chest.provider.dao.SimilarRuleMapper;
import com.d2c.chest.provider.enums.SimilarRuleEnum;
import com.d2c.common.base.utils.ConvertUt;
import com.d2c.mybatis.service.ListServiceImpl;

/**
 * @author wull
 */
@Service(protocol = "dubbo")
public class SimilarRuleServiceImpl extends ListServiceImpl<SimilarRuleDO> implements SimilarRuleService {
	
	@Autowired
	private SimilarRuleMapper mapper;
	
	public SimilarRuleDTO getSimilarRuleOnEdit(Integer ruleId){
		SimilarRuleDTO bean = convert(findOneById(ruleId));
//		bean.setDimenKeys(dimenKeyService.findDimenKeys(ruleId));
//		bean.setDimenTpls(dimenTplService.findDimenTplByRuleCode(bean.getRuleCode()));
		return bean;
	}

	/**
	 * 创建默认规则
	 */
	public List<SimilarRuleDO> createRuleBySchemeId(Integer schemeId) {
		List<SimilarRuleDO> list = findRulesBySchemeId(schemeId);
		if(list.isEmpty()){
			list = SimilarRuleEnum.getAllRules();
			for(SimilarRuleDO rule : list){
				rule.setSchemeId(schemeId);
				save(rule);
			}
		}
		return list;
	}

	@Override
	public SimilarRuleDO findRuleByCode(Integer schemeId, String ruleCode) {
		return mapper.findRuleByCode(schemeId, ruleCode);
	}

	@Override
	public List<SimilarRuleDO> findRulesBySchemeId(Integer schemeId) {
		return findByFieldName("schemeId", schemeId);
	}
	
	private SimilarRuleDTO convert(SimilarRuleDO bean){
		return ConvertUt.convertBean(bean, SimilarRuleDTO.class);
	}
}
