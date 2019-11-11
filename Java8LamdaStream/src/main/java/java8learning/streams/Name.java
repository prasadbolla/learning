package java8learning.streams;

import java.util.ArrayList;
enum Level {
	  BMC, HardwarePromo, SIM;
}
public class Name {
public String name;
public ArrayList<Value> valueList;
private Enu enu;
private Level level;
private int value;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the valueList
 */
public ArrayList<Value> getValueList() {
	return valueList;
}
/**
 * @param valueList the valueList to set
 */
public void setValueList(ArrayList<Value> valueList) {
	this.valueList = valueList;
}
public void setValue(Value value) {
	if(this.valueList == null)
		this.valueList=new ArrayList();
	this.valueList.add(value);
}
/**
 * @return the level
 */
public Level getLevel() {
	return level;
}
/**
 * @param level the level to set
 */
public void setLevel(Level level) {
	this.level = level;
}
/**
 * @return the enu
 */
public Enu getEnu() {
	return enu;
}
/**
 * @param enu the enu to set
 */
public void setEnu(Enu enu) {
	this.enu = enu;
}
/**
 * @return the value
 */
public int getValue() {
	return value;
}
/**
 * @param value the value to set
 */
public void setValue(int value) {
	this.value = value;
}
}
