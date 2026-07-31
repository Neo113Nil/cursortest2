package com.five_corp.ad.internal.viewability;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.five_corp.ad.internal.beacon.i;
import com.five_corp.ad.internal.beacon.j;
import com.five_corp.ad.internal.beacon.k;
import com.five_corp.ad.internal.context.h;
import com.five_corp.ad.internal.context.s;
import com.five_corp.ad.internal.util.d;
import com.five_corp.ad.internal.view.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {
    public static final String[] j;
    public final Context a;
    public final double b;
    public final boolean c;
    public final u d;
    public View e;
    public final ArrayList f;
    public final Object g;
    public boolean h;
    public final d i;

    static {
        a.class.toString();
        j = new String[]{"androidx.core.view.insets.ProtectionLayout"};
    }

    public a(Context context, h hVar, u uVar) {
        s sVar = hVar.c;
        double d = sVar.c.e;
        boolean z = sVar.b.d;
        this.g = new Object();
        this.h = true;
        this.a = context;
        this.b = d;
        this.c = z;
        ArrayList arrayList = new ArrayList();
        for (String str : j) {
            try {
                arrayList.add(Class.forName(str));
            } catch (Throwable th) {
                th.getMessage();
                Log.getStackTraceString(th);
            }
        }
        this.f = arrayList;
        this.i = new d();
        this.d = uVar;
        this.e = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
    
        r5 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(View view) {
        HashSet hashSet;
        HashSet hashSet2;
        Object parent;
        Rect rect;
        View view2;
        char c;
        synchronized (this.g) {
            d dVar = this.i;
            dVar.getClass();
            hashSet = new HashSet();
            dVar.a(hashSet);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Rect rect2 = new Rect();
        View view3 = view;
        if (!view3.getGlobalVisibleRect(rect2)) {
            return new Pair(arrayList, arrayList2);
        }
        synchronized (this.g) {
            d dVar2 = this.i;
            dVar2.getClass();
            hashSet2 = new HashSet();
            dVar2.a(hashSet2);
        }
        while (true) {
            boolean z = false;
            while (true) {
                parent = view3.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return new Pair(arrayList, arrayList2);
                }
                if (z) {
                    break;
                }
                View view4 = (View) parent;
                if (hashSet2.contains(view4)) {
                    view3 = view4;
                    z = true;
                } else {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    int i = 0;
                    boolean z2 = true;
                    while (i < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt == view3) {
                            rect = rect2;
                            view2 = view3;
                            z2 = false;
                        } else {
                            if (!z2 && childAt.isShown() && childAt.getAlpha() > 0.0f && ((!(childAt instanceof ViewGroup) || ((ViewGroup) childAt).getChildCount() != 0) && view3.getZ() <= childAt.getZ())) {
                                Rect rect3 = new Rect();
                                if (childAt.getGlobalVisibleRect(rect3) && Rect.intersects(rect2, rect3)) {
                                    rect = rect2;
                                    view2 = view3;
                                    j jVar = new j(childAt.getClass().getName(), new i(rect3.left, rect3.top, rect3.width(), rect3.height()));
                                    if (childAt.getVisibility() == 0) {
                                        Iterator it = this.f.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((Class) it.next()).isInstance(childAt)) {
                                                    break;
                                                }
                                            } else if (!hashSet.contains(childAt)) {
                                                if (childAt.getAlpha() != 0.0f) {
                                                    c = 1;
                                                }
                                            }
                                        }
                                    }
                                    c = 3;
                                    if (c == 1) {
                                        arrayList.add(jVar);
                                    } else if (c == 2) {
                                        arrayList2.add(jVar);
                                    }
                                }
                            }
                            rect = rect2;
                            view2 = view3;
                        }
                        i++;
                        rect2 = rect;
                        view3 = view2;
                    }
                    view3 = view4;
                }
            }
            view3 = (View) parent;
        }
    }

    public final k b() {
        View view = this.e;
        if (view == null) {
            view = this.d;
        }
        u uVar = this.d;
        Rect rect = new Rect();
        uVar.getGlobalVisibleRect(rect);
        i iVar = new i(rect.left, rect.top, rect.width(), rect.height());
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        i iVar2 = new i(rect2.left, rect2.top, rect2.width(), rect2.height());
        Pair a = a(this.d);
        Pair a2 = a(view);
        return new k(iVar, iVar2, (List) a.first, (List) a2.first, (List) a.second, (List) a2.second, 1);
    }

    public final void c(View view) {
        synchronized (this.g) {
            try {
                d dVar = this.i;
                dVar.getClass();
                HashSet hashSet = new HashSet();
                dVar.a(hashSet);
                if (hashSet.contains(view)) {
                    return;
                }
                this.i.a.add(new WeakReference(view));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(View view) {
        if (view.isShown()) {
            if (!(this.a.getSystemService("power") instanceof PowerManager ? !((PowerManager) r0).isInteractive() : false)) {
                Object systemService = this.a.getSystemService("keyguard");
                if (!(systemService instanceof KeyguardManager ? ((KeyguardManager) systemService).isKeyguardLocked() : false)) {
                    int windowVisibility = view.getWindowVisibility();
                    Object obj = view;
                    if (windowVisibility == 0) {
                        while (obj != null && (obj instanceof View)) {
                            View view2 = (View) obj;
                            if (view2.getAlpha() <= 0.0f) {
                                return false;
                            }
                            obj = view2.getParent();
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final Pair a(View view, HashSet hashSet) {
        double d;
        double d2;
        HashSet hashSet2 = hashSet;
        boolean b = b(view);
        double d3 = 0.0d;
        Double valueOf = Double.valueOf(0.0d);
        if (!b) {
            return Pair.create(valueOf, valueOf);
        }
        int height = view.getHeight() * view.getWidth();
        Rect rect = new Rect();
        View view2 = view;
        if (!view2.getGlobalVisibleRect(rect)) {
            return Pair.create(valueOf, valueOf);
        }
        double d4 = (rect.right - rect.left) * (rect.bottom - rect.top);
        double d5 = 1.0d;
        while (true) {
            if (view2 == null) {
                d = d4;
                break;
            }
            ViewParent parent = view2.getParent();
            if (parent != null && (parent instanceof ViewGroup) && !hashSet2.contains(parent)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                boolean z = true;
                int i = 0;
                while (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt == view2) {
                        d2 = d4;
                        z = false;
                    } else if (childAt.isShown()) {
                        d2 = d4;
                        if (childAt.getAlpha() > d3 && ((!(childAt instanceof ViewGroup) || ((ViewGroup) childAt).getChildCount() != 0) && view2.getZ() <= childAt.getZ() && ((view2.getZ() != childAt.getZ() || !z) && !hashSet2.contains(childAt)))) {
                            Iterator it = this.f.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    Rect rect2 = new Rect();
                                    if (childAt.getGlobalVisibleRect(rect2) && rect.right > rect2.left && rect.bottom > rect2.top && rect2.right > rect.left && rect2.bottom > rect.top) {
                                        Rect rect3 = new Rect(0, 0, 0, 0);
                                        if (rect.left < rect2.left) {
                                            rect3 = new Rect(rect.left, rect.top, rect2.left, rect.bottom);
                                        }
                                        if (rect2.right < rect.right) {
                                            Rect rect4 = new Rect(rect2.right, rect.top, rect.right, rect.bottom);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect4.right - rect4.left) * (rect4.bottom - rect4.top)) {
                                                rect3 = rect4;
                                            }
                                        }
                                        if (rect2.bottom < rect.bottom) {
                                            Rect rect5 = new Rect(rect.left, rect2.bottom, rect.right, rect.bottom);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect5.right - rect5.left) * (rect5.bottom - rect5.top)) {
                                                rect3 = rect5;
                                            }
                                        }
                                        if (rect.top < rect2.top) {
                                            Rect rect6 = new Rect(rect.left, rect.top, rect.right, rect2.top);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect6.right - rect6.left) * (rect6.bottom - rect6.top)) {
                                                rect = rect6;
                                            }
                                        }
                                        rect = rect3;
                                    }
                                } else if (((Class) it.next()).isInstance(childAt)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        d2 = d4;
                    }
                    i++;
                    hashSet2 = hashSet;
                    d4 = d2;
                    d3 = 0.0d;
                }
            }
            d = d4;
            d5 *= view2.getScaleY() * view2.getScaleX();
            Object parent2 = view2.getParent();
            if (!(parent2 instanceof View)) {
                break;
            }
            view2 = (View) parent2;
            hashSet2 = hashSet;
            d4 = d;
            d3 = 0.0d;
        }
        double d6 = height * d5;
        if (d6 <= 0.0d) {
            return Pair.create(valueOf, valueOf);
        }
        return Pair.create(Double.valueOf(d / d6), Double.valueOf(((rect.right - rect.left) * (rect.bottom - rect.top)) / d6));
    }

    public final c a() {
        synchronized (this.g) {
            try {
                if (!this.h) {
                    return new c(0.0d, 0.0d, 0.0d, 0.0d);
                }
                d dVar = this.i;
                dVar.getClass();
                HashSet hashSet = new HashSet();
                dVar.a(hashSet);
                View view = this.e;
                if (view == null) {
                    view = this.d;
                }
                Pair a = a(this.d, hashSet);
                Pair a2 = a(view, hashSet);
                double doubleValue = ((Double) a.second).doubleValue();
                double d = this.b + doubleValue >= 1.0d ? 1.0d : doubleValue;
                double doubleValue2 = ((Double) a2.second).doubleValue();
                double d2 = this.b + doubleValue2 >= 1.0d ? 1.0d : doubleValue2;
                double doubleValue3 = ((Double) a.first).doubleValue();
                double d3 = this.b + doubleValue3 >= 1.0d ? 1.0d : doubleValue3;
                double doubleValue4 = ((Double) a2.first).doubleValue();
                double d4 = this.b + doubleValue4 >= 1.0d ? 1.0d : doubleValue4;
                return !this.c ? new c(d, d2, d3, d4) : new c(d3, d4, d3, d4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
