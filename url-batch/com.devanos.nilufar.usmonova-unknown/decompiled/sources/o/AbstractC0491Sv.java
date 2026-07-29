package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: o.Sv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0491Sv implements InterfaceC0387Ov, InterfaceC1858rx {
    public final RM h = TM.u(null, new C0413Pv(this, 1));
    public final RM i = TM.u(null, new C0413Pv(this, 2));
    public final RM j = TM.u(null, new C0413Pv(this, 4));
    public final RM k = TM.u(null, new C0413Pv(this, 5));
    public final RM l = TM.u(null, new C0413Pv(this, 0));

    public static Object l(C1661ox c1661ox) {
        Class D = AbstractC1473m3.D(EB.v(c1661ox));
        if (D.isArray()) {
            Object newInstance = Array.newInstance(D.getComponentType(), 0);
            AbstractC0048Bt.m(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new C0526Ue("Cannot instantiate the default empty array of type " + D.getSimpleName() + ", because it is not an array type");
    }

    @Override // o.InterfaceC0387Ov
    public final Object call(Object... objArr) {
        AbstractC0048Bt.n(objArr, "args");
        try {
            return m().call(objArr);
        } catch (IllegalAccessException e) {
            throw new F4(e);
        }
    }

    @Override // o.InterfaceC0387Ov
    public final Object callBy(Map map) {
        Object l;
        AbstractC0048Bt.n(map, "args");
        boolean z = false;
        if (q()) {
            List<InterfaceC0310Lw> parameters = getParameters();
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(parameters));
            for (InterfaceC0310Lw interfaceC0310Lw : parameters) {
                if (map.containsKey(interfaceC0310Lw)) {
                    l = map.get(interfaceC0310Lw);
                    if (l == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC0310Lw + ')');
                    }
                } else {
                    C0362Nw c0362Nw = (C0362Nw) interfaceC0310Lw;
                    if (c0362Nw.l()) {
                        l = null;
                    } else {
                        if (!c0362Nw.m()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + c0362Nw);
                        }
                        l = l(c0362Nw.i());
                    }
                }
                arrayList.add(l);
            }
            G9 o2 = o();
            if (o2 != null) {
                try {
                    return o2.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new F4(e);
                }
            }
            throw new C0526Ue("This callable does not support a default call: " + p());
        }
        List<InterfaceC0310Lw> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return m().call(isSuspend() ? new InterfaceC2235xe[]{null} : new InterfaceC2235xe[0]);
            } catch (IllegalAccessException e2) {
                throw new F4(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.l.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i = 0;
        for (InterfaceC0310Lw interfaceC0310Lw2 : parameters2) {
            if (map.containsKey(interfaceC0310Lw2)) {
                objArr[((C0362Nw) interfaceC0310Lw2).i] = map.get(interfaceC0310Lw2);
            } else {
                C0362Nw c0362Nw2 = (C0362Nw) interfaceC0310Lw2;
                if (c0362Nw2.l()) {
                    int i2 = (i / 32) + size;
                    Object obj = objArr[i2];
                    AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.Int");
                    objArr[i2] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i % 32)));
                    z = true;
                } else if (!c0362Nw2.m()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + c0362Nw2);
                }
            }
            if (((C0362Nw) interfaceC0310Lw2).j == EnumC0285Kw.j) {
                i++;
            }
        }
        if (!z) {
            try {
                G9 m = m();
                Object[] copyOf = Arrays.copyOf(objArr, size);
                AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
                return m.call(copyOf);
            } catch (IllegalAccessException e3) {
                throw new F4(e3);
            }
        }
        G9 o3 = o();
        if (o3 != null) {
            try {
                return o3.call(objArr);
            } catch (IllegalAccessException e4) {
                throw new F4(e4);
            }
        }
        throw new C0526Ue("This callable does not support a default call: " + p());
    }

    @Override // o.InterfaceC0361Nv
    public final List getAnnotations() {
        Object invoke = this.h.invoke();
        AbstractC0048Bt.m(invoke, "_annotations()");
        return (List) invoke;
    }

    @Override // o.InterfaceC0387Ov
    public final List getParameters() {
        Object invoke = this.i.invoke();
        AbstractC0048Bt.m(invoke, "_parameters()");
        return (List) invoke;
    }

    @Override // o.InterfaceC0387Ov
    public final InterfaceC1463lx getReturnType() {
        Object invoke = this.j.invoke();
        AbstractC0048Bt.m(invoke, "_returnType()");
        return (InterfaceC1463lx) invoke;
    }

    @Override // o.InterfaceC0387Ov
    public final List getTypeParameters() {
        Object invoke = this.k.invoke();
        AbstractC0048Bt.m(invoke, "_typeParameters()");
        return (List) invoke;
    }

    @Override // o.InterfaceC0387Ov
    public final EnumC2122vx getVisibility() {
        C0244Jh visibility = p().getVisibility();
        AbstractC0048Bt.m(visibility, "descriptor.visibility");
        C2245xo c2245xo = JY.a;
        if (visibility.equals(AbstractC0270Kh.e)) {
            return EnumC2122vx.h;
        }
        if (visibility.equals(AbstractC0270Kh.c)) {
            return EnumC2122vx.i;
        }
        if (visibility.equals(AbstractC0270Kh.d)) {
            return EnumC2122vx.j;
        }
        if (visibility.equals(AbstractC0270Kh.a) ? true : visibility.equals(AbstractC0270Kh.b)) {
            return EnumC2122vx.k;
        }
        return null;
    }

    @Override // o.InterfaceC0387Ov
    public final boolean isAbstract() {
        return p().g() == 4;
    }

    @Override // o.InterfaceC0387Ov
    public final boolean isFinal() {
        return p().g() == 1;
    }

    @Override // o.InterfaceC0387Ov
    public final boolean isOpen() {
        return p().g() == 3;
    }

    public abstract G9 m();

    public abstract AbstractC1330jw n();

    public abstract G9 o();

    public abstract InterfaceC2204x9 p();

    public final boolean q() {
        return AbstractC0048Bt.h(getName(), "<init>") && n().e().isAnnotation();
    }

    public abstract boolean r();
}
