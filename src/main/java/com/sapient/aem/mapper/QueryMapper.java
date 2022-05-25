package com.sapient.aem.mapper;

public interface QueryMapper {
	public static final String GET_CUSTOMER="select * from customer where customer_id = ?";
	public static final String SELECT_CUSTOMER= "select * from customer";
}
