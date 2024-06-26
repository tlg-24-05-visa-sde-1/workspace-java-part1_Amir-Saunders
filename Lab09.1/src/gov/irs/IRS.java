/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package gov.irs;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
    private TaxPayer[] payers = new TaxPayer[100];
    private int currentIndex = 0;  // for dealing with the array

    public void collectTaxes() {
        for (int i = 0; i < currentIndex; i++) {
            double deduction = payers[i].getStandardDeduction();
        /*   The ggetStandardDeduction method comes from the TaxPayer interface and payers is an array of texpayers so it has access to the methods in the TaxPayer  interface.*/
            System.out.println("Tax payers deduction is " + deduction);
            payers[i].payTaxes();
//            payers[i].getName();
//            You can't do getname becasue the interface taxpapers does not have a get name method'

        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {
        payers[currentIndex++] = payer;
    }
}