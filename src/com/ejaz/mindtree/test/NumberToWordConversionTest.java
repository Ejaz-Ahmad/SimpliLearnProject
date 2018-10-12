package com.ejaz.mindtree.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ejaz.mindtree.NumberToWordConversion;

public class NumberToWordConversionTest {
	
		private NumberToWordConversion numberToWord ;

		/**
		 * @throws java.lang.Exception
		 */
		@Before
		public void setUp() throws Exception {
			
			numberToWord = new NumberToWordConversion();
			
		}

		/**
		 * @throws java.lang.Exception
		 */
		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void test() {
			String expectedResult="ninteen";
			Assert.assertEquals("result passed",expectedResult, NumberToWordConversion.conversion(19));
		}
		

	}

