package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class se extends z11 {
    public static final Parcelable.Creator<se> CREATOR = new re();
    public final String c;
    public final String d;
    public final int e;
    public final byte[] f;

    public se(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = bArr;
    }

    @Override // yads.gt1
    public final void a(zl1 zl1Var) {
        byte[] bArr = this.f;
        int i = this.e;
        if (zl1Var.j != null) {
            Integer valueOf = Integer.valueOf(i);
            int i2 = sb3.a;
            if (!valueOf.equals(3) && sb3.a((Object) zl1Var.k, (Object) 3)) {
                return;
            }
        }
        zl1Var.j = (byte[]) bArr.clone();
        zl1Var.k = Integer.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || se.class != obj.getClass()) {
            return false;
        }
        se seVar = (se) obj;
        return this.e == seVar.e && sb3.a(this.c, seVar.c) && sb3.a(this.d, seVar.d) && Arrays.equals(this.f, seVar.f);
    }

    public final int hashCode() {
        int i = (this.e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return Arrays.hashCode(this.f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yads.z11
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeByteArray(this.f);
    }

    public se(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.createByteArray();
    }
}
