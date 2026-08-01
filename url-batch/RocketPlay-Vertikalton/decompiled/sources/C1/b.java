package C1;

import B1.j;
import E1.C0000a;
import F1.l;
import java.io.IOException;
import java.net.ProtocolException;
import x1.m;
import x1.r;
import x1.s;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // x1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(g gVar) {
        IOException iOException;
        s a2;
        h hVar;
        B1.e eVar = gVar.d;
        i1.f.b(eVar);
        j jVar = eVar.f174a;
        e eVar2 = eVar.f176c;
        B1.m mVar = eVar.f177e;
        H.e eVar3 = gVar.f256e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                i1.f.e(jVar, "call");
                eVar2.e(eVar3);
                l.d0((String) eVar3.f546b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0000a) {
                    throw e2;
                }
                if (!eVar.d) {
                    throw e2;
                }
                iOException = e2;
            }
            try {
                eVar2.a();
                iOException = null;
                try {
                    r c2 = eVar.c(false);
                    i1.f.b(c2);
                    i1.f.e(jVar, "call");
                    c2.f4590a = eVar3;
                    c2.f4593e = mVar.f206e;
                    c2.f4597k = currentTimeMillis;
                    c2.f4598l = System.currentTimeMillis();
                    s a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        i1.f.e(jVar, "call");
                        r f2 = a3.f();
                        f2.f4595g = eVar.b(a3);
                        a2 = f2.a();
                        if (!"close".equalsIgnoreCase(((x1.j) a2.f4600a.d).a("Connection")) || "close".equalsIgnoreCase(s.a("Connection", a2))) {
                            eVar2.g().k();
                        }
                        if (i != 204 || i == 205) {
                            hVar = a2.f4605g;
                            if ((hVar == null ? hVar.a() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i);
                                sb.append(" had non-zero Content-Length: ");
                                sb.append(hVar != null ? Long.valueOf(hVar.a()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a2;
                    }
                    r c3 = eVar.c(false);
                    i1.f.b(c3);
                    c3.f4590a = eVar3;
                    c3.f4593e = mVar.f206e;
                    c3.f4597k = currentTimeMillis;
                    c3.f4598l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    i1.f.e(jVar, "call");
                    r f22 = a3.f();
                    f22.f4595g = eVar.b(a3);
                    a2 = f22.a();
                    if (!"close".equalsIgnoreCase(((x1.j) a2.f4600a.d).a("Connection"))) {
                    }
                    eVar2.g().k();
                    if (i != 204) {
                    }
                    hVar = a2.f4605g;
                    if ((hVar == null ? hVar.a() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    F1.d.k(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            i1.f.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
