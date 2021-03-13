package dhbw.fowler2.theatre;

public abstract class Result {
    int result;
    public abstract int getResult(Performance perf);

}
class TragedyResult extends Result {
    public int getResult(Performance perf) {
        result = 40000;
        if (perf.audience > 30) {
            result += 1000 * (perf.audience - 30);
        }
        return result;
    }
}
class ComedyResult extends Result {
    public int getResult(Performance perf) {
        result = 30000;
        if (perf.audience > 20) {
            result += 10000 + 500 * (perf.audience - 20);
        }
        result += 300* perf.audience;
        return result;
    }
}
