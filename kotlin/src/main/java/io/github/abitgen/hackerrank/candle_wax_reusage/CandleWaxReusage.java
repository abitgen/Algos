package io.github.abitgen.hackerrank.candle_wax_reusage;

public class CandleWaxReusage {
    static int getTotalCandlesBurnt(int amount, int costOfCandle, int noOfResidueCandles) {
        int totalCandles = amount/costOfCandle;
        int newCandlesFromResidue = 0;
        int remCandles = totalCandles;
        int allResidueCandlesCount = 0;

        System.out.println("");

        while((remCandles + newCandlesFromResidue)/noOfResidueCandles > 0){

            String residueCandleAvailable = "";
            if(newCandlesFromResidue > 0){
                residueCandleAvailable = " and %d residue candle";
            }

            System.out.print( "Using : "+noOfResidueCandles+" from "+(remCandles)+" total candles"+String.format(residueCandleAvailable, newCandlesFromResidue));
            newCandlesFromResidue = (newCandlesFromResidue + remCandles)/noOfResidueCandles;
            remCandles = remCandles - noOfResidueCandles;
            if(remCandles > 0)
                System.out.print(" | Remaining : "+remCandles);

            System.out.println(" | Residue Candle Formed : "+newCandlesFromResidue);

            allResidueCandlesCount += newCandlesFromResidue;
        }

        return totalCandles + allResidueCandlesCount;
    }

    public static void main(String[] args) {
        System.out.println("Total Candles Burnt => "+getTotalCandlesBurnt(6, 2, 2));
    }
}
