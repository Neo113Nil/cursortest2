package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: o.nv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1593nv implements InterfaceC0893dE {
    public static final List k;
    public final String[] h;
    public final Set i;
    public final ArrayList j;

    static {
        String t0 = AbstractC0720ac.t0(AbstractC0868ct.K('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List K = AbstractC0868ct.K(AbstractC1888sN.j(t0, "/Any"), AbstractC1888sN.j(t0, "/Nothing"), AbstractC1888sN.j(t0, "/Unit"), AbstractC1888sN.j(t0, "/Throwable"), AbstractC1888sN.j(t0, "/Number"), AbstractC1888sN.j(t0, "/Byte"), AbstractC1888sN.j(t0, "/Double"), AbstractC1888sN.j(t0, "/Float"), AbstractC1888sN.j(t0, "/Int"), AbstractC1888sN.j(t0, "/Long"), AbstractC1888sN.j(t0, "/Short"), AbstractC1888sN.j(t0, "/Boolean"), AbstractC1888sN.j(t0, "/Char"), AbstractC1888sN.j(t0, "/CharSequence"), AbstractC1888sN.j(t0, "/String"), AbstractC1888sN.j(t0, "/Comparable"), AbstractC1888sN.j(t0, "/Enum"), AbstractC1888sN.j(t0, "/Array"), AbstractC1888sN.j(t0, "/ByteArray"), AbstractC1888sN.j(t0, "/DoubleArray"), AbstractC1888sN.j(t0, "/FloatArray"), AbstractC1888sN.j(t0, "/IntArray"), AbstractC1888sN.j(t0, "/LongArray"), AbstractC1888sN.j(t0, "/ShortArray"), AbstractC1888sN.j(t0, "/BooleanArray"), AbstractC1888sN.j(t0, "/CharArray"), AbstractC1888sN.j(t0, "/Cloneable"), AbstractC1888sN.j(t0, "/Annotation"), AbstractC1888sN.j(t0, "/collections/Iterable"), AbstractC1888sN.j(t0, "/collections/MutableIterable"), AbstractC1888sN.j(t0, "/collections/Collection"), AbstractC1888sN.j(t0, "/collections/MutableCollection"), AbstractC1888sN.j(t0, "/collections/List"), AbstractC1888sN.j(t0, "/collections/MutableList"), AbstractC1888sN.j(t0, "/collections/Set"), AbstractC1888sN.j(t0, "/collections/MutableSet"), AbstractC1888sN.j(t0, "/collections/Map"), AbstractC1888sN.j(t0, "/collections/MutableMap"), AbstractC1888sN.j(t0, "/collections/Map.Entry"), AbstractC1888sN.j(t0, "/collections/MutableMap.MutableEntry"), AbstractC1888sN.j(t0, "/collections/Iterator"), AbstractC1888sN.j(t0, "/collections/MutableIterator"), AbstractC1888sN.j(t0, "/collections/ListIterator"), AbstractC1888sN.j(t0, "/collections/MutableListIterator"));
        k = K;
        S6 N0 = AbstractC0720ac.N0(K);
        int E = EB.E(AbstractC0786bc.d0(N0));
        if (E < 16) {
            E = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E);
        Iterator it = N0.iterator();
        while (true) {
            C1779qj c1779qj = (C1779qj) it;
            if (!c1779qj.i.hasNext()) {
                return;
            }
            C0021As c0021As = (C0021As) c1779qj.next();
            linkedHashMap.put((String) c0021As.b, Integer.valueOf(c0021As.a));
        }
    }

    public C1593nv(C0154Fv c0154Fv, String[] strArr) {
        AbstractC0048Bt.n(strArr, "strings");
        List list = c0154Fv.j;
        Set M0 = list.isEmpty() ? C1648ok.h : AbstractC0720ac.M0(list);
        List<C0128Ev> list2 = c0154Fv.i;
        AbstractC0048Bt.m(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (C0128Ev c0128Ev : list2) {
            int i = c0128Ev.j;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(c0128Ev);
            }
        }
        arrayList.trimToSize();
        this.h = strArr;
        this.i = M0;
        this.j = arrayList;
    }

    @Override // o.InterfaceC0893dE
    public final String getString(int i) {
        String str;
        C0128Ev c0128Ev = (C0128Ev) this.j.get(i);
        int i2 = c0128Ev.i;
        if ((i2 & 4) == 4) {
            Object obj = c0128Ev.l;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                AbstractC1281j9 abstractC1281j9 = (AbstractC1281j9) obj;
                String v = abstractC1281j9.v();
                if (abstractC1281j9.p()) {
                    c0128Ev.l = v;
                }
                str = v;
            }
        } else {
            if ((i2 & 2) == 2) {
                List list = k;
                int size = list.size();
                int i3 = c0128Ev.k;
                if (i3 >= 0 && i3 < size) {
                    str = (String) list.get(i3);
                }
            }
            str = this.h[i];
        }
        if (c0128Ev.n.size() >= 2) {
            List list2 = c0128Ev.n;
            AbstractC0048Bt.m(list2, "substringIndexList");
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            AbstractC0048Bt.m(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                AbstractC0048Bt.m(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    AbstractC0048Bt.m(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (c0128Ev.p.size() >= 2) {
            List list3 = c0128Ev.p;
            AbstractC0048Bt.m(list3, "replaceCharList");
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            AbstractC0048Bt.m(str, "string");
            str = AbstractC0778bU.y(str, (char) num3.intValue(), (char) num4.intValue());
        }
        EnumC0102Dv enumC0102Dv = c0128Ev.m;
        if (enumC0102Dv == null) {
            enumC0102Dv = EnumC0102Dv.NONE;
        }
        int ordinal = enumC0102Dv.ordinal();
        if (ordinal == 1) {
            AbstractC0048Bt.m(str, "string");
            str = AbstractC0778bU.y(str, '$', '.');
        } else if (ordinal == 2) {
            if (str.length() >= 2) {
                str = str.substring(1, str.length() - 1);
                AbstractC0048Bt.m(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            str = AbstractC0778bU.y(str, '$', '.');
        }
        AbstractC0048Bt.m(str, "string");
        return str;
    }

    @Override // o.InterfaceC0893dE
    public final boolean n0(int i) {
        return this.i.contains(Integer.valueOf(i));
    }

    @Override // o.InterfaceC0893dE
    public final String z0(int i) {
        return getString(i);
    }
}
