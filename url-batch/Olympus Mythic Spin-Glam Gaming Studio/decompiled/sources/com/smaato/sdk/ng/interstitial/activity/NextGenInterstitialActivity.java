package com.smaato.sdk.ng.interstitial.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialBroadcastReceiver;
import com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel;
import com.smaato.sdk.ng.interstitial.viewModel.MraidInterstitialViewModel;
import com.smaato.sdk.ng.interstitial.viewModel.VastInterstitialViewModel;
import com.smaato.sdk.ng.receiver.VolumeChangedActionReceiver;
import com.smaato.sdk.ng.utils.ViewUtils;
import com.smaato.sdk.ng.utils.WatermarkHelper;
import com.smaato.sdk.ng.views.CloseableContainer;
import com.smaato.sdk.ng.views.NGSDKAPIContentInfoView;
import com.smaato.sdk.ng.vpaid.volume.VolumeObserver;

/* loaded from: classes11.dex */
public abstract class NextGenInterstitialActivity extends Activity implements InterstitialActivityInteractor {
    public static final String EXTRA_BROADCAST_ID = "extra_pn_broadcast_id";
    public static final String EXTRA_SESSION_ID = "extra_pn_session_id";
    public static final String EXTRA_SKIP_OFFSET = "extra_pn_skip_offset";
    public static final String EXTRA_WATERMARK_DATA = "extra_pn_watermark_data";
    public static final String EXTRA_ZONE_ID = "extra_pn_zone_id";
    public static final String INTEGRATION_TYPE = "integration_type";
    private CloseableContainer a;
    private ProgressBar b;
    private OnBackInvokedCallback c;
    private WatermarkHelper d;
    protected InterstitialViewModel f;
    protected boolean e = false;
    private boolean g = false;

    class a implements OnBackInvokedCallback {
        a() {
        }

        public void onBackInvoked() {
            NextGenInterstitialActivity.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        InterstitialViewModel interstitialViewModel = this.f;
        if (interstitialViewModel == null || !interstitialViewModel.isAdSkippable()) {
            return;
        }
        a();
    }

    private void c() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("extra_pn_session_id");
        String stringExtra2 = !TextUtils.isEmpty(stringExtra) ? stringExtra : intent.getStringExtra("extra_pn_zone_id");
        if (this instanceof VastInterstitialActivity) {
            this.f = new VastInterstitialViewModel(this, stringExtra2, intent.getStringExtra("integration_type"), intent.getIntExtra("extra_pn_skip_offset", -1), intent.getLongExtra("extra_pn_broadcast_id", -1L), this);
        } else {
            this.f = new MraidInterstitialViewModel(this, stringExtra2, intent.getStringExtra("integration_type"), intent.getIntExtra("extra_pn_skip_offset", -1), intent.getLongExtra("extra_pn_broadcast_id", -1L), this);
        }
        View createWatermarkView = WatermarkHelper.createWatermarkView(this, intent.getStringExtra("extra_pn_watermark_data"));
        if (createWatermarkView != null) {
            addWatermarkView(createWatermarkView);
        }
    }

    private void d() {
        this.a = new CloseableContainer(this);
        this.b = new ProgressBar(this);
        this.a.setBackgroundColor(-16777216);
        this.d = new WatermarkHelper();
    }

