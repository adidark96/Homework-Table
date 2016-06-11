package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //NOTE! THIS PROGRAM WORKS JUST FOR C = R+1;

        int r = 5;
        int c = 6;
        char[][] table = new char[r][c];
        for(int i=0;i<r;i++) {
            Arrays.fill(table[i], '0');
        }
        rewrite(table, r, c, 'X', 1);
        rewrite(table,r,c,'Y',2);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(table[i][j]);
            }
            System.out.print(System.lineSeparator());
        }
    }// public static void main enclose brace

    public static void rewrite(char theArray[][], int r, int c, char k, int z) {/*if z==1 diagonal is from left to right, if z==2 => z==1 reversed*/
        int q = c-1;
        if (z == 1) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (j == i) {
                        theArray[i][j] = k;
                        theArray[i][j + 1] = k;
                    }
                }
            }

        }
        if(z == 2) {
            for(int i = 0; i < r; i++) {
                for (int j = c - 1; j > 0; j--) {
                    if (j == i + q) {
                        if (theArray[i][j] != '0') {

                        } else {
                            theArray[i][j] = k;
                        }
                        theArray[i][j-1] = k;
                    }
                }
                q -= 2; /*q -= 2 because i is incremented and if i wasn't incremented q should've been -= 1


                        */
            }

        }
    }

}//public class Main enclose brace

