package third;
/*
 * Design a class that acts as a library for the following kinds of media:
 *  book, video, and newspaper. Provide one version of the class that uses 
 *  generics and one that does not. Feel free to use any additional APIs 
 *  for storing and retrieving the media.
 */

import java.util.*;
class Book{
	 String name;
	 int code;
	
	public Book(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	public String toString() {
		return this.name + " - " + this.code;
	}
	
}

class Video{
	 String name;
	 int code;
	
	public Video(String name, int code) {
		this.name = name;
		this.code = code;
	}
	public String toString() {
		return this.name + " - " + this.code;
	}
	
}

class Newspaper{
	 String name;
	 int code;
	
	public Newspaper(String name, int code) {
		this.name = name;
		this.code = code;
	}
	public String toString() {
		return this.name + " - " + this.code;
	}
	
}

class Library<T, U, V>{
	private List<T> obj;
	private List<U> obj2;
	private List<V> obj3;
	
	public List<T> getObj() {
		return obj;
	}

	public void setObj(List<T> obj) {
		this.obj = obj;
	}
	
	public List<U> getObj2() {
		return obj2;
	}

	public void setObj2(List<U> obj2) {
		this.obj2 = obj2;
	}
	
	public List<V> getObj3() {
		return obj3;
	}

	public void setObj3(List<V> obj3) {
		this.obj3 = obj3;
	}

}

class NongenericLibrary {
private List b;
private List v;
private List n;
public List getB() {
	return b;
}
public void setB(List b) {
	this.b = b;
}
public List getV() {
	return v;
}
public void setV(List v) {
	this.v = v;
}
public List getN() {
	return n;
}
public void setN(List n) {
	this.n = n;
}



}
public class LibraryEx {

	public static void main(String[] args) {

        NongenericLibrary lib2 = new NongenericLibrary();
		Library<Book, Video, Newspaper>lib = new Library<Book, Video, Newspaper>();
		
		
		List<Book> book = new ArrayList<Book>();
		book.add(new Book("Ramayna", 345));
		book.add(new Book("Mahabharta", 647));
		
		List<Video> video = new ArrayList<Video>();
		video.add(new Video("ABC", 456));
		video.add(new Video("cgh", 908));
		
		
		List<Newspaper> newspaper = new ArrayList<Newspaper>();
		newspaper.add(new Newspaper("TOI", 5463));
		newspaper.add(new Newspaper("Economic Times", 823));
		lib.setObj(book);
		lib.setObj2(video);
		lib.setObj3(newspaper);
		
		
		for(Book b: lib.getObj()) {
			System.out.println(b);
		}
		
		for(Video b: lib.getObj2()) {
			System.out.println(b);
		}
		
		for(Newspaper b: lib.getObj3()) {
			System.out.println(b);
		}

	}

}
