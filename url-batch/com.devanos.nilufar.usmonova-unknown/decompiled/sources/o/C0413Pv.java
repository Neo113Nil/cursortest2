package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Pv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413Pv extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC0491Sv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0413Pv(AbstractC0491Sv abstractC0491Sv, int i) {
        super(0);
        this.h = i;
        this.i = abstractC0491Sv;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        int i;
        Type[] lowerBounds;
        int i2 = this.h;
        int i3 = 0;
        AbstractC0491Sv abstractC0491Sv = this.i;
        switch (i2) {
            case 0:
                int size = (abstractC0491Sv.isSuspend() ? 1 : 0) + abstractC0491Sv.getParameters().size();
                int size2 = (abstractC0491Sv.getParameters().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                Iterator it = abstractC0491Sv.getParameters().iterator();
                while (it.hasNext()) {
                    C0362Nw c0362Nw = (C0362Nw) ((InterfaceC0310Lw) it.next());
                    boolean l = c0362Nw.l();
                    int i4 = c0362Nw.i;
                    if (l) {
                        C1661ox i5 = c0362Nw.i();
                        C2245xo c2245xo = JY.a;
                        AbstractC1004ey abstractC1004ey = i5.h;
                        if (abstractC1004ey == null || !AbstractC0306Ls.c(abstractC1004ey)) {
                            objArr[i4] = JY.e(PX.R(c0362Nw.i()));
                        }
                    }
                    if (c0362Nw.m()) {
                        objArr[i4] = AbstractC0491Sv.l(c0362Nw.i());
                    }
                }
                for (int i6 = 0; i6 < size2; i6++) {
                    objArr[size + i6] = 0;
                }
                return objArr;
            case 1:
                return JY.d(abstractC0491Sv.p());
            case 2:
                InterfaceC2204x9 p = abstractC0491Sv.p();
                ArrayList arrayList = new ArrayList();
                if (abstractC0491Sv.r()) {
                    i = 0;
                } else {
                    C0261Jy g = JY.g(p);
                    if (g != null) {
                        arrayList.add(new C0362Nw(abstractC0491Sv, 0, EnumC0285Kw.h, new C0439Qv(g, 0)));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C0261Jy J = p.J();
                    if (J != null) {
                        arrayList.add(new C0362Nw(abstractC0491Sv, i, EnumC0285Kw.i, new C0439Qv(J, 1)));
                        i++;
                    }
                }
                int size3 = p.t0().size();
                while (i3 < size3) {
                    arrayList.add(new C0362Nw(abstractC0491Sv, i, EnumC0285Kw.j, new C0465Rv(p, i3)));
                    i3++;
                    i++;
                }
                if (abstractC0491Sv.q() && (p instanceof InterfaceC0541Ut) && arrayList.size() > 1) {
                    AbstractC0982ec.e0(arrayList, new C0685a3(11));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                Type type = null;
                if (abstractC0491Sv.isSuspend()) {
                    Object w0 = AbstractC0720ac.w0(abstractC0491Sv.m().a());
                    ParameterizedType parameterizedType = w0 instanceof ParameterizedType ? (ParameterizedType) w0 : null;
                    if (AbstractC0048Bt.h(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC2235xe.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        AbstractC0048Bt.m(actualTypeArguments, "continuationType.actualTypeArguments");
                        Object r0 = P6.r0(actualTypeArguments);
                        WildcardType wildcardType = r0 instanceof WildcardType ? (WildcardType) r0 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) P6.j0(lowerBounds);
                        }
                    }
                }
                return type == null ? abstractC0491Sv.m().getReturnType() : type;
            case 4:
                AbstractC1004ey returnType = abstractC0491Sv.p().getReturnType();
                AbstractC0048Bt.k(returnType);
                return new C1661ox(returnType, new C0413Pv(abstractC0491Sv, 3));
            default:
                List<InterfaceC1437lX> typeParameters = abstractC0491Sv.p().getTypeParameters();
                AbstractC0048Bt.m(typeParameters, "descriptor.typeParameters");
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(typeParameters));
                for (InterfaceC1437lX interfaceC1437lX : typeParameters) {
                    AbstractC0048Bt.m(interfaceC1437lX, "descriptor");
                    arrayList2.add(new C1793qx(abstractC0491Sv, interfaceC1437lX));
                }
                return arrayList2;
        }
    }
}
