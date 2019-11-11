package com.junt5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("initalze connection");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("close connection");
	}
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test::"+info.getDisplayName());
	}
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("Cleanup Test::"+info.getDisplayName());
	}

	@Test
	void lenght_basic() {
		int lenght = "ABCD".length();
		int expectedLenght = 4;
		assertEquals(expectedLenght, lenght);	
		//Write test code
		//Invoke method square(4) => CodeUnderTest(CUT)
		//Checks in place - 16 => Assertions
	}
	@Test
	void toUpperCase() {
		String str = "abcd";
		assertNotNull(str);
		//assertNull(result);
		assertEquals("ABCD", str.toUpperCase());
	}
	@Test
	void contains_basic() {
		//assertEquals(false, result);
		assertFalse("abcdedfgh".contains("ijk"));
		//assertTrue(result);
	}
	@Test
	void split_basic() {
		String str="abc def ghi";
		String result[]=str.split(" ");
		String[] expectedResult = new String[] {"abc","def","ghi"};
		assertArrayEquals(expectedResult, result);
	}
	@ParameterizedTest
	@ValueSource(strings= {"ABCD", "ABC", "a"})
	void length_greater_than_zero(String str) {
		assertTrue(str.length()>0);
	}
	@ParameterizedTest
	@ValueSource(strings= {"abcd","ab","abcdef"})
	void checkForLength(String str){
		assertTrue(str.length()>0);
	}
	@ParameterizedTest(name="{0} length is{1}")
	@CsvSource(value= {"abcd,ABCD", "abc,ABC"})
	void checkForEqual(String input1, String input2) {
		assertEquals(input2, input1.toUpperCase());
	}
	@Test
	@DisplayName("When length is null, throw an exception")
	@RepeatedTest(2)
	void length_exception() {
		String str = null;
		assertThrows(NullPointerException.class, 
				() ->{
					str.length();
				});
	}
	@Test
	@Disabled//@Ignored
	void performanceTest() {
		assertTimeout(Duration.ofSeconds(1), 
				() ->{
					for(int i=0; i < 1000000; i++) {
						int j=i;
						System.out.println(j);
					}
				}
				);
	}

}
