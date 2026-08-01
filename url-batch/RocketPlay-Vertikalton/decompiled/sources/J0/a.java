package J0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f593a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.d f594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f595c;

    public a(A1.d dVar, Typeface typeface) {
        this.f593a = typeface;
        this.f594b = dVar;
    }

    @Override // F1.d
    public final void U(int i) {
        if (this.f595c) {
            return;
        }
        G0.d dVar = (G0.d) this.f594b.f38b;
        if (dVar.j(this.f593a)) {
            dVar.h(false);
        }
    }

    @Override // F1.d
    public final void V(Typeface typeface, boolean z2) {
        if (this.f595c) {
            return;
        }
        G0.d dVar = (G0.d) this.f594b.f38b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
