package com.trying;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class MyHandler implements Handler {

	@Override
	public void handle(Context ctx) throws Exception {
		System.out.println("Naber gardas");
		ctx.result("Naber dostum");
	}

}
