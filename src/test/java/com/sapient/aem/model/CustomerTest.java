package com.sapient.aem.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

		private Customer customer=null;
		@BeforeEach
		void setUp() throws Exception {
			customer= new Customer(1001,"smith",LocalDate.parse("1990-10-12"),"Hyderabad","smith@gmail.com",7687125490L);
		}

		@AfterEach
		void tearDown() throws Exception {
			customer=null;
		}
		@Test
		void testSetCustomerId() {
		customer.setCustomerId(1001);
		assertEquals(1001,customer.getCustomerId());
		}

		@Test
		void testInvalidSetCustomerId() {
			customer.setCustomerId(12345);
		assertNotEquals(45678,customer.getCustomerId());
		}
		@Test
		void testGetCustomerId() {
			assertEquals(1001,customer.getCustomerId(),"testing customerId");
		}
		@Test
		void testInvalidGetCustomerId() {
			assertNotEquals(45678,customer.getCustomerId(),"testing customerId");
		}
		@Test
		void testSetName() {
			customer.setCustomerName("smith");
		assertEquals("smith",customer.getCustomerName());
		}
		@Test
		void testInvalidSetName() {
			customer.setCustomerName("clerk");
		assertNotEquals("smith",customer.getCustomerName());
		}
		@Test
		void testGetName() {
			assertEquals("smith",customer.getCustomerName(),"testing name");
		}
		@Test
		void testInvalidGetName() {
			assertNotEquals("clerk",customer.getCustomerName(),"testing name");
		}
		@Test
		void testSetBirthdate() {
			customer.setBirthdate(LocalDate.parse("1990-10-12"));
		assertEquals(LocalDate.parse("1990-10-12"),customer.getBirthdate());
		}
		@Test
		void testInvalidSetBirthdate() {
			customer.setBirthdate(LocalDate.parse("2000-08-19"));
		assertNotEquals(LocalDate.parse("1990-10-12"),customer.getBirthdate());
		}
		@Test
		void testGetBirthdate() {
			assertEquals(LocalDate.parse("1990-10-12"),customer.getBirthdate(),"testing birthdate");
		}
		@Test
		void testInvalidGetBirthdate() {
			assertNotEquals(LocalDate.parse("2000-08-19"),customer.getBirthdate(),"testing birthdate");
		}
		@Test
		void testSetAddress() {
			customer.setAddress("Hyderabad");
		assertEquals("Hyderabad",customer.getAddress());
		}
		@Test
		void testInvalidSetAddress() {
			customer.setAddress("Banglore");
		assertNotEquals("Hyderabad",customer.getAddress());
		}
		@Test
		void testGetAddress() {
			assertEquals("Hyderabad",customer.getAddress(),"testing address");
		}
		@Test
		void testInvalidGetAddress() {
			assertNotEquals("Banglore",customer.getAddress(),"testing address");
		}
		@Test
		void testSetEmail() {
			customer.setEmail("smith@gmail.com");
		assertEquals("smith@gmail.com",customer.getEmail());
		}
		@Test
		void testInvalidSetEmail() {
			customer.setEmail("clerk@gmail.com");
		assertNotEquals("smith@gmail.com",customer.getEmail());
		}
		@Test
		void testGetEmail() {
			assertEquals("smith@gmail.com",customer.getEmail(),"testing email");
		}
		@Test
		void testInvalidGetEmail() {
			assertNotEquals("clerk@gmail.com",customer.getEmail(),"testing email");
		}
		@Test
		void testSetMobile() {
			customer.setMobile(7687125490L);
		assertEquals(7687125490L,customer.getMobile());
		}
		@Test
		void testInvalidSetMobile() {
			customer.setMobile(7687125490L);
		assertNotEquals(972456342L,customer.getMobile());
		}
		@Test
		void testGetMobile() {
			assertEquals(7687125490L,customer.getMobile(),"testing mobile");
		}
		@Test
		void testInvalidGetMobile() {
			assertNotEquals(972456342L,customer.getMobile(),"testing mobile");
		}
		
		
	}