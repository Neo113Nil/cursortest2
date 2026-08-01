package o0;

import android.widget.FrameLayout;
import com.luckycounter.drinkwater.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0303a f3692a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3693b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3694c;

    static {
        C0303a c0303a = new C0303a();
        c0303a.f3633A = new ArrayList();
        c0303a.f3636D = false;
        c0303a.f3637E = 0;
        c0303a.f3634B = false;
        c0303a.I(new h(2));
        c0303a.I(new C0308f());
        c0303a.I(new h(1));
        f3692a = c0303a;
        f3693b = new ThreadLocal();
        f3694c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f3694c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f3692a;
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
        pVar.f3690a = clone;
        pVar.f3691b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f3693b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
