package Tree;

import java.util.HashMap;

public class ConstructBTInPost {
    public Node  buildTree(int[] inOrder,int[] postOrder){
        if(inOrder==null||postOrder==null||inOrder.length!=postOrder.length) return null;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<inOrder.length;i++){
            hm.put(inOrder[i],i);
        }
        return buildTreePostIn(inOrder,0,inOrder.length-1,postOrder,0,postOrder.length-1,hm);
    }
    private Node buildTreePostIn(int[] inOrder,int is,int ie,int[] postOrder,int ps,int pe,HashMap<Integer,Integer> hm){
        if(ps>pe||is>ie) return null;
        Node root=new Node(postOrder[pe]);
        int inRoot=hm.get(postOrder[pe]);
        int numsLeft=inRoot-is;
        root.left=buildTreePostIn(inOrder,is,inRoot-1,postOrder,ps,ps+numsLeft-1,hm);
        root.right=buildTreePostIn(inOrder,inRoot+1,ie,postOrder,ps+numsLeft,pe-1,hm);
        return root;
    }
}
