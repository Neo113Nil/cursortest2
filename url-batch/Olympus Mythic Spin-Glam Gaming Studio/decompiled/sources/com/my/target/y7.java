package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.view.Window;
import android.widget.FrameLayout;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.MyTargetManager;
import com.my.target.common.webform.WebFormClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public class y7 implements x7 {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements p3 {
        final /* synthetic */ com.my.target.b a;

        a(com.my.target.b bVar) {
            this.a = bVar;
        }

        @Override // com.my.target.p3
        public void a() {
            wh.b(this.a.H(), "webviewShown", 2);
            mi.a("WebViewReachability: webview shown");
        }

        @Override // com.my.target.p3
        public void b() {
            wh.b(this.a.H(), "webviewClosed", 2);
            mi.a("WebViewReachability: webview closed");
        }

        @Override // com.my.target.p3
        public void c() {
            wh.b(this.a.H(), "pageLoadFailed", 2);
            mi.a("WebViewReachability: page load error");
        }

        @Override // com.my.target.p3
        public void d() {
            wh.b(this.a.H(), "pageLoaded", 2);
            mi.a("WebViewReachability: page loaded");
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class b implements MyTargetActivity.ActivityEngine {
        private final String a;
        private fk b;

        private b(String str) {
            this.a = str;
        }

        public static b a(String str) {
            return new b(str);
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.r);
            p0.startActivity(p1);
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityAttach(MyTargetActivity myTargetActivity) {
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public boolean onActivityBackPressed() {
            fk fkVar = this.b;
            if (fkVar == null || !fkVar.a()) {
                return true;
            }
            this.b.c();
            return false;
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
            myTargetActivity.setTheme(android.R.style.Theme.Light.NoTitleBar);
            Window window = myTargetActivity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(-12232092);
            try {
                fk fkVar = new fk(myTargetActivity);
                this.b = fkVar;
                frameLayout.addView(fkVar);
                this.b.d();
                this.b.setUrl(this.a);
                this.b.setListener(new l2$g$$ExternalSyntheticLambda0(myTargetActivity));
            } catch (Throwable th) {
                mi.b("InternalNavigationRouterImpl: Error - " + th.getMessage());
                myTargetActivity.finish();
            }
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityDestroy() {
            fk fkVar = this.b;
            if (fkVar == null) {
                return;
            }
            fkVar.b();
            this.b = null;
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
            return false;
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityPause() {
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityResume() {
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityStart() {
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityStop() {
        }

        public void a(Context context) {
            MyTargetActivity.activityEngine = this;
            Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.r);
        p0.startActivity(p1);
    }

    @Override // com.my.target.x7
    public void a(com.my.target.b bVar, Context context, WebFormClient webFormClient, String str, o2 o2Var, CustomParams customParams) {
        ck.a(str, webFormClient, customParams, context);
    }

    @Override // com.my.target.x7
    public boolean b(com.my.target.b bVar, Context context, String str, o2 o2Var) {
        return a(context, bVar.g(), str);
    }

    @Override // com.my.target.x7
    public boolean c(com.my.target.b bVar, Context context, String str, o2 o2Var) {
        return a(context, bVar.g(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Context context, String str) {
        try {
            b.a(str).a(context);
        } catch (Exception e) {
            mi.b("InternalNavigationRouterImpl: Error opening webview: " + e.getMessage());
        }
    }

    @Override // com.my.target.x7
    public void a(com.my.target.b bVar, final Context context, final String str, o2 o2Var) {
        if (bVar.V()) {
            a(context, null, str);
        } else {
            a(context, str, bVar, new Runnable() { // from class: com.my.target.y7$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    y7.this.a(context, str);
                }
            });
        }
    }

    private boolean a(Context context, String str, String str2) {
        try {
            if (str != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                intent.addFlags(268435456);
                intent.setPackage(str);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
            intent2.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            return true;
        } catch (Throwable th) {
            mi.b("InternalNavigationRouterImpl: Error opening link: " + th.getMessage());
            return false;
        }
    }

    private void a(final Context context, final String str, final com.my.target.b bVar, final Runnable runnable) {
        final a aVar = new a(bVar);
        final o3 a2 = n3.a(MyTargetManager.b());
        a2.a(new Runnable() { // from class: com.my.target.y7$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                y7.a(o3.this, aVar, str, bVar, context, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(o3 o3Var, p3 p3Var, String str, com.my.target.b bVar, Context context, Runnable runnable) {
        if (o3Var.a(p3Var, Uri.parse(str), bVar.f(), context)) {
            return;
        }
        o3Var.a();
        runnable.run();
    }
}
