import java.util.ArrayList;

class MyQueue{

    ArrayList<Integer> q = new ArrayList<Integer>();

    void push(int ele){
        q.add(ele);
    }

    int pop(){
        int top = q.size()-1;
        return q.remove(top);
    }

    int peek(){
        int top = q.size()-1;
        return q.get(top);
    }

    boolean empty(){
        if(q.size()==0)
            return true;
        else
            return false;
    }

    int size(){
        return q.size();
    }

    public static void main(String[] args) {
        MyQueue qu=new MyQueue();
        qu.push(23);
        qu.push(12);
        qu.push(34);
        System.out.println(qu.q);
        int s=qu.pop();
        System.out.println(s);
        System.out.println(qu.peek());
    }
}
