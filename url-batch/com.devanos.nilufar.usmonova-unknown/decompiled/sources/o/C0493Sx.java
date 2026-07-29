package o;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* renamed from: o.Sx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493Sx implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC0545Ux i;

    public /* synthetic */ C0493Sx(AbstractC0545Ux abstractC0545Ux, int i) {
        this.h = i;
        this.i = abstractC0545Ux;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        int i = this.h;
        AbstractC0545Ux abstractC0545Ux = this.i;
        switch (i) {
            case 0:
                return Arrays.asList(abstractC0545Ux.k().S(AbstractC1499mT.j), abstractC0545Ux.k().S(AbstractC1499mT.l), abstractC0545Ux.k().S(AbstractC1499mT.m), abstractC0545Ux.k().S(AbstractC1499mT.k));
            default:
                EnumMap enumMap = new EnumMap(EnumC1423lJ.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (EnumC1423lJ enumC1423lJ : EnumC1423lJ.values()) {
                    String b = enumC1423lJ.h.b();
                    if (b == null) {
                        AbstractC0545Ux.a(46);
                        throw null;
                    }
                    JR i2 = abstractC0545Ux.j(b).i();
                    if (i2 == null) {
                        AbstractC0545Ux.a(47);
                        throw null;
                    }
                    String b2 = enumC1423lJ.i.b();
                    if (b2 == null) {
                        AbstractC0545Ux.a(46);
                        throw null;
                    }
                    JR i3 = abstractC0545Ux.j(b2).i();
                    if (i3 == null) {
                        AbstractC0545Ux.a(47);
                        throw null;
                    }
                    enumMap.put((EnumMap) enumC1423lJ, (EnumC1423lJ) i3);
                    hashMap.put(i2, i3);
                    hashMap2.put(i3, i2);
                }
                return new C0519Tx(enumMap, hashMap, hashMap2);
        }
    }
}
