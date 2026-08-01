package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.a;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class re {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public re(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static re f(ViewGroup viewGroup, tg tgVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof re) {
            return (re) tag;
        }
        tgVar.getClass();
        re reVar = new re(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, reVar);
        return reVar;
    }

    public final void a(int i, int i2, a aVar) {
        synchronized (this.b) {
            try {
                a9 a9Var = new a9();
                u20 d = d(aVar.c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                u20 u20Var = new u20(i, i2, aVar, a9Var);
                this.b.add(u20Var);
                u20Var.d.add(new t20(this, u20Var, 0));
                u20Var.d.add(new t20(this, u20Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        boolean z2;
        int i;
        ViewGroup viewGroup;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        u20 u20Var = null;
        u20 u20Var2 = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            u20 u20Var3 = (u20) obj;
            int c = n20.c(u20Var3.c.J);
            int h = n20.h(u20Var3.a);
            if (h != 0) {
                if (h != 1) {
                    if (h != 2 && h != 3) {
                    }
                } else if (c != 2) {
                    u20Var2 = u20Var3;
                }
            }
            if (c == 2 && u20Var == null) {
                u20Var = u20Var3;
            }
        }
        if (sk.G(2)) {
            Log.v("FragmentManager", "Executing operations from " + u20Var + " to " + u20Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        dk dkVar = ((u20) arrayList2.get(arrayList2.size() - 1)).c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            bk bkVar = ((u20) obj2).c.M;
            bk bkVar2 = dkVar.M;
            bkVar.b = bkVar2.b;
            bkVar.c = bkVar2.c;
            bkVar.d = bkVar2.d;
            bkVar.e = bkVar2.e;
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            u20 u20Var4 = (u20) obj3;
            a9 a9Var = new a9();
            u20Var4.d();
            HashSet hashSet = u20Var4.e;
            hashSet.add(a9Var);
            pe peVar = new pe(u20Var4, a9Var);
            peVar.d = false;
            peVar.c = z;
            arrayList3.add(peVar);
            a9 a9Var2 = new a9();
            u20Var4.d();
            hashSet.add(a9Var2);
            boolean z3 = !z ? u20Var4 != u20Var2 : u20Var4 != u20Var;
            qe qeVar = new qe(u20Var4, a9Var2);
            int i5 = u20Var4.a;
            dk dkVar2 = u20Var4.c;
            if (i5 == 2) {
                if (z) {
                    bk bkVar3 = dkVar2.M;
                } else {
                    dkVar2.getClass();
                }
                if (z) {
                    bk bkVar4 = dkVar2.M;
                } else {
                    bk bkVar5 = dkVar2.M;
                }
            } else if (z) {
                bk bkVar6 = dkVar2.M;
            } else {
                dkVar2.getClass();
            }
            if (z3) {
                if (z) {
                    bk bkVar7 = dkVar2.M;
                } else {
                    dkVar2.getClass();
                }
            }
            arrayList4.add(qeVar);
            u20Var4.d.add(new g1(this, arrayList5, u20Var4));
            arrayList2 = arrayList;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList4.get(i6);
            i6++;
            u20 u20Var5 = (u20) ((qe) obj4).a;
            if (n20.c(u20Var5.c.J) != u20Var5.a) {
            }
        }
        int size5 = arrayList4.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = arrayList4.get(i7);
            i7++;
            qe qeVar2 = (qe) obj5;
            hashMap.put((u20) qeVar2.a, Boolean.FALSE);
            qeVar2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z4 = false;
        int i8 = 0;
        while (i8 < size6) {
            Object obj6 = arrayList3.get(i8);
            int i9 = i8 + 1;
            pe peVar2 = (pe) obj6;
            boolean z5 = containsValue;
            u20 u20Var6 = (u20) peVar2.a;
            ArrayList arrayList7 = arrayList3;
            int c2 = n20.c(u20Var6.c.J);
            int i10 = u20Var6.a;
            int i11 = size6;
            if (c2 == i10 || !(c2 == 2 || i10 == 2)) {
                z2 = z4;
                i = i9;
                viewGroup = viewGroup2;
                peVar2.d();
            } else {
                o4 j = peVar2.j(context);
                if (j == null) {
                    peVar2.d();
                } else {
                    Animator animator = (Animator) j.h;
                    if (animator == null) {
                        arrayList6.add(peVar2);
                    } else {
                        u20 u20Var7 = (u20) peVar2.a;
                        dk dkVar3 = u20Var7.c;
                        z2 = z4;
                        i = i9;
                        if (Boolean.TRUE.equals(hashMap.get(u20Var7))) {
                            if (sk.G(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + dkVar3 + " as this Fragment was involved in a Transition.");
                            }
                            peVar2.d();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z6 = u20Var7.a == 3;
                            if (z6) {
                                arrayList5.remove(u20Var7);
                            }
                            View view = dkVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new me(viewGroup3, view, z6, u20Var7, peVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (sk.G(2)) {
                                Log.v("FragmentManager", "Animator from operation " + u20Var7 + " has started.");
                            }
                            ((a9) peVar2.b).a(new o4(animator, u20Var7, 11));
                            size6 = i11;
                            containsValue = z5;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            i8 = i;
                            z4 = true;
                        }
                    }
                }
                z2 = z4;
                i = i9;
                viewGroup = viewGroup2;
            }
            size6 = i11;
            containsValue = z5;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList7;
            i8 = i;
            z4 = z2;
        }
        boolean z7 = containsValue;
        boolean z8 = z4;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i12 = 0;
        while (i12 < size7) {
            Object obj7 = arrayList6.get(i12);
            i12++;
            pe peVar3 = (pe) obj7;
            u20 u20Var8 = (u20) peVar3.a;
            dk dkVar4 = u20Var8.c;
            if (z7) {
                if (sk.G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + dkVar4 + " as Animations cannot run alongside Transitions.");
                }
                peVar3.d();
            } else if (z8) {
                if (sk.G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + dkVar4 + " as Animations cannot run alongside Animators.");
                }
                peVar3.d();
            } else {
                View view2 = dkVar4.J;
                o4 j2 = peVar3.j(context);
                j2.getClass();
                Animation animation = (Animation) j2.g;
                animation.getClass();
                int i13 = size7;
                if (u20Var8.a != 1) {
                    view2.startAnimation(animation);
                    peVar3.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    gk gkVar = new gk(animation, viewGroup4, view2);
                    gkVar.setAnimationListener(new ne(u20Var8, viewGroup4, view2, peVar3));
                    view2.startAnimation(gkVar);
                    if (sk.G(2)) {
                        Log.v("FragmentManager", "Animation from operation " + u20Var8 + " has started.");
                    }
                }
                a9 a9Var3 = (a9) peVar3.b;
                oe oeVar = new oe();
                oeVar.f = view2;
                oeVar.g = viewGroup4;
                oeVar.h = peVar3;
                oeVar.i = u20Var8;
                a9Var3.a(oeVar);
                size7 = i13;
            }
        }
        int size8 = arrayList5.size();
        int i14 = 0;
        while (i14 < size8) {
            Object obj8 = arrayList5.get(i14);
            i14++;
            u20 u20Var9 = (u20) obj8;
            n20.a(u20Var9.c.J, u20Var9.a);
        }
        arrayList5.clear();
        if (sk.G(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u20Var + " to " + u20Var2);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = f80.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        u20 u20Var = (u20) obj;
                        if (sk.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u20Var);
                        }
                        u20Var.a();
                        if (!u20Var.g) {
                            this.c.add(u20Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (sk.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((u20) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (sk.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u20 d(dk dkVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u20 u20Var = (u20) obj;
            dk dkVar2 = u20Var.c;
            dkVar2.getClass();
            if (dkVar2 == dkVar && !u20Var.f) {
                return u20Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (sk.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = f80.a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((u20) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    u20 u20Var = (u20) obj2;
                    if (sk.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u20Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u20Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    u20 u20Var2 = (u20) obj3;
                    if (sk.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(u20Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    u20Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u20 u20Var = (u20) obj;
            if (u20Var.b == 2) {
                u20Var.c(n20.b(u20Var.c.D().getVisibility()), 1);
            }
        }
    }
}
