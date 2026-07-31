package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class g43 implements Comparable, Parcelable {
    public static final Parcelable.Creator<g43> CREATOR = new f43();
    public final int b;
    public final int c;
    public final int d;

    public g43(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g43 g43Var = (g43) obj;
        int i = this.b - g43Var.b;
        if (i != 0) {
            return i;
        }
        int i2 = this.c - g43Var.c;
        return i2 == 0 ? this.d - g43Var.d : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g43.class != obj.getClass()) {
            return false;
        }
        g43 g43Var = (g43) obj;
        return this.b == g43Var.b && this.c == g43Var.c && this.d == g43Var.d;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return this.b + "." + this.c + "." + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public g43(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
