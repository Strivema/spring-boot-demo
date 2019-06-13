package com.louis.springboot.dynamic.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动器
 * @author Louis
 * @date Oct 31, 2018
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})	// 禁用数据源自动配置
@ComponentScan(basePackages = "com.louis.springboot")
public class DynamicDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicDatasourceApplication.class, args);
	}
}
