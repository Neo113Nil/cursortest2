package o;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Js, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255Js implements G9 {
    public final G9 a;
    public final boolean b;
    public final C0950e6 c;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if ((r10 instanceof o.InterfaceC2071v8) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0255Js(InterfaceC2204x9 interfaceC2204x9, G9 g9, boolean z) {
        Method declaredMethod;
        C0950e6 c0950e6;
        Class W;
        AbstractC0048Bt.n(interfaceC2204x9, "descriptor");
        this.a = g9;
        this.b = z;
        AbstractC1004ey returnType = interfaceC2204x9.getReturnType();
        AbstractC0048Bt.k(returnType);
        Class W2 = AbstractC1052fg.W(returnType);
        if (W2 != null) {
            try {
                declaredMethod = W2.getDeclaredMethod("box-impl", AbstractC1052fg.E(W2, interfaceC2204x9).getReturnType());
                AbstractC0048Bt.m(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new C0526Ue("No box method found in inline class: " + W2 + " (calling " + interfaceC2204x9 + ')');
            }
        } else {
            declaredMethod = null;
        }
        int i = 0;
        if (AbstractC0306Ls.a(interfaceC2204x9)) {
            c0950e6 = new C0950e6(C1197ht.k, new Method[0], declaredMethod);
        } else {
            int i2 = -1;
            if (!(g9 instanceof T9)) {
                if (!(interfaceC2204x9 instanceof InterfaceC0629Yd)) {
                    if (interfaceC2204x9.x() != null && !(g9 instanceof InterfaceC2071v8)) {
                        InterfaceC1118gg n = interfaceC2204x9.n();
                        AbstractC0048Bt.m(n, "descriptor.containingDeclaration");
                        if (!AbstractC0306Ls.b(n)) {
                            i2 = 1;
                        }
                    }
                    i2 = 0;
                }
            }
            ArrayList arrayList = new ArrayList();
            C0261Jy J = interfaceC2204x9.J();
            AbstractC1004ey c = J != null ? J.c() : null;
            if (c != null) {
                arrayList.add(c);
            } else if (interfaceC2204x9 instanceof InterfaceC0629Yd) {
                InterfaceC1245ib I = ((InterfaceC0629Yd) interfaceC2204x9).I();
                AbstractC0048Bt.m(I, "descriptor.constructedClass");
                if (I.k()) {
                    InterfaceC1118gg n2 = I.n();
                    AbstractC0048Bt.l(n2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((InterfaceC1245ib) n2).i());
                }
            } else {
                InterfaceC1118gg n3 = interfaceC2204x9.n();
                AbstractC0048Bt.m(n3, "descriptor.containingDeclaration");
                if ((n3 instanceof InterfaceC1245ib) && AbstractC0306Ls.b(n3)) {
                    arrayList.add(((InterfaceC1245ib) n3).i());
                }
            }
            List t0 = interfaceC2204x9.t0();
            AbstractC0048Bt.m(t0, "descriptor.valueParameters");
            Iterator it = t0.iterator();
            while (it.hasNext()) {
                arrayList.add(((RY) it.next()).c());
            }
            int size = arrayList.size() + i2 + (this.b ? ((arrayList.size() + 31) / 32) + 1 : 0) + (((interfaceC2204x9 instanceof InterfaceC0381Op) && ((InterfaceC0381Op) interfaceC2204x9).isSuspend()) ? 1 : 0);
            if (AbstractC1473m3.C(this) != size) {
                throw new C0526Ue("Inconsistent number of parameters in the descriptor and Java reflection object: " + AbstractC1473m3.C(this) + " != " + size + "\nCalling: " + interfaceC2204x9 + "\nParameter types: " + this.a.a() + ")\nDefault: " + this.b);
            }
            C1197ht c0 = AbstractC1807r8.c0(Math.max(i2, 0), arrayList.size() + i2);
            Method[] methodArr = new Method[size];
            while (i < size) {
                methodArr[i] = (i > c0.i || c0.h > i || (W = AbstractC1052fg.W((AbstractC1004ey) arrayList.get(i - i2))) == null) ? null : AbstractC1052fg.E(W, interfaceC2204x9);
                i++;
            }
            c0950e6 = new C0950e6(c0, methodArr, declaredMethod);
        }
        this.c = c0950e6;
    }

    @Override // o.G9
    public final List a() {
        return this.a.a();
    }

    @Override // o.G9
    public final Member b() {
        return this.a.b();
    }

    @Override // o.G9
    public final Object call(Object[] objArr) {
        Object invoke;
        AbstractC0048Bt.n(objArr, "args");
        C0950e6 c0950e6 = this.c;
        C1197ht c1197ht = (C1197ht) c0950e6.i;
        Method[] methodArr = (Method[]) c0950e6.j;
        Method method = (Method) c0950e6.k;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC0048Bt.m(copyOf, "copyOf(this, size)");
        int i = c1197ht.h;
        int i2 = c1197ht.i;
        if (i <= i2) {
            while (true) {
                Method method2 = methodArr[i];
                Object obj = objArr[i];
                if (method2 != null) {
                    if (obj != null) {
                        obj = method2.invoke(obj, null);
                    } else {
                        Class<?> returnType = method2.getReturnType();
                        AbstractC0048Bt.m(returnType, "method.returnType");
                        obj = JY.e(returnType);
                    }
                }
                copyOf[i] = obj;
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        Object call = this.a.call(copyOf);
        return (method == null || (invoke = method.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // o.G9
    public final Type getReturnType() {
        return this.a.getReturnType();
    }
}
