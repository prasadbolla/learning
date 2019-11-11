package java8learning.streams;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream
		.range(1, 10)
		.skip(2)
		.forEach(x-> System.out.println(x));
		
		System.out.println(
				IntStream.range(1, 5)
				.sum());
		
		Stream.of("Ava", "Aneri", "Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		Stream.of("Ava", "Aneri", "Alberto")
		.sorted()
		.findFirst()
		.ifPresent(str->System.out.println("String Value::"+str));
		
		String[] names = {"afda", "sss","adad","ss","bsdfn","csfdds","dd"};
		Arrays.stream(names)
		      .filter(str -> str.startsWith("s"))
		      .sorted()
		      .forEach(System.out::println);
		
		List<String> strList = Arrays.asList("Afda", "sss","adad","ss","bsdfn","csfdds","dd");
		List<String> newList = strList.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		
		newList.forEach(x->System.out.println("newList:"+x));
		strList.forEach(x->System.out.println("new:"+x));
		
		List<Name> nameList = new ArrayList();
		
		nameList.add(createName("prasad", "value1", "1"));
		nameList.add(createName("prasad1", "value1", "2"));
		nameList.add(createName("prasad2", "value2", "4"));
		nameList.add(createName("prasad4", "value3", "5"));
		nameList.add(createName("prasad1", "value1", "3"));
		nameList.add(createName("prasad9", "value5", "8"));
		nameList.add(createName("prasad8", "value8", "9"));
		nameList.add(createName("prasad6", "value6", "3"));
		nameList.add(createName("prasad7", "value7", "7"));
		
		
		List<Name> nameList1 = new ArrayList();
		
/*		nameList.add(createName("prasad", "value1", "1",Level1.MEDIUM));
		nameList.add(createName("prasad1", "value1", "2", Level.LOW));
		nameList.add(createName("prasad2", "value2", "4", Level.HIGH));*/

		
		/*  List<Employee> filteredList = emplList.stream()
			      .filter(empl -> deptList.stream()
			        .anyMatch(dept -> 
			          dept.getDepartment().equals("sales") && 
			          empl.getEmployeeId().equals(dept.getEmployeeId())))
			        .collect(Collectors.toList());*/
		  
		  
		List<Name> finalNameList = nameList.stream().filter(name-> name.getValueList().stream().anyMatch(value -> value.getValue().equals("value2"))).collect(Collectors.toList());
		List<Name> finalNameList2 = nameList.stream().filter(name-> name.getValueList().stream().anyMatch(value -> !value.getValue().equals("value2"))).collect(Collectors.toList());
		Map<String, List<Name>> namesMap = new HashMap<String, List<Name>>();
		
		finalNameList2.stream().forEach((name) -> updateMap(namesMap,name));
		
		Map<String, List<Name>> map1 = nameList.stream().filter(name-> name.getValueList().stream().anyMatch(value -> !value.getValue().equals("value2"))).collect(Collectors.toList())
				.stream().collect(Collectors.groupingBy(Name::getName));
		
		Map map = nameList.stream().collect(Collectors.groupingBy(Name::getName));
		
		List<Name> finalNameList3 = nameList.stream().filter(name-> name.getValueList().stream()
				.anyMatch(value -> !value.getValue().equals("value2"))).collect(Collectors.toList());
		
/*		Map<Object, Object> finalNameMap= nameList.stream()
				.collect(Collectors.toMap(name -> name, name -> name.getValueList().get(0).getValue()));
		
		Map<Object, Object> finalNameMap1= nameList.stream()
				.collect(Collectors.toMap(name -> name.getValueList().get(0).getValue(), name -> name));*/
		
	/*	Map<Object, List<Object>> finalList = nameList.stream().flatMap(name -> Stream.of(new SimpleEntry<>(name.getValueList().get(0).getValue(), name)))
		.collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));*/
		int values = 0;
		
		nameList.stream()
		.filter(name -> "prasad1".equalsIgnoreCase(name.getName()))
		.filter(name -> !name.getValueList().isEmpty())
		.forEach(name -> getValue(name.getValueList(), values));
		
		
		
		
		
		System.out.println("hello");
	}
    private static void getValue(ArrayList<Value> valueList, int values) {
    	for(Value value: valueList) {
    		if(value != null && "value1".equalsIgnoreCase(value.getValue())) {
    			values = Integer.valueOf(value.getNumber());
    		}
    	}
	}
	public static void updateMap(Map<String, List<Name>> namesMap, Name name) {
    	if(name != null && name.getValueList() != null) {
    		if(namesMap.containsKey(name.getValueList().get(0).getValue())) {
    			namesMap.get(name.getValueList().get(0).getValue()).add(name);
    			System.out.println();
    		}else {
    			List<Name> nameList= new ArrayList<Name>();
    			nameList.add(name);
    			namesMap.put(name.getValueList().get(0).getValue(), nameList);
    		}
    		//	List<Name> nameList= namesMap.get(name.getValueList().get(0).getValue());
    		//namesMap.put(name.getValueList().get(0).getValue(), .add(name));
    	}
    }
	private static Name createName(String name1, String value, String number) {
		Name name = new Name();
		name.setName(name1);
		name.setValue(new Value(value, number));
		return name;
	}
/*	private static Name createName(String name1, String value, String number, Level1 level) {
		Name name = new Name();
		name.setName(name1);
		Enu enu = new Enu();
		enu.setLevel(level);
		name.setEnu(enu);
		name.setValue(new Value(value, number));
		return name;
	}*/

}
