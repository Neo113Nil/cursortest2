package com.mbridge.msdk.interstitial.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.X3;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.controller.a;
import com.mbridge.msdk.mbsignalcommon.mraid.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.my.target.common.DisclaimerAlias;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class MBInterstitialActivity extends MBBaseActivity implements com.mbridge.msdk.mbsignalcommon.mraid.b {
    public static final String INTENT_CAMAPIGN = "campaign";
    public static final String INTENT_UNIT_ID = "unitId";
    public static final long WATI_JS_INVOKE = 2000;
    public static final long WEB_LOAD_TIME = 15000;
    private CampaignEx i;
    private WindVaneWebView j;
    private ImageView k;
    private a.d l;
    private boolean m;
    public ProgressBar mProgressBar;
    public String mUnitid;
    private com.mbridge.msdk.mbsignalcommon.mraid.d n;
    private long o;
    private boolean p;
    private boolean q;
    private com.mbridge.msdk.click.a u;
    private boolean g = false;
    private boolean h = false;
    public boolean mIsMBPage = false;
    private Handler r = new f();
    Runnable s = new j();
    Runnable t = new k();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar progressBar = MBInterstitialActivity.this.mProgressBar;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    class c implements NativeListener.NativeTrackingListener {
        c() {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.hideLoading();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            MBInterstitialActivity.this.hideLoading();
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                MBInterstitialActivity.this.showLoading();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(MBInterstitialActivity.this.j, MBInterstitialActivity.this.j.getLeft(), MBInterstitialActivity.this.j.getTop(), MBInterstitialActivity.this.j.getWidth(), MBInterstitialActivity.this.j.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.j, MBInterstitialActivity.this.j.getLeft(), MBInterstitialActivity.this.j.getTop(), MBInterstitialActivity.this.j.getWidth(), MBInterstitialActivity.this.j.getHeight());
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(MBInterstitialActivity.this)).b(MBInterstitialActivity.this.i.getId());
        }
    }

    class f extends Handler {
        f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBInterstitialActivity.this.finish();
        }
    }

    class i extends com.mbridge.msdk.mbsignalcommon.listener.b {
        i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            try {
                if (MBInterstitialActivity.this.m) {
                    return;
                }
                MBInterstitialActivity.this.a(1, "");
                MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
                if (mBInterstitialActivity.s != null && mBInterstitialActivity.r != null) {
                    MBInterstitialActivity.this.r.removeCallbacks(MBInterstitialActivity.this.s);
                }
                if (MBInterstitialActivity.this.l != null) {
                    MBInterstitialActivity.this.l.c();
                }
                MBInterstitialActivity mBInterstitialActivity2 = MBInterstitialActivity.this;
                if (!mBInterstitialActivity2.mIsMBPage) {
                    mBInterstitialActivity2.r.postDelayed(MBInterstitialActivity.this.t, 2000L);
                }
                MBInterstitialActivity.this.i();
            } catch (Exception e) {
                e.printStackTrace();
                if (MBInterstitialActivity.this.l != null) {
                    MBInterstitialActivity.this.l.a("load page failed");
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onProgressChanged(WebView webView, int i) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            try {
                MBInterstitialActivity.this.m = true;
                if (MBInterstitialActivity.this.l != null) {
                    MBInterstitialActivity.this.l.a(str);
                }
                MBInterstitialActivity.this.a(3, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            MBInterstitialActivity.this.m = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return true;
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.h) {
                return;
            }
            MBInterstitialActivity.this.g = true;
            if (MBInterstitialActivity.this.l != null) {
                MBInterstitialActivity.this.l.a("load page timeout");
                if (MBInterstitialActivity.this.j != null) {
                    MBInterstitialActivity.this.j.setVisibility(8);
                    MBInterstitialActivity.this.j.setWebViewListener(null);
                    MBInterstitialActivity.this.j.release();
                }
                MBInterstitialActivity.this.hideLoading();
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBInterstitialActivity mBInterstitialActivity = MBInterstitialActivity.this;
            if (mBInterstitialActivity.mIsMBPage) {
                return;
            }
            if (mBInterstitialActivity.i != null && MBInterstitialActivity.this.i.isMraid()) {
                MBInterstitialActivity.this.m();
            }
            com.mbridge.msdk.interstitial.cache.a.a().a(MBInterstitialActivity.this.i, MBInterstitialActivity.this.mUnitid);
            if (MBInterstitialActivity.this.g) {
                return;
            }
            MBInterstitialActivity.this.h = true;
            MBInterstitialActivity.this.hideLoading();
            MBInterstitialActivity.this.showWebView();
        }
    }

    class l implements d.b {
        l() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
        public void a(double d) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(MBInterstitialActivity.this.j, d);
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MBInterstitialActivity.this.j == null || MBInterstitialActivity.this.i == null) {
                    return;
                }
                MBInterstitialActivity.this.j.setVisibility(0);
                if (MBInterstitialActivity.this.i.isMraid()) {
                    MBInterstitialActivity.this.k();
                }
                MBInterstitialActivity.this.j();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBInterstitialActivity.this.j != null) {
                MBInterstitialActivity.this.j.setVisibility(8);
            }
        }
    }

    private void l() {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getApplicationContext());
        CampaignEx campaignEx = this.i;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.i.getRequestIdNotice(), this.i.getId(), this.mUnitid, com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.i.getId()), this.i.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.i.getId());
            this.p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        List<String> pv_urls;
        try {
            com.mbridge.msdk.foundation.controller.c.n().a(this);
            if (!TextUtils.isEmpty(this.i.getImpressionURL())) {
                Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx = this.i;
                com.mbridge.msdk.click.a.a(d2, campaignEx, this.mUnitid, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.m);
            }
            if (!TextUtils.isEmpty(this.i.getOnlyImpressionURL())) {
                Context d3 = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx2 = this.i;
                com.mbridge.msdk.click.a.a(d3, campaignEx2, this.mUnitid, campaignEx2.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.n);
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.mUnitid, this.i, "interstitial");
            e eVar = new e();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(eVar);
            } else {
                eVar.run();
            }
            CampaignEx campaignEx3 = this.i;
            if (campaignEx3 == null || (pv_urls = campaignEx3.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.i, this.mUnitid, it.next(), false, true);
            }
        } catch (Throwable th) {
            q0.a("MBInterstitialActivity", th.getMessage());
        }
    }

    private void n() {
        CampaignEx campaignEx;
        this.k.setOnClickListener(new h());
        if (this.j == null || (campaignEx = this.i) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(campaignEx);
        aVar.a(this.i.getAppName());
        this.j.setCampaignId(this.i.getId());
        this.j.setDownloadListener(aVar);
    }

    public void clickTracking() {
        try {
            if (this.i != null && !a1.a(this.mUnitid)) {
                onIntersClick();
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getApplicationContext(), this.mUnitid);
                this.u = aVar;
                aVar.a(new c());
                this.u.a(this.i);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        finish();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.o, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z) {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (!this.p) {
            l();
        }
        if (this.q) {
            return;
        }
        reportPlayableClosed();
    }

    public com.mbridge.msdk.setting.m getIntersUnitSetting() {
        try {
            if (TextUtils.isEmpty(this.mUnitid)) {
                return null;
            }
            com.mbridge.msdk.setting.m e2 = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.mUnitid);
            return e2 == null ? com.mbridge.msdk.setting.m.h(this.mUnitid) : e2;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.i;
    }

    public void goneWebView() {
        try {
            runOnUiThread(new n());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void hideLoading() {
        try {
            runOnUiThread(new b());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void initView() {
        this.j = (WindVaneWebView) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_wv", "id"));
        this.mProgressBar = (ProgressBar) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_pb", "id"));
        this.k = (ImageView) findViewById(i0.a(getApplicationContext(), "mbridge_interstitial_iv_close", "id"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            int a2 = i0.a(getApplicationContext(), "mbridge_interstitial_activity", "layout");
            if (!i0.a(a2)) {
                g();
                f();
                a.d dVar = this.l;
                if (dVar != null) {
                    dVar.a("not found resource");
                }
                finish();
                return;
            }
            setContentView(a2);
            initView();
            e();
            com.mbridge.msdk.foundation.controller.c.n().a(this);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this, (ViewGroup) null, (ViewGroup.LayoutParams) null, new g());
            this.i.setCampaignUnitId(this.mUnitid);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.mUnitid, this.i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            a.d dVar = this.l;
            if (dVar != null) {
                dVar.b();
            }
            com.mbridge.msdk.click.a aVar = this.u;
            if (aVar != null) {
                aVar.a(false);
                this.u.a((NativeListener.NativeTrackingListener) null);
                this.u.c();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar2 = this.n;
            if (dVar2 != null) {
                dVar2.d();
            }
            if (!this.p) {
                l();
            }
            if (com.mbridge.msdk.interstitial.controller.a.r != null && !TextUtils.isEmpty(this.mUnitid)) {
                com.mbridge.msdk.interstitial.controller.a.r.remove(this.mUnitid);
            }
            this.l = null;
            com.mbridge.msdk.foundation.feedback.b.b().d(this.mUnitid);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onIntersClick() {
        try {
            a.d dVar = this.l;
            if (dVar != null) {
                dVar.a();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        CampaignEx campaignEx = this.i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.j, "false");
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        CampaignEx campaignEx = this.i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.j, "true");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.i.setClickURL(str);
            a(str);
        }
        this.i.setClickTempSource(2);
        this.i.setClickType(2);
        this.i.setTriggerClickSource(2);
        clickTracking();
    }

    public void reportPlayableClosed() {
        if (this.i != null) {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.i.getId(), this.i.getRequestId(), this.i.getRequestIdNotice(), this.mUnitid, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
            nVar.b(this.i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.mUnitid);
            this.q = true;
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i2, int i3, int i4, int i5, int i6) {
        int a2 = v0.a(this, 10.0f);
        if (i3 <= 0) {
            i3 = a2;
        }
        if (i4 <= 0) {
            i4 = a2;
        }
        if (i5 <= 0) {
            i5 = a2;
        }
        if (i6 <= 0) {
            i6 = a2;
        }
        if (this.k != null) {
            int a3 = v0.a(this, 25.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams.addRule(11);
            layoutParams.setMargins(i3, i5, i4, i6);
            this.k.setLayoutParams(layoutParams);
        }
    }

    public void showLoading() {
        try {
            runOnUiThread(new a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void showWebView() {
        runOnUiThread(new m());
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z) {
        if (z) {
            this.k.setImageDrawable(new ColorDrawable(0));
        } else {
            this.k.setImageResource(i0.a(getApplicationContext(), "mbridge_interstitial_close", "drawable"));
        }
    }

    private void e() {
        g();
        n();
        f();
        h();
    }

    private void f() {
        try {
            if (com.mbridge.msdk.interstitial.controller.a.r == null || TextUtils.isEmpty(this.mUnitid) || !com.mbridge.msdk.interstitial.controller.a.r.containsKey(this.mUnitid)) {
                return;
            }
            this.l = com.mbridge.msdk.interstitial.controller.a.r.get(this.mUnitid);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void g() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mUnitid = intent.getStringExtra("unitId");
            this.i = (CampaignEx) intent.getSerializableExtra(INTENT_CAMAPIGN);
        }
        CampaignEx campaignEx = this.i;
        if (campaignEx != null && campaignEx.isMraid()) {
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(this);
            this.n = dVar;
            dVar.c();
            this.n.a(new l());
        }
        CampaignEx campaignEx2 = this.i;
        if (campaignEx2 != null) {
            com.mbridge.msdk.click.c.a(this, campaignEx2.getMaitve(), this.i.getMaitve_src());
        }
    }

    @SuppressLint({"NewApi"})
    private void h() {
        try {
            CampaignEx campaignEx = this.i;
            if (campaignEx == null || (TextUtils.isEmpty(campaignEx.getHtmlUrl()) && !this.i.isMraid())) {
                a.d dVar = this.l;
                if (dVar != null) {
                    dVar.a("htmlurl is null");
                    return;
                }
                return;
            }
            q0.c("MBInterstitialActivity", "url:" + this.i.getHtmlUrl());
            goneWebView();
            this.j.setWebViewListener(new i());
            String htmlUrl = this.i.getHtmlUrl();
            if (this.i.isMraid()) {
                File file = new File(this.i.getMraid());
                if (file.exists() && file.isFile() && file.canRead()) {
                    htmlUrl = "file:////" + this.i.getMraid();
                }
            }
            this.o = System.currentTimeMillis();
            MintegralNetworkBridge.webviewLoadUrl(this.j, htmlUrl);
            this.r.postDelayed(this.s, 15000L);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        CampaignEx campaignEx = this.i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i2 = getResources().getConfiguration().orientation;
        String str = i2 != 0 ? i2 != 1 ? i2 != 2 ? DisclaimerAlias.UNDEFINED : "landscape" : "portrait" : "undefined";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(X3.i.n, str);
            jSONObject.put("locked", "true");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        float n2 = m0.n(this);
        float m2 = m0.m(this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f2 = displayMetrics.widthPixels;
        float f3 = displayMetrics.heightPixels;
        HashMap hashMap = new HashMap();
        hashMap.put("placementType", "Interstitial");
        hashMap.put("state", "default");
        hashMap.put("viewable", "true");
        hashMap.put("currentAppOrientation", jSONObject);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.j, n2, m2);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.j, f2, f3);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.j, hashMap);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.j, this.n.a());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CampaignEx campaignEx = this.i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        this.j.post(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.n(this.i.getRequestId());
            nVar.o(this.i.getRequestIdNotice());
            nVar.b(this.i.getId());
            nVar.b(this.i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
            com.mbridge.msdk.foundation.same.report.g.d(nVar, getApplicationContext(), this.mUnitid);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str) {
        CampaignEx campaignEx = this.i;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
        nVar.n(this.i.getRequestId());
        nVar.o(this.i.getRequestIdNotice());
        nVar.b(this.i.getId());
        nVar.d(i2);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.o));
        nVar.g("");
        nVar.m(str);
        nVar.a("5");
        nVar.b(this.i.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.mUnitid, this.i);
    }

    class g implements com.mbridge.msdk.foundation.feedback.a {
        g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String str;
            MBInterstitialActivity.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("MBInterstitialActivity", th.getMessage(), th);
                str = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.j, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String str;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("MBInterstitialActivity", th.getMessage(), th);
                str = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.j, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String str2;
            MBInterstitialActivity.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str2 = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("MBInterstitialActivity", th.getMessage(), th);
                str2 = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBInterstitialActivity.this.j, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
        }
    }

    private void a(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getApplicationContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.mUnitid, str, mraidCampaign.isBidCampaign());
        }
    }
}
