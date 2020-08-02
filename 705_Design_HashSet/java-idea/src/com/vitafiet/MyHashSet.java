package com.vitafiet;

class MyHashSet {

    /** Initialize your data structure here. */
    byte[] byteVector = null;

    public MyHashSet() {
        //constraint: All values will be in the range of [0, 1000000].
        this(1000000); //<-- capacity; each translate to 1 bit.

    }

    public MyHashSet(int capacity){ //
        int capacityInBytes = (int)Math.ceil((capacity + 1) / 8.0);
//        System.out.println("capacity=" + capacityInBytes + " bytes");
        byteVector = new byte[capacityInBytes];
    }

    public void add(int key) {
        int byteIndex = key/8;
        int position = key%8;
//        System.out.println("ADD(" + key + ") --> ByteIndex:" + byteIndex + " Position:" + position);
        byte mask = 0;
        switch (position){
            case 0: mask = -128; break;
            case 1: mask = 64; break;
            case 2: mask = 32; break;
            case 3: mask = 16; break;
            case 4: mask = 8; break;
            case 5: mask = 4; break;
            case 6: mask = 2; break;
            case 7: mask = 1; break;
            default:
//                System.out.println("Shouldn't happen");
        }

        byteVector[byteIndex] = (byte)(byteVector[byteIndex] | mask);
//        System.out.println("Byte:" + byteVector[byteIndex]);
    }

    public void remove(int key) {
        int byteIndex = key/8;
        int position = key%8;
//        System.out.println("REMOVE(" + key + ") --> ByteIndex:" + byteIndex + " Position:" + position);
        byte mask = 0;
        switch (position){
            case 0: mask = 127; break;
            case 1: mask = -65; break;
            case 2: mask = -33; break;
            case 3: mask = -17; break;
            case 4: mask = -9; break;
            case 5: mask = -5; break;
            case 6: mask = -3; break;
            case 7: mask = -2; break;
            default:
//                System.out.println("Shouldn't happen");
        }

        byteVector[byteIndex] = (byte)(byteVector[byteIndex] & mask);
//        System.out.println("Byte:" + byteVector[byteIndex]);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int byteIndex = key/8;
        int position = key%8;
//        System.out.println("CONTAINS(" + key + ") --> ByteIndex:" + byteIndex + " Position:" + position);
        byte mask = 0;
        switch (position){
            case 0: mask = -128; break;
            case 1: mask = 64; break;
            case 2: mask = 32; break;
            case 3: mask = 16; break;
            case 4: mask = 8; break;
            case 5: mask = 4; break;
            case 6: mask = 2; break;
            case 7: mask = 1; break;
            default:
//                System.out.println("Shouldn't happen");
        }

        byte op = (byte)(byteVector[byteIndex] & mask);
//        System.out.println("Byte:" + byteVector[byteIndex] + " Op:" + (op!=0));
        return (op!=0);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */