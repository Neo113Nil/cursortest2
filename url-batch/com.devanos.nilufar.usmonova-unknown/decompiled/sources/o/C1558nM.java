package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.nM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558nM extends BM {
    public final Annotation a;

    public C1558nM(Annotation annotation) {
        AbstractC0048Bt.n(annotation, "annotation");
        this.a = annotation;
    }

    public final ArrayList b() {
        Annotation annotation = this.a;
        Method[] declaredMethods = AbstractC1473m3.D(AbstractC1473m3.B(annotation)).getDeclaredMethods();
        AbstractC0048Bt.m(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, null);
            AbstractC0048Bt.m(invoke, "method.invoke(annotation)");
            C0827cE e = C0827cE.e(method.getName());
            Class<?> cls = invoke.getClass();
            List list = AbstractC1492mM.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new CM(e, (Enum) invoke) : invoke instanceof Annotation ? new C1690pM(e, (Annotation) invoke) : invoke instanceof Object[] ? new C1756qM(e, (Object[]) invoke) : invoke instanceof Class ? new C2283yM(e, (Class) invoke) : new EM(e, invoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1558nM) {
            return this.a == ((C1558nM) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return C1558nM.class.getName() + ": " + this.a;
    }
}
