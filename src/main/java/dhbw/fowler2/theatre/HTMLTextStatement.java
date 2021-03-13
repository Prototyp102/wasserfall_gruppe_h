package dhbw.fowler2.theatre;

import java.text.NumberFormat;
import java.util.Locale;

public class HTMLTextStatement implements StatementInterface{

    @Override
    public String print(Invoice invoice, StatementPrinter sp) {


        var totalAmount = 0;
        var volumeCredits = 0;
        var result = String.format("<h1> Statement for %s\n</h1>", invoice.customer);

        NumberFormat frmt = NumberFormat.getCurrencyInstance(Locale.US);

        for (var perf : invoice.performances) {

            volumeCredits += sp.volumeCreditsFor(perf);

            // print line for this order
            result += String.format("<i>  %s: %s (%s seats)\n</i><br>", sp.playReturner(perf).name, frmt.format(sp.amountFor(perf) / 100), perf.audience);
            totalAmount += sp.amountFor(perf);
        }
        result += String.format("<p>Amount owed is %s\n</p>", frmt.format(totalAmount / 100));
        result += String.format("<p>You earned %s credits\n</p>", volumeCredits);
        return result;
    }
}
