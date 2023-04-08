package geeksforgeeks.hash;

import java.util.HashMap;
import java.util.Map;

public class repeatativeElement {
    static int mostFrequent(int arr[], int n)
    {

        // Insert all elements in hash
        Map<Integer, Integer> hp =
                new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return res;
    }

    // Driver code
    public static void main (String[] args) {

        int arr[] = {40,50,30,40,50,30,10,30,5};
        int n = arr.length;

        System.out.println(mostFrequent(arr, n));
    }
}
