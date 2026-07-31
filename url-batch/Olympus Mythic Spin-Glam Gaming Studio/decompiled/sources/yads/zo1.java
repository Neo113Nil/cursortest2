package yads;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.banner.BannerAdView;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class zo1 {
    public static final /* synthetic */ KProperty[] e = {ra.a(zo1.class, "adView", "getAdView()Landroid/view/ViewGroup;", 0)};
    public final l03 a;
    public final ik3 b;
    public final Handler c;
    public final qm2 d;

    public zo1(BannerAdView bannerAdView, l03 l03Var) {
        ik3 ik3Var = new ik3();
        this.a = l03Var;
        this.b = ik3Var;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new qm2(bannerAdView);
    }

    public static final void a(zo1 zo1Var, View view, il ilVar) {
        RelativeLayout.LayoutParams layoutParams;
        qm2 qm2Var = zo1Var.d;
        KProperty kProperty = e[0];
        ViewGroup viewGroup = (ViewGroup) qm2Var.a.get();
        if (viewGroup != null && viewGroup.indexOfChild(view) == -1) {
            l03 l03Var = zo1Var.a;
            if (l03Var == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            } else {
                int height = l03Var.getHeight();
                float f = Resources.getSystem().getDisplayMetrics().density;
                if (height >= 0) {
                    height = MathKt.roundToInt(height * f);
                }
                int width = zo1Var.a.getWidth();
                float f2 = Resources.getSystem().getDisplayMetrics().density;
                if (width >= 0) {
                    width = MathKt.roundToInt(width * f2);
                }
                view.measure(0, 0);
                int measuredHeight = view.getMeasuredHeight();
                layoutParams = new RelativeLayout.LayoutParams(Math.min(width, view.getMeasuredWidth()), Math.min(height, measuredHeight));
            }
            layoutParams.addRule(13);
            kk3.a(view);
            viewGroup.addView(view, layoutParams);
            viewGroup.setVisibility(0);
            view.setVisibility(0);
        }
        view.getViewTreeObserver().addOnPreDrawListener(new yo1(zo1Var, view, ilVar));
    }

    public final void a(final View view, final il ilVar) {
        this.c.post(new Runnable() { // from class: yads.zo1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                zo1.a(zo1.this, view, ilVar);
            }
        });
    }
}
