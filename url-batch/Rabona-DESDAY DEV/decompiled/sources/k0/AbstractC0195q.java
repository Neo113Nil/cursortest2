package k0;

import android.widget.FrameLayout;
import com.linetic.luckycross.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0195q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0179a f2832a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2833b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2834c;

    static {
        C0179a c0179a = new C0179a();
        c0179a.f2773A = new ArrayList();
        c0179a.f2776D = false;
        c0179a.f2777E = 0;
        c0179a.f2774B = false;
        c0179a.I(new C0186h(2));
        c0179a.I(new C0184f());
        c0179a.I(new C0186h(1));
        f2832a = c0179a;
        f2833b = new ThreadLocal();
        f2834c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, AbstractC0191m abstractC0191m) {
        ArrayList arrayList = f2834c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC0191m == null) {
            abstractC0191m = f2832a;
        }
        AbstractC0191m clone = abstractC0191m.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0191m) it.next()).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0194p viewTreeObserverOnPreDrawListenerC0194p = new ViewTreeObserverOnPreDrawListenerC0194p();
        viewTreeObserverOnPreDrawListenerC0194p.f2830a = clone;
        viewTreeObserverOnPreDrawListenerC0194p.f2831b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0194p);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0194p);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2833b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
