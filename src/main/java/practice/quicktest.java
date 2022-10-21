package practice;

public class quicktest {
    private String className = this.getClass().getSimpleName();
    public static void main(String[] args) {
        quicktest quicktest = new quicktest();
        //System.out.println(quicktest.className);
        Double aDouble = new Double(222);
        Double[] dArrary1 = new Double[20];
        dArrary1[0] = aDouble;
        dArrary1[1] = aDouble;
        dArrary1[2] = aDouble;
        dArrary1[3] = aDouble;

        aDouble = new Double(22);

        //System.out.println(dArrary1 + "");
        String containsCheck = "test contains";
        if (containsCheck.toLowerCase().contains("contains")){
            System.out.println("contains");
        }else {
            System.out.println("not contains");
        }
    }
}
