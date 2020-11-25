package generics;

public class BoxGenericClass<T> {
	private T t;
	
	public BoxGenericClass() {
		
	}
	
	public BoxGenericClass(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
	
	public static void main(String[] args) {
		BoxGenericClass<Integer> box1= new BoxGenericClass<Integer>();
		box1.set(1);
		System.out.println(box1.get());
		
		BoxGenericClass<String> box2= new BoxGenericClass<String>();
		box2.set("Hello world");
		System.out.println(box2.get());
	}

}
