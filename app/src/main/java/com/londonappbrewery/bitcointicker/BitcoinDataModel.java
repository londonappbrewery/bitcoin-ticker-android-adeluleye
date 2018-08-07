package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Currency;

public class BitcoinDataModel {

    // TODO: Declare the member variables here
    private double mAskValue;
    private double mBidValue;



    // TODO: Create a WeatherDataModel from a JSON:

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try {

            BitcoinDataModel bitcoinData = new BitcoinDataModel();

            bitcoinData.mAskValue = jsonObject.getDouble("ask");
            bitcoinData.mBidValue = jsonObject.getDouble("bid");

            return bitcoinData;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }


    // TODO: Create getter methods for temperature, city, and icon name:


    public double getAskValue() {
        return mAskValue;
    }

    public double getBidValue() {
        return mBidValue;
    }

    public static String getCurrencySymbol(String countryCode) {
        // Locale locale = new Locale("", countryCode);
        Currency currency = Currency.getInstance(countryCode);
        return currency.getSymbol();
    }
}
