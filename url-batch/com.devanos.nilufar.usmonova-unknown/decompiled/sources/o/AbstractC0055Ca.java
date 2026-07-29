package o;

import java.util.ArrayList;

/* renamed from: o.Ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0055Ca implements InterfaceC0589Wp {
    public final InterfaceC0189He h;
    public final int i;
    public final H8 j;

    public AbstractC0055Ca(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        this.h = interfaceC0189He;
        this.i = i;
        this.j = h8;
    }

    public abstract Object a(InterfaceC2214xJ interfaceC2214xJ, InterfaceC2235xe interfaceC2235xe);

    public abstract AbstractC0055Ca b(InterfaceC0189He interfaceC0189He, int i, H8 h8);

    public InterfaceC2243xm c() {
        return null;
    }

    @Override // o.InterfaceC2243xm
    public Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        Object j = AbstractC1052fg.j(new C0003Aa(interfaceC2309ym, this, null), interfaceC2235xe);
        return j == EnumC0448Re.h ? j : C0782bY.a;
    }

    @Override // o.InterfaceC0589Wp
    public final InterfaceC2243xm p(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        InterfaceC0189He interfaceC0189He2 = this.h;
        InterfaceC0189He D = interfaceC0189He.D(interfaceC0189He2);
        H8 h82 = H8.h;
        H8 h83 = this.j;
        int i2 = this.i;
        if (h8 == h82) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            h8 = h83;
        }
        return (AbstractC0048Bt.h(D, interfaceC0189He2) && i == i2 && h8 == h83) ? this : b(D, i, h8);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C1188hk c1188hk = C1188hk.h;
        InterfaceC0189He interfaceC0189He = this.h;
        if (interfaceC0189He != c1188hk) {
            arrayList.add("context=" + interfaceC0189He);
        }
        int i = this.i;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        H8 h8 = H8.h;
        H8 h82 = this.j;
        if (h82 != h8) {
            arrayList.add("onBufferOverflow=" + h82);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC2188wx.h(sb, AbstractC0720ac.t0(arrayList, ", ", null, null, null, 62), ']');
    }
}
