package o;

import android.content.Context;
import android.view.inputmethod.BaseInputConnection;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* loaded from: classes.dex */
public final class LE extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LE(int i, Object obj) {
        super(0);
        this.h = i;
        this.i = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.vp] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, o.vp] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o.Fx] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v10 */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        InterfaceC0718aa e;
        int L;
        Throwable th;
        C1619oH c1619oH;
        C1619oH c1619oH2;
        DS ds;
        boolean z;
        DS ds2;
        DS ds3;
        boolean z2;
        int i;
        boolean z3 = true;
        C1619oH c1619oH3 = null;
        int i2 = 0;
        switch (this.h) {
            case 0:
                ?? r0 = (InterfaceC2114vp) this.i;
                C1823rO c1823rO = ME.D;
                r0.invoke(c1823rO);
                c1823rO.k = c1823rO.g.x(c1823rO.h, c1823rO.j, c1823rO.i);
                return C0782bY.a;
            case 1:
                ArrayList arrayList = ((GH) this.i).a;
                MD md = new MD(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ?? r5 = (C0156Fx) arrayList.get(i3);
                    Object obj = r5.b;
                    int i4 = r5.a;
                    Object c0308Lu = obj != null ? new C0308Lu(Integer.valueOf(i4), r5.b) : Integer.valueOf(i4);
                    int d = md.d(c0308Lu);
                    boolean z4 = d < 0;
                    Object obj2 = z4 ? null : md.c[d];
                    if (obj2 != null) {
                        if (!(obj2 instanceof List) || ((obj2 instanceof InterfaceC1594nw) && !(obj2 instanceof InterfaceC1726pw))) {
                            r5 = AbstractC0868ct.N(obj2, r5);
                        } else {
                            List e2 = AbstractC1305jX.e(obj2);
                            e2.add(r5);
                            r5 = e2;
                        }
                    }
                    if (z4) {
                        int i5 = ~d;
                        md.b[i5] = c0308Lu;
                        md.c[i5] = r5;
                    } else {
                        md.c[d] = r5;
                    }
                }
                return new ND(md);
            case 2:
                File file = (File) ((LE) this.i).invoke();
                String name = file.getName();
                AbstractC0048Bt.m(name, "getName(...)");
                if (UT.Q(name, '.', "").equals("preferences_pb")) {
                    String str = CH.i;
                    File absoluteFile = file.getAbsoluteFile();
                    AbstractC0048Bt.m(absoluteFile, "file.absoluteFile");
                    return C0218Ih.s(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 3:
                Context context = (Context) this.i;
                String concat = "p7_prefs".concat(".preferences_pb");
                AbstractC0048Bt.n(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            case 4:
                C1457lr c1457lr = ((PL) this.i).e;
                AbstractC0048Bt.k(c1457lr);
                List<Certificate> a = c1457lr.a();
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(a));
                for (Certificate certificate : a) {
                    AbstractC0048Bt.l(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList2.add((X509Certificate) certificate);
                }
                return arrayList2;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                C0901dM c0901dM = (C0901dM) this.i;
                synchronized (c0901dM.b) {
                    e = c0901dM.e();
                    if (((XL) c0901dM.r.getValue()).compareTo(XL.i) <= 0) {
                        throw PX.a("Recomposer shutdown; frame clock awaiter will never resume", c0901dM.d);
                    }
                }
                if (e != null) {
                    ((C0849ca) e).resumeWith(C0782bY.a);
                }
                return C0782bY.a;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                SN sn = (SN) this.i;
                ClassLoader classLoader = sn.b;
                AbstractC0533Ul abstractC0533Ul = sn.c;
                Enumeration<URL> resources = classLoader.getResources("");
                AbstractC0048Bt.m(resources, "getResources(...)");
                ArrayList<URL> list = Collections.list(resources);
                AbstractC0048Bt.m(list, "list(...)");
                ArrayList arrayList3 = new ArrayList();
                for (URL url : list) {
                    AbstractC0048Bt.k(url);
                    if (AbstractC0048Bt.h(url.getProtocol(), "file")) {
                        String str2 = CH.i;
                        c1619oH2 = new C1619oH(abstractC0533Ul, C0218Ih.s(new File(url.toURI())));
                    } else {
                        c1619oH2 = null;
                    }
                    if (c1619oH2 != null) {
                        arrayList3.add(c1619oH2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                AbstractC0048Bt.m(resources2, "getResources(...)");
                ArrayList<URL> list2 = Collections.list(resources2);
                AbstractC0048Bt.m(list2, "list(...)");
                ArrayList arrayList4 = new ArrayList();
                for (URL url2 : list2) {
                    AbstractC0048Bt.k(url2);
                    String url3 = url2.toString();
                    AbstractC0048Bt.m(url3, "toString(...)");
                    if (AbstractC0778bU.B(url3, "jar:file:", false) && (L = UT.L(url3, "!")) != -1) {
                        String str3 = CH.i;
                        String substring = url3.substring(4, L);
                        AbstractC0048Bt.m(substring, "substring(...)");
                        CH s = C0218Ih.s(new File(URI.create(substring)));
                        C0935dv f = abstractC0533Ul.f(s);
                        try {
                            long size2 = f.size() - 22;
                            long j = 0;
                            if (size2 < 0) {
                                throw new IOException("not a zip: size=" + f.size());
                            }
                            long max = Math.max(size2 - 65536, 0L);
                            while (true) {
                                JL h = AbstractC0946e20.h(f.c(size2));
                                long j2 = j;
                                try {
                                    if (h.j() == 101010256) {
                                        ?? m = h.m() & 65535;
                                        ?? m2 = h.m() & 65535;
                                        long m3 = h.m() & 65535;
                                        try {
                                            if (m3 != (h.m() & 65535) || m != 0 || m2 != 0) {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                            h.skip(4L);
                                            int m4 = h.m() & 65535;
                                            C2241xk c2241xk = new C2241xk(m3, h.j() & 4294967295L, m4);
                                            h.q(m4);
                                            try {
                                                h.close();
                                                long j3 = size2 - 20;
                                                if (j3 > j2) {
                                                    f = f;
                                                    JL h2 = AbstractC0946e20.h(f.c(j3));
                                                    try {
                                                        if (h2.j() == 117853008) {
                                                            int j4 = h2.j();
                                                            long k = h2.k();
                                                            if (h2.j() != 1 || j4 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            JL h3 = AbstractC0946e20.h(f.c(k));
                                                            try {
                                                                int j5 = h3.j();
                                                                if (j5 != 101075792) {
                                                                    throw new IOException("bad zip: expected " + AbstractC0773bP.c(101075792) + " but was " + AbstractC0773bP.c(j5));
                                                                }
                                                                h3.skip(12L);
                                                                int j6 = h3.j();
                                                                int j7 = h3.j();
                                                                long k2 = h3.k();
                                                                if (k2 != h3.k() || j6 != 0 || j7 != 0) {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                                h3.skip(8L);
                                                                C2241xk c2241xk2 = new C2241xk(k2, h3.k(), m4);
                                                                h3.close();
                                                                c2241xk = c2241xk2;
                                                            } catch (Throwable th2) {
                                                                try {
                                                                    throw th2;
                                                                } finally {
                                                                }
                                                            }
                                                        }
                                                        h2.close();
                                                    } finally {
                                                    }
                                                } else {
                                                    f = f;
                                                }
                                                C2241xk c2241xk3 = c2241xk;
                                                long j8 = c2241xk3.b;
                                                ArrayList arrayList5 = new ArrayList();
                                                JL h4 = AbstractC0946e20.h(f.c(j8));
                                                try {
                                                    long j9 = c2241xk3.a;
                                                    while (j2 < j9) {
                                                        C0750b20 d2 = AbstractC0773bP.d(h4);
                                                        if (d2.g >= j8) {
                                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                                        }
                                                        CH ch = SN.e;
                                                        if (C0140Fh.q(d2.a)) {
                                                            arrayList5.add(d2);
                                                        }
                                                        j2++;
                                                    }
                                                    h4.close();
                                                    C0815c20 c0815c20 = new C0815c20(s, abstractC0533Ul, AbstractC0773bP.a(arrayList5));
                                                    f.close();
                                                    c1619oH = new C1619oH(c0815c20, SN.e);
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } finally {
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                f = f;
                                                th = th;
                                                try {
                                                    throw th;
                                                } catch (Throwable th5) {
                                                    AbstractC1473m3.p(f, th);
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            h.close();
                                            throw th;
                                        }
                                    } else {
                                        h.close();
                                        size2--;
                                        if (size2 < max) {
                                            throw new IOException("not a zip: end of central directory signature not found");
                                        }
                                        j = j2;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            th = th;
                            throw th;
                        }
                    } else {
                        c1619oH = c1619oH3;
                    }
                    if (c1619oH != null) {
                        arrayList4.add(c1619oH);
                    }
                    c1619oH3 = null;
                }
                return AbstractC0720ac.A0(arrayList3, arrayList4);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC1807r8.H((InterfaceC0746b00) this.i);
            case 8:
                return (WB) ((C1168hQ) this.i).b.invoke(C1398ky.a);
            case 9:
                break;
            case 10:
                return DY.r(((C1631oT) this.i).a);
            case 11:
                C1172hU c1172hU = (C1172hU) this.i;
                return c1172hU.h(ON.h(c1172hU.b, null, 3));
            case 12:
                AbstractC1964tX f2 = ((C2096vX) this.i).f();
                f2.getClass();
                return new C2096vX(f2);
            case 13:
                return Float.valueOf(((InterfaceC0844cV) this.i).a());
            case 14:
                return new BaseInputConnection(((C0540Us) this.i).a, false);
            case 15:
                return C0273Kk.c(EnumC0247Jk.F, ((C0208Hx) this.i).toString());
            case 16:
                return (List) ((QY) this.i).s.getValue();
            default:
                C1177hZ c1177hZ = (C1177hZ) this.i;
                return BigInteger.valueOf(c1177hZ.h).shiftLeft(32).or(BigInteger.valueOf(c1177hZ.i)).shiftLeft(32).or(BigInteger.valueOf(c1177hZ.j));
        }
        while (true) {
            DS ds4 = (DS) this.i;
            synchronized (ds4.f) {
                try {
                    if (!ds4.c) {
                        ds4.c = z3;
                        try {
                            YD yd = ds4.f;
                            int i6 = yd.j;
                            if (i6 > 0) {
                                try {
                                    Object[] objArr = yd.h;
                                    int i7 = i2 == true ? 1 : 0;
                                    while (true) {
                                        CS cs = (CS) objArr[i7];
                                        QD qd = cs.g;
                                        InterfaceC2114vp interfaceC2114vp = cs.a;
                                        Object[] objArr2 = qd.b;
                                        long[] jArr = qd.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i8 = i2 == true ? 1 : 0;
                                            while (true) {
                                                long j10 = jArr[i8];
                                                ds2 = ds4;
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i9 = 8;
                                                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                                                    while (i2 < i10) {
                                                        if ((j10 & 255) < 128) {
                                                            i = i9;
                                                            try {
                                                                interfaceC2114vp.invoke(objArr2[(i8 << 3) + i2]);
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                ds = ds2;
                                                                z = false;
                                                                ds.c = z;
                                                                throw th;
                                                            }
                                                        } else {
                                                            i = i9;
                                                        }
                                                        j10 >>= i;
                                                        i2++;
                                                        i9 = i;
                                                    }
                                                    if (i10 != i9) {
                                                    }
                                                }
                                                if (i8 != length) {
                                                    i8++;
                                                    ds4 = ds2;
                                                    i2 = 0;
                                                }
                                            }
                                        } else {
                                            ds2 = ds4;
                                        }
                                        qd.b();
                                        i7++;
                                        if (i7 >= i6) {
                                            ds3 = ds2;
                                            z2 = false;
                                        } else {
                                            ds4 = ds2;
                                            i2 = 0;
                                        }
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    ds2 = ds4;
                                }
                            } else {
                                ds3 = ds4;
                                z2 = i2 == true ? 1 : 0;
                            }
                            ds3.c = z2;
                        } catch (Throwable th11) {
                            th = th11;
                            ds = ds4;
                            z = i2 == true ? 1 : 0;
                        }
                    }
                } catch (Throwable th12) {
                    throw th12;
                }
            }
            if (!DS.a((DS) this.i)) {
                return C0782bY.a;
            }
            z3 = true;
            i2 = 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LE(Context context, XI xi) {
        super(0);
        this.h = 3;
        this.i = context;
    }
}
