package com.my.target;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.ac;
import com.my.target.g;
import com.my.target.u2;
import com.my.target.xa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes.dex */
public class u9 implements xa, ac.a {
    private final zf a;
    private final Runnable b;
    private final u2 c;
    private final ec d;
    private final ac e;
    private final WeakReference f;
    private final Context g;
    private final m h;
    private String i;
    private Integer j;
    private f k;
    private fc l;
    private xa.a m;
    private p8 n;
    private boolean o;
    private long p;
    private long q;
    private boolean r;
    private boolean s;
    private cc t;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u9.this.h();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements g.a {
        final /* synthetic */ com.my.target.b a;

        b(com.my.target.b bVar) {
            this.a = bVar;
        }

        @Override // com.my.target.g.a
        public void b() {
            xa.a aVar = u9.this.m;
            if (aVar != null) {
                aVar.b(this.a);
            }
        }
    }

    private u9(ac acVar, u2 u2Var, Context context) {
        this.a = zf.a(o0.g, 200);
        this.b = new Runnable() { // from class: com.my.target.u9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                u9.this.m();
            }
        };
        this.s = true;
        this.t = cc.b();
        this.e = acVar;
        this.g = context.getApplicationContext();
        this.c = u2Var;
        if (context instanceof Activity) {
            this.f = new WeakReference((Activity) context);
        } else {
            this.f = new WeakReference(null);
        }
        this.i = "loading";
        this.d = ec.e();
        u2Var.setOnCloseListener(new u2.a() { // from class: com.my.target.u9$$ExternalSyntheticLambda1
            @Override // com.my.target.u2.a
            public final void b() {
                u9.this.j();
            }
        });
        this.h = new m(context);
        acVar.a(this);
    }

    public static u9 a(Context context) {
        return new u9(context);
    }

    private boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    private void f() {
        xa.a aVar = this.m;
        if (aVar != null) {
            aVar.a(true);
            this.a.b(this.b);
        }
    }

    private boolean k() {
        fc fcVar;
        Activity activity = (Activity) this.f.get();
        if (activity == null || (fcVar = this.l) == null) {
            return false;
        }
        return qi.a(activity, fcVar);
    }

    private void l() {
        this.a.a(this.b);
        this.q = System.currentTimeMillis();
        xa.a aVar = this.m;
        if (aVar != null) {
            aVar.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        xa.a aVar = this.m;
        if (aVar != null) {
            aVar.a(this.p / 1000.0d);
        }
        long j = this.p;
        if (j > 0) {
            this.p = j - 200;
        } else {
            e();
        }
    }

    private void o() {
        DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
        this.d.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.d.b(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.d.a(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.d.c(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // com.my.target.ac.a
    public void b() {
        j();
    }

    @Override // com.my.target.ac.a
    public void c() {
        this.r = true;
    }

    @Override // com.my.target.ac.a
    public boolean d() {
        mi.a("InterstitialMraidPresenter: Resize method not used with interstitials");
        return false;
    }

    @Override // com.my.target.z9
    public void destroy() {
        a(0);
    }

    void e() {
        this.c.setCloseVisible(true);
        f();
    }

    boolean g() {
        if (!"none".equals(this.t.toString())) {
            return b(this.t.a());
        }
        if (this.s) {
            n();
            return true;
        }
        Activity activity = (Activity) this.f.get();
        if (activity != null) {
            return b(qi.a(activity));
        }
        this.e.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h, "Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
        return false;
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return null;
    }

    void h() {
        e a2;
        p8 p8Var = this.n;
        if (p8Var == null || (a2 = p8Var.a()) == null) {
            return;
        }
        f fVar = this.k;
        if (fVar == null || !fVar.b()) {
            Activity activity = (Activity) this.f.get();
            if (fVar == null || activity == null) {
                a7.a(a2.c(), this.g);
            } else {
                fVar.a(activity);
            }
        }
    }

    @Override // com.my.target.z9
    public View i() {
        return this.c;
    }

    void j() {
        if (this.l == null || "loading".equals(this.i) || "hidden".equals(this.i)) {
            return;
        }
        n();
        if ("default".equals(this.i)) {
            this.c.setVisibility(4);
            c("hidden");
        }
    }

    void n() {
        Integer num;
        Activity activity = (Activity) this.f.get();
        if (activity != null && (num = this.j) != null) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.j = null;
    }

    @Override // com.my.target.z9
    public void pause() {
        this.o = true;
        fc fcVar = this.l;
        if (fcVar != null) {
            fcVar.a(false);
        }
        if (this.q > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.q;
            if (currentTimeMillis > 0) {
                long j = this.p;
                if (currentTimeMillis < j) {
                    this.p = j - currentTimeMillis;
                }
            }
            this.p = 0L;
        }
        this.a.b(this.b);
    }

    @Override // com.my.target.z9
    public void resume() {
        this.o = false;
        fc fcVar = this.l;
        if (fcVar != null) {
            fcVar.e();
        }
        if (this.p > 0) {
            l();
        }
    }

    @Override // com.my.target.z9
    public void stop() {
        this.o = true;
        fc fcVar = this.l;
        if (fcVar != null) {
            fcVar.a(false);
        }
    }

    private void c(String str) {
        p8 p8Var;
        mi.a("InterstitialMraidPresenter: MRAID state set to " + str);
        this.i = str;
        this.e.e(str);
        if ("hidden".equals(str)) {
            mi.a("InterstitialMraidPresenter: Mraid on close");
            xa.a aVar = this.m;
            if (aVar == null || (p8Var = this.n) == null) {
                return;
            }
            aVar.a(p8Var);
        }
    }

    @Override // com.my.target.xa
    public void a(i9 i9Var, p8 p8Var) {
        this.n = p8Var;
        long X = (long) (p8Var.X() * 1000.0f);
        this.p = X;
        if (X > 0) {
            mi.a("InterstitialHtmlPresenter: Banner will be allowed to close in " + p8Var.X() + " seconds");
            this.p = (long) (p8Var.X() * 1000.0f);
            l();
        } else {
            mi.a("InterstitialMraidPresenter: Banner is allowed to close");
            this.c.setCloseVisible(true);
        }
        String e0 = p8Var.e0();
        if (e0 != null) {
            b(e0);
        }
        a(p8Var);
    }

    @Override // com.my.target.ac.a
    public boolean b(Uri uri) {
        mi.a("InterstitialMraidPresenter: Expand method not used with interstitials");
        return false;
    }

    void b(String str) {
        fc fcVar = new fc(this.g);
        this.l = fcVar;
        this.e.a(fcVar);
        this.c.addView(this.l, new FrameLayout.LayoutParams(-1, -1));
        this.e.f(str);
    }

    boolean b(int i) {
        Activity activity = (Activity) this.f.get();
        if (activity != null && a(this.t)) {
            if (this.j == null) {
                this.j = Integer.valueOf(activity.getRequestedOrientation());
            }
            activity.setRequestedOrientation(i);
            return true;
        }
        this.e.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h, "Attempted to lock orientation to unsupported value: " + this.t.toString());
        return false;
    }

    @Override // com.my.target.xa
    public void a(xa.a aVar) {
        this.m = aVar;
    }

    @Override // com.my.target.xa
    public void a(int i) {
        fc fcVar;
        this.a.b(this.b);
        if (!this.o) {
            this.o = true;
            if (i <= 0 && (fcVar = this.l) != null) {
                fcVar.a(true);
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
        this.e.a();
        fc fcVar2 = this.l;
        if (fcVar2 != null) {
            fcVar2.a(i);
            this.l = null;
        }
        this.c.removeAllViews();
    }

    @Override // com.my.target.ac.a
    public void a(ac acVar, WebView webView) {
        p8 p8Var;
        this.i = "default";
        o();
        ArrayList arrayList = new ArrayList();
        if (k()) {
            arrayList.add("'inlineVideo'");
        }
        arrayList.add("'vpaid'");
        acVar.a(arrayList);
        acVar.d("interstitial");
        acVar.a(acVar.c());
        c("default");
        acVar.d();
        acVar.a(this.d);
        xa.a aVar = this.m;
        if (aVar == null || (p8Var = this.n) == null) {
            return;
        }
        aVar.a(p8Var, this.c);
        this.m.a(webView);
    }

    private u9(Context context) {
        this(ac.b("interstitial"), new u2(context), context);
    }

    @Override // com.my.target.ac.a
    public void a(boolean z) {
        this.e.a(z);
    }

    @Override // com.my.target.ac.a
    public boolean a(String str, JsResult jsResult) {
        mi.a("InterstitialMraidPresenter: JS Alert - " + str);
        jsResult.confirm();
        return true;
    }

    @Override // com.my.target.ac.a
    public boolean a(ConsoleMessage consoleMessage, ac acVar) {
        mi.a("InterstitialMraidPresenter: Console message - " + consoleMessage.message());
        return true;
    }

    @Override // com.my.target.ac.a
    public boolean a(boolean z, cc ccVar) {
        if (!a(ccVar)) {
            this.e.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h, "Unable to force orientation to " + ccVar);
            return false;
        }
        this.s = z;
        this.t = ccVar;
        return g();
    }

    @Override // com.my.target.ac.a
    public void a(Uri uri) {
        n2 a2;
        p8 p8Var = this.n;
        if (p8Var != null && p8Var.f().b()) {
            a2 = t2.a();
        } else {
            a2 = q2.a();
        }
        xa.a aVar = this.m;
        if (aVar != null) {
            aVar.a(this.n, uri.toString(), 1, s2.a(a2), this.c.getContext());
        }
    }

    @Override // com.my.target.ac.a
    public void a() {
        o();
    }

    @Override // com.my.target.ac.a
    public boolean a(String str) {
        if (!this.r) {
            this.e.a("vpaidEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        xa.a aVar = this.m;
        boolean z = aVar != null;
        p8 p8Var = this.n;
        if ((p8Var != null) & z) {
            aVar.a(p8Var, str, this.g);
        }
        return true;
    }

    @Override // com.my.target.ac.a
    public boolean a(float f, float f2) {
        xa.a aVar;
        p8 p8Var;
        if (!this.r) {
            this.e.a("playheadEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        if (f < 0.0f || f2 < 0.0f || (aVar = this.m) == null || (p8Var = this.n) == null) {
            return true;
        }
        aVar.a(p8Var, f, f2, this.g);
        return true;
    }

    @Override // com.my.target.ac.a
    public boolean a(int i, int i2, int i3, int i4, boolean z, int i5) {
        mi.a("InterstitialMraidPresenter: SetResizeProperties method not used with interstitials");
        return false;
    }

    boolean a(cc ccVar) {
        ActivityInfo activityInfo;
        int i;
        if ("none".equals(ccVar.toString())) {
            return true;
        }
        Activity activity = (Activity) this.f.get();
        if (activity == null) {
            return false;
        }
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            i = activityInfo.screenOrientation;
        } catch (Throwable unused) {
        }
        return i != -1 ? i == ccVar.a() : a(activityInfo.configChanges, 128) && a(activityInfo.configChanges, 1024);
    }

    private void a(com.my.target.b bVar) {
        e a2 = bVar.a();
        if (a2 == null) {
            this.h.setVisibility(8);
            return;
        }
        if (this.h.getParent() != null) {
            return;
        }
        int a3 = qi.a(10, this.g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(a3, a3, a3, a3);
        this.c.addView(this.h, layoutParams);
        this.h.setImageBitmap(a2.g().getBitmap());
        this.h.setOnClickListener(new a());
        if (a2.b() == null) {
            return;
        }
        f a4 = f.a(a2, new r3());
        this.k = a4;
        a4.a(new b(bVar));
    }
}
