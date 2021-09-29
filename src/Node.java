public class Node<T> {
    private T t;
    private Node dog;
    private Node puppy;

    public Node(){
    }
    public Node(T t){
        this.t =t;
    }
    public Node(T t, Node dog, Node puppy){
        this.t =t;
        this.dog = dog;
        this.puppy = puppy;
    }
    public T get_t(){
        return t;
    }
    public Node get_dog(){
        return dog;
    }
    public Node get_puppy(){
        return puppy;
    }
    public T set_t(T t){
        return this.t = t;
    }
    public Node set_dog(Node dog){
        return this.dog = dog;
    }
    public Node set_puppy(Node puppy){
        return this.puppy = puppy;
    }

    public String toString(){
        return "Node: ";
    }
}
