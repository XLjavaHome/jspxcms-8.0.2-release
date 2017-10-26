package com.jspxcms.plug;

import com.jspxcms.common.orm.MyJpaRepositoryFactoryBean;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan({"com.jspxcms.plug.domain"})
@EnableJpaRepositories(basePackages = {"com.jspxcms.plug.repository"}, repositoryFactoryBeanClass = MyJpaRepositoryFactoryBean.class)
@ComponentScan({"com.jspxcms.plug.service.impl", "com.jspxcms.plug.web.fore"})
public class ContextConfig {
}
