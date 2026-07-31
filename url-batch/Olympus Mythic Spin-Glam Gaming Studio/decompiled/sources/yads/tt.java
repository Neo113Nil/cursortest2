package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class tt extends z11 {
    public static final Parcelable.Creator<tt> CREATOR = new st();
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final z11[] h;

    public tt(String str, int i, int i2, long j, long j2, z11[] z11VarArr) {
        super("CHAP");
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = z11VarArr;
    }

    @Override // yads.z11, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tt.class != obj.getClass()) {
            return false;
        }
        tt ttVar = (tt) obj;
        return this.d == ttVar.d && this.e == ttVar.e && this.f == ttVar.f && this.g == ttVar.g && sb3.a(this.c, ttVar.c) && Arrays.equals(this.h, ttVar.h);
    }

    public final int hashCode() {
        int i = (((((((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.e) * 31) + ((int) this.f)) * 31) + ((int) this.g)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        for (z11 z11Var : this.h) {
            parcel.writeParcelable(z11Var, 0);
        }
    }

    public tt(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = readString;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new z11[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.h[i2] = (z11) parcel.readParcelable(z11.class.getClassLoader());
        }
    }
}
