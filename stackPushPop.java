import java.util.Stack;

public class stackPushPop {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Java");
        st.push("Python");
        st.push("Kotlin");
        st.push("SQL");
        System.out.println("Pop:- " +st.pop());
        System.out.println("Stack:- "+ st);
    }
}
