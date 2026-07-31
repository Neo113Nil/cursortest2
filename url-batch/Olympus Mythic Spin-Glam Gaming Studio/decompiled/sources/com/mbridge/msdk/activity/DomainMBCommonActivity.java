package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes10.dex */
public class DomainMBCommonActivity extends Activity {
    String a = "";
    private final BrowserView.e b = new a();
    protected BrowserView browserView;
    private CampaignEx c;

    class a implements BrowserView.e {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageFinished(WebView webView, String str) {
            q0.b("MBCommonActivity", "onPageFinished  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.b("MBCommonActivity", "onPageStarted  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q0.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (u0.a.b(str) && u0.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.o);
        p0.startActivityForResult(p1, p2);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.o, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            q0.b("MBCommonActivity", th.getMessage());
        }
        if (c.n().d() == null) {
            c.n().b(getApplicationContext());
        }
        c.n().a(this);
        a();
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, "Error: no data", 0).show();
            return;
        }
        this.c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
        if (b.a.containsKey(this.a)) {
            BrowserView browserView = b.a.get(this.a);
            this.browserView = browserView;
            if (browserView != null) {
                browserView.setListener(this.b);
            }
        } else {
            BrowserView browserView2 = new BrowserView(this, this.c);
            this.browserView = browserView2;
            browserView2.setListener(this.b);
            this.browserView.loadUrl(this.a);
        }
        BrowserView browserView3 = this.browserView;
        if (browserView3 != null) {
            f1.a(browserView3);
            setContentView(this.browserView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00db A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0009, B:7:0x0010, B:9:0x001e, B:12:0x002a, B:15:0x0037, B:18:0x00d5, B:20:0x00db, B:22:0x00e4, B:24:0x00ea, B:26:0x00f0, B:31:0x0045, B:33:0x0050, B:35:0x0068, B:64:0x00ce, B:49:0x0097, B:69:0x0055, B:71:0x005f, B:38:0x0079, B:40:0x007f, B:43:0x008b, B:44:0x0090, B:68:0x0075, B:66:0x00a0, B:51:0x00a9, B:53:0x00af, B:55:0x00bd, B:59:0x00ca), top: B:2:0x0009, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0009, B:7:0x0010, B:9:0x001e, B:12:0x002a, B:15:0x0037, B:18:0x00d5, B:20:0x00db, B:22:0x00e4, B:24:0x00ea, B:26:0x00f0, B:31:0x0045, B:33:0x0050, B:35:0x0068, B:64:0x00ce, B:49:0x0097, B:69:0x0055, B:71:0x005f, B:38:0x0079, B:40:0x007f, B:43:0x008b, B:44:0x0090, B:68:0x0075, B:66:0x00a0, B:51:0x00a9, B:53:0x00af, B:55:0x00bd, B:59:0x00ca), top: B:2:0x0009, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(WebView webView, String str) {
        Intent parseUri;
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (!parse.getScheme().equals(SDKConstants.PARAM_INTENT)) {
                    if (parse.getScheme().equals("android-app")) {
                    }
                    if (!com.mbridge.msdk.click.c.d(this, str)) {
                        q0.b("MBCommonActivity", "openDeepLink");
                        finish();
                        return true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        return !(str.startsWith("http") || str.startsWith("https"));
                    }
                }
                String str3 = null;
                if (parse.getScheme().equals(SDKConstants.PARAM_INTENT)) {
                    parseUri = Intent.parseUri(str, 1);
                } else {
                    parseUri = parse.getScheme().equals("android-app") ? Intent.parseUri(str, 2) : null;
                }
                if (parseUri != null) {
                    parseUri.setComponent(null);
                    parseUri.setSelector(null);
                }
                if (parseUri == null) {
                    str2 = "";
                } else {
                    try {
                        str2 = parseUri.getPackage();
                    } catch (Throwable th) {
                        q0.b("MBCommonActivity", th.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    if (parseUri != null) {
                        parseUri.setFlags(268435456);
                    }
                    safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, parseUri, 0);
                    finish();
                    return true;
                }
                if (parseUri != null) {
                    try {
                        str3 = parseUri.getStringExtra("browser_fallback_url");
                    } catch (Throwable th2) {
                        q0.b("MBCommonActivity", th2.getMessage());
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    Uri parse2 = Uri.parse(str);
                    if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals("https")) {
                        str = str3;
                    }
                    MintegralNetworkBridge.webviewLoadUrl(webView, str3);
                    return false;
                }
                if (!com.mbridge.msdk.click.c.d(this, str)) {
                }
            }
            return false;
        } catch (Throwable th3) {
            q0.b("MBCommonActivity", th3.getMessage());
            return false;
        }
    }
}
