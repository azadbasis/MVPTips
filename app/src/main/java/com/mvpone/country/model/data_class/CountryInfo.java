
package com.mvpone.country.model.data_class;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryInfo implements Parcelable
{

    @SerializedName("country_id")
    @Expose
    private String countryId;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("country_iso_code_2")
    @Expose
    private String countryIsoCode2;
    @SerializedName("country_iso_code_3")
    @Expose
    private String countryIsoCode3;
    @SerializedName("country_phone_code")
    @Expose
    private String countryPhoneCode;
    @SerializedName("country_address_format")
    @Expose
    private String countryAddressFormat;
    @SerializedName("country_postcode_required")
    @Expose
    private String countryPostcodeRequired;
    @SerializedName("country_status")
    @Expose
    private String countryStatus;
    private final static long serialVersionUID = -6390905015554247354L;

    protected CountryInfo(Parcel in) {
        countryId = in.readString();
        countryName = in.readString();
        countryIsoCode2 = in.readString();
        countryIsoCode3 = in.readString();
        countryPhoneCode = in.readString();
        countryAddressFormat = in.readString();
        countryPostcodeRequired = in.readString();
        countryStatus = in.readString();
    }

    public static final Creator<CountryInfo> CREATOR = new Creator<CountryInfo>() {
        @Override
        public CountryInfo createFromParcel(Parcel in) {
            return new CountryInfo(in);
        }

        @Override
        public CountryInfo[] newArray(int size) {
            return new CountryInfo[size];
        }
    };

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryIsoCode2() {
        return countryIsoCode2;
    }

    public void setCountryIsoCode2(String countryIsoCode2) {
        this.countryIsoCode2 = countryIsoCode2;
    }

    public String getCountryIsoCode3() {
        return countryIsoCode3;
    }

    public void setCountryIsoCode3(String countryIsoCode3) {
        this.countryIsoCode3 = countryIsoCode3;
    }

    public String getCountryPhoneCode() {
        return countryPhoneCode;
    }

    public void setCountryPhoneCode(String countryPhoneCode) {
        this.countryPhoneCode = countryPhoneCode;
    }

    public String getCountryAddressFormat() {
        return countryAddressFormat;
    }

    public void setCountryAddressFormat(String countryAddressFormat) {
        this.countryAddressFormat = countryAddressFormat;
    }

    public String getCountryPostcodeRequired() {
        return countryPostcodeRequired;
    }

    public void setCountryPostcodeRequired(String countryPostcodeRequired) {
        this.countryPostcodeRequired = countryPostcodeRequired;
    }

    public String getCountryStatus() {
        return countryStatus;
    }

    public void setCountryStatus(String countryStatus) {
        this.countryStatus = countryStatus;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(countryId);
        dest.writeString(countryName);
        dest.writeString(countryIsoCode2);
        dest.writeString(countryIsoCode3);
        dest.writeString(countryPhoneCode);
        dest.writeString(countryAddressFormat);
        dest.writeString(countryPostcodeRequired);
        dest.writeString(countryStatus);
    }
}
