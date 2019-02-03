package com.cmd.service;

import javax.inject.Inject;

import org.ops4j.pax.cdi.api.OsgiService;
import org.ops4j.pax.cdi.api.OsgiServiceProvider;
import org.ops4j.pax.cdi.api.Properties;
import org.ops4j.pax.cdi.api.Property;

import com.osgi.api.HelloService;

@OsgiServiceProvider(classes=TaskGetCommand.class)
@Properties(//
        {
                @Property(name = "osgi.command.scope", value = "task"),
                @Property(name = "osgi.command.function", value = "get")
        })
public class TaskGetCommand {

    @Inject @OsgiService
    HelloService helloService;

    public String get(String id) throws Exception {
        return helloService.sayHello(id);
    }

}
