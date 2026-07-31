package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.MyTargetActivity;
import com.my.target.p5;
import com.my.target.wh;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class n8 implements p5, MyTargetActivity.ActivityEngine {
    final p5.a a;
    final p5.c b;
    final BaseInterstitialAd c;
    boolean d;
    boolean e;
    private WeakReference f;
    private boolean g;
    private p5.b i;
    private boolean h = false;
    private boolean j = true;

    n8(p5.a aVar, BaseInterstitialAd baseInterstitialAd, p5.c cVar) {
        this.a = aVar;
        this.c = baseInterstitialAd;
        this.b = cVar;
    }

    public static n8 a(BaseInterstitialAd baseInterstitialAd, List list, i9 i9Var, boolean z, p5.a aVar, p5.c cVar) {
        if (list.size() == 1) {
            return a(baseInterstitialAd, (i8) list.get(0), i9Var, z, aVar, cVar);
        }
        if (list.size() <= 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i8 i8Var = (i8) it.next();
            if (i8Var instanceof d9) {
                d9 d9Var = (d9) i8Var;
                if (d9Var.i0() == 3) {
                    arrayList.add(d9Var);
                }
            }
        }
        return arrayList.isEmpty() ? a(baseInterstitialAd, (i8) list.get(0), i9Var, z, aVar, cVar) : arrayList.size() == 1 ? a(baseInterstitialAd, (i8) arrayList.get(0), i9Var, z, aVar, cVar) : c4.a(baseInterstitialAd, arrayList, z, aVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(b bVar) {
        this.a.c(InterstitialAd.BannerInfo.a(bVar.x(), bVar.A()));
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.r);
        p0.startActivity(p1);
    }

    public void b(final b bVar) {
        bVar.f().b(1, 5004);
        wh.a(bVar.H(), "closedByUser", 1, new wh.c() { // from class: com.my.target.n8$$ExternalSyntheticLambda2
            @Override // com.my.target.wh.c
            public final void a() {
                n8.this.c(bVar);
            }
        });
        dismiss();
    }

    @Override // com.my.target.p5
    public float d() {
        return 0.0f;
    }

    @Override // com.my.target.p5
    public void destroy() {
        dismiss();
    }

    @Override // com.my.target.p5
    public void dismiss() {
        this.g = false;
        this.h = true;
        WeakReference weakReference = this.f;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    protected final void e(final b bVar) {
        wh.a(bVar.H(), "error", 1, new wh.c() { // from class: com.my.target.n8$$ExternalSyntheticLambda1
            @Override // com.my.target.wh.c
            public final void a() {
                n8.this.d(bVar);
            }
        });
        bVar.f().a(0, 5500);
    }

    public p5.b g() {
        return this.i;
    }

    protected abstract boolean h();

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityAttach(MyTargetActivity myTargetActivity) {
        DisplayCutout displayCutout;
        Window window = myTargetActivity.getWindow();
        if (window == null) {
            return;
        }
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(-16777216);
        View decorView = window.getDecorView();
        if (decorView == null) {
            a(window);
            return;
        }
        decorView.setBackgroundColor(-16777216);
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            displayCutout = null;
        } else if (i >= 29) {
            Display display = decorView.getDisplay();
            if (display == null) {
                a(window);
                return;
            }
            displayCutout = display.getCutout();
        } else {
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            if (rootWindowInsets == null) {
                a(window);
                return;
            }
            displayCutout = rootWindowInsets.getDisplayCutout();
        }
        if (displayCutout == null) {
            a(window);
        }
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public final boolean onActivityBackPressed() {
        return h() && this.j;
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        myTargetActivity.setTheme(android.R.style.Theme.NoTitleBar);
        this.f = new WeakReference(myTargetActivity);
        this.a.e();
    }

    public void onActivityDestroy() {
        this.g = false;
        this.f = null;
        this.a.b();
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onActivityPause() {
        this.d = false;
    }

    public void onActivityResume() {
        this.d = true;
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityStart() {
    }

    public void onActivityStop() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(b bVar) {
        this.a.c(InterstitialAd.BannerInfo.a(bVar.x(), bVar.A()));
    }

    public void b(double d) {
        if (d >= 0.0d) {
            this.a.a(d);
        }
    }

    private static n8 a(BaseInterstitialAd baseInterstitialAd, i8 i8Var, i9 i9Var, boolean z, p5.a aVar, p5.c cVar) {
        if (i8Var instanceof d9) {
            return e9.a(baseInterstitialAd, (d9) i8Var, i9Var, z, aVar, cVar);
        }
        if (i8Var instanceof p8) {
            return q8.a(baseInterstitialAd, (p8) i8Var, i9Var, aVar, cVar);
        }
        if (i8Var instanceof r8) {
            return t8.a(baseInterstitialAd, (r8) i8Var, aVar);
        }
        if (i8Var instanceof u8) {
            return w8.a(baseInterstitialAd, (u8) i8Var, aVar, cVar);
        }
        return null;
    }

    @Override // com.my.target.p5
    public void a(Context context) {
        if (this.g) {
            this.a.c();
            mi.a("InterstitialAdEngine: Unable to open Interstitial Ad twice, please dismiss currently showing ad first");
            return;
        }
        if (this.h) {
            this.a.c();
            mi.a("InterstitialAdEngine: Unable to open Interstitial Ad twice, please use another ad object");
            this.c.a().a().c(1, 5003);
            return;
        }
        this.a.d();
        this.g = true;
        MyTargetActivity.activityEngine = this;
        Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    @Override // com.my.target.p5
    public String a() {
        return "myTarget";
    }

    @Override // com.my.target.p5
    public void a(p5.b bVar) {
        this.i = bVar;
    }

    public void a(boolean z) {
        this.j = z;
    }

    protected void a(Window window) {
        window.setFlags(1024, 1024);
    }
}
