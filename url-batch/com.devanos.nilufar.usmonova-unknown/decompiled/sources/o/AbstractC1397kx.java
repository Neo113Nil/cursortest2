package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* renamed from: o.kx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1397kx extends AbstractC0491Sv implements InterfaceC0937dx {
    public static final Object s = new Object();
    public final AbstractC1330jw m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final String f191o;
    public final Object p;
    public final Object q;
    public final RM r;

    public AbstractC1397kx(AbstractC1330jw abstractC1330jw, String str, String str2, PJ pj, Object obj) {
        this.m = abstractC1330jw;
        this.n = str;
        this.f191o = str2;
        this.p = obj;
        this.q = EB.C(EnumC1992tz.h, new C1331jx(this, 1));
        this.r = TM.u(pj, new C1331jx(this, 0));
    }

    public final boolean equals(Object obj) {
        AbstractC1397kx c = JY.c(obj);
        return c != null && AbstractC0048Bt.h(this.m, c.m) && AbstractC0048Bt.h(this.n, c.n) && AbstractC0048Bt.h(this.f191o, c.f191o) && AbstractC0048Bt.h(this.p, c.p);
    }

    @Override // o.InterfaceC0387Ov
    public final String getName() {
        return this.n;
    }

    public final int hashCode() {
        return this.f191o.hashCode() + ((this.n.hashCode() + (this.m.hashCode() * 31)) * 31);
    }

    @Override // o.InterfaceC0937dx
    public final boolean isConst() {
        return p().isConst();
    }

    @Override // o.InterfaceC0937dx
    public final boolean isLateinit() {
        return p().V();
    }

    @Override // o.InterfaceC0387Ov, o.InterfaceC1396kw
    public final boolean isSuspend() {
        return false;
    }

    @Override // o.AbstractC0491Sv
    public final G9 m() {
        return v().m();
    }

    @Override // o.AbstractC0491Sv
    public final AbstractC1330jw n() {
        return this.m;
    }

    @Override // o.AbstractC0491Sv
    public final G9 o() {
        v().getClass();
        return null;
    }

    @Override // o.AbstractC0491Sv
    public final boolean r() {
        return !AbstractC0048Bt.h(this.p, AbstractC2336z9.NO_RECEIVER);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o.Iy] */
    public final Member s() {
        if (!p().a0()) {
            return null;
        }
        C1639ob c1639ob = AbstractC0969eP.a;
        AbstractC0868ct b = AbstractC0969eP.b(p());
        if (b instanceof C1988tv) {
            C1988tv c1988tv = (C1988tv) b;
            InterfaceC0893dE interfaceC0893dE = c1988tv.v;
            C0024Av c0024Av = c1988tv.u;
            if ((c0024Av.i & 16) == 16) {
                C2318yv c2318yv = c0024Av.n;
                int i = c2318yv.i;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.m.l(interfaceC0893dE.getString(c2318yv.j), interfaceC0893dE.getString(c2318yv.k));
            }
        }
        return (Field) this.q.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(Member member, Object obj) {
        try {
            Object obj2 = s;
            if (obj == obj2 && p().J() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object h = r() ? AbstractC1052fg.h(this.p, p()) : obj;
            if (h == obj2) {
                h = null;
            }
            if (!r()) {
                obj = null;
            }
            if (obj == obj2) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC0022At.x(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(h);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (h == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    AbstractC0048Bt.m(cls, "fieldOrMethod.parameterTypes[0]");
                    h = JY.e(cls);
                }
                return method.invoke(null, h);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                AbstractC0048Bt.m(cls2, "fieldOrMethod.parameterTypes[1]");
                obj = JY.e(cls2);
            }
            return method2.invoke(null, h, obj);
        } catch (IllegalAccessException e) {
            throw new F4("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
        }
    }

    public final String toString() {
        C2304yh c2304yh = XM.a;
        return XM.c(p());
    }

    @Override // o.AbstractC0491Sv
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final PJ p() {
        Object invoke = this.r.invoke();
        AbstractC0048Bt.m(invoke, "_descriptor()");
        return (PJ) invoke;
    }

    public abstract AbstractC1135gx v();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC1397kx(AbstractC1330jw abstractC1330jw, String str, String str2, Object obj) {
        this(abstractC1330jw, str, str2, null, obj);
        AbstractC0048Bt.n(abstractC1330jw, "container");
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1397kx(AbstractC1330jw abstractC1330jw, PJ pj) {
        this(abstractC1330jw, r3, AbstractC0969eP.b(pj).g(), pj, AbstractC2336z9.NO_RECEIVER);
        AbstractC0048Bt.n(pj, "descriptor");
        String b = pj.getName().b();
        AbstractC0048Bt.m(b, "descriptor.name.asString()");
    }
}
