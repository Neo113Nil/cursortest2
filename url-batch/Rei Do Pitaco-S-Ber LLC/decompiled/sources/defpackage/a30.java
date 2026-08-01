package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class a30 implements Parcelable {
    public static final Parcelable.Creator<a30> CREATOR = new i1(18);
    public int f;
    public int g;
    public int h;
    public int[] i;
    public int j;
    public int[] k;
    public ArrayList l;
    public boolean m;
    public boolean n;
    public boolean o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        if (this.h > 0) {
            parcel.writeIntArray(this.i);
        }
        parcel.writeInt(this.j);
        if (this.j > 0) {
            parcel.writeIntArray(this.k);
        }
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeList(this.l);
    }
}
