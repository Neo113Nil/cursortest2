package Y;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new A0.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f1377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1378b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1379c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1380e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1381f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1382g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1383j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1384k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1385l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1386m;

    public N(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        this.f1377a = abstractComponentCallbacksC0055q.getClass().getName();
        this.f1378b = abstractComponentCallbacksC0055q.f1502e;
        this.f1379c = abstractComponentCallbacksC0055q.f1508m;
        this.d = abstractComponentCallbacksC0055q.f1517v;
        this.f1380e = abstractComponentCallbacksC0055q.f1518w;
        this.f1381f = abstractComponentCallbacksC0055q.f1519x;
        this.f1382g = abstractComponentCallbacksC0055q.f1482A;
        this.h = abstractComponentCallbacksC0055q.f1507l;
        this.i = abstractComponentCallbacksC0055q.f1521z;
        this.f1383j = abstractComponentCallbacksC0055q.f1503f;
        this.f1384k = abstractComponentCallbacksC0055q.f1520y;
        this.f1385l = abstractComponentCallbacksC0055q.f1492L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1377a);
        sb.append(" (");
        sb.append(this.f1378b);
        sb.append(")}:");
        if (this.f1379c) {
            sb.append(" fromLayout");
        }
        int i = this.f1380e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1381f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1382g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1384k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1377a);
        parcel.writeString(this.f1378b);
        parcel.writeInt(this.f1379c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f1380e);
        parcel.writeString(this.f1381f);
        parcel.writeInt(this.f1382g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1383j);
        parcel.writeInt(this.f1384k ? 1 : 0);
        parcel.writeBundle(this.f1386m);
        parcel.writeInt(this.f1385l);
    }

    public N(Parcel parcel) {
        this.f1377a = parcel.readString();
        this.f1378b = parcel.readString();
        this.f1379c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f1380e = parcel.readInt();
        this.f1381f = parcel.readString();
        this.f1382g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1383j = parcel.readBundle();
        this.f1384k = parcel.readInt() != 0;
        this.f1386m = parcel.readBundle();
        this.f1385l = parcel.readInt();
    }
}
