package f0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2034a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0120y f2035b;

    public a0(C0120y c0120y) {
        this.f2035b = c0120y;
    }

    @Override // f0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2034a) {
            this.f2034a = false;
            this.f2035b.f();
        }
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2034a = true;
    }
}
