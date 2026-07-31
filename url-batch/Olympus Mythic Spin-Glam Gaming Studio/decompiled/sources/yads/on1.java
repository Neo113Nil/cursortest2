package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R$layout;
import java.util.List;

/* loaded from: classes14.dex */
public final class on1 {
    public final xx1 a = new xx1();
    public final px1 b = new px1();
    public final nx1 c = new nx1();

    public final wv2 a(t8 t8Var, yu2 yu2Var, CustomizableMediaView customizableMediaView, ri2 ri2Var, List list, rn1 rn1Var, bz2 bz2Var) {
        kx1 kx1Var;
        Long l;
        Context context = customizableMediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        qx1 qx1Var = new qx1(context, t8Var, yu2Var);
        yx1 yx1Var = new yx1(viewPager2);
        long longValue = (bz2Var == null || (l = bz2Var.b) == null) ? 0L : l.longValue();
        if (longValue > 0) {
            kx1Var = new kx1(viewPager2, yx1Var, qx1Var);
            viewPager2.addOnAttachStateChangeListener(new ux1(kx1Var, longValue));
        } else {
            kx1Var = null;
        }
        viewPager2.registerOnPageChangeCallback(new ub2(qx1Var, kx1Var));
        this.b.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) qs2.a(context, MultiBannerControlsContainer.class, R$layout.monetization_ads_internal_multibanner_controls, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.a(viewPager2);
            multiBannerControlsContainer.setOnClickLeftButtonListener(new qz(yx1Var, qx1Var, kx1Var));
            multiBannerControlsContainer.setOnClickRightButtonListener(new rz(yx1Var, qx1Var, kx1Var));
        }
        this.c.getClass();
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        extendedViewContainer.setMeasureSpecProvider(new sk2((float) vx1.a(list)));
        this.a.getClass();
        if (!tq0.a(customizableMediaView.getContext(), sq0.e)) {
            customizableMediaView.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        extendedViewContainer.addView(viewPager2, layoutParams2);
        if (multiBannerControlsContainer != null) {
            extendedViewContainer.addView(multiBannerControlsContainer, layoutParams2);
        }
        customizableMediaView.addView(extendedViewContainer, layoutParams2);
        Context context2 = ((nt3) yu2Var).a;
        return new wv2(customizableMediaView, new zx1(viewPager2, ri2Var, pr.a(context2, context2), t8Var), rn1Var);
    }
}
