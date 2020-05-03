package io.github.abitgen.leetcode.challenge30.twenty20May._1_firstBadVersion;

public class FirstBadVersion2 extends VersionControl{

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            /**
             * To avoid Integer Overflow
             */
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
