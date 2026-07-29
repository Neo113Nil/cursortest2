package o;

/* renamed from: o.xS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2223xS extends HT {
    public Object c;

    public C2223xS(Object obj) {
        this.c = obj;
    }

    @Override // o.HT
    public final void a(HT ht) {
        AbstractC0048Bt.l(ht, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.c = ((C2223xS) ht).c;
    }

    @Override // o.HT
    public final HT b() {
        return new C2223xS(this.c);
    }
}
