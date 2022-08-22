import java.util.ArrayList;

class MyStack{

    ArrayList<Integer> st = new ArrayList<Integer>();

    void push(int ele){
        st.add(ele);
    }

    int pop(){
        int top = st.size()-1;
        return st.remove(top);
    }

    int peek(){
        int top = st.size()-1;
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