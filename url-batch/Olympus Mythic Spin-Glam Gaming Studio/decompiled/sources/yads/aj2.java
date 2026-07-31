package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class aj2 extends z11 {
    public static final Parcelable.Creator<aj2> CREATOR = new zi2();
    public final String c;
    public final byte[] d;

    public aj2(String str, byte[] bArr) {
        super("PRIV");
        this.c = str;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aj2.class != obj.getClass()) {
            return false;
        }
        aj2 aj2Var = (aj2) obj;
        return sb3.a(this.c, aj2Var.c) && Arrays.equals(this.d, aj2Var.d);
    }

    public final int hashCode() {
        String str = this.c;
        return Arrays.hashCode(this.d) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.z11
    public final String toString() {
        return this.b + ": owner=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public aj2(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = readString;
        this.d = parcel.createByteArray();
    }
}
