package J0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ F1.d h;
    public final /* synthetic */ d i;

    public b(d dVar, F1.d dVar2) {
        this.i = dVar;
        this.h = dVar2;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f608m = true;
        this.h.U(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f609n = Typeface.create(typeface, dVar.f601c);
        dVar.f608m = true;
        this.h.V(dVar.f609n, false);
    }
}
