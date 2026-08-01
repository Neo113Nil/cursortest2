package A1;

import B.j;
import F1.l;
import K.T;
import Q.g;
import W0.u;
import X0.i;
import Y.AnimationAnimationListenerC0043e;
import Y.DialogInterfaceOnCancelListenerC0051m;
import Y.I;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.room.n;
import androidx.room.o;
import androidx.room.t;
import c1.AbstractC0104b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g0.AbstractC0135E;
import g0.C0151d;
import g0.C0154g;
import g0.C0155h;
import g0.C0156i;
import g0.C0159l;
import g0.RunnableC0150c;
import g0.Z;
import j0.InterfaceC0178a;
import j0.InterfaceC0182e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import k0.h;
import l.C0259k;
import l.C0278t0;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40b;

    public /* synthetic */ e(int i, Object obj) {
        this.f39a = i;
        this.f40b = obj;
    }

    public i a() {
        o oVar = (o) this.f40b;
        i iVar = new i();
        Cursor query$default = t.query$default(oVar.f2070a, new j("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (query$default.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(query$default.getInt(0)));
            } finally {
            }
        }
        AbstractC0104b.g(query$default, null);
        i c2 = l.c(iVar);
        if (!c2.f1318a.isEmpty()) {
            if (((o) this.f40b).f2075g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            InterfaceC0182e interfaceC0182e = ((o) this.f40b).f2075g;
            if (interfaceC0182e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            interfaceC0182e.A();
        }
        return c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c2;
        long j2;
        Set set;
        int i;
        boolean z2;
        C0259k c0259k;
        switch (this.f39a) {
            case 0:
                break;
            case 1:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f40b).f2386c.f965g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 2:
                g gVar = (g) this.f40b;
                if (gVar.f1054o) {
                    boolean z3 = gVar.f1052m;
                    Q.a aVar = gVar.f1043a;
                    if (z3) {
                        gVar.f1052m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f1039e = currentAnimationTimeMillis;
                        aVar.f1041g = -1L;
                        aVar.f1040f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f1041g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f1041g + aVar.i) || !gVar.e()) {
                        gVar.f1054o = false;
                        return;
                    }
                    boolean z4 = gVar.f1053n;
                    ListView listView = gVar.f1045c;
                    if (z4) {
                        gVar.f1053n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1949A0, RecyclerView.f1949A0, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f1040f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f1040f;
                    aVar.f1040f = currentAnimationTimeMillis2;
                    gVar.f1056q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = T.f633a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((T.e) this.f40b).n(0);
                return;
            case 4:
                AnimationAnimationListenerC0043e animationAnimationListenerC0043e = (AnimationAnimationListenerC0043e) this.f40b;
                animationAnimationListenerC0043e.f1444b.endViewTransition(animationAnimationListenerC0043e.f1445c);
                animationAnimationListenerC0043e.d.d();
                return;
            case 5:
                DialogInterfaceOnCancelListenerC0051m dialogInterfaceOnCancelListenerC0051m = (DialogInterfaceOnCancelListenerC0051m) this.f40b;
                dialogInterfaceOnCancelListenerC0051m.f1459U.onDismiss(dialogInterfaceOnCancelListenerC0051m.f1467c0);
                return;
            case 6:
                ((I) this.f40b).y(true);
                return;
            case 7:
                Lock closeLock$room_runtime_release = ((o) this.f40b).f2070a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        try {
                        } catch (SQLiteException e2) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                            set = u.f1286a;
                        }
                    } catch (IllegalStateException e3) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                        set = u.f1286a;
                    }
                    if (((o) this.f40b).a() && ((o) this.f40b).f2073e.compareAndSet(true, false) && !((o) this.f40b).f2070a.inTransaction()) {
                        InterfaceC0178a a3 = ((h) ((o) this.f40b).f2070a.getOpenHelper()).a();
                        a3.c();
                        try {
                            set = a();
                            a3.w();
                            if (set.isEmpty()) {
                                return;
                            }
                            o oVar = (o) this.f40b;
                            synchronized (oVar.i) {
                                Iterator it = oVar.i.iterator();
                                while (true) {
                                    n.b bVar = (n.b) it;
                                    if (bVar.hasNext()) {
                                        ((n) ((Map.Entry) bVar.next()).getValue()).a(set);
                                    }
                                }
                            }
                            return;
                        } finally {
                            a3.d();
                        }
                    }
                    return;
                } finally {
                    closeLock$room_runtime_release.unlock();
                    ((o) this.f40b).getClass();
                }
            case 8:
                C0159l c0159l = (C0159l) this.f40b;
                int i2 = c0159l.f2927A;
                ValueAnimator valueAnimator = c0159l.f2951z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0159l.f2927A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 9:
                RecyclerView recyclerView = (RecyclerView) this.f40b;
                AbstractC0135E abstractC0135E = recyclerView.f1965J;
                if (abstractC0135E != null) {
                    C0156i c0156i = (C0156i) abstractC0135E;
                    ArrayList arrayList = c0156i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0156i.f2906j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0156i.f2907k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0156i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            long j4 = c0156i.d;
                            if (hasNext) {
                                Z z5 = (Z) it2.next();
                                View view = z5.f2830a;
                                ViewPropertyAnimator animate = view.animate();
                                c0156i.f2913q.add(z5);
                                animate.setDuration(j4).alpha(RecyclerView.f1949A0).setListener(new C0151d(c0156i, z5, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0156i.f2909m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0150c runnableC0150c = new RunnableC0150c(c0156i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0150c.run();
                                    } else {
                                        View view2 = ((C0155h) arrayList5.get(0)).f2895a.f2830a;
                                        WeakHashMap weakHashMap2 = T.f633a;
                                        view2.postOnAnimationDelayed(runnableC0150c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0156i.f2910n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0150c runnableC0150c2 = new RunnableC0150c(c0156i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0150c2.run();
                                    } else {
                                        View view3 = ((C0154g) arrayList6.get(0)).f2883a.f2830a;
                                        WeakHashMap weakHashMap3 = T.f633a;
                                        view3.postOnAnimationDelayed(runnableC0150c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0156i.f2908l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0150c runnableC0150c3 = new RunnableC0150c(c0156i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0150c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0156i.f2770e : 0L, !isEmpty3 ? c0156i.f2771f : 0L) + j4;
                                        View view4 = ((Z) arrayList7.get(0)).f2830a;
                                        WeakHashMap weakHashMap4 = T.f633a;
                                        view4.postOnAnimationDelayed(runnableC0150c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1997k0 = z2;
                return;
            case 10:
                ((StaggeredGridLayoutManager) this.f40b).D0();
                return;
            case 11:
                C0278t0 c0278t0 = (C0278t0) this.f40b;
                c0278t0.f3507l = null;
                c0278t0.drawableStateChanged();
                return;
            case 12:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f40b;
                if (searchView$SearchAutoComplete.f1741f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1741f = false;
                    return;
                }
                return;
            case 13:
                ActionMenuView actionMenuView = ((Toolbar) this.f40b).f1759a;
                if (actionMenuView == null || (c0259k = actionMenuView.f1723t) == null) {
                    return;
                }
                c0259k.l();
                return;
            default:
                N0.e eVar = (N0.e) this.f40b;
                eVar.f905c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f906e;
                T.e eVar2 = bottomSheetBehavior.f2154M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f904b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2153L == 2) {
                        bottomSheetBehavior.C(eVar.f904b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            f fVar = (f) this.f40b;
            synchronized (fVar) {
                c2 = fVar.c();
            }
            if (c2 == null) {
                return;
            }
            c cVar = c2.f28c;
            i1.f.b(cVar);
            f fVar2 = (f) this.f40b;
            boolean isLoggable = f.i.isLoggable(Level.FINE);
            if (isLoggable) {
                d dVar = cVar.f31a.f41a;
                j2 = System.nanoTime();
                F1.d.h(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                f.a(fVar2, c2);
                if (isLoggable) {
                    d dVar2 = cVar.f31a.f41a;
                    F1.d.h(c2, cVar, "finished run in ".concat(F1.d.z(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) fVar2.f41a.f38b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        d dVar3 = cVar.f31a.f41a;
                        F1.d.h(c2, cVar, "failed a run in ".concat(F1.d.z(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
