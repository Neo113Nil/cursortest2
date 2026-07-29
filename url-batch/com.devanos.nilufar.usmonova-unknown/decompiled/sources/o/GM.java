package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class GM extends FM implements InterfaceC1855ru {
    public final Method a;

    public GM(Method method) {
        AbstractC0048Bt.n(method, "member");
        this.a = method;
    }

    @Override // o.FM
    public final Member b() {
        return this.a;
    }

    public final KM f() {
        Type genericReturnType = this.a.getGenericReturnType();
        AbstractC0048Bt.m(genericReturnType, "member.genericReturnType");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new IM(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new C1821rM(genericReturnType) : genericReturnType instanceof WildcardType ? new NM((WildcardType) genericReturnType) : new C2349zM(genericReturnType);
    }

    public final List g() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC0048Bt.m(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        AbstractC0048Bt.m(parameterAnnotations, "member.parameterAnnotations");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // o.InterfaceC1855ru
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        AbstractC0048Bt.m(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new LM(typeVariable));
        }
        return arrayList;
    }
}
