package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˈ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0481 extends WebChromeClient implements InterfaceC1077 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebChromeClient f383;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f382 = StringFog.decrypt("vIyfc3nycVqOqpFZdO5qc46KkkJw9HFF\n", "6+n9MBGAHjc=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f381 = StringFog.decrypt("xwz7SCffYJPFDdh6N/14kc8E6lw513WN1A==\n", "oGmPH1W+EOM=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f380 = StringFog.decrypt("qbMmJ68/L0eNviAcoA0JSaezPAc=\n", "ztZSc81oSiU=\n");

    public C0481(WebChromeClient webChromeClient) {
        this.f383 = webChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        try {
            this.f383.getDefaultVideoPoster();
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("WK7O3vE0JDw9sejTz30+Jniy2cOjcygmWbna0PZ4OQR0uNne03s+Jniu\n", "Hdy8sYMUTVI=\n"), th, false);
        }
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        try {
            this.f383.getVideoLoadingProgressView();
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("CxN8I3rWfz5uDFouRJ9lJCsPaz4okXMkGAhqKWe6eTEqCGArWIR5NzwEfT9en3Mn\n", "TmEOTAj2FlA=\n"), th, false);
        }
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback valueCallback) {
        try {
            this.f383.getVisitedHistory(valueCallback);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("VqLGb8RjakszveBi+ipwUXa+0XKWJGZRRbnHacImZ216o8BvxDo=\n", "E9C0ALZDAyU=\n"), th, false);
        }
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        try {
            this.f383.onCloseWindow(webView);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("tc8JdMubEQjQ0C959dILEpXTHmmZ1BYlnNIIfu7SFgKfyg==\n", "8L17G7m7eGY=\n"), th, false);
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        try {
            this.f383.onConsoleMessage(str, i, str2);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("sr+A6jXucmHXoKbnC6doe5Kjl/dnoXVMmKOB6iurVmqEvpPiIg==\n", "983yhUfOGw8=\n"), th, false);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ˈ;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z");
        boolean m4015safedk__onCreateWindow_aecd9d9531d58246934303cc26ac7c52 = m4015safedk__onCreateWindow_aecd9d9531d58246934303cc26ac7c52(webView, z, z2, message);
        BrandSafetyUtils.onWebChromeClientCreateWindow(com.safedk.android.utils.h.f, webView, message, m4015safedk__onCreateWindow_aecd9d9531d58246934303cc26ac7c52);
        return m4015safedk__onCreateWindow_aecd9d9531d58246934303cc26ac7c52;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        try {
            this.f383.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("MQTFJ1EAZ1NUG+Mqb0l9SREY0joDT2B4DBXSLUdFankVAtYqQlNrbAEZwyk=\n", "dHa3SCMgDj0=\n"), th, false);
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        try {
            this.f383.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("0rYeEUXVR2+3qTgce5xddfKqCQwXmkBG8qsAEVSUWmj4qjwbRZhHcuStAxBEvUdl8pQeEVqFWg==\n", "l8Rsfjf1LgE=\n"), th, false);
        }
        super.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        try {
            this.f383.onGeolocationPermissionsShowPrompt(str, callback);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("ga+ujb9ZSKvksIiAgRBSsaGzuZDtFk+CobKwja4YVayrs4yHvxRItre0s4y+Kkmqs42ujaAJVQ==\n", "xN3c4s15IcU=\n"), th, false);
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        try {
            this.f383.onHideCustomView();
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("fVwrAqEJYoMYQw0Pn0B4mV1APB/zRmWlUUo8LqZaf4JVeDAIpA==\n", "OC5ZbdMpC+0=\n"), th, false);
        }
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f383.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("bHgFn+foPv4JZyOS2aEk5ExkEoK1pznaWksblee8\n", "KQp38JXIV5A=\n"), th, false);
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f383.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("Z9KxV0sN4gUCzZdadUT4H0fOpkoZQuUhUeKmXlZf7j5MzKxZXQ==\n", "IqDDODkti2s=\n"), th, false);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f383.onJsConfirm(webView, str, str2, jsResult);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("+QcPNlRC2pKcGCk7agvAiNkbGCsGDd22zzYSN0ALwZE=\n", "vHV9WSZis/w=\n"), th, false);
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            this.f383.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("wXQvwZbPgDCkawnMqIaaKuFoONzEgIcU91YvwYmfnQ==\n", "hAZdruTv6V4=\n"), th, false);
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        try {
            this.f383.onJsTimeout();
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("aOfLuzmefAEN+O22B9dmG0j73KZr0XslXsHQuS7RYBs=\n", "LZW51Eu+FW8=\n"), th, false);
        }
        return super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        try {
            this.f383.onProgressChanged(webView, i);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("RPzxcLUjtlYh49d9i2qsTGTg5m3nbLFoc+HkbaJwrHtp7+14omc=\n", "AY6DH8cD3zg=\n"), th, false);
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        try {
            this.f383.onReceivedIcon(webView, bitmap);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("DdRDL0h2ZUpoy2Uidj9/UC3IVDIaOWJ2LcVUKUwzaG0ryV8=\n", "SKYxQDpWDCQ=\n"), th, false);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        try {
            this.f383.onReceivedTitle(webView, str);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("x5JezsyTyQiijXjD8trTEueOSdOe3M4054NJyMjWxDLrlEDE\n", "guAsob6zoGY=\n"), th, false);
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        try {
            this.f383.onReceivedTouchIconUrl(webView, str, z);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("tBLSe4cU0Z/RDfR2uV3LhZQOxWbVW9ajlAPFfYNR3KWeFcN8vFfXn6QSzA==\n", "8WCgFPU0uPE=\n"), th, false);
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        try {
            this.f383.onRequestFocus(webView);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("WBJewO+min49DXjN0e+QZHgOSd296Y1CeBFZyu7ypX9+FV8=\n", "HWAsr52G4xA=\n"), th, false);
        }
        super.onRequestFocus(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f383.onShowCustomView(view, customViewCallback);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("x2nWdGbkgn2idvB5WK2YZ+d1wWk0q4VA6nTTWGG3n3zvTc1+Yw==\n", "ghukGxTE6xM=\n"), th, false);
        }
        super.onShowCustomView(view, customViewCallback);
    }

    /* renamed from: safedk_ˈ_onCreateWindow_aecd9d9531d58246934303cc26ac7c52, reason: contains not printable characters */
    public boolean m4015safedk__onCreateWindow_aecd9d9531d58246934303cc26ac7c52(WebView p0, boolean p1, boolean p2, Message p3) {
        try {
            this.f383.onCreateWindow(p0, p1, p2, p3);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("ND3d/465ViNRIvvysPBMORQhyuLc9lEOAyrO5JnOViMVINg=\n", "cU+vkPyZP00=\n"), th, false);
        }
        return super.onCreateWindow(p0, p1, p2, p3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[RETURN] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1077
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4016(C0880 c0880, String str, ArrayList arrayList, C1189 c1189, C0785 c0785) {
        int hashCode;
        char c;
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            AbstractC0844.m4219(c0880.m4231(), AbstractC1293.m4543("Iw==\n", "BMdbKA9xYpE=\n", AbstractC0446.m4006("okQdfS1oWKyOWgoyOjBKp5JCBnw4aHihhXUHYDAlSoeLXwp8KwxKp4hEDmYwOg+qhkIGZDpoQqGT\nXgB2f28=\n", "5zZvEl9IL8Q=\n", new StringBuilder(), str)), e, null);
        }
        if (hashCode != 1395849045) {
            if (hashCode == 1442029578 && str.equals(f381)) {
                c = 0;
                if (c != 0) {
                    return null;
                }
                if (c == 1) {
                    return this.f383;
                }
                new C0789(c0880, c0785, f382, str).m4002(c0880.m4231());
                return null;
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals(f380)) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            this.f383.onPermissionRequest(permissionRequest);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("LTU1M6l5xARIKhM+lzDeHg0pIi77NsM6DTUqNagqxAUGFSItrjzeHg==\n", "aEdHXNtZrWo=\n"), th, false);
        }
        try {
            super.onPermissionRequest(permissionRequest);
        } catch (Throwable th2) {
            AbstractC0577.m4068(f382, StringFog.decrypt("5Q1oBaFaN2qAHHsGvxMwY4AQaAO0EzAkzxFKD6EXN3fTFnUEgR8vccUMbg==\n", "oH8aatN6XgQ=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            this.f383.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("veMq0qwfN1jY/AzfklYtQp3/Pc/+UDBmneM11K1MN1mWwz3Mq1otQrvwNt67UztS\n", "+JFYvd4/XjY=\n"), th, false);
        }
        try {
            super.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th2) {
            AbstractC0577.m4068(f382, StringFog.decrypt("5/bXV7cMXoeC58RUqUVZjoLr11GiRVnJzer1XbdBXprR7cpWl0lGnMf30XukQlSMzuHB\n", "ooSlOMUsN+k=\n"), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        try {
            this.f383.onShowFileChooser(webView, valueCallback, fileChooserParams);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("KnEBjwKfw85PbieCPNbZ1AptFpJQ0MTzB2wEphnTz+MHbByTFc0=\n", "bwNz4HC/qqA=\n"), th, false);
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            this.f383.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("i28mY9s4oTTucABu5XG7LqtzMX6Jd6YZoXMnY8V9hT+9bjVrzA==\n", "zh1UDKkYyFo=\n"), th, false);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f383.onShowCustomView(view, i, customViewCallback);
        } catch (Throwable th) {
            AbstractC0577.m4068(f382, StringFog.decrypt("StMccE8NKDIvzDp9cUQyKGrPC20dQi8PZ84ZXEheNTNi9wd6Sg==\n", "D6FuHz0tQVw=\n"), th, false);
        }
        super.onShowCustomView(view, i, customViewCallback);
    }
}
