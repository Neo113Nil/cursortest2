package com.vungle.ads.internal;

import android.content.Context;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class w2 {
    public AtomicBoolean a = new AtomicBoolean(false);
    public AtomicBoolean b = new AtomicBoolean(false);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final n2 d = new n2(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    public final void a(final Context context, final String appId, InitializationListener initializationCallback) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationCallback, "initializationCallback");
        AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (com.vungle.ads.internal.util.s) null, 6);
        this.d.e();
        this.c.add(initializationCallback);
        if (!StringsKt.isBlank(appId)) {
            for (int i = 0; i < appId.length(); i++) {
                char charAt = appId.charAt(i);
                if (Character.isLetterOrDigit(charAt) || charAt == '.') {
                }
            }
            if (com.vungle.ads.internal.util.z.a()) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.b("VungleInitializer", "Init: SDK is supported only for API versions 25 and above.");
                a(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
                return;
            }
            ConfigManager.INSTANCE.getClass();
            ConfigManager.b(appId);
            if (this.a.get()) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "init already complete");
                b();
                return;
            } else if (this.b.getAndSet(true)) {
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "init already in progress");
                return;
            } else {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
                Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new r2(context));
                final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, new s2(context));
                ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) lazy.getValue())).b().a(new Runnable() { // from class: com.vungle.ads.internal.w2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        w2.a(w2.this, context, appId, lazy2);
                    }
                }, new Runnable() { // from class: com.vungle.ads.internal.w2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        w2.a(w2.this);
                    }
                });
                return;
            }
        }
        a(new InvalidAppId("App id invalid: " + appId + ", package name: " + context.getPackageName()).logError$vungle_ads_release());
    }

    public final void b() {
        this.b.set(false);
        this.d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.d.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.d, (com.vungle.ads.internal.util.s) null, 6);
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onSuccess ");
        a.append(Thread.currentThread().getId());
        com.vungle.ads.internal.util.t.a("VungleInitializer", a.toString());
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new v2(this));
    }

    public static final void a(w2 this$0, Context context, String appId, Lazy vungleApiClient$delegate) {
        com.vungle.ads.internal.task.f a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(vungleApiClient$delegate, "$vungleApiClient$delegate");
        this$0.getClass();
        boolean z = false;
        boolean z2 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean z3 = ContextCompat.checkSelfPermission(context, "android.permission.INTERNET") == 0;
        if (!z2 || !z3) {
            boolean z4 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("VungleInitializer", "Network permissions not granted");
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new t2(this$0));
            return;
        }
        PrivacyManager.INSTANCE.a(context);
        ((VungleApiClient) vungleApiClient$delegate.getValue()).c(appId);
        try {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new o2(context));
            ConfigManager configManager = ConfigManager.INSTANCE;
            FilePreferences filePreferences = (FilePreferences) lazy.getValue();
            configManager.getClass();
            com.vungle.ads.internal.model.v2 a2 = ConfigManager.a(filePreferences, appId);
            if (a2 != null) {
                configManager.a(context, a2, true, null);
                z = true;
            }
            this$0.a.set(true);
            this$0.b();
            boolean z5 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleInitializer", "Running cleanup jobs. " + Thread.currentThread().getId());
            com.vungle.ads.internal.task.h hVar = (com.vungle.ads.internal.task.h) LazyKt.lazy(lazyThreadSafetyMode, new p2(context)).getValue();
            a = com.vungle.ads.internal.task.a.a(null);
            ((com.vungle.ads.internal.task.s) hVar).a(a);
            if (z) {
                return;
            }
            ConfigManager.a(context, q2.a);
        } catch (Throwable th) {
            boolean z6 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleInitializer", "Cannot get config", th);
        }
    }

    public static final void a(w2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    public final void a(VungleError vungleError) {
        this.b.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Exception code is ");
            a.append(vungleError.getCode());
            localizedMessage = a.toString();
        }
        this.d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.d.d();
        AnalyticsClient.INSTANCE.a(this.d, (com.vungle.ads.internal.util.s) null, localizedMessage);
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new u2(this, vungleError));
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", localizedMessage);
    }

    public final void a() {
        synchronized (ServiceLocator.d) {
            ServiceLocator.INSTANCE = null;
        }
        Json json = VungleApiClient.n;
        com.vungle.ads.internal.network.d0.a = com.vungle.ads.internal.network.d0.a();
        this.a.set(false);
        this.b.set(false);
        this.c.clear();
    }

    public final void a(String integrationName, String version) {
        String str;
        Intrinsics.checkNotNullParameter(integrationName, "integrationName");
        Intrinsics.checkNotNullParameter(version, "version");
        if (StringsKt.isBlank(integrationName)) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("VungleInitializer", "integrationName is empty");
            return;
        }
        String d = com.vungle.ads.internal.network.d0.d();
        if (StringsKt.isBlank(version)) {
            str = "";
        } else {
            str = '/' + version;
        }
        String a = com.iab.omid.library.vungle.d.a(integrationName, str);
        if (StringsKt.contains$default((CharSequence) d, (CharSequence) a, false, 2, (Object) null)) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "Wrapper info already set");
            return;
        }
        com.vungle.ads.internal.network.d0.c(d + ';' + a);
        if (this.a.get()) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
