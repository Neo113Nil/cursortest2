package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class z63 extends u23 {
    public static final Parcelable.Creator<z63> CREATOR = new y63();
    public final long b;
    public final long c;

    public z63(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public static long a(xb2 xb2Var, long j) {
        long k = xb2Var.k();
        if ((128 & k) != 0) {
            return 8589934591L & ((((k & 1) << 32) | xb2Var.l()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
