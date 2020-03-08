
package com.mvpone.category.model.data_class;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class About implements Serializable, Parcelable
{

    @SerializedName("href")
    @Expose
    private String href;
    public final static Creator<About> CREATOR = new Creator<About>() {


        @SuppressWarnings({
            "unchecked"
        })
        public About createFromParcel(Parcel in) {
            return new About(in);
        }

        public About[] newArray(int size) {
            return (new About[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2318130624463768995L;

    protected About(Parcel in) {
        this.href = ((String) in.readValue((String.class.getClassLoader())));
    }

    public About() {
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
