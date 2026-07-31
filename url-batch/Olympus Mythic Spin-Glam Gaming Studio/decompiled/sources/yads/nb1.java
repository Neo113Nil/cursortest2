package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class nb1 extends z11 {
    public static final Parcelable.Creator<nb1> CREATOR = new mb1();
    public final String c;
    public final String d;
    public final String e;

    public nb1(String str, String str2, String str3) {
        super("----");
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nb1.class != obj.getClass()) {
            return false;
        }
        nb1 nb1Var = (nb1) obj;
        return sb3.a(this.d, nb1Var.d) && sb3.a(this.c, nb1Var.c) && sb3.a(this.e, nb1Var.e);
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
        return this.b + ": domain=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
    }

    public nb1(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readString();
    }
}
