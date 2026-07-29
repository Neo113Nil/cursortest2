package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* loaded from: classes.dex */
public final class LM extends BM implements InterfaceC0489St {
    public final TypeVariable a;

    public LM(TypeVariable typeVariable) {
        AbstractC0048Bt.n(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    @Override // o.InterfaceC0489St
    public final C1558nM a(C2245xo c2245xo) {
        Annotation[] declaredAnnotations;
        AbstractC0048Bt.n(c2245xo, "fqName");
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return EB.p(declaredAnnotations, c2245xo);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LM) {
            return AbstractC0048Bt.h(this.a, ((LM) obj).a);
        }
        return false;
    }

    @Override // o.InterfaceC0489St
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C1318jk.h : EB.r(declaredAnnotations);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return LM.class.getName() + ": " + this.a;
    }
}
