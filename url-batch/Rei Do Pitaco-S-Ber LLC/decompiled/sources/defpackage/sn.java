package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class sn extends s6 {
    public final /* synthetic */ tn m;

    public sn(tn tnVar) {
        this.m = tnVar;
    }

    @Override // defpackage.s6
    public final void j() {
        this.m.e(9);
        mn mnVar = this.m.b;
        synchronized (mnVar) {
            long j = mnVar.s;
            long j2 = mnVar.r;
            if (j < j2) {
                return;
            }
            mnVar.r = j2 + 1;
            mnVar.t = System.nanoTime() + 1000000000;
            mnVar.m.c(new kn(0, mnVar, mnVar.h + " ping"), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
