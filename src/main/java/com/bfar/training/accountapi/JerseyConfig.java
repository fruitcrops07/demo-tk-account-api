package com.bfar.training.accountapi;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

import com.bfar.training.accountapi.resource.GtgResource;
import com.bfar.training.accountapi.resource.RamlResource;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(GtgResource.class);
        register(RamlResource.class);
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }

}
