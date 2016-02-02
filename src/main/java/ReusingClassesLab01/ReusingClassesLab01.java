package ReusingClassesLab01;

import java.util.ArrayList;

/**
 * Created by rogi on 2/2/16.
 */
public class ReusingClassesLab01 extends ArrayList{
//int k=2;
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();


    public void rotate(ArrayList list, int k){

        for (int i=0; i<k; i++){
             list2.add(i, (Integer) list.get(i));
        }



        for (int j=0; j<list.size() - k;j++){
          list.set(j, list.get(j+k));
        }

        for (int r=0; r<k; r++){
            list.set(list.size()-(k-r), list2.get(r));
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ReusingClassesLab01 rc1 = new ReusingClassesLab01();

        rc1.rotate(list1,3);

        System.out.println(list1);
    }

}
