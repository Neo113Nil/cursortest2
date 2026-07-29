package o;

/* renamed from: o.vS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2091vS extends HT {
    public float c;

    public C2091vS(float f) {
        this.c = f;
    }

    @Override // o.HT
    public final void a(HT ht) {
        AbstractC0048Bt.l(ht, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.c = ((C2091vS) ht).c;
    }

    @Override // o.HT
    public final HT b() {
        return new C2091vS(this.c);
    }
}
