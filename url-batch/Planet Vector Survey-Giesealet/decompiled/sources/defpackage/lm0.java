package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lm0 extends lj implements pr {
    public final pr d;
    public final rj e;
    public final int f;
    public rj g;
    public kj h;

    public lm0(pr prVar, rj rjVar) {
        super(hf.f, up.d);
        this.d = prVar;
        this.e = rjVar;
        this.f = ((Number) rjVar.o(new ze(10), 0)).intValue();
    }

    @Override // defpackage.pr
    public final Object e(Object obj, kj kjVar) {
        try {
            Object g = g(kjVar, obj);
            return g == ck.d ? g : ky0.a;
        } catch (Throwable th) {
            this.g = new in(kjVar.getContext(), th);
            throw th;
        }
    }

    public final Object g(kj kjVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        rj context = kjVar.getContext();
        nk.n(context);
        rj rjVar = this.g;
        if (rjVar != context) {
            int i = 0;
            if (rjVar instanceof in) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((in) rjVar).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                d30 d30Var = new d30(str2);
                if (d30Var.hasNext()) {
                    Object next = d30Var.next();
                    if (d30Var.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (d30Var.hasNext()) {
                            arrayList.add(d30Var.next());
                        }
                        list = arrayList;
                    } else {
                        list = px0.H(next);
                    }
                } else {
                    list = wp.d;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!tt0.w((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(ae.Y(arrayList2, 10));
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i3);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
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
                int size2 = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    int i4 = i + 1;
                    if (i < 0) {
                        px0.V();
                        throw null;
                    }
                    String str4 = (String) obj4;
                    if ((i == 0 || i == size2) && tt0.w(str4)) {
                        str = null;
                    } else {
                        str4.getClass();
                        if (intValue < 0) {
                            g8.g("Requested character count ", intValue, " is less than zero.");
                            return null;
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                zd.f0(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.o(new sh(4, this), 0)).intValue() != this.f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.g = context;
        }
        this.h = kjVar;
        ru ruVar = nm0.a;
        pr prVar = this.d;
        prVar.getClass();
        Object b = ruVar.b(prVar, obj, this);
        if (!nz.l(b, ck.d)) {
            this.h = null;
        }
        return b;
    }

    @Override // defpackage.h9, defpackage.dk
    public final dk getCallerFrame() {
        kj kjVar = this.h;
        if (kjVar instanceof dk) {
            return (dk) kjVar;
        }
        return null;
    }

    @Override // defpackage.lj, defpackage.kj
    public final rj getContext() {
        rj rjVar = this.g;
        return rjVar == null ? up.d : rjVar;
    }

    @Override // defpackage.h9
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        Throwable a = vk0.a(obj);
        if (a != null) {
            this.g = new in(getContext(), a);
        }
        kj kjVar = this.h;
        if (kjVar != null) {
            kjVar.resumeWith(obj);
        }
        return ck.d;
    }
}
