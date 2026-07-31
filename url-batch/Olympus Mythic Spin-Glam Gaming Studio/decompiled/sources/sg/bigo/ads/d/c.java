package sg.bigo.ads.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.aj.f;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.at.b;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.controller.landing.a;
import sg.bigo.ads.d.a;
import sg.bigo.ads.df.e;

/* loaded from: classes13.dex */
public abstract class c<T extends Ad, U extends sg.bigo.ads.api.core.b> extends sg.bigo.ads.aj.a<T, U> implements b.a {
    private boolean A;
    private AtomicBoolean B;
    private long C;
    private AdBid D;
    private final Set<String> E;
    private final Set<String> F;
    private final Map<String, Object> G;

    @Nullable
    protected AdInteractionListener a;

    @NonNull
    public g b;

    @Nullable
    protected View c;

    @NonNull
    public sg.bigo.ads.df.b d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    protected long k;
    public long l;
    public sg.bigo.ads.controller.landing.a m;
    protected int n;
    protected int o;
    public int p;
    protected boolean q;
    protected sg.bigo.ads.api.core.d r;
    public int s;
    public int t;
    public long u;
    public long v;

    @Nullable
    public WeakReference<a> w;
    public boolean x;
    private boolean y;
    private boolean z;

    public interface a {
        LandingPageStyleConfig a(Context context, String str, int i, boolean z);

        LandingPageStyleConfig f_();

        boolean g_();
    }

    public c(@NonNull g gVar) {
        super(gVar.c);
        this.e = false;
        this.y = false;
        this.f = false;
        this.z = false;
        this.g = false;
        this.A = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.B = new AtomicBoolean(false);
        this.E = new HashSet();
        this.F = new HashSet();
        this.q = false;
        this.t = -1;
        this.u = 0L;
        this.v = 0L;
        this.G = new HashMap();
        this.x = true;
        this.b = gVar;
        B();
        C();
        this.Y = new sg.bigo.ads.bu.a();
    }

    private void B() {
        sg.bigo.ads.api.core.b bVar = this.b.a;
        r m = k.a.m();
        b.f[] D = bVar.D();
        e[] eVarArr = new e[0];
        if (D != null && D.length > 0) {
            eVarArr = new e[D.length];
            for (int i = 0; i < D.length; i++) {
                eVarArr[i] = new e(D[i].a(), this.b.d);
            }
        }
        b.f[] E = bVar.E();
        e[] eVarArr2 = new e[0];
        if (E != null && E.length > 0) {
            eVarArr2 = new e[E.length];
            for (int i2 = 0; i2 < E.length; i2++) {
                eVarArr2[i2] = new e(E[i2].a(), this.b.d);
            }
        }
        b.f[] F = bVar.F();
        e[] eVarArr3 = new e[0];
        if (F != null && F.length > 0) {
            eVarArr3 = new e[F.length];
            for (int i3 = 0; i3 < F.length; i3++) {
                eVarArr3[i3] = new e(F[i3].a(), this.b.d);
            }
        }
        b.f[] G = bVar.G();
        e[] eVarArr4 = new e[0];
        if (G != null && G.length > 0) {
            eVarArr4 = new e[G.length];
            for (int i4 = 0; i4 < G.length; i4++) {
                eVarArr4[i4] = new e(G[i4].a(), this.b.d);
            }
        }
        sg.bigo.ads.df.b a2 = a(m, eVarArr, eVarArr2, eVarArr3, eVarArr4);
        this.d = a2;
        a2.b("express_id", bVar.ac());
    }

    private void C() {
        this.e = false;
        this.y = false;
        this.f = false;
        this.z = false;
        this.g = false;
        this.A = false;
        this.h = false;
        this.i = false;
        this.k = 0L;
        this.l = 0L;
        this.D = null;
        this.j = false;
        this.ab = 0;
        this.B.set(false);
    }

    private int D() {
        b.a P = this.b.a.P();
        if (P != null) {
            return P.a();
        }
        return 0;
    }