    private void e() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            this.c = new a();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.c);
        }
    }

    protected void a() {
        this.f.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DISMISS);
        this.e = true;
        this.f.resetVolumeChangeTracker();
        finish();
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void addAdView(View view, FrameLayout.LayoutParams layoutParams) {
        CloseableContainer closeableContainer = this.a;
        if (closeableContainer == null || view == null) {
            return;
        }
        closeableContainer.addView(view, layoutParams);
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void addContentInfoView(View view, FrameLayout.LayoutParams layoutParams) {
        CloseableContainer closeableContainer = this.a;
        if (closeableContainer != null) {
            closeableContainer.setClosePosition(CloseableContainer.ClosePosition.TOP_LEFT);
            if (layoutParams != null) {
                this.a.addView(view, layoutParams);
            } else {
                this.a.addView(view);
            }
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void addProgressBarView(FrameLayout.LayoutParams layoutParams) {
        ProgressBar progressBar;
        CloseableContainer closeableContainer = this.a;
        if (closeableContainer == null || (progressBar = this.b) == null) {
            return;
        }
        closeableContainer.addView(progressBar, layoutParams);
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void addWatermarkView(View view) {
        if (this.a == null || view == null || this.d.isWatermarkRegistered()) {
            return;
        }
        this.a.addView(view);
        this.f.addFriendlyObstruction(view);
        this.d.setWatermarkRegistered();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.v, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void finishActivity() {
        this.e = true;
        InterstitialViewModel interstitialViewModel = this.f;
        if (interstitialViewModel != null) {
            interstitialViewModel.resetVolumeChangeTracker();
        }
        finish();
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void hideInterstitialCloseButton() {
        CloseableContainer closeableContainer = this.a;
        if (closeableContainer != null) {
            closeableContainer.setCloseVisible(false);
            this.a.setOnCloseListener(null);
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void hideInterstitialSkipButton() {
        CloseableContainer closeableContainer = this.a;
        if (closeableContainer != null) {
            closeableContainer.setSkipVisible(false);
            this.a.setOnSkipListener(null);
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void hideProgressBar() {
        ProgressBar progressBar = this.b;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @VisibleForTesting
    public boolean isSuperBackPressedCalled() {
        return this.g;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        InterstitialViewModel interstitialViewModel = this.f;
        if (interstitialViewModel == null || !interstitialViewModel.isAdSkippable()) {
            return;
        }
        this.f.sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DISMISS);
        this.e = true;
        this.f.resetVolumeChangeTracker();
        super.onBackPressed();
        this.g = true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        getWindow().getDecorView().setSystemUiVisibility(1792);
        d();
        c();
        e();
        ViewUtils.applyWindowInsets(this.a);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && this.c != null) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.c);
        }
        CloseableContainer closeableContainer = this.a;
        if (closeableContainer != null) {
            closeableContainer.removeAllViews();
        }
        VolumeObserver.getInstance().reset();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 33 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        VolumeChangedActionReceiver.getInstance().unregister(this);
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        VolumeChangedActionReceiver.getInstance().register(this);
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void removeContentInfoView(View view) {
        NGSDKAPIContentInfoView a2 = a(view);
        if (a2 != null) {
            a2.setVisibility(8);
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void setCloseSize(int i) {
        CloseableContainer closeableContainer = this.a;
        if (closeableContainer != null) {
            closeableContainer.setCloseSize(Integer.valueOf(i));
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void setContentLayout() {
        setContentView(this.a);
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void setSkipSize(int i) {
        CloseableContainer closeableContainer = this.a;
        if (closeableContainer != null) {
            closeableContainer.setSkipSize(Integer.valueOf(i));
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void showInterstitialCloseButton(CloseableContainer.OnCloseListener onCloseListener) {
        if (this.a == null || isFinishing()) {
            return;
        }
        this.a.setCloseVisible(true);
        this.a.setOnCloseListener(onCloseListener);
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void showInterstitialSkipButton(CloseableContainer.OnSkipListener onSkipListener) {
        if (this.a == null || isFinishing()) {
            return;
        }
        this.a.setSkipVisible(true);
        this.a.setOnSkipListener(onSkipListener);
    }

    @Override // com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor
    public void showProgressBar() {
        ProgressBar progressBar = this.b;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    private NGSDKAPIContentInfoView a(View view) {
        NGSDKAPIContentInfoView a2;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof NGSDKAPIContentInfoView) {
                return (NGSDKAPIContentInfoView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a(childAt)) != null) {
                return a2;
            }
        }
        return null;
    }
}
