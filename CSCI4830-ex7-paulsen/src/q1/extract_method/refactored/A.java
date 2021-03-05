package q1.extract_method.refactored;

import java.util.List;

//import q1.extract_method.org.Edge;

public class A {
   Node m1(List<Node> nodes, String p) {
	   extractedMethod(nodes.toArray(), p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList.toArray(), p);
      return null;
   }

   
   private void extractedMethod(Object[] lst, String p) {
	   for (Object o : lst)
	   {
		   if (o instanceof Node && ((Node)o).contains(p))
		   {
			   System.out.println((Node)o);
		   }
		   else if (o instanceof Edge && ((Edge)o).contains(p))
		   {
			   System.out.println((Edge)o);
		   }
	   }
    }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}