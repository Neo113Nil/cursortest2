package o;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: o.Wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575Wb {
    public int a;
    public int b;
    public int c;
    public final Object d;

    public C0575Wb(AbstractC0549Vb abstractC0549Vb) {
        this.c = 0;
        Charset charset = AbstractC2052ut.a;
        this.d = abstractC0549Vb;
        abstractC0549Vb.b = this;
    }

    public int a() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((AbstractC0549Vb) this.d).u();
        }
        int i2 = this.a;
        if (i2 == 0 || i2 == this.b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public int b(int i) {
        return ((KG) this.d).u[this.b + i];
    }

    public Object c(int i) {
        return ((KG) this.d).w[this.c + i];
    }

    public void d(Object obj, InterfaceC0839cQ interfaceC0839cQ, C1715pl c1715pl) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            interfaceC0839cQ.f(obj, this, c1715pl);
            if (this.a == this.b) {
            } else {
                throw new C0230It("Failed to parse the message.");
            }
        } finally {
            this.b = i;
        }
    }

    public void e(Object obj, InterfaceC0839cQ interfaceC0839cQ, C1715pl c1715pl) {
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int v = abstractC0549Vb.v();
        if (abstractC0549Vb.a >= 100) {
            throw new C0230It("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e = abstractC0549Vb.e(v);
        abstractC0549Vb.a++;
        interfaceC0839cQ.f(obj, this, c1715pl);
        abstractC0549Vb.a(0);
        abstractC0549Vb.a--;
        abstractC0549Vb.d(e);
    }

    public void f(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(abstractC0549Vb.f()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int b = abstractC0549Vb.b() + abstractC0549Vb.v();
        do {
            list.add(Boolean.valueOf(abstractC0549Vb.f()));
        } while (abstractC0549Vb.b() < b);
        x(b);
    }

    public C1151h9 g() {
        y(2);
        return ((AbstractC0549Vb) this.d).g();
    }

    public void h(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        if ((this.a & 7) != 2) {
            throw C0230It.b();
        }
        do {
            list.add(g());
            if (abstractC0549Vb.c()) {
                return;
            } else {
                u = abstractC0549Vb.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void i(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                list.add(Double.valueOf(abstractC0549Vb.h()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int v = abstractC0549Vb.v();
        if ((v & 7) != 0) {
            throw new C0230It("Failed to parse the message.");
        }
        int b = abstractC0549Vb.b() + v;
        do {
            list.add(Double.valueOf(abstractC0549Vb.h()));
        } while (abstractC0549Vb.b() < b);
    }

    public void j(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(abstractC0549Vb.i()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int b = abstractC0549Vb.b() + abstractC0549Vb.v();
        do {
            list.add(Integer.valueOf(abstractC0549Vb.i()));
        } while (abstractC0549Vb.b() < b);
        x(b);
    }

    public Object k(J10 j10, Class cls, C1715pl c1715pl) {
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        switch (j10.ordinal()) {
            case 0:
                y(1);
                return Double.valueOf(abstractC0549Vb.h());
            case 1:
                y(5);
                return Float.valueOf(abstractC0549Vb.l());
            case 2:
                y(0);
                return Long.valueOf(abstractC0549Vb.n());
            case 3:
                y(0);
                return Long.valueOf(abstractC0549Vb.w());
            case 4:
                y(0);
                return Integer.valueOf(abstractC0549Vb.m());
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                y(1);
                return Long.valueOf(abstractC0549Vb.k());
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                y(5);
                return Integer.valueOf(abstractC0549Vb.j());
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                y(0);
                return Boolean.valueOf(abstractC0549Vb.f());
            case 8:
                y(2);
                return abstractC0549Vb.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                y(2);
                InterfaceC0839cQ a = C1229iL.c.a(cls);
                AbstractC2181wq h = a.h();
                e(h, a, c1715pl);
                a.d(h);
                return h;
            case 11:
                return g();
            case 12:
                y(0);
                return Integer.valueOf(abstractC0549Vb.v());
            case 13:
                y(0);
                return Integer.valueOf(abstractC0549Vb.i());
            case 14:
                y(5);
                return Integer.valueOf(abstractC0549Vb.o());
            case 15:
                y(1);
                return Long.valueOf(abstractC0549Vb.p());
            case 16:
                y(0);
                return Integer.valueOf(abstractC0549Vb.q());
            case 17:
                y(0);
                return Long.valueOf(abstractC0549Vb.r());
        }
    }

    public void l(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int v = abstractC0549Vb.v();
            if ((v & 3) != 0) {
                throw new C0230It("Failed to parse the message.");
            }
            int b = abstractC0549Vb.b() + v;
            do {
                list.add(Integer.valueOf(abstractC0549Vb.j()));
            } while (abstractC0549Vb.b() < b);
            return;
        }
        if (i != 5) {
            throw C0230It.b();
        }
        do {
            list.add(Integer.valueOf(abstractC0549Vb.j()));
            if (abstractC0549Vb.c()) {
                return;
            } else {
                u = abstractC0549Vb.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void m(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(abstractC0549Vb.k()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int v = abstractC0549Vb.v();
        if ((v & 7) != 0) {
            throw new C0230It("Failed to parse the message.");
        }
        int b = abstractC0549Vb.b() + v;
        do {
            list.add(Long.valueOf(abstractC0549Vb.k()));
        } while (abstractC0549Vb.b() < b);
    }

    public void n(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int v = abstractC0549Vb.v();
            if ((v & 3) != 0) {
                throw new C0230It("Failed to parse the message.");
            }
            int b = abstractC0549Vb.b() + v;
            do {
                list.add(Float.valueOf(abstractC0549Vb.l()));
            } while (abstractC0549Vb.b() < b);
            return;
        }
        if (i != 5) {
            throw C0230It.b();
        }
        do {
            list.add(Float.valueOf(abstractC0549Vb.l()));
            if (abstractC0549Vb.c()) {
                return;
            } else {
                u = abstractC0549Vb.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void o(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(abstractC0549Vb.m()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int b = abstractC0549Vb.b() + abstractC0549Vb.v();
        do {
            list.add(Integer.valueOf(abstractC0549Vb.m()));
        } while (abstractC0549Vb.b() < b);
        x(b);
    }

    public void p(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(abstractC0549Vb.n()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int b = abstractC0549Vb.b() + abstractC0549Vb.v();
        do {
            list.add(Long.valueOf(abstractC0549Vb.n()));
        } while (abstractC0549Vb.b() < b);
        x(b);
    }

    public void q(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int v = abstractC0549Vb.v();
            if ((v & 3) != 0) {
                throw new C0230It("Failed to parse the message.");
            }
            int b = abstractC0549Vb.b() + v;
            do {
                list.add(Integer.valueOf(abstractC0549Vb.o()));
            } while (abstractC0549Vb.b() < b);
            return;
        }
        if (i != 5) {
            throw C0230It.b();
        }
        do {
            list.add(Integer.valueOf(abstractC0549Vb.o()));
            if (abstractC0549Vb.c()) {
                return;
            } else {
                u = abstractC0549Vb.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void r(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(abstractC0549Vb.p()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int v = abstractC0549Vb.v();
        if ((v & 7) != 0) {
            throw new C0230It("Failed to parse the message.");
        }
        int b = abstractC0549Vb.b() + v;
        do {
            list.add(Long.valueOf(abstractC0549Vb.p()));
        } while (abstractC0549Vb.b() < b);
    }

    public void s(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(abstractC0549Vb.q()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int b = abstractC0549Vb.b() + abstractC0549Vb.v();
        do {
            list.add(Integer.valueOf(abstractC0549Vb.q()));
        } while (abstractC0549Vb.b() < b);
        x(b);
    }

    public void t(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(abstractC0549Vb.r()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int b = abstractC0549Vb.b() + abstractC0549Vb.v();
        do {
            list.add(Long.valueOf(abstractC0549Vb.r()));
        } while (abstractC0549Vb.b() < b);
        x(b);
    }

    public void u(List list, boolean z) {
        String s;
        int u;
        int u2;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        if ((this.a & 7) != 2) {
            throw C0230It.b();
        }
        if ((list instanceof InterfaceC1860rz) && !z) {
            InterfaceC1860rz interfaceC1860rz = (InterfaceC1860rz) list;
            do {
                interfaceC1860rz.f(g());
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u2 = abstractC0549Vb.u();
                }
            } while (u2 == this.a);
            this.c = u2;
            return;
        }
        do {
            if (z) {
                y(2);
                s = abstractC0549Vb.t();
            } else {
                y(2);
                s = abstractC0549Vb.s();
            }
            list.add(s);
            if (abstractC0549Vb.c()) {
                return;
            } else {
                u = abstractC0549Vb.u();
            }
        } while (u == this.a);
        this.c = u;
    }

    public void v(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(abstractC0549Vb.v()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int b = abstractC0549Vb.b() + abstractC0549Vb.v();
        do {
            list.add(Integer.valueOf(abstractC0549Vb.v()));
        } while (abstractC0549Vb.b() < b);
        x(b);
    }

    public void w(List list) {
        int u;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(abstractC0549Vb.w()));
                if (abstractC0549Vb.c()) {
                    return;
                } else {
                    u = abstractC0549Vb.u();
                }
            } while (u == this.a);
            this.c = u;
            return;
        }
        if (i != 2) {
            throw C0230It.b();
        }
        int b = abstractC0549Vb.b() + abstractC0549Vb.v();
        do {
            list.add(Long.valueOf(abstractC0549Vb.w()));
        } while (abstractC0549Vb.b() < b);
        x(b);
    }

    public void x(int i) {
        if (((AbstractC0549Vb) this.d).b() != i) {
            throw C0230It.e();
        }
    }

    public void y(int i) {
        if ((this.a & 7) != i) {
            throw C0230It.b();
        }
    }

    public boolean z() {
        int i;
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) this.d;
        if (abstractC0549Vb.c() || (i = this.a) == this.b) {
            return false;
        }
        return abstractC0549Vb.x(i);
    }

    public C0575Wb(KG kg) {
        this.d = kg;
    }
}
