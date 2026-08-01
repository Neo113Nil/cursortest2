package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class kv {
    public final lv a;
    public boolean b;
    public oe c;
    public final lk d;
    public boolean e;

    public kv(lk lkVar, lv lvVar) {
        lkVar.getClass();
        boolean z = lkVar.b;
        this.a = lvVar;
        this.b = z;
        this.d = lkVar;
        this.e = true;
    }

    public final void a() {
        oe oeVar = this.c;
        if (oeVar == null || !((LinkedHashSet) oeVar.h).remove(this)) {
            return;
        }
        qu quVar = (qu) oeVar.g;
        quVar.getClass();
        if (this == quVar.f) {
            if (quVar.g == -1) {
                this.d.getClass();
            }
            quVar.f = null;
            quVar.g = 0;
            quVar.h = null;
        }
        quVar.d.remove(this);
        quVar.e.remove(this);
        this.c = null;
        quVar.b();
    }

    public final void b(boolean z) {
        qu quVar;
        this.e = z;
        boolean z2 = z && this.d.b;
        if (this.b == z2) {
            return;
        }
        this.b = z2;
        oe oeVar = this.c;
        if (oeVar == null || (quVar = (qu) oeVar.g) == null) {
            return;
        }
        quVar.b();
    }
}
