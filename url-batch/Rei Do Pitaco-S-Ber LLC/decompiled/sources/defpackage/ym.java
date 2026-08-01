package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ym extends xm {
    public final xn i;
    public long j;
    public boolean k;
    public final /* synthetic */ bn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(bn bnVar, xn xnVar) {
        super(bnVar);
        xnVar.getClass();
        this.l = bnVar;
        this.i = xnVar;
        this.j = -1L;
        this.k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r9.k == false) goto L25;
     */
    @Override // defpackage.xm, defpackage.p20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j, m8 m8Var) {
        bn bnVar = this.l;
        o8 o8Var = bnVar.c;
        if (this.g) {
            l8.u("closed");
            return 0L;
        }
        if (this.k) {
            long j2 = this.j;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    o8Var.d();
                }
                try {
                    this.j = o8Var.k();
                    String obj = m30.x0(o8Var.d()).toString();
                    if (this.j < 0 || (obj.length() > 0 && !u30.l0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.j + obj + '\"');
                    }
                    if (this.j == 0) {
                        this.k = false;
                        bnVar.g = bnVar.f.f();
                        fv fvVar = bnVar.a;
                        fvVar.getClass();
                        tg tgVar = fvVar.o;
                        nm nmVar = bnVar.g;
                        nmVar.getClass();
                        vn.b(tgVar, this.i, nmVar);
                        m();
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long b = super.b(Math.min(8192L, this.j), m8Var);
            if (b != -1) {
                this.j -= b;
                return b;
            }
            bnVar.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.g) {
            return;
        }
        if (this.k) {
            byte[] bArr = z60.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = z60.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.l.b.k();
                m();
            }
        }
        this.g = true;
    }
}
