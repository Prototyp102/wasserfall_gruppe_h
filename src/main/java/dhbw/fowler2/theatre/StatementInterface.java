package dhbw.fowler2.theatre;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public interface StatementInterface {
    public String print(Invoice invoice, StatementPrinter sp);

}
