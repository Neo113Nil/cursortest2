package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.e;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.f.b;
import sg.bigo.ads.f.c;
import sg.bigo.ads.f.d;
import sg.bigo.ads.f.e;
import sg.bigo.ads.h.b;
import sg.bigo.ads.h.c;
import sg.bigo.ads.i.a;
import sg.bigo.ads.q.c;

/* loaded from: classes10.dex */
public class z extends sg.bigo.ads.ad.interstitial.a implements VideoController.a, a.InterfaceC1899a {
    public final sg.bigo.ads.i.a I;
    public boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private boolean R;
    private boolean S;
    private Runnable T;
    private Runnable U;
    private int V;

    @Nullable
    private sg.bigo.ads.j.a W;
    private final AtomicBoolean X;

    @Nullable
    private sg.bigo.ads.f.d Y;

    @Nullable
    private sg.bigo.ads.f.e Z;
    private boolean aa;
    private volatile boolean ab;
    private final Runnable ac;
    private final b ad;

    /* renamed from: sg.bigo.ads.ad.interstitial.z$18, reason: invalid class name */
    final class AnonymousClass18 extends sg.bigo.ads.common.utils.o {
        final /* synthetic */ View a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass18(long j, View view) {
            super(j, 1000L);
            this.a = view;
        }

        @Override // sg.bigo.ads.common.utils.o
        public final void a() {
            z zVar = z.this;
            zVar.a(zVar.w, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.18.1
                @Override // java.lang.Runnable
                public final void run() {
                    z.f(z.this);
                    AnonymousClass18.this.a.setVisibility(0);
                    sg.bigo.ads.ad.interstitial.c.a(AnonymousClass18.this.a, new b.d() { // from class: sg.bigo.ads.ad.interstitial.z.18.1.1
                        @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            AnonymousClass18 anonymousClass18 = AnonymousClass18.this;
                            if (z.this.G == null || anonymousClass18.a.getTop() <= 0 || z.this.G.getBottom() <= AnonymousClass18.this.a.getTop()) {
                                return;
                            }
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) z.this.G.getLayoutParams();
                            layoutParams.addRule(8, 0);
                            layoutParams.addRule(2, R.id.inter_ad_info);
                            z.this.G.setLayoutParams(layoutParams);
                        }
                    });
                    z.this.K();
                    z.this.aS();
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.o
        public final void a(long j) {
        }
    }

    class a implements sg.bigo.ads.ad.banner.h {
        private int b;
        private int c;

        public a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            if (z.this.d() == 5 || z.this.d() == 1 || z.this.d() == 7 || z.this.d() == 8) {
                z.this.e(true);
            }
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(sg.bigo.ads.an.i iVar, sg.bigo.ads.api.core.e eVar) {
            ((t) z.this.A).K().a(iVar, this.b, this.c, eVar);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void c() {
        }
    }

    final class b {
        private final List<View> b;

        private b() {
            this.b = new ArrayList();
        }

        /* synthetic */ b(z zVar, byte b) {
            this();
        }

        @MainThread
        final void a() {
            if (z.this.F != null) {
                Iterator<View> it = this.b.iterator();
                while (it.hasNext()) {
                    z.this.F.removeView(it.next());
                }
            }
        }

        @MainThread
        final void a(View view) {
            if (view != null) {
                this.b.add(view);
            }
        }
    }

    static final class c implements d.a {

        @NonNull
        private final WeakReference<z> a;

        c(@NonNull z zVar) {
            this.a = new WeakReference<>(zVar);
        }

        @Nullable
        private z i() {
            return this.a.get();
        }

        @Override // sg.bigo.ads.f.d.a
        @Nullable
        public final ViewGroup a() {
            z i = i();
            if (i == null) {
                return null;
            }
            return i.F;
        }

        @Override // sg.bigo.ads.f.d.a
        public final void a(int i) {
            z i2 = i();
            if (i2 != null) {
                i2.n(i);
            }
        }

        @Override // sg.bigo.ads.f.d.a
        public final void a(@Nullable View view) {
            z i = i();
            if (i != null) {
                i.ad.a(view);
            }
        }

        @Override // sg.bigo.ads.f.d.a
        public final void a(@Nullable View view, @Nullable View view2) {
            z i = i();
            if (i != null) {
                i.a(view, view2);
            }
        }

        @Override // sg.bigo.ads.f.d.a
        public final int b() {
            z i = i();
            if (i == null) {
                return -1;
            }
            return i.d();
        }

        @Override // sg.bigo.ads.f.d.a
        public final void c() {
            z i = i();
            if (i != null) {
                i.f(5);
            }
        }

        @Override // sg.bigo.ads.f.d.a
        public final void d() {
            z i = i();
            if (i != null) {
                i.aV();
            }
        }

        @Override // sg.bigo.ads.f.d.a
        public final void e() {
            z i = i();
            if (i != null) {
                z.k(i);
            }
        }

        @Override // sg.bigo.ads.f.d.a
        @Nullable
        public final sg.bigo.ads.n.c f() {
            z i = i();
            if (i == null) {
                return null;
            }
            return i.u;
        }

        @Override // sg.bigo.ads.f.d.a
        public final void g() {
            z i = i();
            if (i != null) {
                z.l(i);
            }
        }

        @Override // sg.bigo.ads.f.d.a
        @Nullable
        public final t h() {
            z i = i();
            if (i == null) {
                return null;
            }
            return (t) i.A;
        }
    }

    static final class d implements e.a {

        @NonNull
        private final WeakReference<z> a;

        d(@NonNull z zVar) {
            this.a = new WeakReference<>(zVar);
        }

        @Nullable
        private z f() {
            return this.a.get();
        }

        @Override // sg.bigo.ads.f.e.a
        public final int a() {
            z f = f();
            if (f == null) {
                return -1;
            }
            return f.d();
        }

        @Override // sg.bigo.ads.f.e.a
        public final void a(int i) {
            z f = f();
            if (f != null) {
                f.m(i);
            }
        }

        @Override // sg.bigo.ads.f.e.a
        public final int b() {
            sg.bigo.ads.ai.o oVar;
            z f = f();
            if (f == null || (oVar = ((sg.bigo.ads.ad.interstitial.a) f).c) == null) {
                return 0;
            }
            return oVar.a("mid_page.show_time");
        }

        @Override // sg.bigo.ads.f.e.a
        @Nullable
        public final sg.bigo.ads.f.c c() {
            z f = f();
            if (f == null) {
                return null;
            }
            return f.ay();
        }

        @Override // sg.bigo.ads.f.e.a
        @Nullable
        public final q d() {
            z f = f();
            if (f == null) {
                return null;
            }
            return f.s;
        }

        @Override // sg.bigo.ads.f.e.a
        public final boolean e() {
            z f = f();
            return f != null && f.I.d;
        }
    }

