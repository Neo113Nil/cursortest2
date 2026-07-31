package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes14.dex */
public final class fj2 extends u23 {
    public static final Parcelable.Creator<fj2> CREATOR = new ej2();
    public final long b;
    public final long c;
    public final byte[] d;

    public fj2(long j, byte[] bArr, long j2) {
        this.b = j2;
        this.c = j;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeByteArray(this.d);
    }

    public fj2(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = sb3.a;
        this.d = createByteArray;
    }
}
