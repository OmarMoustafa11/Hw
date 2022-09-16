import static java.util.Collections.reverse;

public class substring {
        public static String printReceipt(String product, int qty, double price, float miles){
            String empty = "";
            double fee;
            double total = qty * price;

            if(miles <= 4){
                //charge them $2
                fee = 2.00;
                //calculate total
                total = total + fee;
            } else if (miles > 4 && miles <=15){
                fee = 5.00;
                total = total + fee;

            } else if(miles > 15 && miles <= 25){
                fee = 10.00;
                total = total + fee;

            } else if (miles > 25 && miles <= 50){
                fee = 15.00;
                total = total + fee;
            }else{
                fee = 20.00;
                total = total + fee;
            }
                //string format
            String variables = String.format("Product %4s Qty %5s  Price %4s Miles %4s Total", empty, empty, empty,empty);
            String dashes = String.format("------ %5s ---- %4s ---- %5s ---- %5s ----", empty, empty,empty, empty);
            String results = String.format("%s %10d %11.1f %10.0f %11.2f", product, qty, price, miles, total);



            //return statement adding all string formats and message

            return variables + "\n"+ dashes + "\n" + results + "\n" + "        Thank You, Come Again!!!!";



        }


        public static void main(String[] args) {
            String returnValue = printReceipt("rice",20, 5.0, 10.0f);
            System.out.println(returnValue);




        }



    }









