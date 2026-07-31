package sg.bigo.ads.ah;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ah.i;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.p;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes4.dex */
public final class e extends b {
    private i l;

    public e(@NonNull sg.bigo.ads.api.core.g gVar, @NonNull o oVar, @Nullable o oVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(gVar, oVar, oVar2, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03aa  */
    @Override // sg.bigo.ads.ah.b, sg.bigo.ads.ah.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, @NonNull ViewGroup viewGroup, int i) {
        int i2;
        boolean z2;
        boolean z3;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar;
        Iterator<View> it;
        o oVar;
        T t;
        MediaView.a b;
        boolean z4;
        sg.bigo.ads.r.d dVar;
        boolean z5;
        super.a(z, viewGroup, i);
        if (!z) {
            View findViewWithTag = viewGroup.findViewWithTag("adview_background_second_tag");
            if (findViewWithTag instanceof ImageView) {
                viewGroup.removeView(findViewWithTag);
                return;
            }
            return;
        }
        if (this.l == null) {
            x xVar = new x();
            o oVar2 = this.c;
            if (oVar2 != null) {
                xVar.f = oVar2.c("video_play_page.media_view_clickable_switch");
                xVar.h = this.c.c("video_play_page.ad_component_clickable_switch");
                xVar.g = this.c.c("video_play_page.other_space_clickable_switch");
                xVar.i = this.c.a("video_play_page.click_type");
                xVar.m = this.c.c("layer.other_space_clickable_switch");
                xVar.n = this.c.a("layer.click_type");
                xVar.a = false;
                xVar.b = 0;
                xVar.c = this.c.a("video_play_page.force_staying_time");
                xVar.d = this.c.c("layer.is_show_layer");
                xVar.e = this.c.a("layer.force_staying_time");
                xVar.k = this.c.a("video_play_page.auto_click");
                xVar.o = this.c.a("video_play_page.time_for_auto_click", -1);
                xVar.p = this.c.a("video_play_page.time_for_show_backup", -1);
            } else {
                xVar.k = 1;
                xVar.a = this.b.c("interstitial_video_style.video_play_page.is_global_click");
                xVar.b = this.b.a("interstitial_video_style.video_play_page.impression_close_seconds");
                xVar.c = this.b.a("interstitial_video_style.video_play_page.close_click_seconds");
                xVar.d = this.b.c("interstitial_video_style.video_play_page.is_jump_layer");
                xVar.e = this.b.a("interstitial_video_style.layer.impression_layer_close_seconds");
            }
            sg.bigo.ads.y.b bVar2 = this.h.z;
            o oVar3 = this.c;
            if (oVar3 == null) {
                oVar3 = this.b;
            }
            this.l = new i(bVar2, viewGroup, xVar, sg.bigo.ads.r.b.c(bVar2, oVar3));
        }
        final i iVar = this.l;
        Context context = iVar.m.getContext();
        List<String> a = iVar.h.a();
        sg.bigo.ads.r.b bVar3 = iVar.h;
        boolean z6 = bVar3.e;
        sg.bigo.ads.r.d dVar2 = bVar3.b;
        sg.bigo.ads.r.c cVar = bVar3.d;
        p a2 = s.a(iVar.l);
        iVar.c = (ViewFlow) iVar.m.findViewById(R.id.inter_media_ad_view_flow);
        iVar.d = (Indicator) iVar.m.findViewById(R.id.vf_indicator);
        o oVar4 = iVar.h.a;
        int a3 = oVar4 == null ? 1 : sg.bigo.ads.r.e.a(oVar4.a("video_play_page.background_colour"));
        if (a3 == 4 || a3 == 5) {
            iVar.f = new sg.bigo.ads.r.a(iVar.m, iVar.c, iVar.n, a3);
        }
        int i3 = a3;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar4 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, cVar, false, iVar.d(), i3);
        iVar.g = bVar4;
        iVar.e = bVar4.j;
        ((MediaView) bVar4.l).setImageBlurBorder(false);
        iVar.g.a(a2.b, a2.c);
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar5 = iVar.g;
        bVar5.s = true;
        if (bVar5.c()) {
            if (((sg.bigo.ads.cp.a) iVar.l.f()).aZ()) {
                Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> set = i.j;
                synchronized (set) {
                    set.add(iVar.g);
                }
            }
            if (iVar.f != null) {
                iVar.g.r = new d.a() { // from class: sg.bigo.ads.ah.i.4
                    AnonymousClass4() {
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        i.this.f.a(i.this.c.a(i.this.g.j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        i.this.g.r = null;
                        a();
                    }
                };
            }
        }
        iVar.c.setDividerWidth(sg.bigo.ads.common.utils.f.a(context, dVar2.f));
        iVar.c.setContentMaxWidthSpace(sg.bigo.ads.common.utils.f.a(context, dVar2.i));
        iVar.c.setViewStyle(dVar2.j);
        iVar.c.setOnItemChangeListener(new sg.bigo.ads.r.f(dVar2, iVar.d, iVar.f));
        int i4 = 0;
        int i5 = 0;
        while (i4 < a.size()) {
            String str = a.get(i4);
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                dVar = dVar2;
                z5 = z6;
            } else {
                i5++;
                dVar = dVar2;
                z5 = z6;
                iVar.a(context, cVar, i3, str, ((sg.bigo.ads.cp.a) iVar.l.f()).am());
            }
            i4++;
            dVar2 = dVar;
            z6 = z5;
        }
        sg.bigo.ads.r.d dVar3 = dVar2;
        if (z6) {
            i5++;
            final sg.bigo.ads.ad.interstitial.multi_img.view.a a4 = iVar.a(context, cVar, i3, null, false);
            sg.bigo.ads.ad.splash.a.a(iVar.l, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ah.i.5
                final /* synthetic */ sg.bigo.ads.ad.interstitial.multi_img.view.a a;

                AnonymousClass5(final sg.bigo.ads.ad.interstitial.multi_img.view.a a42) {
                    r2 = a42;
                }

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        r2.a(bitmap2);
                    }
                }
            });
        }
        sg.bigo.ads.r.d dVar4 = sg.bigo.ads.r.d.CENTER;
        int i6 = dVar3 == dVar4 ? i5 >> 1 : 0;
        ViewFlow.b bVar6 = new ViewFlow.b();
        bVar6.a = a2.b;
        bVar6.b = a2.c;
        bVar6.c = true;
        bVar6.d = cVar.d;
        iVar.c.addView(iVar.e, Math.max(0, i6), bVar6);
        int i7 = i.AnonymousClass2.a[dVar3.ordinal()];
        int i8 = 3;
        if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
            ViewFlow.d anonymousClass9 = new ViewFlow.d() { // from class: sg.bigo.ads.ah.i.9
                AnonymousClass9() {
                }

                @Override // sg.bigo.ads.common.view.ViewFlow.d
                public final void a() {
                    i.this.l.a((sg.bigo.ads.an.i) null, 8, 29);
                }
            };
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
            iVar.o = cVar2;
            iVar.c.setStartView(cVar2.a);
            iVar.c.setOnStartViewShowListener(anonymousClass9);
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
            iVar.p = cVar3;
            iVar.c.setEndView(cVar3.a);
            iVar.c.setOnEndViewShowListener(anonymousClass9);
        }
        int a5 = dVar3 == dVar4 ? iVar.c.a(iVar.e) : 0;
        iVar.c.b(a5);
        sg.bigo.ads.r.a aVar = iVar.f;
        if (aVar != null) {
            aVar.b(a5);
        }
        MediaView mediaView = (MediaView) iVar.g.l;
        sg.bigo.ads.y.b bVar7 = iVar.l;
        bVar7.H = iVar.i.i;
        bVar7.a(iVar.m, mediaView, (ImageView) null, (AdOptionsView) null, (List<View>) null, 8, null);
        int i9 = iVar.i.i;
        View findViewById = iVar.m.findViewById(R.id.inter_media_container);
        sg.bigo.ads.y.a.a(findViewById, 9);
        sg.bigo.ads.y.a.a(iVar.c, 9);
        if (iVar.i.g) {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar8 = iVar.g;
            if (bVar8 != null) {
                ((MediaView) bVar8.l).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.y.a.a(iVar.m, findViewById, 8, iVar.l, i9);
            sg.bigo.ads.y.a.a(iVar.m, iVar.c, 8, iVar.l, i9);
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar9 = iVar.g;
            if (bVar9 != null) {
                i2 = 0;
                ((MediaView) bVar9.l).setOtherClickAreaClick(false);
            } else {
                i2 = 0;
            }
            ViewGroup viewGroup2 = iVar.m;
            sg.bigo.ads.core.adview.h hVar = r.H;
            sg.bigo.ads.y.a.a(viewGroup2, findViewById, 8, hVar, i2);
            sg.bigo.ads.y.a.a(iVar.m, iVar.c, 8, hVar, i2);
        }
        if (!iVar.e()) {
            int a6 = iVar.h.a.a("video_play_page.multi_click_type");
            if (a6 != 2) {
                if (a6 == 3) {
                    z2 = i9 == 1 || i9 == 2;
                    z3 = iVar.i.f;
                    bVar = iVar.g;
                    if (bVar != null && (t = bVar.l) != 0) {
                        ViewGroup viewGroup3 = iVar.m;
                        sg.bigo.ads.y.b bVar10 = iVar.l;
                        if (z2) {
                            sg.bigo.ads.y.a.a(viewGroup3, t, 8, bVar10, i8);
                        } else {
                            sg.bigo.ads.y.a.a(viewGroup3, t, 8, bVar10, iVar.k);
                        }
                        if (z3) {
                            ((MediaView) iVar.g.l).setMediaAreaClickable(false);
                            b = ((MediaView) iVar.g.l).b();
                            z4 = true;
                        } else {
                            ((MediaView) iVar.g.l).setMediaAreaClickable(true);
                            b = ((MediaView) iVar.g.l).b();
                            z4 = false;
                        }
                        b.a(z4);
                    }
                    it = iVar.c.getItems().iterator();
                    while (it.hasNext()) {
                        Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
                        if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                            sg.bigo.ads.ad.interstitial.multi_img.view.d dVar5 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                            sg.bigo.ads.y.a.a(dVar5.j, 5);
                            ViewGroup viewGroup4 = iVar.m;
                            RoundedFrameLayout roundedFrameLayout = dVar5.j;
                            if (z3) {
                                sg.bigo.ads.y.b bVar11 = iVar.l;
                                if (z2) {
                                    sg.bigo.ads.y.a.a(viewGroup4, roundedFrameLayout, 8, bVar11, iVar.k);
                                } else {
                                    sg.bigo.ads.y.a.a(viewGroup4, roundedFrameLayout, 8, bVar11, i8);
                                }
                            } else {
                                sg.bigo.ads.y.a.a(viewGroup4, roundedFrameLayout, 8, r.H, 0);
                            }
                        }
                    }
                    iVar.f();
                    a(this.l.q);
                    oVar = this.c;
                    if (oVar != null) {
                        int a7 = oVar.a("video_play_page.background_colour");
                        TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
                        if (textView != null) {
                            this.l.n.b(textView);
                        }
                        if (1 == a7) {
                            this.l.n.a(-1);
                            i iVar2 = this.l;
                            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = iVar2.o;
                            if (cVar4 != null) {
                                cVar4.a(false);
                            }
                            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar5 = iVar2.p;
                            if (cVar5 != null) {
                                cVar5.a(false);
                            }
                            i iVar3 = this.l;
                            int b2 = sg.bigo.ads.common.utils.r.b("#80202124", -7829368);
                            Indicator indicator = iVar3.d;
                            if (indicator != null) {
                                indicator.setColorSelected(-16777216);
                                iVar3.d.setColor(b2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z2 = false;
            z3 = iVar.i.f;
            bVar = iVar.g;
            if (bVar != null) {
                ViewGroup viewGroup32 = iVar.m;
                sg.bigo.ads.y.b bVar102 = iVar.l;
                if (z2) {
                }
                if (z3) {
                }
                b.a(z4);
            }
            it = iVar.c.getItems().iterator();
            while (it.hasNext()) {
            }
            iVar.f();
            a(this.l.q);
            oVar = this.c;
            if (oVar != null) {
            }
        }
        i8 = i9;
        z2 = false;
        z3 = iVar.i.f;
        bVar = iVar.g;
        if (bVar != null) {
        }
        it = iVar.c.getItems().iterator();
        while (it.hasNext()) {
        }
        iVar.f();
        a(this.l.q);
        oVar = this.c;
        if (oVar != null) {
        }
    }

    @Override // sg.bigo.ads.ah.b, sg.bigo.ads.ah.c
    public final void c() {
        super.c();
        i iVar = this.l;
        if (iVar != null) {
            iVar.q = null;
            this.l = null;
        }
    }

    @Override // sg.bigo.ads.ah.b
    protected final int e() {
        return R.layout.bigo_ad_splash_style_3_multi_img;
    }
}
