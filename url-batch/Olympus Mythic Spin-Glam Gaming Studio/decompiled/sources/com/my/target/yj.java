package com.my.target;

import android.webkit.JavascriptInterface;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class yj {
    private final zj a;

    public yj(zj zjVar) {
        this.a = zjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.a.a(dk.a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.a.a(dk.b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        this.a.a(dk.c(str));
    }

    @JavascriptInterface
    public void VKWebAppClose(@Nullable String str) {
        final zj zjVar = this.a;
        Objects.requireNonNull(zjVar);
        o0.e(new Runnable() { // from class: com.my.target.yj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                zj.this.a();
            }
        });
    }

    @JavascriptInterface
    public void VKWebAppCopyText(@Nullable final String str) {
        o0.e(new Runnable() { // from class: com.my.target.yj$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                yj.this.a(str);
            }
        });
    }

    @JavascriptInterface
    public void VKWebAppGetCustomSdkUserInfo(@Nullable final String str) {
        o0.e(new Runnable() { // from class: com.my.target.yj$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                yj.this.b(str);
            }
        });
    }

    @JavascriptInterface
    public void VKWebAppInit(@Nullable String str) {
        mi.b("WebFormBridgeHandler", "App has been initialized");
    }

    @JavascriptInterface
    public void VKWebAppSetViewSettings(@Nullable final String str) {
        o0.e(new Runnable() { // from class: com.my.target.yj$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                yj.this.c(str);
            }
        });
    }
}
