import java.util.HashSet;
import java.util.Set;
class retain
{
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		Set<Integer> set2 = new HashSet<>();

		set2.add(9);
		set2.add(8);
		set2.add(3);
		set2.add(4);
		set2.add(7);

		System.out.println("Elements of set1 :"+set1);
		System.out.println("Elements of set2 :"+set2);
		set2.retainAll(set1);

		System.out.println("Elements of set2 after retain method: "+set2);

	}
}