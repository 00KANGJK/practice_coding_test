import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = new Node(Integer.parseInt(br.readLine()));

        while(true){
            try {
                int val = Integer.parseInt(br.readLine());
                root.insert(val);
            } catch (Exception e) {
                break;
            }
        }

        postOrder(root);
    }

    static void postOrder(Node curr){
        if(curr == null) return;

        postOrder(curr.left);
        postOrder(curr.right);
        System.out.println(curr.val);
    }

    static class Node{
        int val;
        Node left, right;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

        void insert(int n){
            if(n < this.val){
                if(this.left == null) this.left = new Node(n);
                else this.left.insert(n);
            }
            else{
                if(this.right == null) this.right = new Node(n);
                else this.right.insert(n);
            }
        }
    }
}
