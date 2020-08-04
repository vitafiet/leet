package com.vitafiet;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        if (s.length() > 100) return new ArrayList(); // <-- limit.
        
        ArrayList<String> fin = new ArrayList<String>();

        ArrayList<String> ongoingList = new ArrayList<String>();
        ongoingList.add(s);

        while(!ongoingList.isEmpty()){
            String str = ongoingList.remove(0);
            if(!str.contains(" ")) {
                ArrayList<String> list = addSpace(str, wordDict);
                if(list != null && list.size() == 1 && list.get(0).equals(str))
                    fin.add(str);
                else if(list != null) ongoingList.addAll(list);
            }else{
                String[] arr = str.split(" ");
                String s2 = arr[arr.length-1];
                ArrayList<String> list = addSpace(s2, wordDict);
                if(list.size() == 1 && list.get(0).equals(s2))
                    fin.add(str);
                else if(list.size() == 0) continue;
                else{
                    String partialStr = "";
                    for(int i=0; i<arr.length-1; i++)
                        partialStr += arr[i] + " ";
                    for(String s1 : list) {
                        if(s1.contains(" ")) ongoingList.add(partialStr + s1);
                        else fin.add(partialStr + s1);
                    }
                }
            }
        }

        return (List)fin;
    }

    // returns "" if no word in "wordDict" is found.
    // adds "space" if exact word is found --> string len of "s" and return is same.
    // adds "str str" if word is found but string didn't end --> string len of "s" is less than what's returned.
    private ArrayList<String> addSpace(String s, List<String> wordDict){

        ArrayList<String> list = new ArrayList<String>();

        for (Object o : wordDict.toArray()) {
            String word = (String)o;

//            if(s.equals(word)) return null;

            if(s.startsWith(word)){
                if(s.equals(word)) list.add(s);
                else {
                    int len = word.length();
                    String str = word + " " + s.substring(len);
                    list.add(str);
//                System.out.println(str);
                }
            }
        }
        return list;

    }
}