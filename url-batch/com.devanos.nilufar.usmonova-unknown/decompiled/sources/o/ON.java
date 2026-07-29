package o;

import android.view.View;
import com.devanos.nilufar.usmonova.R;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class ON {
    public static final Object[] a(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        P6.d0(objArr, objArr2, 0, i, 6);
        P6.b0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        P6.d0(objArr, objArr2, 0, i, 6);
        P6.b0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] c(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        P6.d0(objArr, objArr2, 0, i, 6);
        P6.b0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final Object d(MU mu, AbstractC2367ze abstractC2367ze) {
        if (!mu.h()) {
            C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(abstractC2367ze));
            c0849ca.r();
            mu.a(ExecutorC2239xi.i, new C1818rJ(20, c0849ca));
            return c0849ca.q();
        }
        Exception f = mu.f();
        if (f != null) {
            throw f;
        }
        if (!((p30) mu).d) {
            return mu.g();
        }
        throw new CancellationException("Task " + mu + " was cancelled normally.");
    }

    public static final Collection e(Collection collection, Collection collection2) {
        AbstractC0048Bt.n(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final int f(int i) {
        AbstractC1888sN.p(i, "<this>");
        int v = AbstractC1888sN.v(i);
        if (v == 0) {
            return 3;
        }
        if (v == 1) {
            return 1;
        }
        if (v == 2) {
            return 2;
        }
        throw new C0057Cc();
    }

    public static final InterfaceC0365Nz g(View view) {
        AbstractC0048Bt.n(view, "<this>");
        return (InterfaceC0365Nz) PQ.v(PQ.A(PQ.x(view, UY.l), UY.m));
    }

    public static /* synthetic */ Collection h(PN pn, C2106vh c2106vh, int i) {
        if ((i & 1) != 0) {
            c2106vh = C2106vh.m;
        }
        WB.a.getClass();
        return pn.b(c2106vh, C2316yt.v);
    }

    public static int i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int j(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return i(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final C1564nS l(ArrayList arrayList) {
        C1564nS c1564nS = new C1564nS();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            WB wb = (WB) next;
            if (wb != null && wb != VB.b) {
                c1564nS.add(next);
            }
        }
        return c1564nS;
    }

    public static Object m(InterfaceC1455lp interfaceC1455lp, InterfaceC2114vp interfaceC2114vp) {
        AbstractC1696pS c1963tW;
        if (interfaceC2114vp == null) {
            return interfaceC1455lp.invoke();
        }
        AbstractC1696pS abstractC1696pS = (AbstractC1696pS) AbstractC2025uS.a.get();
        if (abstractC1696pS instanceof C1963tW) {
            C1963tW c1963tW2 = (C1963tW) abstractC1696pS;
            if (c1963tW2.t == AbstractC0868ct.p()) {
                InterfaceC2114vp interfaceC2114vp2 = c1963tW2.r;
                InterfaceC2114vp interfaceC2114vp3 = c1963tW2.s;
                try {
                    ((C1963tW) abstractC1696pS).r = AbstractC2025uS.l(interfaceC2114vp, interfaceC2114vp2, true);
                    ((C1963tW) abstractC1696pS).s = interfaceC2114vp3;
                    return interfaceC1455lp.invoke();
                } finally {
                    c1963tW2.r = interfaceC2114vp2;
                    c1963tW2.s = interfaceC2114vp3;
                }
            }
        }
        if (abstractC1696pS == null || (abstractC1696pS instanceof SD)) {
            c1963tW = new C1963tW(abstractC1696pS instanceof SD ? (SD) abstractC1696pS : null, interfaceC2114vp, null, true, false);
        } else {
            if (interfaceC2114vp == null) {
                return interfaceC1455lp.invoke();
            }
            c1963tW = abstractC1696pS.t(interfaceC2114vp);
        }
        try {
            AbstractC1696pS j = c1963tW.j();
            try {
                Object invoke = interfaceC1455lp.invoke();
                AbstractC1696pS.p(j);
                c1963tW.c();
                return invoke;
            } catch (Throwable th) {
                AbstractC1696pS.p(j);
                throw th;
            }
        } catch (Throwable th2) {
            c1963tW.c();
            throw th2;
        }
    }

    public static C1739q5 n(String str) {
        int i;
        String str2;
        AbstractC0048Bt.n(str, "statusLine");
        boolean B = AbstractC0778bU.B(str, "HTTP/1.", false);
        EnumC1359kL enumC1359kL = EnumC1359kL.i;
        if (B) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC1359kL = EnumC1359kL.j;
            }
        } else {
            if (!AbstractC0778bU.B(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i, i2);
            AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                AbstractC0048Bt.m(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new C1739q5(enumC1359kL, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static int o(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return j(bArr, i3, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return j(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static void p(AbstractC1696pS abstractC1696pS, AbstractC1696pS abstractC1696pS2, InterfaceC2114vp interfaceC2114vp) {
        if (abstractC1696pS != abstractC1696pS2) {
            abstractC1696pS2.getClass();
            AbstractC1696pS.p(abstractC1696pS);
            abstractC1696pS2.c();
        } else if (abstractC1696pS instanceof C1963tW) {
            ((C1963tW) abstractC1696pS).r = interfaceC2114vp;
        } else if (abstractC1696pS instanceof C2029uW) {
            ((C2029uW) abstractC1696pS).g = interfaceC2114vp;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC1696pS).toString());
        }
    }

    public static final void q(View view, InterfaceC0365Nz interfaceC0365Nz) {
        AbstractC0048Bt.n(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0365Nz);
    }
}
