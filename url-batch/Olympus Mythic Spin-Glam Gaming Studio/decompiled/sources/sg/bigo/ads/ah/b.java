package sg.bigo.ads.ah;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ah.c;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.utils.o;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes14.dex */
public class b implements h {

    @Nullable
    public static Bitmap j;

    @Nullable
    o a;

    @NonNull
    protected final sg.bigo.ads.ai.o b;

    @Nullable
    protected final sg.bigo.ads.ai.o c;
    o e;
    o f;

    @NonNull
    protected sg.bigo.ads.ad.splash.b h;

    @NonNull
    sg.bigo.ads.api.core.g k;
    private final String l;
    private Runnable m;

    @Nullable
    private View n;
    AtomicBoolean d = new AtomicBoolean(false);
    final AtomicBoolean g = new AtomicBoolean(false);
    int i = c.a.a;
    private int o = 0;
    private final List<w> p = new ArrayList();

    public b(@NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.ai.o oVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        this.h = bVar;
        this.b = oVar;
        this.c = oVar2;
        this.k = gVar;
        this.l = gVar.a.j();
    }

    private void l() {
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
            this.e = null;
        }
        if (this.m != null) {
            this.m = null;
        }
    }

    private void m() {
        this.i = c.a.d;
        o oVar = this.a;
        if (oVar != null) {
            oVar.b();
        }
        o oVar2 = this.f;
        if (oVar2 != null) {
            oVar2.b();
        }
        l();
    }

    @Override // sg.bigo.ads.ah.c
    public final void a() {
        VideoController videoController;
        if (this.i == c.a.b && (videoController = this.h.z.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.ah.b.1
                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onMuteChange(boolean z) {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoEnd() {
                    if (!b.this.h.F()) {
                        b.this.h.E();
                    }
                    sg.bigo.ads.ad.splash.b bVar = b.this.h;
                    sg.bigo.ads.ai.o oVar = bVar.C;
                    if (oVar == null || oVar.a("endpage.endpage_timing", 0) != 2) {
                        return;
                    }
                    bVar.a(8, 1);
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPause() {
                    b.this.h.C();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPlay() {
                    b.this.h.D();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoStart() {
                    if (b.this.g.compareAndSet(true, false)) {
                        b.this.h();
                        o oVar = b.this.a;
                        if (oVar != null) {
                            oVar.b();
                            b.this.a = null;
                        }
                        b.this.h.B();
                        o oVar2 = b.this.f;
                        if (oVar2 != null) {
                            oVar2.b();
                            b.this.f = null;
                        }
                    }
                }
            });
            videoController.setBackupLoadCallback(new VideoController.a() { // from class: sg.bigo.ads.ah.b.5
                @Override // sg.bigo.ads.api.VideoController.a
                public final void i(boolean z) {
                    o oVar = b.this.e;
                    if (oVar != null) {
                        oVar.b();
                        b.this.e = null;
                    }
                    o oVar2 = b.this.a;
                    if (oVar2 != null) {
                        oVar2.b();
                        b.this.a = null;
                    }
                    b.this.h.B();
                    o oVar3 = b.this.f;
                    if (oVar3 != null) {
                        oVar3.b();
                        b.this.f = null;
                    }
                }
            });
        }
        h();
        sg.bigo.ads.api.core.g gVar = this.h.D;
        final String l = gVar == null ? "" : gVar.b.l();
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.ah.b.12
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.cj.a.a(l);
                sg.bigo.ads.bw.a.l(l);
                String str = l;
                sg.bigo.ads.bw.a.a(str, sg.bigo.ads.bw.a.k(str) + 1);
                sg.bigo.ads.bw.a.a(l, System.currentTimeMillis());
            }
        });
    }

    protected void a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta_container);
        boolean g = g();
        if (viewGroup2 != null) {
            if (g) {
                sg.bigo.ads.ad.splash.a.a(viewGroup2, i);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
    }

    @Override // sg.bigo.ads.ah.h
    public final void a(w wVar) {
        if (wVar == null) {
            return;
        }
        if (j != null) {
            wVar.a();
            return;
        }
        this.p.add(wVar);
        if (this.o == 1) {
            return;
        }
        sg.bigo.ads.api.core.o oVar = (sg.bigo.ads.api.core.o) this.h.z.f();
        if (!oVar.aZ()) {
            String bb = oVar.bb();
            if (r.a((CharSequence) bb)) {
                k();
                return;
            } else {
                this.o = 1;
                sg.bigo.ads.bj.e.a(this.h.b.e, bb, oVar.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ah.b.4
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                        b.this.k();
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                        b.j = bitmap;
                        b.this.k();
                    }
                });
                return;
            }
        }
        String b = sg.bigo.ads.an.o.b(this.h.b.e, oVar.aV());
        if (r.a((CharSequence) b)) {
            k();
            return;
        }
        this.o = 1;
        final String path = Uri.parse(b).getPath();
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.ah.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.j = sg.bigo.ads.common.utils.e.a(Uri.parse(path).getPath(), b.this.h.b.e);
                b.this.k();
            }
        });
    }

    final void a(@NonNull sg.bigo.ads.y.b bVar, final ImageView imageView) {
        sg.bigo.ads.ad.splash.a.a(bVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ah.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ah.b.8.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap2);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ah.c
    public void a(boolean z) {
        if (!z) {
            o oVar = this.e;
            if (oVar != null) {
                oVar.d();
            }
            o oVar2 = this.f;
            if (oVar2 != null) {
                oVar2.d();
                return;
            }
            return;
        }
        o oVar3 = this.e;
        if (oVar3 != null && oVar3.e()) {
            this.e.c();
        }
        o oVar4 = this.f;
        if (oVar4 == null || !oVar4.e()) {
            return;
        }
        this.f.c();
    }

    @Override // sg.bigo.ads.ah.c
    public void a(boolean z, @NonNull ViewGroup viewGroup, int i) {
        char c;
        sg.bigo.ads.y.b bVar;
        int i2;
        String title;
        int i3;
        View view = this.n;
        if (!z) {
            if (view != null) {
                this.i = c.a.c;
                view.setVisibility(8);
                m();
                return;
            }
            return;
        }
        if (view != null) {
            this.i = c.a.b;
            view.setVisibility(0);
            return;
        }
        this.i = c.a.b;
        sg.bigo.ads.api.core.o oVar = (sg.bigo.ads.api.core.o) this.h.z.f();
        if (oVar.x() == 2 && !oVar.bh()) {
            this.g.set(true);
        }
        this.n = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), e(), null, false);
        viewGroup.addView(this.n, 1, new ViewGroup.LayoutParams(-1, -1));
        viewGroup.setTag(11);
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
        if (mediaView != null) {
            mediaView.setImageBlurBorder(false);
        }
        AdOptionsView adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.bigo_ad_splash_options);
        final sg.bigo.ads.y.b bVar2 = this.h.z;
        List<View> arrayList = new ArrayList<>();
        boolean b = sg.bigo.ads.ad.splash.a.b(this.b);
        final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bigo_ad_splash_icon);
        if (imageView != null) {
            imageView.setTag(1);
            if (b) {
                sg.bigo.ads.api.b bVar3 = this.k.c;
                if ((bVar3 instanceof SplashAdRequest) && (i3 = ((SplashAdRequest) bVar3).h) != 0) {
                    imageView.setImageResource(i3);
                }
            } else {
                String c2 = oVar.aD() != null ? oVar.aD().c() : null;
                if (r.a((CharSequence) c2) || !URLUtil.isNetworkUrl(c2)) {
                    a(bVar2, imageView);
                } else {
                    sg.bigo.ads.bj.e.b(this.h.b.e, null, c2, oVar.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ah.b.6
                        @Override // sg.bigo.ads.bj.g
                        public final void a(int i4, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                            b bVar4 = b.this;
                            if (bVar4.i == c.a.b) {
                                bVar4.a(bVar2, imageView);
                            }
                        }

                        @Override // sg.bigo.ads.bj.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                            if (b.this.i == c.a.b) {
                                imageView.setImageBitmap(bitmap);
                            }
                        }
                    });
                }
            }
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
        if (textView != null) {
            textView.setTag(2);
            if (b) {
                sg.bigo.ads.api.b bVar4 = this.k.c;
                title = bVar4 instanceof SplashAdRequest ? ((SplashAdRequest) bVar4).i : null;
            } else {
                title = bVar2.getTitle();
            }
            if (!TextUtils.isEmpty(title)) {
                textView.setText(title);
            }
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_splash_advertiser);
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.inter_splash_adtage);
        if (r.a((CharSequence) this.l)) {
            textView2.setVisibility(8);
        } else {
            textView3.setText(R.string.bigo_ad_tag);
            textView2.setText(this.l);
            textView2.setPadding(sg.bigo.ads.common.utils.f.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView2.getContext(), 1), sg.bigo.ads.common.utils.f.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView2.getContext(), 1));
        }
        Button button = (Button) viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta);
        if (button != null) {
            button.setTag(7);
            if (!TextUtils.isEmpty(bVar2.getCallToAction())) {
                button.setText(bVar2.getCallToAction());
            }
            arrayList.add(button);
            if (sg.bigo.ads.ad.splash.a.b()) {
                button.getLayoutParams().width = sg.bigo.ads.common.utils.f.a(button.getContext(), 333);
            }
            Drawable background = button.getBackground();
            sg.bigo.ads.ai.o oVar2 = this.c;
            if (oVar2 != null && (background instanceof GradientDrawable)) {
                ((GradientDrawable) background).setColor(s.a(bVar2, oVar2.a("video_play_page.cta_color"), null));
            }
        }
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_description);
        if (textView4 != null) {
            textView4.setTag(6);
            String description = bVar2.getDescription();
            if (!TextUtils.isEmpty(description)) {
                textView4.setText(description);
            }
            arrayList.add(textView4);
        }
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.inter_warning);
        if (textView5 != null) {
            textView5.setTag(8);
            String warning = bVar2.getWarning();
            if (!TextUtils.isEmpty(warning)) {
                textView5.setText(warning);
            }
            arrayList.add(textView5);
        }
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.splash_rating_star);
        if (imageView2 != null) {
            String creativeId = bVar2.getCreativeId();
            if (creativeId == null) {
                creativeId = "";
            }
            Bitmap a = sg.bigo.ads.common.utils.e.a(imageView2.getContext(), (sg.bigo.ads.y.e.a(creativeId, 4) * 0.5f) + 3.5f, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
            if (a != null) {
                imageView2.setTag(26);
                imageView2.setImageBitmap(a);
            }
        }
        bVar2.registerViewForInteraction(viewGroup, mediaView, (ImageView) null, adOptionsView, arrayList);
        if (mediaView != null) {
            if (sg.bigo.ads.ad.splash.a.b()) {
                mediaView.getLayoutParams().width = -2;
                c = 65535;
                mediaView.getLayoutParams().height = -1;
            } else {
                c = 65535;
            }
            if (bVar2.getCreativeType() == NativeAd.CreativeType.VIDEO) {
                mediaView.b().a(false);
            }
        } else {
            c = 65535;
        }
        if (this.c != null) {
            sg.bigo.ads.core.adview.h hVar = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ah.b.7
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i4, int i5, int i6, int i7, int i8, int i9) {
                }

                @Override // sg.bigo.ads.core.adview.h
                public final void a(sg.bigo.ads.an.i iVar, int i4, int i5) {
                }
            };
            View findViewById = viewGroup.findViewById(R.id.layout_contain_view);
            int a2 = this.c.a("video_play_page.click_type");
            if (mediaView != null) {
                if (this.c.c("video_play_page.media_view_clickable_switch")) {
                    sg.bigo.ads.y.a.a(viewGroup, mediaView, 8, bVar2, a2);
                } else {
                    sg.bigo.ads.y.a.a(viewGroup, mediaView, 8, hVar, a2);
                }
                if (findViewById != null) {
                    findViewById.setTag(9);
                }
                if (this.c.c("video_play_page.other_space_clickable_switch")) {
                    mediaView.setOtherClickAreaClick(true);
                    sg.bigo.ads.y.a.a(viewGroup, viewGroup, 8, bVar2, a2);
                    if (findViewById != null) {
                        sg.bigo.ads.y.a.a(viewGroup, findViewById, 8, bVar2, a2);
                    }
                } else {
                    mediaView.setOtherClickAreaClick(false);
                    sg.bigo.ads.y.a.a(viewGroup, viewGroup, 8, hVar, a2);
                    if (findViewById != null) {
                        sg.bigo.ads.y.a.a(viewGroup, findViewById, 8, hVar, a2);
                    }
                }
            }
            if (button != null) {
                sg.bigo.ads.y.a.a(viewGroup, button, 8, bVar2, a2);
            }
            if (imageView != null) {
                if (b) {
                    sg.bigo.ads.y.a.a(viewGroup, imageView, 8, hVar, a2);
                } else {
                    sg.bigo.ads.y.a.a(viewGroup, imageView, 8, bVar2, a2);
                }
            }
            if (textView != null) {
                if (b) {
                    sg.bigo.ads.y.a.a(viewGroup, textView, 8, hVar, a2);
                } else {
                    sg.bigo.ads.y.a.a(viewGroup, textView, 8, bVar2, a2);
                }
            }
            View findViewById2 = viewGroup.findViewById(R.id.inter_layout_ad_tag);
            if (findViewById2 != null) {
                sg.bigo.ads.y.a.a(viewGroup, findViewById2, 8, hVar, a2);
            }
            View findViewById3 = viewGroup.findViewById(R.id.layout_ad_component);
            if (findViewById3 != null) {
                findViewById3.setTag(18);
                if (this.c.c("video_play_page.ad_component_clickable_switch")) {
                    sg.bigo.ads.y.a.a(viewGroup, findViewById3, 8, bVar2, a2);
                } else {
                    sg.bigo.ads.y.a.a(viewGroup, findViewById3, 8, hVar, a2);
                }
            }
            if (findViewById != null) {
                bVar = bVar2;
                i2 = 6;
                sg.bigo.ads.ad.splash.a.a(viewGroup, findViewById, this.c.a("video_play_page.below_area_dp"), this.c.a("video_play_page.below_area_clickable") == 1, this.c.a("video_play_page.up_area_dp"), this.c.a("video_play_page.up_area_clickable") == 1, 8, a2, bVar);
            } else {
                bVar = bVar2;
                i2 = 6;
            }
        } else {
            bVar = bVar2;
            i2 = 6;
            int a3 = this.b.a("splash_clickable_area");
            if (a3 == 1) {
                sg.bigo.ads.y.a.a(viewGroup, viewGroup, 1, bVar, 0);
            } else if (a3 == 2 && mediaView != null) {
                mediaView.setOnTouchListener(null);
            }
        }
        int a4 = this.b.a("splash_cta_type");
        sg.bigo.ads.ai.o oVar3 = this.c;
        if (oVar3 != null) {
            int a5 = oVar3.a("video_play_page.is_cta_show_animation");
            if (a5 <= 0 || a5 > i2) {
                a5 = 1;
            }
            a4 = a5 - 1;
        }
        if (a4 == 5 && button != null) {
            button.setTextSize(2, 15.0f);
            button.setBackground(null);
            View findViewById4 = viewGroup.findViewById(R.id.splash_footer_bg);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
                findViewById4.setTag(14);
                if (this.c != null) {
                    sg.bigo.ads.y.a.a(viewGroup, findViewById4, 8, bVar, 0);
                } else {
                    sg.bigo.ads.y.a.a(viewGroup, findViewById4, 1, bVar, 0);
                }
            }
        }
        a(viewGroup, a4);
    }

    @Override // sg.bigo.ads.ah.c
    public final void b() {
        l();
        this.d.set(true);
    }

    @Override // sg.bigo.ads.ah.c
    public void c() {
        m();
        j = null;
    }

    @Override // sg.bigo.ads.ah.c
    @NonNull
    public final int d() {
        return this.i;
    }

    @LayoutRes
    protected int e() {
        return (this.c != null && f()) ? sg.bigo.ads.ad.splash.a.b(this.b) ? R.layout.bigo_ad_splash_style_halfscreen : R.layout.bigo_ad_splash_style_fullscreen_immersive : sg.bigo.ads.ad.splash.a.a(this.b);
    }

    protected final boolean f() {
        sg.bigo.ads.ai.o oVar = this.c;
        return oVar != null && 2 == oVar.a("video_play_page.ad_component_layout", 1);
    }

    protected boolean g() {
        return true;
    }

    protected final void h() {
        int a;
        int max;
        int b;
        final int a2;
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
            this.e = null;
        }
        final int i = -1;
        if (this.g.get() && this.h.f().bq() == null) {
            sg.bigo.ads.ai.o oVar2 = this.c;
            if (oVar2 != null && (a2 = x.a(oVar2.a("video_play_page.time_for_auto_click", -1))) > 0) {
                o oVar3 = new o(a2 * 1000) { // from class: sg.bigo.ads.ah.b.9
                    @Override // sg.bigo.ads.common.utils.o
                    public final void a() {
                        if (b.this.d.compareAndSet(false, true)) {
                            b.this.h.I();
                        }
                    }

                    @Override // sg.bigo.ads.common.utils.o
                    public final void a(long j2) {
                    }
                };
                this.e = oVar3;
                oVar3.c();
            }
            sg.bigo.ads.ai.o oVar4 = this.c;
            if (oVar4 == null || (b = x.b(oVar4.a("video_play_page.time_for_show_backup", -1))) <= 0) {
                return;
            }
            o oVar5 = new o(b * 1000) { // from class: sg.bigo.ads.ah.b.2
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    b.this.h.a(10, 13);
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j2) {
                }
            };
            this.f = oVar5;
            oVar5.c();
            return;
        }
        sg.bigo.ads.ai.o oVar6 = this.c;
        if (oVar6 == null || (a = oVar6.a("video_play_page.auto_click")) < 2 || a > 7) {
            return;
        }
        if (a <= 5) {
            i = a;
        } else if (a == 7 && (max = Math.max(0, this.b.a("splash_duration"))) > 0 && this.a != null) {
            i = max - 1;
        }
        if (i >= 0) {
            o oVar7 = new o(i * 1000) { // from class: sg.bigo.ads.ah.b.10
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    if (b.this.d.compareAndSet(false, true)) {
                        b.this.h.I();
                    }
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j2) {
                }
            };
            this.e = oVar7;
            oVar7.c();
        } else if (a == 6) {
            this.m = new Runnable() { // from class: sg.bigo.ads.ah.b.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.d.compareAndSet(false, true)) {
                        b.this.h.I();
                    }
                }
            };
        }
    }

    @Override // sg.bigo.ads.ah.h
    public final AtomicBoolean i() {
        return this.g;
    }

    @Override // sg.bigo.ads.ah.h
    public final void j() {
        Runnable runnable = this.m;
        if (runnable != null) {
            runnable.run();
            this.m = null;
        }
    }

    final void k() {
        this.o = 2;
        Iterator<w> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().a();
            it.remove();
        }
    }
}
