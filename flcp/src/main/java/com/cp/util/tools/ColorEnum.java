package com.cp.util.tools;

public enum ColorEnum {
    RED("红","#FF0000"),BULE("蓝","#0000FF"),GREEN("绿","#008000");
    private String colorName;
    private String colorCode;

    private ColorEnum(String  colorName,String colorCode){
        this.colorName = colorName;
        this.colorCode = colorCode;
    }

    /**
     *
     * @return
     */
    public static String getColorCode(String  colorName){
        ColorEnum[] arr = ColorEnum.values();
        for (ColorEnum colorEnum : arr){
            if(colorEnum.colorName.equals(colorName)){
                return colorEnum.colorCode;
            }
        }
        return "";
    }

    public String getColorName() {
        return colorName;
    }

    public String getColorCode() {
        return colorCode;
    }
}
