package dhbw.fowler2.theatre;

import java.text.NumberFormat;
import java.util.Locale;

public class PlainTextStatement implements StatementInterface{


    @Override
    public String print(Invoice invoice, StatementPrinter sp) {

        var totalAmount = 0;
        var volumeCredits = 0;
        var result = String.format("Statement for %s\n", invoice.customer);

        NumberFormat frmt = NumberFormat.getCurrencyInstance(Locale.US);

        for (var perf : invoice.performances) {

            volumeCredits += sp.volumeCreditsFor(perf);

            // print line for this order
            result += String.format("  %s: %s (%s seats)\n", sp.playReturner(perf).name, frmt.format(sp.amountFor(perf) / 100), perf.audience);
            totalAmount += sp.amountFor(perf);
        }
        result += String.format("Amount owed is %s\n", frmt.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }
}
