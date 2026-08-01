package g0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2419a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0135y f2420b;

    public c0(C0135y c0135y) {
        this.f2420b = c0135y;
    }

    @Override // g0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2419a) {
            this.f2419a = false;
            this.f2420b.f();
        }
    }

    @Override // g0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2419a = true;
    }
}
