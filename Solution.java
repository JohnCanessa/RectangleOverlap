import java.util.Arrays;
import java.util.Scanner;


/**
 * 836. Rectangle Overlap https://leetcode.com/problems/rectangle-overlap/
 */
public class Solution {

    /**
     * Given two (axis-aligned) rectangles, return whether they overlap.
     * 
     * Two rectangles overlap if the area of their intersection is positive.
     * To be clear, two rectangles that only touch at the corner or edges do not overlap.
     * 
     * Two rectangles do NOT overlap if one of the following conditions is true:
     * 
     * 1) One rectangle is above top edge of other rectangle.
     * 2) One rectangle is on left side of left edge of other rectangle.
     */
    static boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        // **** one rectangle is on the left side of the left edge of the other ****
        if ((rec2[2] <= rec1[0]) ||             // rec2 LEFT of rec1
            (rec1[2] <= rec2[0]))               // rec1 LEFT of rec2
            return false;
                
        // **** one rectangle is is above the top edge of the other ****
        if ((rec2[1] >= rec1[3]) ||             // rec2 ABOVE rec1
            (rec1[1] >= rec2[3]))               // rec1 ABOVE rec2
            return false;

        // **** rectangles overlap ****
        return true;

        // // **** somewhat hard to folow ****
        // return  rec1[0] < rec2[2] &&            // rec1 LEFT of rec2
        //         rec1[1] < rec2[3] &&            // rec2 ABOVE rec1
        //         rec2[0] < rec1[2] &&            // rec2 LEFT of rec1
        //         rec2[1] < rec1[3];              // rec1 ABOVE rec2
    }


    /**
     * Test scaffolding.
     */
    public static void main(String[] args) {

        // **** open scanner ****
        Scanner sc = new Scanner(System.in);

        // **** read values for rec1 ****
        String[] vals = sc.nextLine().split(",");

        // **** populate rec1 ****
        int[] rec1 = new int[4];
        for (int i = 0; i < rec1.length; i++) {
            rec1[i] = Integer.parseInt(vals[i]);
        }

        // ???? ????
        System.out.println("main <<< rec1: " + Arrays.toString(rec1));

        // **** read rec 2 ****
        vals = sc.nextLine().split(",");

        // **** populate rec1 ****
        int[] rec2 = new int[4];
        for (int i = 0; i < rec1.length; i++) {
            rec2[i] = Integer.parseInt(vals[i]);
        }

        // ???? ????
        System.out.println("main <<< rec2: " + Arrays.toString(rec2));

        // **** close scanner ****
        sc.close();
        
        // **** determine if the rectangles overlap ****
        boolean overlap = isRectangleOverlap(rec1, rec2);

        // ???? ????
        System.out.println("main <<< overlap: " + overlap);
    }

}