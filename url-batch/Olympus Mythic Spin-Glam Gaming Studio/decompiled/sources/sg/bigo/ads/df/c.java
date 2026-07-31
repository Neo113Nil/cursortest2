package sg.bigo.ads.df;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.de.b;

/* loaded from: classes14.dex */
public abstract class c {

    @NonNull
    private final Map<String, String> a;
    protected r f;
    protected f g;
    public CopyOnWriteArrayList<e> l;
    public CopyOnWriteArrayList<e> m;
    public CopyOnWriteArrayList<e> n;
    public CopyOnWriteArrayList<e> o;
    private int p;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public long k = 0;
    public CopyOnWriteArrayList<e> b = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<e> c = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<e> d = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<e> e = new CopyOnWriteArrayList<>();

    public c(r rVar) {
        this.f = rVar;
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.g = new f(this.f, hashMap);
    }

    private void a(Context context, final String str, final e eVar, final boolean z) {
        String str2 = eVar.b;
        sg.bigo.ads.bo.a d = eVar.d();
        boolean z2 = eVar.e;
        int i = eVar.c;
        eVar.a();
        sg.bigo.ads.de.b.a(context, i, str, d, str2, z2, this.p, this.a, new b.a() { // from class: sg.bigo.ads.df.c.5
            @Override // sg.bigo.ads.de.b.a
            public final void a() {
                e eVar2 = eVar;
                if (eVar2.d == 1) {
                    c.a(c.this, str, eVar2, true);
                }
                d.a().b(c.this.g);
            }

            @Override // sg.bigo.ads.de.b.a
            public final boolean a(int i2) {
                return c.this.f.a(i2);
            }

            @Override // sg.bigo.ads.de.b.a
            public final void b() {
                c.a(c.this, str, eVar, z);
                d.a().b(c.this.g);
            }
        });
    }

