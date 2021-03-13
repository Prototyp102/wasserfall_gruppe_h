package dhbw.fowler2.theatre;

public class Play {

    public String name;
    public String type;

    public Play(String name, String type) {


        this.name = name;
        this.type = type;
    }

    public double amountFor(Performance perf, Play play) {
        int result = 0;
        switch(play.type){
            case "tragedy":
                result = new TragedyResult().getResult(perf);
                break;
            case "comedy":
                result = new ComedyResult().getResult(perf);
                break;
            default:
                throw new Error("unknown type: " + play.type);

        }
        return result;
    }
}
