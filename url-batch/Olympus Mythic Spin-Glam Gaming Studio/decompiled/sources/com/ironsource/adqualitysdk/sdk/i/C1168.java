package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.יִ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1168 extends WebViewApp implements InterfaceC1111 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f2969;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1189 f2970;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebViewApp f2971;

    public C1168(C1011 c1011, WebViewApp webViewApp, C1189 c1189) {
        this.f2969 = c1011;
        this.f2971 = webViewApp;
        this.f2970 = c1189;
    }

    public final void addCallback(NativeCallback nativeCallback) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("dLn5S7VLF/xTrLV8uEoj3E+w+Xy/RQ==\n", "I9ybHdwuYL0=\n"), nativeCallback);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.addCallback(nativeCallback);
        }
    }

    public final NativeCallback getCallback(String str) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("iPJMXTk2FLCv5wBsNScgkLP7TGozOA==\n", "35cuC1BTY/E=\n"), str);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.getCallback(str);
        }
        return null;
    }

    public final Configuration getConfiguration() {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("WnB5h6rRXR59ZTW2psBpMGNzcra2xksrZHp1\n", "DRUb0cO0Kl8=\n"), new Object[0]);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.getConfiguration();
        }
        return null;
    }

    public final ErrorState getErrorStateFromWebAppCode() {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("1dqiyikOezryz+77JR9JCfDQss80CngexM2v8RcObjryz4PzJA4=\n", "gr/AnEBrDHs=\n"), new Object[0]);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.getErrorStateFromWebAppCode();
        }
        return null;
    }

    public final int getWebAppFailureCode() {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("RUr2N6JYAR1iX7oGrkkhOXBu5BGNXB8wZ13xIqRZEw==\n", "Ei+UYcs9dlw=\n"), new Object[0]);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.getWebAppFailureCode();
        }
        return 0;
    }

    public final String getWebAppFailureMessage() {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("A3wMr0PmX+4kaUCeT/d/yjZYHols4kHDIWsLtE/wW84zfA==\n", "VBlu+SqDKK8=\n"), new Object[0]);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.getWebAppFailureMessage();
        }
        return null;
    }

    public final WebView getWebView() {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("H6ubziXazHM4vtf/KcvsVyqYkP07\n", "SM75mEy/uzI=\n"), new Object[0]);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.getWebView();
        }
        return null;
    }

    public final boolean invokeCallback(Invocation invocation) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("HV2a5PPyRoE6SNbb9OFeqy97md729VCjIQ==\n", "Sjj4spqXMcA=\n"), invocation);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.invokeCallback(invocation);
        }
        return false;
    }

    public final boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("QSd0tSKh5w5mMjiKJbL/JHMPc5cjq/Q=\n", "FkIW40vEkE8=\n"), str, str2, method, Arrays.asList(objArr));
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.invokeMethod(str, str2, method, objArr);
        }
        return false;
    }

    public final boolean isWebAppInitialized() {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("AZdaBY1y2pEmghY6l0DIsheCSBqKftm5N55RKYFz\n", "VvI4U+QXrdA=\n"), new Object[0]);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.isWebAppInitialized();
        }
        return false;
    }

    public final boolean isWebAppLoaded() {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("SZt7iIYh7VNujje3nBP/cF+OaZKAJf53eg==\n", "Hv4Z3u9EmhI=\n"), new Object[0]);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.isWebAppLoaded();
        }
        return false;
    }

    public final void removeCallback(NativeCallback nativeCallback) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("R+dI6+wTbApg8gTP4Bt0PXXBS9HpFHooew==\n", "EIIqvYV2G0s=\n"), nativeCallback);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.removeCallback(nativeCallback);
        }
    }

    public final void resetWebViewAppInitialization() {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("XLDlFU1Am6J7pakxQVaJl1yw5RVNQJuie6XOLU1RhYJnvP0iUEyDjQ==\n", "C9WHQyQl7OM=\n"), new Object[0]);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.resetWebViewAppInitialization();
        }
    }

    public final boolean sendEvent(Enum r5, Enum r6, Object... objArr) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("+MBtael5FJHf1SFM5XIHldnAYUs=\n", "r6UPP4AcY9A=\n"), r5, r6, Arrays.asList(objArr));
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            return webViewApp.sendEvent(r5, r6, objArr);
        }
        return false;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("HvJS5YtTN6o55x7Ah0IDhCfxWdSXRCGfIPhe\n", "SZcws+I2QOs=\n"), configuration);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.setConfiguration(configuration);
        }
    }

    public final void setWebAppFailureCode(int i) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("zEI5DtnyWD3rV3Ur1eN4GflmKyj29kYQ7lU+G9/zSg==\n", "mydbWLCXL3w=\n"), Integer.valueOf(i));
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.setWebAppFailureCode(i);
        }
    }

    public final void setWebAppFailureMessage(String str) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("brL2wCDU3eFJp7rlLMX9xVuW5OYP0MPMTKXx2yzC2cFesg==\n", "OdeUlkmxqqA=\n"), str);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.setWebAppFailureMessage(str);
        }
    }

    public final void setWebAppInitialized(boolean z) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("v+/49PqBBKiY+rTR9pAkjIrL6tLaihqdgev2y+mBFw==\n", "6IqaopPkc+k=\n"), Boolean.valueOf(z));
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.setWebAppInitialized(z);
        }
    }

    public final void setWebAppLoaded(boolean z) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("sYKNyOwDhjSWl8Ht4BKmEISmn+7JCZARg4M=\n", "5ufvnoVm8XU=\n"), Boolean.valueOf(z));
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.setWebAppLoaded(z);
        }
    }

    public final void setWebView(WebView webView) {
        this.f2969.m4103(this, this.f2970, StringFog.decrypt("luqbbY8lLD+x/9dIgzQMG6PZkF6R\n", "wY/5O+ZAW34=\n"), webView);
        WebViewApp webViewApp = this.f2971;
        if (webViewApp != null) {
            webViewApp.setWebView(webView);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this.f2971;
    }
}
