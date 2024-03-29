package com.frankcarlone.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.client.LinkDiscoverer;
import org.springframework.hateoas.client.LinkDiscoverers;
import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
import org.springframework.plugin.core.SimplePluginRegistry;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Configuration File
// Enable Swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact("Frank Carlone", "https://www.frankcarlone.com/", "frankcarlone.com");
  
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
		  "User Title", "User Api Documentation", "1.0", 
		  "urn:tos",DEFAULT_CONTACT, 
		  "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());

	private static final Set<String> DEFAULT_PRODUCERS_AND_CONSUMERS = new HashSet<String>(Arrays.asList("application/json","application/xml"));

	@Bean
	public LinkDiscoverers discovers() {    
	    List<LinkDiscoverer> plugins = new ArrayList<>();
	    plugins.add(new CollectionJsonLinkDiscoverer());
	    return new LinkDiscoverers(SimplePluginRegistry.create(plugins)); 
	} 
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCERS_AND_CONSUMERS)
				.consumes(DEFAULT_PRODUCERS_AND_CONSUMERS);
	}
	

}
