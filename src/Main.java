public class Main {
    public static void main(String[] args) {
        Account sunilAccount = new Account();
        //First Method is setter and getter using

//        sunilAccount.setNumber("9834");
//        sunilAccount.setBalance(10.0);
//        sunilAccount.setCustomerName("sunil");
//        sunilAccount.setCustomerEmailAddress("sunil@gmail.com");
//        sunilAccount.setCustomerPhoneNumber("93047890932");
//        System.out.println(sunilAccount.getNumber());
//        System.out.println(sunilAccount.getBalance());
//        System.out.println(sunilAccount.getCustomerName());

        //Second using in Constructor

        Account maniAccount = new Account("45434",100.0,"Mani","mani@gmail.com","987654365");
        System.out.println(maniAccount.getCustomerName());
        Account velAccount = new Account("vel","vel@gmail.com","1234567");
        System.out.println(velAccount.getCustomerName());



        System.out.println("****************************");
        System.out.println(sunilAccount.getBalance());
        sunilAccount.deposit(100.0);
        sunilAccount.withdraw(51.0);
        sunilAccount.withdraw(100.0);

    }
}
