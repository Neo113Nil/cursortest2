package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class md2 implements gt1 {
    public static final Parcelable.Creator<md2> CREATOR = new ld2();
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final byte[] i;

    public md2(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = bArr;
    }

    @Override // yads.gt1
    public final void a(zl1 zl1Var) {
        byte[] bArr = this.i;
        int i = this.b;
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || md2.class != obj.getClass()) {
            return false;
        }
        md2 md2Var = (md2) obj;
        return this.b == md2Var.b && this.c.equals(md2Var.c) && this.d.equals(md2Var.d) && this.e == md2Var.e && this.f == md2Var.f && this.g == md2Var.g && this.h == md2Var.h && Arrays.equals(this.i, md2Var.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.i) + ((((((((c4.a(c4.a((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31, this.c), 31, this.d) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }

    public md2(Parcel parcel) {
        this.b = parcel.readInt();
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.createByteArray();
    }
}
