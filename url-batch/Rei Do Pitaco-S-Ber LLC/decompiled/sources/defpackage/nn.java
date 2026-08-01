package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class nn implements fi {
    public static final List g = z60.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = z60.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final wx a;
    public final yx b;
    public final mn c;
    public volatile tn d;
    public final bx e;
    public volatile boolean f;

    public nn(fv fvVar, wx wxVar, yx yxVar, mn mnVar) {
        mnVar.getClass();
        this.a = wxVar;
        this.b = yxVar;
        this.c = mnVar;
        List list = fvVar.w;
        bx bxVar = bx.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(bxVar) ? bxVar : bx.HTTP_2;
    }

    @Override // defpackage.fi
    public final void a(po poVar) {
        int i;
        tn tnVar;
        if (this.d != null) {
            return;
        }
        nm nmVar = (nm) poVar.d;
        ArrayList arrayList = new ArrayList(nmVar.size() + 4);
        arrayList.add(new mm(mm.f, (String) poVar.c));
        r8 r8Var = mm.g;
        xn xnVar = (xn) poVar.b;
        xnVar.getClass();
        String b = xnVar.b();
        String d = xnVar.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new mm(r8Var, b));
        String a = nmVar.a("Host");
        if (a != null) {
            arrayList.add(new mm(mm.i, a));
        }
        arrayList.add(new mm(mm.h, xnVar.a));
        int size = nmVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = nmVar.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && oo.b(nmVar.d(i2), "trailers"))) {
                arrayList.add(new mm(lowerCase, nmVar.d(i2)));
            }
        }
        mn mnVar = this.c;
        mnVar.getClass();
        boolean z = !false;
        synchronized (mnVar.B) {
            synchronized (mnVar) {
                try {
                    if (mnVar.j > 1073741823) {
                        mnVar.p(8);
                    }
                    if (mnVar.k) {
                        throw new ub();
                    }
                    i = mnVar.j;
                    mnVar.j = i + 2;
                    tnVar = new tn(i, mnVar, z, false, null);
                    if (tnVar.g()) {
                        mnVar.g.put(Integer.valueOf(i), tnVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            mnVar.B.q(z, i, arrayList);
        }
        mnVar.B.flush();
        this.d = tnVar;
        boolean z2 = this.f;
        tn tnVar2 = this.d;
        if (z2) {
            tnVar2.getClass();
            tnVar2.e(9);
            l8.y("Canceled");
        } else {
            tnVar2.getClass();
            tnVar2.k.g(this.b.g);
            tn tnVar3 = this.d;
            tnVar3.getClass();
            tnVar3.l.g(this.b.h);
        }
    }

    @Override // defpackage.fi
    public final p20 b(zz zzVar) {
        tn tnVar = this.d;
        tnVar.getClass();
        return tnVar.i;
    }

    @Override // defpackage.fi
    public final void c() {
        tn tnVar = this.d;
        tnVar.getClass();
        synchronized (tnVar) {
            if (!tnVar.h && !tnVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        tnVar.j.close();
    }

    @Override // defpackage.fi
    public final void cancel() {
        this.f = true;
        tn tnVar = this.d;
        if (tnVar != null) {
            tnVar.e(9);
        }
    }

    @Override // defpackage.fi
    public final void d() {
        this.c.flush();
    }

    @Override // defpackage.fi
    public final long e(zz zzVar) {
        if (vn.a(zzVar)) {
            return z60.h(zzVar);
        }
        return 0L;
    }

    @Override // defpackage.fi
    public final yz f(boolean z) {
        nm nmVar;
        tn tnVar = this.d;
        if (tnVar == null) {
            l8.y("stream wasn't created");
            return null;
        }
        synchronized (tnVar) {
            tnVar.k.h();
            while (tnVar.g.isEmpty() && tnVar.m == 0) {
                try {
                    try {
                        tnVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    tnVar.k.k();
                    throw th;
                }
            }
            tnVar.k.k();
            if (tnVar.g.isEmpty()) {
                IOException iOException = tnVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = tnVar.m;
                if (i != 0) {
                    throw new l30(i);
                }
                throw null;
            }
            Object removeFirst = tnVar.g.removeFirst();
            removeFirst.getClass();
            nmVar = (nm) removeFirst;
        }
        bx bxVar = this.e;
        bxVar.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = nmVar.size();
        k4 k4Var = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b = nmVar.b(i2);
            String d = nmVar.d(i2);
            if (oo.b(b, ":status")) {
                k4Var = oo.E("HTTP/1.1 " + d);
            } else if (!h.contains(b)) {
                b.getClass();
                d.getClass();
                arrayList.add(b);
                arrayList.add(m30.x0(d).toString());
            }
        }
        if (k4Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        yz yzVar = new yz();
        yzVar.b = bxVar;
        yzVar.c = k4Var.b;
        yzVar.d = (String) k4Var.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        j0 j0Var = new j0(21);
        ArrayList arrayList2 = (ArrayList) j0Var.g;
        arrayList2.getClass();
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList2.addAll(asList);
        yzVar.f = j0Var;
        if (z && yzVar.c == 100) {
            return null;
        }
        return yzVar;
    }

    @Override // defpackage.fi
    public final wx g() {
        return this.a;
    }
}
