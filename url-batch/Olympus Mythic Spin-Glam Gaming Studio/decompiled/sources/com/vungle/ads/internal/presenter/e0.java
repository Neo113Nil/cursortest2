package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class e0 {
    public static final ReentrantLock a = new ReentrantLock();
    public static final LinkedHashMap b = new LinkedHashMap();

    public static void a(Context context, h0 adv, i3 placement, String templatePath, f0 f0Var, com.vungle.ads.internal.load.e delegate, Long l) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adv, "adv");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(templatePath, "templatePath");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder sb = new StringBuilder();
            sb.append("Preload webview start. Cache size: ");
            LinkedHashMap linkedHashMap = b;
            sb.append(linkedHashMap.size());
            com.vungle.ads.internal.util.t.a("WebViewManager", sb.toString());
            String h = adv.h();
            if (!linkedHashMap.containsKey(h)) {
                Handler handler = com.vungle.ads.internal.util.y.a;
                com.vungle.ads.internal.util.y.a(new d0(context, adv, placement, delegate, l, templatePath, h, f0Var));
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static WebView a(Context context, String str) {
        WebView webView;
        Intrinsics.checkNotNullParameter(context, "context");
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = b;
            a0 a0Var = (a0) linkedHashMap.get(str);
            if (a0Var != null) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = a0Var.a();
            } else {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            reentrantLock.unlock();
            return webView;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static com.vungle.ads.internal.ui.z a(h0 advertisement, i3 placement, com.vungle.ads.internal.executor.j offloadExecutor, com.vungle.ads.internal.platform.f platform) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        Intrinsics.checkNotNullParameter(platform, "platform");
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            a0 a0Var = (a0) b.get(advertisement.h());
            com.vungle.ads.internal.ui.z b2 = a0Var != null ? a0Var.b() : null;
            if (b2 == null) {
                b2 = new com.vungle.ads.internal.ui.z(advertisement, placement, offloadExecutor, platform);
            }
            reentrantLock.unlock();
            return b2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            b.remove(key);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
