package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class di implements p20 {
    public final p20 f;
    public final long g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ ei l;

    public di(ei eiVar, p20 p20Var, long j) {
        p20Var.getClass();
        this.l = eiVar;
        this.f = p20Var;
        this.g = j;
        this.i = true;
        if (j == 0) {
            n(null);
        }
    }

    @Override // defpackage.p20
    public final e50 a() {
        return this.f.a();
    }

    @Override // defpackage.p20
    public final long b(long j, m8 m8Var) {
        if (this.k) {
            l8.u("closed");
            return 0L;
        }
        try {
            long b = this.f.b(8192L, m8Var);
            if (this.i) {
                this.i = false;
            }
            if (b == -1) {
                n(null);
                return -1L;
            }
            long j2 = this.h + b;
            long j3 = this.g;
            if (j3 == -1 || j2 <= j3) {
                this.h = j2;
                if (j2 == j3) {
                    n(null);
                }
                return b;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw n(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        try {
            m();
            n(null);
        } catch (IOException e) {
            throw n(e);
        }
    }

    public final void m() {
        this.f.close();
    }

    public final IOException n(IOException iOException) {
        if (this.j) {
            return iOException;
        }
        this.j = true;
        if (iOException == null && this.i) {
            this.i = false;
        }
        ei eiVar = this.l;
        tx txVar = eiVar.a;
        if (iOException != null) {
            eiVar.b(iOException);
        }
        return txVar.g(eiVar, false, true, iOException);
    }

    public final String toString() {
        return di.class.getSimpleName() + '(' + this.f + ')';
    }
}
