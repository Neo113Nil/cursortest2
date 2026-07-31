package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class df implements gt1 {
    public static final Parcelable.Creator<df> CREATOR = new cf();
    public final int b;
    public final String c;

    public df(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Ait(controlCode=" + this.b + ",url=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
    }
}
