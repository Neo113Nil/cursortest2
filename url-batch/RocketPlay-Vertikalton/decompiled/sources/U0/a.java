package U0;

import android.view.Choreographer;
import android.view.View;
import c1.AbstractC0104b;
import com.luckycounter.drinkwater.ui.HydrationCoreView;
import com.luckycounter.drinkwater.ui.PercentRingView;
import com.luckycounter.drinkwater.ui.StarrySkyView;
import com.luckycounter.drinkwater.ui.TargetCrashView;
import h1.InterfaceC0173a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1222b;

    public /* synthetic */ a(View view, int i) {
        this.f1221a = i;
        this.f1222b = view;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        switch (this.f1221a) {
            case 0:
                HydrationCoreView hydrationCoreView = (HydrationCoreView) this.f1222b;
                if (hydrationCoreView.f2498k) {
                    hydrationCoreView.f2497j += 0.06f;
                    if (Math.abs(hydrationCoreView.f2496g - hydrationCoreView.h) > 0.001f) {
                        float f2 = hydrationCoreView.f2496g;
                        hydrationCoreView.f2496g = ((hydrationCoreView.h - f2) * 0.12f) + f2;
                    } else {
                        hydrationCoreView.f2496g = hydrationCoreView.h;
                    }
                    hydrationCoreView.invalidate();
                    Choreographer.getInstance().postFrameCallback(this);
                    break;
                }
                break;
            case 1:
                PercentRingView percentRingView = (PercentRingView) this.f1222b;
                if (percentRingView.f2504f) {
                    ArrayList arrayList = percentRingView.f2500a;
                    Iterator it = arrayList.iterator();
                    i1.f.d(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        i1.f.d(next, "next(...)");
                        b bVar = (b) next;
                        float f3 = bVar.f1223a + 8.0f;
                        bVar.f1223a = f3;
                        float f4 = bVar.f1224b;
                        bVar.f1225c = AbstractC0104b.h((int) ((1.0f - (f3 / f4)) * 255.0f), 0, 255);
                        if (bVar.f1223a >= f4) {
                            it.remove();
                        }
                    }
                    if (!arrayList.isEmpty() || System.currentTimeMillis() < percentRingView.f2503e) {
                        percentRingView.invalidate();
                    }
                    if (!arrayList.isEmpty()) {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
            case 2:
                StarrySkyView starrySkyView = (StarrySkyView) this.f1222b;
                if (starrySkyView.d) {
                    starrySkyView.f2508c = j2;
                    starrySkyView.invalidate();
                    Choreographer.getInstance().postFrameCallback(this);
                    break;
                }
                break;
            default:
                TargetCrashView targetCrashView = (TargetCrashView) this.f1222b;
                if (targetCrashView.h) {
                    long j3 = (j2 / 1000000) - targetCrashView.i;
                    float f5 = targetCrashView.f2513e;
                    int i = targetCrashView.f2514f;
                    float f6 = (i * 0.02f) + f5;
                    targetCrashView.f2513e = f6;
                    if (f6 > 1.15f || f6 < 0.95f) {
                        targetCrashView.f2514f = -i;
                    }
                    targetCrashView.f2515g = ((float) Math.sin(j3 / 50.0d)) * 6.0f;
                    Iterator it2 = targetCrashView.f2510a.iterator();
                    i1.f.d(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        i1.f.d(next2, "next(...)");
                        d dVar = (d) next2;
                        dVar.f1231a += dVar.f1233c;
                        dVar.f1232b = dVar.f1232b + dVar.d + 0.3f;
                    }
                    targetCrashView.invalidate();
                    if (j3 >= 2500) {
                        targetCrashView.h = false;
                        InterfaceC0173a onAnimationEnd = targetCrashView.getOnAnimationEnd();
                        if (onAnimationEnd != null) {
                            onAnimationEnd.c();
                            break;
                        }
                    } else {
                        Choreographer.getInstance().postFrameCallback(this);
                        break;
                    }
                }
                break;
        }
    }
}
