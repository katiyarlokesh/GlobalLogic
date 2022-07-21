// Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”
// snow then new sentence will be the "A snowman with snow".
package com.globallogic.July20;

public class ReplaceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "A Batman with Bat";
		String str = s1.replaceAll("Bat", "Snow");
		System.out.println(str);

	}

}
