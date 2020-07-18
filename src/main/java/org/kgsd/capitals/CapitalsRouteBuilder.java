package org.kgsd.capitals;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class CapitalsRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json)
                .apiContextPath("/api-docs")
                .contextPath("/api")
                .dataFormatProperty("prettyPrint", "true")
                .apiProperty("api.title", "Gateway for Capital Search");

        rest("/api")
                .description("Monitor")
                .get("/monitor")
                .to("direct:monitor");

        rest("/api")
                .description("Capital service")
                .get("/capital/{city}")
                .to("direct:capitals");

    }
}
