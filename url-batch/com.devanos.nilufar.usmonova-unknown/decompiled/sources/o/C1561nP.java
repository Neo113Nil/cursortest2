package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.nP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1561nP extends AbstractC2367ze implements InterfaceC2309ym {
    public final InterfaceC2309ym h;
    public final InterfaceC0189He i;
    public final int j;
    public InterfaceC0189He k;
    public InterfaceC2235xe l;

    public C1561nP(InterfaceC2309ym interfaceC2309ym, InterfaceC0189He interfaceC0189He) {
        super(C0005Ac.j, C1188hk.h);
        this.h = interfaceC2309ym;
        this.i = interfaceC0189He;
        this.j = ((Number) interfaceC0189He.I(0, new C1903sc(5))).intValue();
    }

    public final Object a(InterfaceC2235xe interfaceC2235xe, Object obj) {
        List list;
        Comparable comparable;
        String str;
        InterfaceC0189He context = interfaceC2235xe.getContext();
        PX.F(context);
        InterfaceC0189He interfaceC0189He = this.k;
        if (interfaceC0189He != context) {
            int i = 0;
            if (interfaceC0189He instanceof C0530Ui) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C0530Ui) interfaceC0189He).i + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                AbstractC0048Bt.n(str2, "<this>");
                C0625Xz c0625Xz = new C0625Xz(str2);
                if (c0625Xz.hasNext()) {
                    Object next = c0625Xz.next();
                    if (c0625Xz.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (c0625Xz.hasNext()) {
                            arrayList.add(c0625Xz.next());
                        }
                        list = arrayList;
                    } else {
                        list = AbstractC0868ct.J(next);
                    }
                } else {
                    list = C1318jk.h;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!UT.J((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = -1;
                            break;
                        }
                        if (!AbstractC0868ct.G(str3.charAt(i2))) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 == -1) {
                        i2 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i2));
                }
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int w = AbstractC0868ct.w(list);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    int i3 = i + 1;
                    if (i < 0) {
                        AbstractC0868ct.Y();
                        throw null;
                    }
                    String str4 = (String) obj3;
                    if ((i == 0 || i == w) && UT.J(str4)) {
                        str = null;
                    } else {
                        AbstractC0048Bt.n(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(AbstractC1888sN.h(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        AbstractC0048Bt.m(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i = i3;
                }
                StringBuilder sb = new StringBuilder(length2);
                AbstractC0720ac.s0(arrayList4, sb, "\n", null, null, null, 124);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.I(0, new C1759qP(0, this))).intValue() != this.j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.i + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.k = context;
        }
        this.l = interfaceC2235xe;
        InterfaceC2378zp interfaceC2378zp = AbstractC1693pP.a;
        InterfaceC2309ym interfaceC2309ym = this.h;
        AbstractC0048Bt.l(interfaceC2309ym, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object e = interfaceC2378zp.e(interfaceC2309ym, obj, this);
        if (!AbstractC0048Bt.h(e, EnumC0448Re.h)) {
            this.l = null;
        }
        return e;
    }

    @Override // o.InterfaceC2309ym
    public final Object emit(Object obj, InterfaceC2235xe interfaceC2235xe) {
        try {
            Object a = a(interfaceC2235xe, obj);
            return a == EnumC0448Re.h ? a : C0782bY.a;
        } catch (Throwable th) {
            this.k = new C0530Ui(th, interfaceC2235xe.getContext());
            throw th;
        }
    }

    @Override // o.Y7, o.InterfaceC0474Se
    public final InterfaceC0474Se getCallerFrame() {
        InterfaceC2235xe interfaceC2235xe = this.l;
        if (interfaceC2235xe instanceof InterfaceC0474Se) {
            return (InterfaceC0474Se) interfaceC2235xe;
        }
        return null;
    }

    @Override // o.AbstractC2367ze, o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        InterfaceC0189He interfaceC0189He = this.k;
        return interfaceC0189He == null ? C1188hk.h : interfaceC0189He;
    }

    @Override // o.Y7
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        Throwable a = C1428lO.a(obj);
        if (a != null) {
            this.k = new C0530Ui(a, getContext());
        }
        InterfaceC2235xe interfaceC2235xe = this.l;
        if (interfaceC2235xe != null) {
            interfaceC2235xe.resumeWith(obj);
        }
        return EnumC0448Re.h;
    }
}
