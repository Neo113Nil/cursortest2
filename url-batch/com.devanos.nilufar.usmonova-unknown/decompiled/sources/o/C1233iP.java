package o;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.devanos.nilufar.usmonova.p7.ui.S0FrameActivity;
import java.util.Locale;

/* renamed from: o.iP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233iP extends WebViewClient {
    public final /* synthetic */ S0FrameActivity a;

    public C1233iP(S0FrameActivity s0FrameActivity) {
        this.a = s0FrameActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        Uri parse;
        String str3;
        String Y;
        String host;
        boolean shouldOpenReadOnlyPolicy;
        super.onPageFinished(webView, str);
        S0FrameActivity s0FrameActivity = this.a;
        if (str != null) {
            shouldOpenReadOnlyPolicy = s0FrameActivity.shouldOpenReadOnlyPolicy(str);
            if (shouldOpenReadOnlyPolicy) {
                s0FrameActivity.openReadOnlyPolicy();
                return;
            }
        }
        if (str != null && !UT.J(str) && !str.equalsIgnoreCase(AbstractC1473m3.f0(AbstractC1473m3.f(75, 61, 118, 6, 56, 171, 92, 10, 75, 49, 114))) && !AbstractC1305jX.A(str)) {
            try {
                parse = Uri.parse(str);
                String scheme = parse.getScheme();
                if (scheme != null) {
                    str3 = scheme.toLowerCase(Locale.ROOT);
                    AbstractC0048Bt.m(str3, "toLowerCase(...)");
                } else {
                    str3 = null;
                }
                Y = AbstractC1473m3.Y();
            } catch (Exception unused) {
            }
            if ((AbstractC0048Bt.h(str3, AbstractC1473m3.f0(AbstractC1473m3.f(66, 43, 109, 3))) || AbstractC0048Bt.h(str3, Y)) && (host = parse.getHost()) != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                AbstractC0048Bt.m(lowerCase, "toLowerCase(...)");
                if (!UT.E(lowerCase, "firebaseio.com") && !UT.E(lowerCase, "firebasedatabase.app") && !lowerCase.equals(AbstractC1473m3.u())) {
                    str2 = parse.buildUpon().fragment(null).build().toString();
                    if (str2 == null) {
                        AbstractC0868ct.H(PX.S(s0FrameActivity), null, null, new C1167hP(str2, null), 3);
                        return;
                    }
                    return;
                }
            }
        }
        str2 = null;
        if (str2 == null) {
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String uri;
        boolean shouldOpenReadOnlyPolicy;
        boolean isAllowedScheme;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (uri = url.toString()) != null) {
            S0FrameActivity s0FrameActivity = this.a;
            shouldOpenReadOnlyPolicy = s0FrameActivity.shouldOpenReadOnlyPolicy(uri);
            if (shouldOpenReadOnlyPolicy) {
                s0FrameActivity.openReadOnlyPolicy();
                return true;
            }
            isAllowedScheme = s0FrameActivity.isAllowedScheme(uri);
            if (!isAllowedScheme) {
                s0FrameActivity.openExternal(uri);
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean shouldOpenReadOnlyPolicy;
        boolean isAllowedScheme;
        if (str == null) {
            return false;
        }
        S0FrameActivity s0FrameActivity = this.a;
        shouldOpenReadOnlyPolicy = s0FrameActivity.shouldOpenReadOnlyPolicy(str);
        if (shouldOpenReadOnlyPolicy) {
            s0FrameActivity.openReadOnlyPolicy();
            return true;
        }
        isAllowedScheme = s0FrameActivity.isAllowedScheme(str);
        if (isAllowedScheme) {
            return false;
        }
        s0FrameActivity.openExternal(str);
        return true;
    }
}
