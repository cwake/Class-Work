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
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(7);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(6);
		list.add(3);
		list.add(4);
		list.add(7);
		readArray(list);
		System.out.println(list);
		//int[] list= {3, 7, 5, 5, 8, 5, 6, 3, 4, 7};
		
		}
	public static void readArray(ArrayList<Integer>list){
		//read through arrayList in pairs
		int count = list.size();
		//if odd length delete last number since it isn't part of a pair
		if (list.size() % 2 != 0);
			list.remove(list.size() -1);
		//else just keep going
			else{
				return list;
			}
			}
		// for each pair found check the int on the left side
	//for (int i = 0; i < list.size() - 1; i ++) {
	    //sums.add(list.get(i) + list.get(i+1));
	}
	for (int i = 0; i)
		// if it's smaller than int on right side, delete it 
		//if list is empty, return empty list
	}
	
}