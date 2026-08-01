package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class pu {
    public oe a;
    public boolean b;

    public final void a() {
        oe oeVar = this.a;
        if (oeVar == null) {
            l8.u("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            oeVar.g(this, null);
        }
        qu quVar = (qu) oeVar.g;
        h hVar = (h) oeVar.f;
        quVar.getClass();
        if (equals(quVar.h) && -1 == quVar.g) {
            kv kvVar = quVar.f;
            if (kvVar == null) {
                kvVar = quVar.c(-1);
            }
            quVar.f = null;
            quVar.g = 0;
            quVar.h = null;
            if (kvVar == null) {
                ((pv) hVar.g).a.run();
            } else {
                sk skVar = kvVar.d.d;
                skVar.y(true);
                if (skVar.h.b) {
                    skVar.N();
                } else {
                    ((nv) skVar.g.b.a()).a();
                }
            }
            quVar.a.b(ru.o);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
