package dhbw.fowler2.theatre;

import dhbw.fowler2.theatre.Play;
import dhbw.fowler2.theatre.Performance;
import dhbw.fowler2.theatre.StatementPrinter;
import dhbw.fowler2.theatre.Invoice;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class StatementPrinterTest {

    @Test
    public void printsStatements() {
        TragedyPlay hamlet = new TragedyPlay("Hamlet");
        ComedyPlay asYouLikeIt = new ComedyPlay("As You Like It");
        TragedyPlay othello = new TragedyPlay("Othello");
        Map<String, Play> plays = Map.of("hamlet", hamlet,
                "as-like", asYouLikeIt,
                "othello", othello);

        Invoice invoice = new Invoice("BigCo", List.of(new Performance(hamlet, 55),
                new Performance(asYouLikeIt, 35),
                new Performance(othello, 40)));

        StatementPrinter statementPrinter = new StatementPrinter();
        var result = statementPrinter.print(invoice, plays);

        Assert.assertEquals("Statement print mismatch", "Statement for BigCo\n" +
                "  Hamlet: $650.00 (55 seats)\n" +
                "  As You Like It: $580.00 (35 seats)\n" +
                "  Othello: $500.00 (40 seats)\n" +
                "Amount owed is $1,730.00\n" +
                "You earned 47 credits\n", result);
    }

}
