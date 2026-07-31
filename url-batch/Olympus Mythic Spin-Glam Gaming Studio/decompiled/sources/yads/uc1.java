package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class uc1 implements Parcelable {

    @NotNull
    public static final tc1 CREATOR = new tc1();
    public final String b;
    public final String c;
    public final boolean d;

    public uc1(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc1)) {
            return false;
        }
        uc1 uc1Var = (uc1) obj;
        return Intrinsics.areEqual(this.b, uc1Var.b) && Intrinsics.areEqual(this.c, uc1Var.c) && this.d == uc1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + c4.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "JavaScriptResource(apiFramework=" + this.b + ", url=" + this.c + ", browserOptional=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public uc1(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        String readString2 = parcel.readString();
        Intrinsics.checkNotNull(readString2);
        boolean z = parcel.readByte() != 0;
        this.b = readString;
        this.c = readString2;
        this.d = z;
    }
}
