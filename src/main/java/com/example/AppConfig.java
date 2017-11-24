package com.example;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("spring-context.xml")
@Configuration
@ComponentScan("com.example")//常用方法
public class AppConfig {

	@Bean
	public AnnotationBean annotationBean() {
		AnnotationBean annotationBean = new AnnotationBean();
		annotationBean.setP1(99);
		annotationBean.setP2("Name");
		annotationBean.setDataSource(dataSource());
		return annotationBean;
	}

	@Bean(destroyMethod = "close")
	DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUsername("app");
		ds.setPassword("app");
		ds.setUrl("jdbc:mariadb://localhost:3306/app");
		return ds;
	}
	
//	@Bean
//	public SampleBean sampleBean() {
//		SampleBean sampleBean = new SampleBean();
//		sampleBean.setName("heheda");
//		return sampleBean;
//	}
//	
//	@Bean
//	public TestBean testBean() {
//		TestBean testBean = new TestBean();
//		testBean.setAge(20);
//		testBean.setName("zhangsan");
//		return testBean;
//	}

}
