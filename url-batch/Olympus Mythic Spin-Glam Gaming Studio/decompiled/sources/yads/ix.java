package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public final class ix extends z11 {
    public static final Parcelable.Creator<ix> CREATOR = new hx();
    public final String c;
    public final String d;
    public final String e;

    public ix(String str, String str2, String str3) {
        super("COMM");
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ix.class != obj.getClass()) {
            return false;
        }
        ix ixVar = (ix) obj;
        return sb3.a(this.d, ixVar.d) && sb3.a(this.c, ixVar.c) && sb3.a(this.e, ixVar.e);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.z11
    public final String toString() {
        return this.b + ": language=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
    }

    public ix(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readString();
    }
}
