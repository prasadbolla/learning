package java8learning.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStream2 {
private static final String SIM = "SIM";
private static final String BMC = "BMC";
private static final String HardwarePromo = "HardwarePromo";
public static void main(String a[]) {
	List<Name> nameList1 = new ArrayList();
	String str = "Prasad_Bolla:1";
	System.out.println("sfsdaf::"+str.substring(0,str.indexOf(":")));
	nameList1.add(createName("prasad", "value1", 3,SIM));
	nameList1.add(createName("prasad1", "value1", 1, BMC));
	nameList1.add(createName("prasad2", "value2", 2, HardwarePromo));
	
	Map<Object, List<Name>> resourceDetailsList = nameList1.stream()
			.collect(Collectors.groupingBy(Name::getValue));
	
    for (Name person : nameList1) {
        System.out.println(person.getName() + " " + person.getLevel());
      }
    
    Collections.sort(nameList1, new Comparator<Name>() {
        @Override
        public int compare(Name person1, Name person2) {
          if (person1.getEnu().getLevel() == person2.getEnu().getLevel()) {
            return person1.getName().compareTo(person2.getName());
          } else {
            return person1.getEnu().getLevel().compareTo(person2.getEnu().getLevel());
          }
        }
      });
    for (Name person : nameList1) {
        System.out.println("After"+person.getName() + " " + person.getEnu().getLevel());
      }
    
}
private static Name createName(String name1, String value, int number, String level) {
	Name name = new Name();
	name.setName(name1);
	Enu enu = new Enu();
	enu.setLevel(Level2.valueOf(level));
	name.setEnu(enu);
	name.setValue(number);
	//name.setValue(new Value(value, number));
	return name;
}
}
