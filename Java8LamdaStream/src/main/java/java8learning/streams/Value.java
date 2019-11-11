package java8learning.streams;

public class Value {
public String value;
public String number;

/**
 * @return the number
 */
public String getNumber() {
	return number;
}

/**
 * @param number the number to set
 */
public void setNumber(String number) {
	this.number = number;
}

public Value(String string, String number) {
	this.value=string;
	this.number=number;
}

/**
 * @return the value
 */
public String getValue() {
	return value;
}

/**
 * @param value the value to set
 */
public void setValue(String value) {
	this.value = value;
}


}
