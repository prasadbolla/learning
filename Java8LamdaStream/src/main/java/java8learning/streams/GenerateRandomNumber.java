package java8learning.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class GenerateRandomNumber {
	static int previousNumber;
	static List list = new ArrayList();
public static void main(String a[]) {

System.out.println("hello");
/*CompletableFuture.runAsync(() -> {
   System.out.println("inside method");
});*/
	//CompletableFuture.runAsync(() -> {
		getNumbers();
	//});

/*	CompletableFuture<Void> future2=CompletableFuture.runAsync(() -> {
		getNumbers();
	});
	CompletableFuture<Void> future3=CompletableFuture.runAsync(() -> {
		getNumbers();
	});
	CompletableFuture<Void> future4=CompletableFuture.runAsync(() -> {
		getNumbers();
	});
	CompletableFuture<Void> future11 = CompletableFuture.runAsync(() -> {
		getNumbers();
	});*/



}

private static void getNumber() {
System.out.println("method");
	
}

public String getNumberByAsync() {
	//CompletableFuture<String> future = CompletableFuture.supplyAsync(this.getNumber);
	
	CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> this.hello("Friend"));
	return null;
}

	public static void getNumbers() {
		System.out.println("getNumbers");
		int count = 100000;
		int ii = 0;
		int i =0;
		List arrayList1 = new ArrayList();
		while (i < 100) {
			int randomNumber = randInt(0, 36);

			if (arrayList1.size() > 4 && arrayList1.get(arrayList1.size() - 1).equals(21)
					&& arrayList1.get(arrayList1.size() - 2).equals(21)
					&& arrayList1.get(arrayList1.size() - 3).equals(3)
					&& arrayList1.get(arrayList1.size() - 4).equals(12)) {
				System.out.println("nextNumer:" + randomNumber+"Index::"+ii);
			
			}
			arrayList1.add(randomNumber);
			ii++;
		}
	}
private static void getNumbersWithTreeMap() {
	int count =300;
	int i =0;
	int ii=10;
	boolean nextNumber = false;
	TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<Integer, ArrayList<String>>();
while( i < count) {
	int randomNumber = randInt(0, 36);
	if(nextNumber) {
	if(!treeMap.containsKey(previousNumber)) {
		treeMap.put(previousNumber, new ArrayList<String>());
		ArrayList<String> values = treeMap.get(previousNumber);
		if(values == null)
			values = new ArrayList<String>();
		values.add(String.valueOf(randomNumber));
	}else {
		ArrayList<String> values = treeMap.get(previousNumber);
		values.add(String.valueOf(randomNumber));
	}
	}else {
		nextNumber = true;
	}
	previousNumber = randomNumber;
	i++;
}
for (Map.Entry<Integer, ArrayList<String>> entry : treeMap.entrySet())  
    System.out.println("Key = " + entry.getKey() + 
                     "::Value = " + entry.getValue());

//System.out.println(treeMap);

}
	private static void getNumberByMath() {
		int count = 1;
		int i = 0;
		int ii = 5;
		boolean nextNumber = false;
		while (i < count) {
			double randomNumber = Math.random() * 36 + 0;
			if (ii == randomNumber) {
				// System.out.println(randomNumber);
				nextNumber = true;
			} else if (nextNumber) {
				System.out.println("Random Number By Match::::" + randomNumber);
				return;
			}

		}
	}
public String hello(String name) {
    System.out.println(System.currentTimeMillis() + " > hello " + name);
    return "Hello " + name;
  } 
public static int randInt(int min, int max) {

    // NOTE: This will (intentionally) not run as written so that folks
    // copy-pasting have to think about how to initialize their
    // Random instance.  Initialization of the Random instance is outside
    // the main scope of the question, but some decent options are to have
    // a field that is initialized once and then re-used as needed or to
    // use ThreadLocalRandom (if using at least Java 1.7).
    // 
    // In particular, do NOT do 'Random rand = new Random()' here or you
    // will get not very good / not very random results.
    Random rand = new Random();;

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
}
