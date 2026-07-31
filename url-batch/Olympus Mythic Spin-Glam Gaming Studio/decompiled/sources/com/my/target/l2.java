package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.ads.AdError;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.webform.WebFormClient;
import com.my.target.l2;
import com.my.target.si;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes.dex */
public final class l2 {
    private static jg g;
    private static hc h;
    private final CustomParams b;
    private final int c;
    private static final WeakHashMap e = new WeakHashMap();
    private static final si f = si.a();
    private static boolean i = false;
    private long d = 0;
    private final o3 a = n3.a(g);

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static abstract class a {
        protected final com.my.target.b a;

        protected a(com.my.target.b bVar) {
            this.a = bVar;
        }

        static a a(com.my.target.b bVar, String str, String str2, Map map, int i) {
            return new b(bVar, str, str2, map, i);
        }

        protected abstract boolean a(Context context);

        static a a(o3 o3Var, String str, com.my.target.b bVar) {
            return ti.d(str) ? new d(o3Var, str, bVar) : new f(o3Var, str, bVar);
        }

        static a a(String str, com.my.target.b bVar, CustomParams customParams, WebFormClient webFormClient) {
            return new e(str, bVar, customParams, webFormClient);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface c {
        void c();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class d extends f {
        d(o3 o3Var, String str, com.my.target.b bVar) {
            super(o3Var, str, bVar);
        }

        private boolean d(String str, Context context) {
            return a7.a(str, context);
        }

        @Override // com.my.target.l2.f, com.my.target.l2.a
        protected boolean a(Context context) {
            if (!d(this.b, context)) {
                return super.a(context);
            }
            this.c.a();
            return true;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class e extends a {
        protected final String b;
        protected WebFormClient c;
        protected CustomParams d;

        protected e(String str, com.my.target.b bVar, CustomParams customParams, WebFormClient webFormClient) {
            super(bVar);
            this.b = str;
            this.c = webFormClient;
            this.d = customParams;
        }

        @Override // com.my.target.l2.a
        protected boolean a(Context context) {
            ck.a(this.b, this.c, this.d, context);
            return true;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class g implements MyTargetActivity.ActivityEngine {
        private final String a;
        private fk b;

        private g(String str) {
            this.a = str;
        }

        public static g a(String str) {
            return new g(str);
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
                mi.b("ClickHandler: Error - " + th.getMessage());
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

    private l2(CustomParams customParams, Integer num) {
        this.b = customParams;
        this.c = num == null ? 10 : num.intValue();
    }

    public static void a(jg jgVar, hc hcVar) {
        g = jgVar;
        h = hcVar;
    }

    static boolean b(String str, String str2, Context context) {
        return str == null ? a7.a(str2, context) : a7.a(str2, str, context);
    }

    private void c(final String str, final com.my.target.b bVar, final WebFormClient webFormClient, final o2 o2Var, final Context context) {
        if (!bVar.T() && !ti.d(str)) {
            e.put(bVar, Boolean.TRUE);
            a(this.a, str, bVar.f(), this.c, new g3() { // from class: com.my.target.l2$$ExternalSyntheticLambda1
                @Override // com.my.target.g3
                public final void accept(Object obj) {
                    l2.this.a(bVar, webFormClient, o2Var, context, (si.a) obj);
                }
            });
        } else {
            if (g != null) {
                this.a.b();
            }
            o0.e(new Runnable() { // from class: com.my.target.l2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    l2.this.b(str, bVar, webFormClient, o2Var, context);
                }
            });
        }
    }

    public static l2 a(CustomParams customParams) {
        return new l2(customParams, null);
    }

    public static l2 a(CustomParams customParams, Integer num) {
        return new l2(customParams, num);
    }

    static boolean a(String str, String str2, Context context) {
        if (str2 == null) {
            return false;
        }
        return b(str, str2, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final o3 o3Var, final String str, final w0 w0Var, final int i2, final g3 g3Var) {
        o0.d(new Runnable() { // from class: com.my.target.l2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                l2.a(o3.this, str, i2, w0Var, g3Var);
            }
        });
    }

    private void b() {
        this.d = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(o3 o3Var, String str, int i2, w0 w0Var, final g3 g3Var) {
        if (o3Var != null) {
            o3Var.b();
        }
        final si.a a2 = f.a(str, i2, h);
        if (!a2.a()) {
            w0Var.c(2, AdError.INCORRECT_STATE_ERROR, "responseCode=" + a2.c + ", url=" + str + ", error=" + a2.d);
            if (o3Var != null) {
                o3Var.a();
            }
        }
        if (g3Var == null) {
            if (o3Var != null) {
                o3Var.a();
            }
        } else {
            if (!a2.a() && o3Var != null) {
                o3Var.a();
            }
            o0.e(new Runnable() { // from class: com.my.target.l2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    g3.this.accept(a2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class f extends a {
        protected final String b;
        protected final o3 c;

        /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
        class a implements p3 {
            boolean a = false;

            a() {
            }

            @Override // com.my.target.p3
            public void a() {
                wh.b(f.this.a.H(), "webviewShown", 2);
                mi.a("WebViewReachability: webview shown");
                this.a = true;
            }

            @Override // com.my.target.p3
            public void b() {
                if (!this.a) {
                    mi.a("WebViewReachability: !!! Rare bug occurred: call 'webview closed' without 'webview shown'");
                } else {
                    wh.b(f.this.a.H(), "webviewClosed", 2);
                    mi.a("WebViewReachability: webview closed");
                }
            }

            @Override // com.my.target.p3
            public void c() {
                wh.b(f.this.a.H(), "pageLoadFailed", 2);
                mi.a("WebViewReachability: page load error");
            }

            @Override // com.my.target.p3
            public void d() {
                wh.b(f.this.a.H(), "pageLoaded", 2);
                mi.a("WebViewReachability: page loaded");
            }
        }

        f(o3 o3Var, String str, com.my.target.b bVar) {
            super(bVar);
            this.c = o3Var;
            this.b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Context context) {
            if (a(this.b, context)) {
                return;
            }
            this.c.a();
            if ("store".equals(this.a.B()) || (Build.VERSION.SDK_INT >= 28 && !ti.c(this.b))) {
                b(this.b, context);
            } else {
                c(this.b, context);
            }
        }

        private boolean c(Context context) {
            if (!context.getPackageName().equals("ru.mail.browser")) {
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("com.android.browser.application_id", "ru.mail.browser");
            return a7.a(this.b, "ru.mail.browser", bundle, context);
        }

        @Override // com.my.target.l2.a
        protected boolean a(final Context context) {
            if (c(context)) {
                this.c.a();
                return true;
            }
            if (this.a.V()) {
                this.c.a();
                return b(this.b, context);
            }
            o0.e(new Runnable() { // from class: com.my.target.l2$f$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    l2.f.this.b(context);
                }
            });
            return true;
        }

        private boolean c(String str, Context context) {
            if (l2.i) {
                return true;
            }
            g.a(str).a(context);
            return true;
        }

        private boolean a(String str, Context context) {
            a aVar = new a();
            if (l2.i) {
                return true;
            }
            boolean a2 = this.c.a(aVar, Uri.parse(str), this.a.f(), context);
            if (!a2) {
                this.c.a();
            }
            return a2;
        }

        private boolean b(String str, Context context) {
            if (l2.i) {
                return str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v) || str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u);
            }
            return a7.a(str, context);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class b extends a {
        private final String b;
        private final String c;
        private final Map d;
        private final int e;

        b(com.my.target.b bVar, String str, String str2, Map map, int i) {
            super(bVar);
            this.b = str;
            this.c = str2;
            this.d = map;
            this.e = i;
        }

        @Override // com.my.target.l2.a
        protected boolean a(Context context) {
            String g;
            Intent launchIntentForPackage;
            if (!"store".equals(this.a.B())) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 30 || this.a.S()) {
                g = this.a.g();
                if (g == null || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(g)) == null) {
                    return false;
                }
            } else {
                g = null;
                launchIntentForPackage = null;
            }
            if (l2.a(g, this.a.m(), context)) {
                wh.b(this.a.H(), "deeplinkClick", 2);
                return true;
            }
            if (!a(g, this.a.O(), context) && !a(launchIntentForPackage, context)) {
                return false;
            }
            wh.a(this.a.H(), this.c, this.d, 2);
            String str = this.b;
            if (str != null && !ti.d(str)) {
                l2.a((o3) null, this.b, this.a.f(), this.e, (g3) null);
            }
            return true;
        }

        private boolean a(String str, String str2, Context context) {
            if (str2 == null) {
                return false;
            }
            return l2.b(str, str2, context);
        }

        private boolean a(Intent intent, Context context) {
            if (intent == null) {
                return false;
            }
            return a7.a(intent, context);
        }
    }

    public void a(final com.my.target.b bVar, String str, String str2, final String str3, final WebFormClient webFormClient, final Context context) {
        bVar.f().b(2, 7000, "available-link");
        if (a()) {
            bVar.f().c(2, AdError.MISSING_DEPENDENCIES_ERROR, "too-many-clicks");
            return;
        }
        if (a(bVar.g(), str, context)) {
            b();
            bVar.f().b(2, AdError.LOAD_CALLED_WHILE_SHOWING_AD);
        } else if (!TextUtils.isEmpty(str2) && a7.a(str2, context)) {
            b();
            bVar.f().b(2, AdError.LOAD_CALLED_WHILE_SHOWING_AD);
        } else if (TextUtils.isEmpty(str3)) {
            bVar.f().a(2, 7001, "url is empty");
        } else {
            this.a.b();
            o0.e(new Runnable() { // from class: com.my.target.l2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    l2.this.a(str3, bVar, webFormClient, context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, com.my.target.b bVar, WebFormClient webFormClient, Context context) {
        b(str, bVar, webFormClient, (o2) null, context);
    }

    public void a(com.my.target.b bVar, int i2, WebFormClient webFormClient, Context context) {
        a(bVar, i2, webFormClient, (c) null, (o2) null, context);
    }

    public void a(com.my.target.b bVar, int i2, o2 o2Var, WebFormClient webFormClient, Context context) {
        a(bVar, i2, webFormClient, (c) null, o2Var, context);
    }

    public void a(com.my.target.b bVar, int i2, WebFormClient webFormClient, c cVar, o2 o2Var, Context context) {
        String L;
        bVar.f().a(2, 7000, null, o2.a(o2Var));
        if (a()) {
            bVar.f().c(2, AdError.MISSING_DEPENDENCIES_ERROR, "too-many-clicks");
            return;
        }
        if (i2 == 2) {
            L = bVar.k();
            if (L == null) {
                L = bVar.L();
                i2 = 1;
            }
        } else {
            L = bVar.L();
        }
        a(bVar, L, i2, webFormClient, cVar, o2Var, context);
    }

    public void a(com.my.target.b bVar, String str, int i2, WebFormClient webFormClient, Context context) {
        a(bVar, str, i2, (o2) null, webFormClient, (c) null, context);
    }

    public void a(com.my.target.b bVar, String str, int i2, o2 o2Var, WebFormClient webFormClient, Context context) {
        a(bVar, str, i2, o2Var, webFormClient, (c) null, context);
    }

    public void a(com.my.target.b bVar, String str, int i2, o2 o2Var, WebFormClient webFormClient, c cVar, Context context) {
        bVar.f().a(2, 7000, null, o2.a(o2Var));
        if (a()) {
            bVar.f().c(2, AdError.MISSING_DEPENDENCIES_ERROR, "too-many-clicks");
        } else {
            a(bVar, str, i2, webFormClient, cVar, o2Var, context);
        }
    }

    public void a(String str, final com.my.target.b bVar, final g3 g3Var) {
        e.put(bVar, Boolean.TRUE);
        a(this.a, str, bVar.f(), this.c, new g3() { // from class: com.my.target.l2$$ExternalSyntheticLambda4
            @Override // com.my.target.g3
            public final void accept(Object obj) {
                l2.this.a(bVar, g3Var, (si.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.my.target.b bVar, g3 g3Var, si.a aVar) {
        e.remove(bVar);
        String a2 = a(aVar);
        if (a2 != null) {
            g3Var.accept(a2);
        }
    }

    private void a(com.my.target.b bVar, String str, int i2, WebFormClient webFormClient, c cVar, o2 o2Var, Context context) {
        if (e.containsKey(bVar)) {
            bVar.f().c(2, AdError.MISSING_DEPENDENCIES_ERROR, "nested-call");
            return;
        }
        String str2 = "click";
        if (i2 == 2 && bVar.k() != null && (str == null || !str.equals(bVar.L()))) {
            str2 = "ctaClick";
        }
        Map a2 = a(o2Var);
        String a3 = a(str, bVar, a2);
        if (a.a(bVar, a3, str2, a2, this.c).a(context)) {
            b();
            bVar.f().a(2, AdError.LOAD_CALLED_WHILE_SHOWING_AD, null, o2.a(o2Var));
            return;
        }
        wh.a(bVar.H(), str2, a2, 2);
        mi.a("WebViewReachability: banner clicked");
        if (cVar != null) {
            cVar.c();
        }
        if (a3 == null) {
            return;
        }
        c(a3, bVar, webFormClient, o2Var, context);
    }

    private Map a(o2 o2Var) {
        HashMap hashMap = new HashMap();
        if (o2Var != null && o2Var.a()) {
            hashMap.put("click_target", String.valueOf(o2Var.c()));
        }
        return hashMap;
    }

    private String a(String str, com.my.target.b bVar, Map map) {
        if (str == null) {
            return str;
        }
        if (!str.equals(bVar.L()) && !str.equals(bVar.k())) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.my.target.b bVar, WebFormClient webFormClient, o2 o2Var, Context context, si.a aVar) {
        String a2 = a(aVar);
        if (a2 != null) {
            b(a2, bVar, webFormClient, o2Var, context);
        }
        e.remove(bVar);
    }

    private String a(si.a aVar) {
        String str;
        if (aVar == null || !aVar.a() || (str = aVar.b) == null) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(String str, com.my.target.b bVar, WebFormClient webFormClient, o2 o2Var, Context context) {
        a a2;
        wh.b(bVar.H(), "urlResolved", 2);
        mi.a("WebViewReachability: url resolved");
        String B = bVar.B();
        B.getClass();
        switch (B) {
            case "web":
            case "store":
                a2 = a.a(this.a, str, bVar);
                break;
            case "webform":
                a2 = a.a(str, bVar, this.b, webFormClient);
                break;
            default:
                return;
        }
        boolean a3 = a2.a(context);
        b();
        if (a3) {
            bVar.f().a(2, AdError.LOAD_CALLED_WHILE_SHOWING_AD, null, o2.a(o2Var));
        } else {
            bVar.f().a(2, 7001, null, o2.a(o2Var));
        }
    }

    private boolean a() {
        return SystemClock.elapsedRealtime() - this.d < 800;
    }
}
