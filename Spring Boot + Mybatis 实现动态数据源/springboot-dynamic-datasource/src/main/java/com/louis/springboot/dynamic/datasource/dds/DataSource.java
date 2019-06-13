package com.louis.springboot.dynamic.datasource.dds;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 动态数据源注解
 * @author Louis
 * @date Oct 31, 2018
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
	
	/**
	 * 数据源key值
	 * @return
	 */
    String value();
    
}
