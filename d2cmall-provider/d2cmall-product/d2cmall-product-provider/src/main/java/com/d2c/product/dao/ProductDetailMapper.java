package com.d2c.product.dao;

import org.apache.ibatis.annotations.Param;

import com.d2c.mybatis.mapper.SuperMapper;
import com.d2c.product.model.ProductDetail;

public interface ProductDetailMapper extends SuperMapper<ProductDetail> {

	ProductDetail findByProductId(Long productId);

	int updateAttribute(@Param("productId") Long productId, @Param("attributeGroupId") Long attributeGroupId);

	int updateSizeJson(@Param("productId") Long productId, @Param("sizeJson") String sizeJson);
}
