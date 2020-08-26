package misc;

public class MyGen<T> {
 T obj;
 
 public void add(T t){
	 this.obj = t;
 }
 
 T get(){
	 return this.obj;
 }
 
}
