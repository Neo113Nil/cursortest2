package com.devanos.nilufar.usmonova.p7.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.devanos.nilufar.usmonova.R;
import com.devanos.nilufar.usmonova.p7.policy.Lc0Activity;
import java.util.Locale;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0778bU;
import o.AbstractC0896dH;
import o.AbstractC1305jX;
import o.AbstractC1473m3;
import o.C1101gP;
import o.C1233iP;
import o.InterfaceC1315jh;
import o.J4;
import o.UT;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/devanos/nilufar/usmonova/p7/ui/S0FrameActivity;", "Lo/J4;", "<init>", "()V", "", "raw", "", "shouldOpenReadOnlyPolicy", "(Ljava/lang/String;)Z", "Lo/bY;", "openReadOnlyPolicy", "isAllowedScheme", "openExternal", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Landroid/webkit/WebView;", "frame", "Landroid/webkit/WebView;", "Companion", "o/gP", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S0FrameActivity extends J4 {
    public static final int $stable = 8;
    public static final C1101gP Companion = new C1101gP();
    private static final String EXTRA_DEST = "x0d";
    private WebView frame;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAllowedScheme(String raw) {
        String str;
        try {
            String scheme = Uri.parse(raw).getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                AbstractC0048Bt.m(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (AbstractC0048Bt.h(str, AbstractC1473m3.f0(AbstractC1473m3.f(66, 43, 109, 3)))) {
                return true;
            }
            return AbstractC0048Bt.h(str, AbstractC1473m3.Y());
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openExternal(String raw) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(raw)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openReadOnlyPolicy() {
        Lc0Activity.Companion.getClass();
        Intent intent = new Intent(this, (Class<?>) Lc0Activity.class);
        intent.putExtra(Lc0Activity.EXTRA_READ_ONLY, true);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldOpenReadOnlyPolicy(String raw) {
        if (!AbstractC1305jX.A(raw)) {
            try {
                Uri parse = Uri.parse(raw);
                String scheme = parse.getScheme();
                if (scheme == null || !scheme.equalsIgnoreCase(AbstractC1473m3.Y())) {
                    return false;
                }
                if (!AbstractC0778bU.w(parse.getHost(), AbstractC1473m3.u())) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @Override // o.AbstractActivityC0446Rc, android.app.Activity
    @InterfaceC1315jh
    public void onBackPressed() {
        WebView webView = this.frame;
        if (webView == null) {
            AbstractC0048Bt.i0("frame");
            throw null;
        }
        if (!webView.canGoBack()) {
            super.onBackPressed();
            return;
        }
        WebView webView2 = this.frame;
        if (webView2 != null) {
            webView2.goBack();
        } else {
            AbstractC0048Bt.i0("frame");
            throw null;
        }
    }

    @Override // o.AbstractActivityC0199Ho, o.AbstractActivityC0446Rc, o.AbstractActivityC0420Qc, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s0_frame);
        String stringExtra = getIntent().getStringExtra(EXTRA_DEST);
        if (stringExtra == null || UT.J(stringExtra)) {
            finish();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.s0_root);
        WebView webView = new WebView(this);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMixedContentMode(1);
        this.frame = webView;
        viewGroup.addView(webView);
        WebView webView2 = this.frame;
        if (webView2 == null) {
            AbstractC0048Bt.i0("frame");
            throw null;
        }
        webView2.setWebViewClient(new C1233iP(this));
        AbstractC0896dH.d("S0Frame", "load begin");
        WebView webView3 = this.frame;
        if (webView3 != null) {
            webView3.loadUrl(stringExtra);
        } else {
            AbstractC0048Bt.i0("frame");
            throw null;
        }
    }
}
