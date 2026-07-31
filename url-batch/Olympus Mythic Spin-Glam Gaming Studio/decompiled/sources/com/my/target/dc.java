package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.my.target.ac;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.dc;
import com.my.target.o;
import com.my.target.ph;
import com.my.target.u2;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class dc implements ph, o.a {
    final h3 a;
    final Context b;
    final ec c;
    final u2.a d;
    final a e;
    final ac.a f;
    private final ac g;
    private final WeakReference h;
    String i;
    ac j;
    fc k;
    ph.a l;
    c m;
    gh n;
    boolean o;
    u2 p;
    o q;
    ViewGroup r;
    f s;
    fc t;
    Uri u;
    e v;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class a implements View.OnLayoutChangeListener {
        private final ac a;

        a(ac acVar) {
            this.a = acVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            dc dcVar = dc.this;
            dcVar.s = null;
            dcVar.b();
            this.a.a(dc.this.c);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class b implements u2.a {
        b() {
        }

        @Override // com.my.target.u2.a
        public void b() {
            o oVar = dc.this.q;
            if (oVar != null) {
                oVar.dismiss();
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface c {
        void a();

        void a(float f, float f2, gh ghVar);

        void a(IAdLoadingError iAdLoadingError);

        void a(String str, gh ghVar);

        void d();

        void e();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class d implements Runnable {
        private final ac a;
        private final gh b;
        private final Context c;
        private final o d;
        private final Uri e;

        d(gh ghVar, o oVar, Uri uri, ac acVar, Context context) {
            this.b = ghVar;
            this.c = context.getApplicationContext();
            this.d = oVar;
            this.e = uri;
            this.a = acVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.a.f(str);
            } else {
                this.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e, "Failed to handling mraid");
                this.d.dismiss();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            final String a = y2.a(this.b.X(), (String) g5.a(t.k).a(this.e.toString(), null).c());
            o0.e(new Runnable() { // from class: com.my.target.dc$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    dc.d.this.a(a);
                }
            });
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class f {
        boolean a = true;
        int b;
        int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private Rect i;
        private Rect j;

        f() {
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.d;
        }

        void a(boolean z) {
            this.a = z;
        }

        boolean b(u2 u2Var) {
            if (this.i == null) {
                return false;
            }
            int i = this.h;
            int i2 = this.g;
            Rect rect = this.i;
            Rect rect2 = new Rect(i, i2, rect.right, rect.bottom);
            int i3 = this.h;
            int i4 = this.g;
            Rect rect3 = new Rect(i3, i4, this.d + i3, this.e + i4);
            Rect rect4 = new Rect();
            u2Var.b(this.f, rect3, rect4);
            return rect2.contains(rect4);
        }

        void a(int i, int i2, int i3, int i4, int i5) {
            this.d = i;
            this.e = i2;
            this.b = i3;
            this.c = i4;
            this.f = i5;
        }

        boolean a(Rect rect) {
            return this.d <= rect.width() && this.e <= rect.height();
        }

        void a(u2 u2Var) {
            Rect rect;
            Rect rect2 = this.j;
            if (rect2 != null && (rect = this.i) != null) {
                int i = (rect2.top - rect.top) + this.c;
                this.g = i;
                this.h = (rect2.left - rect.left) + this.b;
                if (!this.a) {
                    if (i + this.e > rect.height()) {
                        mi.a("MraidPresenter$ResizeHelper: Try to reposition creative vertically because of resize allowOffscreen:false and out of max size properties");
                        this.g = this.i.height() - this.e;
                    }
                    if (this.h + this.d > this.i.width()) {
                        mi.a("MraidPresenter$ResizeHelper: Try to reposition creative horizontally because of resize allowOffscreen:false and out of max size properties");
                        this.h = this.i.width() - this.d;
                    }
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.d, this.e);
                layoutParams.topMargin = this.g;
                layoutParams.leftMargin = this.h;
                u2Var.setLayoutParams(layoutParams);
                u2Var.setCloseGravity(this.f);
                return;
            }
            mi.a("MraidPresenter$ResizeHelper: Setup views before resizing");
        }

        boolean a(ViewGroup viewGroup, fc fcVar) {
            this.i = new Rect();
            this.j = new Rect();
            return viewGroup.getGlobalVisibleRect(this.i) && fcVar.getGlobalVisibleRect(this.j);
        }
    }

    dc(ac acVar, fc fcVar, h3 h3Var, ViewGroup viewGroup) {
        this.d = new b();
        this.g = acVar;
        this.k = fcVar;
        this.a = h3Var;
        Context context = viewGroup.getContext();
        this.b = context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.h = new WeakReference(activity);
            this.r = (ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content);
        } else {
            this.h = new WeakReference(null);
            View rootView = viewGroup.getRootView();
            if (rootView != null) {
                ViewGroup viewGroup2 = (ViewGroup) rootView.findViewById(android.R.id.content);
                this.r = viewGroup2;
                if (viewGroup2 == null) {
                    this.r = (ViewGroup) rootView;
                }
            }
        }
        this.i = "loading";
        this.c = ec.e();
        e eVar = new e(acVar, POBCommonConstants.BANNER_PLACEMENT_TYPE);
        this.f = eVar;
        acVar.a(eVar);
        a aVar = new a(acVar);
        this.e = aVar;
        this.k.addOnLayoutChangeListener(aVar);
        a(fcVar);
    }

    public static dc a(ViewGroup viewGroup) {
        return new dc(viewGroup);
    }

    @Override // com.my.target.o.a
    public void b(boolean z) {
        ac acVar = this.j;
        if (acVar != null) {
            acVar.a(z);
        } else {
            this.g.a(z);
        }
        fc fcVar = this.t;
        if (fcVar == null) {
            return;
        }
        if (z) {
            fcVar.e();
        } else {
            fcVar.a(false);
        }
    }

    @Override // com.my.target.ph
    public h3 getView() {
        return this.a;
    }

    @Override // com.my.target.o.a
    public void m() {
        this.a.setVisibility(0);
        if (this.u != null) {
            this.u = null;
            ac acVar = this.j;
            if (acVar != null) {
                acVar.a(false);
                this.j.e("hidden");
                this.j.a();
                this.j = null;
                this.g.a(true);
            }
            fc fcVar = this.t;
            if (fcVar != null) {
                fcVar.a(true);
                if (this.t.getParent() != null) {
                    ((ViewGroup) this.t.getParent()).removeView(this.t);
                }
                this.t.a(0);
                this.t = null;
            }
        } else {
            fc fcVar2 = this.k;
            if (fcVar2 != null) {
                if (fcVar2.getParent() != null) {
                    ((ViewGroup) this.k.getParent()).removeView(this.k);
                }
                a(this.k);
            }
        }
        u2 u2Var = this.p;
        if (u2Var != null && u2Var.getParent() != null) {
            ((ViewGroup) this.p.getParent()).removeView(this.p);
        }
        this.p = null;
        a("default");
        c cVar = this.m;
        if (cVar != null) {
            cVar.e();
        }
        b();
        this.g.a(this.c);
        fc fcVar3 = this.k;
        if (fcVar3 != null) {
            fcVar3.e();
        }
    }

    @Override // com.my.target.ph
    public void pause() {
        fc fcVar;
        if ((this.q == null || this.j != null) && (fcVar = this.k) != null) {
            fcVar.a(false);
        }
    }

    @Override // com.my.target.ph
    public void resume() {
        fc fcVar;
        if ((this.q == null || this.j != null) && (fcVar = this.k) != null) {
            fcVar.e();
        }
    }

    @Override // com.my.target.ph
    public void start() {
        gh ghVar;
        ph.a aVar = this.l;
        if (aVar == null || (ghVar = this.n) == null) {
            return;
        }
        aVar.a(ghVar);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class e implements ac.a {
        private final ac a;
        private final String b;

        e(ac acVar, String str) {
            this.a = acVar;
            this.b = str;
        }

        @Override // com.my.target.ac.a
        public void a() {
        }

        @Override // com.my.target.ac.a
        public void a(ac acVar, WebView webView) {
            StringBuilder sb = new StringBuilder();
            sb.append("MraidPresenter$MyMraidBridgeListener: onPageLoaded callback from ");
            sb.append(acVar == dc.this.j ? " second " : " primary ");
            sb.append(X3.i.K);
            mi.a(sb.toString());
            ArrayList arrayList = new ArrayList();
            if (dc.this.a()) {
                arrayList.add("'inlineVideo'");
            }
            arrayList.add("'vpaid'");
            acVar.a(arrayList);
            acVar.d(this.b);
            acVar.a(acVar.c());
            o oVar = dc.this.q;
            if (oVar == null || !oVar.isShowing()) {
                dc.this.a("default");
            } else {
                dc.this.a("expanded");
            }
            acVar.d();
            dc dcVar = dc.this;
            if (acVar != dcVar.j) {
                c cVar = dcVar.m;
                if (cVar != null) {
                    cVar.a();
                }
                ph.a aVar = dc.this.l;
                if (aVar != null) {
                    aVar.a(webView);
                }
            }
        }

        @Override // com.my.target.ac.a
        public void b() {
            o oVar = dc.this.q;
            if (oVar != null) {
                oVar.dismiss();
            }
        }

        @Override // com.my.target.ac.a
        public void c() {
            dc.this.o = true;
        }

        @Override // com.my.target.ac.a
        public boolean d() {
            fc fcVar;
            if (!dc.this.i.equals("default")) {
                mi.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - wrong state for resize - " + dc.this.i);
                this.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "wrong state for resize " + dc.this.i);
                return false;
            }
            dc dcVar = dc.this;
            f fVar = dcVar.s;
            if (fVar == null) {
                mi.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - resize properties not set");
                this.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "resize properties not set");
                return false;
            }
            ViewGroup viewGroup = dcVar.r;
            if (viewGroup == null || (fcVar = dcVar.k) == null) {
                mi.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - views not initialized");
                this.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "views not initialized");
                return false;
            }
            if (!fVar.a(viewGroup, fcVar)) {
                mi.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - views not visible");
                this.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "views not visible");
                return false;
            }
            dc.this.p = new u2(dc.this.b);
            dc dcVar2 = dc.this;
            dcVar2.s.a(dcVar2.p);
            dc dcVar3 = dc.this;
            if (!dcVar3.s.b(dcVar3.p)) {
                mi.a("MraidPresenter$MyMraidBridgeListener: Unable to resize - close button is out of visible range");
                this.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, "close button is out of visible range");
                dc.this.p = null;
                return false;
            }
            ViewGroup viewGroup2 = (ViewGroup) dc.this.k.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(dc.this.k);
            }
            dc dcVar4 = dc.this;
            dcVar4.p.addView(dcVar4.k, new FrameLayout.LayoutParams(-1, -1));
            dc.this.p.setOnCloseListener(new u2.a() { // from class: com.my.target.dc$e$$ExternalSyntheticLambda0
                @Override // com.my.target.u2.a
                public final void b() {
                    dc.e.this.e();
                }
            });
            dc dcVar5 = dc.this;
            dcVar5.r.addView(dcVar5.p);
            dc.this.a("resized");
            c cVar = dc.this.m;
            if (cVar == null) {
                return true;
            }
            cVar.d();
            return true;
        }

        void e() {
            dc dcVar = dc.this;
            u2 u2Var = dcVar.p;
            if (u2Var == null || dcVar.k == null) {
                return;
            }
            if (u2Var.getParent() != null) {
                ((ViewGroup) dc.this.p.getParent()).removeView(dc.this.p);
                dc.this.p.removeAllViews();
                dc.this.p.setOnCloseListener(null);
                dc dcVar2 = dc.this;
                dcVar2.p = null;
                dcVar2.a(dcVar2.k);
                dc.this.a("default");
            }
            c cVar = dc.this.m;
            if (cVar != null) {
                cVar.e();
            }
        }

        @Override // com.my.target.ac.a
        public boolean b(Uri uri) {
            return dc.this.a(uri);
        }

        @Override // com.my.target.ac.a
        public void a(boolean z) {
            if (!z || dc.this.q == null) {
                this.a.a(z);
            }
        }

        @Override // com.my.target.ac.a
        public boolean a(String str, JsResult jsResult) {
            mi.a("MraidPresenter$MyMraidBridgeListener: JS Alert - " + str);
            jsResult.confirm();
            return true;
        }

        @Override // com.my.target.ac.a
        public boolean a(ConsoleMessage consoleMessage, ac acVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("MraidPresenter$MyMraidBridgeListener: Console message: from ");
            sb.append(acVar == dc.this.j ? " second " : " primary ");
            sb.append("webview: ");
            sb.append(consoleMessage.message());
            mi.a(sb.toString());
            return true;
        }

        @Override // com.my.target.ac.a
        public boolean a(boolean z, cc ccVar) {
            mi.a("MraidPresenter$MyMraidBridgeListener: Orientation properties isn't supported in standard banners");
            return false;
        }

        @Override // com.my.target.ac.a
        public void a(Uri uri) {
            gh ghVar;
            dc dcVar = dc.this;
            ph.a aVar = dcVar.l;
            if (aVar == null || (ghVar = dcVar.n) == null) {
                return;
            }
            aVar.a(ghVar, uri.toString());
        }

        @Override // com.my.target.ac.a
        public boolean a(String str) {
            gh ghVar;
            dc dcVar = dc.this;
            if (!dcVar.o) {
                this.a.a("vpaidEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            c cVar = dcVar.m;
            if (cVar == null || (ghVar = dcVar.n) == null) {
                return true;
            }
            cVar.a(str, ghVar);
            return true;
        }

        @Override // com.my.target.ac.a
        public boolean a(float f, float f2) {
            c cVar;
            gh ghVar;
            dc dcVar = dc.this;
            if (!dcVar.o) {
                this.a.a("playheadEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            if (f < 0.0f || f2 < 0.0f || (cVar = dcVar.m) == null || (ghVar = dcVar.n) == null) {
                return true;
            }
            cVar.a(f, f2, ghVar);
            return true;
        }

        @Override // com.my.target.ac.a
        public boolean a(int i, int i2, int i3, int i4, boolean z, int i5) {
            dc.this.s = new f();
            dc dcVar = dc.this;
            if (dcVar.r == null) {
                mi.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: container view for resize is not defined");
                this.a.a("setResizeProperties", "container view for resize is not defined");
                dc.this.s = null;
                return false;
            }
            if (i >= 50 && i2 >= 50) {
                qi g = qi.g(dcVar.b);
                dc.this.s.a(z);
                dc.this.s.a(g.b(i), g.b(i2), g.b(i3), g.b(i4), i5);
                if (z) {
                    return true;
                }
                Rect rect = new Rect();
                dc.this.r.getGlobalVisibleRect(rect);
                if (dc.this.s.a(rect)) {
                    return true;
                }
                mi.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: allowOffscreen is false, maxSize is (" + rect.width() + StringUtils.COMMA + rect.height() + ") resize properties: (" + dc.this.s.b() + StringUtils.COMMA + dc.this.s.a() + ")");
                this.a.a("setResizeProperties", "resize properties with allowOffscreen false out of viewport");
                dc.this.s = null;
                return false;
            }
            mi.a("MraidPresenter$MyMraidBridgeListener: Unable to set resize properties: properties cannot be less than closeable container");
            this.a.a("setResizeProperties", "properties cannot be less than closeable container");
            dc.this.s = null;
            return false;
        }
    }

    @Override // com.my.target.o.a
    public void a(o oVar, FrameLayout frameLayout) {
        this.q = oVar;
        u2 u2Var = this.p;
        if (u2Var != null && u2Var.getParent() != null) {
            ((ViewGroup) this.p.getParent()).removeView(this.p);
        }
        u2 u2Var2 = new u2(this.b);
        this.p = u2Var2;
        a(u2Var2, frameLayout);
    }

    @Override // com.my.target.ph
    public void a(gh ghVar) {
        fc fcVar;
        this.n = ghVar;
        String Y = ghVar.Y();
        if (Y != null && (fcVar = this.k) != null) {
            this.g.a(fcVar);
            this.g.f(Y);
        } else {
            a(q.q);
        }
    }

    void b() {
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        this.c.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
            ec ecVar = this.c;
            int i = iArr[0];
            ecVar.c(i, iArr[1], this.r.getMeasuredWidth() + i, iArr[1] + this.r.getMeasuredHeight());
        }
        if (!this.i.equals("expanded") && !this.i.equals("resized")) {
            this.a.getLocationOnScreen(iArr);
            ec ecVar2 = this.c;
            int i2 = iArr[0];
            ecVar2.b(i2, iArr[1], this.a.getMeasuredWidth() + i2, iArr[1] + this.a.getMeasuredHeight());
        }
        fc fcVar = this.t;
        if (fcVar != null) {
            fcVar.getLocationOnScreen(iArr);
            ec ecVar3 = this.c;
            int i3 = iArr[0];
            ecVar3.a(i3, iArr[1], this.t.getMeasuredWidth() + i3, iArr[1] + this.t.getMeasuredHeight());
            return;
        }
        fc fcVar2 = this.k;
        if (fcVar2 != null) {
            fcVar2.getLocationOnScreen(iArr);
            ec ecVar4 = this.c;
            int i4 = iArr[0];
            ecVar4.a(i4, iArr[1], this.k.getMeasuredWidth() + i4, iArr[1] + this.k.getMeasuredHeight());
        }
    }

    @Override // com.my.target.ph
    public void a(ph.a aVar) {
        this.l = aVar;
    }

    @Override // com.my.target.ph
    public void a(boolean z) {
        fc fcVar;
        if ((this.q == null || this.j != null) && (fcVar = this.k) != null) {
            fcVar.a(z);
        }
    }

    @Override // com.my.target.ph
    public void a(int i) {
        a("hidden");
        a((c) null);
        a((ph.a) null);
        this.g.a();
        u2 u2Var = this.p;
        if (u2Var != null) {
            u2Var.removeAllViews();
            this.p.setOnCloseListener(null);
            ViewParent parent = this.p.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.p);
            }
            this.p = null;
        }
        fc fcVar = this.k;
        if (fcVar != null) {
            if (i <= 0) {
                fcVar.a(true);
            }
            if (this.k.getParent() != null) {
                ((ViewGroup) this.k.getParent()).removeView(this.k);
            }
            this.k.a(i);
            this.k = null;
        }
        ac acVar = this.j;
        if (acVar != null) {
            acVar.a();
            this.j = null;
        }
        fc fcVar2 = this.t;
        if (fcVar2 != null) {
            fcVar2.a(true);
            if (this.t.getParent() != null) {
                ((ViewGroup) this.t.getParent()).removeView(this.t);
            }
            this.t.a(0);
            this.t = null;
        }
    }

    private dc(ViewGroup viewGroup) {
        this(ac.b(POBCommonConstants.BANNER_PLACEMENT_TYPE), new fc(viewGroup.getContext()), new h3(viewGroup.getContext()), viewGroup);
    }

    public void a(c cVar) {
        this.m = cVar;
    }

    void a(u2 u2Var, FrameLayout frameLayout) {
        this.a.setVisibility(8);
        frameLayout.addView(u2Var, new ViewGroup.LayoutParams(-1, -1));
        if (this.u != null) {
            this.j = ac.b(POBCommonConstants.BANNER_PLACEMENT_TYPE);
            fc fcVar = new fc(this.b);
            this.t = fcVar;
            a(this.j, fcVar, u2Var);
        } else {
            fc fcVar2 = this.k;
            if (fcVar2 != null && fcVar2.getParent() != null) {
                ((ViewGroup) this.k.getParent()).removeView(this.k);
                u2Var.addView(this.k, new ViewGroup.LayoutParams(-1, -1));
                a("expanded");
            }
        }
        u2Var.setCloseVisible(true);
        u2Var.setOnCloseListener(this.d);
        c cVar = this.m;
        if (cVar != null && this.u == null) {
            cVar.d();
        }
        mi.a("MraidPresenter: MRAID dialog create");
    }

    void a(ac acVar, fc fcVar, u2 u2Var) {
        Uri uri;
        e eVar = new e(acVar, POBCommonConstants.BANNER_PLACEMENT_TYPE);
        this.v = eVar;
        acVar.a(eVar);
        u2Var.addView(fcVar, new ViewGroup.LayoutParams(-1, -1));
        acVar.a(fcVar);
        o oVar = this.q;
        if (oVar == null) {
            return;
        }
        gh ghVar = this.n;
        if (ghVar != null && (uri = this.u) != null) {
            o0.b(new d(ghVar, oVar, uri, acVar, this.b));
        } else {
            oVar.dismiss();
        }
    }

    void a(fc fcVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        this.a.addView(fcVar, 0);
        fcVar.setLayoutParams(layoutParams);
    }

    boolean a() {
        fc fcVar;
        Activity activity = (Activity) this.h.get();
        if (activity == null || (fcVar = this.k) == null) {
            return false;
        }
        return qi.a(activity, fcVar);
    }

    void a(String str) {
        mi.a("MraidPresenter: MRAID state set to " + str);
        this.i = str;
        this.g.e(str);
        ac acVar = this.j;
        if (acVar != null) {
            acVar.e(str);
        }
        if ("hidden".equals(str)) {
            mi.a("MraidPresenter: Mraid on close");
        }
    }

    boolean a(Uri uri) {
        if (this.k == null) {
            mi.a("MraidPresenter: Cannot expand - webview destroyed");
            return false;
        }
        if (!this.i.equals("default") && !this.i.equals("resized")) {
            return false;
        }
        this.u = uri;
        o.a(this, this.b).show();
        return true;
    }

    private void a(IAdLoadingError iAdLoadingError) {
        c cVar = this.m;
        if (cVar != null) {
            cVar.a(iAdLoadingError);
        }
    }
}
