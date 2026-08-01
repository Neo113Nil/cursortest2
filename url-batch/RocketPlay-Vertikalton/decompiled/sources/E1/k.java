package E1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends A1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f322g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f320e = i;
        this.f321f = obj;
        this.f322g = obj2;
    }

    @Override // A1.a
    public final long a() {
        long a2;
        y[] yVarArr;
        y[] yVarArr2;
        int i = 0;
        switch (this.f320e) {
            case 0:
                q qVar = (q) this.f321f;
                qVar.f338a.a(qVar, (D) ((i1.i) this.f322g).f3051b);
                return -1L;
            case 1:
                try {
                    ((q) this.f321f).f338a.b((y) this.f322g);
                    return -1L;
                } catch (IOException e2) {
                    F1.n nVar = F1.n.f424a;
                    F1.n nVar2 = F1.n.f424a;
                    String str = "Http2Connection.Listener failure for " + ((q) this.f321f).f340c;
                    nVar2.getClass();
                    F1.n.i(str, 4, e2);
                    try {
                        ((y) this.f322g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                m mVar = (m) this.f321f;
                D d = (D) this.f322g;
                mVar.getClass();
                i1.i iVar = new i1.i(0);
                q qVar2 = mVar.f327b;
                synchronized (qVar2.f357w) {
                    synchronized (qVar2) {
                        try {
                            D d2 = qVar2.f351q;
                            D d3 = new D();
                            d3.b(d2);
                            d3.b(d);
                            iVar.f3051b = d3;
                            a2 = d3.a() - d2.a();
                            if (a2 != 0 && !qVar2.f339b.isEmpty()) {
                                yVarArr = (y[]) qVar2.f339b.values().toArray(new y[0]);
                                yVarArr2 = yVarArr;
                                D d4 = (D) iVar.f3051b;
                                i1.f.e(d4, "<set-?>");
                                qVar2.f351q = d4;
                                qVar2.f344j.c(new k(qVar2.f340c + " onSettings", qVar2, iVar, i), 0L);
                            }
                            yVarArr = null;
                            yVarArr2 = yVarArr;
                            D d42 = (D) iVar.f3051b;
                            i1.f.e(d42, "<set-?>");
                            qVar2.f351q = d42;
                            qVar2.f344j.c(new k(qVar2.f340c + " onSettings", qVar2, iVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        qVar2.f357w.a((D) iVar.f3051b);
                    } catch (IOException e3) {
                        qVar2.a(2, 2, e3);
                    }
                }
                if (yVarArr2 == null) {
                    return -1L;
                }
                int length = yVarArr2.length;
                while (i < length) {
                    y yVar = yVarArr2[i];
                    synchronized (yVar) {
                        yVar.f387f += a2;
                        if (a2 > 0) {
                            yVar.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}
