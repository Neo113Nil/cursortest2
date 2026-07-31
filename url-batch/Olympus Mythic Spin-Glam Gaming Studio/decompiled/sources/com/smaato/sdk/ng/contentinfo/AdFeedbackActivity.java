package com.smaato.sdk.ng.contentinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.R;
import com.smaato.sdk.ng.contentinfo.AdFeedbackFormHelper;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.mraid.MRAIDInterstitial;
import com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener;
import com.smaato.sdk.ng.mraid.MRAIDView;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.utils.URLValidator;
import com.smaato.sdk.ng.utils.UrlHandler;
import com.smaato.sdk.ng.views.ProgressDialogView;
import com.smaato.sdk.ng.vpaid.helpers.SimpleTimer;

/* loaded from: classes12.dex */
public class AdFeedbackActivity extends Activity implements MRAIDViewListener, MRAIDNativeFeatureListener {
    public static final String EXTRA_FEEDBACK_FORM_CALLBACK = "extra_feedback_form_callback";
    public static final String EXTRA_FEEDBACK_FORM_DATA = "extra_feedback_form_data";
    public static final String EXTRA_FEEDBACK_FORM_URL = "extra_feedback_form_url";
    private ResultReceiver a;
    private String b;
    private MRAIDInterstitial c;
    private AdFeedbackData d;
    private UrlHandler e;
    private SimpleTimer f;
    private Boolean g = Boolean.FALSE;
    RelativeLayout h;
    ProgressDialogView i;

    class a implements SimpleTimer.Listener {
        a() {
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onFinish() {
            if (AdFeedbackActivity.this.g.booleanValue()) {
                AdFeedbackActivity.this.finish();
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onTick(long j) {
        }
    }

    private void a(Intent intent) {
        try {
            if (intent.hasExtra("extra_feedback_form_callback")) {
                this.a = (ResultReceiver) intent.getParcelableExtra("extra_feedback_form_callback");
            }
            if (!intent.hasExtra("extra_feedback_form_url") || TextUtils.isEmpty(intent.getStringExtra("extra_feedback_form_url"))) {
                i();
                finish();
            } else {
                this.b = intent.getStringExtra("extra_feedback_form_url");
            }
            if (intent.hasExtra("extra_feedback_form_data") && intent.getSerializableExtra("extra_feedback_form_data") != null) {
                this.d = (AdFeedbackData) intent.getSerializableExtra("extra_feedback_form_data");
            } else {
                i();
                finish();
            }
        } catch (Exception unused) {
            i();
            finish();
        }
    }

    private void b() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.h = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        setContentView(this.h);
    }

    private void c() {
        getWindow().addFlags(1024);
        getWindow().clearFlags(2048);
    }

    private void d() {
        this.e = new UrlHandler(this);
    }

    private void e() {
        this.i = new ProgressDialogView(this);
        this.h.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.c.showDefaultContentInfoURL(Ad.CONTENT_INFO_LINK_URL);
        i();
    }

    private void g() {
        if (this.b == null) {
            i();
            finish();
        }
        String str = this.b;
        Boolean bool = Boolean.TRUE;
        MRAIDInterstitial mRAIDInterstitial = new MRAIDInterstitial(this, str, null, bool, bool, new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"}, this, this, null);
        this.c = mRAIDInterstitial;
        mRAIDInterstitial.markCreativeAdComingFromFeedbackForm();
        this.c.setVisibility(4);
    }

    private void h() {
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            resultReceiver.send(AdFeedbackFormHelper.a.CLOSE.a, null);
        }
    }

    private void i() {
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            resultReceiver.send(AdFeedbackFormHelper.a.ERROR.a, null);
        }
    }

    private void j() {
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            resultReceiver.send(AdFeedbackFormHelper.a.OPEN.a, null);
        }
    }

    private void k() {
        this.g = Boolean.TRUE;
        a();
        showProgressDialog(null, getString(R.string.loading));
        SimpleTimer simpleTimer = new SimpleTimer(10000L, new a());
        this.f = simpleTimer;
        simpleTimer.start();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.v, me);
        return super.dispatchTouchEvent(me);
    }

    public void hideProgressDialog() {
        this.i.hide();
        getWindow().clearFlags(16);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        this.e.handleUrl(str, null, null);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureStorePicture(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
        finish();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        i();
        finish();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        this.g = Boolean.FALSE;
        new FeedbackJSInterface().submitData(this.d, mRAIDView);
        hideProgressDialog();
        j();
        if (URLValidator.isValidURL(this.b)) {
            this.c.show(this, new MRAIDView.OnExpandCreativeFailListener() { // from class: com.smaato.sdk.ng.contentinfo.AdFeedbackActivity$$ExternalSyntheticLambda0
                @Override // com.smaato.sdk.ng.mraid.MRAIDView.OnExpandCreativeFailListener
                public final void onExpandFailed() {
                    AdFeedbackActivity.this.f();
                }
            }, this.b);
        } else {
            i();
            finish();
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
        return false;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (getResources().getConfiguration().orientation == 2) {
            setRequestedOrientation(0);
        }
        if (getResources().getConfiguration().orientation == 1) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        d();
        a(intent);
        g();
        c();
        b();
        e();
        k();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTAClick() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTALoadFail() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTAShow() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardClicked() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardClosed() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardLoadFail() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardLoadSuccess() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardShow(String str) {
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        h();
        super.onDestroy();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onReplayClicked() {
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        this.a = (ResultReceiver) bundle.getParcelable("extra_feedback_form_callback");
        this.b = bundle.getString("extra_feedback_form_url");
        this.d = (AdFeedbackData) bundle.getSerializable("extra_feedback_form_data");
        super.onRestoreInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString("extra_feedback_form_url", this.b);
        bundle.putParcelable("extra_feedback_form_callback", this.a);
        bundle.putSerializable("extra_feedback_form_data", this.d);
        super.onSaveInstanceState(bundle);
    }

    public void showProgressDialog(String str, String str2) {
        this.i.show(str, str2);
        getWindow().setFlags(16, 16);
    }

    private void a() {
        SimpleTimer simpleTimer = this.f;
        if (simpleTimer != null) {
            simpleTimer.cancel();
        }
    }
}
