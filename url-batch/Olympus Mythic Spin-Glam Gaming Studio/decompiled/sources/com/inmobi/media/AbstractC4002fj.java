package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: com.inmobi.media.fj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4002fj {
    public static Context a = null;
    public static String b = "";
    public static String c;
    public static final AtomicBoolean d;
    public static final Lazy e;
    public static boolean f;
    public static final ExecutorService g;
    public static final CoroutineScope h;
    public static int i;

    static {
        String name = AbstractC4002fj.class.getSimpleName();
        d = new AtomicBoolean();
        e = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.fj$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return AbstractC4002fj.a();
            }
        });
        Intrinsics.checkNotNullExpressionValue(name, "TAG");
        Intrinsics.checkNotNullParameter(name, "name");
        ExecutorService COMPONENT_SERVICE = Executors.newSingleThreadExecutor(new M9(name, false));
        g = COMPONENT_SERVICE;
        Intrinsics.checkNotNullExpressionValue(COMPONENT_SERVICE, "COMPONENT_SERVICE");
        h = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(COMPONENT_SERVICE));
    }

    public static final Kc a() {
        return new Kc();
    }

    public static String b(Context context) {
        Context applicationContext;
        String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e2) {
                try {
                    throw new C4505yl(e2.getMessage());
                } catch (C4505yl e3) {
                    Intrinsics.checkNotNullExpressionValue("fj", "TAG");
                    e3.getMessage();
                    Lazy lazy = AbstractC3861aa.a;
                    AbstractC3861aa.a(new Q2(e3));
                    try {
                        String property = System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        Intrinsics.checkNotNullExpressionValue("fj", "TAG");
                    } catch (Exception e4) {
                        Intrinsics.checkNotNullExpressionValue("fj", "TAG");
                        e4.getMessage();
                        Intrinsics.checkNotNullExpressionValue("fj", "TAG");
                        Lazy lazy2 = AbstractC3861aa.a;
                        AbstractC4361t9.a(e4);
                    }
                    return str;
                } catch (Exception e5) {
                    Intrinsics.checkNotNullExpressionValue("fj", "TAG");
                    e5.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        Intrinsics.checkNotNull(defaultUserAgent);
        return defaultUserAgent;
    }

    public static final String c() {
        if (b.length() == 0) {
            b = b(a);
        }
        return b;
    }

    public static boolean c(Context context) {
        return true;
    }

    public static final boolean d() {
        return i == 2;
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            AbstractC3884b7.a(new File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("fj", "TAG");
            e2.getMessage();
        }
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public static String b() {
        Context context = a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a2 = Pa.a(context, "coppa_store");
        Intrinsics.checkNotNullParameter("im_accid", "key");
        return a2.a.getString("im_accid", null);
    }
}
