package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class vt extends z11 {
    public static final Parcelable.Creator<vt> CREATOR = new ut();
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String[] f;
    public final z11[] g;

    public vt(String str, boolean z, boolean z2, String[] strArr, z11[] z11VarArr) {
        super("CTOC");
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = strArr;
        this.g = z11VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vt.class != obj.getClass()) {
            return false;
        }
        vt vtVar = (vt) obj;
        return this.d == vtVar.d && this.e == vtVar.e && sb3.a(this.c, vtVar.c) && Arrays.equals(this.f, vtVar.f) && Arrays.equals(this.g, vtVar.g);
    }

    public final int hashCode() {
        int i = ((((this.d ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.e ? 1 : 0)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f);
        parcel.writeInt(this.g.length);
        for (z11 z11Var : this.g) {
            parcel.writeParcelable(z11Var, 0);
        }
    }

    public vt(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = readString;
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.g = new z11[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.g[i2] = (z11) parcel.readParcelable(z11.class.getClassLoader());
        }
    }
}
