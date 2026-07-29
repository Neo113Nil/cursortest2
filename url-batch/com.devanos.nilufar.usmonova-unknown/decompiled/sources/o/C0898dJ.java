package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* renamed from: o.dJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898dJ extends AbstractC2181wq {
    private static final C0898dJ DEFAULT_INSTANCE;
    private static volatile BH PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private BB preferences_ = BB.i;

    static {
        C0898dJ c0898dJ = new C0898dJ();
        DEFAULT_INSTANCE = c0898dJ;
        AbstractC2181wq.j(C0898dJ.class, c0898dJ);
    }

    public static BB l(C0898dJ c0898dJ) {
        BB bb = c0898dJ.preferences_;
        if (!bb.h) {
            c0898dJ.preferences_ = bb.b();
        }
        return c0898dJ.preferences_;
    }

    public static C0767bJ n() {
        return (C0767bJ) ((AbstractC1720pq) DEFAULT_INSTANCE.c(5));
    }

    public static C0898dJ o(InputStream inputStream) {
        C0898dJ c0898dJ = DEFAULT_INSTANCE;
        C0497Tb c0497Tb = new C0497Tb(inputStream);
        C1715pl a = C1715pl.a();
        AbstractC2181wq i = c0898dJ.i();
        try {
            C1229iL c1229iL = C1229iL.c;
            c1229iL.getClass();
            InterfaceC0839cQ a2 = c1229iL.a(i.getClass());
            C0575Wb c0575Wb = c0497Tb.b;
            if (c0575Wb == null) {
                c0575Wb = new C0575Wb(c0497Tb);
            }
            a2.f(i, c0575Wb, a);
            a2.d(i);
            if (AbstractC2181wq.f(i, true)) {
                return (C0898dJ) i;
            }
            throw new C0230It(new C0716aY().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof C0230It) {
                throw ((C0230It) e.getCause());
            }
            throw new C0230It(e.getMessage(), e);
        } catch (C0716aY e2) {
            throw new C0230It(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C0230It) {
                throw ((C0230It) e3.getCause());
            }
            throw e3;
        } catch (C0230It e4) {
            if (e4.h) {
                throw new C0230It(e4.getMessage(), e4);
            }
            throw e4;
        }
    }

    @Override // o.AbstractC2181wq
    public final Object c(int i) {
        BH bh;
        switch (AbstractC1888sN.v(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2018uL(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC0832cJ.a});
            case 3:
                return new C0898dJ();
            case 4:
                return new C0767bJ(DEFAULT_INSTANCE);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                BH bh2 = PARSER;
                if (bh2 != null) {
                    return bh2;
                }
                synchronized (C0898dJ.class) {
                    try {
                        bh = PARSER;
                        if (bh == null) {
                            bh = new C1786qq();
                            PARSER = bh;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bh;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
