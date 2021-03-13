package dhbw.fowler2.theatre;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class StatementPrinter {

    Map<String, Play> plays;


    public String print(Invoice invoice, Map<String, Play> plays) {
        this.plays = plays;
        PlainTextStatement pts = new PlainTextStatement();
        return pts.print(invoice, this);
    }

    public Play playReturner(Performance perf) {
        Play play = plays.get(perf.playID);
        return play;
    }

    public double amountFor(Performance perf) {
        double amount = playReturner(perf).amountFor(perf, playReturner(perf));
        return amount;
    }

    public int volumeCreditsFor(Performance perf) {
        int volumeCredits = 0;
        volumeCredits +=  Math.max(perf.audience -30, 0);
        if("comedy" == playReturner(perf).type) {
            volumeCredits += Math.floor(perf.audience / 5);
        }
        return volumeCredits;
    }

}
