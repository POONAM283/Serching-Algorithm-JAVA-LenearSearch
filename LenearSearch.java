

class linerSearching
{
    int Searching(int array[] , int x)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return 0;
    }
}

/**
 * LenearSearch
 */
public class LenearSearch {

    public static void main(String[] args) {
        linerSearching l1 = new linerSearching();
        
        int array[] = { 1,2,3,4,5,6,7,8,9 };

        int index = l1.Searching(array, 5);

        System.out.println(index+1);
    }
}