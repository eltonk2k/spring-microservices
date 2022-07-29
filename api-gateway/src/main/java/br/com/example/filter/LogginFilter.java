package br.com.example.filter;

import org.slf4j.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class LogginFilter implements GlobalFilter {

	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(LogginFilter.class);
	
	
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("Original request path -> {}", exchange.getRequest().getPath());
		return chain.filter(exchange);
	}

}
