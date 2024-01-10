import java.util.Scanner;

public class FullDateConverter {

    public void task1() {
        //2021-03-12
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a short date in the format YYYY-MM-DD ");
        String inputDate = scanner.nextLine();
        String yyyy = inputDate.substring(0,4);
        String mm = inputDate.substring(5,7);
        String dd = inputDate.substring(8,10);

        if(mm.equals("01")){
            mm="January";
            System.out.println(mm+" "+dd+" "+yyyy);
        }
        else if(mm.equals("02")){
            mm="February";
            System.out.println(mm+" "+dd+" "+yyyy);
        }
         else if(mm.equals("03")){
            mm="March ";
            System.out.println(mm+" "+dd+" "+yyyy);
        } else if(mm.equals("04")){
            mm="April ";
            System.out.println(mm+" "+dd+" "+yyyy);
        } else if(mm.equals("05")){
            mm="May";
            System.out.println(mm+" "+dd+" "+yyyy);
        } else if(mm.equals("06")){
            mm="June";
            System.out.println(mm+" "+dd+" "+yyyy);
        } else if(mm.equals("07")){
            mm="July";
            System.out.println(mm+" "+dd+" "+yyyy);
        }else if(mm.equals("08")){
            mm="August";
            System.out.println(mm+" "+dd+" "+yyyy);
        }
         else if(mm.equals("09")){
            mm="September";
            System.out.println(mm+" "+dd+" "+yyyy);
        } else if(mm.equals("10")){
            mm="October";
            System.out.println(mm+" "+dd+" "+yyyy);
        } else if(mm.equals("11")){
            mm="November";
            System.out.println(mm+" "+dd+" "+yyyy);
        }
         else if(mm.equals("12")){
            mm="December";
            System.out.println(mm+" "+dd+" "+yyyy);
        };

    }
}
