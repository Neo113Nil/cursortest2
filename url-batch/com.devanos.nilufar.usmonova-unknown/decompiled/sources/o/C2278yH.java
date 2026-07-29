package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.yH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2278yH extends GT implements Parcelable, InterfaceC2157wS {
    public static final Parcelable.Creator<C2278yH> CREATOR = new C2212xH(0);
    public final InterfaceC2289yS i;
    public C2223xS j;

    public C2278yH(Object obj, InterfaceC2289yS interfaceC2289yS) {
        this.i = interfaceC2289yS;
        C2223xS c2223xS = new C2223xS(obj);
        if (AbstractC2025uS.a.get() != null) {
            C2223xS c2223xS2 = new C2223xS(obj);
            c2223xS2.a = 1;
            c2223xS.b = c2223xS2;
        }
        this.j = c2223xS;
    }

    @Override // o.InterfaceC2157wS
    public final InterfaceC2289yS a() {
        return this.i;
    }

    @Override // o.GT
    public final HT b() {
        return this.j;
    }

    @Override // o.GT
    public final HT d(HT ht, HT ht2, HT ht3) {
        if (this.i.d(((C2223xS) ht2).c, ((C2223xS) ht3).c)) {
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
        AbstractC0048Bt.l(ht, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.j = (C2223xS) ht;
    }

    @Override // o.BT
    public final Object getValue() {
        return ((C2223xS) AbstractC2025uS.r(this.j, this)).c;
    }

    @Override // o.TD
    public final void setValue(Object obj) {
        AbstractC1696pS k;
        C2223xS c2223xS = (C2223xS) AbstractC2025uS.i(this.j);
        if (this.i.d(c2223xS.c, obj)) {
            return;
        }
        C2223xS c2223xS2 = this.j;
        synchronized (AbstractC2025uS.b) {
            k = AbstractC2025uS.k();
            ((C2223xS) AbstractC2025uS.n(c2223xS2, this, k, c2223xS)).c = obj;
        }
        k.s(k.h() + 1);
        InterfaceC2114vp i = k.i();
        if (i != null) {
            i.invoke(this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((C2223xS) AbstractC2025uS.i(this.j)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C0460Rq c0460Rq = C0460Rq.P;
        InterfaceC2289yS interfaceC2289yS = this.i;
        if (AbstractC0048Bt.h(interfaceC2289yS, c0460Rq)) {
            i2 = 0;
        } else if (AbstractC0048Bt.h(interfaceC2289yS, C1623oL.n)) {
            i2 = 1;
        } else {
            if (!AbstractC0048Bt.h(interfaceC2289yS, C1097gL.i)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
