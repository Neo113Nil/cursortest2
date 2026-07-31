package sg.bigo.ads.ah;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ah.c;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes14.dex */
public final class j implements h {

    @NonNull
    protected final o a;

    @NonNull
    protected final o b;

    @NonNull
    protected sg.bigo.ads.ad.splash.b c;
    int d = c.a.a;

    @NonNull
    sg.bigo.ads.api.core.g e;
    private final String f;

    @Nullable
    private View g;

    public j(@NonNull sg.bigo.ads.api.core.g gVar, @NonNull o oVar, @NonNull o oVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        this.c = bVar;
        this.a = oVar;
        this.b = oVar2;
        this.e = gVar;
        this.f = gVar.a.j();
    }

    @Override // sg.bigo.ads.ah.c
    public final void a() {
        VideoController videoController;
        if (this.d == c.a.b && (videoController = this.c.z.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.ah.j.1
                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onMuteChange(boolean z) {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoEnd() {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPause() {
                    j.this.c.C();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPlay() {
                    j.this.c.D();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoStart() {
                }
            });
        }
        sg.bigo.ads.api.core.g gVar = this.c.D;
        final String l = gVar == null ? "" : gVar.b.l();
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.ah.j.2
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

    @Override // sg.bigo.ads.ah.h
    public final void a(w wVar) {
    }

    @Override // sg.bigo.ads.ah.c
    public final void a(boolean z) {
    }

    @Override // sg.bigo.ads.ah.c
    public final void a(boolean z, @NonNull ViewGroup viewGroup, int i) {
        int i2;
        View view = this.g;
        if (!z) {
            if (view != null) {
                this.d = c.a.c;
                view.setVisibility(8);
                this.d = c.a.d;
                return;
            }
            return;
        }
        if (view != null) {
            this.d = c.a.b;
            view.setVisibility(0);
            return;
        }
        this.d = c.a.b;
        sg.bigo.ads.y.b bVar = this.c.z;
        if (bVar != null) {
            sg.bigo.ads.api.core.o oVar = (sg.bigo.ads.api.core.o) bVar.f();
            String str = null;
            this.g = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), sg.bigo.ads.ad.splash.a.b(this.a) ? R.layout.bigo_ad_splash_style_halfscreen_vpaid : R.layout.bigo_ad_splash_style_fullscreen_vpaid, null, false);
            viewGroup.addView(this.g, 1, new ViewGroup.LayoutParams(-1, -1));
            viewGroup.setTag(11);
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
            if (mediaView != null) {
                mediaView.setImageBlurBorder(false);
            }
            AdOptionsView adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.bigo_ad_splash_options);
            ArrayList arrayList = new ArrayList();
            boolean b = sg.bigo.ads.ad.splash.a.b(this.a);
            final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bigo_ad_splash_icon);
            if (imageView != null) {
                imageView.setTag(1);
                if (b) {
                    sg.bigo.ads.api.b bVar2 = this.e.c;
                    if ((bVar2 instanceof SplashAdRequest) && (i2 = ((SplashAdRequest) bVar2).h) != 0) {
                        imageView.setImageResource(i2);
                    }
                } else {
                    String c = oVar.aD() != null ? oVar.aD().c() : null;
                    if (!r.a((CharSequence) c) && URLUtil.isNetworkUrl(c)) {
                        sg.bigo.ads.bj.e.b(this.c.b.e, null, c, oVar.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ah.j.3
                            @Override // sg.bigo.ads.bj.g
                            public final void a(int i3, @NonNull String str2, @Nullable sg.bigo.ads.bj.f fVar) {
                            }

                            @Override // sg.bigo.ads.bj.g
                            public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                                if (j.this.d == c.a.b) {
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
                    sg.bigo.ads.api.b bVar3 = this.e.c;
                    if (bVar3 instanceof SplashAdRequest) {
                        str = ((SplashAdRequest) bVar3).i;
                    }
                } else {
                    str = bVar.getTitle();
                }
                if (!TextUtils.isEmpty(str)) {
                    textView.setText(str);
                }
            }
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_splash_advertiser);
            TextView textView3 = (TextView) viewGroup.findViewById(R.id.inter_splash_adtage);
            if (textView2 != null && textView3 != null) {
                if (r.a((CharSequence) this.f)) {
                    textView2.setVisibility(8);
                } else {
                    textView3.setText(R.string.bigo_ad_tag);
                    textView2.setText(this.f);
                    textView2.setPadding(sg.bigo.ads.common.utils.f.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView2.getContext(), 1), sg.bigo.ads.common.utils.f.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView2.getContext(), 1));
                }
            }
            sg.bigo.ads.core.adview.h hVar = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ah.j.4
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i3, int i4, int i5, int i6, int i7, int i8) {
                }

                @Override // sg.bigo.ads.core.adview.h
                public final void a(sg.bigo.ads.an.i iVar, int i3, int i4) {
                }
            };
            View findViewById = viewGroup.findViewById(R.id.layout_contain_view);
            int a = this.b.a("video_play_page.click_type");
            if (mediaView != null) {
                mediaView.b().a(this.b.a("video_play_page.media_view_clickable_switch") == 1);
            }
            if (findViewById != null) {
                findViewById.setTag(9);
                sg.bigo.ads.y.a.a(viewGroup, findViewById, 8, this.b.a("video_play_page.other_space_clickable_switch") == 1 ? bVar : hVar, a);
            }
            bVar.registerViewForInteraction(viewGroup, mediaView, (ImageView) null, adOptionsView, arrayList);
            if (mediaView != null && sg.bigo.ads.ad.splash.a.b()) {
                mediaView.getLayoutParams().width = -2;
                mediaView.getLayoutParams().height = -1;
            }
            View findViewById2 = viewGroup.findViewById(R.id.inter_layout_ad_tag);
            if (findViewById2 != null) {
                sg.bigo.ads.y.a.a(viewGroup, findViewById2, 8, hVar, a);
            }
            if (findViewById != null) {
                sg.bigo.ads.ad.splash.a.a(viewGroup, findViewById, this.b.a("video_play_page.below_area_dp"), this.b.a("video_play_page.below_area_clickable") == 1, this.b.a("video_play_page.up_area_dp"), this.b.a("video_play_page.up_area_clickable") == 1, 8, a, bVar);
            }
        }
    }

    @Override // sg.bigo.ads.ah.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ah.c
    public final void c() {
        this.d = c.a.d;
    }

    @Override // sg.bigo.ads.ah.c
    @NonNull
    public final int d() {
        return this.d;
    }

    @Override // sg.bigo.ads.ah.h
    public final AtomicBoolean i() {
        return new AtomicBoolean(false);
    }

    @Override // sg.bigo.ads.ah.h
    public final void j() {
    }
}
