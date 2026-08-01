package k0;

import android.widget.FrameLayout;
import com.fortuneodd.shadegrid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0187a f2835a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2836b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2837c;

    static {
        C0187a c0187a = new C0187a();
        c0187a.f2776A = new ArrayList();
        c0187a.f2779D = false;
        c0187a.f2780E = 0;
        c0187a.f2777B = false;
        c0187a.I(new h(2));
        c0187a.I(new C0192f());
        c0187a.I(new h(1));
        f2835a = c0187a;
        f2836b = new ThreadLocal();
        f2837c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f2837c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f2835a;
        }
        m clone = mVar.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((m) it.next()).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        p pVar = new p();
        pVar.f2833a = clone;
        pVar.f2834b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2836b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
