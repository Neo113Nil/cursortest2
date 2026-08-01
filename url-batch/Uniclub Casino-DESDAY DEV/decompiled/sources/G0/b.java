package G0;

import android.graphics.Typeface;
import q1.l;

/* loaded from: classes.dex */
public final class b extends B.b {
    public final /* synthetic */ l h;
    public final /* synthetic */ d i;

    public b(d dVar, l lVar) {
        this.i = dVar;
        this.h = lVar;
    }

    @Override // B.b
    public final void g(int i) {
        this.i.f195m = true;
        this.h.d0(i);
    }

    @Override // B.b
    public final void h(Typeface typeface) {
        d dVar = this.i;
        dVar.f196n = Typeface.create(typeface, dVar.f188c);
        dVar.f195m = true;
        this.h.e0(dVar.f196n, false);
    }
}
