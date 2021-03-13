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
                result = new TragicalResult().getResult(perf);
                break;
            case "comedy":
                result = new ComedicResult().getResult(perf);
                break;
            case "history":
                result = new HistoricalResult().getResult(perf);
                break;
            case "pastoral-comical":
                result = new PastoralComicalResult().getResult(perf);
                break;
            case "historical-pastoral":
                result = new HistoricalPastoralResult().getResult(perf);
                break;
            case "tragicalhistorical":
                result = new TragicalHistoricalResult().getResult(perf);
                break;
            case "tragical-comical-historical-pastoral":
                result = new TragicalComicalHistoricalPastoralResult().getResult(perf);
                break;
            case "scene-individable":
                result = new SceneIndividableResult().getResult(perf);
                break;
            case "poem-unlimited":
                result = new PoemUnlimitedResult().getResult(perf);
                break;
            default:
                throw new Error("unknown type: " + play.type);

        }
        return result;
    }
}
