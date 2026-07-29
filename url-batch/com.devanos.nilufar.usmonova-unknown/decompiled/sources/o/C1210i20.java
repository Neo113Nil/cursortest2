package o;

/* renamed from: o.i20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210i20 implements T7 {
    public final /* synthetic */ C0408Pq a;

    public C1210i20(C0408Pq c0408Pq) {
        this.a = c0408Pq;
    }

    @Override // o.T7
    public final void onBackgroundStateChanged(boolean z) {
        E20 e20 = this.a.m;
        e20.sendMessage(e20.obtainMessage(1, Boolean.valueOf(z)));
    }
}
