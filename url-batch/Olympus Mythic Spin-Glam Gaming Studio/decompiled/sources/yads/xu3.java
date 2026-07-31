package yads;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class xu3 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();
    public final WeakHashMap i = new WeakHashMap();
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Boolean bool;
        String str;
        qv3 qv3Var = qv3.c;
        if (qv3Var != null) {
            for (av3 av3Var : Collections.unmodifiableCollection(qv3Var.b)) {
                View view = (View) av3Var.d.get();
                if (av3Var.f && !av3Var.g) {
                    String str2 = av3Var.h;
                    if (view != null) {
                        boolean c = jw3.c(view);
                        if (c) {
                            this.h.add(str2);
                        }
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                this.i.remove(view);
                                bool = Boolean.FALSE;
                            } else if (this.i.containsKey(view)) {
                                bool = (Boolean) this.i.get(view);
                            } else {
                                WeakHashMap weakHashMap = this.i;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || c) {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        this.d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String a = jw3.a(view2);
                                    if (a != null) {
                                        str = a;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.e.add(str2);
                            this.a.put(view, str2);
                            Iterator it = av3Var.c.a.iterator();
                            while (it.hasNext()) {
                                zv3 zv3Var = (zv3) it.next();
                                View view3 = (View) zv3Var.a.get();
                                if (view3 != null) {
                                    su3 su3Var = (su3) this.b.get(view3);
                                    if (su3Var != null) {
                                        su3Var.b.add(av3Var.h);
                                    } else {
                                        this.b.put(view3, new su3(zv3Var, av3Var.h));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f.add(str2);
                            this.c.put(str2, view);
                            this.g.put(str2, str);
                        }
                    } else {
                        this.f.add(str2);
                        this.g.put(str2, "noAdView");
                    }
                }
            }
        }
    }
}
