import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        LinkedList <Integer> ls=new LinkedList<>();
        for(int i=0; i<3; i++){
            al.add(new ArrayList<>());
            for(int j=0; j<3; j++){
                int t=sc.nextInt();
                al.get(i).add(t);
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int t=al.get(i).get(j);
                if(t<5){
                    ls.add(2*t);
                }
            }
        }
        System.out.println(ls);
        




    }
}
