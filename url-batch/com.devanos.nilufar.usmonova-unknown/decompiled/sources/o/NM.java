package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class NM extends KM implements InterfaceC1526mu {
    public final WildcardType a;

    public NM(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // o.KM
    public final Type b() {
        return this.a;
    }

    public final KM c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object r0 = P6.r0(lowerBounds);
            AbstractC0048Bt.m(r0, "lowerBounds.single()");
            Type type = (Type) r0;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new IM(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C1821rM(type) : type instanceof WildcardType ? new NM((WildcardType) type) : new C2349zM(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) P6.r0(upperBounds);
        if (AbstractC0048Bt.h(type2, Object.class)) {
            return null;
        }
        AbstractC0048Bt.m(type2, "ub");
        boolean z2 = type2 instanceof Class;
        if (z2) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new IM(cls2);
            }
        }
        return ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) ? new C1821rM(type2) : type2 instanceof WildcardType ? new NM((WildcardType) type2) : new C2349zM(type2);
    }

    @Override // o.InterfaceC0489St
    public final Collection getAnnotations() {
        return C1318jk.h;
    }
}
