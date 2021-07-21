package com.dynamic.leetcode2;

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2021/5/23
 */
class Test {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int mid = (m+n)/2;
            boolean even = false;
            if((m+n)%2 ==1){
                even = true;
            }else{
                even = false;
            }
            int a=0;
            int b=0;
            int target=0;
            for(int i=0;i<=mid;i++){
                if(a<m && b<n){
                    if(nums1[a]<nums1[b]){
                        target = nums1[a];
                        a++;
                    }else{
                        target = nums2[b];
                        b++;
                    }
                }else if(a == m){
                    target = nums2[b];
                    b++;
                }else{
                    target = nums1[a];
                    a++;
                }
            }
            if(even){
                return target;
            }else{
                int nextTargt = 0;
                if(a<m && b<n){
                    if(nums1[a]<nums2[b]){
                        nextTargt = nums1[a];
                    }else{
                        nextTargt = nums2[b];
                    }
                }else if(a==m){
                    nextTargt = nums2[b];
                }else{
                    nextTargt = nums1[a];
                }
                return (target+nextTargt)*1d/2;
            }

        }
}
