package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class x6 implements Parcelable {
    public static final Parcelable.Creator<x6> CREATOR = new i1(3);
    public final int[] f;
    public final ArrayList g;
    public final int[] h;
    public final int[] i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final CharSequence n;
    public final int o;
    public final CharSequence p;
    public final ArrayList q;
    public final ArrayList r;
    public final boolean s;

    public x6(w6 w6Var) {
        int size = w6Var.a.size();
        this.f = new int[size * 6];
        if (!w6Var.g) {
            l8.u("Not on back stack");
            throw null;
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            al alVar = (al) w6Var.a.get(i2);
            int i3 = i + 1;
            this.f[i] = alVar.a;
            ArrayList arrayList = this.g;
            dk dkVar = alVar.b;
            arrayList.add(dkVar != null ? dkVar.j : null);
            int[] iArr = this.f;
            iArr[i3] = alVar.c ? 1 : 0;
            iArr[i + 2] = alVar.d;
            iArr[i + 3] = alVar.e;
            int i4 = i + 5;
            iArr[i + 4] = alVar.f;
            i += 6;
            iArr[i4] = alVar.g;
            this.h[i2] = alVar.h.ordinal();
            this.i[i2] = alVar.i.ordinal();
        }
        this.j = w6Var.f;
        this.k = w6Var.h;
        this.l = w6Var.r;
        this.m = w6Var.i;
        this.n = w6Var.j;
        this.o = w6Var.k;
        this.p = w6Var.l;
        this.q = w6Var.m;
        this.r = w6Var.n;
        this.s = w6Var.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f);
        parcel.writeStringList(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }

    public x6(Parcel parcel) {
        this.f = parcel.createIntArray();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.o = parcel.readInt();
        this.p = (CharSequence) creator.createFromParcel(parcel);
        this.q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.s = parcel.readInt() != 0;
    }
}
