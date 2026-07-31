package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes13.dex */
public final class vk0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<vk0> CREATOR = new sk0();
    public final uk0[] b;
    public int c;
    public final String d;
    public final int e;

    public vk0(String str, boolean z, uk0... uk0VarArr) {
        this.d = str;
        uk0VarArr = z ? (uk0[]) uk0VarArr.clone() : uk0VarArr;
        this.b = uk0VarArr;
        this.e = uk0VarArr.length;
        Arrays.sort(uk0VarArr, this);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        uk0 uk0Var = (uk0) obj;
        uk0 uk0Var2 = (uk0) obj2;
        UUID uuid = xq.a;
        return uuid.equals(uk0Var.c) ? uuid.equals(uk0Var2.c) ? 0 : 1 : uk0Var.c.compareTo(uk0Var2.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vk0.class != obj.getClass()) {
            return false;
        }
        vk0 vk0Var = (vk0) obj;
        return sb3.a(this.d, vk0Var.d) && Arrays.equals(this.b, vk0Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            String str = this.d;
            this.c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeTypedArray(this.b, 0);
    }

    public vk0(Parcel parcel) {
        this.d = parcel.readString();
        uk0[] uk0VarArr = (uk0[]) parcel.createTypedArray(uk0.CREATOR);
        int i = sb3.a;
        this.b = uk0VarArr;
        this.e = uk0VarArr.length;
    }
}
