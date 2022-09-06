package com.example.demo;

import java.io.IOException;
import java.util.Properties;

import org.apache.geode.distributed.ServerLauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication.Locator;
import org.springframework.data.gemfire.config.annotation.EnableCacheServer;
import org.springframework.data.gemfire.config.annotation.EnableCacheServers;
import org.springframework.data.gemfire.util.PropertiesBuilder;

//@CacheServerApplication(logLevel = "info", autoStartup = true, maxConnections = 100)
/*
 * @EnableCacheServers(servers = {
 * 
 * @EnableCacheServer(name = "Cache1", hostnameForClients = "cache1", port =
 * 41414),
 * 
 * @EnableCacheServer(name = "Cache2", hostnameForClients = "cache2", port =
 * 42424) })
 */
public class DemoCacheServerApplication {

	public static void main(String[] args) throws IOException {
		
		//SpringApplication.run(DemoCacheServerApplication.class, args);
		//while(true);
		
		int port = Integer.parseInt(System.getProperty("gemfire.cache.server.port"));
		
		Properties props = new Properties();
		props.load(ClassLoader.getSystemResourceAsStream("application.properties"));
		
		ServerLauncher serverLauncher = new ServerLauncher.Builder()
				.setServerPort(port)
				.set(props)
				.build();
		
		serverLauncher.start();
		
	}

}
