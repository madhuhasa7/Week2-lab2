package com.info.singleton;

public class DeliveryService {
	
	private static DeliveryService deliveryService;
	
	private DeliveryService() {
		
	}
	
	public static DeliveryService getInstance() {
		if(deliveryService==null) {
			synchronized (DeliveryService.class) {
				deliveryService = new DeliveryService();
			}
		}
		return deliveryService;
	}

	public void deliverTrimmer() {
		System.out.println("String Trimmer delivered...");
	}
	
}
