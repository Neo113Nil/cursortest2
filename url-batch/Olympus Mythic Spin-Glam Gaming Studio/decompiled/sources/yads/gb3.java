package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes5.dex */
public final class gb3 extends z11 {
    public static final Parcelable.Creator<gb3> CREATOR = new fb3();
    public final String c;
    public final String d;

    public gb3(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gb3.class != obj.getClass()) {
            return false;
        }
        gb3 gb3Var = (gb3) obj;
        return this.b.equals(gb3Var.b) && sb3.a(this.c, gb3Var.c) && sb3.a(this.d, gb3Var.d);
    }

    public final int hashCode() {
        int a = c4.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.z11
    public final String toString() {
        return this.b + ": url=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gb3(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = sb3.a;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
