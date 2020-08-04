package com.vitafiet;

/*
1 = 4^0 = 2^0 --> 1st bit
4 = 4^1 = 2^2 --> 3rd bit.
16 = 4^2 = 2^4 --> 5th bit.
64 = 4^3 = 2^6 --> 7th bit.
256 = 4^4 = 2^8 --> 1st bit (of 2nd byte)

** Its a power of 4 if:
 (a) there's only 1 bit set (all other bits are 0).
 (b) the set bit is only at 1st, 3rd, 5th, or 7th bit place.
 */

class Solution {

    public boolean isPowerOfFour(int num) {

        for (int i = 0; i < 4; i++) { //loop to extract a byte from int.
            int intByte = num & 0xFF;
            num = num >> 8;
            if(intByte != 0 && num != 0) return false;
            else if(num == 0 && intByte != 0){
                // we got the byte we needed to analyze.
                switch (intByte){
                    case 1 : return true;
                    case 4 : return true;
                    case 16: return true;
                    case 64: return true;
                    default: return false;
                }
            }/* else if(num != 0 && intByte == 0){
//                System.out.println("Next loop");
            } else {
//                System.out.println("Shouldn't happen");
            }*/

        }
        return false;
    }
}