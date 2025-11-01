import java.util.HashSet;
import java.util.Set;
class Collection{
    public static void main(String[] args){
       Set<Integer> st = new HashSet<>();
       st.add(3);
       st.add(4);
       st.add(3);
       st.add(40);
       st.add(49);
       System.out.println(st);
    }
}