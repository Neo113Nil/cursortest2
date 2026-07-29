package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

/* loaded from: classes.dex */
public final class PB extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PB(C1661ox c1661ox, int i, InterfaceC0235Iy interfaceC0235Iy) {
        super(0);
        this.h = 2;
        this.i = c1661ox;
        this.k = i;
        this.j = interfaceC0235Iy;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                SB sb = (SB) this.i;
                C0321Mh c0321Mh = sb.a;
                AbstractC0900dL a = sb.a(c0321Mh.c);
                List J0 = a != null ? AbstractC0720ac.J0(c0321Mh.a.e.f(a, (E) this.j, this.k)) : null;
                return J0 == null ? C1318jk.h : J0;
            case 1:
                SB sb2 = (SB) this.i;
                C0321Mh c0321Mh2 = sb2.a;
                AbstractC0900dL a2 = sb2.a(c0321Mh2.c);
                List o2 = a2 != null ? c0321Mh2.a.e.o(a2, (E) this.j, this.k) : null;
                return o2 == null ? C1318jk.h : o2;
            default:
                C1661ox c1661ox = (C1661ox) this.i;
                RM rm = c1661ox.i;
                Type type = rm != null ? (Type) rm.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    AbstractC0048Bt.m(componentType, "{\n                      …                        }");
                    return componentType;
                }
                boolean z = type instanceof GenericArrayType;
                int i = this.k;
                if (z) {
                    if (i == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        AbstractC0048Bt.m(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new C0526Ue("Array type has been queried for a non-0th argument: " + c1661ox);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new C0526Ue("Non-generic type has been queried for arguments: " + c1661ox);
                }
                Type type2 = (Type) ((List) this.j.getValue()).get(i);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    AbstractC0048Bt.m(lowerBounds, "argument.lowerBounds");
                    Type type3 = (Type) P6.k0(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        AbstractC0048Bt.m(upperBounds, "argument.upperBounds");
                        type2 = (Type) P6.j0(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
                AbstractC0048Bt.m(type2, "{\n                      …                        }");
                return type2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PB(SB sb, E e, int i, int i2) {
        super(0);
        this.h = i2;
        this.i = sb;
        this.j = e;
        this.k = i;
    }
}