    protected z(@NonNull Activity activity) {
        super(activity);
        this.K = false;
        this.L = true;
        this.M = 1;
        this.R = false;
        this.S = false;
        this.V = 9;
        this.I = new sg.bigo.ads.i.a();
        this.X = new AtomicBoolean(false);
        this.aa = true;
        this.ac = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.11
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) z.this.A)) {
                    return;
                }
                z.this.m(5);
                z.p(z.this);
            }
        };
        this.ad = new b(this, (byte) 0);
    }

    private void a(@NonNull sg.bigo.ads.f.a aVar, @NonNull View view) {
        sg.bigo.ads.ai.o oVar;
        String str;
        ViewGroup viewGroup = this.F;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            int i = R.layout.bigo_ad_activity_interstitial_rich_video_empty_end;
            ViewGroup viewGroup2 = this.F;
            sg.bigo.ads.common.utils.a.a(context, i, viewGroup2, viewGroup2 != null);
            ViewGroup viewGroup3 = (ViewGroup) this.F.findViewById(R.id.inter_layout_end_page);
            if (viewGroup3 == null) {
                sg.bigo.ads.bn.a.a(0, "RichInterstitialVideoActivityImpl", "playContainer is null.");
                return;
            }
            sg.bigo.ads.n.c cVar = this.u;
            if (cVar != null) {
                cVar.a(viewGroup3, 8);
            }
            sg.bigo.ads.common.utils.v.a(view, (ViewGroup) viewGroup3.findViewById(R.id.inter_end_page), new FrameLayout.LayoutParams(-1, -1, 17), -1);
            view.setTag(20);
            this.F.setTag(20);
            a(view, this.F);
            aVar.a(1);
            if (this.e) {
                oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
                str = "endpage.close_click_seconds";
            } else {
                oVar = ((sg.bigo.ads.ad.interstitial.a) this).b;
                str = "interstitial_video_style.endpage.impression_close_seconds";
            }
            a(oVar.a(str) * 1000);
            AdCountDownButton adCountDownButton = this.C;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            if (((t) this.A).K().D() != null) {
                ((t) this.A).K().D().bringToFront();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(sg.bigo.ads.f.c cVar, int i) {
        if (cVar != null) {
            if (aQ() || aO()) {
                cVar.n = 1;
                cVar.e = new c.b() { // from class: sg.bigo.ads.ad.interstitial.z.20
                    @Override // sg.bigo.ads.f.c.b
                    public final void a() {
                        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.20.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AdCountDownButton adCountDownButton;
                                if (z.this.d() != 5 || (adCountDownButton = z.this.C) == null || adCountDownButton.getVisibility() == 0) {
                                    return;
                                }
                                z.h(z.this);
                                z.this.E();
                            }
                        });
                    }
                };
                cVar.a(new a(13, i));
                cVar.a(this.N);
            }
        }
    }

    private boolean aO() {
        return sg.bigo.ads.f.d.a(this.E, ay());
    }

    private void aP() {
        sg.bigo.ads.f.a ax;
        if (this.A == 0 || !aQ() || (ax = ax()) == null) {
            return;
        }
        ax.a(new a(15, 9));
        ax.a(new c.a() { // from class: sg.bigo.ads.ad.interstitial.z.21
            @Override // sg.bigo.ads.h.c.a
            public final void a(sg.bigo.ads.an.i iVar, sg.bigo.ads.api.core.e eVar) {
                ((t) z.this.A).K().a(iVar, 15, 9, eVar);
            }
        });
        ax.a(this.N);
    }

    private boolean aQ() {
        return P() || this.q.get();
    }

    private void aR() {
        an().a();
        sg.bigo.ads.common.utils.o oVar = this.w;
        if (oVar != null) {
            oVar.b();
        }
        sg.bigo.ads.common.utils.o oVar2 = this.x;
        if (oVar2 != null) {
            oVar2.b();
        }
        if (this.X.get()) {
            c(this.w, this.x, an());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aS() {
        if (an() instanceof sg.bigo.ads.k.a) {
            return;
        }
        boolean z = this.R;
        if (!z && !this.e && this.M == 1) {
            this.l.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) z.this.A)) {
                        return;
                    }
                    z.this.aT();
                }
            }, ((sg.bigo.ads.ad.interstitial.a) this).b.a("interstitial_video_style.video_play_page.cta_animation_show_wait_time") * 1000);
            return;
        }
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar == null || z || !this.e || !oVar.c("video_play_page.is_cta_show_animation")) {
            return;
        }
        aT();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aT() {
        View findViewById;
        if ((an() instanceof sg.bigo.ads.k.a) || this.F == null || d() != 0 || !this.K || (findViewById = this.F.findViewById(R.id.inter_btn_cta_layout)) == null) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(findViewById);
        this.R = true;
    }

    private int aU() {
        sg.bigo.ads.ai.o oVar;
        if (aN()) {
            if (this.e && (oVar = ((sg.bigo.ads.ad.interstitial.a) this).c) != null) {
                r2 = oVar.a("endpage.ad_component_layout");
            }
            return r2 != 2 ? R.layout.bigo_ad_activity_interstitial_rich_video_end_landscape : R.layout.bigo_ad_activity_interstitial_rich_video_end_landscape_2;
        }
        if (this.S) {
            return R.layout.bigo_ad_activity_interstitial_rich_video_end;
        }
        r2 = this.e ? ((sg.bigo.ads.ad.interstitial.a) this).c.a("endpage.ad_component_layout") : 1;
        return r2 != 2 ? r2 != 3 ? r2 != 4 ? R.layout.bigo_ad_activity_interstitial_rich_video_end : R.layout.bigo_ad_activity_interstitial_rich_video_end_4 : R.layout.bigo_ad_activity_interstitial_rich_video_end_3 : R.layout.bigo_ad_activity_interstitial_rich_video_end_2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aV() {
        View findViewById;
        an().f();
        ViewGroup viewGroup = this.F;
        if (viewGroup == null) {
            return;
        }
        if (this.K) {
            View findViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
            if (findViewById2 != null) {
                this.K = false;
                sg.bigo.ads.ad.interstitial.c.a(findViewById2);
            }
            View findViewById3 = this.F.findViewById(R.id.inter_ad_info_new);
            if (findViewById3 != null) {
                this.K = false;
                sg.bigo.ads.ad.interstitial.c.a(findViewById3);
            }
            View findViewById4 = this.F.findViewById(R.id.inter_ad_info_down);
            if (findViewById4 != null) {
                this.K = false;
                sg.bigo.ads.ad.interstitial.c.a(findViewById4);
            }
        }
        if (!this.L || (findViewById = this.F.findViewById(R.id.inter_media_container)) == null) {
            return;
        }
        this.L = false;
        sg.bigo.ads.ad.interstitial.c.c(findViewById);
        MediaView mediaView = (MediaView) findViewById.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.c();
        }
    }

    static /* synthetic */ boolean f(z zVar) {
        zVar.K = true;
        return true;
    }

    static /* synthetic */ int h(z zVar) {
        zVar.V = 8;
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(boolean z) {
        Button button = this.G;
        if (button != null) {
            button.setBackgroundResource(z ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute);
        }
    }

    static /* synthetic */ void k(z zVar) {
        View findViewById;
        ViewGroup viewGroup = zVar.F;
        if (viewGroup == null || (findViewById = viewGroup.findViewById(R.id.inter_layout_end_page)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    private void k(boolean z) {
        int i;
        View view;
        int b2;
        TextView textView;
        sg.bigo.ads.ai.o oVar;
        ViewGroup viewGroup = this.F;
        if (viewGroup == null) {
            return;
        }
        View findViewById = viewGroup.findViewById(R.id.inter_layout_playable_loading);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.10
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.ai.o oVar2;
                String str;
                z zVar = z.this;
                if (zVar.e) {
                    oVar2 = ((sg.bigo.ads.ad.interstitial.a) zVar).c;
                    str = "endpage.close_click_seconds";
                } else {
                    oVar2 = ((sg.bigo.ads.ad.interstitial.a) zVar).b;
                    str = "interstitial_video_style.endpage.impression_close_seconds";
                }
                z.this.a(oVar2.a(str) * 1000);
                AdCountDownButton adCountDownButton = z.this.C;
                if (adCountDownButton != null) {
                    adCountDownButton.e();
                }
            }
        };
        sg.bigo.ads.j.a aVar = this.W;
        if (aVar != null) {
            view = aVar.a(this, this.F, am());
            runnable.run();
            i = 0;
        } else {
            View findViewById2 = this.F.findViewById(R.id.inter_end_page);
            if (findViewById2 == null) {
                Context context = this.F.getContext();
                int aU = aU();
                ViewGroup viewGroup2 = this.F;
                sg.bigo.ads.common.utils.a.a(context, aU, viewGroup2, viewGroup2 != null);
            }
            View findViewById3 = this.F.findViewById(R.id.inter_layout_end_page);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            if (findViewById2 == null) {
                View findViewById4 = this.F.findViewById(R.id.inter_end_page);
                View findViewById5 = this.F.findViewById(R.id.inter_end_page_image);
                if (findViewById4 != null && findViewById3 != null) {
                    int i2 = this.e ? 9 : 4;
                    u an = an();
                    ViewGroup viewGroup3 = this.F;
                    int am = am();
                    sg.bigo.ads.ai.o oVar2 = ((sg.bigo.ads.ad.interstitial.a) this).c;
                    an.a(viewGroup3, findViewById3, am, i2, oVar2 == null ? 0 : oVar2.a("endpage.click_type"), findViewById3);
                    View view2 = findViewById5 == null ? findViewById4 : findViewById5;
                    View view3 = findViewById5 == null ? findViewById3 : findViewById4;
                    view2.setTag(5);
                    view3.setTag(9);
                    a(view2, view3);
                    TextView textView2 = (TextView) findViewById4.findViewById(R.id.inter_advertiser);
                    TextView textView3 = (TextView) findViewById4.findViewById(R.id.inter_ad_label);
                    if (TextUtils.isEmpty(this.m)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(this.m);
                        textView3.setText(R.string.bigo_ad_tag);
                    }
                    sg.bigo.ads.ad.interstitial.c.d(findViewById4);
                    View findViewById6 = findViewById4.findViewById(R.id.inter_btn_cta);
                    boolean z2 = !this.e || ((sg.bigo.ads.ad.interstitial.a) this).c.c("endpage.is_cta_show_animation");
                    if (z2 && findViewById6 != null) {
                        if (this.e) {
                            findViewById6.setBackgroundColor(this.o);
                        }
                        sg.bigo.ads.ad.interstitial.c.e(findViewById6);
                    }
                    runnable.run();
                    sg.bigo.ads.n.c cVar = this.u;
                    if (cVar != null) {
                        cVar.a((ViewGroup) findViewById3, 1);
                    }
                    if (aN()) {
                        Context context2 = findViewById4.getContext();
                        if (!TextUtils.isEmpty(this.m) && textView3 != null && context2 != null) {
                            textView3.setText(this.m + " · " + context2.getString(R.string.bigo_ad_tag));
                        }
                        View findViewById7 = findViewById4.findViewById(R.id.inter_btn_end_page_cta_layout);
                        if (z2 && findViewById7 != null) {
                            if (findViewById6 != null) {
                                findViewById6.clearAnimation();
                            }
                            sg.bigo.ads.ad.interstitial.c.e(findViewById7);
                        }
                        if (this.e && (textView = (TextView) findViewById4.findViewById(R.id.inter_company)) != null) {
                            textView.setTextColor(this.o);
                        }
                        sg.bigo.ads.ad.interstitial.d dVar = new sg.bigo.ads.ad.interstitial.d();
                        TextView textView4 = (TextView) findViewById4.findViewById(R.id.inter_title);
                        if (textView4 != null) {
                            dVar.b(textView4);
                        }
                        TextView textView5 = (TextView) findViewById4.findViewById(R.id.inter_description);
                        if (textView5 != null) {
                            dVar.b(textView5);
                        }
                        sg.bigo.ads.ai.o oVar3 = ((sg.bigo.ads.ad.interstitial.a) this).c;
                        if (oVar3 != null) {
                            int a2 = oVar3.a("video_play_page.background_colour");
                            if (a2 == 1) {
                                b2 = -1;
                            } else if (a2 == 2) {
                                b2 = -16777216;
                            } else if (a2 == 4) {
                                b2 = this.n;
                            } else if (a2 == 5) {
                                an().a(this.F);
                            } else {
                                b2 = sg.bigo.ads.common.utils.r.b("#262E33", -7829368);
                            }
                            dVar.a(b2);
                        }
                        IconListView iconListView = (IconListView) findViewById4.findViewById(R.id.inter_iconlist_download_msg_list);
                        if (this.k != null && iconListView != null) {
                            iconListView.setThemeWhite(dVar.c == sg.bigo.ads.ad.interstitial.d.a);
                            iconListView.a(this.k);
                            i = 0;
                            iconListView.setVisibility(0);
                            view = findViewById3;
                        }
                    }
                    i = 0;
                    view = findViewById3;
                }
            }
            i = 0;
            view = findViewById3;
        }
        if (((t) this.A).K().D() != null) {
            ((t) this.A).K().D().bringToFront();
        }
        if (!z || view == null || (oVar = ((sg.bigo.ads.ad.interstitial.a) this).c) == null) {
            return;
        }
        a(view, this.e ? oVar.a("endpage.below_area_dp") : i, (this.e && ((sg.bigo.ads.ad.interstitial.a) this).c.a("endpage.below_area_clickable") == 1) ? 1 : i, this.e ? ((sg.bigo.ads.ad.interstitial.a) this).c.a("endpage.up_area_dp") : i, (this.e && ((sg.bigo.ads.ad.interstitial.a) this).c.a("endpage.up_area_clickable") == 1) ? 1 : i, 9, ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.click_type"));
    }

    static /* synthetic */ void l(z zVar) {
        if (zVar.C != null) {
            zVar.a((((sg.bigo.ads.ad.interstitial.a) zVar).c != null ? r0.a("endpage.close_click_seconds") : sg.bigo.ads.ai.k.a.p().c()) * 1000);
            zVar.C.e();
        }
    }

    static /* synthetic */ boolean p(z zVar) {
        zVar.ab = false;
        return false;
    }

    private int r(int i) {
        sg.bigo.ads.f.a ax;
        View a2;
        if (!U() && aF() && (ax = ax()) != null) {
            if (ax.a && ax.b() && (a2 = ax.a()) != null) {
                if ((a2 instanceof ViewGroup) && !((sg.bigo.ads.ad.interstitial.a) this).b.c("interstitial_video_style.endpage.is_global_click")) {
                    a2.setOnClickListener(null);
                }
                a(ax, a2);
                return 7;
            }
            if (!ax.b()) {
                ax.f();
            }
        }
        if (!U() && this.q.get()) {
            s(i);
            return 1;
        }
        this.S = false;
        k(true);
        return 1;
    }

    private void s(int i) {
        String str;
        if (((t) this.A).f() == null) {
            return;
        }
        sg.bigo.ads.cp.a f = ((t) this.A).f();
        sg.bigo.ads.common.view.c D = ((t) this.A).K().D();
        if (f.bq() == null || this.F == null) {
            sg.bigo.ads.f.c ay = ay();
            if (U() || ay == null || !ay.b()) {
                this.S = true;
                k(true);
                return;
            }
            f.k(3);
            a(i, ay);
            if (D != null) {
                D.bringToFront();
                return;
            }
            return;
        }
        ImageView imageView = new ImageView(this.F.getContext());
        imageView.setImageBitmap((Bitmap) f.bq().first);
        sg.bigo.ads.common.utils.v.a(imageView, this.F, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        imageView.setTag(15);
        this.F.setTag(20);
        a(imageView, this.F);
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar != null) {
            str = "endpage.close_click_seconds";
        } else {
            oVar = ((sg.bigo.ads.ad.interstitial.a) this).b;
            str = "interstitial_video_style.endpage.impression_close_seconds";
        }
        a(oVar.a(str) * 1000);
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        if (D != null) {
            D.bringToFront();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected void D() {
        super.D();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(true);
            this.C.setTakeoverTickEvent(!this.q.get());
            this.I.i = true ^ this.q.get();
            if (R()) {
                k(R.drawable.bigo_ad_ic_close);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (r1 > 0) goto L20;
     */
    @Override // sg.bigo.ads.ad.interstitial.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void E() {
        long a2;
        long j;
        super.E();
        if (d() == 0 || (d() == 14 && e() == -1)) {
            sg.bigo.ads.i.a aVar = this.I;
            if (aVar.a() && aVar.i) {
                sg.bigo.ads.common.utils.o oVar = aVar.f;
                if (oVar != null) {
                    oVar.b();
                }
                if (aVar.h <= 0 || !aVar.a()) {
                    sg.bigo.ads.y.b bVar = aVar.a;
                    sg.bigo.ads.cp.a aVar2 = bVar != null ? (sg.bigo.ads.cp.a) bVar.f() : null;
                    if (aVar2 != null) {
                        sg.bigo.ads.api.core.n bd = aVar2.bd();
                        long j2 = bd != null ? bd.c : 0L;
                        if (j2 > 0) {
                            j = j2;
                            a.AnonymousClass3 anonymousClass3 = new sg.bigo.ads.common.utils.o(j, sg.bigo.ads.common.utils.s.a.a(1)) { // from class: sg.bigo.ads.i.a.3
                                public AnonymousClass3(long j3, long j4) {
                                    super(j3, j4);
                                }

                                @Override // sg.bigo.ads.common.utils.o
                                public final void a() {
                                    a aVar3 = a.this;
                                    aVar3.e = true;
                                    if (aVar3.i) {
                                        a.a(aVar3);
                                    }
                                }

                                @Override // sg.bigo.ads.common.utils.o
                                public final void a(long j3) {
                                    a aVar3 = a.this;
                                    if (aVar3.i && aVar3.g != null && aVar3.a()) {
                                        a.this.g.b(j3);
                                    }
                                }
                            };
                            aVar.f = anonymousClass3;
                            anonymousClass3.c();
                        }
                        a2 = aVar2.bc();
                    }
                    x xVar = aVar.b;
                    int i = xVar != null ? xVar.c : 0;
                    a2 = i < 0 ? sg.bigo.ads.common.utils.s.a.a(15) : i * 1000;
                } else {
                    a2 = aVar.h;
                }
                j3 = a2;
                a.AnonymousClass3 anonymousClass32 = new sg.bigo.ads.common.utils.o(j3, sg.bigo.ads.common.utils.s.a.a(1)) { // from class: sg.bigo.ads.i.a.3
                    public AnonymousClass3(long j3, long j4) {
                        super(j3, j4);
                    }

                    @Override // sg.bigo.ads.common.utils.o
                    public final void a() {
                        a aVar3 = a.this;
                        aVar3.e = true;
                        if (aVar3.i) {
                            a.a(aVar3);
                        }
                    }

                    @Override // sg.bigo.ads.common.utils.o
                    public final void a(long j3) {
                        a aVar3 = a.this;
                        if (aVar3.i && aVar3.g != null && aVar3.a()) {
                            a.this.g.b(j3);
                        }
                    }
                };
                aVar.f = anonymousClass32;
                anonymousClass32.c();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void I() {
        this.f = true;
        sg.bigo.ads.y.b K = ((t) this.A).K();
        boolean z = K != null && K.p == 22;
        if (this.e || d() != 0 || z) {
            super.I();
        } else {
            m(3);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void J() {
        sg.bigo.ads.f.b bVar;
        aK();
        Runnable runnable = this.T;
        if (runnable != null) {
            sg.bigo.ads.bh.d.a(runnable);
        }
        Runnable runnable2 = this.U;
        if (runnable2 != null) {
            sg.bigo.ads.bh.d.a(runnable2);
        }
        sg.bigo.ads.f.d dVar = this.Y;
        if (dVar != null && (bVar = dVar.b) != null) {
            bVar.b();
            dVar.b = null;
        }
        sg.bigo.ads.f.e eVar = this.Z;
        if (eVar != null) {
            eVar.d();
        }
        super.J();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected void N() {
        sg.bigo.ads.common.utils.o oVar = this.y;
        if (oVar != null) {
            oVar.b();
            this.y = null;
        }
        sg.bigo.ads.cp.a f = ((t) this.A).f();
        if (!this.q.get()) {
            a(f, false, this.i.k);
        } else if (f.bq() == null) {
            a(f, true, this.i.o);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.d.c.a
    public final LandingPageStyleConfig a(Context context, String str, int i, boolean z) {
        LandingPageStyleConfig aJ;
        if (d() != 1) {
            return super.a(context, str, i, z);
        }
        if (z) {
            sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
            if (oVar == null || !this.e) {
                oVar = null;
            }
            int a2 = sg.bigo.ads.j.a.a(oVar);
            if (sg.bigo.ads.ad.interstitial.a.j(a2)) {
                a2 = 0;
            }
            int i2 = a2;
            aJ = new LandingPageStyleConfig(sg.bigo.ads.ad.interstitial.a.i(i2), 1, i2, sg.bigo.ads.j.a.b(oVar), 0, 0, 0.0f);
        } else {
            aJ = aJ();
        }
        sg.bigo.ads.q.c.a(aJ);
        return aJ;
    }

    protected final void a(View view, View view2) {
        sg.bigo.ads.ai.o oVar;
        if (this.F == null) {
            return;
        }
        if (!this.e && ((sg.bigo.ads.ad.interstitial.a) this).b.c("interstitial_video_style.endpage.is_global_click")) {
            ViewGroup viewGroup = this.F;
            if (viewGroup != null) {
                viewGroup.setTag(11);
                a(this.F, 4, ((t) this.A).K(), 0);
                return;
            }
            return;
        }
        if (!this.e || (oVar = ((sg.bigo.ads.ad.interstitial.a) this).c) == null) {
            return;
        }
        if (oVar.c("endpage.media_view_clickable_switch")) {
            a(view, 9, ((t) this.A).K(), ((sg.bigo.ads.ad.interstitial.a) this).c.a("endpage.click_type"));
        } else {
            a(view, 9, r.H, 0);
        }
        if (((sg.bigo.ads.ad.interstitial.a) this).c.c("endpage.other_space_clickable_switch")) {
            a(view2, 9, ((t) this.A).K(), ((sg.bigo.ads.ad.interstitial.a) this).c.a("endpage.click_type"));
        } else {
            a(view2, 9, r.H, 0);
        }
    }

    protected void a(sg.bigo.ads.cp.a aVar, boolean z, int i) {
        long a2;
        if (z) {
            int a3 = x.a(i);
            if (a3 == 0) {
                return;
            } else {
                a2 = sg.bigo.ads.common.utils.s.a.a(a3);
            }
        } else {
            long aT = aVar.aT();
            sg.bigo.ads.common.utils.s sVar = sg.bigo.ads.common.utils.s.a;
            if (aT <= sVar.a(5)) {
                return;
            }
            int i2 = this.i.k;
            if (i2 == 5) {
                sg.bigo.ads.api.core.n bd = aVar.bd();
                long j = bd != null ? bd.c : 0L;
                if (j <= 0) {
                    j = aVar.bc();
                }
                a2 = Math.max(0L, j - ((((sg.bigo.ads.ad.interstitial.a) this).c != null ? r7.a("video_play_page.auto_click_sec") : 0) * 1000));
            } else if (i2 == 2) {
                a2 = sVar.a(5);
            } else {
                if (i2 != 4) {
                    return;
                }
                sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
                a2 = sVar.a(oVar != null ? oVar.a("video_play_page.auto_click_sec") : 0);
            }
        }
        if (a2 == 0) {
            a2 = 500;
        }
        sg.bigo.ads.common.utils.o oVar2 = new sg.bigo.ads.common.utils.o(a2) { // from class: sg.bigo.ads.ad.interstitial.z.4
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                z zVar = z.this;
                if (zVar.J || zVar.f) {
                    return;
                }
                zVar.f = true;
                ((t) zVar.A).K().a((sg.bigo.ads.an.i) null, z.this.az(), 22);
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j2) {
            }
        };
        this.y = oVar2;
        oVar2.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(boolean z, boolean z2) {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        if (z2) {
            sg.bigo.ads.f.e eVar = this.Z;
            if (eVar != null) {
                eVar.d();
            }
            if (aE()) {
                if (S()) {
                    k(R.drawable.bigo_ad_ic_close);
                }
                if (this instanceof sg.bigo.ads.s.b) {
                    ((sg.bigo.ads.s.b) this).a(0);
                }
                a(this.I, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.this.aA();
                        q qVar = z.this.s;
                        if (qVar != null) {
                            if (qVar.D) {
                                return;
                            }
                            if (z.this.s.y.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.6.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    z.this.m(1);
                                }
                            })) {
                                return;
                            }
                        }
                        z.this.m(1);
                    }
                });
            }
        }
    }

    protected final boolean a(int i, @NonNull sg.bigo.ads.f.c cVar) {
        sg.bigo.ads.f.d dVar = this.Y;
        return dVar != null && dVar.a(i, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.q.c.b
    public final boolean a(@NonNull MotionEvent motionEvent, @Nullable c.a aVar, int i) {
        Object an = an();
        if ((an instanceof sg.bigo.ads.q.d) && (an instanceof sg.bigo.ads.k.a)) {
            sg.bigo.ads.k.a aVar2 = (sg.bigo.ads.k.a) an;
            sg.bigo.ads.q.d dVar = (sg.bigo.ads.q.d) an;
            if (dVar.K() && !dVar.L()) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                Button m = aVar2.m();
                if (m != null && sg.bigo.ads.common.utils.v.b(m, rawX, rawY)) {
                    if (motionEvent.getAction() == 1) {
                        m.performClick();
                    }
                    return true;
                }
                MediaView l = aVar2.l();
                MediaView.a b2 = l != null ? l.b() : null;
                if (b2 != null && b2.a() && sg.bigo.ads.common.utils.v.b(l, rawX, rawY)) {
                    if (motionEvent.getAction() == 1) {
                        b2.b();
                    }
                    return true;
                }
            }
        }
        return super.a(motionEvent, aVar, i);
    }

    public final void aA() {
        if (this.J || this.f || this.i == null || !aB()) {
            return;
        }
        this.f = true;
        ((t) this.A).K().a((sg.bigo.ads.an.i) null, 8, 22);
    }

    protected boolean aB() {
        return this.i.k == 3;
    }

    @Override // sg.bigo.ads.i.a.InterfaceC1899a
    public final void aC() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.c();
    }

    @Override // sg.bigo.ads.i.a.InterfaceC1899a
    public final void aD() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.b();
    }

    protected final boolean aE() {
        int d2 = d();
        p pVar = this.t;
        return d2 == 0 || ((pVar != null && pVar.a()) && d2 == 14);
    }

    protected boolean aF() {
        sg.bigo.ads.ai.o oVar;
        sg.bigo.ads.j.a aVar;
        sg.bigo.ads.ai.o oVar2;
        if (this.A == 0) {
            return false;
        }
        return (aN() && this.e && (oVar2 = ((sg.bigo.ads.ad.interstitial.a) this).c) != null && oVar2.a("endpage.ad_component_layout") == 3) || !this.e || ((oVar = ((sg.bigo.ads.ad.interstitial.a) this).c) != null && oVar.a("endpage.ad_component_layout") == 5) || ((aVar = this.W) != null && aVar.g());
    }

    protected final void aG() {
        if (d() != 0 || this.ab) {
            return;
        }
        this.l.postDelayed(this.ac, 5000L);
        this.ab = true;
    }

    protected final void aH() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            sg.bigo.ads.common.utils.o oVar = adCountDownButton.b;
            if (oVar != null) {
                oVar.b();
            }
            adCountDownButton.c = true;
            adCountDownButton.d = true;
            adCountDownButton.a(true);
        }
        VideoController ao = ao();
        sg.bigo.ads.common.utils.o oVar2 = this.w;
        if (oVar2 != null) {
            oVar2.d();
        }
        sg.bigo.ads.common.utils.o oVar3 = this.y;
        if (oVar3 != null) {
            oVar3.d();
        }
        sg.bigo.ads.common.utils.o oVar4 = this.z;
        if (oVar4 != null) {
            oVar4.d();
        }
        sg.bigo.ads.common.utils.o oVar5 = this.x;
        if (oVar5 != null) {
            oVar5.d();
        }
        if (ao == null || !ao.isPlaying()) {
            return;
        }
        ao.pause();
    }

    protected final void aI() {
        if (this.ab) {
            this.l.removeCallbacks(this.ac);
            this.ab = false;
        }
    }

    @NonNull
    protected LandingPageStyleConfig aJ() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar == null || !this.e) {
            oVar = null;
        }
        int a2 = sg.bigo.ads.j.a.a(oVar);
        int b2 = sg.bigo.ads.j.a.b(oVar);
        int i = sg.bigo.ads.j.a.a(this.W, oVar) ? an().j : 0;
        if (i == 0) {
            i = s.a(this.E, 0);
        }
        int i2 = i;
        Class<? extends sg.bigo.ads.controller.landing.c> i3 = sg.bigo.ads.ad.interstitial.a.i(a2);
        ViewGroup viewGroup = this.F;
        return new LandingPageStyleConfig(i3, 1, a2, b2, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, i2, 0.8f);
    }

    protected void aK() {
        T t = this.A;
        if (t != 0) {
            t tVar = (t) t;
            sg.bigo.ads.f.c cVar = tVar.D;
            if (cVar != null) {
                cVar.e();
                tVar.D = null;
            }
            t tVar2 = (t) this.A;
            sg.bigo.ads.f.a aVar = tVar2.E;
            if (aVar != null) {
                aVar.e();
                tVar2.E = null;
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.q.c.b
    public final void a_(int i) {
        super.a_(i);
        this.J = true;
        sg.bigo.ads.common.utils.o oVar = this.y;
        if (oVar != null) {
            oVar.b();
            this.y = null;
        }
        if (d() == 0 && i == 0 && k() && !l()) {
            an().b = new e.a() { // from class: sg.bigo.ads.ad.interstitial.z.2
                @Override // sg.bigo.ads.ad.interstitial.e.a
                public final boolean a(Runnable runnable) {
                    z zVar = z.this;
                    return zVar.a(zVar.an(), runnable);
                }
            };
            q qVar = this.s;
            if (qVar != null) {
                qVar.C = new q.c() { // from class: sg.bigo.ads.ad.interstitial.z.3
                    @Override // sg.bigo.ads.ad.interstitial.q.c
                    public final boolean a(Runnable runnable) {
                        z zVar = z.this;
                        return zVar.a(zVar.s, runnable);
                    }
                };
            }
            this.X.set(true);
            a(this.z, this.s, this.I, this.w, this.x, an());
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected int ac() {
        int o = o();
        if (!aN()) {
            switch (o) {
                case 2:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_2;
                case 3:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_3;
                case 4:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_4;
                case 5:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_5;
                case 6:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_download_6;
                case 7:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_download_7;
                case 8:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_download_8;
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    return R.layout.bigo_ad_activity_interstitial_rich_video;
                case 13:
                case 18:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_13;
                case 14:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_14;
                case 15:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_15;
                case 16:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_16;
                case 17:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_17;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return R.layout.bigo_ad_activity_interstitial_rich_video_19_29;
                case 30:
                    return R.layout.bigo_ad_activity_interstitial_percent_warning;
                case 31:
                case 32:
                    return s.a(s.a(this.E), o);
            }
        }
        T t = this.A;
        sg.bigo.ads.cp.a aVar = null;
        if (t != 0 && ((t) t).K() != null) {
            aVar = (sg.bigo.ads.cp.a) ((t) this.A).K().f();
        }
        boolean z = false;
        if (aVar != null) {
            sg.bigo.ads.api.core.n bd = aVar.bd();
            Activity activity = this.N;
            if (bd != null && activity != null && (bd.a * 1.0f) / bd.b == (activity.getResources().getDisplayMetrics().widthPixels * 1.0f) / sg.bigo.ads.common.utils.f.c(activity)) {
                z = true;
            }
        }
        if (o == 1) {
            return z ? R.layout.bigo_ad_activity_interstitial_style_landscape_1_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_1;
        }
        if (o != 3) {
            return o != 4 ? o != 5 ? z ? R.layout.bigo_ad_activity_interstitial_style_landscape_2_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_2 : R.layout.bigo_ad_activity_interstitial_percent_warning_landscape : z ? R.layout.bigo_ad_activity_interstitial_style_landscape_4_full_media : R.layout.bigo_ad_activity_interstitial_style_landscape_4;
        }
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar == null) {
            oVar = ((sg.bigo.ads.ad.interstitial.a) this).b;
        }
        if (oVar != null && aVar != null) {
            int a2 = oVar.a("video_play_page.gp_element");
            if ((!TextUtils.isEmpty(aVar.o()) || (a2 != 0 && a2 != 1 && a2 != 4)) && this.k != null) {
                return R.layout.bigo_ad_activity_interstitial_style_landscape_3;
            }
        }
        return R.layout.bigo_ad_activity_interstitial_style_landscape_3_no_gp_element;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final boolean ad() {
        return this.e;
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    protected int am() {
        return this.q.get() ? 3 : 1;
    }

    protected boolean as() {
        sg.bigo.ads.u.a aVar = this.v;
        if (aVar == null || !aVar.d()) {
            return sg.bigo.ads.j.a.a(this.W, this.e ? ((sg.bigo.ads.ad.interstitial.a) this).c : null);
        }
        return true;
    }

    protected void at() {
        p pVar;
        if (this.t != null) {
            return;
        }
        p pVar2 = new p(((t) this.A).K(), an());
        this.t = pVar2;
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar != null) {
            int a2 = oVar.a("multi_ads.page_group_type", 1);
            pVar2.g = a2;
            if (a2 == 2 || a2 == 3) {
                pVar2.h = true;
                pVar2.c = oVar.a("play_page.is_loading", 1);
                pVar2.d = oVar.a("play_page.loading_timing", 0);
                pVar2.e = oVar.a("play_page.force_staying_time", 15);
                pVar2.f = oVar.a("play_page.duration", 30);
                pVar = this.t;
                if (pVar == null && pVar.a()) {
                    f(14);
                    x xVar = this.i;
                    p pVar3 = this.t;
                    xVar.j = pVar3.e;
                    xVar.c = pVar3.f;
                    return;
                }
            }
        }
        pVar2.h = false;
        pVar = this.t;
        if (pVar == null) {
        }
    }

    protected final void au() {
        an().a(this.F);
    }

    public final void av() {
        if (aF() || !aQ()) {
            return;
        }
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.19
            @Override // java.lang.Runnable
            public final void run() {
                T t = z.this.A;
                if (t != 0) {
                    ((sg.bigo.ads.cp.a) ((t) t).K().f()).d(3);
                    z.this.a(((t) z.this.A).a((b.a) null), 9);
                }
            }
        });
    }

    protected final void aw() {
        if (this.A != 0) {
            if (aQ() || aO()) {
                a(ay(), 9);
                aP();
            }
        }
    }

    protected sg.bigo.ads.f.a ax() {
        T t = this.A;
        if (t == 0) {
            return null;
        }
        return ((t) t).E;
    }

    protected sg.bigo.ads.f.c ay() {
        T t = this.A;
        if (t == 0) {
            return null;
        }
        return ((t) t).D;
    }

    public final int az() {
        switch (d()) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return 9;
            case 2:
            case 9:
                return 10;
            case 3:
            default:
                return 8;
            case 10:
                return 11;
        }
    }

    @Override // sg.bigo.ads.i.a.InterfaceC1899a
    public final void b(long j) {
        if (this.C == null || d() == 14) {
            return;
        }
        this.C.a(j);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void b(String str) {
        aI();
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.13
            @Override // java.lang.Runnable
            public final void run() {
                z.this.m(4);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    @NonNull
    protected x c() {
        x xVar = new x();
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar == null) {
            this.e = false;
            xVar.k = 1;
            xVar.l = -1;
            xVar.a = ((sg.bigo.ads.ad.interstitial.a) this).b.c("interstitial_video_style.video_play_page.is_global_click");
            xVar.b = ((sg.bigo.ads.ad.interstitial.a) this).b.a("interstitial_video_style.video_play_page.impression_close_seconds");
            xVar.c = ((sg.bigo.ads.ad.interstitial.a) this).b.a("interstitial_video_style.video_play_page.close_click_seconds");
            xVar.d = ((sg.bigo.ads.ad.interstitial.a) this).b.c("interstitial_video_style.video_play_page.is_jump_layer");
            xVar.e = ((sg.bigo.ads.ad.interstitial.a) this).b.a("interstitial_video_style.layer.impression_layer_close_seconds");
            return xVar;
        }
        this.e = true;
        xVar.f = oVar.c("video_play_page.media_view_clickable_switch");
        xVar.h = ((sg.bigo.ads.ad.interstitial.a) this).c.c("video_play_page.ad_component_clickable_switch");
        xVar.g = ((sg.bigo.ads.ad.interstitial.a) this).c.c("video_play_page.other_space_clickable_switch");
        xVar.i = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.click_type");
        xVar.m = ((sg.bigo.ads.ad.interstitial.a) this).c.c("layer.other_space_clickable_switch");
        xVar.n = ((sg.bigo.ads.ad.interstitial.a) this).c.a("layer.click_type");
        xVar.a = false;
        xVar.b = 0;
        xVar.c = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.force_staying_time");
        xVar.d = ((sg.bigo.ads.ad.interstitial.a) this).c.c("layer.is_show_layer");
        xVar.e = ((sg.bigo.ads.ad.interstitial.a) this).c.a("layer.force_staying_time");
        xVar.k = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.auto_click");
        xVar.l = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.auto_click_new", -1);
        xVar.o = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.time_for_auto_click", -1);
        xVar.p = ((sg.bigo.ads.ad.interstitial.a) this).c.a("video_play_page.time_for_show_backup", -1);
        return xVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected final void c(boolean z) {
        super.c(z);
        this.r = z;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.q.c.b
    public final void d(int i) {
        super.d(i);
        if (d() != 0) {
            aR();
            c(this.w, this.x, an());
        }
        if (this.X.compareAndSet(true, false)) {
            b(this.z, this.s, this.I, this.w, this.x, an());
            if (this.I.d) {
                c(this.w, this.x, an());
            }
            f();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void f(int i) {
        ViewGroup viewGroup;
        super.f(i);
        if (i != 9 || P() || (viewGroup = this.F) == null) {
            return;
        }
        viewGroup.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.9
            @Override // java.lang.Runnable
            public final void run() {
                if (z.this.N.isFinishing()) {
                    return;
                }
                z.this.j();
            }
        }, 50L);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected boolean f(boolean z) {
        sg.bigo.ads.f.c ay;
        q qVar;
        T t;
        sg.bigo.ads.ai.o oVar;
        String str;
        p pVar;
        int d2 = d();
        if (d2 == 14 && (pVar = this.t) != null) {
            pVar.a(this.C);
        }
        if (!P() && !this.q.get() && (d2 == 0 || d2 == 14)) {
            aR();
            B();
            b(true);
            AdCountDownButton adCountDownButton = this.C;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            p pVar2 = this.t;
            if (pVar2 != null && pVar2.h && !pVar2.i) {
                m(2);
                return false;
            }
            q qVar2 = this.s;
            if (qVar2 != null && (qVar2.y.a() || this.s.D)) {
                return false;
            }
            j();
            return !G();
        }
        if (d2 == 0 || d2 == 10 || d2 == 14) {
            aR();
            if (d2 != 10 && (qVar = this.s) != null && (qVar.y.a() || this.s.D)) {
                f(10);
                return false;
            }
            if (Q()) {
                return true;
            }
            m(2);
            if (d2 == 14 && (ay = ay()) != null) {
                ay.a(2);
            }
            return false;
        }
        if (d2 == 5) {
            boolean G = G();
            AdCountDownButton adCountDownButton2 = this.C;
            if (adCountDownButton2 != null) {
                adCountDownButton2.e();
                if (!G) {
                    if (this.e) {
                        oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
                        str = "endpage.close_click_seconds";
                    } else {
                        oVar = ((sg.bigo.ads.ad.interstitial.a) this).b;
                        str = "interstitial_video_style.endpage.impression_close_seconds";
                    }
                    a(oVar.a(str) * 1000);
                }
            }
            if (G && (t = this.A) != 0) {
                sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) ((t) t).f(), 9, this.V);
                sg.bigo.ads.f.c ay2 = ay();
                if (ay2 != null) {
                    ay2.a(2);
                }
                return false;
            }
            sg.bigo.ads.f.c ay3 = ay();
            if (ay3 != null) {
                ay3.a(2);
            }
        }
        if (d2 != 1 && d2 != 7) {
            return z;
        }
        boolean G2 = G();
        if (G2) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) ((t) this.A).f(), 9, 10);
        }
        return z && !G2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void g(@LayoutRes int i) {
        p pVar;
        View findViewById;
        p pVar2;
        super.g(i);
        if (this.F == null) {
            return;
        }
        if (as() && (P() || this.q.get())) {
            an().i();
        }
        a(aF());
        O();
        this.M = ((sg.bigo.ads.ad.interstitial.a) this).b.a("interstitial_video_style.video_play_page.cta_animation_show_way");
        l(i);
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) ((t) this.A).K().f();
        if (!aO() || ((pVar2 = this.t) != null && pVar2.h)) {
            p pVar3 = this.t;
            if (pVar3 != null && pVar3.h) {
                sg.bigo.ads.f.c ay = ay();
                if (ay != null) {
                    p pVar4 = this.t;
                    c.a aVar2 = ay.p;
                    if (aVar2 != null) {
                        aVar2.a = pVar4;
                    }
                }
                if (ay == null) {
                    ay = ((t) this.A).a(this.t);
                }
                a(ay, 16);
                sg.bigo.ads.f.a aVar3 = ((t) this.A).E;
                if (aVar3 != null && !(aVar3.b instanceof sg.bigo.ads.g.b)) {
                    aP();
                }
                this.t.o = ay;
            } else if (!aF()) {
                if (this.q.get() && aVar.br()) {
                    av();
                }
            }
            if (this.q.get()) {
                sg.bigo.ads.common.utils.o oVar = this.w;
                if (oVar != null) {
                    oVar.c();
                }
                sg.bigo.ads.common.utils.o oVar2 = this.x;
                if (oVar2 != null) {
                    oVar2.c();
                }
            } else {
                if (aVar.bq() == null) {
                    sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.17
                        @Override // java.lang.Runnable
                        public final void run() {
                            q qVar = z.this.s;
                            if (qVar != null) {
                                qVar.c();
                            }
                        }
                    });
                    if (aN() && (findViewById = this.F.findViewById(R.id.inter_ad_info)) != null) {
                        findViewById.setVisibility(0);
                    }
                }
                sg.bigo.ads.f.e eVar = this.Z;
                if (eVar != null) {
                    eVar.b();
                }
            }
            pVar = this.t;
            if (pVar == null && pVar.a()) {
                aV();
                m(15);
                return;
            }
        }
        aw();
        if (this.q.get()) {
        }
        pVar = this.t;
        if (pVar == null) {
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    protected void h() {
        VideoController ao;
        super.h();
        int d2 = d();
        if (d2 != 10 && (!this.q.get() || ((sg.bigo.ads.cp.a) ((t) this.A).K().f()).bq() != null)) {
            sg.bigo.ads.common.utils.o oVar = this.w;
            if (oVar != null && oVar.e()) {
                this.w.c();
            }
            sg.bigo.ads.common.utils.o oVar2 = this.x;
            if (oVar2 != null && oVar2.e()) {
                this.x.c();
            }
        }
        sg.bigo.ads.f.c ay = ay();
        if (ay != null) {
            ay.o.c();
        }
        sg.bigo.ads.j.a aVar = this.W;
        if (aVar != null) {
            aVar.b();
        }
        this.I.a(false);
        if ((d2 == 0 || d2 == 3) && (ao = ao()) != null && ao.isPaused() && this.aa) {
            ao.play();
            this.aa = false;
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.common.utils.o oVar3 = this.z;
        if (oVar3 != null && oVar3.e()) {
            this.z.c();
        }
        sg.bigo.ads.common.utils.o oVar4 = this.y;
        if (oVar4 == null || !oVar4.e()) {
            return;
        }
        this.y.c();
    }

    @CallSuper
    public void i(boolean z) {
        sg.bigo.ads.common.utils.o oVar = this.z;
        if (oVar != null) {
            oVar.b();
            this.z = null;
        }
        sg.bigo.ads.common.utils.o oVar2 = this.y;
        if (oVar2 != null) {
            oVar2.b();
            this.y = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    protected void j() {
        super.j();
        sg.bigo.ads.common.utils.o oVar = this.w;
        if (oVar != null) {
            oVar.d();
        }
        sg.bigo.ads.common.utils.o oVar2 = this.x;
        if (oVar2 != null) {
            oVar2.d();
        }
        sg.bigo.ads.common.utils.o oVar3 = this.y;
        if (oVar3 != null) {
            oVar3.d();
        }
        sg.bigo.ads.common.utils.o oVar4 = this.z;
        if (oVar4 != null) {
            oVar4.d();
        }
        sg.bigo.ads.f.c ay = ay();
        if (ay != null) {
            ay.o.d();
        }
        sg.bigo.ads.j.a aVar = this.W;
        if (aVar != null) {
            aVar.c();
        }
        boolean z = false;
        this.I.b(false);
        VideoController ao = ao();
        if (ao != null && ao.isPlaying()) {
            z = true;
        }
        this.aa = z;
        if (z) {
            ao.pause();
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.b();
    }

    protected void l(int i) {
        sg.bigo.ads.ai.o oVar;
        String str;
        RoundedFrameLayout roundedFrameLayout;
        if (an() instanceof sg.bigo.ads.k.a) {
            return;
        }
        e(i);
        View findViewById = this.F.findViewById(R.id.inter_ad_info);
        if (findViewById != null) {
            int i2 = t().a;
            if (i2 > 0) {
                Context context = findViewById.getContext();
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = sg.bigo.ads.common.utils.f.a(context, 10);
                    marginLayoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 10);
                    marginLayoutParams.bottomMargin = sg.bigo.ads.common.utils.f.a(context, i2);
                }
                View findViewById2 = this.F.findViewById(R.id.inter_ad_info_background);
                if (findViewById2 != null) {
                    if (findViewById2 instanceof RoundedFrameLayout) {
                        roundedFrameLayout = (RoundedFrameLayout) findViewById2;
                        roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 16));
                    }
                } else if (findViewById instanceof RoundedFrameLayout) {
                    roundedFrameLayout = (RoundedFrameLayout) findViewById;
                    roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 16));
                }
            }
            if (z() || T()) {
                this.K = true;
                aS();
                return;
            }
            if (this.e) {
                oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
                str = "video_play_page.ad_component_show_time";
            } else {
                oVar = ((sg.bigo.ads.ad.interstitial.a) this).b;
                str = "interstitial_video_style.video_play_page.impression_ad_seconds";
            }
            this.w = new AnonymousClass18(oVar.a(str) * 1000, findViewById);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    protected void m() {
        super.m();
        at();
        sg.bigo.ads.i.a aVar = this.I;
        sg.bigo.ads.y.b K = ((t) this.A).K();
        x xVar = this.i;
        sg.bigo.ads.ai.o oVar = this.e ? ((sg.bigo.ads.ad.interstitial.a) this).c : null;
        aVar.a = K;
        aVar.b = xVar;
        aVar.c = oVar != null ? oVar.a("video_play_page.countdown_way", 1) : 1;
        this.I.g = this;
        if (this.E != null && this.e && ((sg.bigo.ads.ad.interstitial.a) this).c != null && ((P() || this.q.get()) && !Q())) {
            sg.bigo.ads.j.a a2 = sg.bigo.ads.j.a.a(this.E, ((sg.bigo.ads.ad.interstitial.a) this).c, ((t) this.A).J(), this.u, aN());
            this.W = a2;
            if (a2 != null) {
                a2.h = this.P;
            }
        }
        this.Y = new sg.bigo.ads.f.d(new c(this));
        sg.bigo.ads.ai.o oVar2 = this.d;
        if (oVar2 == null || oVar2.a("playable_attr.playable_show_delay") <= 0) {
            return;
        }
        this.Z = new sg.bigo.ads.f.e(new d(this), this.d);
    }

    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [sg.bigo.ads.common.utils.o, sg.bigo.ads.f.c, sg.bigo.ads.i.a$a] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    public void m(int i) {
        View findViewById;
        final sg.bigo.ads.f.d dVar;
        ViewGroup a2;
        ?? r4;
        sg.bigo.ads.f.c cVar;
        ViewStub viewStub;
        View view;
        B();
        b(!this.q.get());
        final sg.bigo.ads.f.c ay = ay();
        final p pVar = this.t;
        if (pVar != null) {
            ViewGroup viewGroup = this.F;
            ViewGroup viewGroup2 = null;
            if (viewGroup == null || (cVar = pVar.o) == null || pVar.b == null) {
                r4 = 0;
                viewGroup2 = null;
            } else {
                if (pVar.h && !pVar.i) {
                    cVar.g();
                    View view2 = pVar.o.o.k;
                    if (view2 != null) {
                        sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_activity_interstitial_play_page, viewGroup, true);
                        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.inter_layout_end_page);
                        if (viewGroup3 != null) {
                            if (!pVar.o.b() && pVar.c != 0 && !pVar.j) {
                                if ((pVar.k == null || pVar.l == null) && (viewStub = (ViewStub) viewGroup.findViewById(R.id.bigo_web_loading_container)) != null) {
                                    View inflate = viewStub.inflate();
                                    pVar.k = inflate;
                                    if (inflate != null) {
                                        pVar.l = (ProgressBar) inflate.findViewById(R.id.bigo_ad_webview_loading_progress);
                                    }
                                }
                                View view3 = pVar.k;
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    ProgressBar progressBar = pVar.l;
                                    if (progressBar != null) {
                                        progressBar.setProgress(pVar.m);
                                    }
                                }
                                int i2 = pVar.d;
                                int i3 = i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 10 : 5 : 3;
                                if (i3 >= 3 && (view = pVar.k) != null) {
                                    view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.3
                                        AnonymousClass3() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            p.this.b();
                                        }
                                    }, i3 * 1000);
                                } else if (pVar.n) {
                                    pVar.b();
                                }
                                pVar.j = true;
                            }
                            sg.bigo.ads.common.utils.v.a(view2, (ViewGroup) viewGroup3.findViewById(R.id.inter_play_page), new FrameLayout.LayoutParams(-1, -1, 17), -1);
                            pVar.i = true;
                            TextView textView = (TextView) viewGroup3.findViewById(R.id.inter_advertiser);
                            TextView textView2 = (TextView) viewGroup3.findViewById(R.id.inter_ad_label);
                            String advertiser = pVar.a.getAdvertiser();
                            if (textView != null && textView2 != null) {
                                boolean isEmpty = TextUtils.isEmpty(advertiser);
                                textView.setVisibility(!isEmpty ? 0 : 8);
                                if (!isEmpty) {
                                    textView.setText(advertiser);
                                    textView2.setText(R.string.bigo_ad_tag);
                                }
                            }
                            r4 = 0;
                            pVar.b.a(viewGroup, viewGroup3, 1, 16, 0, null);
                            viewGroup2 = viewGroup3;
                        }
                    }
                }
                r4 = 0;
            }
            if (viewGroup2 != null) {
                aV();
                this.ad.a(viewGroup2);
                f(14);
                final p pVar2 = this.t;
                final AdCountDownButton adCountDownButton = this.C;
                if (adCountDownButton != null) {
                    if (pVar2.a()) {
                        sg.bigo.ads.common.utils.s sVar = sg.bigo.ads.common.utils.s.a;
                        final long a3 = sVar.a(pVar2.e);
                        final long a4 = sVar.a(pVar2.f);
                        sg.bigo.ads.common.utils.o anonymousClass1 = new sg.bigo.ads.common.utils.o(a4) { // from class: sg.bigo.ads.ad.interstitial.p.1
                            final /* synthetic */ long a;
                            final /* synthetic */ long b;
                            final /* synthetic */ AdCountDownButton c;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(final long a42, final long a422, final long a32, final AdCountDownButton adCountDownButton2) {
                                super(a422, 1000L);
                                r4 = a422;
                                r6 = a32;
                                r8 = adCountDownButton2;
                            }

                            @Override // sg.bigo.ads.common.utils.o
                            public final void a() {
                                a.InterfaceC1899a interfaceC1899a = p.this.p;
                                if (interfaceC1899a != null) {
                                    interfaceC1899a.a(false, true);
                                }
                                r8.e();
                            }

                            @Override // sg.bigo.ads.common.utils.o
                            public final void a(long j) {
                                if (r4 - j >= r6) {
                                    r8.c(true);
                                }
                                r8.a(j);
                            }
                        };
                        pVar2.q = anonymousClass1;
                        anonymousClass1.c();
                    } else {
                        final long a5 = sg.bigo.ads.common.utils.s.a.a(pVar2.e);
                        adCountDownButton2.clearAnimation();
                        adCountDownButton2.setVisibility(4);
                        sg.bigo.ads.common.utils.o anonymousClass2 = new sg.bigo.ads.common.utils.o(a5) { // from class: sg.bigo.ads.ad.interstitial.p.2
                            final /* synthetic */ AdCountDownButton a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass2(final long a52, final AdCountDownButton adCountDownButton2) {
                                super(a52, 1000L);
                                r6 = adCountDownButton2;
                            }

                            @Override // sg.bigo.ads.common.utils.o
                            public final void a() {
                                r6.setVisibility(0);
                                r6.e();
                                c.b((View) r6);
                            }

                            @Override // sg.bigo.ads.common.utils.o
                            public final void a(long j) {
                            }
                        };
                        pVar2.q = anonymousClass2;
                        anonymousClass2.c();
                    }
                }
                ay.a(1);
                sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) ((t) this.A).f(), 14, i);
                n(i);
                return;
            }
            p pVar3 = this.t;
            sg.bigo.ads.common.utils.o oVar = pVar3.q;
            if (oVar != null) {
                oVar.b();
            }
            pVar3.q = r4;
            pVar3.p = r4;
            pVar3.o = r4;
        }
        if (ay != null && !ay.b && ay.h() && (dVar = this.Y) != null && (a2 = dVar.a("force fallback: ")) != null) {
            ViewGroup a6 = dVar.a.a();
            dVar.a.a(a2, a6);
            sg.bigo.ads.f.b bVar = dVar.b;
            if (bVar != null) {
                bVar.b();
            }
            sg.bigo.ads.f.b bVar2 = new sg.bigo.ads.f.b(ay);
            dVar.b = bVar2;
            bVar2.d = new b.a() { // from class: sg.bigo.ads.f.d.1
                @Override // sg.bigo.ads.f.b.a
                public final void a() {
                    View view4 = ay.o.k;
                    if (view4 != null) {
                        view4.setTag(19);
                        d.this.a.a(view4);
                    }
                    d.this.a();
                }
            };
            if (a6 != null) {
                dVar.b.a(a2, a6.getContext());
            }
            dVar.a.g();
            dVar.a(i);
            return;
        }
        boolean z = ay != null && !ay.b && ay.a && (sg.bigo.ads.f.d.a(this.E, ay) || (!U() && P() && aF()));
        if (ay != null && z) {
            if (ay.b()) {
                a(i, ay);
                return;
            }
            if (sg.bigo.ads.ai.k.a.p().a()) {
                Runnable runnable = this.U;
                if (runnable == null) {
                    runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            sg.bigo.ads.bh.d.a(z.this.T);
                            ay.a(this);
                            sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.7.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                                    z.this.a(7, ay);
                                }
                            });
                        }
                    };
                    this.U = runnable;
                }
                ay.d = runnable;
                int b2 = sg.bigo.ads.ai.k.a.p().b();
                if (this.F != null && d() == 0 && d() == 10) {
                    f(4);
                    aV();
                    k(false);
                    F();
                    ViewGroup viewGroup4 = this.F;
                    if (viewGroup4 != null && (findViewById = viewGroup4.findViewById(R.id.inter_layout_playable_loading)) != null) {
                        findViewById.setVisibility(0);
                        int i4 = b2 > 0 ? b2 : 1;
                        Runnable runnable2 = this.T;
                        if (runnable2 == null) {
                            runnable2 = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.8
                                final /* synthetic */ int b = 7;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) z.this.A)) {
                                        return;
                                    }
                                    if (z.this.U != null) {
                                        ay.a(z.this.U);
                                    }
                                    z.this.o(this.b);
                                }
                            };
                            this.T = runnable2;
                        }
                        sg.bigo.ads.bh.d.a(2, runnable2, i4 * 1000);
                    }
                    sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) ((t) this.A).f(), d(), 7);
                    return;
                }
            } else if (a(i, ay)) {
                return;
            }
        }
        o(i);
    }

    protected void n(int i) {
    }

    protected final void o(int i) {
        if (this.F == null) {
            return;
        }
        if (d() != 0 && d() != 10 && d() != 4 && d() != 14) {
            sg.bigo.ads.bn.a.a(0, "RichInterstitialVideoActivityImpl", "end page can be shown but current page is not main or playable loading or mid page or play page.");
            return;
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        if (!P() && !this.q.get()) {
            G();
            return;
        }
        this.ad.a();
        aV();
        f(r(i));
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) ((t) this.A).f(), d(), i);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected final void q() {
        super.q();
        sg.bigo.ads.f.e eVar = this.Z;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected final void r() {
        sg.bigo.ads.f.c c2;
        super.r();
        sg.bigo.ads.f.e eVar = this.Z;
        if (eVar == null || !eVar.a() || eVar.c || eVar.d || (c2 = eVar.a.c()) == null || !c2.a || c2.b) {
            return;
        }
        if (eVar.a.b() != -1 && !eVar.a.e()) {
            eVar.b();
            return;
        }
        eVar.c = true;
        q d2 = eVar.a.d();
        if (d2 != null) {
            d2.i = false;
        }
        eVar.a.a(eVar.b);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected final void x() {
        final VideoController videoController;
        Button button;
        super.x();
        final sg.bigo.ads.y.b bVar = this.E;
        if (bVar == null || (videoController = bVar.getVideoController()) == null) {
            return;
        }
        u an = an();
        final boolean n = an instanceof sg.bigo.ads.k.a ? ((sg.bigo.ads.k.a) an).n() : false;
        this.G = (Button) q(R.id.inter_btn_mute);
        if (!this.q.get() && (button = this.G) != null && !n) {
            button.setVisibility(0);
            j(videoController.isMuted());
            this.G.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.z.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    videoController.mute(!r2.isMuted());
                }
            });
        }
        videoController.setVideoLifeCallback(new a.c(new VideoController.b() { // from class: sg.bigo.ads.ad.interstitial.z.12
            @Override // sg.bigo.ads.api.VideoController.b
            public final void a() {
                z.this.aG();
            }

            @Override // sg.bigo.ads.api.VideoController.b
            public final void b() {
                z.this.aI();
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onMuteChange(boolean z) {
                z.this.j(z);
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoEnd() {
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoPause() {
                q qVar = z.this.s;
                if (qVar != null) {
                    qVar.c();
                }
                if (z.this.Z != null) {
                    z.this.Z.c();
                }
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoPlay() {
                q qVar = z.this.s;
                if (qVar != null) {
                    qVar.b();
                }
                if (z.this.d() == 10) {
                    z.this.aH();
                } else if (z.this.Z != null) {
                    z.this.Z.b();
                }
            }

            @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoStart() {
                Context context;
                int i;
                if (z.this.q.compareAndSet(true, false)) {
                    AdCountDownButton adCountDownButton = z.this.C;
                    if (adCountDownButton != null) {
                        adCountDownButton.e();
                        z.this.C.setTakeoverTickEvent(true);
                        z zVar = z.this;
                        zVar.I.i = true;
                        zVar.E();
                    }
                    videoController.notifyPlayViewRegister();
                    z.this.N();
                    sg.bigo.ads.common.utils.o oVar = z.this.z;
                    if (oVar != null) {
                        oVar.b();
                        z.this.z = null;
                    }
                    z zVar2 = z.this;
                    if (zVar2.r) {
                        sg.bigo.ads.common.utils.o oVar2 = zVar2.w;
                        if (oVar2 != null) {
                            oVar2.c();
                        }
                        sg.bigo.ads.common.utils.o oVar3 = z.this.x;
                        if (oVar3 != null) {
                            oVar3.c();
                        }
                    }
                    Button button2 = z.this.G;
                    if (button2 != null && !n) {
                        button2.setVisibility(0);
                    }
                    z zVar3 = z.this;
                    if (zVar3.F != null) {
                        final u an2 = zVar3.an();
                        z zVar4 = z.this;
                        ViewGroup viewGroup = zVar4.F;
                        int am = zVar4.am();
                        b.d popPage = an2.c.getPopPage();
                        final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.inter_icon);
                        if (imageView != null && !an2.c.hasIcon()) {
                            String a2 = popPage == null ? "" : popPage.a();
                            if (sg.bigo.ads.common.utils.r.a((CharSequence) a2) || !URLUtil.isNetworkUrl(a2)) {
                                if (am == 2) {
                                    context = imageView.getContext();
                                    i = R.drawable.bigo_ad_icon_default;
                                } else if (am == 1) {
                                    an2.a(imageView);
                                } else if (am == 3) {
                                    context = imageView.getContext();
                                    i = R.drawable.bigo_ad_icon_novideo_default;
                                }
                                imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, i));
                            } else {
                                sg.bigo.ads.bj.e.a(an2.c.b.e, a2, ((sg.bigo.ads.cp.a) an2.c.f()).am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.u.12
                                    final /* synthetic */ ImageView a;

                                    AnonymousClass12(final ImageView imageView2) {
                                        r2 = imageView2;
                                    }

                                    @Override // sg.bigo.ads.bj.g
                                    public final void a(int i2, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                                    }

                                    @Override // sg.bigo.ads.bj.g
                                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                                        r2.setImageBitmap(bitmap);
                                    }
                                });
                            }
                        }
                        z.this.O();
                    }
                    z.this.j(videoController.isMuted());
                    Button button3 = z.this.G;
                    if (button3 != null) {
                        button3.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.z.12.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                videoController.mute(!r2.isMuted());
                            }
                        });
                    }
                }
                if ((bVar instanceof sg.bigo.ads.y.c) && (z.this.R() || z.this.S())) {
                    ((sg.bigo.ads.y.c) bVar).K = true;
                }
                u an3 = z.this.an();
                an3.d();
                if (an3 instanceof sg.bigo.ads.k.a) {
                    ((sg.bigo.ads.k.a) an3).p();
                }
                if (z.this.W != null) {
                    z.this.W.c(z.this);
                }
                z zVar5 = z.this;
                sg.bigo.ads.u.a aVar = zVar5.v;
                if (aVar != null) {
                    aVar.c(zVar5);
                }
            }
        }) { // from class: sg.bigo.ads.i.a.1
            public AnonymousClass1(VideoController.b bVar2) {
                super(bVar2, (byte) 0);
            }

            @Override // sg.bigo.ads.i.a.c, sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoEnd() {
                a aVar = a.this;
                aVar.d = true;
                a.a(aVar);
                super.onVideoEnd();
            }

            @Override // sg.bigo.ads.i.a.c, sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoPause() {
                a.this.b(true);
                super.onVideoPause();
            }

            @Override // sg.bigo.ads.i.a.c, sg.bigo.ads.api.VideoController.VideoLifeCallback
            public final void onVideoPlay() {
                a.this.a(true);
                super.onVideoPlay();
            }
        });
        videoController.setLoadHTMLCallback(new VideoController.c() { // from class: sg.bigo.ads.ad.interstitial.z.15
            @Override // sg.bigo.ads.api.VideoController.c
            public final void a() {
                z.this.av();
            }
        });
        videoController.setProgressChangeListener(new a.b(new VideoController.d() { // from class: sg.bigo.ads.ad.interstitial.z.16
            @Override // sg.bigo.ads.api.VideoController.d
            public final void a(int i, int i2) {
                u an2 = z.this.an();
                an2.d();
                if (an2 instanceof sg.bigo.ads.k.a) {
                    ((sg.bigo.ads.k.a) an2).p();
                }
                if (z.this.W != null) {
                    z.this.W.c(z.this);
                }
                z zVar = z.this;
                sg.bigo.ads.u.a aVar = zVar.v;
                if (aVar != null) {
                    aVar.c(zVar);
                }
                if (!z.this.R) {
                    z zVar2 = z.this;
                    if (!zVar2.e && zVar2.M == 2 && i / i2 >= ((sg.bigo.ads.ad.interstitial.a) z.this).b.b("interstitial_video_style.video_play_page.cta_animation_show_wait_progress")) {
                        z.this.aT();
                    }
                }
                z zVar3 = z.this;
                if (((sg.bigo.ads.ad.interstitial.a) zVar3).c == null || zVar3.R) {
                    return;
                }
                z zVar4 = z.this;
                if (zVar4.e && ((sg.bigo.ads.ad.interstitial.a) zVar4).c.c("video_play_page.is_cta_show_animation")) {
                    z.this.aT();
                }
            }
        }) { // from class: sg.bigo.ads.i.a.2
            public AnonymousClass2(VideoController.d dVar) {
                super(dVar, (byte) 0);
            }

            @Override // sg.bigo.ads.i.a.b, sg.bigo.ads.api.VideoController.d
            public final void a(int i, int i2) {
                a aVar = a.this;
                if (aVar.g != null && !aVar.a()) {
                    a.this.g.b(i2 - i);
                }
                super.a(i, i2);
            }
        });
        videoController.setBackupLoadCallback(this);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public void y() {
        q qVar;
        if (((sg.bigo.ads.cp.a) ((t) this.A).C.f()).bj() && (qVar = this.s) != null && qVar.y.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.z.14
            @Override // java.lang.Runnable
            public final void run() {
                z.this.m(1);
            }
        })) {
            return;
        }
        m(4);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    protected boolean z() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        int a2 = oVar != null ? this.e ? oVar.a("video_play_page.ad_component_layout") : 1 : 0;
        return (a2 == 6 || a2 == 7) ? !aN() : a2 == 8;
    }
}
