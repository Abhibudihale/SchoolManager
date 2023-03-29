public class Batch {
    private int btcID;
    private String btcName;
    private int btcMode;
//---------------------------------------------------------


    public Batch(int btcID, String btcName, int btcMode) {
        this.btcID = btcID;
        this.btcName = btcName;
        this.btcMode = btcMode;
    }

    public Batch() {

    }

    //----------------------------------------------------------
    public int getBtcID() {
        return btcID;
    }

    public void setBtcID(int btcID) {
        this.btcID = btcID;
    }

    public String getBtcName() {
        return btcName;
    }

    public void setBtcName(String btcName) {
        this.btcName = btcName;
    }

    public int isBtcMode() {
        return btcMode;
    }

    public void setBtcMode(int btcMode) {
        this.btcMode = btcMode;
    }
}
