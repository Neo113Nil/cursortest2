package o;

import java.io.Closeable;
import java.io.EOFException;

/* renamed from: o.eO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968eO implements Closeable {
    public final FN h;
    public final EnumC1359kL i;
    public final String j;
    public final int k;
    public final C1457lr l;
    public final C1852rr m;
    public final AbstractC1166hO n;

    /* renamed from: o, reason: collision with root package name */
    public final C0968eO f161o;
    public final C0968eO p;
    public final C0968eO q;
    public final long r;
    public final long s;
    public final C0584Wk t;

    public C0968eO(FN fn, EnumC1359kL enumC1359kL, String str, int i, C1457lr c1457lr, C1852rr c1852rr, AbstractC1166hO abstractC1166hO, C0968eO c0968eO, C0968eO c0968eO2, C0968eO c0968eO3, long j, long j2, C0584Wk c0584Wk) {
        AbstractC0048Bt.n(fn, "request");
        AbstractC0048Bt.n(enumC1359kL, "protocol");
        AbstractC0048Bt.n(str, "message");
        this.h = fn;
        this.i = enumC1359kL;
        this.j = str;
        this.k = i;
        this.l = c1457lr;
        this.m = c1852rr;
        this.n = abstractC1166hO;
        this.f161o = c0968eO;
        this.p = c0968eO2;
        this.q = c0968eO3;
        this.r = j;
        this.s = j2;
        this.t = c0584Wk;
    }

    public static String b(String str, C0968eO c0968eO) {
        c0968eO.getClass();
        String j = c0968eO.m.j(str);
        if (j == null) {
            return null;
        }
        return j;
    }

    public final C0903dO c() {
        C0903dO c0903dO = new C0903dO();
        c0903dO.a = this.h;
        c0903dO.b = this.i;
        c0903dO.c = this.k;
        c0903dO.d = this.j;
        c0903dO.e = this.l;
        c0903dO.f = this.m.l();
        c0903dO.g = this.n;
        c0903dO.h = this.f161o;
        c0903dO.i = this.p;
        c0903dO.j = this.q;
        c0903dO.k = this.r;
        c0903dO.l = this.s;
        c0903dO.m = this.t;
        return c0903dO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC1166hO abstractC1166hO = this.n;
        if (abstractC1166hO == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC1166hO.close();
    }

    public final SL j() {
        AbstractC1166hO abstractC1166hO = this.n;
        AbstractC0048Bt.k(abstractC1166hO);
        JL peek = abstractC1166hO.source().peek();
        G8 g8 = new G8();
        peek.l(65536L);
        long min = Math.min(65536L, peek.i.i);
        while (min > 0) {
            long read = peek.read(g8, min);
            if (read == -1) {
                throw new EOFException();
            }
            min -= read;
        }
        C1100gO c1100gO = AbstractC1166hO.Companion;
        NB contentType = abstractC1166hO.contentType();
        long j = g8.i;
        c1100gO.getClass();
        return C1100gO.b(g8, contentType, j);
    }

    public final String toString() {
        return "Response{protocol=" + this.i + ", code=" + this.k + ", message=" + this.j + ", url=" + this.h.a + '}';
    }
}
