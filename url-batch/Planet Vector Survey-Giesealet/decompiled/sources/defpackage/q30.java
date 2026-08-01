package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class q30 {
    public static final ii0 a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if ((r1 instanceof defpackage.ii0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r1 = (defpackage.ii0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = null;
     */
    static {
        Object uk0Var;
        try {
            ClassLoader classLoader = ln0.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof vl) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            uk0Var = new uk0(th);
        }
        ii0 ii0Var = (ii0) (uk0Var instanceof uk0 ? null : uk0Var);
        if (ii0Var == null) {
            ii0Var = new lt0(new zh(7));
        }
        a = ii0Var;
    }
}
