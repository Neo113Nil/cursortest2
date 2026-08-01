package M0;

import K.S;
import X.AnimationAnimationListenerC0036e;
import X.DialogInterfaceOnCancelListenerC0044m;
import X.I;
import android.animation.ValueAnimator;
import android.os.SystemClock;
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
import f0.C0100d;
import f0.C0103g;
import f0.C0104h;
import f0.C0105i;
import f0.C0108l;
import f0.RunnableC0099c;
import f0.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0232k;
import l.C0238n;
import l.C0251t0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f497b;

    public /* synthetic */ B(int i, Object obj) {
        this.f496a = i;
        this.f497b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0232k c0232k;
        l1.a c2;
        long j2;
        switch (this.f496a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f497b).f1795c.f547g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f497b;
                if (gVar.f644o) {
                    boolean z3 = gVar.f642m;
                    Q.a aVar = gVar.f633a;
                    if (z3) {
                        gVar.f642m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f629e = currentAnimationTimeMillis;
                        aVar.f631g = -1L;
                        aVar.f630f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f631g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f631g + aVar.i) || !gVar.e()) {
                        gVar.f644o = false;
                        return;
                    }
                    boolean z4 = gVar.f643n;
                    ListView listView = gVar.f635c;
                    if (z4) {
                        gVar.f643n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f630f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f630f;
                    aVar.f630f = currentAnimationTimeMillis2;
                    gVar.f646q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = S.f360a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f497b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0036e animationAnimationListenerC0036e = (AnimationAnimationListenerC0036e) this.f497b;
                animationAnimationListenerC0036e.f914b.endViewTransition(animationAnimationListenerC0036e.f915c);
                animationAnimationListenerC0036e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) this.f497b;
                dialogInterfaceOnCancelListenerC0044m.f929U.onDismiss(dialogInterfaceOnCancelListenerC0044m.f937c0);
                return;
            case 5:
                ((I) this.f497b).y(true);
                return;
            case 6:
                C0108l c0108l = (C0108l) this.f497b;
                int i2 = c0108l.f2109A;
                ValueAnimator valueAnimator = c0108l.f2133z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0108l.f2109A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f497b;
                f0.E e2 = recyclerView.f1419H;
                if (e2 != null) {
                    C0105i c0105i = (C0105i) e2;
                    ArrayList arrayList = c0105i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0105i.f2095j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0105i.f2096k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0105i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0105i.d;
                            if (hasNext) {
                                X x2 = (X) it.next();
                                View view = x2.f2014a;
                                ViewPropertyAnimator animate = view.animate();
                                c0105i.f2102q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0100d(c0105i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0105i.f2098m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0099c runnableC0099c = new RunnableC0099c(c0105i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0099c.run();
                                    } else {
                                        View view2 = ((C0104h) arrayList5.get(0)).f2086a.f2014a;
                                        WeakHashMap weakHashMap2 = S.f360a;
                                        view2.postOnAnimationDelayed(runnableC0099c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0105i.f2099n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0099c runnableC0099c2 = new RunnableC0099c(c0105i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0099c2.run();
                                    } else {
                                        View view3 = ((C0103g) arrayList6.get(0)).f2077a.f2014a;
                                        WeakHashMap weakHashMap3 = S.f360a;
                                        view3.postOnAnimationDelayed(runnableC0099c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0105i.f2097l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0099c runnableC0099c3 = new RunnableC0099c(c0105i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0099c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0105i.f1956e : 0L, !isEmpty3 ? c0105i.f1957f : 0L) + j4;
                                        View view4 = ((X) arrayList7.get(0)).f2014a;
                                        WeakHashMap weakHashMap4 = S.f360a;
                                        view4.postOnAnimationDelayed(runnableC0099c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1449i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f497b).B0();
                return;
            case 9:
                C0251t0 c0251t0 = (C0251t0) this.f497b;
                c0251t0.f3072l = null;
                c0251t0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f497b;
                if (searchView$SearchAutoComplete.f1207f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1207f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f497b).f1225a;
                if (actionMenuView == null || (c0232k = actionMenuView.f1189t) == null) {
                    return;
                }
                c0232k.l();
                return;
            case 12:
                break;
            default:
                K0.e eVar = (K0.e) this.f497b;
                eVar.f466c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f467e;
                S.e eVar2 = bottomSheetBehavior.f1560M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f465b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1559L == 2) {
                        bottomSheetBehavior.C(eVar.f465b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            l1.d dVar = (l1.d) this.f497b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            l1.c cVar = c2.f3179c;
            X0.d.b(cVar);
            l1.d dVar2 = (l1.d) this.f497b;
            boolean isLoggable = l1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0238n c0238n = cVar.f3182a.f3187a;
                j2 = System.nanoTime();
                i1.k.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                l1.d.a(dVar2, c2);
                if (isLoggable) {
                    C0238n c0238n2 = cVar.f3182a.f3187a;
                    i1.k.a(c2, cVar, "finished run in ".concat(i1.k.i(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3187a.f3038a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C0238n c0238n3 = cVar.f3182a.f3187a;
                        i1.k.a(c2, cVar, "failed a run in ".concat(i1.k.i(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
