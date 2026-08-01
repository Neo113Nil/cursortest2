package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t8 implements no {
    public static final t8 b = new t8(1);
    public final /* synthetic */ int a;

    public /* synthetic */ t8(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r13 < 200) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8 A[Catch: IOException -> 0x008e, TryCatch #6 {IOException -> 0x008e, blocks: (B:11:0x004a, B:14:0x0072, B:15:0x0091, B:18:0x00b2, B:20:0x00cb, B:28:0x00e4, B:30:0x00e8, B:33:0x00f5, B:35:0x0108, B:36:0x0110, B:37:0x011a, B:39:0x00d5, B:42:0x011d, B:43:0x0120, B:17:0x0095), top: B:10:0x004a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5 A[Catch: IOException -> 0x008e, TryCatch #6 {IOException -> 0x008e, blocks: (B:11:0x004a, B:14:0x0072, B:15:0x0091, B:18:0x00b2, B:20:0x00cb, B:28:0x00e4, B:30:0x00e8, B:33:0x00f5, B:35:0x0108, B:36:0x0110, B:37:0x011a, B:39:0x00d5, B:42:0x011d, B:43:0x0120, B:17:0x0095), top: B:10:0x004a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Throwable] */
    @Override // defpackage.no
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zz a(yx yxVar) {
        nm nmVar;
        IOException iOException;
        zz a;
        po poVar;
        b00 b00Var;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                po poVar2 = yxVar.e;
                int i = 7;
                o4 o4Var = new o4(poVar2, r4, i);
                s8 s8Var = (s8) poVar2.f;
                if (s8Var == null) {
                    int i2 = s8.n;
                    s8Var = m60.O((nm) poVar2.d);
                    poVar2.f = s8Var;
                }
                if (s8Var.j) {
                    o4Var = new o4(r4, r4, i);
                }
                po poVar3 = (po) o4Var.g;
                zz zzVar = (zz) o4Var.h;
                if (poVar3 == null && zzVar == null) {
                    return new zz(poVar2, bx.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new nm((String[]) new ArrayList(20).toArray(new String[0])), z60.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (poVar3 == null) {
                    zzVar.getClass();
                    yz n = zzVar.n();
                    zz g = tg.g(zzVar);
                    yz.b(g, "cacheResponse");
                    n.i = g;
                    return n.a();
                }
                zz b2 = yxVar.b(poVar3);
                if (zzVar != null) {
                    if (b2.i == 304) {
                        yz n2 = zzVar.n();
                        nm nmVar2 = zzVar.k;
                        nm nmVar3 = b2.k;
                        ArrayList arrayList = new ArrayList(20);
                        int size = nmVar2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            String b3 = nmVar2.b(i3);
                            Long l = r4;
                            String d = nmVar2.d(i3);
                            if ("Warning".equalsIgnoreCase(b3)) {
                                nmVar = nmVar2;
                                if (u30.l0(d, "1", false)) {
                                    i3++;
                                    r4 = l;
                                    nmVar2 = nmVar;
                                }
                            } else {
                                nmVar = nmVar2;
                            }
                            if ("Content-Length".equalsIgnoreCase(b3) || "Content-Encoding".equalsIgnoreCase(b3) || "Content-Type".equalsIgnoreCase(b3) || !tg.p(b3) || nmVar3.a(b3) == null) {
                                b3.getClass();
                                d.getClass();
                                arrayList.add(b3);
                                arrayList.add(m30.x0(d).toString());
                            }
                            i3++;
                            r4 = l;
                            nmVar2 = nmVar;
                        }
                        ?? r24 = r4;
                        int size2 = nmVar3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            String b4 = nmVar3.b(i4);
                            if (!"Content-Length".equalsIgnoreCase(b4) && !"Content-Encoding".equalsIgnoreCase(b4) && !"Content-Type".equalsIgnoreCase(b4) && tg.p(b4)) {
                                String d2 = nmVar3.d(i4);
                                b4.getClass();
                                d2.getClass();
                                arrayList.add(b4);
                                arrayList.add(m30.x0(d2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        j0 j0Var = new j0(21);
                        ArrayList arrayList2 = (ArrayList) j0Var.g;
                        arrayList2.getClass();
                        strArr.getClass();
                        List asList = Arrays.asList(strArr);
                        asList.getClass();
                        arrayList2.addAll(asList);
                        n2.f = j0Var;
                        n2.k = b2.p;
                        n2.l = b2.q;
                        zz g2 = tg.g(zzVar);
                        yz.b(g2, "cacheResponse");
                        n2.i = g2;
                        zz g3 = tg.g(b2);
                        yz.b(g3, "networkResponse");
                        n2.h = g3;
                        n2.a();
                        b00 b00Var2 = b2.l;
                        b00Var2.getClass();
                        b00Var2.close();
                        throw r24;
                    }
                    b00 b00Var3 = zzVar.l;
                    if (b00Var3 != null) {
                        z60.b(b00Var3);
                    }
                }
                yz n3 = b2.n();
                zz g4 = tg.g(zzVar);
                yz.b(g4, "cacheResponse");
                n3.i = g4;
                zz g5 = tg.g(b2);
                yz.b(g5, "networkResponse");
                n3.h = g5;
                return n3.a();
            case 1:
                tx txVar = yxVar.a;
                synchronized (txVar) {
                    try {
                        if (!txVar.q) {
                            throw new IllegalStateException("released");
                        }
                        if (txVar.p) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (txVar.o) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gi giVar = txVar.l;
                giVar.getClass();
                fv fvVar = txVar.f;
                try {
                    ei eiVar = new ei(txVar, giVar, giVar.a(yxVar.f, yxVar.g, yxVar.h, fvVar.k, !oo.b((String) yxVar.e.c, "GET")).j(fvVar, yxVar));
                    txVar.n = eiVar;
                    txVar.s = eiVar;
                    synchronized (txVar) {
                        txVar.o = true;
                        txVar.p = true;
                    }
                    if (!txVar.r) {
                        return yx.a(yxVar, 0, eiVar, null, 61).b(yxVar.e);
                    }
                    l8.y("Canceled");
                    return null;
                } catch (j00 e) {
                    giVar.b(e.g);
                    throw e;
                } catch (IOException e2) {
                    giVar.b(e2);
                    throw new j00(e2);
                }
            default:
                ei eiVar2 = yxVar.d;
                eiVar2.getClass();
                tx txVar2 = eiVar2.a;
                fi fiVar = eiVar2.c;
                wx wxVar = eiVar2.e;
                po poVar4 = yxVar.e;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        fiVar.a(poVar4);
                        vv.E((String) poVar4.c);
                        txVar2.g(eiVar2, true, false, null);
                    } catch (IOException e3) {
                        if (e3 instanceof ub) {
                            throw e3;
                        }
                        if (!eiVar2.d) {
                            throw e3;
                        }
                        iOException = e3;
                    }
                    try {
                        fiVar.c();
                        iOException = null;
                        try {
                            yz a2 = eiVar2.a(false);
                            a2.getClass();
                            a2.a = poVar4;
                            a2.e = wxVar.e;
                            a2.k = currentTimeMillis;
                            a2.l = System.currentTimeMillis();
                            zz a3 = a2.a();
                            int i5 = a3.i;
                            try {
                                if (i5 != 100) {
                                    if (102 <= i5) {
                                        break;
                                    }
                                    yz n4 = a3.n();
                                    String m = zz.m(a3, "Content-Type");
                                    long e4 = fiVar.e(a3);
                                    n4.g = new zx(m, e4, new px(new di(eiVar2, fiVar.b(a3), e4)));
                                    a = n4.a();
                                    poVar = a.f;
                                    poVar.getClass();
                                    if (!"close".equalsIgnoreCase(((nm) poVar.d).a("Connection")) || "close".equalsIgnoreCase(zz.m(a, "Connection"))) {
                                        fiVar.g().k();
                                    }
                                    if (i5 != 204 || i5 == 205) {
                                        b00Var = a.l;
                                        if ((b00Var == null ? b00Var.m() : -1L) > 0) {
                                            StringBuilder sb = new StringBuilder("HTTP ");
                                            sb.append(i5);
                                            sb.append(" had non-zero Content-Length: ");
                                            b00 b00Var4 = a.l;
                                            sb.append(b00Var4 != null ? Long.valueOf(b00Var4.m()) : null);
                                            throw new ProtocolException(sb.toString());
                                        }
                                    }
                                    return a;
                                }
                                String m2 = zz.m(a3, "Content-Type");
                                long e42 = fiVar.e(a3);
                                n4.g = new zx(m2, e42, new px(new di(eiVar2, fiVar.b(a3), e42)));
                                a = n4.a();
                                poVar = a.f;
                                poVar.getClass();
                                if (!"close".equalsIgnoreCase(((nm) poVar.d).a("Connection"))) {
                                }
                                fiVar.g().k();
                                if (i5 != 204) {
                                }
                                b00Var = a.l;
                                if ((b00Var == null ? b00Var.m() : -1L) > 0) {
                                }
                                return a;
                            } catch (IOException e5) {
                                eiVar2.b(e5);
                                throw e5;
                            }
                            yz a4 = eiVar2.a(false);
                            a4.getClass();
                            a4.a = poVar4;
                            a4.e = wxVar.e;
                            a4.k = currentTimeMillis;
                            a4.l = System.currentTimeMillis();
                            a3 = a4.a();
                            i5 = a3.i;
                            yz n42 = a3.n();
                        } catch (IOException e6) {
                            if (iOException == null) {
                                throw e6;
                            }
                            vv.b(iOException, e6);
                            throw iOException;
                        }
                    } catch (IOException e7) {
                        eiVar2.b(e7);
                        throw e7;
                    }
                } catch (IOException e8) {
                    eiVar2.b(e8);
                    throw e8;
                }
        }
    }
}
