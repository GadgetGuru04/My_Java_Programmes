public class CopyConst {
    CopyConst() {
        System.out.println("In Default Constructor");
    }

    CopyConst(CopyConst c) {
        System.out.println("In Copy Constructor");
    }

    public static void main(String[] args) {
        CopyConst obj1 = new CopyConst();

        CopyConst obj2 = new CopyConst(obj1);
    }
}
