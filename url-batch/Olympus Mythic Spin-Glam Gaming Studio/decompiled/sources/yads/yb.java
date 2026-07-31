package yads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
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

/* loaded from: classes4.dex */
public final class yb {
    public static boolean c;
    public final wm0 a;
    public final cb2 b;

    public yb(wm0 wm0Var, cb2 cb2Var) {
        this.a = wm0Var;
        this.b = cb2Var;
    }

    public final void a(Activity activity, ac acVar, hb hbVar, final zb zbVar) {
        qb qbVar = new qb(activity, 14);
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
            if (pa.a(35)) {
                kb.a(viewGroup2);
            }
            viewGroup2.addView(acVar);
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
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yads.yb$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yb.a(zb.this, dialogInterface);
            }
        });
        nb nbVar = new nb(dialog, acVar, this.a, this.b);
        String str = hbVar.b;
        nbVar.b.setAdtuneWebViewListener(new lb(nbVar));
        YandexNetworkBridge.webviewLoadUrl(nbVar.b, str);
        nbVar.e.postDelayed(new mb(nbVar), nb.f);
        nbVar.a.show();
    }

    public final void a(View view, hb hbVar, zb zbVar) {
        Activity activity;
        Activity b;
        if (c) {
            return;
        }
        Context context = view.getContext();
        do {
            activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper == null) {
                    break;
                } else {
                    context = contextWrapper.getBaseContext();
                }
            } else {
                break;
            }
        } while (context != null);
        activity = null;
        if (activity == null) {
            synchronized (h1.a) {
                i1 i1Var = h1.b;
                b = i1Var != null ? i1Var.b() : null;
            }
            activity = b;
        }
        if (activity == null || !oa.a(activity)) {
            return;
        }
        try {
            ac acVar = new ac(activity, hbVar);
            c = true;
            a(activity, acVar, hbVar, zbVar);
            if (zbVar != null) {
                zbVar.a(true);
            }
        } catch (Throwable unused) {
            c = false;
            if (zbVar != null) {
                zbVar.a(false);
            }
        }
    }

    public static final void a(zb zbVar, DialogInterface dialogInterface) {
        c = false;
        if (zbVar != null) {
            zbVar.a(false);
        }
    }
}
