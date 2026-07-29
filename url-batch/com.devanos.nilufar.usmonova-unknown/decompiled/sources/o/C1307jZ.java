package o;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: o.jZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307jZ extends AbstractC1243iZ {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public C1307jZ(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new K6(0), new K6(0), new K6(0));
    }

    @Override // o.AbstractC1243iZ
    public final C1307jZ a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new C1307jZ(parcel, dataPosition, i, AbstractC1888sN.l(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // o.AbstractC1243iZ
    public final boolean e(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // o.AbstractC1243iZ
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C1307jZ(Parcel parcel, int i, int i2, String str, K6 k6, K6 k62, K6 k63) {
        super(k6, k62, k63);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
