package f0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2032a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0108y f2033b;

    public a0(C0108y c0108y) {
        this.f2033b = c0108y;
    }

    @Override // f0.L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2032a) {
            this.f2032a = false;
            this.f2033b.f();
        }
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2032a = true;
    }
}
