package sg.bigo.ads.ad.banner;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.banner.b;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.aj.a;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.mraid.n;
import sg.bigo.ads.dm.b;

/* loaded from: classes11.dex */
public final class c<T extends Ad> implements b.InterfaceC1824b {
    private BannerAdRequest A;
    private AdSize B;
    WebView a;
    View b;
    b d;
    Runnable h;
    sg.bigo.ads.cv.b i;
    h j;
    final Context k;
    final T l;
    final sg.bigo.ads.api.core.i m;
    final boolean n;
    public WeakReference<Activity> p;
    public a q;
    public g r;

    @Nullable
    AdOptionsView s;

    @Nullable
    LinearLayout t;
    boolean u;

    @Nullable
    public sg.bigo.ads.common.view.c v;
    public sg.bigo.ads.ax.b w;
    private sg.bigo.ads.core.mraid.e x;

    @NonNull
    private final n y;
    public int c = 1;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    private boolean z = false;
    private final View.OnAttachStateChangeListener C = new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.banner.c.1
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            sg.bigo.ads.ad.banner.b.e(c.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            sg.bigo.ads.ad.banner.b.f(c.this);
            view.removeOnAttachStateChangeListener(this);
        }
    };
    final AtomicBoolean o = new AtomicBoolean(false);

    public interface a {
        void a(int i, int i2);
    }

    static class b implements a.InterfaceC1836a {
        private a.InterfaceC1836a c;
        private boolean b = false;
        Handler a = new Handler();

        b(a.InterfaceC1836a interfaceC1836a) {
            this.c = interfaceC1836a;
        }

        private boolean c() {
            if (this.b) {
                return true;
            }
            this.a.removeCallbacks(null);
            this.b = true;
            return false;
        }

        final void a() {
            a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error because of destroying before loaded"));
        }

        @Override // sg.bigo.ads.aj.a.InterfaceC1836a
        public final void a(sg.bigo.ads.api.core.c cVar) {
            a.InterfaceC1836a interfaceC1836a;
            if (c() || (interfaceC1836a = this.c) == null) {
                return;
            }
            interfaceC1836a.a(cVar);
        }

        @Override // sg.bigo.ads.aj.a.InterfaceC1836a
        public final void b() {
            a.InterfaceC1836a interfaceC1836a;
            if (c() || (interfaceC1836a = this.c) == null) {
                return;
            }
            interfaceC1836a.b();
        }
    }

    public c(Context context, sg.bigo.ads.api.core.g gVar, T t, sg.bigo.ads.api.core.i iVar, @NonNull n nVar, h hVar, boolean z) {
        this.k = context;
        this.l = t;
        this.m = iVar;
        this.y = nVar;
        this.j = hVar;
        this.n = z;
        if (gVar != null) {
            sg.bigo.ads.api.b bVar = gVar.c;
            if (bVar instanceof BannerAdRequest) {
                this.A = (BannerAdRequest) bVar;
            }
        }
        if (gVar == null || !r.b((CharSequence) gVar.c.f)) {
            return;
        }
        this.v = new sg.bigo.ads.common.view.c(context, gVar.c.f);
    }

    static /* synthetic */ View a(c cVar, View view) {
        LinearLayout linearLayout = new LinearLayout(cVar.k);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (view != null) {
            linearLayout.addView(view);
        }
        if (cVar.s == null) {
            cVar.s = new AdOptionsView(cVar.k);
        }
        AdOptionsView adOptionsView = cVar.s;
        sg.bigo.ads.api.core.i iVar = cVar.m;
        adOptionsView.a(iVar, iVar.m());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(cVar.k, 16), sg.bigo.ads.common.utils.f.a(cVar.k, 16), DivLayoutParams.DEFAULT_GRAVITY);
        layoutParams.leftMargin = sg.bigo.ads.common.utils.f.a(cVar.k, 10);
        cVar.s.setLayoutParams(layoutParams);
        linearLayout.addView(cVar.s);
        return linearLayout;
    }

    static /* synthetic */ TextView a(Context context, boolean z) {
        if (!z) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_tag, new Object[0]));
        textView.setBackgroundResource(R.drawable.bigo_ad_bg_ad_tag_white_border);
        textView.setTextColor(r.b("#B2FFFFFF", -1));
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(sg.bigo.ads.common.utils.f.a(context, 3), sg.bigo.ads.common.utils.f.a(context, 1), sg.bigo.ads.common.utils.f.a(context, 3), sg.bigo.ads.common.utils.f.a(context, 1));
        return textView;
    }

    static /* synthetic */ TextView a(Context context, boolean z, String str) {
        if (!z || r.a((CharSequence) str)) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setBackgroundResource(R.drawable.bigo_ad_banner_advertiser_background);
        textView.setTextColor(-1);
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(sg.bigo.ads.common.utils.f.a(context, 240));
        textView.setBackgroundColor(r.b("#FFD6D9DB", -7829368));
        textView.setPadding(sg.bigo.ads.common.utils.f.a(context, 4), sg.bigo.ads.common.utils.f.a(context, 1), sg.bigo.ads.common.utils.f.a(context, 4), sg.bigo.ads.common.utils.f.a(context, 1));
        return textView;
    }

    private void a(FrameLayout.LayoutParams layoutParams, int i, int i2) {
        layoutParams.width = i;
        layoutParams.height = i2;
        layoutParams.gravity = 17;
        this.b.setMinimumHeight(i2);
    }

    static /* synthetic */ void b(c cVar, View view) {
        if (cVar.y != n.INTERSTITIAL || cVar.w == null) {
            return;
        }
        v.a(view, new v.a() { // from class: sg.bigo.ads.ad.banner.c.4
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view2, @NonNull Rect rect) {
                c.this.w.a(view2, 0);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: sg.bigo.ads.dm.a.1.<init>(sg.bigo.ads.dm.a, android.content.Context):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @androidx.annotation.UiThread
    private boolean c(@androidx.annotation.Nullable final sg.bigo.ads.aj.a.InterfaceC1836a r14) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.banner.c.c(sg.bigo.ads.aj.a$a):boolean");
    }

    public final void a() {
        if (sg.bigo.ads.bh.d.b()) {
            b();
        } else {
            sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.6
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.b();
                }
            });
        }
    }

    public final void a(final a.InterfaceC1836a interfaceC1836a) {
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.5
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                if (cVar.c != 0) {
                    if (cVar.b(interfaceC1836a)) {
                        return;
                    }
                    interfaceC1836a.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when preload"));
                    return;
                }
                b bVar = cVar.d;
                if (bVar != null) {
                    bVar.a();
                }
                c.this.d = new b(interfaceC1836a);
                final b bVar2 = c.this.d;
                bVar2.a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.banner.c.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.b();
                    }
                }, 15000L);
                c cVar2 = c.this;
                if (cVar2.b(cVar2.d)) {
                    return;
                }
                c.this.d.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when preload"));
            }
        });
    }

    final void b() {
        try {
            sg.bigo.ads.ad.banner.b.h(this);
            sg.bigo.ads.cv.b bVar = this.i;
            if (bVar != null) {
                bVar.b();
            }
            b bVar2 = this.d;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (this.h != null) {
                this.h = null;
            }
            sg.bigo.ads.core.mraid.e eVar = this.x;
            if (eVar != null) {
                eVar.e();
                this.x = null;
            }
            View view = this.b;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.C);
                this.b = null;
            }
            WebView webView = this.a;
            if (webView != null) {
                v.b(webView);
                this.a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @UiThread
    public final boolean b(@Nullable a.InterfaceC1836a interfaceC1836a) {
        if (this.u) {
            return true;
        }
        boolean c = c(interfaceC1836a);
        this.u = c;
        return c;
    }

    @NonNull
    public final View c() {
        if (this.b == null) {
            sg.bigo.ads.bn.a.a(2, "BannerAd", "The banner ad is not ready, an empty view will be retrieved.");
            this.b = new FrameLayout(this.k);
        }
        sg.bigo.ads.ad.banner.b.d(this);
        this.b.addOnAttachStateChangeListener(this.C);
        return this.b;
    }

    public final String d() {
        sg.bigo.ads.api.core.i iVar = this.m;
        return iVar != null ? iVar.A() : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if ((r1 instanceof sg.bigo.ads.d.c) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        ((sg.bigo.ads.d.c) r1).c(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if ((r1 instanceof sg.bigo.ads.d.c) != false) goto L22;
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Context e() {
        Activity activity;
        T t;
        String str;
        WeakReference<Activity> weakReference = this.p;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            activity = null;
        } else {
            T t2 = this.l;
            if (t2 instanceof sg.bigo.ads.d.c) {
                ((sg.bigo.ads.d.c) t2).c(1);
            }
        }
        if (activity == null) {
            j jVar = k.a;
            if (this.y == n.INTERSTITIAL) {
                if (jVar != null && jVar.n().a(16)) {
                    activity = sg.bigo.ads.at.b.b();
                    if (activity == null) {
                        str = "Interstitial/Reward Video banner ad failed to get activity context.";
                        sg.bigo.ads.bn.a.a(0, "BannerAd", str);
                    } else {
                        t = this.l;
                    }
                }
            } else if (jVar != null && jVar.n().a(17)) {
                try {
                    Activity a2 = sg.bigo.ads.common.utils.d.a(this.b);
                    if (a2 != null) {
                        try {
                            T t3 = this.l;
                            if (t3 instanceof sg.bigo.ads.d.c) {
                                ((sg.bigo.ads.d.c) t3).c(3);
                            }
                        } catch (Exception unused) {
                        }
                        activity = a2;
                    }
                } catch (Exception unused2) {
                }
                if (activity == null) {
                    activity = sg.bigo.ads.at.b.b();
                    if (activity == null) {
                        str = "Banner ad failed to get activity context.";
                        sg.bigo.ads.bn.a.a(0, "BannerAd", str);
                    } else {
                        t = this.l;
                    }
                }
            }
        }
        return activity == null ? this.k : activity;
    }

    public final void f() {
        sg.bigo.ads.ad.banner.b.g(this);
        T t = this.l;
        if (t instanceof e) {
            ((e) t).a(sg.bigo.ads.ad.banner.b.i(this));
        }
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.f) {
            h();
            g();
            sg.bigo.ads.cv.b bVar = this.i;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    final void g() {
        WebView webView = this.a;
        if (webView != null) {
            webView.loadUrl("javascript:onViewImpression()");
        }
    }

    final void h() {
        final WebView webView = this.a;
        if (this.z || !(webView instanceof sg.bigo.ads.dm.b)) {
            return;
        }
        this.z = true;
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.3
            @Override // java.lang.Runnable
            public final void run() {
                b.C1891b c1891b;
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                sg.bigo.ads.dm.b bVar = (sg.bigo.ads.dm.b) webView;
                byte b2 = 0;
                if (k.a.n().a(0) || k.a.n().a(1)) {
                    b.C1891b c1891b2 = bVar.h;
                    sg.bigo.ads.dm.b.a(c1891b2);
                    if (k.a.n().a(1)) {
                        if (bVar.i == null) {
                            bVar.i = new b.c(bVar, b2);
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        c1891b2.d = bVar.i.a();
                        c1891b2.g = SystemClock.elapsedRealtime() - elapsedRealtime;
                        c1891b2.f = SystemClock.elapsedRealtime();
                    }
                    c1891b = c1891b2;
                } else {
                    c1891b = null;
                }
                if (c1891b != null) {
                    Boolean bool = c1891b.c;
                    if (bool == null && c1891b.d == null) {
                        return;
                    }
                    Boolean bool2 = c1891b.d;
                    if (bool != null) {
                        j = bool.booleanValue() ? 1L : 0L;
                        j2 = sg.bigo.ads.ad.banner.b.a(c.this, c1891b.e);
                    } else {
                        j = -1;
                        j2 = -1;
                    }
                    if (bool2 != null) {
                        long j6 = bool2.booleanValue() ? 1L : 0L;
                        long j7 = c1891b.g;
                        j4 = sg.bigo.ads.ad.banner.b.a(c.this, c1891b.f);
                        j3 = j6;
                        j5 = j7;
                    } else {
                        j3 = -1;
                        j4 = -1;
                        j5 = -1;
                    }
                    sg.bigo.ads.da.b.a(c.this.m, j, j2, j3, j4, j5);
                }
            }
        });
    }

    final AdSize i() {
        List<AdSize> list;
        if (this.B == null) {
            BannerAdRequest bannerAdRequest = this.A;
            if (bannerAdRequest != null && (list = bannerAdRequest.h) != null) {
                Iterator<AdSize> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AdSize next = it.next();
                    if (!next.a.equals(AdSize.ADAPTIVE)) {
                        this.B = next;
                        break;
                    }
                }
            }
            if (this.B == null) {
                Context context = this.k;
                this.B = sg.bigo.ads.common.utils.f.c(context, context.getResources().getDisplayMetrics().widthPixels) > 720 ? AdSize.LEADERBOARD : AdSize.BANNER;
            }
        }
        return this.B;
    }
}
