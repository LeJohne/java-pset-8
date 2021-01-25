import java.util.*;

public class ProblemSet8 {

    public static boolean common(int[] a, int[] b) {
        if(a == null || b == null || a.length == 0 || b.length == 0){
            return false;
        } else {
            if( a[a.length-1] ==  b[b.length-1]){
                return true;
            } else if ( a[0] == b[0]){
                return true;
            } else {
                return false;
            }
        }
    }

    public static int[] middleman(int[] a, int[] b) {
        int a_half = a.length  % 2;
        int b_half = b.length % 2;
        int [] middleArray = new int[2];
        if(a.length == 0 || b.length == 0|| a_half == 0 || b_half == 0 ){
            return null;
        } else {
            int a_middle = (a.length / 2) ;
            int b_middle = (b.length /2 );

            middleArray[0] = a[a_middle];
            middleArray[1] = b[b_middle];
            return middleArray;
        }

    }

    public static int[] bigger(int[] a, int[] b) {
        if( a == null || b == null){
            return null;
        } else {
            int SumOfa = 0;
            int SumOfb = 0;
            if(a.length == 0) {
                SumOfa= 0;
            } else {
                for (int i = 0; i < a.length; i++) {
                    SumOfa += a[i];
                }
            }
            if (b.length == 0){
                SumOfb = 0;
            } else {
                for (int j = 0; j < b.length; j++) {
                    SumOfb += b[j];
                }
            }
            if (SumOfa > SumOfb){
                return a;
            } else if ( SumOfb > SumOfa){
                return b;
            } else if (SumOfa == SumOfb) {
                return a;
            } else {
                return null;
            }
        }
    }

    public static int[] doubleMiddle(int[] a, int[] b) {
        int a_half = a.length  % 2;
        int b_half = b.length % 2;
        int [] middleArray = new int[4];
        if( a.length == 0 || b.length == 0 || a_half== 1 || b_half ==1 ){
            return null;
        } else {
            int  a1_middle = (a.length / 2) -1 ;
            int  a2_middle = (a.length / 2) ;
            int  b1_middle = (b.length / 2) -1 ;
            int  b2_middle = (b.length / 2) ;

            middleArray[0] = a[a1_middle];
            middleArray[1] = a[a2_middle];
            middleArray[2] = b[b1_middle];
            middleArray[3] = b[b2_middle];

            return middleArray;
        }
    }

    public static int[] swapMe(int[] a) {
        if (a == null){
            return null;
        }
        int one = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = one;
        return a;
    }

    public static int[] threePoint(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 == 0){
            return null;
        }
        int midposition = a.length / 2;
        int endposition = a.length - 1;
        int[] point = {a[0], a[midposition], a[endposition]};
        return point;
    }

    public static int headHoncho(int[] a) {
        if (a == null || a.length == 0) {
            return -1;
        } else {
            int max = 0;
            for (int i = 0; i < a.length; i++) {
                if ( a[i] < 0){
                    return -1;
                } else {
                    if( a[i] > max){
                        max = a[i];
                    }
                }
            }
            return max;
        }
    }

    public static boolean tippingPoint(int[] a, int threshold) {
        if (a == null){
            return false;
        } else{
            int sum = 0;
            for( int i = 0; i < a.length; i++){
                sum += a[i];
            }
            if ( sum > threshold){
                return true;
            } else {
                return false;
            }
        }

    }

    public static String halfway(int[] a) {
        int a_half = a.length  % 2;
        if( a.length == 0 || a_half== 1  || a == null ){
            return null;
        } else {
            int left = 0;
            for( int i = 0; i < a.length / 2; i++){
                left += a[i];
            }
            int right = 0;
            for( int j = (a.length /2) ; j < a.length;  j++){
                right += a[j];
            }
            if ( left > right ){
                return "LEFT";
            } else {
                return "RIGHT";
            }
        }
    }

    public static int[] sequential(int[] a, int[] b) {
        if( a == null || b == null || (a.length + b.length) < 3){
            return null;
        } else {
            int[] wholeArray = new int[3];
            if(a.length >= 3){
                for(int i = 0; i < 3; i++){
                    wholeArray[i] = a[i];
                }
            } else {
                switch (a.length){
                    case 0:
                        for(int j = 0; j < 3; j++){
                            wholeArray[j] = b[j];
                        }
                    case 1:
                        wholeArray[0] = a[0];
                        wholeArray[1] = b[0];
                        wholeArray[2] = b[1];
                        break;
                    case 2:
                        wholeArray[0] = a[0];
                        wholeArray[1] = a[1];
                        wholeArray[2] = b[0];
                        break;
                }
            }
            return wholeArray;
        }
    }
}