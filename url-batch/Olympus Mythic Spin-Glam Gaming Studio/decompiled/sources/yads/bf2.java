package yads;

import android.os.Handler;

/* loaded from: classes13.dex */
public final class bf2 implements c83 {
    public final xs2 a;
    public final kw0 b = new kw0();
    public final jt1 c = new jt1();
    public long d = -9223372036854775807L;
    public final /* synthetic */ cf2 e;

    public bf2(cf2 cf2Var, ub0 ub0Var) {
        this.e = cf2Var;
        this.a = new xs2(ub0Var, null, null);
    }

    @Override // yads.c83
    public final void a(jw0 jw0Var) {
        this.a.a(jw0Var);
    }

    @Override // yads.c83
    public final int a(n30 n30Var, int i, boolean z) {
        return this.a.b(n30Var, i, z);
    }

    @Override // yads.c83
    public final void a(int i, xb2 xb2Var) {
        this.a.a(i, xb2Var);
    }

    @Override // yads.c83
    public final void a(long j, int i, int i2, int i3, b83 b83Var) {
        long a;
        jt1 jt1Var;
        long j2;
        this.a.a(j, i, i2, i3, b83Var);
        while (this.a.a(false)) {
            this.c.b();
            if (this.a.a(this.b, (fb0) this.c, 0, false) == -4) {
                this.c.c();
                jt1Var = this.c;
            } else {
                jt1Var = null;
            }
            if (jt1Var != null) {
                long j3 = jt1Var.f;
                ht1 a2 = this.e.d.a(jt1Var);
                if (a2 != null) {
                    ym0 ym0Var = (ym0) a2.b[0];
                    String str = ym0Var.b;
                    String str2 = ym0Var.c;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = sb3.f(sb3.a(ym0Var.f));
                        } catch (cc2 unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            af2 af2Var = new af2(j3, j2);
                            Handler handler = this.e.e;
                            handler.sendMessage(handler.obtainMessage(1, af2Var));
                        }
                    }
                }
            }
        }
        xs2 xs2Var = this.a;
        us2 us2Var = xs2Var.a;
        synchronized (xs2Var) {
            int i4 = xs2Var.s;
            a = i4 == 0 ? -1L : xs2Var.a(i4);
        }
        us2Var.a(a);
    }
}
