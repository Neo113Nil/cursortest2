package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ym0 implements gt1 {
    public static final Parcelable.Creator<ym0> CREATOR;
    public static final jw0 h;
    public static final jw0 i;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final byte[] f;
    public int g;

    static {
        iw0 iw0Var = new iw0();
        iw0Var.k = "application/id3";
        h = new jw0(iw0Var);
        iw0 iw0Var2 = new iw0();
        iw0Var2.k = "application/x-scte35";
        i = new jw0(iw0Var2);
        CREATOR = new xm0();
    }

    public ym0(String str, String str2, long j, long j2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = bArr;
    }

    @Override // yads.gt1
    public final jw0 a() {
        String str = this.b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h;
            default:
                return null;
        }
    }

    @Override // yads.gt1
    public final byte[] b() {
        if (a() != null) {
            return this.f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ym0.class != obj.getClass()) {
            return false;
        }
        ym0 ym0Var = (ym0) obj;
        return this.d == ym0Var.d && this.e == ym0Var.e && sb3.a(this.b, ym0Var.b) && sb3.a(this.c, ym0Var.c) && Arrays.equals(this.f, ym0Var.f);
    }

    public final int hashCode() {
        if (this.g == 0) {
            String str = this.b;
            int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.d;
            int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            this.g = Arrays.hashCode(this.f) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.b + ", id=" + this.e + ", durationMs=" + this.d + ", value=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeByteArray(this.f);
    }

    public ym0(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = sb3.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.createByteArray();
    }
}
