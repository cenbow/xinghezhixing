package hasoffer.core.bo.user;

/**
 * Date : 2016/1/21
 * Function :
 */
public class DayVisitBo {

    private String ymd;



    private long aliveDevice; // 活着的设备
    private long aliveDeviceWithShop; // 活着的设备中装有电商APP的

    private long newDevice;// 新增设备
    private long newDeviceWithShop;//新增设备中装有电商APP的

    private long visitDevice;// 当日访问过的设备 - 一定有电商app - /cmp/getcmpskus
    private long visitDeviceNew;// 当日访问过的设备中 新设备数量

    public DayVisitBo(String ymd) {
        this.ymd = ymd;
        aliveDevice = 0L;
        aliveDeviceWithShop = 0L;

        newDevice = 0L;
        newDeviceWithShop = 0L;

        visitDevice = 0L;
        visitDeviceNew = 0L;
    }

    public String getYmd() {
        return ymd;
    }

    public void setYmd(String ymd) {
        this.ymd = ymd;
    }

    public long getAliveDevice() {
        return aliveDevice;
    }

    public void setAliveDevice(long aliveDevice) {
        this.aliveDevice = aliveDevice;
    }

    public long getAliveDeviceWithShop() {
        return aliveDeviceWithShop;
    }

    public void setAliveDeviceWithShop(long aliveDeviceWithShop) {
        this.aliveDeviceWithShop = aliveDeviceWithShop;
    }

    public long getNewDevice() {
        return newDevice;
    }

    public void setNewDevice(long newDevice) {
        this.newDevice = newDevice;
    }

    public long getNewDeviceWithShop() {
        return newDeviceWithShop;
    }

    public void setNewDeviceWithShop(long newDeviceWithShop) {
        this.newDeviceWithShop = newDeviceWithShop;
    }

    public long getVisitDevice() {
        return visitDevice;
    }

    public void setVisitDevice(long visitDevice) {
        this.visitDevice = visitDevice;
    }

    public long getVisitDeviceNew() {
        return visitDeviceNew;
    }

    public void setVisitDeviceNew(long visitDeviceNew) {
        this.visitDeviceNew = visitDeviceNew;
    }

}
