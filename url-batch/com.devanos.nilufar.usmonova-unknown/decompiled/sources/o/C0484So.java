package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.So, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484So implements Parcelable {
    public static final Parcelable.Creator<C0484So> CREATOR = new J1(4);
    public String h;
    public int i;

    public C0484So(String str, int i) {
        this.h = str;
        this.i = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
    }
}
