package com.my.target;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.my.target.b0;
import com.my.target.common.MyTargetActivity;
import com.my.target.nativeads.NativeAppwallAd;
import com.my.target.nativeads.factories.NativeAppwallViewsFactory;
import com.my.target.nativeads.views.AppwallAdView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class od implements MyTargetActivity.ActivityEngine {
    private final NativeAppwallAd a;
    private WeakReference b;
    private boolean c;

    private od(NativeAppwallAd nativeAppwallAd) {
        this.a = nativeAppwallAd;
    }

    public static od a(NativeAppwallAd nativeAppwallAd) {
        return new od(nativeAppwallAd);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.r);
        p0.startActivity(p1);
    }

    public void b() {
        this.c = false;
        WeakReference weakReference = this.b;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityAttach(MyTargetActivity myTargetActivity) {
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public boolean onActivityBackPressed() {
        return true;
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        this.b = new WeakReference(myTargetActivity);
        a(myTargetActivity);
        if (myTargetActivity.getActionBar() == null) {
            LinearLayout linearLayout = new LinearLayout(myTargetActivity);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(linearLayout);
            a(linearLayout);
            b(linearLayout);
        } else {
            b(frameLayout);
        }
        NativeAppwallAd.AppwallAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onDisplay(this.a);
        }
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        this.c = false;
        this.b = null;
        NativeAppwallAd.AppwallAdListener listener = this.a.getListener();
        if (listener != null) {
            listener.onDismiss(this.a);
        }
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
        WeakReference weakReference;
        MyTargetActivity myTargetActivity;
        if (menuItem.getItemId() != 16908332 || (weakReference = this.b) == null || (myTargetActivity = (MyTargetActivity) weakReference.get()) == null) {
            return false;
        }
        myTargetActivity.finish();
        return true;
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityPause() {
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityResume() {
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityStart() {
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityStop() {
    }

    public void a(Context context) {
        if (this.c) {
            mi.a("NativeAppwallAdEngine: Unable to open Appwall Ad twice, please dismiss currently showing ad first");
            return;
        }
        this.c = true;
        MyTargetActivity.activityEngine = this;
        Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    private void b(ViewGroup viewGroup) {
        AppwallAdView appwallView = NativeAppwallViewsFactory.getAppwallView(this.a, viewGroup.getContext());
        this.a.registerAppwallAdView(appwallView);
        appwallView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(appwallView);
    }

    public void a() {
        b();
    }

    private void a(MyTargetActivity myTargetActivity) {
        Window window = myTargetActivity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        myTargetActivity.setTheme(android.R.style.Theme.Material.Light.DarkActionBar);
        ActionBar actionBar = myTargetActivity.getActionBar();
        if (actionBar != null) {
            actionBar.setTitle(this.a.getTitle());
            actionBar.setIcon(android.R.color.transparent);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setBackgroundDrawable(new ColorDrawable(this.a.getTitleBackgroundColor()));
            a(actionBar, this.a.getTitleTextColor());
            actionBar.setElevation(qi.g(myTargetActivity).b(4));
        }
        window.setStatusBarColor(this.a.getTitleSupplementaryColor());
    }

    private void a(ActionBar actionBar, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(actionBar.getTitle());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, actionBar.getTitle().length(), 18);
        actionBar.setTitle(spannableStringBuilder);
    }

    private void a(ViewGroup viewGroup) {
        b0 b0Var = new b0(viewGroup.getContext());
        b0Var.setTitle(this.a.getTitle());
        b0Var.setStripeColor(this.a.getTitleSupplementaryColor());
        b0Var.setMainColor(this.a.getTitleBackgroundColor());
        b0Var.setTitleColor(this.a.getTitleTextColor());
        b0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, qi.g(viewGroup.getContext()).b(52)));
        viewGroup.addView(b0Var);
        b0Var.setOnCloseClickListener(new b0.a() { // from class: com.my.target.od$$ExternalSyntheticLambda0
            @Override // com.my.target.b0.a
            public final void a() {
                od.this.b();
            }
        });
    }
}
