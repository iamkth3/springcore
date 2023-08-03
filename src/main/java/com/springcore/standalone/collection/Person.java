package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> fee_structure;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	


	public Map<String, Integer> getFee_structure() {
		return fee_structure;
	}

	public void setFee_structure(Map<String, Integer> fee_structure) {
		this.fee_structure = fee_structure;
	}

	
}
