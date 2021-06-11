package test;

/**
 * @Author baoguangyu
 * @Date 2021/5/26 18:25
 * @Version 1.0
 */
public class SerialNumber {
    /**
     * 生成规则设备编号:设备类型+五位编号（从1开始，不够前补0）
     *
     * @param equipmentType
     *              设备类型
     * @param equipmentNo
     *              最新设备编号
     * @return
     */
    public static String getNewEquipmentNo(String equipmentType, String equipmentNo){
        String newEquipmentNo = "00001";

        if(equipmentNo != null && !equipmentNo.isEmpty()){
            int newEquipment = Integer.parseInt(equipmentNo) + 1;
            newEquipmentNo = String.format(equipmentType + "%05d", newEquipment);
        }

        return newEquipmentNo;
    }

    public static void main(String[] args) {
        String equipmentNo = getNewEquipmentNo("SYXH", "00032");
        System.out.println("生成设备编号：" + equipmentNo);
    }



}
