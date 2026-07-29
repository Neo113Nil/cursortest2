package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class R7 implements Parcelable {
    public static final Parcelable.Creator<R7> CREATOR = new J1(2);
    public final int[] h;
    public final ArrayList i;
    public final int[] j;
    public final int[] k;
    public final int l;
    public final String m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final int f94o;
    public final CharSequence p;
    public final int q;
    public final CharSequence r;
    public final ArrayList s;
    public final ArrayList t;
    public final boolean u;

    public R7(Q7 q7) {
        int size = q7.a.size();
        this.h = new int[size * 6];
        if (!q7.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.i = new ArrayList(size);
        this.j = new int[size];
        this.k = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1258ip c1258ip = (C1258ip) q7.a.get(i2);
            int i3 = i + 1;
            this.h[i] = c1258ip.a;
            ArrayList arrayList = this.i;
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c1258ip.b;
            arrayList.add(abstractComponentCallbacksC0069Co != null ? abstractComponentCallbacksC0069Co.l : null);
            int[] iArr = this.h;
            iArr[i3] = c1258ip.c ? 1 : 0;
            iArr[i + 2] = c1258ip.d;
            iArr[i + 3] = c1258ip.e;
            int i4 = i + 5;
            iArr[i + 4] = c1258ip.f;
            i += 6;
            iArr[i4] = c1258ip.g;
            this.j[i2] = c1258ip.h.ordinal();
            this.k[i2] = c1258ip.i.ordinal();
        }
        this.l = q7.f;
        this.m = q7.h;
        this.n = q7.r;
        this.f94o = q7.i;
        this.p = q7.j;
        this.q = q7.k;
        this.r = q7.l;
        this.s = q7.m;
        this.t = q7.n;
        this.u = q7.f88o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.h);
        parcel.writeStringList(this.i);
        parcel.writeIntArray(this.j);
        parcel.writeIntArray(this.k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f94o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeInt(this.q);
        TextUtils.writeToParcel(this.r, parcel, 0);
        parcel.writeStringList(this.s);
        parcel.writeStringList(this.t);
        parcel.writeInt(this.u ? 1 : 0);
    }

    public R7(Parcel parcel) {
        this.h = parcel.createIntArray();
        this.i = parcel.createStringArrayList();
        this.j = parcel.createIntArray();
        this.k = parcel.createIntArray();
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.f94o = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.p = (CharSequence) creator.createFromParcel(parcel);
        this.q = parcel.readInt();
        this.r = (CharSequence) creator.createFromParcel(parcel);
        this.s = parcel.createStringArrayList();
        this.t = parcel.createStringArrayList();
        this.u = parcel.readInt() != 0;
    }
}
