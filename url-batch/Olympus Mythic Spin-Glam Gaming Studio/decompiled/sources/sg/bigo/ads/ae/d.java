package sg.bigo.ads.ae;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ae.c;
import sg.bigo.ads.common.utils.o;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes5.dex */
public class d extends sg.bigo.ads.v.a {
    private h e;
    private boolean f;
    private boolean g;
    private o h;

    protected d(@NonNull Activity activity) {
        super(activity);
        this.f = false;
        this.g = false;
    }

    static /* synthetic */ boolean e(d dVar) {
        dVar.f = true;
        return true;
    }

    static /* synthetic */ void h(d dVar) {
        o oVar = dVar.h;
        if (oVar != null) {
            oVar.d();
        }
        AdCountDownButton adCountDownButton = dVar.C;
        if (adCountDownButton != null) {
            adCountDownButton.b();
        }
    }

    static /* synthetic */ boolean i(d dVar) {
        dVar.g = true;
        return true;
    }

    static /* synthetic */ void k(d dVar) {
        o oVar = dVar.h;
        if (oVar != null) {
            oVar.c();
        }
        AdCountDownButton adCountDownButton = dVar.C;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
    }

    @Override // sg.bigo.ads.v.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        super.X();
        T t = this.A;
        if (t == 0) {
            return;
        }
        if (t instanceof h) {
            this.e = (h) t;
        } else {
            a("Illegal SAB content.");
        }
        if (this.C != null) {
            this.h = new o(s.a.a(1)) { // from class: sg.bigo.ads.ae.d.1
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ae.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (d.this.e == null || d.this.f) {
                                sg.bigo.ads.bn.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
                            } else {
                                d.e(d.this);
                                d.this.e.P();
                            }
                            if (d.this.C != null) {
                                d.this.C.e();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j) {
                    if (d.this.C != null) {
                        d.this.C.a(j);
                    }
                }
            };
            this.C.setVisibility(0);
            this.C.setTakeoverTickEvent(true);
            this.C.setShowCloseButtonInCountdown(true);
            this.C.a(1, (AdCountDownButton.b) null);
            this.h.c();
        }
    }

    @Override // sg.bigo.ads.v.a, sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z) {
        if (this.C.getVisibility() != 0) {
            return;
        }
        if (!this.f) {
            new c(this.N).a(new c.a() { // from class: sg.bigo.ads.ae.d.2
                @Override // sg.bigo.ads.ae.c.a
                public final void a() {
                    d.h(d.this);
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void b() {
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void c() {
                    d.i(d.this);
                    d.this.af();
                }

                @Override // sg.bigo.ads.ae.c.a
                public final void d() {
                    d.k(d.this);
                }
            });
            return;
        }
        o oVar = this.h;
        if (oVar != null) {
            oVar.b();
            this.h = null;
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        super.d(true);
    }

    @Override // sg.bigo.ads.v.a
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.v.a
    public final boolean f() {
        return this.f;
    }
}
