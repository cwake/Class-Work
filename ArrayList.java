import java.util.ArrayList;
/**
 * @version 1 January 26,2016
 * @author ChloeWake
 *
 */
public class cleanCorruptData {
	/*//accepts an ArrayList of integers and removes any adjacent pair of
	integers in the list if the left element of the pair is smaller than the right element of the pair. Every pair's
	left element is an even-numbered index in the list, and every pair's right element is an odd index in the
	list. For example, suppose a variable called list stores the following element values: [3, 7, 5, 5, 8, 5, 6, 3,
	4, 7] */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer> (); // create list to add elements to
		list.add(3);
		list.add(7);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(4);
		list.add(7);// 10 elements so this list is of even numbers
		readArray(list);
		System.out.println(list);
	} 
	public static void readArray(ArrayList<Integer> list) {
		//read through arrayList in pairs
		int count = list.size();
		int i = 0;
		int j = 0;

		if (count % 2 == 0) {//if even length continue
			while (count > 0) {
				if (list.get(i) < list.get(i+1)) {
					list.remove(j);
					list.remove(i);
				} 	else if (list.get(i) >= list.get(i+1)) {
					i+=2;
					j+=2;
				}
				count -=2;
				//System.out.println(list);
			}
		} else if (count % 2 != 0) { // else if the list has an odd amount of numbers in it
			list.remove(count-1);//delete that last number by finding the length minus one and removing at that index
			while (count > 0) {
				if (list.get(i) < list.get(i+1)) {
					list.remove(j);
					list.remove(i);
				} 	else if (list.get(i) >= list.get(i+1)) {
					i+=2;
					j+=2;
				}
				count -=3;
				//System.out.println(list);
			}
		}
	}
}
//expected output [5, 5, 8, 5, 6, 3]
