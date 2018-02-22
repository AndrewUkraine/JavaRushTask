package com.javarush.task.task26.task2613.command;


import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.ResourceBundle;


/**
 * Created by AndrewUkraine on 05.12.2017.
 */
class LoginCommand implements Command {

    private ResourceBundle validCreditCards = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + ".verifiedCards");
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + ".login_en");

//            "вава",CashMachine.class.getPackage(), getverifiedCards.properties);

    @Override
    public void execute() throws InterruptOperationException
    {
       ConsoleHelper.writeMessage(res.getString("before"));
        while (true)
        {
            ConsoleHelper.writeMessage(res.getString("specify.data"));
            String s1 = ConsoleHelper.readString();
            String s2 = ConsoleHelper.readString();
            if (validCreditCards.containsKey(s1))
            {
                if (validCreditCards.getString(s1).equals(s2))
                    ConsoleHelper.writeMessage(String.format(res.getString("success.format"), s1));
                else
                {
                    ConsoleHelper.writeMessage(String.format(res.getString("not.verified.format"), s1));
                    ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));

                    continue;
                }
            }
            else
            {
                ConsoleHelper.writeMessage(String.format(res.getString("not.verified.format"), s1));
                ConsoleHelper.writeMessage(res.getString("try.again.with.details"));

                continue;
            }


            break;
        }

    }
}

  /* private String CARD_NUMBER = "123456789012";
    private String CARD_PIN = "1234";
    String cardNumber, cardPinNumber;

    @Override
    public void execute() throws InterruptOperationException {

        while(true){
            ConsoleHelper.writeMessage("Input card number and PIN number: ");
            cardNumber = ConsoleHelper.readString();
            cardPinNumber = ConsoleHelper.readString();

            try
            {
                if( cardNumber.length() != 12 ||  cardPinNumber.length() != 4){
                    ConsoleHelper.writeMessage("try.again.with.details");
                    continue;
                }

                String s_exit=ConsoleHelper.readString();

                if (s_exit.equalsIgnoreCase("exit")){
                throw  new InterruptOperationException();}
                {
                    break;

                } else  ConsoleHelper.writeMessage("Credit card [%s] is not verified");
                continue;
            }
            catch (Exception e)
            {
            }
            ConsoleHelper.writeMessage("try.again.or.exit");
        }
        ConsoleHelper.writeMessage("success.format");
    }

}
*/

//    private String CARD_NUMBER = "123456789012";
//    private String CARD_PIN = "1234";
//    String cardNumber, cardPinNumber;
//
//
//    @Override
//    public void execute() throws InterruptOperationException {
//        while (true) {
//            ConsoleHelper.writeMessage("Input card number and PIN number: ");
//            cardNumber = ConsoleHelper.readString();
//            cardPinNumber = ConsoleHelper.readString();
//            if (CARD_NUMBER !=cardNumber && CARD_PIN !=cardPinNumber) {
//                ConsoleHelper.writeMessage("Invalid card number or PIN.");
//                continue;
//            }
//            String s_exit = ConsoleHelper.readString();
//            if (s_exit.equalsIgnoreCase("exit")) {
//                throw new InterruptOperationException();
//            }
//        }
//
//
//    }
//}