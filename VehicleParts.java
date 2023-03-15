import java.util.Scanner;

public class VehicleParts {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the year of the car: ");
            String car = scanner.nextLine().toLowerCase().replaceAll(" ", ""); //makes everything lowercase, ignores spaces after input
            System.out.print("Please enter the car make: ");
            String carMake = scanner.nextLine().toLowerCase().replaceAll(" ", "");
            System.out.print("Please enter the car model: ");
            String carModel = scanner.nextLine().toLowerCase().replaceAll(" ", "");
            System.out.println();
            System.out.println("[1] air filter");
            System.out.println("[2] oil filter + oil drain gasket");
            System.out.println("[3] windshield wipers");
            System.out.print("Please choose a corresponding number from above: ");
            String pickWhichItem = scanner.nextLine().toLowerCase().replaceAll(" ", "");
            scanner.close();
//2007 Lexus es350
            if ((car + carMake + carModel + pickWhichItem).equals("2007" + "lexus" + "es350" + "1")) {
                System.out.println();
                System.out.println("AIR FILTER #: 17801-YZZ06");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2007" + "lexus" + "es350" + "2")) {
                System.out.println();
                System.out.println("ENGINE OIL TYPE: (5w-30), OIL CAPACITY: (6 QUARTS), OIL FILTER #: (04152-YZZA1), OIL DRAIN GASKET #: (90430-12031)");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2007" + "lexus" + "es350" + "3")) {
                System.out.println();
                System.out.println("WINDSHIELD WIPERS (L:24) #:(85214-06140)  (R:20) #:(85214-30390)");
            }
//2009 Toyota Camry
            if ((car + carMake + carModel + pickWhichItem).equals("2009" + "toyota" + "camry" + "1")) {
                System.out.println();
                System.out.println("AIR FILTER #: 17801-YZZ02");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2009" + "toyota" + "camry" + "2")) {
                System.out.println();
                System.out.println("ENGINE OIL TYPE IS 5w-20, OIL FILTER #: 90915-YZZF1");
            }  else if ((car + carMake + carModel + pickWhichItem).equals("2009" + "toyota" + "camry" + "3")) {
                System.out.println();
                System.out.println("WINDSHIELD WIPERS (L:24) #:(85214-06140)  (R:20) #:(12204-28030)");
            }
//2013 Lexus GS350
            if ((car + carMake + carModel + pickWhichItem).equals("2013" + "lexus" + "gs350" + "1")) {
                System.out.println();
                System.out.println("AIR FILTER #: 17801-31170");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2013" + "lexus" + "gs350" + "2")) {
                System.out.println();
                System.out.println("ENGINE OIL TYPE IS 0w-20, OIL FILTER #: 04152-YZZA5");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2013" + "lexus" + "gs350" + "3")) {
                System.out.println();
                System.out.println("WINDSHIELD WIPERS (L:26) #:(85214-0T050)  (R:20) #:(85214-0E130)");
            }
//2013 Lexus ES350
            if ((car + carMake + carModel + pickWhichItem).equals("2013" + "lexus" + "es350" + "1")) {
                System.out.println();
                System.out.println("AIR FILTER #: 17801-YZZ06");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2013" + "lexus" + "es350" + "2")) {
                System.out.println();
                System.out.println("ENGINE OIL TYPE IS 0w-20, OIL FILTER #: 04152-YZZA1");
            }
//2016 Toyota Sienna
            if ((car + carMake + carModel + pickWhichItem).equals("2016" + "toyota" + "sienna" + "1")) {
                System.out.println();
                System.out.println("AIR FILTER #: 17801-0P051");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2016" + "toyota" + "sienna" + "2")) {
                System.out.println();
                System.out.println("ENGINE OIL TYPE IS 0w-20, OIL FILTER #: 04152-YZZA1");
            }
//2016 Toyota Rav4
            if ((car + carMake + carModel + pickWhichItem).equals("2016" + "toyota" + "rav4" + "1")) {
                System.out.println();
                System.out.println("AIR FILTER #: 17801-37021");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2016" + "toyota" + "rav4" + "2")) {
                System.out.println();
                System.out.println("ENGINE OIL TYPE IS 0w-20, OIL FILTER #: 04152-YZZA1");
            }
//2016 Honda Odyssey
            if ((car + carMake + carModel + pickWhichItem).equals("2020" + "honda" + "odyssey" + "1")) {
                System.out.println();
                System.out.println("AIR FILTER #: 17220-5J6-A10");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2020" + "honda" + "oddysey" + "2")) {
                System.out.println();
                System.out.println("ENGINE OIL TYPE IS 0w-20, OIL FILTER #: 15400-PLM-A02");
            }
//2013 Honda Accord
            if ((car + carMake + carModel + pickWhichItem).equals("2013" + "honda" + "accord" + "1")) {
                System.out.println();
                System.out.println("AIR FILTER #: 17220-5A2-A00");
            } else if ((car + carMake + carModel + pickWhichItem).equals("2013" + "honda" + "accord" + "2")) {
                System.out.println();
                System.out.println("ENGINE OIL TYPE IS 0w-20, OIL FILTER #: 15400-PLM-A02");
            }
        }
    }
