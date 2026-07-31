package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes3.dex */
public final class p {

    @NonNull
    final WeakReference<View> a;

    @Nullable
    b b;
    boolean c;

    @NonNull
    private final ViewTreeObserver.OnPreDrawListener j;

    @NonNull
    private WeakReference<ViewTreeObserver> k;
    float d = -1.0f;
    Rect e = new Rect();
    boolean f = false;
    boolean g = false;

    @NonNull
    private final Handler i = new Handler();

    @NonNull
    private final a h = new a();

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            View view;
            float f;
            p pVar;
            p pVar2;
            p pVar3;
            p pVar4 = p.this;
            boolean z = false;
            pVar4.c = false;
            if (pVar4.b == null || (view = pVar4.a.get()) == null) {
                return;
            }
            Rect rect = new Rect();
            view.getLocalVisibleRect(rect);
            Rect rect2 = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            boolean isShown = view.isShown();
            float f2 = 0.0f;
            boolean z2 = view.getAlpha() == 0.0f;
            List arrayList = new ArrayList();
            if (globalVisibleRect && isShown && !z2) {
                Pair a = p.a(rect2, view);
                if (!((Boolean) a.first).booleanValue()) {
                    m mVar = new m((List) a.second, iArr);
                    float a2 = mVar.a();
                    float width = view.getWidth() * view.getHeight();
                    float width2 = rect.width() * rect.height();
                    if (width > 0.0f) {
                        f = ((width2 - a2) * 100.0f) / width;
                        f2 = (width2 * 100.0f) / width;
                    } else {
                        f = 0.0f;
                    }
                    arrayList = mVar.a;
                    pVar = p.this;
                    if (f2 == pVar.d || !rect.equals(pVar.e)) {
                        pVar2 = p.this;
                        if (pVar2.f) {
                            f2 = f;
                        }
                        pVar2.d = f2;
                        pVar2.e = rect;
                        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                        pVar3 = p.this;
                        if (pVar3.f) {
                            b bVar = pVar3.b;
                            if (globalVisibleRect && isShown && !z2) {
                                z = true;
                            }
                            bVar.a(z, new sg.bigo.ads.core.mraid.b(pVar3.d, p.a(pVar3.e, displayMetrics.densityDpi), null));
                            return;
                        }
                        b bVar2 = pVar3.b;
                        if (globalVisibleRect && isShown && !z2) {
                            z = true;
                        }
                        bVar2.a(z, new sg.bigo.ads.core.mraid.b(pVar3.d, p.a(pVar3.e, displayMetrics.densityDpi), p.a(arrayList, displayMetrics.densityDpi)));
                        return;
                    }
                    return;
                }
            }
            f = 0.0f;
            pVar = p.this;
            if (f2 == pVar.d) {
            }
            pVar2 = p.this;
            if (pVar2.f) {
            }
            pVar2.d = f2;
            pVar2.e = rect;
            DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
            pVar3 = p.this;
            if (pVar3.f) {
            }
        }
    }

    public interface b {
        void a(boolean z, sg.bigo.ads.core.mraid.b bVar);
    }

    public p(@NonNull View view) {
        String str;
        this.a = new WeakReference<>(view);
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.p.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                p.this.a();
                return true;
            }
        };
        this.j = onPreDrawListener;
        this.k = new WeakReference<>(null);
        Context context = view.getContext();
        ViewTreeObserver viewTreeObserver = this.k.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View a2 = v.a(context, view);
            if (a2 == null) {
                str = "Unable to set Visibility Tracker due to no available root view.";
            } else {
                ViewTreeObserver viewTreeObserver2 = a2.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    this.k = new WeakReference<>(viewTreeObserver2);
                    viewTreeObserver2.addOnPreDrawListener(onPreDrawListener);
                    return;
                }
                str = "Visibility Tracker was unable to track views because the root view tree observer was not alive";
            }
            sg.bigo.ads.bn.a.a(0, "VisibilityTracker", str);
        }
    }

    static Rect a(Rect rect, int i) {
        return new Rect((rect.left * 160) / i, (rect.top * 160) / i, (rect.right * 160) / i, (rect.bottom * 160) / i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v5 */
    static /* synthetic */ Pair a(Rect rect, View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        loop0: while (true) {
            View view2 = view;
            view = (ViewGroup) view.getParent();
            while (true) {
                if (view == 0) {
                    z = false;
                    break loop0;
                }
                z = true;
                if (view.getAlpha() == 0.0f) {
                    break loop0;
                }
                for (int indexOfChild = view.indexOfChild(view2) + 1; indexOfChild < view.getChildCount(); indexOfChild++) {
                    View childAt = view.getChildAt(indexOfChild);
                    if (childAt.getVisibility() == 0) {
                        Rect rect2 = new Rect();
                        childAt.getGlobalVisibleRect(rect2);
                        if (Rect.intersects(rect, rect2)) {
                            arrayList.add(new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom)));
                        }
                    }
                }
                if (view != viewGroup) {
                    break;
                }
                view = 0;
            }
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    static /* synthetic */ List a(List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Rect) it.next(), i));
        }
        return arrayList;
    }

    final void a() {
        if (!this.c && this.g) {
            this.c = true;
            this.i.removeCallbacks(this.h);
            this.i.postDelayed(this.h, 500L);
        }
    }
}
