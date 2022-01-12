package banks;



public class Test {
    public static void main(String[] args) {


            NicAsia na = new NicAsia();
            na.name = "Jam";
            na.address = "New Road";
            na.Locker=true;
            na.interest=2f;
            na.rateOfInterest = na.fixedDeposit+na.interest;

            System.out.println("NIC ASIA");
            System.out.println("--------");
            System.out.println("Name : " + na.name);
            System.out.println("Rate of Interest " + na.rateOfInterest);
            System.out.println("Address :"+na.address);
            System.out.println("");

            GlobalIme gi = new GlobalIme();
            gi.name="RAM";
            gi.CreditCard=true;
            gi.interest=2.5f;
            gi.rateOfInterest = gi.fixedDeposit + gi.interest;
            gi.address = "BabarMahal";

            System.out.println(" Global Ime");
            System.out.println("------------");
            System.out.println("Name : "+gi.name);
            System.out.println("Rate of Interest " + gi.rateOfInterest);
            System.out.println("Address :"+gi.address);
            System.out.println("");

            Everest ev = new Everest();
            ev.name ="Bun";
            ev.GoldenCard = true;
            ev.interest=3f;
            ev.rateOfInterest = ev.fixedDeposit+ ev.interest;
            ev.address="Baneshwor";

            System.out.println("Everest");
            System.out.println("--------------");
            System.out.println("Name : "+ev.name);
            System.out.println("Rate of Interest :"+ ev.rateOfInterest);
            System.out.println("Address :"+ev.address);

    }
}
