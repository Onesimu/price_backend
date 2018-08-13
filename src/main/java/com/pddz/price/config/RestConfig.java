package com.pddz.price.config;

import com.pddz.price.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RestConfig {
//public class RestConfig extends RepositoryRestMvcConfiguration {

    //    @Override
//    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//        config.exposeIdsFor(TdCarrier.class);
//    }
//
    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return new RepositoryRestConfigurerAdapter() {
            @Override
            public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
                config.exposeIdsFor(Carrier.class, Country.class, Port.class, Seaexpressprice.class, Userinfo.class);
            }
        };
    }

//    @Bean
//    public RepositoryRestConfigurer repositoryRestConfigurer() {
//
//        return new RepositoryRestConfigurerAdapter() {
//            @Override
//            public void configureRepositoryRestConfiguration(
//
//                    RepositoryRestConfiguration config) {
//
//                final ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(false);
////                provider.addIncludeFilter(new AnnotationTypeFilter(Entity.class));
//                final Set<BeanDefinition> beans = provider.findCandidateComponents("com.pddz.price.entity");
//                for (final BeanDefinition bean : beans) {
//                    try {
//                        config.exposeIdsFor(Class.forName(bean.getBeanClassName()));
//                    } catch (final ClassNotFoundException e) {
//                        // Can't throw ClassNotFoundException due to the method signature. Need to cast it
//                        throw new IllegalStateException("Failed to expose `id` field due to", e);
//                    }
//                }
//            }
//        };
//    }

}

