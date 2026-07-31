package sg.bigo.ads.g;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.bh.d;
import sg.bigo.ads.bj.e;
import sg.bigo.ads.bj.f;
import sg.bigo.ads.bj.g;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.dh.a;
import sg.bigo.ads.dh.p;
import sg.bigo.ads.h.c;

/* loaded from: classes12.dex */
public final class c implements sg.bigo.ads.h.c {

    @NonNull
    final sg.bigo.ads.api.core.b a;

    @Nullable
    final c.b b;
    View c;
    WebView d;
    View e;
    public c.a f;
    long h;
    boolean i;
    a.C1889a k;
    private final boolean l;

    @Nullable
    private final sg.bigo.ads.core.player.c n;

    @Nullable
    private final p o;

    @NonNull
    private final Ad p;
    boolean g = false;
    boolean j = false;

    @NonNull
    private final List<a.C1889a> m = new ArrayList();

    class a extends FrameLayout {
        private i b;

        public a(Context context) {
            super(context);
            this.b = new i();
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.b.b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.b.a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    class b implements View.OnTouchListener {
        final a.C1889a a;
        final ViewConfiguration b;
        final int c;
        float e;
        float f;
        boolean d = false;
        i g = new i();

        public b(Context context, a.C1889a c1889a) {
            this.a = c1889a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.b = viewConfiguration;
            this.c = viewConfiguration.getScaledTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                this.d = true;
                this.e = motionEvent.getX();
                this.f = motionEvent.getY();
                this.g.a = new Point((int) this.e, (int) this.f);
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.d) {
                    this.d = false;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.g.b = new Point((int) x, (int) y);
                    if (Math.abs(this.e - x) < this.c && Math.abs(this.f - y) < this.c) {
                        c cVar = c.this;
                        cVar.a(cVar.g().b.e, this.g);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                this.d = false;
            }
            return true;
        }
    }

    public c(@NonNull Ad ad, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable c.b bVar2) {
        this.n = cVar;
        this.o = pVar;
        this.p = ad;
        this.a = bVar;
        this.b = bVar2;
        if (pVar != null) {
            Iterator<sg.bigo.ads.dh.a> it = pVar.A.iterator();
            while (it.hasNext()) {
                List<a.C1889a> list = it.next().b;
                if (list != null) {
                    for (a.C1889a c1889a : list) {
                        if (c1889a.a() && c1889a.b()) {
                            this.m.add(c1889a);
                        }
                    }
                    for (a.C1889a c1889a2 : list) {
                        if (c1889a2.a() && c1889a2.c()) {
                            this.m.add(c1889a2);
                        }
                    }
                }
            }
        }
        this.l = !this.m.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final List<a.C1889a> list, @Nullable final a.C1889a c1889a, final int i) {
        d.b(new Runnable() { // from class: sg.bigo.ads.g.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (c.this.g) {
                    return;
                }
                if (!list.isEmpty()) {
                    c.this.k = (a.C1889a) list.remove(0);
                    String str = c.this.k.b;
                    if (URLUtil.isNetworkUrl(str)) {
                        e.a(context, str, c.this.a.am(), new g() { // from class: sg.bigo.ads.g.c.1.1
                            @Override // sg.bigo.ads.bj.g
                            public final void a(int i2, @NonNull String str2, @Nullable f fVar) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                c cVar = c.this;
                                cVar.a(context, list, cVar.k, i + 1);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v20, types: [android.view.View, sg.bigo.ads.common.view.AdImageView] */
                            @Override // sg.bigo.ads.bj.g
                            public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                                String str2;
                                String obj;
                                File file;
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                final c cVar = c.this;
                                final Context context2 = context;
                                a.C1889a c1889a2 = cVar.k;
                                int i2 = i;
                                WebView webView = null;
                                if (c1889a2.b()) {
                                    ?? adImageView = new AdImageView(context2);
                                    adImageView.setImageBitmap(bitmap);
                                    adImageView.setOnTouchListener(cVar.new b(context2, c1889a2));
                                    str2 = null;
                                    webView = adImageView;
                                } else if (c1889a2.c()) {
                                    try {
                                        file = new File(fVar.d);
                                    } catch (Exception e) {
                                        obj = e.toString();
                                    }
                                    if (file.exists()) {
                                        URI uri = file.toURI();
                                        WebView webView2 = new WebView(context2);
                                        webView2.getSettings().setAllowFileAccess(true);
                                        webView2.getSettings().setAllowFileAccessFromFileURLs(false);
                                        webView2.getSettings().setAllowUniversalAccessFromFileURLs(false);
                                        if (uri.toString().startsWith("file://")) {
                                            webView2.getSettings().setJavaScriptEnabled(false);
                                        } else {
                                            webView2.getSettings().setJavaScriptEnabled(true);
                                        }
                                        webView2.loadUrl(uri.toString());
                                        webView2.getSettings().setLoadWithOverviewMode(true);
                                        webView2.getSettings().setUseWideViewPort(true);
                                        webView2.setOnTouchListener(cVar.new b(context2, c1889a2));
                                        cVar.d = webView2;
                                        str2 = null;
                                        webView = webView2;
                                    } else {
                                        obj = "git file not exists";
                                        str2 = obj;
                                    }
                                } else {
                                    str2 = null;
                                }
                                if (webView == null) {
                                    c.b bVar = cVar.b;
                                    if (bVar != null) {
                                        cVar.j = true;
                                        bVar.a(cVar.a, SystemClock.elapsedRealtime() - cVar.h, c1889a2.b, i2, c1889a2.e, str2);
                                        return;
                                    }
                                    return;
                                }
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                if (width <= 0 || height <= 0) {
                                    width = sg.bigo.ads.common.utils.f.a(context2, c1889a2.c);
                                    height = sg.bigo.ads.common.utils.f.a(context2, c1889a2.d);
                                }
                                float f = context2.getResources().getDisplayMetrics().widthPixels;
                                float c = sg.bigo.ads.common.utils.f.c(context2);
                                if (f > 0.0f && c > 0.0f) {
                                    float f2 = height;
                                    float f3 = width;
                                    float f4 = (f2 * f) / f3;
                                    if (f4 > c) {
                                        f = (f3 * c) / f2;
                                    } else {
                                        c = f4;
                                    }
                                    width = (int) f;
                                    height = (int) c;
                                }
                                FrameLayout.LayoutParams layoutParams = (width <= 0 || height <= 0) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(width, height, 17);
                                final a aVar = cVar.new a(context2);
                                aVar.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.g.c.2
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        c.this.a(context2, aVar.b);
                                    }
                                });
                                cVar.e = webView;
                                aVar.addView(webView, layoutParams);
                                cVar.c = aVar;
                                c.b bVar2 = cVar.b;
                                if (bVar2 != null) {
                                    cVar.i = true;
                                    bVar2.a(cVar.a, SystemClock.elapsedRealtime() - cVar.h, c1889a2.b, i2, c1889a2.e);
                                }
                            }
                        });
                        return;
                    } else {
                        c cVar = c.this;
                        cVar.a(context, list, cVar.k, i + 1);
                        return;
                    }
                }
                c cVar2 = c.this;
                c.b bVar = cVar2.b;
                if (bVar != null) {
                    sg.bigo.ads.api.core.b bVar2 = cVar2.a;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - c.this.h;
                    a.C1889a c1889a2 = c1889a;
                    bVar.a(bVar2, elapsedRealtime, c1889a2 == null ? null : c1889a2.b, i - 1, c1889a2 == null ? null : c1889a2.e, "load failed");
                }
            }
        });
    }

    @Override // sg.bigo.ads.h.a
    @Nullable
    public final View a() {
        return this.c;
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i) {
        sg.bigo.ads.core.player.c cVar;
        if (i != 1 || (cVar = this.n) == null) {
            return;
        }
        cVar.a();
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        int i3;
        int i4;
        View view = this.e;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || (i3 = layoutParams.width) == -1 || (i4 = layoutParams.height) == 0 || i3 == 0) {
            return;
        }
        if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = i4;
            float f3 = i3;
            float f4 = (f2 * f) / f3;
            float f5 = i2;
            if (f4 > f5) {
                f = (f3 * f5) / f2;
                f4 = f5;
            }
            i3 = (int) f;
            i4 = (int) f4;
        }
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.e = null;
    }

    public final void a(Context context, i iVar) {
        sg.bigo.ads.api.core.e a2;
        int i;
        Ad ad = this.p;
        if (ad instanceof sg.bigo.ads.aj.f) {
            ((sg.bigo.ads.aj.f) ad).M();
        }
        if (this.a.g().c() == 0 || !(this.p instanceof sg.bigo.ads.d.c)) {
            boolean a3 = this.a.a(16);
            Activity a4 = sg.bigo.ads.common.utils.d.a(this.c);
            Ad ad2 = this.p;
            sg.bigo.ads.api.core.b bVar = this.a;
            a2 = sg.bigo.ads.g.a.a(context, a4, ad2, bVar, null, this.o, this.k, a3, bVar.a(64));
            i = 0;
        } else {
            sg.bigo.ads.controller.landing.d.a(this.c.getContext(), g());
            a2 = new sg.bigo.ads.api.core.e();
            i = 1;
        }
        a2.m = i;
        sg.bigo.ads.core.player.c cVar = this.n;
        if (cVar != null && !cVar.a(this.a)) {
            this.n.a(this.a, 6, 13);
        }
        c.a aVar = this.f;
        if (aVar != null) {
            aVar.a(iVar, a2);
        }
    }

    @Override // sg.bigo.ads.h.a
    public final boolean a(Context context) {
        if (!this.l || this.g || this.m.isEmpty()) {
            return false;
        }
        this.h = SystemClock.elapsedRealtime();
        c.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.a);
        }
        a(context, this.m, null, 0);
        return true;
    }

    @Override // sg.bigo.ads.h.a
    public final boolean b() {
        return (this.g || this.c == null) ? false : true;
    }

    @Override // sg.bigo.ads.h.a
    public final void c() {
        View view = this.c;
        if (view instanceof WebView) {
            ((WebView) view).onResume();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void d() {
        View view = this.c;
        if (view instanceof WebView) {
            ((WebView) view).onPause();
        }
    }

    @Override // sg.bigo.ads.h.a
    @SuppressLint({"ClickableViewAccessibility"})
    public final void e() {
        WebView webView = this.d;
        if (webView != null) {
            webView.setOnTouchListener(null);
            this.d.destroy();
            this.d = null;
        }
        View view = this.c;
        if (view != null) {
            v.b(view);
            this.c = null;
        }
        this.g = true;
    }

    @Override // sg.bigo.ads.h.a
    public final void f() {
        c.b bVar;
        if (this.j || this.i || (bVar = this.b) == null || this.h <= 0) {
            return;
        }
        bVar.a(this.a, SystemClock.elapsedRealtime() - this.h);
    }

    final sg.bigo.ads.d.c<?, ?> g() {
        Ad ad = this.p;
        return ad instanceof sg.bigo.ads.aa.c ? (sg.bigo.ads.aa.c) ad : ad instanceof sg.bigo.ads.aa.d ? (sg.bigo.ads.aa.d) ad : ad instanceof t ? ((t) ad).K() : (sg.bigo.ads.d.c) ad;
    }
}
