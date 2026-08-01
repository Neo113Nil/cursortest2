package defpackage;

import android.view.ViewGroup;
import com.ionia.reidopitaco.libya.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class d60 {
    public static final v6 a = new v6();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, z50 z50Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (z50Var == null) {
            z50Var = a;
        }
        z50 clone = z50Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((z50) obj).x(viewGroup);
            }
        }
        clone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            l8.c();
            return;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        c60 c60Var = new c60();
        c60Var.f = clone;
        c60Var.g = viewGroup;
        viewGroup.addOnAttachStateChangeListener(c60Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(c60Var);
    }

    public static l6 b() {
        l6 l6Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (l6Var = (l6) weakReference.get()) != null) {
            return l6Var;
        }
        l6 l6Var2 = new l6(0);
        threadLocal.set(new WeakReference(l6Var2));
        return l6Var2;
    }
}
