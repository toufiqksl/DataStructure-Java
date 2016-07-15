package com.string;

import java.util.ArrayList;
import java.util.List;

public class DuplicateInString {

	public static void main(String args[]) {

		String[] entryString = { "abc", "abc", "def", "eeee", "def", "abc", "ee" };
		int count = 0;
		String removeContent = "";
		List<String> remove = new ArrayList<>();
		boolean flag = false;

		for (int i = 0; i < entryString.length; i++) {
			for (int j = i + 1; j < entryString.length; j++) {
				if ((entryString[i].equals(entryString[j]))
						&& (!entryString[i].equals(removeContent))) {
					count++;
				}
			}

			if (remove.size() == 0) {
				remove.add(entryString[i]);
				removeContent = entryString[i];
				System.out.println("removeContent : " + removeContent);
				System.out.println("Count : " + (count + 1));
			} else {
				for (String data : remove) {
					flag = !entryString[i].equals(data);
					if (flag) {
						removeContent = entryString[i];
					}else{
						break;
					}
				}
			}
			if (flag) {
				System.out.println("removeContent : " + removeContent);
				System.out.println("Count : " + (count + 1));
				remove.add(entryString[i]);
			}
			count = 0;
		}
	}

}