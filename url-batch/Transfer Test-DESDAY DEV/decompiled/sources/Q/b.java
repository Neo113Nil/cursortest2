package Q;

import K.T;
import Y.AnimationAnimationListenerC0037e;
import Y.DialogInterfaceOnCancelListenerC0045m;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g0.C0116e;
import g0.C0119h;
import g0.C0120i;
import g0.C0121j;
import g0.C0124m;
import g0.E;
import g0.RunnableC0115d;
import g0.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import l.C0218k;
import l.C0233r0;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f620b;

    public /* synthetic */ b(int i, Object obj) {
        this.f619a = i;
        this.f620b = obj;
    }

    public W0.i a() {
        androidx.room.o oVar = (androidx.room.o) this.f620b;
        W0.i iVar = new W0.i();
        Cursor query$default = androidx.room.t.query$default(oVar.f1692a, new B.j("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (query$default.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(query$default.getInt(0)));
            } finally {
            }
        }
        T.e.m(query$default, null);
        W0.i i = T.e.i(iVar);
        if (!i.f927a.isEmpty()) {
            if (((androidx.room.o) this.f620b).f1697g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            j0.e eVar = ((androidx.room.o) this.f620b).f1697g;
            if (eVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            eVar.w();
        }
        return i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        int i;
        boolean z2;
        C0218k c0218k;
        switch (this.f619a) {
            case 0:
                h hVar = (h) this.f620b;
                if (hVar.f633o) {
                    boolean z3 = hVar.f631m;
                    a aVar = hVar.f622a;
                    if (z3) {
                        hVar.f631m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f616e = currentAnimationTimeMillis;
                        aVar.f618g = -1L;
                        aVar.f617f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f618g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f618g + aVar.i) || !hVar.e()) {
                        hVar.f633o = false;
                        return;
                    }
                    boolean z4 = hVar.f632n;
                    ListView listView = hVar.f624c;
                    if (z4) {
                        hVar.f632n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1570A0, RecyclerView.f1570A0, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f617f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f617f;
                    aVar.f617f = currentAnimationTimeMillis2;
                    hVar.f635q.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = T.f372a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f620b).f2020c.f699g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 2:
                ((T.f) this.f620b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0037e animationAnimationListenerC0037e = (AnimationAnimationListenerC0037e) this.f620b;
                animationAnimationListenerC0037e.f1063b.endViewTransition(animationAnimationListenerC0037e.f1064c);
                animationAnimationListenerC0037e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = (DialogInterfaceOnCancelListenerC0045m) this.f620b;
                dialogInterfaceOnCancelListenerC0045m.f1078U.onDismiss(dialogInterfaceOnCancelListenerC0045m.f1086c0);
                return;
            case 5:
                ((I) this.f620b).y(true);
                return;
            case 6:
                Lock closeLock$room_runtime_release = ((androidx.room.o) this.f620b).f1692a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                    } finally {
                        closeLock$room_runtime_release.unlock();
                        ((androidx.room.o) this.f620b).getClass();
                    }
                } catch (SQLiteException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    set = V0.o.f877a;
                } catch (IllegalStateException e3) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                    set = V0.o.f877a;
                }
                if (((androidx.room.o) this.f620b).a() && ((androidx.room.o) this.f620b).f1695e.compareAndSet(true, false) && !((androidx.room.o) this.f620b).f1692a.inTransaction()) {
                    j0.a a3 = ((k0.h) ((androidx.room.o) this.f620b).f1692a.getOpenHelper()).a();
                    a3.b();
                    try {
                        set = a();
                        a3.s();
                        if (set.isEmpty()) {
                            return;
                        }
                        androidx.room.o oVar = (androidx.room.o) this.f620b;
                        synchronized (oVar.i) {
                            Iterator it = oVar.i.iterator();
                            while (true) {
                                n.b bVar = (n.b) it;
                                if (bVar.hasNext()) {
                                    ((androidx.room.n) ((Map.Entry) bVar.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        a3.c();
                    }
                }
                return;
            case 7:
                C0124m c0124m = (C0124m) this.f620b;
                int i2 = c0124m.f2491A;
                ValueAnimator valueAnimator = c0124m.f2515z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0124m.f2491A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.f620b;
                E e4 = recyclerView.f1586J;
                if (e4 != null) {
                    C0121j c0121j = (C0121j) e4;
                    ArrayList arrayList = c0121j.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0121j.f2474j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0121j.f2475k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0121j.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            long j3 = c0121j.d;
                            if (hasNext) {
                                Z z5 = (Z) it2.next();
                                View view = z5.f2392a;
                                ViewPropertyAnimator animate = view.animate();
                                c0121j.f2481q.add(z5);
                                animate.setDuration(j3).alpha(RecyclerView.f1570A0).setListener(new C0116e(c0121j, z5, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0121j.f2477m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0115d runnableC0115d = new RunnableC0115d(c0121j, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0115d.run();
                                    } else {
                                        View view2 = ((C0120i) arrayList5.get(0)).f2464a.f2392a;
                                        WeakHashMap weakHashMap2 = T.f372a;
                                        view2.postOnAnimationDelayed(runnableC0115d, j3);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0121j.f2478n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0115d runnableC0115d2 = new RunnableC0115d(c0121j, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0115d2.run();
                                    } else {
                                        View view3 = ((C0119h) arrayList6.get(0)).f2454a.f2392a;
                                        WeakHashMap weakHashMap3 = T.f372a;
                                        view3.postOnAnimationDelayed(runnableC0115d2, j3);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0121j.f2476l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0115d runnableC0115d3 = new RunnableC0115d(c0121j, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0115d3.run();
                                    } else {
                                        if (isEmpty) {
                                            j3 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0121j.f2332e : 0L, !isEmpty3 ? c0121j.f2333f : 0L) + j3;
                                        View view4 = ((Z) arrayList7.get(0)).f2392a;
                                        WeakHashMap weakHashMap4 = T.f372a;
                                        view4.postOnAnimationDelayed(runnableC0115d3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1618k0 = z2;
                return;
            case 9:
                ((StaggeredGridLayoutManager) this.f620b).D0();
                return;
            case 10:
                C0233r0 c0233r0 = (C0233r0) this.f620b;
                c0233r0.f3071l = null;
                c0233r0.drawableStateChanged();
                return;
            case 11:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f620b;
                if (searchView$SearchAutoComplete.f1355f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1355f = false;
                    return;
                }
                return;
            case 12:
                ActionMenuView actionMenuView = ((Toolbar) this.f620b).f1373a;
                if (actionMenuView == null || (c0218k = actionMenuView.f1334t) == null) {
                    return;
                }
                c0218k.l();
                return;
            default:
                P0.e eVar = (P0.e) this.f620b;
                eVar.f611c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f612e;
                T.f fVar = bottomSheetBehavior.f1786M;
                if (fVar != null && fVar.f()) {
                    eVar.a(eVar.f610b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1785L == 2) {
                        bottomSheetBehavior.C(eVar.f610b);
                        return;
                    }
                    return;
                }
        }
    }
}
