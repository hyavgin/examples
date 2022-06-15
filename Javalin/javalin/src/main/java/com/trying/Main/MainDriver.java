package com.trying.Main;
import java.util.ArrayList;
import java.util.List;

import com.trying.Fruit;
import com.trying.MyHandler;
import com.trying.controller.RequestMapping;
import com.trying.controller.User;

import io.javalin.Javalin;
import io.javalin.http.Cookie;
import io.javalin.http.HttpCode;
import io.javalin.plugin.metrics.MicrometerPlugin;
import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;

public class MainDriver {
	
	static List<Fruit> fruitList = new ArrayList<>();

	public static void main(String[] args) {
		
				/*
		
		
		 myApp.get("/Halid", new MyHandler());
		// myApp.get("/{password}", ctx -> ctx.result("password"));
		 
		//myApp.get("/fruit/{id}", ctx -> {
			
			//System.out.println(ctx.url());
			
			ctx.result("Dogruyerdesin dostummmm");
			String id = ctx.pathParam("id");
			
			ctx.result("You choice this fruits : " + id );
			
		});
		
		myApp.get("/fruit/name/{name}", ctx -> {
			
			String name = ctx.pathParam("name");
			Fruit f = new Fruit(name);

			ctx.result(f.toString());
			
			ctx.json(f);
			ctx.status(HttpCode.CREATED);
			
		});
		
		myApp.post("/fruit",ctx ->{
			
			System.out.println(ctx.body());
			
			//fruit to be sent
			
			Fruit f= ctx.bodyAsClass(Fruit.class);
			System.out.println(f);
			fruitList.add(f);
			
			
			ctx.result("creating a fruit");
			ctx.status(HttpCode.CREATED);
		});*/
		

		
		PrometheusMeterRegistry registry = new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);
		registry.config().commonTags("application","My-Frist-Monitored-App");
		
		
		
		Javalin myApp = Javalin.create(config ->{
			config.registerPlugin(new MicrometerPlugin(registry));
		}).start(7990);
		RequestMapping.configureRoutes(myApp);
		//create cookies
		myApp.get("/cookies", ctx->{
			
			ctx.cookieStore("FavoriteFruit","Banana");
			ctx.cookie("FavoriteCar", "BMW");
		} );
			myApp.post("/fruitss",ctx ->{
			
			System.out.println(ctx.body());
			
			//fruit to be sent
			
			Fruit f= ctx.bodyAsClass(Fruit.class);
			System.out.println(f);
			fruitList.add(f);
			
			
			ctx.result("creating a fruit");
			ctx.status(HttpCode.CREATED);
		});
			
		myApp.get("/fruitt/{id}", ctx -> {
			
			//System.out.println(ctx.url());
			
			ctx.result("Dogruyerdesin dostummmm");
			String id = ctx.pathParam("id");
			
			ctx.result("You choice this fruits : " + id );
			
		});
		
		myApp.get("/fruitt/{name}",ctx ->{
			
			String name = ctx.pathParam("name");
			Fruit outgoingFruit = null;
			
			
			for(Fruit f: fruitList) {
				if(f.getName().equals(name)) {
					outgoingFruit =f;
					
				}
			}
			if(outgoingFruit == null) {
				ctx.status(HttpCode.NOT_FOUND);
			}else {
				ctx.json(outgoingFruit);
			}
			
		});
		
		//Check cookies
		myApp.get("/checkcookies",ctx ->{
			String fruit =ctx.cookieStore("FavoriteFruit");
			System.out.println(fruit);
			
			String car=ctx.cookieStore("FavoriteCar");
			System.out.println(car);
		} );
		//deleting cookies
		myApp.get("/removeCookies",ctx ->{
			
			ctx.clearCookieStore(); 
			
		} );
		myApp.post("/cookie/login", ctx -> {
			
			User u =ctx.bodyAsClass(User.class);
			
			if(u.getUsername().equals("halid")) {
				ctx.cookieStore("access", true);
				ctx.status(200);
				System.out.println(ctx.body());
			}
		});
		
		myApp.get("/cookie/secret", ctx ->{
			//Grabbing the cookie from store
			Boolean b = ctx.cookieStore("access");
			//if the cookie is on existent or different value than expected!
			System.out.println(b);
			if(b==null || b.toString().equals("true")) {
				ctx.result("You have access!");
			}else {
				ctx.result("You do not have access!"); 
			}
		});
		
		myApp.post("/get/session", ctx -> {
			
			User u = ctx.bodyAsClass(User.class);
			ctx.sessionAttribute("user",u);
		});
		myApp.get("/session/secret", ctx ->{
			
			User u = ctx.sessionAttribute("user");
			System.out.println(u.getUsername());
			
		});
		
		myApp.get("/session/invalidate", ctx ->{
			ctx.consumeSessionAttribute("user");
		});
		
	}
		


}
