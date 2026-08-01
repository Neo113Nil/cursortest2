package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f849a;

    /* renamed from: b, reason: collision with root package name */
    public final String f850b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f851c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f852e;

    /* renamed from: f, reason: collision with root package name */
    public final String f853f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f854g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f855j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f856k;

    /* renamed from: l, reason: collision with root package name */
    public final int f857l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f858m;

    public N(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        this.f849a = abstractComponentCallbacksC0049q.getClass().getName();
        this.f850b = abstractComponentCallbacksC0049q.f974e;
        this.f851c = abstractComponentCallbacksC0049q.f980m;
        this.d = abstractComponentCallbacksC0049q.f989v;
        this.f852e = abstractComponentCallbacksC0049q.f990w;
        this.f853f = abstractComponentCallbacksC0049q.f991x;
        this.f854g = abstractComponentCallbacksC0049q.f954A;
        this.h = abstractComponentCallbacksC0049q.f979l;
        this.i = abstractComponentCallbacksC0049q.f993z;
        this.f855j = abstractComponentCallbacksC0049q.f975f;
        this.f856k = abstractComponentCallbacksC0049q.f992y;
        this.f857l = abstractComponentCallbacksC0049q.f964L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f849a);
        sb.append(" (");
        sb.append(this.f850b);
        sb.append(")}:");
        if (this.f851c) {
            sb.append(" fromLayout");
        }
        int i = this.f852e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f853f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f854g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f856k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f849a);
        parcel.writeString(this.f850b);
        parcel.writeInt(this.f851c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f852e);
        parcel.writeString(this.f853f);
        parcel.writeInt(this.f854g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f855j);
        parcel.writeInt(this.f856k ? 1 : 0);
        parcel.writeBundle(this.f858m);
        parcel.writeInt(this.f857l);
    }

    public N(Parcel parcel) {
        this.f849a = parcel.readString();
        this.f850b = parcel.readString();
        this.f851c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f852e = parcel.readInt();
        this.f853f = parcel.readString();
        this.f854g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f855j = parcel.readBundle();
        this.f856k = parcel.readInt() != 0;
        this.f858m = parcel.readBundle();
        this.f857l = parcel.readInt();
    }
}
