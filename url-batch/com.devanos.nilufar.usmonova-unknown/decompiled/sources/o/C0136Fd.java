package o;

/* renamed from: o.Fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136Fd extends J8 {
    public final H8 r;

    public C0136Fd(int i, H8 h8) {
        super(i);
        this.r = h8;
        if (h8 != H8.h) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC1888sN.h(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + UM.a.b(J8.class).g() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(Object obj, boolean z) {
        H8 h8 = this.r;
        H8 h82 = H8.j;
        C0782bY c0782bY = C0782bY.a;
        if (h8 == h82) {
            Object f = super.f(obj);
            return (!(f instanceof C0340Na) || (f instanceof C0314Ma)) ? f : c0782bY;
        }
        InterfaceC0531Uj interfaceC0531Uj = L8.d;
        C0392Pa c0392Pa = (C0392Pa) J8.m.get(this);
        while (true) {
            long andIncrement = J8.i.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean t = t(andIncrement, false);
            int i = L8.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c0392Pa.c != j3) {
                C0392Pa b = J8.b(this, j3, c0392Pa);
                if (b != null) {
                    c0392Pa = b;
                } else if (t) {
                    return new C0314Ma(q());
                }
            }
            int h = J8.h(this, c0392Pa, i2, obj, j, interfaceC0531Uj, t);
            if (h == 0) {
                c0392Pa.a();
                return c0782bY;
            }
            if (h == 1) {
                break;
            }
            if (h != 2) {
                if (h == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (h == 4) {
                    if (j < J8.j.get(this)) {
                        c0392Pa.a();
                    }
                    return new C0314Ma(q());
                }
                if (h == 5) {
                    c0392Pa.a();
                }
            } else {
                if (t) {
                    c0392Pa.h();
                    return new C0314Ma(q());
                }
                C00 c00 = interfaceC0531Uj instanceof C00 ? (C00) interfaceC0531Uj : null;
                if (c00 != null) {
                    c00.a(c0392Pa, i2 + i);
                }
                l((c0392Pa.c * j2) + i2);
            }
        }
    }

    @Override // o.J8, o.LQ
    public final Object d(Object obj, InterfaceC2235xe interfaceC2235xe) {
        if (F(obj, true) instanceof C0314Ma) {
            throw q();
        }
        return C0782bY.a;
    }

    @Override // o.J8, o.LQ
    public final Object f(Object obj) {
        return F(obj, false);
    }

    @Override // o.J8
    public final boolean v() {
        return this.r == H8.i;
    }
}
