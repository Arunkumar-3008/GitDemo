package JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Arun");
		names.add("Kailesh");
		names.add("Sundar");
		names.add("Krishna");
		names.add("Revanth");
		names.add("Abdul");
		names.add("Alphonse");
		
		Long c =names.stream().filter(k->k.startsWith("A")).count();
		System.out.println(c);
		Long d =Stream.of("Arun","Abiskek","Adarsh","Barrani","Bala","Ram").filter(k->
	{
		k.startsWith("A");
		return true;
		
	}).count();
		System.out.println(d);
		
		names.stream().filter(k->k.length()>4).forEach(k->System.out.println(k));
		names.stream().filter(k->k.length()<6).limit(1).forEach(k->System.out.println(k));
	}
		
	}
	


