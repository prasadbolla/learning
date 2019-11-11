package java8learning.streams;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class GenerateRandomNumber2 {
public static void main(String a[]) {
	Random random = new Random();

	int max = 36;
	int min = 0;
	int totalNumber = 10;

	IntStream stream = random.ints(totalNumber, min, max);
	//stream.forEach(System.out::println);
	CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
		getNumber();
	});
	CompletableFuture<Void> future2=CompletableFuture.runAsync(() -> {
		getNumber();
	});
	CompletableFuture<Void> future3=CompletableFuture.runAsync(() -> {
		getNumber();
	});
	CompletableFuture<Void> future4=CompletableFuture.runAsync(() -> {
		getNumber();
	});
	CompletableFuture<Void> future11 = CompletableFuture.runAsync(() -> {
		getNumberByMath();
	});
/*	CompletableFuture<Void> future22=CompletableFuture.runAsync(() -> {
		getNumberByMath();
	});
	CompletableFuture<Void> future33=CompletableFuture.runAsync(() -> {
		getNumberByMath();
	});
	CompletableFuture<Void> future44=CompletableFuture.runAsync(() -> {
		getNumberByMath();
	});*/
	CompletableFuture.allOf(future1,future2,future3,future4);
	System.out.println("Done");
	//CompletableFuture.allOf(future11,future22,future33,future44);
	System.out.println("Done1");

}
public String getNumberByAsync() {
	//CompletableFuture<String> future = CompletableFuture.supplyAsync(this.getNumber);
	
	CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> this.hello("Friend"));
	return null;
}
private static void getNumber() {
	int count =1;
	int i =0;
	int ii=10;
	boolean nextNumber = false;
while( i < count) {
	int randomNumber = randInt(0, 36);
	if(ii == randomNumber) {
		//System.out.println(randomNumber);
		nextNumber = true;
	}else if(nextNumber) {
		System.out.println("Random Number::::"+randomNumber);
		return;
	}
	
}
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
