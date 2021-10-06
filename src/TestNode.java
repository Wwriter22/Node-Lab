public class TestNode {
    public String checkEquals() {
        Node t = new Node("dog");
        Object o = "dog";
        t.equals(o);
        System.out.println("Testing equals:");
        System.out.println("Expected value: " + o + " Actual Value: " + t.get_data());
        if (t.equals(o)) {
            return "true";
        } else {
            return "false";
        }
    }
        public String checkToString () {
            Node test = new Node(5);
            System.out.println("Testing toString");
            System.out.println("Expected value: " + test + " Actual Value: " + test.toString());
            if ((test + "").equals(test.toString())) {
                return "true";
            }else{
                return "false";
            }
        }
        public String checkA_M () {
            Node n = new Node("");
            Node j = new Node("");
            n.set_prev(new Node("hello")); // sets their values
            j.set_next(new Node("goodbye"));// sets their values

            System.out.println("Testing setnext");
            System.out.println("Expected value: " + "goodbye" + " Actual Value: " + j.getNext());//tests the accessors and mutators of
            //next
            System.out.println("Testing setprev");
            System.out.println("Expected value: " + "hello" + " Actual Value: " + n.getPrev()); //tests the accessors and mutators of
            //prev
            if(j.equals(j.getNext()) && n.equals(n.getPrev())){
                return "true";
            }else{
                return "false";
            }
        }
    public static void main(String[] args) {
        TestNode n = new TestNode();
        n.checkEquals();
        n.checkToString();
        n.checkA_M();
    }
}

