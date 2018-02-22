package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.Operation;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by AndrewUkraine on 30.11.2017.
 */
 public  class CommandExecutor {

  private final static   Map<Operation, Command> allKnownCommandsMap ;

    static {
        allKnownCommandsMap = new HashMap<>();
        allKnownCommandsMap.put(Operation.INFO, (Command) new InfoCommand());
        allKnownCommandsMap.put(Operation.DEPOSIT, (Command) new DepositCommand());
        allKnownCommandsMap.put(Operation.WITHDRAW, (Command) new WithdrawCommand());
        allKnownCommandsMap.put(Operation.EXIT, (Command) new ExitCommand());
        allKnownCommandsMap.put(Operation.LOGIN, (Command) new LoginCommand ());
    }

    public static final void execute(Operation operation) throws InterruptOperationException {
        allKnownCommandsMap.get(operation).execute();
    }


    private CommandExecutor() {
    }
}
