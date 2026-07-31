package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes14.dex */
public class xm3 implements gt1 {
    public static final Parcelable.Creator<xm3> CREATOR = new vm3();
    public final String b;
    public final String c;

    public xm3(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // yads.gt1
    public final void a(zl1 zl1Var) {
        String str = this.b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                zl1Var.c = this.c;
                break;
            case "TITLE":
                zl1Var.a = this.c;
                break;
            case "DESCRIPTION":
                zl1Var.g = this.c;
                break;
            case "ALBUMARTIST":
                zl1Var.d = this.c;
                break;
            case "ARTIST":
                zl1Var.b = this.c;
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xm3 xm3Var = (xm3) obj;
        return this.b.equals(xm3Var.b) && this.c.equals(xm3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c4.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b);
    }

    public final String toString() {
        return "VC: " + this.b + "=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public xm3(Parcel parcel) {
        String readString = parcel.readString();
        int i = sb3.a;
        this.b = readString;
        this.c = parcel.readString();
    }
}
