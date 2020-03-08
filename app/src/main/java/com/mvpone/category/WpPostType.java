
package com.mvpone.category;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpPostType implements Serializable, Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<WpPostType> CREATOR = new Creator<WpPostType>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WpPostType createFromParcel(Parcel in) {
            return new WpPostType(in);
        }

        public WpPostType[] newArray(int size) {
            return (new WpPostType[size]);
        }

    }
    ;
    private final static long serialVersionUID = -1752948501661782769L;

    protected WpPostType(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WpPostType() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(href);
    }

    public int describeContents() {
        return  0;
    }

}
