package G0;

import C.g;
import android.graphics.Typeface;
import q1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f180a;

    /* renamed from: b, reason: collision with root package name */
    public final g f181b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f182c;

    public a(g gVar, Typeface typeface) {
        this.f180a = typeface;
        this.f181b = gVar;
    }

    @Override // q1.l
    public final void d0(int i) {
        if (this.f182c) {
            return;
        }
        D0.d dVar = (D0.d) this.f181b.f62b;
        if (dVar.j(this.f180a)) {
            dVar.h(false);
        }
    }

    @Override // q1.l
    public final void e0(Typeface typeface, boolean z2) {
        if (this.f182c) {
            return;
        }
        D0.d dVar = (D0.d) this.f181b.f62b;
        if (dVar.j(typeface)) {
            dVar.h(false);
        }
    }
}
