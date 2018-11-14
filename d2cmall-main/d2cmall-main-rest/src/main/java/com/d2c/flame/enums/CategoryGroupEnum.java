package com.d2c.flame.enums;

import static com.d2c.flame.enums.ProductCategoryEnum.ACC;
import static com.d2c.flame.enums.ProductCategoryEnum.APPLIANCES;
import static com.d2c.flame.enums.ProductCategoryEnum.COSMETIC;
import static com.d2c.flame.enums.ProductCategoryEnum.JEWELRY;
import static com.d2c.flame.enums.ProductCategoryEnum.KIDS;
import static com.d2c.flame.enums.ProductCategoryEnum.PERSONAL;
import static com.d2c.flame.enums.ProductCategoryEnum.SHOE;

import com.d2c.common.base.utils.StringUt;

public enum CategoryGroupEnum {
	
	FEMALE("女士", ProductCategoryEnum.FEMALE, KIDS),
	MALE("男士", ProductCategoryEnum.MALE),
	BAG("鞋包配饰", ProductCategoryEnum.BAG, SHOE, ACC, JEWELRY),
	FURNITURE("乐享生活", APPLIANCES, COSMETIC, ProductCategoryEnum.FURNITURE, PERSONAL);

	String name;
	ProductCategoryEnum[] categorys;
	
	CategoryGroupEnum(String name, ProductCategoryEnum... categorys) {
		this.name = name;
		this.categorys = categorys;
	}
	
	public static ProductCategoryEnum[] getCategorys(String type){
		return getValueOf(type).getCategorys();
	}
	
	public static CategoryGroupEnum getValueOf(String type){
		type = StringUt.toUpperCase(type);
		try {
			return valueOf(type);
		} catch (Exception e) {
			return FEMALE;
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public ProductCategoryEnum[] getCategorys() {
		return categorys;
	}

}
