package com.info.service.store;

import com.info.service.BatteryTrimmer;
import com.info.service.ElectricTrimmer;
import com.info.service.StringTrimmer;

public class NYElectronicStore extends ElectronicStore {

	@Override
	protected StringTrimmer createStringTrimmer(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Electric")) {
			return new ElectricTrimmer();
		}
		else if(type.equals("Battery")) {
			return new BatteryTrimmer();
		}
		return null;
	}

}
