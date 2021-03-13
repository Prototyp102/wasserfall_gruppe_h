package dhbw.fowler2.theatre;

public abstract class Play {

    public int result;
    public String name;

    public Play(String name) {
        this.name = name;
    }

    public abstract int getResult(Performance perf);
}

class TragedyPlay extends Play {
    public TragedyPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 40000;
        if (perf.audience > 30) {
            result += 1000 * (perf.audience - 30);
        }
        return result;
    }
}
class ComedyPlay extends Play {
    public ComedyPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 30000;
        if (perf.audience > 20) {
            result += 10000 + 500 * (perf.audience - 20);
        }
        result += 300* perf.audience;
        return result;
    }
}

class HistoryPlay extends Play {

    public HistoryPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 25000;
        if (perf.audience > 40) {
            result += 7482 + 500 * (perf.audience - 20);
        }
        return result;
    }
}
class PastoricalPlay extends Play {
    public PastoricalPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 2500;
        if (perf.audience > 100) {
            result += 13500 + 400 * (perf.audience - 20);
        }
        result += 150 * perf.audience;
        return result;
    }
}
class PastoralComicalPlay extends Play {
    public PastoralComicalPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 8000;
        if (perf.audience > 20) {
            result += 15000 + 120 * (perf.audience - 20);
        }
        return result;
    }
}
class HistoricalPastoralPlay extends Play {
    public HistoricalPastoralPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 9500;
        if (perf.audience > 10) {
            result += 750 + 169 * (perf.audience - 20);
        }
        return result;
    }
}
class TragicalHistoricalPlay extends Play {
    public TragicalHistoricalPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 13500;
        if (perf.audience > 50) {
            result += 2380 + 200 * (perf.audience - 20);
        }
        return result;
    }
}
class TragicalComicalHistoricalPastoralPlay extends Play {
    public TragicalComicalHistoricalPastoralPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 50000;
        if (perf.audience > 20) {
            result += 12500 + 400 * (perf.audience - 20);
        }
        result += 250* perf.audience;
        return result;
    }
}
class SceneIndividablePlay extends Play {
    public SceneIndividablePlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 6900;
        if (perf.audience > 20) {
            result += 1337 + 420 * (perf.audience - 20);
        }
        result += 69 * perf.audience;
        return result;
    }
}
class PoemUnlimitedPlay extends Play {
    public PoemUnlimitedPlay(String name) {
        super(name);
    }

    public int getResult(Performance perf) {
        result = 35000;
        if (perf.audience > 5) {
            result += 7200 + 291 * (perf.audience - 20);
        }
        return result;
    }
}
