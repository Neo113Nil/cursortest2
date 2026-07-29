package o;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802bs implements InterfaceC1789qt {
    public final HO a = HO.v;
    public volatile Object b = C1648ok.h;
    public volatile int c = 1;

    @Override // o.InterfaceC1789qt
    public final C0968eO a(RL rl) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        String str4;
        AbstractC1166hO abstractC1166hO;
        String str5;
        String str6;
        String s;
        Long l;
        Charset charset;
        Charset charset2;
        int i = this.c;
        FN fn = rl.e;
        boolean z3 = true;
        if (i == 1) {
            return rl.b(fn);
        }
        boolean z4 = i == 4;
        if (!z4 && i != 3) {
            z3 = false;
        }
        JN jn = fn.d;
        C0584Wk c0584Wk = rl.d;
        PL pl = c0584Wk != null ? (PL) c0584Wk.f : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(fn.b);
        sb.append(' ');
        sb.append(fn.a);
        if (pl != null) {
            StringBuilder sb2 = new StringBuilder(" ");
            EnumC1359kL enumC1359kL = pl.f;
            AbstractC0048Bt.k(enumC1359kL);
            sb2.append(enumC1359kL);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        String sb3 = sb.toString();
        if (!z3 && jn != null) {
            sb3 = sb3 + " (" + jn.contentLength() + "-byte body)";
        }
        this.a.n(sb3);
        if (z3) {
            C1852rr c1852rr = fn.c;
            z = z3;
            if (jn != null) {
                NB contentType = jn.contentType();
                z2 = z4;
                if (contentType == null || c1852rr.j("Content-Type") != null) {
                    str3 = " ";
                } else {
                    str3 = " ";
                    this.a.n("Content-Type: " + contentType);
                }
                if (jn.contentLength() == -1 || c1852rr.j("Content-Length") != null) {
                    str4 = "-byte body omitted)";
                    str2 = "-byte body)";
                } else {
                    HO ho = this.a;
                    StringBuilder sb4 = new StringBuilder("Content-Length: ");
                    str4 = "-byte body omitted)";
                    str2 = "-byte body)";
                    sb4.append(jn.contentLength());
                    ho.n(sb4.toString());
                }
            } else {
                z2 = z4;
                str2 = "-byte body)";
                str3 = " ";
                str4 = "-byte body omitted)";
            }
            int size = c1852rr.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(c1852rr, i2);
            }
            if (!z2 || jn == null) {
                this.a.n("--> END " + fn.b);
            } else {
                String j = fn.c.j("Content-Encoding");
                if (j != null && !j.equalsIgnoreCase("identity") && !j.equalsIgnoreCase("gzip")) {
                    this.a.n(AbstractC1888sN.l(new StringBuilder("--> END "), fn.b, " (encoded body omitted)"));
                } else if (jn.isDuplex()) {
                    this.a.n(AbstractC1888sN.l(new StringBuilder("--> END "), fn.b, " (duplex request body omitted)"));
                } else if (jn.isOneShot()) {
                    this.a.n(AbstractC1888sN.l(new StringBuilder("--> END "), fn.b, " (one-shot body omitted)"));
                } else {
                    G8 g8 = new G8();
                    jn.writeTo(g8);
                    NB contentType2 = jn.contentType();
                    if (contentType2 == null || (charset2 = contentType2.a(StandardCharsets.UTF_8)) == null) {
                        charset2 = StandardCharsets.UTF_8;
                        AbstractC0048Bt.m(charset2, "UTF_8");
                    }
                    this.a.n("");
                    if (AbstractC0772bO.t(g8)) {
                        this.a.n(g8.D(g8.i, charset2));
                        this.a.n("--> END " + fn.b + " (" + jn.contentLength() + str2);
                        str4 = str4;
                    } else {
                        this.a.n("--> END " + fn.b + " (binary " + jn.contentLength() + str4);
                    }
                }
            }
        } else {
            z = z3;
            z2 = z4;
            str2 = "-byte body)";
            str3 = " ";
            str4 = "-byte body omitted)";
        }
        long nanoTime = System.nanoTime();
        try {
            C0968eO b = rl.b(fn);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            AbstractC1166hO abstractC1166hO2 = b.n;
            AbstractC0048Bt.k(abstractC1166hO2);
            long contentLength = abstractC1166hO2.contentLength();
            if (contentLength != -1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(contentLength);
                abstractC1166hO = abstractC1166hO2;
                sb5.append("-byte");
                str5 = sb5.toString();
            } else {
                abstractC1166hO = abstractC1166hO2;
                str5 = "unknown-length";
            }
            HO ho2 = this.a;
            StringBuilder sb6 = new StringBuilder("<-- ");
            sb6.append(b.k);
            if (b.j.length() == 0) {
                str6 = str2;
                s = "";
            } else {
                str6 = str2;
                s = AbstractC1888sN.s(str3, b.j);
            }
            sb6.append(s);
            sb6.append(' ');
            sb6.append(b.h.a);
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            ho2.n(AbstractC2188wx.h(sb6, !z ? AbstractC1888sN.k(", ", str5, " body") : "", ')'));
            if (z) {
                C1852rr c1852rr2 = b.m;
                int size2 = c1852rr2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    b(c1852rr2, i3);
                }
                if (z2 && AbstractC0736as.a(b)) {
                    String j2 = b.m.j("Content-Encoding");
                    if (j2 != null && !j2.equalsIgnoreCase("identity") && !j2.equalsIgnoreCase("gzip")) {
                        this.a.n("<-- END HTTP (encoded body omitted)");
                        return b;
                    }
                    N8 source = abstractC1166hO.source();
                    source.l(Long.MAX_VALUE);
                    G8 a = source.a();
                    if ("gzip".equalsIgnoreCase(c1852rr2.j("Content-Encoding"))) {
                        l = Long.valueOf(a.i);
                        C1063fr c1063fr = new C1063fr(a.clone());
                        try {
                            a = new G8();
                            a.E(c1063fr);
                            c1063fr.close();
                        } finally {
                        }
                    } else {
                        l = null;
                    }
                    NB contentType3 = abstractC1166hO.contentType();
                    if (contentType3 == null || (charset = contentType3.a(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        AbstractC0048Bt.m(charset, "UTF_8");
                    }
                    if (!AbstractC0772bO.t(a)) {
                        this.a.n("");
                        this.a.n("<-- END HTTP (binary " + a.i + str4);
                        return b;
                    }
                    if (contentLength != 0) {
                        this.a.n("");
                        HO ho3 = this.a;
                        G8 clone = a.clone();
                        ho3.n(clone.D(clone.i, charset));
                    }
                    if (l == null) {
                        this.a.n("<-- END HTTP (" + a.i + str6);
                        return b;
                    }
                    this.a.n("<-- END HTTP (" + a.i + "-byte, " + l + "-gzipped-byte body)");
                    return b;
                }
                this.a.n("<-- END HTTP");
            }
            return b;
        } catch (Exception e) {
            this.a.n("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void b(C1852rr c1852rr, int i) {
        String m = this.b.contains(c1852rr.k(i)) ? "██" : c1852rr.m(i);
        this.a.n(c1852rr.k(i) + ": " + m);
    }
}
