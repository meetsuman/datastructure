package matrix;

import java.util.ArrayList;

public class SearchSortedMatrix {
    public ArrayList<Integer> A;
    public int x;
    SearchSortedMatrix(){
        A=new ArrayList<>();
    }
    public ArrayList<Integer> searchVal(int a[][],int m ,int n,int v){

        for (int i = n-1; i >=0; i--) {
            if(a[0][i]==v){
                A.add(0);
                A.add(i);
                return A;
            }
            if(a[0][i]>v){
                continue;
            }
            if(a[0][i]<v){
                x=i;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            if(a[i][x]==v){
                A.add(i);
                A.add(x);
                return A;

            }
            else continue;
        }
        A.add(Integer.MAX_VALUE);
        A.add(Integer.MAX_VALUE);
        return A;
    }

    public static void main(String[] args) {

        SearchSortedMatrix ssm=new SearchSortedMatrix();
        int r,c;
        r=2;
        c=2;
        int val=2;
        int a[][]={{1,3},
                    {2,4}};

        ArrayList<Integer> u=ssm.searchVal(a,r,c,val);
        System.out.println(u);

    }
}
