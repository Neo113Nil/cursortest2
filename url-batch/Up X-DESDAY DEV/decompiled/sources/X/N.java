package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f844b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f845c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f846e;

    /* renamed from: f, reason: collision with root package name */
    public final String f847f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f848g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f849j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f850k;

    /* renamed from: l, reason: collision with root package name */
    public final int f851l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f852m;

    public N(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        this.f843a = abstractComponentCallbacksC0049q.getClass().getName();
        this.f844b = abstractComponentCallbacksC0049q.f968e;
        this.f845c = abstractComponentCallbacksC0049q.f974m;
        this.d = abstractComponentCallbacksC0049q.f983v;
        this.f846e = abstractComponentCallbacksC0049q.f984w;
        this.f847f = abstractComponentCallbacksC0049q.f985x;
        this.f848g = abstractComponentCallbacksC0049q.f948A;
        this.h = abstractComponentCallbacksC0049q.f973l;
        this.i = abstractComponentCallbacksC0049q.f987z;
        this.f849j = abstractComponentCallbacksC0049q.f969f;
        this.f850k = abstractComponentCallbacksC0049q.f986y;
        this.f851l = abstractComponentCallbacksC0049q.f958L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f843a);
        sb.append(" (");
        sb.append(this.f844b);
        sb.append(")}:");
        if (this.f845c) {
            sb.append(" fromLayout");
        }
        int i = this.f846e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f847f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f848g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f850k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f843a);
        parcel.writeString(this.f844b);
        parcel.writeInt(this.f845c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f846e);
        parcel.writeString(this.f847f);
        parcel.writeInt(this.f848g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f849j);
        parcel.writeInt(this.f850k ? 1 : 0);
        parcel.writeBundle(this.f852m);
        parcel.writeInt(this.f851l);
    }

    public N(Parcel parcel) {
        this.f843a = parcel.readString();
        this.f844b = parcel.readString();
        this.f845c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f846e = parcel.readInt();
        this.f847f = parcel.readString();
        this.f848g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f849j = parcel.readBundle();
        this.f850k = parcel.readInt() != 0;
        this.f852m = parcel.readBundle();
        this.f851l = parcel.readInt();
    }
}
