package o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes.dex */
public final class BL implements InterfaceC0597Wx {
    public final /* synthetic */ int h;
    public final /* synthetic */ DL i;

    public /* synthetic */ BL(DL dl, int i) {
        this.h = i;
        this.i = dl;
    }

    @Override // o.InterfaceC0597Wx
    public final void h() {
        int i = this.h;
    }

    @Override // o.InterfaceC0597Wx
    public final InterfaceC0623Xx j(C0827cE c0827cE) {
        switch (this.h) {
            case 0:
                String b = c0827cE.b();
                if ("d1".equals(b)) {
                    return new AL(this, 0);
                }
                if ("d2".equals(b)) {
                    return new AL(this, 1);
                }
                return null;
            case 1:
                if ("b".equals(c0827cE.b())) {
                    return new AL(this, 2);
                }
                return null;
            default:
                String b2 = c0827cE.b();
                if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(b2) || "filePartClassNames".equals(b2)) {
                    return new CL(this, 0);
                }
                if ("strings".equals(b2)) {
                    return new CL(this, 1);
                }
                return null;
        }
    }

    @Override // o.InterfaceC0597Wx
    public final void k(C0827cE c0827cE, C1705pb c1705pb) {
        int i = this.h;
    }

    @Override // o.InterfaceC0597Wx
    public final void l(C0827cE c0827cE, C1639ob c1639ob, C0827cE c0827cE2) {
        int i = this.h;
    }

    @Override // o.InterfaceC0597Wx
    public final void m(C0827cE c0827cE, Object obj) {
        switch (this.h) {
            case 0:
                String b = c0827cE.b();
                boolean equals = "k".equals(b);
                DL dl = this.i;
                if (!equals) {
                    if (!"mv".equals(b)) {
                        if (!"xs".equals(b)) {
                            if (!"xi".equals(b)) {
                                if ("pn".equals(b) && (obj instanceof String)) {
                                    ((String) obj).isEmpty();
                                    break;
                                }
                            } else if (obj instanceof Integer) {
                                dl.j = ((Integer) obj).intValue();
                                break;
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                dl.i = str;
                                break;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        dl.h = (int[]) obj;
                        break;
                    }
                } else if (obj instanceof Integer) {
                    EnumC0571Vx enumC0571Vx = (EnumC0571Vx) EnumC0571Vx.i.get((Integer) obj);
                    if (enumC0571Vx == null) {
                        enumC0571Vx = EnumC0571Vx.UNKNOWN;
                    }
                    dl.n = enumC0571Vx;
                    break;
                }
                break;
            case 1:
                break;
            default:
                String b2 = c0827cE.b();
                boolean equals2 = "version".equals(b2);
                DL dl2 = this.i;
                if (!equals2) {
                    if ("multifileClassName".equals(b2)) {
                        dl2.i = obj instanceof String ? (String) obj : null;
                        break;
                    }
                } else if (obj instanceof int[]) {
                    dl2.h = (int[]) obj;
                    break;
                }
                break;
        }
    }

    @Override // o.InterfaceC0597Wx
    public final InterfaceC0597Wx n(C1639ob c1639ob, C0827cE c0827cE) {
        switch (this.h) {
        }
        return null;
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void a(C0827cE c0827cE, Object obj) {
    }

    private final void b(C0827cE c0827cE, C1705pb c1705pb) {
    }

    private final void c(C0827cE c0827cE, C1705pb c1705pb) {
    }

    private final void d(C0827cE c0827cE, C1705pb c1705pb) {
    }

    private final void i(C0827cE c0827cE, C1639ob c1639ob, C0827cE c0827cE2) {
    }

    private final void o(C0827cE c0827cE, C1639ob c1639ob, C0827cE c0827cE2) {
    }

    private final void p(C0827cE c0827cE, C1639ob c1639ob, C0827cE c0827cE2) {
    }
}
