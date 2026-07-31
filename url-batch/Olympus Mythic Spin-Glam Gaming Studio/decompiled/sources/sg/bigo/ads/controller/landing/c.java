package sg.bigo.ads.controller.landing;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.aj.h;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.bo.g;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.landing.WebViewActivityImpl;

/* loaded from: classes13.dex */
public class c extends WebViewActivityImpl implements h {
    private final int a;
    private String b;
    private long c;
    private int d;
    private int e;
    private boolean f;
    private final int g;
    private final long h;

    @Nullable
    private sg.bigo.ads.controller.landing.a i;
    private boolean j;
    private final int k;
    private final List<h.a> l;
    private int m;

    @IntRange
    private int n;
    private int o;
    private final String p;

    @Nullable
    private WebHistoryItem q;
    private boolean r;
    private final HashMap<String, a> s;
    private final ValueCallback<Boolean> t;

    @Nullable
    public sg.bigo.ads.d.c<?, ?> u;

    @Nullable
    protected sg.bigo.ads.api.core.b v;
    protected boolean w;
    protected int x;
    protected boolean y;

    protected class a {
        public String a;
        public long b;
        public long c;
        public int d;

        protected a() {
        }
    }

    static class b implements h.a {
        private final int a;
        private final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = System.currentTimeMillis() - j;
        }

        /* synthetic */ b(int i, long j, byte b) {
            this(i, j);
        }

        @Override // sg.bigo.ads.aj.h.a
        public final int a() {
            return this.a;
        }

