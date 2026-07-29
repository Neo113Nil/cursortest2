package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.wH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2146wH extends GT implements Parcelable, InterfaceC2157wS, TD, BT {
    public static final Parcelable.Creator<C2146wH> CREATOR = new J1(10);
    public C2091vS i;

    public C2146wH(float f) {
        C2091vS c2091vS = new C2091vS(f);
        if (AbstractC2025uS.a.get() != null) {
            C2091vS c2091vS2 = new C2091vS(f);
            c2091vS2.a = 1;
            c2091vS.b = c2091vS2;
        }
        this.i = c2091vS;
    }

    @Override // o.InterfaceC2157wS
    public final InterfaceC2289yS a() {
        return C1623oL.n;
    }

    @Override // o.GT
    public final HT b() {
        return this.i;
    }

    @Override // o.GT
    public final HT d(HT ht, HT ht2, HT ht3) {
        if (((C2091vS) ht2).c == ((C2091vS) ht3).c) {
            return ht2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // o.GT
    public final void e(HT ht) {
        AbstractC0048Bt.l(ht, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.i = (C2091vS) ht;
    }

    public final void g(float f) {
        AbstractC1696pS k;
        C2091vS c2091vS = (C2091vS) AbstractC2025uS.i(this.i);
        if (c2091vS.c == f) {
            return;
        }
        C2091vS c2091vS2 = this.i;
        synchronized (AbstractC2025uS.b) {
            k = AbstractC2025uS.k();
            ((C2091vS) AbstractC2025uS.n(c2091vS2, this, k, c2091vS)).c = f;
        }
        k.s(k.h() + 1);
        InterfaceC2114vp i = k.i();
        if (i != null) {
            i.invoke(this);
        }
    }

    @Override // o.BT
    public Object getValue() {
        return Float.valueOf(((C2091vS) AbstractC2025uS.r(this.i, this)).c);
    }

    @Override // o.TD
    public void setValue(Object obj) {
        g(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((C2091vS) AbstractC2025uS.i(this.i)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(((C2091vS) AbstractC2025uS.r(this.i, this)).c);
    }
}
