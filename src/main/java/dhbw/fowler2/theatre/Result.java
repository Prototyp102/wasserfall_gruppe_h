package dhbw.fowler2.theatre;

public abstract class Result {
    int result;
    public abstract int getResult(Performance perf);

}
class TragicalResult extends Result {
    public int getResult(Performance perf) {
        result = 40000;
        if (perf.audience > 30) {
            result += 1000 * (perf.audience - 30);
        }
        return result;
    }
}
class ComedicResult extends Result {
    public int getResult(Performance perf) {
        result = 30000;
        if (perf.audience > 20) {
            result += 10000 + 500 * (perf.audience - 20);
        }
        result += 300* perf.audience;
        return result;
    }
}

class HistoricalResult extends Result {
    public int getResult(Performance perf) {
        result = 25000;
        if (perf.audience > 40) {
            result += 7482 + 500 * (perf.audience - 20);
        }
        return result;
    }
}
class PastoralResult extends Result {
    public int getResult(Performance perf) {
        result = 2500;
        if (perf.audience > 100) {
            result += 13500 + 400 * (perf.audience - 20);
        }
        result += 150 * perf.audience;
        return result;
    }
}
class PastoralComicalResult extends Result {
    public int getResult(Performance perf) {
        result = 8000;
        if (perf.audience > 20) {
            result += 15000 + 120 * (perf.audience - 20);
        }
        return result;
    }
}
class HistoricalPastoralResult extends Result {
    public int getResult(Performance perf) {
        result = 9500;
        if (perf.audience > 10) {
            result += 750 + 169 * (perf.audience - 20);
        }
        return result;
    }
}
class TragicalHistoricalResult extends Result {
    public int getResult(Performance perf) {
        result = 13500;
        if (perf.audience > 50) {
            result += 2380 + 200 * (perf.audience - 20);
        }
        return result;
    }
}
class TragicalComicalHistoricalPastoralResult extends Result {
    public int getResult(Performance perf) {
        result = 50000;
        if (perf.audience > 20) {
            result += 12500 + 400 * (perf.audience - 20);
        }
        result += 250* perf.audience;
        return result;
    }
}
class SceneIndividableResult extends Result {
    public int getResult(Performance perf) {
        result = 6900;
        if (perf.audience > 20) {
            result += 1337 + 420 * (perf.audience - 20);
        }
        result += 69 * perf.audience;
        return result;
    }
}
class PoemUnlimitedResult extends Result {
    public int getResult(Performance perf) {
        result = 35000;
        if (perf.audience > 5) {
            result += 7200 + 291 * (perf.audience - 20);
        }
        return result;
    }
}