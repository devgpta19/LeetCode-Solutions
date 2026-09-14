class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean isLeft = rec2[2] <= rec1[0];
        boolean isRight = rec2[0] >= rec1[2];
        boolean isBelow = rec2[3] <= rec1[1];
        boolean isAbove = rec2[1] >= rec1[3];

        return !(isLeft || isRight || isBelow || isAbove);
    }
}