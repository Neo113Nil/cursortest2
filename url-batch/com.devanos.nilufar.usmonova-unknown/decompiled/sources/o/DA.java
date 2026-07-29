package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class DA {
    public static final AbstractC1425lL a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof o.AbstractC1425lL) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (o.AbstractC1425lL) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object d;
        try {
            ClassLoader classLoader = InterfaceC0365Nz.class.getClassLoader();
            AbstractC0048Bt.k(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof InterfaceC1315jh) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            d = AbstractC1494mO.d(th);
        }
        AbstractC1425lL abstractC1425lL = (AbstractC1425lL) (d instanceof C1362kO ? null : d);
        if (abstractC1425lL == null) {
            abstractC1425lL = new IT(C2234xd.t);
        }
        a = abstractC1425lL;
    }
}
