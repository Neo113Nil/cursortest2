package o;

/* renamed from: o.dO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903dO {
    public FN a;
    public EnumC1359kL b;
    public String d;
    public C1457lr e;
    public AbstractC1166hO g;
    public C0968eO h;
    public C0968eO i;
    public C0968eO j;
    public long k;
    public long l;
    public C0584Wk m;
    public int c = -1;
    public C1787qr f = new C1787qr();

    public static void b(String str, C0968eO c0968eO) {
        if (c0968eO != null) {
            if (c0968eO.n != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c0968eO.f161o != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c0968eO.p != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c0968eO.q != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final C0968eO a() {
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        FN fn = this.a;
        if (fn == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC1359kL enumC1359kL = this.b;
        if (enumC1359kL == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new C0968eO(fn, enumC1359kL, str, i, this.e, this.f.d(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException("message == null");
    }
}
