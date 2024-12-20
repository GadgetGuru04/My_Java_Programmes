class Student {
    public void makeNoise() {
        System.out.println("Student is making noise!");
    }
}

class SEM3 extends Student {
    @Override
    public void makeNoise() {
        System.out.println("SEM3 student is making noise!");
    }
}

class SEM5 extends Student {
    @Override
    public void makeNoise() {
        System.out.println("SEM5 student is making noise!");
    }
}

public static class makeNoise {
    public static void main(String[] args) {
        Student student1 = new SEM3();  
        Student student2 = new SEM5();  

        student1.makeNoise();  
        student2.makeNoise();  
    }
}
