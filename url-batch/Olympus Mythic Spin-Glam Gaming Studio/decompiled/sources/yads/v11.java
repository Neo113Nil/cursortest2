package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class v11 implements gt1 {
    public static final Parcelable.Creator<v11> CREATOR = new u11();
    public final byte[] b;
    public final String c;
    public final String d;

    public v11(byte[] bArr, String str, String str2) {
        this.b = bArr;
        this.c = str;
        this.d = str2;
    }

    @Override // yads.gt1
    public final void a(zl1 zl1Var) {
        String str = this.c;
        if (str != null) {
            zl1Var.a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v11.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((v11) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ICY: title=\"" + this.c + "\", url=\"" + this.d + "\", rawMetadata.length=\"" + this.b.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public v11(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.b = createByteArray;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
