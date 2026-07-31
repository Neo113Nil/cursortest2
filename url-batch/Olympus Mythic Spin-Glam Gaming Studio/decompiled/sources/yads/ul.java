package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class ul {
    public final tl a;

    public ul(tl tlVar) {
        this.a = tlVar;
    }

    public final void a(ju0 ju0Var, ll llVar) {
        Object obj;
        RelativeLayout.LayoutParams layoutParams;
        tl tlVar = this.a;
        qd1 qd1Var = tlVar.c;
        Context context = tlVar.a;
        Iterator it = qd1Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((md1) obj).c.a(context)) {
                    break;
                }
            }
        }
        md1 md1Var = (md1) obj;
        if (md1Var != null) {
            od1 od1Var = tlVar.d;
            ViewGroup viewGroup = tlVar.b;
            od1Var.getClass();
            ViewGroup viewGroup2 = (ViewGroup) qs2.a(viewGroup.getContext(), ExtendedNativeAdView.class, md1Var.a, viewGroup);
            if (viewGroup2 != null) {
                sl slVar = tlVar.e;
                ViewGroup viewGroup3 = tlVar.b;
                qm2 qm2Var = slVar.d;
                KProperty kProperty = sl.e[0];
                qm2Var.getClass();
                qm2Var.a = new WeakReference(viewGroup2);
                viewGroup3.setVisibility(0);
                viewGroup3.removeAllViews();
                ik3 ik3Var = slVar.b;
                Context context2 = viewGroup3.getContext();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = slVar.a;
                ik3Var.getClass();
                if (viewGroup3.indexOfChild(viewGroup2) == -1) {
                    ik3Var.a.getClass();
                    if (ju0Var != null) {
                        layoutParams = new RelativeLayout.LayoutParams(yg0.a(context2, ju0Var.c(context2)), MathKt.roundToInt(TypedValue.applyDimension(1, ju0Var.a(context2), context2.getResources().getDisplayMetrics())));
                    } else {
                        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    }
                    layoutParams.addRule(13);
                    viewGroup3.setVisibility(0);
                    viewGroup2.setVisibility(0);
                    viewGroup3.addView(viewGroup2, layoutParams);
                    if (onPreDrawListener != null) {
                        tl3 tl3Var = hl3.a;
                        viewGroup2.getViewTreeObserver().addOnPreDrawListener(new gl3(onPreDrawListener, viewGroup2));
                    }
                }
                hg0 hg0Var = md1Var.b;
                slVar.c = hg0Var;
                hg0Var.a(viewGroup2);
                llVar.a();
                return;
            }
        }
        llVar.a(e8.f);
    }
}
