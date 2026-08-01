package g0;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c0 extends AbstractC0142L {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2858a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0171y f2859b;

    public c0(C0171y c0171y) {
        this.f2859b = c0171y;
    }

    @Override // g0.AbstractC0142L
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2858a) {
            this.f2858a = false;
            this.f2859b.f();
        }
    }

    @Override // g0.AbstractC0142L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2858a = true;
    }
}
