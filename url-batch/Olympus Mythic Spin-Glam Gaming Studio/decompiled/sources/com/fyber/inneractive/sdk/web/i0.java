package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.OnBackInvokedDispatcher;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.IAcloseButton;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.Partner;
import com.ironsource.X3;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public abstract class i0 extends i1 {
    public static final String[] r0 = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    public static final Object s0 = new Object();
    public com.fyber.inneractive.sdk.mraid.f0 N;
    public final z O;
    public final d0 P;
    public final c0 Q;
    public ViewGroup R;
    public m S;
    public boolean T;
    public int U;
    public e0 V;
    public IAcloseButton W;
    public boolean X;
    public float Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public Orientation f0;
    public int g0;
    public FrameLayout h0;
    public FrameLayout i0;
    public FrameLayout j0;
    public int k0;
    public int l0;
    public t m0;
    public final p n0;
    public com.fyber.inneractive.sdk.rtb.watermark.b o0;
    public com.fyber.inneractive.sdk.util.h1 p0;
    public com.fyber.inneractive.sdk.flow.x0 q0;

    public i0(boolean z, c0 c0Var, z zVar, d0 d0Var, com.fyber.inneractive.sdk.measurement.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z, c0Var, rVar);
        this.N = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
        this.T = false;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = Orientation.NONE;
        this.H = eVar;
        this.Q = c0Var;
        this.O = zVar;
        this.P = d0Var;
        this.q0 = com.fyber.inneractive.sdk.flow.x0.c;
        this.n0 = new p(this);
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public void a(boolean z) {
        a(new com.fyber.inneractive.sdk.mraid.g0(z));
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void b() {
        com.fyber.inneractive.sdk.util.r.b.post(new r(this));
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void c() {
        m mVar = this.b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this.n0);
        }
        com.fyber.inneractive.sdk.util.r.b.post(new s(this));
    }

    public final void d(boolean z) {
        try {
            Activity activity = (Activity) com.fyber.inneractive.sdk.util.o.a(this.b);
            if (activity != null) {
                if (!z || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                    activity.setRequestedOrientation(this.U);
                } else {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                }
            }
        } catch (Exception unused) {
            IAlog.a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.util.g1 g() {
        m mVar;
        return (this.N != com.fyber.inneractive.sdk.mraid.f0.EXPANDED || (mVar = this.S) == null) ? super.g() : mVar.getLastClickedLocation();
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void h() {
        super.h();
        FrameLayout frameLayout = this.i0;
        if (frameLayout != null && this.j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.j0.removeAllViewsInLayout();
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                viewGroup.removeView(this.j0);
            }
        }
        this.N = com.fyber.inneractive.sdk.mraid.f0.LOADING;
        Context a = com.fyber.inneractive.sdk.util.o.a(this.b);
        this.U = a instanceof Activity ? ((Activity) a).getRequestedOrientation() : -1;
        this.i0 = new FrameLayout(a);
        this.j0 = new FrameLayout(a);
        FrameLayout frameLayout2 = new FrameLayout(a);
        frameLayout2.setBackgroundColor(-858993460);
        this.h0 = frameLayout2;
        a(a, false);
        m mVar = this.b;
        if (mVar != null) {
            mVar.setOnKeyListener(new q(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void j() {
        m mVar = this.b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void k() {
        ArrayList arrayList = new ArrayList();
        m mVar = this.b;
        if (mVar == null || mVar.getScaleX() == 1.0f || this.b.getScaleY() == 1.0f) {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.Z, this.a0));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.b0, this.c0));
        } else {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.b.getWidthDp(), this.b.getHeightDp()));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.b.getWidthDp(), this.b.getHeightDp()));
        }
        m mVar2 = this.b;
        int c = com.fyber.inneractive.sdk.util.o.c(mVar2 != null ? mVar2.getWidth() : this.b0);
        m mVar3 = this.b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.z(c, com.fyber.inneractive.sdk.util.o.c(mVar3 != null ? mVar3.getHeight() : this.c0)));
        a(arrayList);
        com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
        this.N = f0Var;
        a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final boolean m() {
        c0 c0Var = this.Q;
        return c0Var != null && c0Var.equals(c0.INTERSTITIAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        ViewGroup viewGroup;
        m mVar;
        m mVar2;
        ViewGroup viewGroup2;
        j1 j1Var;
        com.fyber.inneractive.sdk.rtb.watermark.b bVar;
        m mVar3;
        com.fyber.inneractive.sdk.mraid.f0 f0Var;
        ViewGroup viewGroup3 = this.R;
        ViewGroup viewGroup4 = null;
        if (viewGroup3 != null) {
            View findViewById = viewGroup3.findViewById(R.id.ia_identifier_overlay);
            if (findViewById instanceof ViewGroup) {
                viewGroup = (ViewGroup) findViewById;
                if (viewGroup != null) {
                    m mVar4 = this.b;
                    if (mVar4 != null) {
                        View findViewById2 = mVar4.findViewById(R.id.ia_identifier_overlay);
                        if (findViewById2 instanceof ViewGroup) {
                            viewGroup4 = (ViewGroup) findViewById2;
                        }
                    }
                } else {
                    viewGroup4 = viewGroup;
                }
                this.T = false;
                if (!p() || (f0Var = this.N) == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
                    c(false);
                    mVar = this.b;
                    if (mVar != null) {
                        com.fyber.inneractive.sdk.mraid.f0 f0Var2 = this.N;
                        if (f0Var2 == com.fyber.inneractive.sdk.mraid.f0.EXPANDED) {
                            FrameLayout frameLayout = this.i0;
                            if (frameLayout != null && this.j0 != null) {
                                frameLayout.removeAllViewsInLayout();
                                this.j0.removeAllViewsInLayout();
                                ViewGroup viewGroup5 = this.R;
                                if (viewGroup5 != null) {
                                    viewGroup5.removeView(this.j0);
                                }
                            }
                            FrameLayout frameLayout2 = this.h0;
                            if (frameLayout2 != null && (viewGroup2 = (ViewGroup) frameLayout2.getParent()) != null) {
                                viewGroup2.addView(this.b, this.g0);
                                m mVar5 = this.b;
                                int i = this.k0;
                                int i2 = this.l0;
                                ViewGroup.LayoutParams layoutParams = mVar5.getLayoutParams();
                                layoutParams.width = i;
                                layoutParams.height = i2;
                                mVar5.setLayoutParams(layoutParams);
                                com.fyber.inneractive.sdk.util.o.a(this.b, 17);
                                viewGroup2.removeView(this.h0);
                                viewGroup2.invalidate();
                                this.b.requestLayout();
                            }
                            this.d0 = this.k0;
                            this.e0 = this.l0;
                        } else if (f0Var2 == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
                            int i3 = this.k0;
                            this.d0 = i3;
                            int i4 = this.l0;
                            this.e0 = i4;
                            ViewGroup.LayoutParams layoutParams2 = mVar.getLayoutParams();
                            layoutParams2.width = i3;
                            layoutParams2.height = i4;
                            mVar.setLayoutParams(layoutParams2);
                            com.fyber.inneractive.sdk.util.o.a(this.b, 17);
                        }
                    }
                    if (viewGroup4 != null && (mVar2 = this.b) != null) {
                        viewGroup4.setLayoutParams(mVar2.getLayoutParams());
                        if (p()) {
                            com.fyber.inneractive.sdk.util.v.a(viewGroup4);
                            this.b.addView(viewGroup4);
                        }
                    }
                    this.N = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
                    d(false);
                    a(new com.fyber.inneractive.sdk.mraid.d0(this.N));
                } else if (f0Var == com.fyber.inneractive.sdk.mraid.f0.DEFAULT) {
                    com.fyber.inneractive.sdk.mraid.f0 f0Var3 = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
                    this.N = f0Var3;
                    a(new com.fyber.inneractive.sdk.mraid.d0(f0Var3));
                }
                if (viewGroup4 != null) {
                    viewGroup4.setPadding(0, 0, 0, 0);
                }
                j1Var = this.g;
                if (j1Var != null) {
                    ((b0) j1Var).onClose();
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    r();
                }
                bVar = this.o0;
                if (bVar != null || bVar.a == null || (mVar3 = this.b) == null || mVar3.getParent() == null || this.p0 == null) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.o0.a);
                ImageView imageView = this.o0.a;
                com.fyber.inneractive.sdk.util.h1 h1Var = this.p0;
                imageView.setLayoutParams(com.fyber.inneractive.sdk.util.v.a(h1Var.a, h1Var.b, 13));
                ((ViewGroup) this.b.getParent()).addView(this.o0.a);
                return;
            }
        }
        viewGroup = null;
        if (viewGroup != null) {
        }
        this.T = false;
        if (p()) {
        }
        c(false);
        mVar = this.b;
        if (mVar != null) {
        }
        if (viewGroup4 != null) {
            viewGroup4.setLayoutParams(mVar2.getLayoutParams());
            if (p()) {
            }
        }
        this.N = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
        d(false);
        a(new com.fyber.inneractive.sdk.mraid.d0(this.N));
        if (viewGroup4 != null) {
        }
        j1Var = this.g;
        if (j1Var != null) {
        }
        if (Build.VERSION.SDK_INT >= 33) {
        }
        bVar = this.o0;
        if (bVar != null) {
        }
    }

    public final boolean p() {
        return this.N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
    }

    public final void q() {
        com.fyber.inneractive.sdk.measurement.tracker.e bVar;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.measurement.e eVar2 = this.H;
        if (eVar2 != null) {
            m mVar = this.b;
            com.fyber.inneractive.sdk.flow.x xVar = this.s;
            boolean z = false;
            IAlog.a("omsdk initMraidSession", new Object[0]);
            Partner partner = eVar2.e;
            if (partner == null) {
                IAlog.a("omsdk partner is null", new Object[0]);
                bVar = null;
            } else {
                if (xVar != null && (eVar = xVar.b) != null && eVar.G) {
                    z = true;
                }
                eVar2.f.getClass();
                bVar = z ? new com.fyber.inneractive.sdk.measurement.tracker.b(partner, mVar) : new com.fyber.inneractive.sdk.measurement.tracker.a(partner, mVar);
                bVar.a(mVar);
            }
            this.I = bVar;
        }
        g gVar = this.f;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    public final void r() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        try {
            if (!(com.fyber.inneractive.sdk.util.o.a(this.b) instanceof Activity) || this.m0 == null) {
                return;
            }
            onBackInvokedDispatcher = ((Activity) com.fyber.inneractive.sdk.util.o.a(this.b)).getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.m0);
            this.m0 = null;
        } catch (Exception e) {
            IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void setAdDefaultSize(int i, int i2) {
        this.k0 = i;
        this.l0 = i2;
        this.d0 = i;
        this.e0 = i2;
    }

    public void setOrientationProperties(boolean z, String str) {
        if ("portrait".equals(str)) {
            this.f0 = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.f0 = Orientation.LANDSCAPE;
        } else {
            this.f0 = Orientation.NONE;
        }
        j1 j1Var = this.g;
        if (j1Var != null) {
            ((b0) j1Var).a(z, this.f0);
        }
    }

    public void setResizeProperties() {
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void b(boolean z) {
        m mVar = this.b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this.n0);
        }
        com.fyber.inneractive.sdk.util.r.b.post(new s(this));
        m mVar2 = this.S;
        if (mVar2 != null && mVar2.getParent() != null && (this.S.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.S.getParent()).removeView(this.S);
            this.S = null;
        }
        FrameLayout frameLayout = this.i0;
        if (frameLayout != null && this.j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.j0.removeAllViewsInLayout();
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                viewGroup.removeView(this.j0);
            }
        }
        this.i0 = null;
        this.j0 = null;
        this.h0 = null;
        this.a = false;
        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.o0;
        if (bVar != null) {
            com.fyber.inneractive.sdk.util.v.a(bVar.a);
            this.o0 = null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            r();
        }
        super.b(z);
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandle url for: %s webView = %s", IAlog.a(this), str, webView);
        if (this.N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED && !TextUtils.isEmpty(str) && webView.equals(this.S) && !this.T) {
            this.T = true;
            return false;
        }
        return super.a(webView, str);
    }

    public final void c(boolean z) {
        if (this.R == null) {
            return;
        }
        if (z) {
            int b = com.fyber.inneractive.sdk.util.o.b(35);
            if (this.W == null) {
                IAcloseButton iAcloseButton = new IAcloseButton(com.fyber.inneractive.sdk.util.o.a(this.b), b);
                this.W = iAcloseButton;
                iAcloseButton.setOnClickListener(new o(this));
            }
            com.fyber.inneractive.sdk.util.v.a(this.W);
            FrameLayout frameLayout = this.j0;
            if (frameLayout != null) {
                frameLayout.addView(this.W);
                IAcloseButton iAcloseButton2 = this.W;
                ViewGroup.LayoutParams layoutParams = iAcloseButton2.getLayoutParams();
                layoutParams.width = b;
                layoutParams.height = b;
                iAcloseButton2.setLayoutParams(layoutParams);
                com.fyber.inneractive.sdk.util.o.a(this.W, 53);
                IAcloseButton iAcloseButton3 = this.W;
                int b2 = com.fyber.inneractive.sdk.util.o.b(10);
                int b3 = com.fyber.inneractive.sdk.util.o.b(10);
                ViewGroup.LayoutParams layoutParams2 = iAcloseButton3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.topMargin = b2;
                    marginLayoutParams.rightMargin = b3;
                    marginLayoutParams.bottomMargin = 0;
                    iAcloseButton3.setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            FrameLayout frameLayout2 = this.j0;
            if (frameLayout2 != null) {
                frameLayout2.removeView(this.W);
            }
        }
        j1 j1Var = this.g;
        if (j1Var != null) {
            ((b0) j1Var).b(z);
        }
        this.X = !z;
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void a(Context context, boolean z) {
        Window window;
        Window window2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) IAConfigManager.N.u.a().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.Y = displayMetrics.density;
        Rect rect = new Rect();
        boolean z2 = context instanceof Activity;
        if (z2 && (window2 = ((Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.top;
        View findViewById = (!z2 || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(android.R.id.content);
        int top = findViewById != null ? findViewById.getTop() - i : 0;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        double d = i2;
        double d2 = 160.0d / displayMetrics.densityDpi;
        int i4 = (int) (d2 * d);
        int i5 = (int) (d2 * i3);
        int i6 = (i3 - i) - top;
        m mVar = this.b;
        if (mVar != null && mVar.getScaleX() != 1.0f && this.b.getScaleY() != 1.0f) {
            i4 = this.b.getWidthDp();
            i5 = this.b.getHeightDp();
            int b = (com.fyber.inneractive.sdk.util.o.b(this.b.getHeightDp()) - i) - top;
            this.b0 = this.Z;
            this.c0 = (int) ((160.0d / displayMetrics.densityDpi) * b);
        } else {
            double d3 = 160.0d / displayMetrics.densityDpi;
            this.b0 = (int) (d * d3);
            this.c0 = (int) (d3 * i6);
        }
        if (this.Z == i4 && this.a0 == i5) {
            return;
        }
        this.Z = i4;
        this.a0 = i5;
        if (z) {
            a(new com.fyber.inneractive.sdk.mraid.c0(i4, i5));
            a(new com.fyber.inneractive.sdk.mraid.a0(this.b0, this.c0));
            a(new com.fyber.inneractive.sdk.mraid.z(this.b0, this.c0));
            int i7 = this.d0;
            if (i7 > 0 && this.e0 > 0) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i7), com.fyber.inneractive.sdk.util.o.c(this.e0)));
                return;
            }
            m mVar2 = this.b;
            if (mVar2 == null || mVar2.getWidth() <= 0 || this.b.getHeight() <= 0) {
                return;
            }
            a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(this.b.getWidth()), com.fyber.inneractive.sdk.util.o.c(this.b.getHeight())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, int i, int i2, boolean z, boolean z2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float f;
        int i3;
        FrameLayout frameLayout;
        d0 d0Var;
        int i4;
        j1 j1Var;
        ImageView imageView;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (this.b == null || this.O == z.DISABLED || this.N != com.fyber.inneractive.sdk.mraid.f0.DEFAULT) {
            return;
        }
        if (str != null && !URLUtil.isValidUrl(str)) {
            a(com.fyber.inneractive.sdk.mraid.k.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        try {
            ViewGroup viewGroup3 = (ViewGroup) this.b.getRootView().findViewById(android.R.id.content);
            this.R = viewGroup3;
            if (viewGroup3 == null) {
                IAlog.f("Couldn't find content in the view tree", new Object[0]);
                a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.m0 = new t(this);
                if (com.fyber.inneractive.sdk.util.o.a(this.b) instanceof Activity) {
                    onBackInvokedDispatcher = ((Activity) com.fyber.inneractive.sdk.util.o.a(this.b)).getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.m0);
                }
            }
            this.X = z;
            j1 j1Var2 = this.g;
            if (j1Var2 != null) {
                ((b0) j1Var2).b(z);
            }
            d(z2);
            if (this.e0 >= 0) {
                this.e0 = com.fyber.inneractive.sdk.util.o.b(i2);
            }
            if (this.d0 >= 0) {
                this.d0 = com.fyber.inneractive.sdk.util.o.b(i);
            }
            m mVar = this.b;
            ViewGroup viewGroup4 = (ViewGroup) mVar.getParent();
            if (viewGroup4 != null) {
                View findViewById = viewGroup4.findViewById(R.id.ia_identifier_overlay);
                if (findViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) findViewById;
                    if (str == null) {
                        m mVar2 = new m();
                        this.S = mVar2;
                        mVar2.setId(R.id.ia_inneractive_webview_mraid);
                        DTExchangeNetworkBridge.webviewLoadUrl(this.S, str);
                        this.S.setWebChromeClient(this.c);
                        this.S.setWebViewClient(this.d);
                        mVar = this.S;
                        mVar.setOnKeyListener(new u(this));
                    } else {
                        m mVar3 = this.b;
                        if (mVar3 != null && (viewGroup2 = (ViewGroup) mVar3.getParent()) != null) {
                            int childCount = viewGroup2.getChildCount();
                            int i5 = 0;
                            while (i5 < childCount && viewGroup2.getChildAt(i5) != this.b) {
                                i5++;
                            }
                            ViewGroup viewGroup5 = (ViewGroup) viewGroup2.findViewById(R.id.ia_identifier_overlay);
                            this.g0 = i5;
                            com.fyber.inneractive.sdk.util.v.a(viewGroup5);
                            FrameLayout frameLayout2 = this.h0;
                            if (frameLayout2 != null) {
                                com.fyber.inneractive.sdk.util.v.a(frameLayout2);
                                viewGroup2.addView(this.h0, i5);
                                FrameLayout frameLayout3 = this.h0;
                                int width = this.b.getWidth();
                                int height = this.b.getHeight();
                                ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                                layoutParams.width = width;
                                layoutParams.height = height;
                                frameLayout3.setLayoutParams(layoutParams);
                                com.fyber.inneractive.sdk.util.o.a(this.h0, 17);
                            }
                            viewGroup2.removeView(this.b);
                        }
                    }
                    f = this.Y;
                    i3 = (int) ((50.0f * f) + 0.5f);
                    if (i2 >= 0 && i >= 0) {
                        i = (int) (i * f);
                        i2 = (int) (i2 * f);
                        if (i < i3) {
                            i = i3;
                        }
                        if (i2 < i3) {
                            i2 = i3;
                        }
                    }
                    if (this.j0 != null && this.i0 != null) {
                        View view = new View(com.fyber.inneractive.sdk.util.o.a(this.b));
                        view.setBackgroundColor(com.fyber.inneractive.sdk.util.o.a(this.b).getResources().getColor(R.color.ia_mraid_expanded_dimmed_bk));
                        view.setOnTouchListener(new n());
                        this.j0.addView(view);
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        view.setLayoutParams(layoutParams2);
                        com.fyber.inneractive.sdk.util.v.a(mVar);
                        this.i0.addView(mVar);
                        ViewGroup.LayoutParams layoutParams3 = mVar.getLayoutParams();
                        layoutParams3.width = -1;
                        layoutParams3.height = -1;
                        mVar.setLayoutParams(layoutParams3);
                        com.fyber.inneractive.sdk.util.v.a(this.i0);
                        this.j0.addView(this.i0);
                        FrameLayout frameLayout4 = this.i0;
                        ViewGroup.LayoutParams layoutParams4 = frameLayout4.getLayoutParams();
                        layoutParams4.width = i;
                        layoutParams4.height = i2;
                        frameLayout4.setLayoutParams(layoutParams4);
                        com.fyber.inneractive.sdk.util.o.a(this.i0, 17);
                    }
                    frameLayout = this.j0;
                    if (frameLayout != null) {
                        com.fyber.inneractive.sdk.util.v.a(frameLayout);
                        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.o0;
                        if (bVar != null && (imageView = bVar.a) != null) {
                            com.fyber.inneractive.sdk.util.v.a(imageView);
                            ImageView imageView2 = this.o0.a;
                            ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                            layoutParams5.width = -1;
                            layoutParams5.height = -1;
                            imageView2.setLayoutParams(layoutParams5);
                            this.j0.addView(this.o0.a);
                        }
                        this.R.addView(this.j0);
                        FrameLayout frameLayout5 = this.j0;
                        ViewGroup.LayoutParams layoutParams6 = frameLayout5.getLayoutParams();
                        layoutParams6.width = -1;
                        layoutParams6.height = -1;
                        frameLayout5.setLayoutParams(layoutParams6);
                    }
                    if (!mVar.hasFocus()) {
                        mVar.requestFocus();
                    }
                    d0Var = this.P;
                    if (d0Var != d0.ALWAYS_VISIBLE || (!this.X && d0Var != d0.ALWAYS_HIDDEN)) {
                        c(true);
                    }
                    com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
                    this.N = f0Var;
                    a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
                    i4 = this.d0;
                    if (i4 != -1 && this.e0 != -1) {
                        a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i4), com.fyber.inneractive.sdk.util.o.c(this.e0)));
                    }
                    a(com.fyber.inneractive.sdk.mraid.k.EXPAND);
                    if (viewGroup != null) {
                        int dimension = (int) viewGroup.getContext().getResources().getDimension(R.dimen.ia_identifier_padding);
                        viewGroup.setPadding(dimension, 0, 0, dimension);
                        viewGroup.setLayoutParams(this.R.getLayoutParams());
                        this.R.addView(viewGroup);
                    }
                    j1Var = this.g;
                    if (j1Var == null) {
                        ((b0) j1Var).d();
                        return;
                    }
                    return;
                }
            }
            viewGroup = null;
            if (str == null) {
            }
            f = this.Y;
            i3 = (int) ((50.0f * f) + 0.5f);
            if (i2 >= 0) {
                i = (int) (i * f);
                i2 = (int) (i2 * f);
                if (i < i3) {
                }
                if (i2 < i3) {
                }
            }
            if (this.j0 != null) {
                View view2 = new View(com.fyber.inneractive.sdk.util.o.a(this.b));
                view2.setBackgroundColor(com.fyber.inneractive.sdk.util.o.a(this.b).getResources().getColor(R.color.ia_mraid_expanded_dimmed_bk));
                view2.setOnTouchListener(new n());
                this.j0.addView(view2);
                ViewGroup.LayoutParams layoutParams22 = view2.getLayoutParams();
                layoutParams22.width = -1;
                layoutParams22.height = -1;
                view2.setLayoutParams(layoutParams22);
                com.fyber.inneractive.sdk.util.v.a(mVar);
                this.i0.addView(mVar);
                ViewGroup.LayoutParams layoutParams32 = mVar.getLayoutParams();
                layoutParams32.width = -1;
                layoutParams32.height = -1;
                mVar.setLayoutParams(layoutParams32);
                com.fyber.inneractive.sdk.util.v.a(this.i0);
                this.j0.addView(this.i0);
                FrameLayout frameLayout42 = this.i0;
                ViewGroup.LayoutParams layoutParams42 = frameLayout42.getLayoutParams();
                layoutParams42.width = i;
                layoutParams42.height = i2;
                frameLayout42.setLayoutParams(layoutParams42);
                com.fyber.inneractive.sdk.util.o.a(this.i0, 17);
            }
            frameLayout = this.j0;
            if (frameLayout != null) {
            }
            if (!mVar.hasFocus()) {
            }
            d0Var = this.P;
            if (d0Var != d0.ALWAYS_VISIBLE) {
            }
            c(true);
            com.fyber.inneractive.sdk.mraid.f0 f0Var2 = com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
            this.N = f0Var2;
            a(new com.fyber.inneractive.sdk.mraid.d0(f0Var2));
            i4 = this.d0;
            if (i4 != -1) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i4), com.fyber.inneractive.sdk.util.o.c(this.e0)));
            }
            a(com.fyber.inneractive.sdk.mraid.k.EXPAND);
            if (viewGroup != null) {
            }
            j1Var = this.g;
            if (j1Var == null) {
            }
        } catch (Exception unused) {
            IAlog.f("Couldn't find content in the view tree", new Object[0]);
            a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    public static HashMap a(Map map) {
        String str;
        HashMap hashMap = new HashMap();
        if (map.containsKey("description") && map.containsKey("start")) {
            hashMap.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                Date a = a((String) map.get("start"));
                if (a != null) {
                    hashMap.put("beginTime", Long.valueOf(a.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date a2 = a((String) map.get("end"));
                        if (a2 != null) {
                            hashMap.put("endTime", Long.valueOf(a2.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey("location")) {
                        hashMap.put("eventLocation", map.get("location"));
                    }
                    if (map.containsKey("summary")) {
                        hashMap.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        hashMap.put("availability", Integer.valueOf(X3.i.T.equals(map.get("transparency")) ? 1 : 0));
                    }
                    StringBuilder sb = new StringBuilder();
                    if (map.containsKey("frequency")) {
                        String str2 = (String) map.get("frequency");
                        int parseInt = map.containsKey("interval") ? Integer.parseInt((String) map.get("interval")) : -1;
                        if ("daily".equals(str2)) {
                            sb.append("FREQ=DAILY;");
                            if (parseInt != -1) {
                                sb.append("INTERVAL=" + parseInt + ";");
                            }
                        } else {
                            if ("weekly".equals(str2)) {
                                sb.append("FREQ=WEEKLY;");
                                if (parseInt != -1) {
                                    sb.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInWeek")) {
                                    String str3 = (String) map.get("daysInWeek");
                                    StringBuilder sb2 = new StringBuilder();
                                    boolean[] zArr = new boolean[7];
                                    String[] split = str3.split(StringUtils.COMMA);
                                    for (String str4 : split) {
                                        int parseInt2 = Integer.parseInt(str4);
                                        if (parseInt2 == 7) {
                                            parseInt2 = 0;
                                        }
                                        if (!zArr[parseInt2]) {
                                            StringBuilder sb3 = new StringBuilder();
                                            switch (parseInt2) {
                                                case 0:
                                                    str = "SU";
                                                    break;
                                                case 1:
                                                    str = "MO";
                                                    break;
                                                case 2:
                                                    str = "TU";
                                                    break;
                                                case 3:
                                                    str = "WE";
                                                    break;
                                                case 4:
                                                    str = "TH";
                                                    break;
                                                case 5:
                                                    str = "FR";
                                                    break;
                                                case 6:
                                                    str = "SA";
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of week ", parseInt2));
                                            }
                                            sb3.append(str);
                                            sb3.append(StringUtils.COMMA);
                                            sb2.append(sb3.toString());
                                            zArr[parseInt2] = true;
                                        }
                                    }
                                    if (split.length != 0) {
                                        sb2.deleteCharAt(sb2.length() - 1);
                                        String sb4 = sb2.toString();
                                        if (sb4 == null) {
                                            throw new IllegalArgumentException("invalid ");
                                        }
                                        sb.append("BYDAY=" + sb4 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                                    }
                                }
                            } else if ("monthly".equals(str2)) {
                                sb.append("FREQ=MONTHLY;");
                                if (parseInt != -1) {
                                    sb.append("INTERVAL=" + parseInt + ";");
                                }
                                if (map.containsKey("daysInMonth")) {
                                    String str5 = (String) map.get("daysInMonth");
                                    StringBuilder sb5 = new StringBuilder();
                                    boolean[] zArr2 = new boolean[63];
                                    String[] split2 = str5.split(StringUtils.COMMA);
                                    for (String str6 : split2) {
                                        int parseInt3 = Integer.parseInt(str6);
                                        int i = parseInt3 + 31;
                                        if (!zArr2[i]) {
                                            StringBuilder sb6 = new StringBuilder();
                                            if (parseInt3 != 0 && parseInt3 >= -31 && parseInt3 <= 31) {
                                                sb6.append("" + parseInt3);
                                                sb6.append(StringUtils.COMMA);
                                                sb5.append(sb6.toString());
                                                zArr2[i] = true;
                                            } else {
                                                throw new IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of month ", parseInt3));
                                            }
                                        }
                                    }
                                    if (split2.length != 0) {
                                        sb5.deleteCharAt(sb5.length() - 1);
                                        String sb7 = sb5.toString();
                                        if (sb7 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        sb.append("BYMONTHDAY=" + sb7 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                        }
                    }
                    String sb8 = sb.toString();
                    if (!TextUtils.isEmpty(sb8)) {
                        hashMap.put("rrule", sb8);
                    }
                    return hashMap;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    public static Date a(String str) {
        Date date = null;
        int i = 0;
        while (true) {
            String[] strArr = r0;
            if (i >= 2) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i], Locale.getDefault()).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
            i++;
        }
        return date;
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar, String str) {
        String a = kVar.a();
        m mVar = this.b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireErrorEvent('" + a + "', '" + str + "');");
        }
    }

    public static LinkedHashMap a(URI uri) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split(X3.j.c)) {
                int indexOf = str.indexOf("=");
                linkedHashMap.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : URLDecoder.decode(str.substring(i), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    public final void a(View view, com.fyber.inneractive.sdk.measurement.tracker.d dVar) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        if (view == null || (eVar = this.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.a;
            if (adSession != null) {
                if (dVar == com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton) {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.CLOSE_AD, dVar.name());
                } else if (dVar == com.fyber.inneractive.sdk.measurement.tracker.d.Watermark) {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.NOT_VISIBLE, dVar.name());
                } else {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, dVar.name());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.BANNER_RESIZE_EXPAND;
        InneractiveAdRequest inneractiveAdRequest = this.r;
        com.fyber.inneractive.sdk.flow.x xVar = this.s;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.b : null;
        JSONArray b = (xVar == null || (rVar = xVar.c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = b;
        wVar.a("action", kVar.a()).a((String) null);
    }
}
