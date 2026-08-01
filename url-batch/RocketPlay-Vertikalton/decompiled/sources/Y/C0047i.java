package Y;

import E1.AbstractC0001b;
import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.luckycounter.drinkwater.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.AbstractC0332e;

/* renamed from: Y.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1450a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1451b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1452c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1453e = false;

    public C0047i(ViewGroup viewGroup) {
        this.f1450a = viewGroup;
    }

    public static C0047i f(ViewGroup viewGroup, M0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0047i) {
            return (C0047i) tag;
        }
        eVar.getClass();
        C0047i c0047i = new C0047i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0047i);
        return c0047i;
    }

    public final void a(int i, int i2, O o2) {
        synchronized (this.f1451b) {
            try {
                G.c cVar = new G.c();
                U d = d(o2.f1389c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                U u2 = new U(i, i2, o2, cVar);
                this.f1451b.add(u2);
                u2.d.add(new T(this, u2, 0));
                u2.d.add(new T(this, u2, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z2) {
        U u2;
        Iterator it;
        Iterator it2 = arrayList.iterator();
        U u3 = null;
        U u4 = null;
        while (it2.hasNext()) {
            U u5 = (U) it2.next();
            int c2 = AbstractC0001b.c(u5.f1407c.f1486E);
            int a2 = AbstractC0332e.a(u5.f1405a);
            if (a2 != 0) {
                if (a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                    }
                } else if (c2 != 2) {
                    u4 = u5;
                }
            }
            if (c2 == 2 && u3 == null) {
                u3 = u5;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + u3 + " to " + u4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = ((U) arrayList.get(arrayList.size() - 1)).f1407c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0054p c0054p = ((U) it3.next()).f1407c.f1488H;
            C0054p c0054p2 = abstractComponentCallbacksC0055q.f1488H;
            c0054p.f1474b = c0054p2.f1474b;
            c0054p.f1475c = c0054p2.f1475c;
            c0054p.d = c0054p2.d;
            c0054p.f1476e = c0054p2.f1476e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it4.hasNext()) {
                break;
            }
            U u6 = (U) it4.next();
            G.c cVar = new G.c();
            u6.d();
            HashSet hashSet = u6.f1408e;
            hashSet.add(cVar);
            C0044f c0044f = new C0044f(u6, cVar);
            c0044f.d = false;
            c0044f.f1446c = z2;
            arrayList2.add(c0044f);
            G.c cVar2 = new G.c();
            u6.d();
            hashSet.add(cVar2);
            if (!z2 ? u6 == u4 : u6 == u3) {
                z3 = true;
            }
            C0046h c0046h = new C0046h(u6, cVar2);
            int i = u6.f1405a;
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = u6.f1407c;
            if (i == 2) {
                if (z2) {
                    C0054p c0054p3 = abstractComponentCallbacksC0055q2.f1488H;
                } else {
                    abstractComponentCallbacksC0055q2.getClass();
                }
                if (z2) {
                    C0054p c0054p4 = abstractComponentCallbacksC0055q2.f1488H;
                } else {
                    C0054p c0054p5 = abstractComponentCallbacksC0055q2.f1488H;
                }
            } else if (z2) {
                C0054p c0054p6 = abstractComponentCallbacksC0055q2.f1488H;
            } else {
                abstractComponentCallbacksC0055q2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0054p c0054p7 = abstractComponentCallbacksC0055q2.f1488H;
                } else {
                    abstractComponentCallbacksC0055q2.getClass();
                }
            }
            arrayList3.add(c0046h);
            u6.d.add(new H.m(this, arrayList4, u6));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            U u7 = (U) ((C0046h) it5.next()).f1448a;
            AbstractC0001b.c(u7.f1407c.f1486E);
            int i2 = u7.f1405a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0046h c0046h2 = (C0046h) it6.next();
            hashMap.put((U) c0046h2.f1448a, Boolean.FALSE);
            c0046h2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1450a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0044f c0044f2 = (C0044f) it7.next();
            U u8 = (U) c0044f2.f1448a;
            int c3 = AbstractC0001b.c(u8.f1407c.f1486E);
            int i3 = u8.f1405a;
            if (c3 != i3) {
                it = it7;
                if (c3 == 2 || i3 == 2) {
                    B.j j2 = c0044f2.j(context);
                    if (j2 == null) {
                        c0044f2.d();
                    } else {
                        Animator animator = (Animator) j2.f73c;
                        if (animator == null) {
                            arrayList5.add(c0044f2);
                        } else {
                            U u9 = (U) c0044f2.f1448a;
                            u2 = u4;
                            boolean equals = Boolean.TRUE.equals(hashMap.get(u9));
                            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q3 = u9.f1407c;
                            if (equals) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0055q3 + " as this Fragment was involved in a Transition.");
                                }
                                c0044f2.d();
                                it7 = it;
                                u4 = u2;
                            } else {
                                boolean z5 = u9.f1405a == 3;
                                if (z5) {
                                    arrayList4.remove(u9);
                                }
                                View view = abstractComponentCallbacksC0055q3.f1486E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new C0042d(viewGroup, view, z5, u9, c0044f2));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + u9 + " has started.");
                                }
                                ((G.c) c0044f2.f1449b).a(new B.j(animator, 7, u9));
                                it7 = it;
                                u4 = u2;
                                z4 = true;
                            }
                        }
                    }
                    u2 = u4;
                    it7 = it;
                    u4 = u2;
                } else {
                    u2 = u4;
                }
            } else {
                u2 = u4;
                it = it7;
            }
            c0044f2.d();
            it7 = it;
            u4 = u2;
        }
        U u10 = u4;
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0044f c0044f3 = (C0044f) it8.next();
            U u11 = (U) c0044f3.f1448a;
            AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q4 = u11.f1407c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0055q4 + " as Animations cannot run alongside Transitions.");
                }
                c0044f3.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0055q4 + " as Animations cannot run alongside Animators.");
                }
                c0044f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0055q4.f1486E;
                B.j j3 = c0044f3.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.f72b;
                animation.getClass();
                if (u11.f1405a != 1) {
                    view2.startAnimation(animation);
                    c0044f3.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0059v runnableC0059v = new RunnableC0059v(animation, viewGroup, view2);
                    runnableC0059v.setAnimationListener(new AnimationAnimationListenerC0043e(u11, viewGroup, view2, c0044f3));
                    view2.startAnimation(runnableC0059v);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + u11 + " has started.");
                    }
                }
                U.v vVar = new U.v();
                vVar.f1207a = view2;
                vVar.f1208b = viewGroup;
                vVar.f1209c = c0044f3;
                vVar.d = u11;
                ((G.c) c0044f3.f1449b).a(vVar);
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            U u12 = (U) it9.next();
            AbstractC0001b.a(u12.f1407c.f1486E, u12.f1405a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u3 + " to " + u10);
        }
    }

    public final void c() {
        if (this.f1453e) {
            return;
        }
        ViewGroup viewGroup = this.f1450a;
        WeakHashMap weakHashMap = K.T.f633a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f1451b) {
            try {
                if (!this.f1451b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1452c);
                    this.f1452c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        U u2 = (U) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u2);
                        }
                        u2.a();
                        if (!u2.f1410g) {
                            this.f1452c.add(u2);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f1451b);
                    this.f1451b.clear();
                    this.f1452c.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((U) it2.next()).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final U d(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        Iterator it = this.f1451b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f1407c.equals(abstractComponentCallbacksC0055q) && !u2.f1409f) {
                return u2;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1450a;
        WeakHashMap weakHashMap = K.T.f633a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1451b) {
            try {
                g();
                Iterator it = this.f1451b.iterator();
                while (it.hasNext()) {
                    ((U) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f1452c).iterator();
                while (it2.hasNext()) {
                    U u2 = (U) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1450a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u2.a();
                }
                Iterator it3 = new ArrayList(this.f1451b).iterator();
                while (it3.hasNext()) {
                    U u3 = (U) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1450a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(u3);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    u3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Iterator it = this.f1451b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f1406b == 2) {
                u2.c(AbstractC0001b.b(u2.f1407c.D().getVisibility()), 1);
            }
        }
    }
}
