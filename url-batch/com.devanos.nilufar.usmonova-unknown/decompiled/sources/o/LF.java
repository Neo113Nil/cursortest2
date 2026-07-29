package o;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LF implements InterfaceC0290Lb {
    public final AbstractC0533Ul a;
    public final CH b;
    public final SR c;
    public final HF d;
    public final Y6 e;
    public final C0762bE f;

    public LF(AbstractC0533Ul abstractC0533Ul, CH ch, SR sr, HF hf) {
        AbstractC0048Bt.n(abstractC0533Ul, "fileSystem");
        AbstractC0048Bt.n(ch, "path");
        AbstractC0048Bt.n(sr, "coordinator");
        this.a = abstractC0533Ul;
        this.b = ch;
        this.c = sr;
        this.d = hf;
        this.e = new Y6();
        this.f = new C0762bE();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:54|55))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:21:0x007b, B:28:0x008b, B:31:0x0088, B:27:0x0083), top: B:7:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [o.LF] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o.JF] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.LF] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.NT] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(NT nt, AbstractC2367ze abstractC2367ze) {
        ?? r0;
        int i;
        GF gf;
        Throwable th;
        boolean z;
        LF lf;
        try {
            if (abstractC2367ze instanceof JF) {
                JF jf = (JF) abstractC2367ze;
                int i2 = jf.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jf.m = i2 - Integer.MIN_VALUE;
                    r0 = jf;
                    Object obj = r0.k;
                    i = r0.m;
                    if (i != 0) {
                        AbstractC1494mO.l(obj);
                        if (this.e.a.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d = this.f.d();
                        try {
                            gf = new GF(this.a, this.b);
                            try {
                                Boolean valueOf = Boolean.valueOf(d);
                                r0.h = this;
                                r0.i = gf;
                                r0.j = d;
                                r0.m = 1;
                                Object e = nt.e(gf, valueOf, r0);
                                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                                if (e == enumC0448Re) {
                                    return enumC0448Re;
                                }
                                obj = e;
                                z = d;
                                lf = this;
                            } catch (Throwable th2) {
                                th = th2;
                                nt = d;
                                r0 = this;
                                gf.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            nt = d;
                            r0 = this;
                            if (nt != 0) {
                                r0.f.e(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nt = r0.j;
                        gf = r0.i;
                        r0 = r0.h;
                        try {
                            AbstractC1494mO.l(obj);
                            lf = r0;
                            z = nt;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                gf.close();
                            } catch (Throwable th5) {
                                AbstractC0946e20.e(th, th5);
                            }
                            throw th;
                        }
                    }
                    gf.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z) {
                        lf.f.e(null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            gf.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (nt != 0) {
            }
            throw th;
        }
        r0 = new JF(this, abstractC2367ze);
        Object obj2 = r0.k;
        i = r0.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3 A[Catch: all -> 0x0103, IOException -> 0x0106, TRY_ENTER, TryCatch #9 {IOException -> 0x0106, all -> 0x0103, blocks: (B:18:0x00f3, B:20:0x00fb, B:24:0x0112, B:31:0x0120, B:34:0x011d, B:30:0x0118), top: B:7:0x0021, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112 A[Catch: all -> 0x0103, IOException -> 0x0106, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x0106, all -> 0x0103, blocks: (B:18:0x00f3, B:20:0x00fb, B:24:0x0112, B:31:0x0120, B:34:0x011d, B:30:0x0118), top: B:7:0x0021, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [o.LF] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o.KF, o.ze] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.Ul] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, o.Ul] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v8, types: [o.yp] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, o.bE] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.CH] */
    /* JADX WARN: Type inference failed for: r1v5, types: [o.CH] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [o.CH] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9, types: [o.ZD] */
    /* JADX WARN: Type inference failed for: r8v2, types: [o.Ul] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C0631Yf c0631Yf, AbstractC2367ze abstractC2367ze) {
        ?? r0;
        Object obj;
        ?? r1;
        ?? r2;
        EnumC0448Re enumC0448Re;
        LF lf;
        CH c;
        ZD zd;
        ?? r10;
        NF nf;
        Throwable th;
        InterfaceC0290Lb interfaceC0290Lb;
        ZD zd2;
        LF lf2;
        CH ch;
        try {
            try {
                try {
                    try {
                        if (abstractC2367ze instanceof KF) {
                            KF kf = (KF) abstractC2367ze;
                            int i = kf.n;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                kf.n = i - Integer.MIN_VALUE;
                                r0 = kf;
                                obj = r0.l;
                                r1 = r0.n;
                                r2 = 2;
                                r2 = 2;
                                enumC0448Re = EnumC0448Re.h;
                                if (r1 != 0) {
                                    AbstractC1494mO.l(obj);
                                    if (this.e.a.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    c = this.b.c();
                                    if (c == null) {
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    AbstractC0533Ul abstractC0533Ul = this.a;
                                    abstractC0533Ul.getClass();
                                    D6 d6 = new D6();
                                    for (CH ch2 = c; ch2 != null && !abstractC0533Ul.d(ch2); ch2 = ch2.c()) {
                                        d6.addFirst(ch2);
                                    }
                                    Iterator it = d6.iterator();
                                    while (it.hasNext()) {
                                        CH ch3 = (CH) it.next();
                                        AbstractC0048Bt.n(ch3, "dir");
                                        abstractC0533Ul.b(ch3);
                                    }
                                    r0.h = this;
                                    r0.i = c0631Yf;
                                    r0.j = c;
                                    ?? r11 = this.f;
                                    r0.k = r11;
                                    r0.n = 1;
                                    if (r11.c(r0) != enumC0448Re) {
                                        lf = this;
                                        r10 = c0631Yf;
                                        zd = r11;
                                    }
                                    return enumC0448Re;
                                }
                                if (r1 != 1) {
                                    if (r1 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    interfaceC0290Lb = (InterfaceC0290Lb) r0.k;
                                    r1 = r0.j;
                                    r2 = (ZD) r0.i;
                                    r0 = r0.h;
                                    try {
                                        AbstractC1494mO.l(obj);
                                        lf2 = r0;
                                        ch = r1;
                                        zd2 = r2;
                                        try {
                                            interfaceC0290Lb.close();
                                            th = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (lf2.a.d(ch)) {
                                            lf2.a.a(ch, lf2.b);
                                        }
                                        ((C0762bE) zd2).e(null);
                                        return C0782bY.a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            interfaceC0290Lb.close();
                                        } catch (Throwable th4) {
                                            AbstractC0946e20.e(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                                ZD zd3 = (ZD) r0.k;
                                c = r0.j;
                                InterfaceC2312yp interfaceC2312yp = (InterfaceC2312yp) r0.i;
                                lf = r0.h;
                                AbstractC1494mO.l(obj);
                                zd = zd3;
                                r10 = interfaceC2312yp;
                                StringBuilder sb = new StringBuilder();
                                CH ch4 = lf.b;
                                ?? r8 = lf.a;
                                sb.append(ch4.b());
                                sb.append(".tmp");
                                r1 = c.e(sb.toString());
                                r8.c(r1);
                                nf = new NF(r8, r1);
                                r0.h = lf;
                                r0.i = zd;
                                r0.j = r1;
                                r0.k = nf;
                                r0.n = 2;
                                if (r10.invoke(nf, r0) != enumC0448Re) {
                                    zd2 = zd;
                                    interfaceC0290Lb = nf;
                                    lf2 = lf;
                                    ch = r1;
                                    interfaceC0290Lb.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return enumC0448Re;
                            }
                        }
                        r0.h = lf;
                        r0.i = zd;
                        r0.j = r1;
                        r0.k = nf;
                        r0.n = 2;
                        if (r10.invoke(nf, r0) != enumC0448Re) {
                        }
                        return enumC0448Re;
                    } catch (Throwable th5) {
                        r2 = zd;
                        r0 = lf;
                        th = th5;
                        interfaceC0290Lb = nf;
                        interfaceC0290Lb.close();
                        throw th;
                    }
                    r8.c(r1);
                    nf = new NF(r8, r1);
                } catch (IOException e) {
                    e = e;
                    if (lf.a.d(r1)) {
                        try {
                            ?? r02 = lf.a;
                            r02.getClass();
                            r02.c(r1);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                if (r1 != 0) {
                }
                StringBuilder sb2 = new StringBuilder();
                CH ch42 = lf.b;
                ?? r82 = lf.a;
                sb2.append(ch42.b());
                sb2.append(".tmp");
                r1 = c.e(sb2.toString());
            } catch (Throwable th6) {
                th = th6;
                ((C0762bE) obj).e(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            lf = r0;
            if (lf.a.d(r1)) {
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            obj = r2;
            ((C0762bE) obj).e(null);
            throw th;
        }
        r0 = new KF(this, abstractC2367ze);
        obj = r0.l;
        r1 = r0.n;
        r2 = 2;
        r2 = 2;
        enumC0448Re = EnumC0448Re.h;
    }

    @Override // o.InterfaceC0290Lb
    public final void close() {
        this.e.a.set(true);
        this.d.invoke();
    }
}
