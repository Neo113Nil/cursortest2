package L0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ A.c h;
    public final /* synthetic */ d i;

    public b(d dVar, A.c cVar) {
        this.i = dVar;
        this.h = cVar;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f500m = true;
        this.h.j0(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f501n = Typeface.create(typeface, dVar.f493c);
        dVar.f500m = true;
        this.h.k0(dVar.f501n, false);
    }
}
