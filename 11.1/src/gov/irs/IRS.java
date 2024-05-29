/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package gov.irs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
//    private TaxPayer[] payers = new TaxPayer[100];
//    private int currentIndex = 0;  // for dealing with the array
    private Collection<TaxPayer> taxPay = new ArrayList<>();


    public void collectTaxes() {
        for (TaxPayer taxP : taxPay) {
            double deduction = taxP.getStandardDeduction();
        /*   The ggetStandardDeduction method comes from the TaxPayer interface and payers is an array of texpayers so it has access to the methods in the TaxPayer  interface.*/
            System.out.println("Tax payers deduction is " + deduction);
            taxP.payTaxes();
//            payers[i].getName();

        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {
        taxPay.add(payer);
//        collections and array list have methods like add that you can use to add things to the collection
    }
}