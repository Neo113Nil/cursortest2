package yads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ck0 implements Parcelable {
    public static final Parcelable.Creator<ck0> CREATOR = new bk0();
    public final String b;
    public final Uri c;
    public final String d;
    public final List e;
    public final byte[] f;
    public final String g;
    public final byte[] h;

    public ck0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int a = sb3.a(uri, str2);
        if (a == 0 || a == 2 || a == 1) {
            oh.a("customCacheKey must be null for type: " + a, str3 == null);
        }
        this.b = str;
        this.c = uri;
        this.d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.e = Collections.unmodifiableList(arrayList);
        this.f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.g = str3;
        this.h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : sb3.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return this.b.equals(ck0Var.b) && this.c.equals(ck0Var.c) && sb3.a(this.d, ck0Var.d) && this.e.equals(ck0Var.e) && Arrays.equals(this.f, ck0Var.f) && sb3.a(this.g, ck0Var.g) && Arrays.equals(this.h, ck0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 961)) * 31;
        String str = this.d;
        int hashCode2 = (Arrays.hashCode(this.f) + ((this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.g;
        return Arrays.hashCode(this.h) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.d + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.toString());
        parcel.writeString(this.d);
        parcel.writeInt(this.e.size());
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            parcel.writeParcelable((Parcelable) this.e.get(i2), 0);
        }
        parcel.writeByteArray(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
    }

    public ck0(Parcel parcel) {
        String readString = parcel.readString();
        int i = sb3.a;
        this.b = readString;
        this.c = Uri.parse(parcel.readString());
        this.d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((g43) parcel.readParcelable(g43.class.getClassLoader()));
        }
        this.e = Collections.unmodifiableList(arrayList);
        this.f = parcel.createByteArray();
        this.g = parcel.readString();
        this.h = parcel.createByteArray();
    }
}
