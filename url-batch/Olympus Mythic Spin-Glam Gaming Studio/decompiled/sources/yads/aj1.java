package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class aj1 implements gt1 {
    public static final Parcelable.Creator<aj1> CREATOR = new zi1();
    public final String b;
    public final byte[] c;
    public final int d;
    public final int e;

    public aj1(int i, int i2, String str, byte[] bArr) {
        this.b = str;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aj1.class != obj.getClass()) {
            return false;
        }
        aj1 aj1Var = (aj1) obj;
        return this.b.equals(aj1Var.b) && Arrays.equals(this.c, aj1Var.c) && this.d == aj1Var.d && this.e == aj1Var.e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + c4.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "mdta: key=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public aj1(Parcel parcel) {
        String readString = parcel.readString();
        int i = sb3.a;
        this.b = readString;
        this.c = parcel.createByteArray();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }
}
