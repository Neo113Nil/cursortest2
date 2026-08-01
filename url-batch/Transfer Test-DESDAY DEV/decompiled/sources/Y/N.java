package Y;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new C0.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f997b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f998c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f999e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1000f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1001g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1002j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1003k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1004l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1005m;

    public N(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        this.f996a = abstractComponentCallbacksC0049q.getClass().getName();
        this.f997b = abstractComponentCallbacksC0049q.f1121e;
        this.f998c = abstractComponentCallbacksC0049q.f1127m;
        this.d = abstractComponentCallbacksC0049q.f1136v;
        this.f999e = abstractComponentCallbacksC0049q.f1137w;
        this.f1000f = abstractComponentCallbacksC0049q.f1138x;
        this.f1001g = abstractComponentCallbacksC0049q.f1101A;
        this.h = abstractComponentCallbacksC0049q.f1126l;
        this.i = abstractComponentCallbacksC0049q.f1140z;
        this.f1002j = abstractComponentCallbacksC0049q.f1122f;
        this.f1003k = abstractComponentCallbacksC0049q.f1139y;
        this.f1004l = abstractComponentCallbacksC0049q.f1111L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f996a);
        sb.append(" (");
        sb.append(this.f997b);
        sb.append(")}:");
        if (this.f998c) {
            sb.append(" fromLayout");
        }
        int i = this.f999e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1000f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1001g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1003k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f996a);
        parcel.writeString(this.f997b);
        parcel.writeInt(this.f998c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f999e);
        parcel.writeString(this.f1000f);
        parcel.writeInt(this.f1001g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1002j);
        parcel.writeInt(this.f1003k ? 1 : 0);
        parcel.writeBundle(this.f1005m);
        parcel.writeInt(this.f1004l);
    }

    public N(Parcel parcel) {
        this.f996a = parcel.readString();
        this.f997b = parcel.readString();
        this.f998c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f999e = parcel.readInt();
        this.f1000f = parcel.readString();
        this.f1001g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1002j = parcel.readBundle();
        this.f1003k = parcel.readInt() != 0;
        this.f1005m = parcel.readBundle();
        this.f1004l = parcel.readInt();
    }
}
