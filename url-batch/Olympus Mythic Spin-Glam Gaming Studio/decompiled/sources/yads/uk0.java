package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class uk0 implements Parcelable {
    public static final Parcelable.Creator<uk0> CREATOR = new tk0();
    public int b;
    public final UUID c;
    public final String d;
    public final String e;
    public final byte[] f;

    public uk0(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.c = uuid;
        this.d = str;
        str2.getClass();
        this.e = str2;
        this.f = bArr;
    }

    public final boolean a(UUID uuid) {
        return xq.a.equals(this.c) || uuid.equals(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uk0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        uk0 uk0Var = (uk0) obj;
        return sb3.a(this.d, uk0Var.d) && sb3.a(this.e, uk0Var.e) && sb3.a(this.c, uk0Var.c) && Arrays.equals(this.f, uk0Var.f);
    }

    public final int hashCode() {
        if (this.b == 0) {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            this.b = Arrays.hashCode(this.f) + c4.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.c.getMostSignificantBits());
        parcel.writeLong(this.c.getLeastSignificantBits());
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }

    public uk0(Parcel parcel) {
        this.c = new UUID(parcel.readLong(), parcel.readLong());
        this.d = parcel.readString();
        String readString = parcel.readString();
        int i = sb3.a;
        this.e = readString;
        this.f = parcel.createByteArray();
    }
}
