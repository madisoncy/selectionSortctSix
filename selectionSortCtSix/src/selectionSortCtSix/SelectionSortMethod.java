package selectionSortCtSix;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSortMethod {
	public static <T> void sort(ArrayList<T> list, Comparator<? super T> comparator) {
		int n = list.size();
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			T temp = list.get(minIndex);
			list.set(minIndex, list.get(i));
			list.set(i, temp);
		}
	}
}
