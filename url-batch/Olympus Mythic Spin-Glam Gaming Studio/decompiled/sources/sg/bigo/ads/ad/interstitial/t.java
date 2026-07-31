package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.os.SystemClock;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.at.b;
import sg.bigo.ads.bj.h;
import sg.bigo.ads.h.b;
import sg.bigo.ads.y.c;

/* loaded from: classes11.dex */
public class t extends k<sg.bigo.ads.cp.a> {

    @NonNull
    protected sg.bigo.ads.y.b C;

    @Nullable
    public sg.bigo.ads.f.c D;

    @Nullable
    public sg.bigo.ads.f.a E;

    @Nullable
    l F;

    @Nullable
    private b G;
    private final a H;
    private final Map<sg.bigo.ads.y.b, sg.bigo.ads.r.b> I;
    private final Map<sg.bigo.ads.y.b, sg.bigo.ads.r.b> J;
    private boolean K;

    class a implements AdInteractionListener {

        @Nullable
        AdInteractionListener a;

        a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
            k.b bVar = ((k) t.this).z;
            if (bVar != null) {
                bVar.I();
            }
            if (t.this.F != null) {
                t.this.F.l = SystemClock.elapsedRealtime();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            k.b bVar;
            if (this.a != null && (adError.getCode() != 2002 || !t.this.p())) {
                this.a.onAdError(adError);
            }
            if (adError.getCode() != 2002 || (bVar = ((k) t.this).z) == null) {
                return;
            }
            bVar.b(adError.getMessage());
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            if (this.a != null) {
                if (t.this.C instanceof sg.bigo.ads.aa.b) {
                    sg.bigo.ads.aa.b bVar = (sg.bigo.ads.aa.b) t.this.C;
                    AdInteractionListener adInteractionListener = this.a;
                    if (adInteractionListener != null && !bVar.Q) {
                        bVar.Q = true;
                        adInteractionListener.onAdImpression();
                    }
                } else {
                    this.a.onAdImpression();
                }
            }
            if (t.this.F != null) {
                t.this.F.m = SystemClock.elapsedRealtime();
            }
            sg.bigo.ads.r.b I = t.this.I();
            if (I != null) {
                I.b();
            }
            sg.bigo.ads.r.b J = t.this.J();
            if (J != null) {
                J.b();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            if (this.a != null) {
                if (!(t.this.C instanceof sg.bigo.ads.aa.b)) {
                    this.a.onAdOpened();
                    return;
                }
                sg.bigo.ads.aa.b bVar = (sg.bigo.ads.aa.b) t.this.C;
                AdInteractionListener adInteractionListener = this.a;
                if (adInteractionListener == null || bVar.R) {
                    return;
                }
                bVar.R = true;
                adInteractionListener.onAdOpened();
            }
        }
    }

    class b implements sg.bigo.ads.aa.a {
        Map<sg.bigo.ads.y.b, Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a>> a;

        private b() {
        }

        /* synthetic */ b(t tVar, byte b) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
        @Override // sg.bigo.ads.aa.a
        public final void a(int i, NativeAd nativeAd, sg.bigo.ads.ai.n nVar) {
            if (this.a == null) {
                this.a = new HashMap();
            }
            if (nativeAd instanceof sg.bigo.ads.y.b) {
                sg.bigo.ads.y.b bVar = (sg.bigo.ads.y.b) nativeAd;
                ?? f = bVar.f();
                sg.bigo.ads.ai.o e = f.e();
                boolean z = f.ay() == 1;
                if (!z && e != null) {
                    z = 1 == e.a("endpage.companion_first") || i == 2;
                }
                if (z) {
                    Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> a = t.a(t.this, true, bVar, nVar, f, false);
                    this.a.put(bVar, a);
                    sg.bigo.ads.f.c cVar = (sg.bigo.ads.f.c) a.first;
                    if (cVar != null && cVar.a && f.ay() == 1 && f.x() == 2) {
                        cVar.a(bVar.b.e);
                    }
                }
            }
        }
    }

