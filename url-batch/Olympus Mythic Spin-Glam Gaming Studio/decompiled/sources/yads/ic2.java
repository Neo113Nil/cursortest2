package yads;

/* loaded from: classes12.dex */
public final class ic2 implements ix2 {
    public jw0 a;
    public m73 b;
    public c83 c;

    public ic2(String str) {
        iw0 iw0Var = new iw0();
        iw0Var.k = str;
        this.a = new jw0(iw0Var);
    }

    @Override // yads.ix2
    public final void a(m73 m73Var, wp0 wp0Var, z93 z93Var) {
        this.b = m73Var;
        z93Var.a();
        z93Var.b();
        c83 a = wp0Var.a(z93Var.d, 5);
        this.c = a;
        a.a(this.a);
    }

    @Override // yads.ix2
    public final void a(xb2 xb2Var) {
        long a;
        long j;
        m73 m73Var = this.b;
        if (m73Var != null) {
            int i = sb3.a;
            synchronized (m73Var) {
                try {
                    long j2 = m73Var.c;
                    if (j2 != -9223372036854775807L) {
                        a = j2 + m73Var.b;
                    } else {
                        a = m73Var.a();
                    }
                    j = a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            long b = this.b.b();
            if (j == -9223372036854775807L || b == -9223372036854775807L) {
                return;
            }
            jw0 jw0Var = this.a;
            if (b != jw0Var.q) {
                iw0 iw0Var = new iw0(jw0Var);
                iw0Var.o = b;
                jw0 jw0Var2 = new jw0(iw0Var);
                this.a = jw0Var2;
                this.c.a(jw0Var2);
            }
            int i2 = xb2Var.c - xb2Var.b;
            this.c.a(i2, xb2Var);
            this.c.a(j, 1, i2, 0, null);
            return;
        }
        throw new IllegalStateException();
    }
}
