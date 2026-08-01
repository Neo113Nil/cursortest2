package q0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0334a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3855e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3856f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3857g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3858j;

    /* renamed from: k, reason: collision with root package name */
    public int f3859k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // q0.AbstractC0334a
    public final b a() {
        Parcel parcel = this.f3855e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3858j;
        if (i == this.f3856f) {
            i = this.f3857g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f3852a, this.f3853b, this.f3854c);
    }

    @Override // q0.AbstractC0334a
    public final boolean e(int i) {
        while (this.f3858j < this.f3857g) {
            int i2 = this.f3859k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3858j;
            Parcel parcel = this.f3855e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3859k = parcel.readInt();
            this.f3858j += readInt;
        }
        return this.f3859k == i;
    }

    @Override // q0.AbstractC0334a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3855e;
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

    public b(Parcel parcel, int i, int i2, String str, o.b bVar, o.b bVar2, o.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3859k = -1;
        this.f3855e = parcel;
        this.f3856f = i;
        this.f3857g = i2;
        this.f3858j = i;
        this.h = str;
    }
}
