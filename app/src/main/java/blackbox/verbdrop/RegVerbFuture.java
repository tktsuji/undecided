package blackbox.verbdrop;

/**
 *  Regular Future Indicative.
 */
public class RegVerbFuture extends Verb {

    public RegVerbFuture(String inEnglish, String spInfinitive) {
        super(inEnglish, spInfinitive);
        verbTense = "future";
    }

    public String getYo() {
        return (spInfinitive + "é");

    }

    public String getTu() {
        return (spInfinitive + "ás");
    }

    public String getUsted() {
        return (spInfinitive + "á");
    }

    public String getNosotros() {
        return (spInfinitive + "emos");
    }

    public String getUstedes() {
        return (spInfinitive + "án");
    }

    public String getI() {
        return inEnglish;
    }
    public String getYou() {
        return inEnglish;
    }
    public String getHeShe() {
        return inEnglish;
    }
    public String getWe() {
        return inEnglish;
    }
    public String getThey() {
        return inEnglish;
    }
}
