package com.company;

import java.util.*;
import java.util.regex.*;


class NLArray{
    String[] wordTokenize(String fileName){
        Scanner sc =  new Scanner(fileName);
        String[] arr;

        int count = 0;
        while(sc.hasNext()){
            count++;
            sc.next();
        }
        sc = new Scanner(fileName);

        arr = new String[count];
        for(int i=0; sc.hasNext(); i++){
            String str = sc.next();
            for(int j=0; j<str.length(); j++){
                char c = str.charAt(j);
                if((c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z')){
                    continue;
                }
                str = str.replace(c+"", "");
            }
            arr[i] = str;
        }
        return arr;
    }
	String[] extractEmail(String fileName) throws NullPointerException{
        Scanner sc =  new Scanner(fileName);
        Vector<String> arr = new Vector<String>();
            for (int ind = 0; sc.hasNext(); ind++) {
                String str = sc.next();
                if (!(str.contains("@") && str.contains("."))){
                    continue;
                }
                int ndot = str.length() - str.replace(".", "").length();
                int na = str.length() - str.replace("@", "").length();
                int a = 0, top = 0;
                String[] substr = new String[ndot + na + 1];
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '.' || str.charAt(i) == '@' || i == str.length()-1) {
                        if (i == str.length() - 1)
                            i++;
                        substr[top++] = str.substring(a, i);
                        a = i + 1;
                    }
                }
                boolean isEmail = true;
                for (String s : substr) {
                    for (int j = 0; j < s.length(); j++) {
                        char c = s.charAt(j);
                        if (((c >= '0') && (c <= '9')) || ((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')) || "-_".contains(c+"")) {
                            isEmail = true;
                            continue;
                        }
                        else{
                            isEmail = false;
                            break;
                        }
                    }
                    if (!isEmail){
                        break;
                    }

                }
                if (isEmail){
                    arr.add(str);
                }
            }
        String[] emails = new String[arr.size()];
        for (int i =0; i<arr.size(); i++){
            emails[i] = arr.get(i);
        }
        return emails;
    }
    void extractBoundries(int arr[][]){
        int row = arr.length-1;
        int col = arr[0].length-1;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (i == 0 || i == row || j==0 || j==col){
                    System.out.print(arr[i][j]+"\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    void cropCenterPart(int arr[][]){
        int row = arr.length-1;
        int col = arr[0].length-1;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (i == 0 || i == row || j==0 || j==col){
                    System.out.print("\t");
                }
                else
                    System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    boolean NConRep(int arr[][]){
        int row = arr.length-1;
        int col = arr[0].length-1;

        boolean bool = true;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    bool = true;

                }
                else {
                    return false;
                }
            }
            if(bool){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] arg) throws NullPointerException{
        NLArray obj = new NLArray();
		String[] arr = obj.wordTokenize("7937973979 hkdkhdhkhdk 0-380834 hdhdhdodho");
		for(String str: arr){
			System.out.println(str);
		}
		String[] arr1 = obj.extractEmail("hkshkhskhksdh shankar.bscsf19@iba-suk.edu.pk  hkhhhhhhh dgigdi.hehh@nnn.cjcj");
		for(String str: arr1){
			System.out.println(str);
		}
		int[][] array = {{1, 2, 3, 4}, {5, 4, 5, 5}, {9, 9, 9, 10}, {1, 1, 1, 2}};
		obj.extractBoundries(array);
        obj.cropCenterPart(array);
        System.out.println(obj.NConRep(array));
    }
}
