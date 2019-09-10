package br.com.rodartenogueira.zkspringmodelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import br.com.rodartenogueira.zkspringmodelo.controller.TenantInterceptor;

@Configuration
@VariableResolver(DelegatingVariableResolver.class)
public class WebMvcConfig implements WebMvcConfigurer {

  @Autowired
//  @WireVariable
  TenantInterceptor tenantInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(tenantInterceptor);
  }


}