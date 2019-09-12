package se.ecutb.cheng;

public enum Denomination {
    one(1),
    five(5),
    ten(10),
    twenty(20),
    fifty(50),
    hundred(100),
    fivehundred(500),
    thousand(1000);

    private int denominationValue;

    private Denomination(int denominationValue) {
        this.denominationValue = denominationValue;
    }

    public int getDenominationValue() {
        return denominationValue;
    }

    public void setDenominationValue(int denominationValue) {
        this.denominationValue = denominationValue;
    }

//    public static Denomination valueOf(int denominationValue){
//        switch (denominationValue){
//            case 1:
//                return one;
//            case 5:
//                return five;
//            case 10:
//                return ten;
//            case 50:
//                return fifty;
//            case 100:
//                return hundred;
//            case 500:
//                return fivehundred;
//            case 1000:
//                return thousand;
//            default:
//                return null;
//        }
//    }
//
//    public int value(){
//        return this.denominationValue;
//    }
}