    public t(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        sg.bigo.ads.api.core.b bVar;
        sg.bigo.ads.ai.o e;
        int a2;
        a aVar = new a();
        this.H = aVar;
        this.I = new HashMap();
        this.J = new HashMap();
        byte b2 = 0;
        this.K = false;
        sg.bigo.ads.y.b bVar2 = null;
        if (gVar != null && (bVar = gVar.a) != null && (e = bVar.e()) != null && ((33 == (a2 = e.a("video_play_page.ad_component_layout")) && !gVar.a.as()) || (6 == a2 && gVar.a.as()))) {
            int x = gVar.a.x();
            if (x == 1) {
                bVar2 = new sg.bigo.ads.z.f(gVar);
            } else if (x == 2) {
                bVar2 = new sg.bigo.ads.z.g(gVar);
            }
        }
        bVar2 = bVar2 == null ? sg.bigo.ads.y.a.a(gVar) : bVar2;
        if (bVar2 == null) {
            throw new IllegalArgumentException("Illegal adx type.");
        }
        this.C = bVar2;
        bVar2.a(true);
        if (this.C instanceof sg.bigo.ads.aa.b) {
            b bVar3 = new b(this, b2);
            this.G = bVar3;
            ((sg.bigo.ads.aa.b) this.C).P = bVar3;
        }
        sg.bigo.ads.y.b bVar4 = this.C;
        if (bVar4 instanceof sg.bigo.ads.y.c) {
            ((sg.bigo.ads.y.c) bVar4).L = new c.b() { // from class: sg.bigo.ads.ad.interstitial.t.1
                @Override // sg.bigo.ads.y.c.b
                public final void a(String str) {
                    k.b bVar5 = ((k) t.this).z;
                    if (bVar5 != null) {
                        bVar5.b(str);
                    }
                }
            };
        }
        this.C.setAdInteractionListener(aVar);
        a((sg.bigo.ads.aj.a) bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Pair a(t tVar, boolean z, NativeAd nativeAd, sg.bigo.ads.ai.n nVar, sg.bigo.ads.api.core.b bVar, boolean z2) {
        if (z) {
            tVar = nativeAd;
        }
        boolean z3 = nativeAd instanceof sg.bigo.ads.y.c;
        sg.bigo.ads.f.c cVar = new sg.bigo.ads.f.c(tVar, nVar, bVar, z3 ? ((sg.bigo.ads.y.c) nativeAd).I : null, z3 ? ((sg.bigo.ads.y.c) nativeAd).J : null);
        if (cVar.a) {
            cVar.n = 2;
        }
        sg.bigo.ads.f.a aVar = new sg.bigo.ads.f.a(cVar.a, tVar, nVar, bVar, z3 ? ((sg.bigo.ads.y.c) nativeAd).I : null, z3 ? ((sg.bigo.ads.y.c) nativeAd).J : null);
        int i = cVar.a ? 1 : aVar.a ? 2 : 0;
        if (bVar.e() != null && z2) {
            i = bVar.i() ? i : 0;
        }
        bVar.d(i);
        bVar.e((cVar.a || (aVar.b instanceof sg.bigo.ads.g.b)) ? 1 : 2);
        return new Pair(cVar, aVar);
    }

    static /* synthetic */ void a(t tVar, sg.bigo.ads.y.b bVar) {
        if (bVar == null || (bVar instanceof sg.bigo.ads.aa.b)) {
            return;
        }
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) bVar.f();
        sg.bigo.ads.ai.o e = aVar.e();
        sg.bigo.ads.r.b b2 = sg.bigo.ads.r.b.b(bVar, e);
        if (b2 != null) {
            tVar.I.put(bVar, b2);
        }
        sg.bigo.ads.r.b a2 = sg.bigo.ads.r.b.a(bVar, e);
        if (a2 != null) {
            tVar.J.put(bVar, a2);
        }
        if (b2 == null && a2 == null) {
            return;
        }
        if (b2 != null && b2.g == 1) {
            b2.b();
            return;
        }
        if (a2 != null && a2.g == 1) {
            a2.b();
            return;
        }
        if (b2 != null && b2.g == 2) {
            tVar.a(aVar, b2);
        } else {
            if (a2 == null || a2.g != 2) {
                return;
            }
            tVar.a(aVar, a2);
        }
    }

    private void a(sg.bigo.ads.cp.a aVar, final sg.bigo.ads.r.b bVar) {
        sg.bigo.ads.bj.h hVar;
        if (!aVar.aZ()) {
            String bb = aVar.bb();
            hVar = h.a.a;
            if (hVar.a(bb)) {
                return;
            }
            bVar.b();
            return;
        }
        final sg.bigo.ads.core.player.b a2 = sg.bigo.ads.core.player.b.a();
        final String aX = aVar.aX();
        final ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: sg.bigo.ads.ad.interstitial.t.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Boolean bool) {
                if (!bool.booleanValue()) {
                    bVar.b();
                }
            }
        };
        if (a2.b.get()) {
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.2
                final /* synthetic */ ValueCallback a;
                final /* synthetic */ String b;

                public AnonymousClass2(final ValueCallback valueCallback2, final String aX2) {
                    r2 = valueCallback2;
                    r3 = aX2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ValueCallback valueCallback2 = r2;
                    sg.bigo.ads.ay.b bVar2 = b.this.c;
                    String str = r3;
                    valueCallback2.onReceiveValue(Boolean.valueOf(sg.bigo.ads.ay.b.a(bVar2.a, str) || sg.bigo.ads.ay.b.a(bVar2.c, str)));
                }
            });
        } else {
            valueCallback2.onReceiveValue(Boolean.FALSE);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected final boolean E() {
        return ((sg.bigo.ads.cp.a) this.C.f()).aZ();
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected Class<? extends sg.bigo.ads.cl.b<?>> G() {
        return N() ? sg.bigo.ads.v.a.class : this.C instanceof sg.bigo.ads.aj.e ? O() ? sg.bigo.ads.s.d.class : sg.bigo.ads.t.c.class : E() ? M() ? sg.bigo.ads.x.a.class : z.class : y.class;
    }

    @Nullable
    public final sg.bigo.ads.r.b I() {
        sg.bigo.ads.y.b bVar = this.C;
        if (bVar instanceof sg.bigo.ads.aa.b) {
            return null;
        }
        sg.bigo.ads.r.b bVar2 = this.I.get(bVar);
        if (bVar2 == null) {
            sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) this.C.f();
            if (aVar != null) {
                bVar2 = sg.bigo.ads.r.b.b(this.C, aVar.e());
            }
            if (bVar2 != null) {
                this.I.put(this.C, bVar2);
            }
        }
        return bVar2;
    }

    @Nullable
    public final sg.bigo.ads.r.b J() {
        sg.bigo.ads.y.b bVar = this.C;
        if (bVar instanceof sg.bigo.ads.aa.b) {
            return null;
        }
        sg.bigo.ads.r.b bVar2 = this.J.get(bVar);
        if (bVar2 == null) {
            sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) this.C.f();
            if (aVar != null) {
                bVar2 = sg.bigo.ads.r.b.a(this.C, aVar.e());
            }
            if (bVar2 != null) {
                this.J.put(this.C, bVar2);
            }
        }
        return bVar2;
    }

    @NonNull
    public final sg.bigo.ads.y.b K() {
        sg.bigo.ads.y.b bVar;
        sg.bigo.ads.y.b bVar2 = this.C;
        return (!(bVar2 instanceof sg.bigo.ads.aa.b) || (bVar = ((sg.bigo.ads.aa.b) bVar2).I) == null) ? bVar2 : bVar;
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.aj.a
    @NonNull
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final sg.bigo.ads.cp.a f() {
        return (sg.bigo.ads.cp.a) this.C.f();
    }

    protected final boolean M() {
        return ((sg.bigo.ads.cp.a) this.C.f()).ba();
    }

    protected boolean N() {
        sg.bigo.ads.y.b bVar = this.C;
        return (bVar instanceof sg.bigo.ads.z.f) || (bVar instanceof sg.bigo.ads.z.g);
    }

    protected final boolean O() {
        b.a aVar = this.C;
        return (aVar instanceof sg.bigo.ads.aj.e) && ((sg.bigo.ads.aj.e) aVar).M() == 3;
    }

    public final sg.bigo.ads.f.c a(b.a aVar) {
        sg.bigo.ads.y.b bVar = this.C;
        if (bVar instanceof sg.bigo.ads.y.c) {
            sg.bigo.ads.y.c cVar = (sg.bigo.ads.y.c) bVar;
            this.D = new sg.bigo.ads.f.c(this, this.b.b, ((sg.bigo.ads.cp.a) cVar.f()).bF(), this.b.a, cVar.I, cVar.J, aVar);
        }
        return this.D;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void a(int i, int i2) {
        super.a(i, i2);
        l lVar = this.F;
        if (lVar != null) {
            lVar.t = true;
            lVar.n = SystemClock.elapsedRealtime();
        }
    }

    @Override // sg.bigo.ads.d.c
    public final void a(sg.bigo.ads.api.core.d dVar) {
        super.a(dVar);
        sg.bigo.ads.y.b bVar = this.C;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    public final void a(sg.bigo.ads.y.b bVar) {
        sg.bigo.ads.y.b bVar2 = this.C;
        if (bVar2 instanceof sg.bigo.ads.aa.b) {
            ((sg.bigo.ads.aa.b) bVar2).I = bVar;
        }
    }

    @Override // sg.bigo.ads.aj.a
    public final void a(boolean z, boolean z2) {
        super.a(z, z2);
        sg.bigo.ads.y.b bVar = this.C;
        if (bVar != null) {
            bVar.a(z, z2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final boolean a(int i) {
        sg.bigo.ads.ai.o e;
        int a2;
        boolean z;
        boolean z2 = true;
        if (this.K || (e = f().e()) == null) {
            return true;
        }
        int i2 = 9;
        boolean z3 = false;
        if (i == 2) {
            a2 = e.a("endpage.x_area_behavior", 0);
        } else if (i == 6) {
            a2 = e.a("play_page.x_area_behavior", 0);
            i2 = 16;
        } else if (i != 9) {
            a2 = e.a("video_play_page.x_area_behavior", 0);
            i2 = 1;
        } else {
            a2 = e.a("layer.x_area_behavior", 0);
            i2 = 10;
        }
        if (a2 <= 0) {
            return true;
        }
        this.K = true;
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 == 3) {
                    boolean z4 = K().g;
                    z = !z4;
                    z3 = z4;
                } else if (a2 != 4) {
                    z3 = true;
                    z2 = false;
                } else {
                    z = !K().g;
                    ((k) this).A = true;
                }
                z2 = z;
            } else {
                ((k) this).A = true;
            }
        }
        if (z2) {
            K().a((sg.bigo.ads.an.i) null, i2, 36);
        }
        return z3;
    }

    public final Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b(sg.bigo.ads.y.b bVar) {
        Map<sg.bigo.ads.y.b, Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a>> map;
        b bVar2 = this.G;
        if (bVar2 == null || bVar == null || (map = bVar2.a) == null) {
            return null;
        }
        return map.get(bVar);
    }

    @Override // sg.bigo.ads.d.c
    @NonNull
    public final <ValueType> ValueType b(String str, ValueType valuetype) {
        return (ValueType) this.C.b(str, (String) valuetype);
    }

    @Override // sg.bigo.ads.aj.a
    public final void b(int i) {
        super.b(i);
        sg.bigo.ads.y.b bVar = this.C;
        if (bVar != null) {
            bVar.b(i);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected final void b(@NonNull Activity activity) {
        super.b(activity);
        sg.bigo.ads.y.b bVar = this.C;
        if (bVar != null) {
            bVar.b(activity);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected void b(@NonNull final d.a<InterstitialAd> aVar) {
        sg.bigo.ads.ai.o e;
        sg.bigo.ads.ai.o e2;
        sg.bigo.ads.ai.o e3;
        sg.bigo.ads.ai.o e4;
        sg.bigo.ads.y.b bVar = this.C;
        sg.bigo.ads.ai.o e5 = f().e();
        boolean z = true;
        if ((e5 == null || (e5.a("video_play_page.cta_color") != 3 && e5.a("video_play_page.background_colour") != 3 && e5.a("video_play_page.mediaview_colour") != 3 && e5.a("video_play_page.ad_component_colour") != 3)) && (((e = f().e()) == null || e.a("mid_page.cta_color") != 3) && (((e2 = f().e()) == null || (e2.a("endpage.cta_color") != 3 && e2.a("endpage.background_colour") != 3 && e2.a("endpage.mediaview_colour") != 3)) && (((e3 = f().e()) == null || (e3.a("layer.cta_color") != 3 && e3.a("layer.mediaview_colour") != 3)) && ((e4 = f().e()) == null || (e4.a("video_play_page.is_widget") != 1 && e4.a("endpage.is_widget") != 1)))))) {
            z = false;
        }
        bVar.b(z);
        this.C.a(new d.a<NativeAd>() { // from class: sg.bigo.ads.ad.interstitial.t.2
            private void a(int i, int i2, String str) {
                t tVar = t.this;
                if (tVar.e || tVar.f) {
                    return;
                }
                aVar.a(tVar, i, i2, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // sg.bigo.ads.aj.d.a
            public void a(NativeAd nativeAd) {
                sg.bigo.ads.api.core.g gVar = t.this.b;
                if (!(nativeAd instanceof sg.bigo.ads.aj.f) && (t.this.D == null || t.this.E == null)) {
                    Pair a2 = t.a(t.this, false, nativeAd, gVar.b, gVar.a, true);
                    t.this.D = (sg.bigo.ads.f.c) a2.first;
                    t.this.E = (sg.bigo.ads.f.a) a2.second;
                    if (t.this.D != null && t.this.D.a && gVar.a.ay() == 1 && gVar.a.x() == 2) {
                        t.this.D.a(t.this.K().b.e);
                    }
                }
                t tVar = t.this;
                if (tVar.e || tVar.f) {
                    return;
                }
                t.a(tVar, tVar.C);
                aVar.a(t.this);
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(NativeAd nativeAd, int i, int i2, String str) {
                a(i, i2, str);
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* synthetic */ void a(NativeAd nativeAd, boolean z2, int i, int i2, String str, boolean z3) {
                NativeAd nativeAd2 = nativeAd;
                t tVar = t.this;
                if (tVar.e || tVar.f || !(nativeAd2 instanceof sg.bigo.ads.y.c)) {
                    return;
                }
                if (((sg.bigo.ads.cp.a) ((sg.bigo.ads.y.c) nativeAd2).f()).bq() != null || z2) {
                    a(nativeAd2);
                } else if (z3) {
                    a(i, i2, str);
                }
            }
        }, 0);
    }

    @Override // sg.bigo.ads.aj.a
    public final sg.bigo.ads.api.core.p b_() {
        sg.bigo.ads.y.b bVar = this.C;
        return bVar != null ? bVar.b_() : this.ac;
    }

    @Override // sg.bigo.ads.aj.a
    public final void c(int i) {
        super.c(i);
        sg.bigo.ads.y.b bVar = this.C;
        if (bVar != null) {
            bVar.c(i);
        }
    }

    public final void c(sg.bigo.ads.y.b bVar) {
        Map<sg.bigo.ads.y.b, Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a>> map;
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> remove;
        b bVar2 = this.G;
        if (bVar2 == null || bVar == null || (map = bVar2.a) == null || (remove = map.remove(bVar)) == null) {
            return;
        }
        sg.bigo.ads.f.c cVar = (sg.bigo.ads.f.c) remove.first;
        if (cVar != null) {
            cVar.e();
        }
        sg.bigo.ads.f.a aVar = (sg.bigo.ads.f.a) remove.second;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.C.destroy();
        b bVar = this.G;
        if (bVar != null) {
            Map<sg.bigo.ads.y.b, Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a>> map = bVar.a;
            if (map != null) {
                Iterator<sg.bigo.ads.y.b> it = map.keySet().iterator();
                while (it.hasNext()) {
                    Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> pair = bVar.a.get(it.next());
                    if (pair != null) {
                        sg.bigo.ads.f.c cVar = (sg.bigo.ads.f.c) pair.first;
                        if (cVar != null) {
                            cVar.e();
                        }
                        sg.bigo.ads.f.a aVar = (sg.bigo.ads.f.a) pair.second;
                        if (aVar != null) {
                            aVar.e();
                        }
                    }
                }
                bVar.a.clear();
            }
            this.G = null;
        }
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        sg.bigo.ads.y.b bVar = this.C;
        return bVar != null ? bVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.d.c
    public final boolean p() {
        sg.bigo.ads.y.b bVar = this.C;
        return (bVar != null && bVar.p()) || super.p();
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.api.Ad
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(adInteractionListener);
        this.H.a = adInteractionListener;
    }

    @Override // sg.bigo.ads.d.c
    public final void u() {
        this.C.u();
    }

    @Override // sg.bigo.ads.d.c
    public final sg.bigo.ads.api.core.d z() {
        sg.bigo.ads.y.b bVar = this.C;
        return bVar != null ? bVar.z() : super.z();
    }
}
