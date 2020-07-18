package org.kgsd.capitals.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.component.jackson.ListJacksonDataFormat;
import org.kgsd.capitals.model.Capital;
import org.springframework.stereotype.Component;

@Component
public class CapitalRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        JacksonDataFormat format = new ListJacksonDataFormat(Capital.class);

        // TODO: Exception Handling
        from("direct:capitals")
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                .toD("http://restcountries.eu/rest/v2/capital/${header.city}?bridgeEndpoint=true")
                .convertBodyTo(String.class)
                .unmarshal(format);
    }
}
