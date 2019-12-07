package q1;

import java.util.ArrayList;

public class ArraylistMethod {
	public static ArrayList<Integer> select(ArrayList<Integer> a) {
		int FirstInt = 0, SecondInt = 0, i = 0;
		ArrayList<Integer> b = new ArrayList<>();
		
		//--------------------------------------
		if (a.size()==0)
			return a;
		else if (a.size()%2==1) {
			a.remove(a.size()-1);
		}
		while (i < a.size()) {
			FirstInt = a.get((i + 0));
			SecondInt = a.get((i + 1));
			if (FirstInt <= SecondInt) {
				b.add(FirstInt);
				b.add(SecondInt);
			}
			i += 2;
		}
		a = b;
		return a;
	}

	public static void main(String[] args) {
		// {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1};
		ArrayList<Integer> h = new ArrayList<>();
		h.add(3);
		h.add(7);
		h.add(9);
		h.add(2);
		h.add(5);
		h.add(5);
		h.add(8);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(7);
		h.add(3);
		h.add(1);
		h.add(16);
		System.out.println(ArraylistMethod.select(h));

	}
}
