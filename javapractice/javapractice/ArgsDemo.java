public class ArgsDemo {
    /** Since main is called by the Java interpreter itself rather than another Java class,
     * it is the interpreter's job to supply these arguments.
     * They refer usually to the command line arguments.
     * $ javac ArgsDemo.java
     * $ java ArgsDemo these are command line arguments
    */
    public static void main(String[] args){
        System.out.println(args[0]);
    }
}
