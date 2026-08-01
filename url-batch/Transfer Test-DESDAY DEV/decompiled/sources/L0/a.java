package L0;

import A0.h;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f485e;

    /* renamed from: f, reason: collision with root package name */
    public final h f486f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f487g;

    public a(h hVar, Typeface typeface) {
        this.f485e = typeface;
        this.f486f = hVar;
    }

    @Override // A.c
    public final void j0(int i) {
        if (this.f487g) {
            return;
        }
        I0.b bVar = (I0.b) this.f486f.f30b;
        if (bVar.j(this.f485e)) {
            bVar.h(false);
        }
    }

    @Override // A.c
    public final void k0(Typeface typeface, boolean z2) {
        if (this.f487g) {
            return;
        }
        I0.b bVar = (I0.b) this.f486f.f30b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
