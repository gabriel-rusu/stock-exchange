package utils;

import java.util.*;
import javax.swing.*;

public class Utils {
    private static final String PLOT_FORMAT = ".jpg";
    private static final String CHARTS_PATH = "charts/";
    static Map<String, String> countriesInitials = new HashMap<>();
    static Map<String, String> monthsInitials = new HashMap<>();

    static {
        countriesInitials.put("Italy", "ity");
        countriesInitials.put("Germany", "ger");
        countriesInitials.put("France", "fra");

        monthsInitials.put("1 month", "1m");
        monthsInitials.put("3 months", "3m");
        monthsInitials.put("6 months", "6m");
        monthsInitials.put("9 months", "9m");
        monthsInitials.put("12 months", "12m");
    }

    private Utils() {
    }

    public static ImageIcon loadImageIcon(String image) {
        return new ImageIcon(Utils.class.getClassLoader().getResource(image).getPath());
    }

    public static ImageIcon loadChart(String countryName, String months) {
        String countryInitial = countriesInitials.get(countryName);
        String monthInitial = monthsInitials.get(months);
        return loadImageIcon(CHARTS_PATH + countryInitial + monthInitial + PLOT_FORMAT);
    }
}
