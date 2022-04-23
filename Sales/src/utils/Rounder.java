package utils;

public class Rounder extends Validator {
    public static double validatePriceInput(double value, int places ){
      double scale = Math.pow(100, places);
      return Math.round(value * scale) / scale;
    }
}
