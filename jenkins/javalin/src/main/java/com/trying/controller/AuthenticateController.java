package com.trying.controller;

import org.eclipse.jetty.http.HttpStatus;

import com.typing.service.AuthenticateServices;

import io.javalin.http.Context;
import io.javalin.http.HttpCode;

public class AuthenticateController {

	public static void authenticateByPathParam(Context ctx) {
		
		
		System.out.println("We are outhenticating");
		System.out.println(ctx.pathParam("username"));
		System.out.println(ctx.pathParam("password"));

	}
	public static void authenticateByFormParam(Context ctx) {
		String username=ctx.formParam("username");
		String password =ctx.formParam("password");
		User u = new User(ctx.formParam("username"),ctx.formParam("password"));
		
		boolean access = AuthenticateServices.authenticateUser(username,password);
		
		if(access) {
			ctx.result("You have access");
			ctx.status(HttpStatus.ACCEPTED_202);
		}else {
			ctx.result("You do not have access");
			ctx.status(HttpCode.FORBIDDEN);
		}

	}
	public static void authenticateByJSON(Context ctx) {
		System.out.println(ctx.body());
		System.out.println(ctx.bodyAsClass(User.class));
		
		
	}
	public static boolean verifyUser(Context ctx) {
		User u =ctx.sessionAttribute("user");
		boolean accesss = AuthenticateServices.authenticateUser(u.getUsername(), null);
		
		if(accesss) {
			return false;
		}else {
			return true;
		}
	}

}
