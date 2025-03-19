package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls =Stream.of("Arun","Abiskek","Adarsh","Barrani","Bala","Rama").filter(x->x.endsWith("a")).map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		List<Integer> values =Arrays.asList(9,6,7,7,5,8,8,0,1,4);
		values.stream().distinct().forEach(n->System.out.println(n));
		List<Integer>num = values.stream().distinct().sorted().toList();
		System.out.println(num.get(7));
	}

}
