package com.info.client;

import com.info.service.StringTrimmer;
import com.info.service.store.ElectronicStore;
import com.info.service.store.NYElectronicStore;
import com.info.singleton.DeliveryService;

public class BuyStringTrimmers {
	
	public static void main(String[] args) {
		//factory pattern to order string trimmers
		ElectronicStore nyElectricStore = new NYElectronicStore();
		StringTrimmer electricTrimmer = nyElectricStore.orderStringTrimmer("Electric");
		StringTrimmer batteryTrimmer = nyElectricStore.orderStringTrimmer("Battery");
		
		//Singleton pattern to deliver the trimmers
		DeliveryService deliveryService = DeliveryService.getInstance();
		deliveryService.deliverTrimmer();
	}

}
