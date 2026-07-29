package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.mw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528mw extends AbstractC0491Sv implements InterfaceC0200Hp, InterfaceC1396kw, InterfaceC0537Up {
    public static final /* synthetic */ InterfaceC0937dx[] s;
    public final AbstractC1330jw m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f199o;
    public final RM p;
    public final Object q;
    public final Object r;

    static {
        VM vm = UM.a;
        s = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C1528mw.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public C1528mw(AbstractC1330jw abstractC1330jw, String str, String str2, InterfaceC0381Op interfaceC0381Op, Object obj) {
        this.m = abstractC1330jw;
        this.n = str2;
        this.f199o = obj;
        this.p = TM.u(interfaceC0381Op, new K2(this, 11, str));
        C1462lw c1462lw = new C1462lw(this, 0);
        EnumC1992tz enumC1992tz = EnumC1992tz.h;
        this.q = EB.C(enumC1992tz, c1462lw);
        this.r = EB.C(enumC1992tz, new C1462lw(this, 1));
    }

    public static final V9 s(C1528mw c1528mw, Constructor constructor, InterfaceC0381Op interfaceC0381Op, boolean z) {
        Object obj = c1528mw.f199o;
        Class cls = null;
        if (!z) {
            C0981eb c0981eb = interfaceC0381Op instanceof C0981eb ? (C0981eb) interfaceC0381Op : null;
            if (c0981eb != null) {
                C0981eb c0981eb2 = c0981eb;
                if (!AbstractC0270Kh.e(c0981eb2.getVisibility())) {
                    InterfaceC1245ib I = c0981eb.I();
                    AbstractC0048Bt.m(I, "constructorDescriptor.constructedClass");
                    if (!AbstractC0306Ls.b(I) && !AbstractC0114Eh.q(c0981eb.I())) {
                        List t0 = c0981eb2.t0();
                        AbstractC0048Bt.m(t0, "constructorDescriptor.valueParameters");
                        if (!t0.isEmpty()) {
                            Iterator it = t0.iterator();
                            while (it.hasNext()) {
                                AbstractC1004ey c = ((RY) it.next()).c();
                                AbstractC0048Bt.m(c, "it.type");
                                if (AbstractC0022At.F(c)) {
                                    if (c1528mw.r()) {
                                        return new H9(constructor, AbstractC1052fg.h(obj, c1528mw.p()), 0);
                                    }
                                    AbstractC0048Bt.n(constructor, "constructor");
                                    Class declaringClass = constructor.getDeclaringClass();
                                    AbstractC0048Bt.m(declaringClass, "constructor.declaringClass");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    AbstractC0048Bt.m(genericParameterTypes, "constructor.genericParameterTypes");
                                    return new I9(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : P6.f0(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (c1528mw.r()) {
            return new H9(constructor, AbstractC1052fg.h(obj, c1528mw.p()), 1);
        }
        AbstractC0048Bt.n(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        AbstractC0048Bt.m(declaringClass2, "constructor.declaringClass");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls2 = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        AbstractC0048Bt.m(genericParameterTypes2, "constructor.genericParameterTypes");
        return new I9(constructor, declaringClass2, cls2, genericParameterTypes2, 1);
    }

    @Override // o.InterfaceC2378zp
    public final Object e(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    public final boolean equals(Object obj) {
        C1528mw b = JY.b(obj);
        return b != null && AbstractC0048Bt.h(this.m, b.m) && getName().equals(b.getName()) && AbstractC0048Bt.h(this.n, b.n) && AbstractC0048Bt.h(this.f199o, b.f199o);
    }

    @Override // o.InterfaceC0200Hp
    public final int getArity() {
        return AbstractC1473m3.C(m());
    }

    @Override // o.InterfaceC0387Ov
    public final String getName() {
        String b = ((AbstractC1184hg) p()).getName().b();
        AbstractC0048Bt.m(b, "descriptor.name.asString()");
        return b;
    }

    public final int hashCode() {
        return this.n.hashCode() + ((getName().hashCode() + (this.m.hashCode() * 31)) * 31);
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // o.InterfaceC0387Ov, o.InterfaceC1396kw
    public final boolean isSuspend() {
        return p().isSuspend();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.AbstractC0491Sv
    public final G9 m() {
        return (G9) this.q.getValue();
    }

    @Override // o.AbstractC0491Sv
    public final AbstractC1330jw n() {
        return this.m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.AbstractC0491Sv
    public final G9 o() {
        return (G9) this.r.getValue();
    }

    @Override // o.AbstractC0491Sv
    public final boolean r() {
        return !AbstractC0048Bt.h(this.f199o, AbstractC2336z9.NO_RECEIVER);
    }

    @Override // o.AbstractC0491Sv
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0381Op p() {
        InterfaceC0937dx interfaceC0937dx = s[0];
        Object invoke = this.p.invoke();
        AbstractC0048Bt.m(invoke, "<get-descriptor>(...)");
        return (InterfaceC0381Op) invoke;
    }

    public final String toString() {
        C2304yh c2304yh = XM.a;
        return XM.b(p());
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1528mw(AbstractC1330jw abstractC1330jw, InterfaceC0381Op interfaceC0381Op) {
        this(abstractC1330jw, r3, AbstractC0969eP.c(interfaceC0381Op).i(), interfaceC0381Op, AbstractC2336z9.NO_RECEIVER);
        AbstractC0048Bt.n(interfaceC0381Op, "descriptor");
        String b = ((AbstractC1184hg) interfaceC0381Op).getName().b();
        AbstractC0048Bt.m(b, "descriptor.name.asString()");
    }
}
