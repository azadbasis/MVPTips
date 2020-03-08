
package com.mvpone.category.model.data_class;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Self implements Serializable, Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<Self> CREATOR = new Creator<Self>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Self createFromParcel(Parcel in) {
            return new Self(in);
        }

        public Self[] newArray(int size) {
            return (new Self[size]);
        }

    }
    ;
    private final static long serialVersionUID = -8428699731970212503L;

    protected Self(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Self() {
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
