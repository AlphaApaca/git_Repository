public class Hanoi {
    public static void main(String[] args) {
        HanoiR(3, "a", "b", "c");
        System.out.println("Hello world!");
    }
    public static void HanoiR(int startNum, String start, String via, String end){
        if(startNum <= 1){
            System.out.println(startNum + " is moving from " + start + " to " + end);
        }else {
            HanoiR(startNum - 1, start, end, via);
            System.out.println(startNum + " is moving from " + " to " + end);
            HanoiR(startNum - 1, via, start, end);
        }
    }
    public static void HanoiI(){
        System.out.println();
    }
}