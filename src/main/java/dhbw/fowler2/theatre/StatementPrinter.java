package dhbw.fowler2.theatre;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class StatementPrinter {

    Map<String, Play> plays;

    public String print(Invoice invoice, Map<String, Play> plays) {
        this.plays = plays;

        var totalAmount = 0;
        var volumeCredits = 0;
        var result = String.format("Statement for %s\n", invoice.customer);

        NumberFormat frmt = NumberFormat.getCurrencyInstance(Locale.US);

        for (var perf : invoice.performances) {

            // add volume credits
            volumeCredits += Math.max(perf.audience - 30, 0);
            // add extra credit for every ten comedy attendees
            if ("comedy" == playReturner(perf).type) volumeCredits += Math.floor(perf.audience / 5);

            // print line for this order
            result += String.format("  %s: %s (%s seats)\n", playReturner(perf).name, frmt.format(amountReturner(perf) / 100), perf.audience);
            totalAmount += amountReturner(perf);
        }
        result += String.format("Amount owed is %s\n", frmt.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }

    private Play playReturner(Performance perf) {
        Play play = plays.get(perf.playID);
        return play;
    }

    private double amountReturner(Performance perf) {
        double amount = playReturner(perf).amountFor(perf, playReturner(perf));
        return amount;
    }

}
