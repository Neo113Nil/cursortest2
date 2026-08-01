package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zm extends xm {
    public long i;
    public final /* synthetic */ bn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(bn bnVar, long j) {
        super(bnVar);
        this.j = bnVar;
        this.i = j;
        if (j == 0) {
            m();
        }
    }

    @Override // defpackage.xm, defpackage.p20
    public final long b(long j, m8 m8Var) {
        if (this.g) {
            l8.u("closed");
            return 0L;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1L;
        }
        long b = super.b(Math.min(j2, 8192L), m8Var);
        if (b == -1) {
            this.j.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        long j3 = this.i - b;
        this.i = j3;
        if (j3 == 0) {
            m();
        }
        return b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.g) {
            return;
        }
        if (this.i != 0) {
            byte[] bArr = z60.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = z60.r(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.j.b.k();
                m();
            }
        }
        this.g = true;
    }
}
