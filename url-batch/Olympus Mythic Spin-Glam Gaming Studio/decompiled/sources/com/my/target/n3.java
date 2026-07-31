package com.my.target;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.my.target.n3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class n3 implements o3 {
    private static final g3 g = new g3() { // from class: com.my.target.n3$$ExternalSyntheticLambda3
        @Override // com.my.target.g3
        public final void accept(Object obj) {
            n3.a((Integer) obj);
        }
    };
    static final o3 h = new a();
    private static int i = 0;
    private final jg a;
    private final Handler b;
    private final m3 c;
    CustomTabsSession d;
    c e;
    CustomTabsServiceConnection f;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements o3 {
        a() {
        }

        @Override // com.my.target.o3
        public void a() {
        }

        @Override // com.my.target.o3
        public void a(Runnable runnable) {
        }

        @Override // com.my.target.o3
        public boolean a(p3 p3Var, Uri uri, w0 w0Var, Context context) {
            return false;
        }

        @Override // com.my.target.o3
        public void b() {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b extends CustomTabsServiceConnection {
        final /* synthetic */ Runnable a;

        b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            n3 n3Var = n3.this;
            n3Var.d = customTabsClient.newSession(n3Var.e);
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class c extends CustomTabsCallback {
        private final Handler a;
        private final Set b = new HashSet();
        private volatile g3 c = n3.g;

        c(Handler handler) {
            this.a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            this.c.accept(Integer.valueOf(i));
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(final int i, Bundle bundle) {
            if (this.b.contains(Integer.valueOf(i))) {
                return;
            }
            this.b.add(Integer.valueOf(i));
            this.a.post(new Runnable() { // from class: com.my.target.n3$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    n3.c.this.a(i);
                }
            });
        }

        void a(g3 g3Var) {
            this.c = g3Var;
        }
    }

    private n3(Handler handler, jg jgVar) {
        this.b = handler;
        this.a = jgVar;
        this.c = new m3((Application) jgVar.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Integer num) {
    }

    static int c() {
        try {
            mi.a("CustomTabsFacade: custom tabs found: " + CustomTabsCallback.class.getName());
            return 1;
        } catch (Throwable unused) {
            return 2;
        }
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, com.safedk.android.utils.h.r);
        p0.launchUrl(p1, p2);
    }

    @Override // com.my.target.o3
    public void b() {
        a();
        a(this.a, (Runnable) null);
    }

    public static o3 a(jg jgVar) {
        if (i == 0) {
            i = c();
        }
        if (jgVar != null && i == 1) {
            try {
                return new n3(o0.g, jgVar);
            } catch (Throwable unused) {
                return h;
            }
        }
        if (jgVar == null) {
            mi.a("CustomTabsFacade: sac==null");
        }
        return h;
    }

    @Override // com.my.target.o3
    public void a(Runnable runnable) {
        a();
        a(this.a, runnable);
    }

    @Override // com.my.target.o3
    public void a() {
        this.c.a();
        try {
            CustomTabsServiceConnection customTabsServiceConnection = this.f;
            if (customTabsServiceConnection != null) {
                this.a.a.unbindService(customTabsServiceConnection);
            }
            this.f = null;
            this.d = null;
            this.e = null;
        } catch (Throwable unused) {
            this.f = null;
            this.d = null;
            this.e = null;
        }
    }

    @Override // com.my.target.o3
    public boolean a(final p3 p3Var, Uri uri, w0 w0Var, Context context) {
        c cVar = this.e;
        CustomTabsSession customTabsSession = this.d;
        if (cVar != null && customTabsSession != null) {
            cVar.a(new g3() { // from class: com.my.target.n3$$ExternalSyntheticLambda0
                @Override // com.my.target.g3
                public final void accept(Object obj) {
                    n3.a(p3.this, (Integer) obj);
                }
            });
            m3 m3Var = this.c;
            Objects.requireNonNull(p3Var);
            m3Var.a(new Runnable() { // from class: com.my.target.n3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    p3.this.b();
                }
            }, new Runnable() { // from class: com.my.target.n3$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    p3.this.a();
                }
            });
            CustomTabsIntent build = new CustomTabsIntent.Builder(customTabsSession).build();
            if (Build.VERSION.SDK_INT >= 30 && (context instanceof Activity)) {
                Activity activity = (Activity) context;
                if (activity.isDestroyed() || activity.isFinishing()) {
                    context = context.getApplicationContext();
                }
            }
            if (!(context instanceof Activity)) {
                build.intent.addFlags(268435456);
            }
            try {
                safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(build, context, uri);
                return true;
            } catch (Throwable th) {
                w0Var.a(2, 7001, "cti, message=" + th.getMessage() + "\nurl=" + uri);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(p3 p3Var, Integer num) {
        int intValue = num.intValue();
        if (intValue == 2) {
            p3Var.d();
        } else {
            if (intValue != 3) {
                return;
            }
            p3Var.c();
        }
    }

    private void a(jg jgVar, Runnable runnable) {
        this.e = new c(this.b);
        this.f = new b(runnable);
        String packageName = CustomTabsClient.getPackageName(jgVar.a, null);
        if (packageName != null ? CustomTabsClient.bindCustomTabsService(jgVar.a, packageName, this.f) : false) {
            return;
        }
        this.e = null;
        this.f = null;
        this.d = null;
    }
}
