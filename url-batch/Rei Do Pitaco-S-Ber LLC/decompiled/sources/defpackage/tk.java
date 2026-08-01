package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class tk implements Parcelable {
    public static final Parcelable.Creator<tk> CREATOR = new i1(9);
    public ArrayList f;
    public ArrayList g;
    public x6[] h;
    public int i;
    public String j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f);
        parcel.writeStringList(this.g);
        parcel.writeTypedArray(this.h, i);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeStringList(this.k);
        parcel.writeTypedList(this.l);
        parcel.writeTypedList(this.m);
    }
}