    static /* synthetic */ void a(c cVar, Context context, final String str, e eVar) {
        String a = eVar.d().a();
        final String str2 = eVar.b;
        if (TextUtils.isEmpty(a)) {
            return;
        }
        if ("sizmek".equals(str2)) {
            a = a.replaceAll("\\?", "%3f");
        }
        cVar.a(str, "start", new sg.bigo.ads.bs.d(a), str2);
        final sg.bigo.ads.dm.e a2 = sg.bigo.ads.dm.e.a(context);
        if (a2 != null) {
            a2.setWebViewClient(new sg.bigo.ads.dm.d() { // from class: sg.bigo.ads.df.c.6
                @Override // sg.bigo.ads.dm.d
                public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                    a2.destroy();
                }

                @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str3) {
                    super.onPageFinished(webView, str3);
                    c.this.a(str, "success", new sg.bigo.ads.bs.d(str3), str2);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                    return false;
                }
            });
            try {
                int i = eVar.a;
                if (i == 1) {
                    a2.loadUrl(a);
                } else if (i == 2) {
                    a2.loadData(a, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8");
                }
            } catch (Exception e) {
                sg.bigo.ads.da.b.a(3002, 10106, e.getMessage());
            }
        }
    }

    static /* synthetic */ void a(c cVar, String str, e eVar, boolean z) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        CopyOnWriteArrayList<e> copyOnWriteArrayList2;
        CopyOnWriteArrayList<e> copyOnWriteArrayList3;
        CopyOnWriteArrayList<e> copyOnWriteArrayList4;
        if ("impl_track".equals(str)) {
            if (!z || (copyOnWriteArrayList4 = cVar.l) == null) {
                return;
            }
            copyOnWriteArrayList4.remove(eVar);
            return;
        }
        if ("click_track".equals(str)) {
            if (!z || (copyOnWriteArrayList3 = cVar.m) == null) {
                return;
            }
            copyOnWriteArrayList3.remove(eVar);
            return;
        }
        if ("nurl_track".equals(str)) {
            if (!z || (copyOnWriteArrayList2 = cVar.n) == null) {
                return;
            }
            copyOnWriteArrayList2.remove(eVar);
            return;
        }
        if ("lurl_track".equals(str) && z && (copyOnWriteArrayList = cVar.o) != null) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    public final void a(int i) {
        this.p = i;
        f fVar = this.g;
        if (fVar != null) {
            fVar.r = i;
        }
    }

    public final void a(Context context, String str, String str2, String str3, boolean z) {
        h a = h.a(this.a, this.f, this.p, str, str2, str3, z);
        a.a(context, a.a);
    }

    protected final void a(final Context context, boolean z) {
        if (sg.bigo.ads.bw.a.s()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f.a;
        Iterator<e> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z2) {
            this.j = currentTimeMillis;
            this.n = new CopyOnWriteArrayList<>();
            Iterator<e> it2 = this.d.iterator();
            while (it2.hasNext()) {
                e next = it2.next();
                if (!z || next.a()) {
                    if (next.c()) {
                        this.n.add(next);
                    }
                }
            }
            if (this.n.size() > 0) {
                f fVar = this.g;
                fVar.u = this.n;
                fVar.n = currentTimeMillis;
                fVar.m = 0;
                d.a().a(this.g);
            }
        }
        Iterator<e> it3 = this.d.iterator();
        while (it3.hasNext()) {
            final e next2 = it3.next();
            if (!z || next2.a()) {
                if (next2.c()) {
                    a(context, "nurl_track", next2, z2);
                } else {
                    sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.df.c.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "nurl_track", next2);
                        }
                    });
                }
            }
        }
    }

    protected final void a(final Context context, boolean z, int i) {
        if (sg.bigo.ads.bw.a.s()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f.a;
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (i > 0) {
                next.a("ad_imp_indx", String.valueOf(i));
            }
            next.e();
        }
        if (z2) {
            this.h = currentTimeMillis;
            this.l = new CopyOnWriteArrayList<>();
            Iterator<e> it2 = this.b.iterator();
            while (it2.hasNext()) {
                e next2 = it2.next();
                if (!z || next2.a()) {
                    if (next2.c()) {
                        this.l.add(next2);
                    }
                }
            }
            if (this.l.size() > 0) {
                f fVar = this.g;
                fVar.s = this.l;
                fVar.j = currentTimeMillis;
                fVar.i = 0;
                d.a().a(this.g);
            }
        }
        Iterator<e> it3 = this.b.iterator();
        while (it3.hasNext()) {
            final e next3 = it3.next();
            if (!z || next3.a()) {
                if (next3.c()) {
                    a(context, "impl_track", next3, z2);
                } else {
                    sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.df.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "impl_track", next3);
                        }
                    });
                }
            }
        }
    }

    protected final void a(final Context context, boolean z, int i, int i2) {
        if (sg.bigo.ads.bw.a.s()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f.a;
        Iterator<e> it = this.c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (i > 0) {
                next.a("ad_click_indx", String.valueOf(i));
            }
            if (i2 > 0) {
                next.a("ad_imp_indx", String.valueOf(i2));
            }
            next.e();
        }
        if (z2) {
            this.i = currentTimeMillis;
            this.m = new CopyOnWriteArrayList<>();
            Iterator<e> it2 = this.c.iterator();
            while (it2.hasNext()) {
                e next2 = it2.next();
                if (!z || next2.a()) {
                    if (next2.c()) {
                        this.m.add(next2);
                    }
                }
            }
            if (this.m.size() > 0) {
                f fVar = this.g;
                fVar.t = this.m;
                fVar.l = currentTimeMillis;
                fVar.k = 0;
                d.a().a(this.g);
            }
        }
        Iterator<e> it3 = this.c.iterator();
        while (it3.hasNext()) {
            final e next3 = it3.next();
            if (!z || next3.a()) {
                if (next3.c()) {
                    a(context, "click_track", next3, z2);
                } else {
                    sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.df.c.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "click_track", next3);
                        }
                    });
                }
            }
        }
    }

    protected final void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.a.put(str, str2);
    }

    final void a(String str, String str2, sg.bigo.ads.bo.a aVar, String str3) {
        HashMap hashMap = new HashMap(this.a);
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        hashMap.put("action", str);
        hashMap.put("track_url", aVar.a());
        hashMap.put("domain_front", aVar.e() ? aVar.d() : "");
        hashMap.put("track_name", str3);
        hashMap.put("states", str2);
        hashMap.put("retry", "0");
        hashMap.put("out_ad", String.valueOf(this.p));
        if ("impl_track".equals(str)) {
            sg.bigo.ads.da.b.a(hashMap);
        } else if ("click_track".equals(str)) {
            sg.bigo.ads.da.b.b(hashMap);
        }
    }

    protected final void b(final Context context, boolean z) {
        if (sg.bigo.ads.bw.a.s()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f.a;
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z2) {
            this.k = currentTimeMillis;
            this.o = new CopyOnWriteArrayList<>();
            Iterator<e> it2 = this.e.iterator();
            while (it2.hasNext()) {
                e next = it2.next();
                if (!z || next.a()) {
                    if (next.c()) {
                        this.o.add(next);
                    }
                }
            }
            if (this.o.size() > 0) {
                f fVar = this.g;
                fVar.v = this.o;
                fVar.p = currentTimeMillis;
                fVar.o = 0;
                d.a().a(this.g);
            }
        }
        Iterator<e> it3 = this.e.iterator();
        while (it3.hasNext()) {
            final e next2 = it3.next();
            if (!z || next2.a()) {
                if (next2.c()) {
                    a(context, "lurl_track", next2, z2);
                } else {
                    sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.df.c.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "lurl_track", next2);
                        }
                    });
                }
            }
        }
    }

    public final void b(@NonNull String str, @NonNull String str2) {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.c()) {
                next.a(str, str2);
            }
        }
        Iterator<e> it2 = this.c.iterator();
        while (it2.hasNext()) {
            e next2 = it2.next();
            if (next2.c()) {
                next2.a(str, str2);
            }
        }
        Iterator<e> it3 = this.d.iterator();
        while (it3.hasNext()) {
            e next3 = it3.next();
            if (next3.c()) {
                next3.a(str, str2);
            }
        }
        Iterator<e> it4 = this.e.iterator();
        while (it4.hasNext()) {
            e next4 = it4.next();
            if (next4.c()) {
                next4.a(str, str2);
            }
        }
    }
}
