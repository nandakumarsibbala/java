package json;


public class Example {
		
		class MyGenerics1<T> {
			T obj;
			void add(T obj) {
				this.obj = obj;
			}
			
			T getType() {
				return obj;
			}
		}

		class Generics1 {
		public  void main(String[] args) 
		{
				MyGenerics1<Integer> mObject = new MyGenerics1<Integer>();
				mObject.add(50);
				System.out.println(mObject.getType());
	}
}
}