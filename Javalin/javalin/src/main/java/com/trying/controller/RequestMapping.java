package com.trying.controller;

import io.javalin.Javalin;
import io.javalin.http.HttpCode;

public class RequestMapping {
	
	//FruitController fruitController = new FruitController();
	
	public static void configureRoutes(Javalin app) {
		app.get("/fruit/{name}", ctx -> {
			FruitController.getFruitByName(ctx);
		});
		app.get("/fruit/{id}", ctx ->{
			FruitController.getFruiById(ctx);
		});
		
		app.get("/fruits", ctx -> {
			FruitController.getAllFruits(ctx);
		});
		app.post("/fruit", ctx->{
			
			if(AuthenticateController.verifyUser(ctx)) {
				FruitController.createFruit(ctx);
			}else {
				ctx.status(HttpCode.FORBIDDEN);
			}
			
			
			
			
		});
		//Bad do not use 
		//app.post("/login/{username}/{password}",ctx ->{
		//	AuthenticateController.authenticateByPathParam(ctx);
		//});
		//Good
		app.post("/login/",ctx ->{
			AuthenticateController.authenticateByFormParam(ctx);
		});
		//Anoher good idea
		/*app.post("/login/",ctx ->{
			AuthenticateController.authenticateByJSON(ctx);
		});*/
	}
}
