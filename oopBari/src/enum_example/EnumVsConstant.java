package enum_example;

public class EnumVsConstant {
    
    static void enumExample(DayEnum denum) {
        
        if (denum == DayEnum.SAT) {
            System.out.println("e-sat");
        }else if (denum == DayEnum.SUN) {
            System.out.println("e-sun");
        } else if (denum == DayEnum.MON) {
            System.out.println("e-mon");
        } else {
            System.out.println("e-invalid");
        }
    }
    
    static void constantExaple (int i) {
        if (i == DayConstant.SAT) {
            System.out.println("e-sat");
        }else if (i == DayConstant.SUN) {
            System.out.println("e-sun");
        } else if (i == DayConstant.MON) {
            System.out.println("e-mon");
        } else {
            System.out.println("e-invalid");
        }
    }
        
        
    public static void main(String[] args) {
        //enum are fixed so it provides type safety
        enumExample(DayEnum.SAT);
        enumExample(DayEnum.SUN);
        enumExample(DayEnum.MON);
        //enumExample(DayEnum.TUES);
        
        System.out.println();
        
        constantExaple(1);
        constantExaple(2);
        constantExaple(3);
        constantExaple(4);
    }
}
