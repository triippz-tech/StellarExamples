package com.triippztech;

import com.triippztech.models.Transactions;
import com.triippztech.queries.AccountDetails;
import com.triippztech.utils.Notification;
import javafx.util.Pair;
import org.stellar.sdk.KeyPair;

import java.io.IOException;
import java.util.ArrayList;


public class Main  {

    public static void main(String[] args) throws IOException {
        KeyPair keyPair = KeyPair.fromAccountId("GDHX7GSK6T2VPUHECJERKW7PUAZ3X3NHIPFLJSRXZ6IZYNMO3FHHTBAT");
        AccountDetails accountDetails = new AccountDetails(keyPair);

        Pair<String, ArrayList<Transactions>> receivedTransactions =
                accountDetails.getReceivedTransactions(keyPair, null, true);

        for ( Transactions tx : receivedTransactions.getValue())
        {
            System.out.println(tx);
        }
    }
}
