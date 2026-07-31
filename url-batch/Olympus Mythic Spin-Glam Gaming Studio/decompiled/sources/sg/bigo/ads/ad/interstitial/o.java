package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.aj.a;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.InterstitialAd;

/* loaded from: classes14.dex */
public class o extends k<sg.bigo.ads.api.core.i> {

    @NonNull
    public final sg.bigo.ads.ad.banner.c<o> C;
    sg.bigo.ads.ad.banner.h D;
    protected sg.bigo.ads.w.a E;
    private final boolean F;
    private boolean G;
    private final AtomicBoolean H;

    public o(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        sg.bigo.ads.ai.o e;
        try {
            sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
            sg.bigo.ads.w.a aVar = null;
            if (iVar != null && (e = iVar.e()) != null) {
                n nVar = new n();
                nVar.a = e.a("video_play_page.ad_component_layout");
                nVar.b = e.a("video_play_page.force_staying_time");
                nVar.c = e.a("video_play_page.close_button_style");
                nVar.d = e.a("video_play_page.x_area");
                nVar.e = e.a("video_play_page.duration");
                int i = nVar.a;
                aVar = i != 1 ? i != 2 ? new sg.bigo.ads.w.a(this, this.b.e, nVar) : new sg.bigo.ads.w.c(this, this.b.e, nVar) : new sg.bigo.ads.w.b(this, this.b.e, nVar);
            }
            this.E = aVar;
            this.H = new AtomicBoolean(false);
            boolean aD = iVar.aD();
            this.F = aD;
            sg.bigo.ads.ad.banner.c<o> cVar = new sg.bigo.ads.ad.banner.c<>(this.b.e, gVar, this, iVar, H(), new sg.bigo.ads.ad.banner.h() { // from class: sg.bigo.ads.ad.interstitial.o.1
                @Override // sg.bigo.ads.ad.banner.h
                public final void a() {
                    if (o.this.D != null) {
                        o.this.D.a();
                    }
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void a(sg.bigo.ads.an.i iVar2, sg.bigo.ads.api.core.e eVar) {
                    int i2;
                    if (iVar2 != null) {
                        Rect rect = ((k) o.this).B;
                        Point point = iVar2.a;
                        if (point != null && iVar2.b != null && rect != null && rect.contains(point.x, point.y)) {
                            Point point2 = iVar2.b;
                            if (rect.contains(point2.x, point2.y)) {
                                i2 = 33;
                                o.this.a(iVar2, i2, 1, eVar);
                            }
                        }
                    }
                    i2 = 0;
                    o.this.a(iVar2, i2, 1, eVar);
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void b() {
                    o.this.J();
                    sg.bigo.ads.da.b.a(o.this.b.a, (String) o.this.b("show_proportion", ""), o.this.j(), ((Integer) o.this.b("render_style", 0)).intValue());
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void c() {
                    o.d(o.this);
                    if (o.this.p()) {
                        o.this.J();
                    }
                }
            }, aD);
            this.C = cVar;
            cVar.c = 0;
            cVar.r = this.E;
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error data type for ad!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.H.compareAndSet(false, true)) {
            super.n();
        }
    }

    static /* synthetic */ boolean d(o oVar) {
        oVar.G = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected final boolean E() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected Class<? extends sg.bigo.ads.cl.b<?>> G() {
        return m.class;
    }

    protected sg.bigo.ads.core.mraid.n H() {
        return sg.bigo.ads.core.mraid.n.INTERSTITIAL;
    }

    public final n I() {
        sg.bigo.ads.w.a aVar = this.E;
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    public final void a(AdCountDownButton adCountDownButton, View view) {
        sg.bigo.ads.w.a aVar = this.E;
        if (aVar == null || adCountDownButton == null) {
            return;
        }
        int i = aVar.c.c;
        adCountDownButton.setCloseImageResource(i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close2);
        adCountDownButton.setShowCloseButtonInCountdown(true);
        adCountDownButton.post(new Runnable() { // from class: sg.bigo.ads.w.a.1
            final /* synthetic */ AdCountDownButton a;
            final /* synthetic */ View b;

            public AnonymousClass1(AdCountDownButton adCountDownButton2, View view2) {
                r2 = adCountDownButton2;
                r3 = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar2 = a.this;
                int i2 = aVar2.c.d;
                int i3 = 1;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        AdCountDownButton adCountDownButton2 = r2;
                        View view2 = r3;
                        Rect rect = new Rect();
                        adCountDownButton2.getHitRect(rect);
                        rect.inset((-rect.width()) / 2, (-rect.height()) / 2);
                        View closeView = adCountDownButton2.getCloseView();
                        if (view2 == null || closeView == null) {
                            return;
                        }
                        view2.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.w.a.2
                            final /* synthetic */ Rect a;
                            final /* synthetic */ View b;

                            AnonymousClass2(Rect rect2, View closeView2) {
                                r2 = rect2;
                                r3 = closeView2;
                            }

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                if (!r2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    return false;
                                }
                                if (motionEvent.getActionMasked() != 0) {
                                    return true;
                                }
                                r3.onTouchEvent(motionEvent);
                                return true;
                            }
                        });
                        return;
                    }
                }
                r2.setBtnClickArea(i3);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final boolean a(int i) {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected final void b(@NonNull Activity activity) {
        super.b(activity);
        sg.bigo.ads.ad.banner.c<o> cVar = this.C;
        if (cVar != null) {
            cVar.p = new WeakReference<>(activity);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected void b(@NonNull d.a<InterstitialAd> aVar) {
        sg.bigo.ads.api.core.b bVar = this.b.a;
        if (!(bVar instanceof sg.bigo.ads.api.core.i)) {
            aVar.a(this, 1021, 1250, "InterstitialBannerAd with invalid AdData class type.");
            return;
        }
        sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) bVar;
        if (iVar.aE() == null || TextUtils.isEmpty(iVar.aE().c())) {
            aVar.a(this, 1022, 1252, "Empty content.");
        } else {
            this.C.a(new a.InterfaceC1836a() { // from class: sg.bigo.ads.ad.interstitial.o.2
                @Override // sg.bigo.ads.aj.a.InterfaceC1836a
                public final void a(sg.bigo.ads.api.core.c cVar) {
                }

                @Override // sg.bigo.ads.aj.a.InterfaceC1836a
                public final void b() {
                }
            });
            aVar.a(this);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public void destroyInMainThread() {
        this.D = null;
        super.destroyInMainThread();
        this.C.a();
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        sg.bigo.ads.ad.banner.c<o> cVar = this.C;
        return cVar != null ? cVar.d() : "";
    }

    @Override // sg.bigo.ads.d.c
    public final void h() {
        super.h();
        sg.bigo.ads.ad.banner.c<o> cVar = this.C;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // sg.bigo.ads.d.c
    public final void n() {
        if (!this.F || this.G) {
            J();
        }
    }

    @Override // sg.bigo.ads.d.c
    public final void o() {
        super.o();
        J();
    }
}
