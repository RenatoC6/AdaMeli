package com.Modulo_2.CalculadoraImcComPOO;


public class ArgsUtil {

    public static String getString(String param, String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals(param) && i + 1 < args.length) {
                return args[i + 1];
            }
        }
        return null;
    }

    public static Double getDouble(String param, String[] args) {
        String value = getString(param, args);
        if (value != null) {
            return Double.parseDouble(value); // parseDouble: converte o parametro de string para double
        }
        return null;
    }

    public static int getInt(String param, String[] args) {
        String value = getString(param, args);
        if(value != null){
            return Integer.parseInt(value);
        }
        return 0;

    }

    public static int getBoolean(String param, String[] args) {
        String value = getString(param, args);

        int validaBoolean = 2;
        String info1 = "true";
        String info2 = "false";

        if(value != null){
            if(value.equals(info1) || value.equals(info2)) {
                if (value.equals(info1))
                    validaBoolean = 0;
                else validaBoolean = 1;
            }
        }
        return validaBoolean;

    }


    public static Double getDouble(String param, String[] args, double defaultValue) {
        Double value = getDouble(param, args);
        return value!=null?value:defaultValue;

    }


    public static String getString(String param, String[] args, String defaultValue) {
        String string = getString(param, args);
        return string!=null?string:defaultValue;

    }



}