        @Override // sg.bigo.ads.aj.h.a
        public final long b() {
            return this.b;
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [sg.bigo.ads.api.core.b] */
    public c(@NonNull Activity activity) {
        super(activity);
        int i;
        int i2;
        this.a = 300;
        this.c = -1L;
        this.d = 0;
        this.f = false;
        this.l = new ArrayList();
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.y = false;
        this.s = new HashMap<>();
        this.t = new ValueCallback<Boolean>() { // from class: sg.bigo.ads.controller.landing.c.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Boolean bool) {
                Boolean bool2 = bool;
                if (c.this.B != null) {
                    if (bool2 == null || !bool2.booleanValue()) {
                        ViewParent parent = c.this.B.getParent();
                        if (parent instanceof ViewGroup) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.addTransition(new Fade(1));
                            transitionSet.setDuration(300L);
                            TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
                        }
                    }
                    c.this.B.setEnabled(true);
                    c.this.B.setVisibility(0);
                }
            }
        };
        Intent intent = this.N.getIntent();
        int i3 = -1;
        if (intent != null) {
            int intExtra = intent.getIntExtra("ad_identifier", -1);
            this.k = intent.getIntExtra("land_way", -1);
            i = intent.getIntExtra("webview_force_time", -1);
            i3 = intExtra;
        } else {
            this.k = -1;
            i = -1;
        }
        sg.bigo.ads.d.c<?, ?> b2 = d.b(i3);
        this.u = b2;
        if (b2 != null) {
            this.v = b2.f();
            this.g = this.u.s();
            this.h = this.u.t();
            this.i = this.u.m;
            this.b = this.v.O().f();
            this.e = this.v.d().f();
        } else {
            this.g = 0;
            this.h = System.currentTimeMillis();
        }
        if (i < 9) {
            switch (i) {
                case -1:
                case 0:
                default:
                    this.r = true;
                    this.w = false;
                    this.x = 0;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    this.r = false;
                    this.w = true;
                    i2 = i + 1;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    this.r = true;
                    this.w = false;
                    i2 = i - 3;
                    break;
            }
            this.p = a(activity);
        }
        this.r = true;
        this.w = false;
        i2 = i - 9;
        this.x = i2;
        this.p = a(activity);
    }

    private static String a(Activity activity) {
        String packageName;
        String str;
        try {
            packageName = activity.getPackageName();
            str = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).taskAffinity;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (TextUtils.equals(packageName, str)) {
            return null;
        }
        return str;
    }

    private void a(int i) {
        b bVar = new b(i, this.h, (byte) 0);
        this.l.add(0, bVar);
        sg.bigo.ads.api.core.b bVar2 = this.v;
        if (bVar2 != null) {
            sg.bigo.ads.da.b.a(this, bVar, bVar2, this.u, this.p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        super.J();
        sg.bigo.ads.controller.landing.a aVar = this.i;
        if (aVar != null) {
            aVar.d = false;
            this.i = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        this.c = SystemClock.elapsedRealtime();
        a(1);
        super.X();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i, String str, String str2) {
        super.a(i, str, str2);
        a(str2, 0);
        if (this.f) {
            return;
        }
        a(6);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        a(str, 1);
        if (!this.f) {
            this.n = 100;
            a(5);
            if (this.w) {
                y();
            }
        }
        this.f = true;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str, int i) {
        a aVar;
        if (TextUtils.isEmpty(str) || (aVar = this.s.get(str)) == null || aVar.d != -1) {
            return;
        }
        aVar.c = System.currentTimeMillis();
        aVar.d = i;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z) {
        super.a(str, z);
        if (z) {
            a(4);
        }
        int i = this.d;
        if (i == 0) {
            this.E = str;
        }
        this.d = i + 1;
        c(str);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(@NonNull e eVar) {
        sg.bigo.ads.api.core.b bVar = this.v;
        if (bVar != null) {
            sg.bigo.ads.da.b.a(bVar, 2, eVar, this.u);
            e eVar2 = this.G;
            if (eVar2 == null || this.u == null || eVar2.b() < 0) {
                return;
            }
            int b2 = this.G.b();
            e eVar3 = this.G;
            if (!eVar3.e && b2 == 1) {
                eVar3.c();
                this.u.a(this.G.d);
            }
            if ((b2 == 1 || b2 == 4) && !this.G.e) {
                return;
            }
            if (b2 == 1) {
                this.G.c();
            }
            ?? f = this.u.f();
            int b3 = this.G.b();
            sg.bigo.ads.api.core.d dVar = this.G.d;
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) f, b3, 2, dVar != null ? dVar.b : "", dVar != null ? dVar.c : "");
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void al() {
        super.al();
        if (this.u != null) {
            d.a();
            this.u = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        if (this.r || this.w) {
            r();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void c(int i) {
        super.c(i);
        this.n = Math.max(this.n, i);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void c(String str) {
        if (!TextUtils.isEmpty(str) && this.s.get(str) == null) {
            a aVar = new a();
            aVar.a = str;
            aVar.b = System.currentTimeMillis();
            aVar.d = -1;
            this.s.put(str, aVar);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d(String str) {
        super.d(str);
        this.o++;
        this.m = !URLUtil.isNetworkUrl(str) ? 1 : 0;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final String e(String str) {
        sg.bigo.ads.api.core.b bVar = this.v;
        return bVar != null ? sg.bigo.ads.core.landing.a.a(bVar.O().i(), this.v.O().j(), str) : super.e(str);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void e() {
        super.e();
        if (this.r) {
            y();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void f(int i) {
        if (w()) {
            return;
        }
        super.f(i);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void g(int i) {
        super.g(i);
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            sg.bigo.ads.bs.a aVar = new sg.bigo.ads.bs.a(sg.bigo.ads.bx.a.a(), new sg.bigo.ads.bs.d(str), this.N);
            aVar.l = sg.bigo.ads.bp.e.a();
            g.a(aVar, null);
        }
        if (this.v != null) {
            JSONArray jSONArray = new JSONArray();
            for (a aVar2 : this.s.values()) {
                if (aVar2.d == -1) {
                    aVar2.c = System.currentTimeMillis();
                    aVar2.d = 1;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", URLEncoder.encode(aVar2.a, "UTF-8"));
                    jSONObject.put("s_ts", aVar2.b);
                    jSONObject.put("e_ts", aVar2.c);
                    jSONObject.put("type", aVar2.d);
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
            }
            sg.bigo.ads.da.b.a(this, this.l.isEmpty() ? null : this.l.get(0), System.currentTimeMillis() - this.h, this.d, this.v, this.u, this.p, jSONArray.toString());
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z) {
        if (z) {
            aL();
        }
    }

    @Override // sg.bigo.ads.aj.h
    public int i() {
        return 0;
    }

    @Override // sg.bigo.ads.aj.h
    public final String j() {
        return this.E;
    }

    @Override // sg.bigo.ads.aj.h
    public final int k() {
        return this.m;
    }

    @Override // sg.bigo.ads.aj.h
    public final int l() {
        return this.o;
    }

    @Override // sg.bigo.ads.aj.h
    public final int m() {
        return this.n;
    }

    @Override // sg.bigo.ads.aj.h
    public final boolean n() {
        sg.bigo.ads.controller.landing.a aVar = this.i;
        return aVar != null && aVar.d;
    }

    @Override // sg.bigo.ads.aj.h
    public final int o() {
        return this.g;
    }

    @Override // sg.bigo.ads.aj.h
    public final int p() {
        return this.k;
    }

    @Override // sg.bigo.ads.aj.h
    @Nullable
    public final Map<String, String> q() {
        return null;
    }

    protected final void r() {
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.B.setEnabled(false);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void s() {
        super.s();
        WebView webView = this.D;
        if (webView != null) {
            webView.setDownloadListener(new DownloadListener() { // from class: sg.bigo.ads.controller.landing.c.2
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    WebViewClient webViewClient;
                    if (c.this.H) {
                        return;
                    }
                    c.this.a(str, 4);
                    if (Build.VERSION.SDK_INT < 26 || c.this.D == null) {
                        c.this.a(str);
                    } else {
                        webViewClient = c.this.D.getWebViewClient();
                        webViewClient.onPageFinished(c.this.D, str);
                    }
                    c.this.d(0);
                }
            });
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    @Nullable
    public final WebView t() {
        sg.bigo.ads.dm.e eVar;
        sg.bigo.ads.controller.landing.a aVar = this.i;
        sg.bigo.ads.dm.e eVar2 = null;
        if (aVar != null && aVar.b() && (eVar = aVar.f) != null) {
            v.b(eVar);
            sg.bigo.ads.dm.e eVar3 = aVar.f;
            aVar.f = null;
            eVar2 = eVar3;
        }
        if (eVar2 == null) {
            return super.t();
        }
        this.j = true;
        return eVar2;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void u() {
        a(2);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void v() {
        if (this.D == null) {
            return;
        }
        sg.bigo.ads.controller.landing.a aVar = this.i;
        if (aVar != null) {
            if (aVar.c == 2 && !r.a((CharSequence) aVar.e)) {
                this.D.loadDataWithBaseURL(this.E, this.i.e, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                a(3);
            }
            int i = this.i.c;
            if (i == 3 && this.j) {
                this.F = SystemClock.elapsedRealtime();
                b(this.D.getTitle());
                if (this.i.d) {
                    ProgressBar progressBar = this.A;
                    if (progressBar != null) {
                        progressBar.setAlpha(0.0f);
                    }
                    a(this.E);
                    return;
                }
                return;
            }
            if (i == 4 && this.j) {
                this.q = this.D.copyBackForwardList().getCurrentItem();
            }
        }
        sg.bigo.ads.api.core.b bVar = this.v;
        if (bVar != null) {
            this.E = sg.bigo.ads.core.landing.a.a(bVar.O().i(), this.v.O().j(), this.E);
        }
        super.v();
        c(this.E);
        a(3);
    }

    public final boolean w() {
        int i;
        if (this.r || this.w) {
            ImageView imageView = this.B;
            return (imageView == null || imageView.isEnabled()) ? false : true;
        }
        if (!this.f && (i = this.e) > 0 && i <= 10000) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
            if (elapsedRealtime > 0 && elapsedRealtime < i) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean x() {
        WebView webView = this.D;
        if (webView == null) {
            return false;
        }
        if (this.q != null) {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            int currentIndex = copyBackForwardList.getCurrentIndex();
            if (currentIndex <= 0) {
                return super.x();
            }
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(currentIndex - 1);
            if (itemAtIndex != null) {
                return (TextUtils.equals(this.q.getOriginalUrl(), itemAtIndex.getOriginalUrl()) || TextUtils.equals(this.q.getUrl(), itemAtIndex.getUrl())) ? false : true;
            }
        }
        return super.x();
    }

    protected final void y() {
        if (this.x <= 0) {
            this.t.onReceiveValue(Boolean.TRUE);
            return;
        }
        WebView webView = this.D;
        if (webView != null) {
            webView.postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.landing.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.t != null) {
                        c.this.t.onReceiveValue(Boolean.FALSE);
                    }
                }
            }, s.a.a(this.x));
        }
    }
}
