package q0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324b extends AbstractC0323a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3470e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3471f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3472g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3473j;

    /* renamed from: k, reason: collision with root package name */
    public int f3474k;

    public C0324b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // q0.AbstractC0323a
    public final C0324b a() {
        Parcel parcel = this.f3470e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3473j;
        if (i == this.f3471f) {
            i = this.f3472g;
        }
        return new C0324b(parcel, dataPosition, i, this.h + "  ", this.f3467a, this.f3468b, this.f3469c);
    }

    @Override // q0.AbstractC0323a
    public final boolean e(int i) {
        while (this.f3473j < this.f3472g) {
            int i2 = this.f3474k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3473j;
            Parcel parcel = this.f3470e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3474k = parcel.readInt();
            this.f3473j += readInt;
        }
        return this.f3474k == i;
    }

    @Override // q0.AbstractC0323a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3470e;
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

    public C0324b(Parcel parcel, int i, int i2, String str, o.b bVar, o.b bVar2, o.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3474k = -1;
        this.f3470e = parcel;
        this.f3471f = i;
        this.f3472g = i2;
        this.f3473j = i;
        this.h = str;
    }
}
