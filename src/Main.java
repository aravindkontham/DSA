import java.util.*;
class MyStacks{
    ArrayList<Integer> st=new ArrayList<Integer>();
    void push(int ele){
        st.add(ele);
    }
    int pop(){
        int top=st.size()-1;
        return st.remove(top);
    }
    int peek(){
        int top=st.size()-1;
        return st.get(top);
    }
    boolean empty(){
        if(st.size()==0)
            return true;
        else
            return false;
    }
    int size(){
        return st.size();
    }

}
public class Main {
    public static void main(String[] args) {
        MyStacks at=new MyStacks();
        at.push(5);
        at.push(6);
        at.push(11);
        at.push(17);
        System.out.println(at.st);
        at.pop();
        System.out.println(at.st);
        System.out.println(at.size());
        System.out.println(at.empty());



    }

    }
