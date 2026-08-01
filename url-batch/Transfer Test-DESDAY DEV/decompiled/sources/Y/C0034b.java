package Y;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: Y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034b implements Parcelable {
    public static final Parcelable.Creator<C0034b> CREATOR = new C0.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1045a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1046b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1047c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1048e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1049f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1050g;
    public final int h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1051j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1052k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1053l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1054m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1055n;

    public C0034b(C0033a c0033a) {
        int size = c0033a.f1030a.size();
        this.f1045a = new int[size * 6];
        if (!c0033a.f1035g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1046b = new ArrayList(size);
        this.f1047c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P p2 = (P) c0033a.f1030a.get(i2);
            int i3 = i + 1;
            this.f1045a[i] = p2.f1010a;
            ArrayList arrayList = this.f1046b;
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = p2.f1011b;
            arrayList.add(abstractComponentCallbacksC0049q != null ? abstractComponentCallbacksC0049q.f1121e : null);
            int[] iArr = this.f1045a;
            iArr[i3] = p2.f1012c ? 1 : 0;
            iArr[i + 2] = p2.d;
            iArr[i + 3] = p2.f1013e;
            int i4 = i + 5;
            iArr[i + 4] = p2.f1014f;
            i += 6;
            iArr[i4] = p2.f1015g;
            this.f1047c[i2] = p2.h.ordinal();
            this.d[i2] = p2.i.ordinal();
        }
        this.f1048e = c0033a.f1034f;
        this.f1049f = c0033a.h;
        this.f1050g = c0033a.f1044r;
        this.h = c0033a.i;
        this.i = c0033a.f1036j;
        this.f1051j = c0033a.f1037k;
        this.f1052k = c0033a.f1038l;
        this.f1053l = c0033a.f1039m;
        this.f1054m = c0033a.f1040n;
        this.f1055n = c0033a.f1041o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1045a);
        parcel.writeStringList(this.f1046b);
        parcel.writeIntArray(this.f1047c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1048e);
        parcel.writeString(this.f1049f);
        parcel.writeInt(this.f1050g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f1051j);
        TextUtils.writeToParcel(this.f1052k, parcel, 0);
        parcel.writeStringList(this.f1053l);
        parcel.writeStringList(this.f1054m);
        parcel.writeInt(this.f1055n ? 1 : 0);
    }

    public C0034b(Parcel parcel) {
        this.f1045a = parcel.createIntArray();
        this.f1046b = parcel.createStringArrayList();
        this.f1047c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1048e = parcel.readInt();
        this.f1049f = parcel.readString();
        this.f1050g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f1051j = parcel.readInt();
        this.f1052k = (CharSequence) creator.createFromParcel(parcel);
        this.f1053l = parcel.createStringArrayList();
        this.f1054m = parcel.createStringArrayList();
        this.f1055n = parcel.readInt() != 0;
    }
}
