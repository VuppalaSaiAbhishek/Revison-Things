package Java.InputFormats;
import java.util.*;

public class arrInputs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        
        //CASE1:1 2 3 4 5
        String[] token = s.split("\\s+");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String a : token){
            arr.add(Integer.parseInt(a));
        }
        for(int a:arr){
            System.out.println(a);
        }




        //CASE2 -- !!------IMPORTANT--------!!




        //CASE 2: [1,2,3,4,5] , {1,2,3,4,5} ,[1,-90,34,98]
        StringBuilder numStr = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        for(char a:s.toCharArray()){
            if(Character.isDigit(a) || a=='-' || a=='.'){
                numStr.append(a);
            }
            else{
              if(numStr.length()>0) {
                    arr.add(Integer.parseInt(numStr.toString()));
                    numStr.setLength(0);
              }    
            }
        }
        if(numStr.length()>0){
            arr.add(Integer.parseInt(numStr.toString()));
            numStr.setLength(0);
        }
        for(int a:arr){
            System.out.println(a);
        }


        

        // //CASE3 : [-1.5,3.4,6.0],{1.3,5.7,4.5}
        StringBuilder numStr = new StringBuilder();
        ArrayList<Double> arr = new ArrayList<>();
        for(char a:s.toCharArray()){
            if(Character.isDigit(a) || a=='-' || a=='.'){
                numStr.append(a);
            }
            else{
              if(numStr.length()>0) {
                    arr.add(Double.parseDouble(numStr.toString()));
                    numStr.setLength(0);
              }    
            }
        }
        if(numStr.length()>0){
            arr.add(Double.parseDouble(numStr.toString()));
            numStr.setLength(0);
        }
        for(Double a:arr){
            System.out.println(a);
        }




        //CASE3:
        // 1
        // 2
        // 3
        // 4

        ArrayList<Integer> arr = new ArrayList<>();
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        for(int i:arr){
            System.out.println(i);
        }




        //CASE4:
        // 4
        // 1
        // 2
        // 3
        // 4
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int z:arr){
            System.out.println(z);
        }


        
        

    }
}