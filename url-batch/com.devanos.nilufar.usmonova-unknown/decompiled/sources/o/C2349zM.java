package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.zM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2349zM extends KM implements InterfaceC1526mu {
    public final Type a;
    public final BM b;

    public C2349zM(Type type) {
        BM c2217xM;
        AbstractC0048Bt.n(type, "reflectType");
        this.a = type;
        if (type instanceof Class) {
            c2217xM = new C2217xM((Class) type);
        } else if (type instanceof TypeVariable) {
            c2217xM = new LM((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            AbstractC0048Bt.l(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c2217xM = new C2217xM((Class) rawType);
        }
        this.b = c2217xM;
    }

    @Override // o.KM, o.InterfaceC0489St
    public final C1558nM a(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        return null;
    }

    @Override // o.KM
    public final Type b() {
        return this.a;
    }

    public final ArrayList c() {
        InterfaceC0738au c1821rM;
        List<Type> c = AbstractC1492mM.c(this.a);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(c));
        for (Type type : c) {
            AbstractC0048Bt.n(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c1821rM = new IM(cls);
                    arrayList.add(c1821rM);
                }
            }
            c1821rM = ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C1821rM(type) : type instanceof WildcardType ? new NM((WildcardType) type) : new C2349zM(type);
            arrayList.add(c1821rM);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            AbstractC0048Bt.m(typeParameters, "getTypeParameters()");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC0489St
    public final Collection getAnnotations() {
        return C1318jk.h;
    }
}
