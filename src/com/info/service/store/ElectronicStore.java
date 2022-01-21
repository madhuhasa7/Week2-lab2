package com.info.service.store;

import com.info.service.StringTrimmer;

public abstract  class ElectronicStore {
	
	public StringTrimmer orderStringTrimmer(String type) {
		
		StringTrimmer stringTrimmer = createStringTrimmer(type);
		stringTrimmer.selectTrimmer();
		stringTrimmer.costOfTrimmer();
		stringTrimmer.orderTrimmer();
		
		return stringTrimmer;
	}

	protected abstract StringTrimmer createStringTrimmer(String type);

}
