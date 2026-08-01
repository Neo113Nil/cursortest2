package K0;

import K.T;
import X.AnimationAnimationListenerC0037e;
import X.DialogInterfaceOnCancelListenerC0045m;
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
import f0.C0088d;
import f0.C0091g;
import f0.C0092h;
import f0.C0093i;
import f0.C0096l;
import f0.RunnableC0087c;
import f0.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0243k;
import l.C0249n;
import l.C0262t0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f476b;

    public /* synthetic */ B(int i, Object obj) {
        this.f475a = i;
        this.f476b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0243k c0243k;
        l1.a c2;
        long j2;
        switch (this.f475a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f476b).f1784c.f526g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f476b;
                if (gVar.f646o) {
                    boolean z3 = gVar.f644m;
                    Q.a aVar = gVar.f635a;
                    if (z3) {
                        gVar.f644m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f631e = currentAnimationTimeMillis;
                        aVar.f633g = -1L;
                        aVar.f632f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f633g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f633g + aVar.i) || !gVar.e()) {
                        gVar.f646o = false;
                        return;
                    }
                    boolean z4 = gVar.f645n;
                    ListView listView = gVar.f637c;
                    if (z4) {
                        gVar.f645n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f632f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f632f;
                    aVar.f632f = currentAnimationTimeMillis2;
                    gVar.f648q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = T.f381a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f476b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0037e animationAnimationListenerC0037e = (AnimationAnimationListenerC0037e) this.f476b;
                animationAnimationListenerC0037e.f910b.endViewTransition(animationAnimationListenerC0037e.f911c);
                animationAnimationListenerC0037e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0045m dialogInterfaceOnCancelListenerC0045m = (DialogInterfaceOnCancelListenerC0045m) this.f476b;
                dialogInterfaceOnCancelListenerC0045m.f925U.onDismiss(dialogInterfaceOnCancelListenerC0045m.f933c0);
                return;
            case 5:
                ((I) this.f476b).y(true);
                return;
            case 6:
                C0096l c0096l = (C0096l) this.f476b;
                int i2 = c0096l.f2104A;
                ValueAnimator valueAnimator = c0096l.f2128z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0096l.f2104A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f476b;
                f0.E e2 = recyclerView.f1417H;
                if (e2 != null) {
                    C0093i c0093i = (C0093i) e2;
                    ArrayList arrayList = c0093i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0093i.f2090j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0093i.f2091k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0093i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0093i.d;
                            if (hasNext) {
                                X x2 = (X) it.next();
                                View view = x2.f2009a;
                                ViewPropertyAnimator animate = view.animate();
                                c0093i.f2097q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0088d(c0093i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0093i.f2093m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0087c runnableC0087c = new RunnableC0087c(c0093i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0087c.run();
                                    } else {
                                        View view2 = ((C0092h) arrayList5.get(0)).f2081a.f2009a;
                                        WeakHashMap weakHashMap2 = T.f381a;
                                        view2.postOnAnimationDelayed(runnableC0087c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0093i.f2094n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0087c runnableC0087c2 = new RunnableC0087c(c0093i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0087c2.run();
                                    } else {
                                        View view3 = ((C0091g) arrayList6.get(0)).f2072a.f2009a;
                                        WeakHashMap weakHashMap3 = T.f381a;
                                        view3.postOnAnimationDelayed(runnableC0087c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0093i.f2092l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0087c runnableC0087c3 = new RunnableC0087c(c0093i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0087c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0093i.f1951e : 0L, !isEmpty3 ? c0093i.f1952f : 0L) + j4;
                                        View view4 = ((X) arrayList7.get(0)).f2009a;
                                        WeakHashMap weakHashMap4 = T.f381a;
                                        view4.postOnAnimationDelayed(runnableC0087c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1447i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f476b).B0();
                return;
            case 9:
                C0262t0 c0262t0 = (C0262t0) this.f476b;
                c0262t0.f3047l = null;
                c0262t0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f476b;
                if (searchView$SearchAutoComplete.f1205f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1205f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f476b).f1223a;
                if (actionMenuView == null || (c0243k = actionMenuView.f1187t) == null) {
                    return;
                }
                c0243k.l();
                return;
            case 12:
                break;
            default:
                I0.e eVar = (I0.e) this.f476b;
                eVar.f350c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f351e;
                S.e eVar2 = bottomSheetBehavior.f1551M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f349b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1550L == 2) {
                        bottomSheetBehavior.C(eVar.f349b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            l1.d dVar = (l1.d) this.f476b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            l1.c cVar = c2.f3154c;
            X0.e.b(cVar);
            l1.d dVar2 = (l1.d) this.f476b;
            boolean isLoggable = l1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0249n c0249n = cVar.f3157a.f3162a;
                j2 = System.nanoTime();
                i1.r.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                l1.d.a(dVar2, c2);
                if (isLoggable) {
                    C0249n c0249n2 = cVar.f3157a.f3162a;
                    i1.r.a(c2, cVar, "finished run in ".concat(i1.r.g(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3162a.f3013a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C0249n c0249n3 = cVar.f3157a.f3162a;
                        i1.r.a(c2, cVar, "failed a run in ".concat(i1.r.g(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
