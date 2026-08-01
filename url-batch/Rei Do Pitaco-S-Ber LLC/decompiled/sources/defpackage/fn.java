package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fn extends k40 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.k40
    public final long a() {
        long a;
        tn[] tnVarArr;
        switch (this.e) {
            case 0:
                mn mnVar = (mn) this.f;
                mnVar.f.a(mnVar, (k10) ((gz) this.g).g);
                return -1L;
            case 1:
                try {
                    ((mn) this.f).f.b((tn) this.g);
                } catch (IOException e) {
                    jw jwVar = jw.a;
                    jw jwVar2 = jw.a;
                    String str = "Http2Connection.Listener failure for " + ((mn) this.f).h;
                    jwVar2.getClass();
                    jw.i(str, 4, e);
                    try {
                        ((tn) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                hn hnVar = (hn) this.f;
                k10 k10Var = (k10) this.g;
                int i = 0;
                gz gzVar = new gz(0);
                mn mnVar2 = hnVar.g;
                synchronized (mnVar2.B) {
                    synchronized (mnVar2) {
                        try {
                            k10 k10Var2 = mnVar2.v;
                            k10 k10Var3 = new k10();
                            k10Var2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & k10Var2.a) != 0) {
                                    k10Var3.b(i2, k10Var2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & k10Var.a) != 0) {
                                    k10Var3.b(i3, k10Var.b[i3]);
                                }
                            }
                            gzVar.g = k10Var3;
                            a = k10Var3.a() - k10Var2.a();
                            if (a != 0 && !mnVar2.g.isEmpty()) {
                                tnVarArr = (tn[]) mnVar2.g.values().toArray(new tn[0]);
                                k10 k10Var4 = (k10) gzVar.g;
                                k10Var4.getClass();
                                mnVar2.v = k10Var4;
                                mnVar2.o.c(new fn(mnVar2.h + " onSettings", mnVar2, gzVar, i), 0L);
                            }
                            tnVarArr = null;
                            k10 k10Var42 = (k10) gzVar.g;
                            k10Var42.getClass();
                            mnVar2.v = k10Var42;
                            mnVar2.o.c(new fn(mnVar2.h + " onSettings", mnVar2, gzVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        mnVar2.B.m((k10) gzVar.g);
                    } catch (IOException e2) {
                        mnVar2.m(2, 2, e2);
                    }
                }
                if (tnVarArr != null) {
                    int length = tnVarArr.length;
                    while (i < length) {
                        tn tnVar = tnVarArr[i];
                        synchronized (tnVar) {
                            tnVar.f += a;
                            if (a > 0) {
                                tnVar.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
