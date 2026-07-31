package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes13.dex */
public final class dy0 extends z11 {
    public static final Parcelable.Creator<dy0> CREATOR = new cy0();
    public final String c;
    public final String d;
    public final String e;
    public final byte[] f;

    public dy0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dy0.class != obj.getClass()) {
            return false;
        }
        dy0 dy0Var = (dy0) obj;
        return sb3.a(this.c, dy0Var.c) && sb3.a(this.d, dy0Var.d) && sb3.a(this.e, dy0Var.e) && Arrays.equals(this.f, dy0Var.f);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        return Arrays.hashCode(this.f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yads.z11
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", filename=" + this.d + ", description=" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }

    public dy0(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.createByteArray();
    }
}
