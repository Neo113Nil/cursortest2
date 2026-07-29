package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* renamed from: o.rM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1821rM extends KM implements InterfaceC1526mu {
    public final Type a;
    public final KM b;
    public final C1318jk c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1821rM(Type type) {
        KM im;
        KM km;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    AbstractC0048Bt.m(componentType, "getComponentType()");
                    im = componentType.isPrimitive() ? new IM(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C1821rM(componentType) : componentType instanceof WildcardType ? new NM((WildcardType) componentType) : new C2349zM(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        AbstractC0048Bt.m(genericComponentType, "genericComponentType");
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                km = new IM(cls2);
                this.b = km;
                this.c = C1318jk.h;
            }
        }
        im = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C1821rM(genericComponentType) : genericComponentType instanceof WildcardType ? new NM((WildcardType) genericComponentType) : new C2349zM(genericComponentType);
        km = im;
        this.b = km;
        this.c = C1318jk.h;
    }

    @Override // o.KM
    public final Type b() {
        return this.a;
    }

    @Override // o.InterfaceC0489St
    public final Collection getAnnotations() {
        return this.c;
    }
}
