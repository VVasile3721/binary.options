package dcsi.test.router;

import org.apache.camel.builder.RouteBuilder;

public class MyRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
//		from("netty-http:http://localhost:9090/one?matchOnUriPrefix=true&amp;nettySharedHttpServer=#sharedNettyHttpServer")
			//.log("hi $body");
		
//		from("file:E:/gothaer-test/requests/1?noop=true")
//			.to("netty:tcp://localhost/greeting?sync=true&allowDefaultCodec=false&encoder=#stringEncoder&decoder=#stringDecoder");
		
			/*from("jms:incomingOrders")
				.wireTap("jms:orderAudit")
				.choice()
					.when(header("CamelFileName")
						.endsWith(".xml"))
							.to("jms:xmlOrders")
					.when(header("CamelFileName")
						.regex("^.*(csv|csl)$"))
							.to("jms:csvOrders")
					.otherwise()
						.to("jms:badOrders").stop()
				.end()
				.to("jms:continuedProcessing");*/
			
	}
}