/**
 * This class takes in inputs
 */
public class AutoPolicy {
    int accountNumber;
    String makeAndModel;
    String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        if(state == "CT" || state == "MA" || state == "ME" || state == "NY" || state == "NJ" || state == "PA" || state == "VT"){
            this.state = state;
        }else{
            System.out.println("Please enter a valid state in 2 letters abbreviations");
        }
    }

    public String getState() {
        return state;
    }

//    public boolean isNoFaultState(){
//        return (state == "MA" || state == "NJ" || state == "NY" || state == "PA");
//    }瞧，不用switch，多简单！就两行code

    //用一下switch， 以string为case label
    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (state) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
        }
        return noFaultState;
    }

}
