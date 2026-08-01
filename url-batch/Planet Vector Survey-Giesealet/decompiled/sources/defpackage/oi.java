package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oi extends eb {
    public final cb n;

    public oi(int i, cb cbVar) {
        super(i);
        this.n = cbVar;
        if (cbVar == cb.d) {
            g8.o("This implementation does not support suspension for senders, use ", hj0.a(eb.class).a(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        g8.g("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(Object obj, boolean z) {
        cb cbVar = this.n;
        cb cbVar2 = cb.f;
        ky0 ky0Var = ky0.a;
        if (cbVar == cbVar2) {
            Object r = super.r(obj);
            return (!(r instanceof dd) || (r instanceof cd)) ? r : ky0Var;
        }
        np npVar = gb.d;
        ed edVar = (ed) eb.i.get(this);
        while (true) {
            long andIncrement = eb.e.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean u = u(andIncrement, false);
            int i = gb.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (edVar.c != j3) {
                ed b = eb.b(this, j3, edVar);
                if (b != null) {
                    edVar = b;
                } else if (u) {
                    return new cd(q());
                }
            }
            int e = eb.e(this, edVar, i2, obj, j, npVar, u);
            if (e == 0) {
                edVar.a();
                return ky0Var;
            }
            if (e == 1) {
                break;
            }
            if (e != 2) {
                if (e == 3) {
                    g8.s("unexpected");
                    return null;
                }
                if (e == 4) {
                    if (j < eb.f.get(this)) {
                        edVar.a();
                    }
                    return new cd(q());
                }
                if (e == 5) {
                    edVar.a();
                }
            } else {
                if (u) {
                    edVar.h();
                    return new cd(q());
                }
                u01 u01Var = npVar instanceof u01 ? (u01) npVar : null;
                if (u01Var != null) {
                    u01Var.a(edVar, i2 + i);
                }
                j((edVar.c * j2) + i2);
            }
        }
    }

    @Override // defpackage.eb, defpackage.gq0
    public final Object c(kj kjVar, Object obj) {
        if (F(obj, true) instanceof cd) {
            throw q();
        }
        return ky0.a;
    }

    @Override // defpackage.eb, defpackage.gq0
    public final Object r(Object obj) {
        return F(obj, false);
    }

    @Override // defpackage.eb
    public final boolean v() {
        return this.n == cb.e;
    }
}
