package org.saritasmesut;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.quarkus.vertx.web.RoutingExchange;
import io.smallrye.mutiny.Uni;
import io.vertx.core.http.HttpMethod;
import io.vertx.reactivex.ext.web.RoutingContext;

/**
 * @author msaritas
 */
@RouteBase
public class Greeting {

	/**
	 * 
	 * @param ex
	 */
	@Route(path = "/greeting")
	@Route(path = "/greetings", methods = HttpMethod.GET)
	public void greetings(RoutingExchange ex) {
		ex.ok("Hello " + ex.getParam("name").orElse("world"));
	}

	/**
	 * 
	 * @param context
	 * @return
	 */
	@Route(path = "/hello")
	public Uni<String> hello(RoutingContext context) {
		return Uni.createFrom().item("Hello world!");
	}

}