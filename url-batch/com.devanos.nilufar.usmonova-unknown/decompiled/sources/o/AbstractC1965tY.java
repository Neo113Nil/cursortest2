package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.tY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1965tY {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        EnumC1899sY[] values = EnumC1899sY.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC1899sY enumC1899sY : values) {
            arrayList.add(enumC1899sY.i);
        }
        a = AbstractC0720ac.M0(arrayList);
        EnumC1833rY[] values2 = EnumC1833rY.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (EnumC1833rY enumC1833rY : values2) {
            arrayList2.add(enumC1833rY.h);
        }
        AbstractC0720ac.M0(arrayList2);
        b = new HashMap();
        c = new HashMap();
        EB.N(new HashMap(EB.E(4)), new C1619oH[]{new C1619oH(EnumC1833rY.UBYTEARRAY, C0827cE.e("ubyteArrayOf")), new C1619oH(EnumC1833rY.USHORTARRAY, C0827cE.e("ushortArrayOf")), new C1619oH(EnumC1833rY.UINTARRAY, C0827cE.e("uintArrayOf")), new C1619oH(EnumC1833rY.ULONGARRAY, C0827cE.e("ulongArrayOf"))});
        EnumC1899sY[] values3 = EnumC1899sY.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC1899sY enumC1899sY2 : values3) {
            linkedHashSet.add(enumC1899sY2.j.i());
        }
        d = linkedHashSet;
        for (EnumC1899sY enumC1899sY3 : EnumC1899sY.values()) {
            HashMap hashMap = b;
            C1639ob c1639ob = enumC1899sY3.j;
            C1639ob c1639ob2 = enumC1899sY3.h;
            hashMap.put(c1639ob, c1639ob2);
            c.put(c1639ob2, enumC1899sY3.j);
        }
    }

    public static final boolean a(AbstractC1004ey abstractC1004ey) {
        InterfaceC2364zb c2;
        if (AbstractC2228xX.l(abstractC1004ey) || (c2 = abstractC1004ey.B0().c()) == null) {
            return false;
        }
        InterfaceC1118gg n = c2.n();
        return (n instanceof InterfaceC0961eH) && AbstractC0048Bt.h(((AbstractC1027fH) ((InterfaceC0961eH) n)).l, AbstractC1499mT.j) && a.contains(c2.getName());
    }
}
