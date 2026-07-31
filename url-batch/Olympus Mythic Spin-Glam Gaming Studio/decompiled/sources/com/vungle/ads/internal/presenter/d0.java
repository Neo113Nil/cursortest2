package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class d0 extends Lambda implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ i3 c;
    public final /* synthetic */ com.vungle.ads.internal.load.e d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ f0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, h0 h0Var, i3 i3Var, com.vungle.ads.internal.load.e eVar, Long l, String str, String str2, f0 f0Var) {
        super(0);
        this.a = context;
        this.b = h0Var;
        this.c = i3Var;
        this.d = eVar;
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f3  */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4828invoke() {
        Object m8023constructorimpl;
        Throwable m8026exceptionOrNullimpl;
        WebView webView;
        com.vungle.ads.internal.ui.z zVar;
        boolean z;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        ReentrantLock reentrantLock = e0.a;
        Context context = this.a;
        h0 h0Var = this.b;
        i3 i3Var = this.c;
        com.vungle.ads.internal.load.e eVar = this.d;
        Long l = this.e;
        String str = this.f;
        String str2 = this.g;
        f0 f0Var = this.h;
        try {
            Result.Companion companion = Result.INSTANCE;
            webView = new WebView(context.getApplicationContext());
            com.vungle.ads.internal.platform.g.a(webView, f0Var);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            zVar = new com.vungle.ads.internal.ui.z(h0Var, i3Var, ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) LazyKt.lazy(lazyThreadSafetyMode, new b0(context)).getValue())).f(), (com.vungle.ads.internal.platform.f) LazyKt.lazy(lazyThreadSafetyMode, new c0(context)).getValue(), eVar, l);
            ConfigManager.INSTANCE.getClass();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (ConfigManager.k()) {
            PrivacyManager.INSTANCE.getClass();
            if (Intrinsics.areEqual("unknown", PrivacyManager.b())) {
                z = true;
                zVar.a(z, ConfigManager.j(), ConfigManager.i(), ConfigManager.g(), ConfigManager.h());
                webView.setWebViewClient(zVar);
                LiftoffMonetizeNetworkBridge.webviewLoadUrl(webView, str);
                linkedHashMap = e0.b;
                linkedHashMap.put(String.valueOf(str2), new a0(zVar, webView));
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT;
                linkedHashMap2 = e0.b;
                AnalyticsClient.a(analyticsClient, sDKMetricType, linkedHashMap2.size(), h0Var.q(), null, 8);
                boolean z2 = com.vungle.ads.internal.util.u.a;
                StringBuilder sb = new StringBuilder();
                sb.append("Preload complete. Cache size: ");
                linkedHashMap3 = e0.b;
                sb.append(linkedHashMap3.size());
                m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(com.vungle.ads.internal.util.t.a("WebViewManager", sb.toString())));
                com.vungle.ads.internal.load.e eVar2 = this.d;
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    boolean z3 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("WebViewManager", "Preload webview failed", m8026exceptionOrNullimpl);
                    eVar2.b();
                }
                return Unit.INSTANCE;
            }
        }
        z = false;
        zVar.a(z, ConfigManager.j(), ConfigManager.i(), ConfigManager.g(), ConfigManager.h());
        webView.setWebViewClient(zVar);
        LiftoffMonetizeNetworkBridge.webviewLoadUrl(webView, str);
        linkedHashMap = e0.b;
        linkedHashMap.put(String.valueOf(str2), new a0(zVar, webView));
        AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
        Sdk.SDKMetric.SDKMetricType sDKMetricType2 = Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT;
        linkedHashMap2 = e0.b;
        AnalyticsClient.a(analyticsClient2, sDKMetricType2, linkedHashMap2.size(), h0Var.q(), null, 8);
        boolean z22 = com.vungle.ads.internal.util.u.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preload complete. Cache size: ");
        linkedHashMap3 = e0.b;
        sb2.append(linkedHashMap3.size());
        m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(com.vungle.ads.internal.util.t.a("WebViewManager", sb2.toString())));
        com.vungle.ads.internal.load.e eVar22 = this.d;
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
