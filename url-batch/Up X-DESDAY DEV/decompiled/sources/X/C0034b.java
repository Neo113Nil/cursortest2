package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034b implements Parcelable {
    public static final Parcelable.Creator<C0034b> CREATOR = new Q.k(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f892a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f893b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f894c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f895e;

    /* renamed from: f, reason: collision with root package name */
    public final String f896f;

    /* renamed from: g, reason: collision with root package name */
    public final int f897g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f898j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f899k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f900l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f901m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f902n;

    public C0034b(C0033a c0033a) {
        int size = c0033a.f877a.size();
        this.f892a = new int[size * 6];
        if (!c0033a.f882g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f893b = new ArrayList(size);
        this.f894c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0033a.f877a.get(i2);
            int i3 = i + 1;
            this.f892a[i] = p2.f857a;
            ArrayList arrayList = this.f893b;
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = p2.f858b;
            arrayList.add(abstractComponentCallbacksC0049q != null ? abstractComponentCallbacksC0049q.f968e : null);
            int[] iArr = this.f892a;
            iArr[i3] = p2.f859c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f860e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f861f;
            i += 6;
            iArr[i4] = p2.f862g;
            this.f894c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f895e = c0033a.f881f;
        this.f896f = c0033a.h;
        this.f897g = c0033a.f891r;
        this.h = c0033a.i;
        this.i = c0033a.f883j;
        this.f898j = c0033a.f884k;
        this.f899k = c0033a.f885l;
        this.f900l = c0033a.f886m;
        this.f901m = c0033a.f887n;
        this.f902n = c0033a.f888o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f892a);
        parcel.writeStringList(this.f893b);
        parcel.writeIntArray(this.f894c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f895e);
        parcel.writeString(this.f896f);
        parcel.writeInt(this.f897g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f898j);
        TextUtils.writeToParcel(this.f899k, parcel, 0);
        parcel.writeStringList(this.f900l);
        parcel.writeStringList(this.f901m);
        parcel.writeInt(this.f902n ? 1 : 0);
    }

    public C0034b(Parcel parcel) {
        this.f892a = parcel.createIntArray();
        this.f893b = parcel.createStringArrayList();
        this.f894c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f895e = parcel.readInt();
        this.f896f = parcel.readString();
        this.f897g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f898j = parcel.readInt();
        this.f899k = (CharSequence) creator.createFromParcel(parcel);
        this.f900l = parcel.createStringArrayList();
        this.f901m = parcel.createStringArrayList();
        this.f902n = parcel.readInt() != 0;
    }
}
