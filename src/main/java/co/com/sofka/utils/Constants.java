package co.com.sofka.utils;


import co.com.sofka.utils.exceptions.FalloEnPrueba;


import static co.com.sofka.utils.PropertiesManager.getValue;

public class Constants {

    private Constants() {throw new IllegalStateException("Utility class");}

    public static String getApplicationUrl(String application)
    {
        if ("saucedemo".equals(application)) {
            return getValue("urlSauce");
        }
        throw new FalloEnPrueba("Fallo seleccionando application");
    }
}
