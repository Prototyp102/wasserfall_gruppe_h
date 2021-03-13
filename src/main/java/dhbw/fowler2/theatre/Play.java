package dhbw.fowler2.theatre;

public class Play {

    public String name;
    public String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public double amountFor(Performance aPerformance, Play play) {
        int result = 0;
        switch(play.type){
            case "tragedy":
                result = 40000;
                if(aPerformance.audience > 30) {
                    result += 1000*(aPerformance.audience-30);
                }
                break;
            case "comedy":
                result = 30000;
                if(aPerformance.audience > 20) {
                    result += 10000 + 500*(aPerformance.audience-20);
                }
                result+= 300*aPerformance.audience;
                break;
            default:
                throw new Error("unknown type: " + play.type);

        }
        return result;
    }
}
