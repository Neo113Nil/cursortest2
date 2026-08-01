package Y;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: Y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040b implements Parcelable {
    public static final Parcelable.Creator<C0040b> CREATOR = new A0.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1426a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1427b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1428c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1429e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1430f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1431g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1432j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1433k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1434l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1435m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1436n;

    public C0040b(C0039a c0039a) {
        int size = c0039a.f1411a.size();
        this.f1426a = new int[size * 6];
        if (!c0039a.f1416g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1427b = new ArrayList(size);
        this.f1428c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0039a.f1411a.get(i2);
            int i3 = i + 1;
            this.f1426a[i] = p2.f1391a;
            ArrayList arrayList = this.f1427b;
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = p2.f1392b;
            arrayList.add(abstractComponentCallbacksC0055q != null ? abstractComponentCallbacksC0055q.f1502e : null);
            int[] iArr = this.f1426a;
            iArr[i3] = p2.f1393c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f1394e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f1395f;
            i += 6;
            iArr[i4] = p2.f1396g;
            this.f1428c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1429e = c0039a.f1415f;
        this.f1430f = c0039a.h;
        this.f1431g = c0039a.f1425r;
        this.h = c0039a.i;
        this.i = c0039a.f1417j;
        this.f1432j = c0039a.f1418k;
        this.f1433k = c0039a.f1419l;
        this.f1434l = c0039a.f1420m;
        this.f1435m = c0039a.f1421n;
        this.f1436n = c0039a.f1422o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1426a);
        parcel.writeStringList(this.f1427b);
        parcel.writeIntArray(this.f1428c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1429e);
        parcel.writeString(this.f1430f);
        parcel.writeInt(this.f1431g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1432j);
        TextUtils.writeToParcel(this.f1433k, parcel, 0);
        parcel.writeStringList(this.f1434l);
        parcel.writeStringList(this.f1435m);
        parcel.writeInt(this.f1436n ? 1 : 0);
    }

    public C0040b(Parcel parcel) {
        this.f1426a = parcel.createIntArray();
        this.f1427b = parcel.createStringArrayList();
        this.f1428c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1429e = parcel.readInt();
        this.f1430f = parcel.readString();
        this.f1431g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1432j = parcel.readInt();
        this.f1433k = (CharSequence) creator.createFromParcel(parcel);
        this.f1434l = parcel.createStringArrayList();
        this.f1435m = parcel.createStringArrayList();
        this.f1436n = parcel.readInt() != 0;
    }
}
