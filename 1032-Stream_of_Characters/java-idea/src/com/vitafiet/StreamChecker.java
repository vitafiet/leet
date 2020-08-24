package com.vitafiet;

import java.util.ArrayList;

class StreamChecker {

    TrieNode root = null;
    TrieNode recent = null;

    ArrayList<TrieNode> list = null;

    public StreamChecker(String[] words) {
        root = new TrieNode(0);

        for(String s : words)
            root.insertStr(s);

        list = new ArrayList<TrieNode>();
    }

    public boolean query(char letter) {

        boolean ret = false;

        TrieNode n = null;

        list.add(root);

        int limit = list.size();
        for(int i=0; i<limit; i++)
        {
            n = list.get(0);
            list.remove(0);
            n = n.query(letter);
            if(n != null && n.isWord()){
                ret = ret || n.isWord();
            }

            if( n != null && !n.isEmpty()){
                list.add(n);
            }
        }

        return ret;

//         if(recent == null) recent = root;

//         recent = recent.query(letter);

//         if(recent != null && recent.isWord())
//         {
//             recent = null;
//             return true;
//         }

//         return false;

    }

    private class TrieNode{

        private boolean word = false;
        private boolean empty = true;
        private TrieNode[] nodes = null;
        private int level;

        TrieNode(int level){
            word = false;
            empty = true;
            nodes = new TrieNode[26];
            this.level = level;
        }

        public boolean isWord(){
            return this.word;
        }

        public boolean isEmpty(){
            return this.empty;
        }

        public void insertStr(String s){

            if(s.length() < 1) return;

            char ch = s.charAt(0);
            // System.out.println("ch=" + ch);

            TrieNode node = nodes[ch-'a'];
            if(node == null){
                node = new TrieNode(level+1);
                nodes[ch-'a'] = node;
                empty = false;
            }

            if(s.length() == 1){
                node.word = true;
                return;
            }
            else {
                node.insertStr(s.substring(1));
                empty = false;
            }
        }

        public TrieNode query(char ch){
            // System.out.println("query ch=" + ch);
            return nodes[ch-'a'];
        }

    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */
