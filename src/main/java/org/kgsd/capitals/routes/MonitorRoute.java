package org.kgsd.capitals.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MonitorRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:monitor")
                .transform().simple("I'm up!");
    }
}