    private long E() {
        if (this.b.a.P() != null) {
            return r0.b();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        try {
            sg.bigo.ads.controller.landing.a aVar = this.m;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(c cVar) {
        return cVar == null || cVar.i;
    }

    private void d(String str) {
        if (this.E.contains(str)) {
            return;
        }
        U f = f();
        Map<String, Object> a2 = sg.bigo.ads.cq.a.a(str, this.b.b, this.X, f, Integer.valueOf(f.ak()), null, null, this);
        str.hashCode();
        if (str.equals("impression") || str.equals("clicked")) {
            a2.put("ad_size", j());
            a2.put("show_proportion", b("show_proportion", ""));
            a2.put("render_style", b("render_style", 0));
        }
        sg.bigo.ads.cq.b.a().a(str, a2);
    }

    @NonNull
    protected sg.bigo.ads.df.b a(r rVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4) {
        return new sg.bigo.ads.df.b(rVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, sg.bigo.ads.da.b.c(this.b.a, this));
    }

    public void a() {
        B();
        C();
    }

    @Override // sg.bigo.ads.aj.a
    public final void a(int i, int i2, String str) {
        if (this.f) {
            return;
        }
        this.f = true;
        this.b.c.g.b();
        if (!this.b.a.ai() && a("06002008")) {
            sg.bigo.ads.da.b.a(this, i, i2, str);
        }
    }

    public final void a(int i, int i2, String str, boolean z) {
        sg.bigo.ads.da.b.a(this.b.a, new AdError(i, i2, str), p(), z);
    }

    public final void a(int i, String str) {
        b(i, 0, str);
    }

    @Override // sg.bigo.ads.at.b.a
    public final void a(Activity activity) {
        Intent intent;
        if (activity != null && (activity instanceof AdActivity) && (intent = activity.getIntent()) != null && intent.getIntExtra("ad_identifier", -1) == hashCode() && intent.getBooleanExtra("create_error_flag", false)) {
            String stringExtra = intent.getStringExtra("create_error_msg");
            b(2005, 0, "Activity create error");
            sg.bigo.ads.da.b.a(f(), 3000, 10117, stringExtra);
        }
    }

    @CallSuper
    protected void a(@Nullable Point point, int i, int i2, @NonNull sg.bigo.ads.api.core.e eVar) {
        o();
        b(point, i, i2, eVar);
    }

    public final synchronized void a(String str, Object obj) {
        this.G.put(str, obj);
    }

    public void a(sg.bigo.ads.aj.a aVar) {
        this.aa = aVar;
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            sg.bigo.ads.da.b.a((Map<String, String>) hashMap, (sg.bigo.ads.aj.a) this, false);
            this.d.a(hashMap);
        }
    }

    @Override // sg.bigo.ads.aj.d
    @CallSuper
    public void a(@NonNull d.a<T> aVar) {
    }

    public final void a(@Nullable i iVar, int i, int i2, @NonNull sg.bigo.ads.api.core.e eVar) {
        String str;
        if (isExpired()) {
            str = "The ad is expired";
        } else {
            boolean z = (i2 == 13 || i2 == 14) && (this instanceof f);
            if (!this.i || z) {
                if (D() != 2 || (p() && SystemClock.elapsedRealtime() - this.k >= E())) {
                    b(iVar, i, i2, eVar);
                    return;
                }
                return;
            }
            str = "The ad is destroyed";
        }
        a(2000, 3, str, false);
    }

    public final void a(@Nullable i iVar, @NonNull sg.bigo.ads.api.core.e eVar) {
        a(iVar, 0, 1, eVar);
    }

    public void a(sg.bigo.ads.api.core.d dVar) {
        this.r = dVar;
    }

    protected final boolean a(String str) {
        return !this.F.contains(str);
    }

    public void a_() {
        if (isExpired() || this.i) {
            b(2000, 2, this.i ? "The ad is destroyed" : "The ad is expired");
            return;
        }
        if (this.A) {
            return;
        }
        this.A = true;
        this.k = SystemClock.elapsedRealtime();
        h();
        AdInteractionListener adInteractionListener = this.a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
    }

    @NonNull
    public <ValueType> ValueType b(String str, ValueType valuetype) {
        ValueType valuetype2 = (ValueType) this.G.get(str);
        return valuetype2 != null ? valuetype2 : valuetype;
    }

    @Override // sg.bigo.ads.aj.a
    public final void b() {
        if (this.y) {
            return;
        }
        this.y = true;
        this.b.c.g.b();
        if (a("06002008")) {
            sg.bigo.ads.da.b.a(this, ((Boolean) b("is_cache", Boolean.FALSE)).booleanValue());
        }
    }

    public final void b(int i, int i2, String str) {
        AdError adError = new AdError(i, i2, str);
        a(i, i2, str, true);
        AdInteractionListener adInteractionListener = this.a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdError(adError);
        }
    }

    public void b(@Nullable Point point, int i, int i2, @NonNull sg.bigo.ads.api.core.e eVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        if (this.B.compareAndSet(false, true)) {
            this.d.b(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, String.valueOf(eVar.a));
            sg.bigo.ads.df.b bVar = this.d;
            if (point != null) {
                i4 = point.x;
                i3 = point.y;
            } else {
                i3 = 0;
                i4 = 0;
            }
            View view = this.c;
            if (view != null) {
                i5 = view.getWidth();
                i6 = this.c.getHeight();
            } else {
                i5 = 0;
                i6 = 0;
            }
            bVar.b("click_prop", sg.bigo.ads.common.utils.r.e(sg.bigo.ads.common.utils.r.a("{'x':%d,'y':%d,'ad_w':%d,'ad_h':%d,'x_r':%s,'y_r':%s,'mode':'%s'}", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i6), Float.valueOf(i5 > 0 ? new BigDecimal(i4 / i5).setScale(3, 4).floatValue() : 0.0f), Float.valueOf(i6 > 0 ? new BigDecimal(i3 / i6).setScale(3, 4).floatValue() : 0.0f), (i2 == 1 || i2 == 2) ? "direct" : i2 == 3 ? "confirm" : "unknown")));
            this.d.b("click_source", String.valueOf(i2));
            this.d.b("click_module", String.valueOf(i));
            int i7 = eVar.a;
            if (i7 == 1) {
                z = this.b.a.a(4);
            } else if (i7 == 4) {
                z = this.b.a.a(8);
            }
            final boolean z2 = z;
            final sg.bigo.ads.df.b bVar2 = this.d;
            final Context context = this.b.e;
            final int k = k();
            final int i8 = i();
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.df.b.1
                final /* synthetic */ Context a;
                final /* synthetic */ boolean b;
                final /* synthetic */ int c;
                final /* synthetic */ int d;

                public AnonymousClass1(final Context context2, final boolean z22, final int k2, final int i82) {
                    r2 = context2;
                    r3 = z22;
                    r4 = k2;
                    r5 = i82;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(r2, r3, r4, r5);
                }
            });
        }
    }

    public final void b(String str) {
        if (sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            return;
        }
        this.E.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void b(@Nullable i iVar, int i, int i2, @NonNull sg.bigo.ads.api.core.e eVar) {
        String str;
        this.p = i;
        boolean z = (i2 == 13 || i2 == 14) && (this instanceof f);
        if (!this.g && (!this.i || z)) {
            this.g = true;
            a(iVar != null ? iVar.b : null, i, i2, eVar);
        }
        long elapsedRealtime = this.k > 0 ? SystemClock.elapsedRealtime() - this.k : 0L;
        String a2 = iVar != null ? iVar.a() : "";
        if (iVar == null || iVar.a == null) {
            str = "";
        } else {
            str = iVar.a.x + StringUtils.COMMA + iVar.a.y;
        }
        if (a("06002011")) {
            String a3 = !TextUtils.isEmpty(eVar.f) ? eVar.f : f().O().a();
            g gVar = this.b;
            Context context = gVar.e;
            sg.bigo.ads.api.core.b bVar = gVar.a;
            String j = j();
            int i3 = this.n + 1;
            this.n = i3;
            int i4 = this.o + 1;
            this.o = i4;
            sg.bigo.ads.da.b.a(context, bVar, j, a2, str, i, i2, eVar, elapsedRealtime, i3, i4, this, a3);
        }
        sg.bigo.ads.da.b.a(this.b.a, 1, eVar, this);
        AdInteractionListener adInteractionListener = this.a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
        if (z) {
            ((f) this).h_();
        }
    }

    @Override // sg.bigo.ads.aj.a
    public final void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.l = elapsedRealtime;
        sg.bigo.ads.aj.a aVar = this.aa;
        if (aVar instanceof c) {
            ((c) aVar).l = elapsedRealtime;
        }
        if (this.b.a.ai()) {
            return;
        }
        d("filled");
        if (this.b.a.O().l() == 1) {
            u();
        }
        if (this.b.a.O().d() == 2) {
            sg.bigo.ads.al.c.a(this.b.e);
        }
        sg.bigo.ads.at.b.a(this);
    }

    public final void c(String str) {
        if (sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            return;
        }
        this.F.add(str);
    }

    @Override // sg.bigo.ads.aj.a
    public final String d() {
        return f().I();
    }

    @Override // sg.bigo.ads.api.Ad
    @CallSuper
    public final void destroy() {
        this.i = true;
        if (sg.bigo.ads.bh.d.b()) {
            F();
            destroyInMainThread();
        } else {
            sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.d.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.F();
                    c.this.destroyInMainThread();
                }
            });
        }
        if (this.j) {
            sg.bigo.ads.common.form.a.a(f().hashCode(), 4);
        }
        sg.bigo.ads.common.form.a.b(f().hashCode());
        setAdInteractionListener(null);
        sg.bigo.ads.at.b.b(this);
    }

    @MainThread
    protected void destroyInMainThread() {
    }

    @Override // sg.bigo.ads.aj.a
    public final long e() {
        return f().a();
    }

    @Override // sg.bigo.ads.aj.a
    @NonNull
    public U f() {
        return (U) this.b.a;
    }

    @Nullable
    public AdBid getBid() {
        if (this.D == null) {
            g gVar = this.b;
            sg.bigo.ads.api.core.b bVar = gVar.a;
            this.D = bVar.al() ? new a.C1885a(gVar, bVar, this.d) : null;
        }
        return this.D;
    }

    @Nullable
    public String getExtraInfo(String str) {
        g gVar = this.b;
        sg.bigo.ads.api.core.b bVar = gVar != null ? gVar.a : null;
        return bVar != null ? bVar.b(str) : "";
    }

    protected void h() {
        n();
        int i = this.Z;
        int i2 = sg.bigo.ads.bu.a.e;
        if (i != i2) {
            sg.bigo.ads.bu.a aVar = this.Y;
            View view = this.c;
            if (aVar.g != i2) {
                i2 = sg.bigo.ads.bu.a.a(view) ? sg.bigo.ads.bu.a.f : sg.bigo.ads.bu.a.b(view) ? sg.bigo.ads.bu.a.d : sg.bigo.ads.bu.a.b;
            }
            this.Z = i2;
        }
        this.d.a(this.Z);
        this.d.a(this.b.e, i());
        if (a("06002010")) {
            Pair<Integer, Integer> a2 = (f() == null || !f().a(64) || f().O() == null) ? null : sg.bigo.ads.controller.landing.d.a(this.b.e, f().O().h(), f().o());
            sg.bigo.ads.da.b.a(this.b.e, this, (String) b("show_proportion", ""), j(), ((Integer) b("render_style", 0)).intValue(), w(), ((Long) b("attach_render_cost", -1L)).longValue(), SystemClock.elapsedRealtime() - this.l, ((Integer) b("icon_sta", -1)).intValue(), ((Integer) b("img_sta", -1)).intValue(), ((Integer) b("vid_sta", -1)).intValue(), a2 == null ? -1 : ((Integer) a2.first).intValue(), a2 == null ? -1 : ((Integer) a2.second).intValue());
        }
        if (this.b.a.O().l() == 0) {
            u();
        }
    }

    protected int i() {
        return 0;
    }

    public boolean isExpired() {
        return this.b.a.K();
    }

    public String j() {
        if (this.c == null) {
            return "";
        }
        return this.c.getWidth() + VastAttributes.HORIZONTAL_POSITION + this.c.getHeight();
    }

    protected int k() {
        return 0;
    }

    protected final void l() {
        AdInteractionListener adInteractionListener = this.a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdOpened();
        }
    }

    @CallSuper
    protected void m() {
        AdInteractionListener adInteractionListener = this.a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
        this.h = true;
    }

    protected void n() {
        d("impression");
    }

    protected void o() {
        d("clicked");
    }

    public boolean p() {
        return this.A;
    }

    protected final int q() {
        return this.b.b.b();
    }

    protected final int r() {
        return this.b.a.x();
    }

    public final int s() {
        if (this.v != f().z()) {
            return -1;
        }
        return this.t;
    }

    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.a = adInteractionListener;
    }

    public final long t() {
        if (this.v != f().z()) {
            return 0L;
        }
        return this.u;
    }

    public void u() {
        if (this.b.a.O().g() > 0) {
            final sg.bigo.ads.controller.landing.a aVar = new sg.bigo.ads.controller.landing.a(this.b.a);
            this.m = aVar;
            final Context context = this.b.e;
            final String a2 = aVar.b.a();
            final String k = aVar.b.k();
            final int d = aVar.b.d();
            int i = aVar.c;
            if (((i == 4 || i == 5) && TextUtils.isEmpty(k)) || sg.bigo.ads.core.landing.a.a(a2) || TextUtils.isEmpty(a2) || !a2.startsWith("http")) {
                return;
            }
            if (d == 0 || d == 2) {
                final a.InterfaceC1873a interfaceC1873a = new a.InterfaceC1873a() { // from class: sg.bigo.ads.controller.landing.a.3
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1873a
                    public final void a(String str) {
                        int i2 = a.this.c;
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1873a
                    public final void a(String str, long j, boolean z, int i2) {
                        a.this.d = z;
                        HashMap hashMap = new HashMap();
                        hashMap.put("land_way", String.valueOf(i2));
                        sg.bigo.ads.da.b.a(a.this.a, "preload_cost", j, z ? 1 : 0, hashMap);
                        a aVar2 = a.this;
                        int i3 = aVar2.c;
                        if (z) {
                            return;
                        }
                        aVar2.a();
                    }
                };
                sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.landing.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        int i2 = aVar2.c;
                        if (i2 != 1) {
                            if (i2 == 4 || i2 == 5) {
                                a.a(aVar2, context, k, d, interfaceC1873a);
                                return;
                            }
                            return;
                        }
                        Uri parse = Uri.parse(a2);
                        a.a(a.this, context, parse.getScheme() + "://" + parse.getHost(), d, interfaceC1873a);
                    }
                });
            }
        }
    }

    protected final void v() {
        if (this.z) {
            return;
        }
        this.z = true;
        this.C = SystemClock.elapsedRealtime();
    }

    public final long w() {
        if (this.C == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.C;
    }

    @Nullable
    public final LandingPageStyleConfig x() {
        WeakReference<a> weakReference = this.w;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.w.get().f_();
    }

    protected final boolean y() {
        WeakReference<a> weakReference = this.w;
        return (weakReference == null || weakReference.get() == null || !this.w.get().g_()) ? false : true;
    }

    public sg.bigo.ads.api.core.d z() {
        return this.r;
    }
}
