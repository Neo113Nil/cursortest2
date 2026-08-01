package n1;

import i1.k;
import i1.n;
import i1.s;
import i1.t;
import i1.u;
import i1.v;
import java.io.IOException;
import java.net.ProtocolException;
import m1.j;
import m1.m;
import p1.C0284a;
import q1.l;

/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // i1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(f fVar) {
        IOException iOException;
        u a2;
        v vVar;
        m1.e eVar = fVar.d;
        X0.e.b(eVar);
        j jVar = eVar.f3210a;
        d dVar = eVar.f3212c;
        m mVar = eVar.f3213e;
        H.e eVar2 = fVar.f3308e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                X0.e.e(jVar, "call");
                dVar.d(eVar2);
                s.o((String) eVar2.f212b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0284a) {
                    throw e2;
                }
                if (!eVar.d) {
                    throw e2;
                }
                iOException = e2;
            }
            try {
                dVar.a();
                iOException = null;
                try {
                    t c2 = eVar.c(false);
                    X0.e.b(c2);
                    X0.e.e(jVar, "call");
                    c2.f2509a = eVar2;
                    c2.f2512e = mVar.f3242e;
                    c2.f2516k = currentTimeMillis;
                    c2.f2517l = System.currentTimeMillis();
                    u a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        X0.e.e(jVar, "call");
                        t f2 = a3.f();
                        f2.f2514g = eVar.b(a3);
                        a2 = f2.a();
                        if (!"close".equalsIgnoreCase(((k) a2.f2519a.d).a("Connection")) || "close".equalsIgnoreCase(u.e(a2, "Connection"))) {
                            dVar.g().k();
                        }
                        if (i != 204 || i == 205) {
                            vVar = a2.f2524g;
                            if ((vVar == null ? vVar.e() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i);
                                sb.append(" had non-zero Content-Length: ");
                                sb.append(vVar != null ? Long.valueOf(vVar.e()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a2;
                    }
                    t c3 = eVar.c(false);
                    X0.e.b(c3);
                    c3.f2509a = eVar2;
                    c3.f2512e = mVar.f3242e;
                    c3.f2516k = currentTimeMillis;
                    c3.f2517l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    X0.e.e(jVar, "call");
                    t f22 = a3.f();
                    f22.f2514g = eVar.b(a3);
                    a2 = f22.a();
                    if (!"close".equalsIgnoreCase(((k) a2.f2519a.d).a("Connection"))) {
                    }
                    dVar.g().k();
                    if (i != 204) {
                    }
                    vVar = a2.f2524g;
                    if ((vVar == null ? vVar.e() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    l.d(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            X0.e.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
