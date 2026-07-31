package com.mbridge.msdk.mbbanner.common.communication;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class BannerExpandDialog extends Dialog {
    private final String a;
    private String b;
    private boolean c;
    private FrameLayout d;
    private WindVaneWebView e;
    private TextView f;
    private String g;
    private List<CampaignEx> h;
    private com.mbridge.msdk.mbbanner.common.listener.a i;
    private com.mbridge.msdk.mbsignalcommon.mraid.b j;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BannerExpandDialog.this.dismiss();
        }
    }

    class b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        class a implements ValueCallback<String> {
            a() {
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new a());
            BannerExpandDialog.this.c();
        }
    }

    class c implements com.mbridge.msdk.foundation.feedback.a {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BannerExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BannerExpandDialog.this.a();
        }
    }

    class d implements DialogInterface.OnDismissListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (BannerExpandDialog.this.i != null) {
                BannerExpandDialog.this.i.a(false);
            }
            MintegralNetworkBridge.webviewLoadDataWithBaseURL(BannerExpandDialog.this.e, null, "", POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
            BannerExpandDialog.this.d.removeView(BannerExpandDialog.this.e);
            BannerExpandDialog.this.e.release();
            BannerExpandDialog.this.e = null;
            BannerExpandDialog.this.i = null;
        }
    }

    class e implements com.mbridge.msdk.mbsignalcommon.mraid.b {
        e() {
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, h.o);
            p0.startActivity(p1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void close() {
            BannerExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void expand(String str, boolean z) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public CampaignEx getMraidCampaign() {
            return null;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void open(String str) {
            try {
                if (BannerExpandDialog.this.e == null || System.currentTimeMillis() - BannerExpandDialog.this.e.lastTouchTime <= com.mbridge.msdk.click.utils.a.d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) BannerExpandDialog.this.h.get(0), BannerExpandDialog.this.e.getUrl(), com.mbridge.msdk.click.utils.a.a)) {
                    q0.b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.h.size() > 1) {
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(com.mbridge.msdk.foundation.controller.c.n().d(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.i != null) {
                        BannerExpandDialog.this.i.a(true, str);
                    }
                }
            } catch (Throwable th) {
                q0.b("BannerExpandDialog", "open", th);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z) {
            try {
                BannerExpandDialog.this.f.setVisibility(z ? 4 : 0);
            } catch (Throwable th) {
                q0.b("BannerExpandDialog", "useCustomClose", th);
            }
        }
    }

    public BannerExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        super(context);
        this.a = "BannerExpandDialog";
        this.j = new e();
        if (bundle != null) {
            this.b = bundle.getString("url");
            this.c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.i = aVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        b();
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.g = str;
        this.h = list;
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d.addView(this.e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        this.f.setVisibility(this.c ? 4 : 0);
        this.f.setOnClickListener(new a());
        BitmapDrawable a2 = com.mbridge.msdk.foundation.controller.c.n().a(this.g, l.g);
        if (a2 != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, a2, this.d.getResources().getDisplayMetrics());
            this.d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.d.addView(this.f);
        setContentView(this.d);
        a();
        this.e.setWebViewListener(new b());
        this.e.setObject(this.j);
        MintegralNetworkBridge.webviewLoadUrl(this.e, this.b);
        List<CampaignEx> list = this.h;
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = this.h.get(0);
            if (campaignEx != null) {
                b1.a(this.e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.d.addView(mBAdChoice, layoutParams2);
            }
        }
        setOnDismissListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            int i = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(X3.i.n, i == 2 ? "landscape" : i == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float n = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float m = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap v = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int intValue = ((Integer) v.get("width")).intValue();
            int intValue2 = ((Integer) v.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", "Interstitial");
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            this.e.getLocationInWindow(new int[2]);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.e, r0[0], r0[1], r11.getWidth(), this.e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.e, r0[0], r0[1], r5.getWidth(), this.e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.e, n, m);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.e, intValue, intValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.e, hashMap);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.e);
        } catch (Throwable th) {
            q0.b("BannerExpandDialog", "notifyMraid", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }
}
