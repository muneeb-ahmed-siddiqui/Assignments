package LineAssignment;
class MainLine {
    public static void main(String[] args) {
        Point iP = new Point(2,3);
        Point fP = new Point(5,7);
        Line line1 = new Line(iP,fP);
        System.out.println(line1);
    }
}