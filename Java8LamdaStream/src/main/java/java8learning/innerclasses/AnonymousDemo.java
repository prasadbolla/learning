package java8learning.innerclasses;

class AnonymousDemo {
	public static void main(String[] args) {
		// Myclass is implementation class of Age interface
		/*MyClass obj = new MyClass();

		// calling getage() method implemented at Myclass
		obj.getAge();*/
		
		Age age = new Age() {
			@Override
			public void getAge() {
				System.out.println("printing"+x);
			}
		};
		age.getAge();
	}
}