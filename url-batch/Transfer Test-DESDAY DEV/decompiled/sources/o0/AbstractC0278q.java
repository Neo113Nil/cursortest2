package o0;

import android.widget.FrameLayout;
import com.football.transfertrivia.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0278q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0262a f3265a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3266b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3267c;

    static {
        C0262a c0262a = new C0262a();
        c0262a.f3206A = new ArrayList();
        c0262a.f3209D = false;
        c0262a.f3210E = 0;
        c0262a.f3207B = false;
        c0262a.I(new C0269h(2));
        c0262a.I(new C0267f());
        c0262a.I(new C0269h(1));
        f3265a = c0262a;
        f3266b = new ThreadLocal();
        f3267c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, AbstractC0274m abstractC0274m) {
        ArrayList arrayList = f3267c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC0274m == null) {
            abstractC0274m = f3265a;
        }
        AbstractC0274m clone = abstractC0274m.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0274m) it.next()).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0277p viewTreeObserverOnPreDrawListenerC0277p = new ViewTreeObserverOnPreDrawListenerC0277p();
        viewTreeObserverOnPreDrawListenerC0277p.f3263a = clone;
        viewTreeObserverOnPreDrawListenerC0277p.f3264b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0277p);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0277p);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f3266b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
