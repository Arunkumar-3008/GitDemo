package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class streamMap {

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
		
		Stream.of("Arun","Abiskek","Adarsh","Barrani","Bala","Rama").filter(x->x.endsWith("a")).map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		List<String> names1 =Arrays.asList("Arun","Abiskek","Adarsh","Barrani","Bala","Rama");
		names1.stream().filter(y->y.startsWith("A")).sorted().map(y->y.toUpperCase()).forEach(y->System.out.println(y));
		//merging two different lists
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(u->System.out.println(u));
		boolean flag =newStream.anyMatch(a->a.equalsIgnoreCase("rama"));
		Assert.assertTrue(flag);
		System.out.println(flag);
		
	}

}
