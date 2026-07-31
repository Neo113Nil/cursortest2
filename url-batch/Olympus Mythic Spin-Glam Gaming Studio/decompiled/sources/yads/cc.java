package yads;

import android.app.Activity;
import android.app.Dialog;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.safedk.android.internal.partials.YandexNetworkBridge;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cc implements Runnable {
    public final /* synthetic */ ec b;

    public cc(ec ecVar) {
        this.b = ecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec ecVar = this.b;
        tb tbVar = ecVar.a;
        hb hbVar = ecVar.b;
        ub ubVar = new ub(tbVar.a);
        Activity activity = tbVar.a;
        qb qbVar = new qb(activity, 12);
        ed1 ed1Var = new ed1();
        Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
        View inflate = LayoutInflater.from(new ContextThemeWrapper(activity, hbVar.d ? R$style.MonetizationAdsInternal_AdtuneTheme_Dark : R$style.MonetizationAdsInternal_AdtuneTheme_Light)).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(qbVar);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
        if (viewGroup2 != null) {
            viewGroup2.addView(ubVar);
        }
        View findViewById = viewGroup.findViewById(R$id.adtune_drag_view_container);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new pb(viewGroup, dialog, ed1Var));
        }
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R$id.adtune_background_view);
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new ob(dialog, ed1Var));
        }
        dialog.setContentView(viewGroup);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        wg0.a(dialog);
        sb sbVar = new sb(dialog, ubVar);
        String str = hbVar.c;
        ubVar.setAdtuneWebViewListener(new rb(sbVar));
        YandexNetworkBridge.webviewLoadUrl(ubVar, str);
        dialog.show();
    }
}
