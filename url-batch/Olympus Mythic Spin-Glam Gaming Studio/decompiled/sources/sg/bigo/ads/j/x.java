package sg.bigo.ads.j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.f;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.MediaView;

/* loaded from: classes11.dex */
public class x extends sg.bigo.ads.ad.f {
    protected boolean l;

    public x(@NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.ai.o oVar) {
        super(bVar, oVar);
        this.l = false;
    }

    private void a(final sg.bigo.ads.h.a aVar, @Nullable final View view, @Nullable final ViewGroup viewGroup, @Nullable final ViewGroup.LayoutParams layoutParams) {
        if (aVar == null || view == null || viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height == -2) {
            layoutParams2.height = -1;
            sg.bigo.ads.common.utils.v.a(viewGroup, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.j.x.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    aVar.a(viewGroup.getWidth(), viewGroup.getHeight());
                    sg.bigo.ads.common.utils.v.a(view, viewGroup, layoutParams, -1);
                }
            });
        } else {
            if (layoutParams2 != null) {
                aVar.a(layoutParams2.width, layoutParams2.height);
            }
            sg.bigo.ads.common.utils.v.a(view, viewGroup, layoutParams, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(@NonNull final MediaView mediaView, @NonNull sg.bigo.ads.ad.interstitial.t tVar, boolean z) {
        int i;
        sg.bigo.ads.cp.a f;
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.f) this).m;
        if ((oVar == null ? 1 : oVar.a("endpage.ad_component_layout")) == 1) {
            int width = mediaView.getWidth();
            int height = mediaView.getHeight();
            ViewGroup.LayoutParams layoutParams = mediaView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(width, height);
            } else {
                layoutParams.width = width;
                layoutParams.height = height;
            }
            mediaView.setLayoutParams(layoutParams);
        }
        int i2 = 0;
        this.l = false;
        sg.bigo.ads.f.c cVar = tVar.D;
        if (cVar != null && !cVar.b && cVar.a) {
            if (cVar.b()) {
                View view = cVar.o.k;
                cVar.g();
                if (view != null) {
                    mediaView.removeAllViews();
                    a(cVar, view, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                    view.setTag(19);
                    mediaView.setTag(19);
                    cVar.a(1);
                    this.l = true;
                    i = 5;
                    if (i == 0) {
                        sg.bigo.ads.f.a aVar = tVar.E;
                        if (aVar != null && aVar.a) {
                            if (aVar.b()) {
                                View a = aVar.a();
                                if (a != null) {
                                    sg.bigo.ads.ad.interstitial.c.b((ViewGroup) mediaView);
                                    mediaView.removeAllViews();
                                    a(aVar, a, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                                    a.setTag(20);
                                    mediaView.setTag(20);
                                    aVar.a(1);
                                    this.l = aVar.b instanceof sg.bigo.ads.g.b;
                                    i = 7;
                                }
                            } else {
                                aVar.f();
                            }
                        }
                        i = 0;
                    }
                    if (i == 0 && z) {
                        f = tVar.f();
                        if (f.bq() == null) {
                            ((sg.bigo.ads.ad.f) this).o = (Bitmap) f.bq().first;
                            sg.bigo.ads.ad.interstitial.c.a((ViewGroup) mediaView);
                            mediaView.removeAllViews();
                            a((ViewGroup) mediaView);
                            mediaView.a((Bitmap) f.bq().first);
                        } else {
                            sg.bigo.ads.f.c cVar2 = tVar.D;
                            if (cVar2 != null && cVar2.b()) {
                                f.k(3);
                                View view2 = cVar2.o.k;
                                if (view2 != null) {
                                    sg.bigo.ads.ad.interstitial.c.b((ViewGroup) mediaView);
                                    mediaView.removeAllViews();
                                    a(cVar2, view2, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                                    view2.setTag(19);
                                    mediaView.setTag(19);
                                    cVar2.a(1);
                                    this.l = true;
                                }
                            }
                            i = i2;
                        }
                        i2 = 1;
                        i = i2;
                    }
                    if (i == 0) {
                        return i;
                    }
                    final ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.j.x.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                            final Bitmap bitmap2 = bitmap;
                            if (bitmap2 == null || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) {
                                return;
                            }
                            sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.j.x.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    x.this.h = bitmap2;
                                    sg.bigo.ads.ad.interstitial.c.a((ViewGroup) mediaView);
                                    mediaView.removeAllViews();
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    x.this.a((ViewGroup) mediaView);
                                    mediaView.a(bitmap2);
                                }
                            });
                        }
                    };
                    Bitmap bitmap = this.i;
                    if (bitmap != null) {
                        valueCallback.onReceiveValue(bitmap);
                        return 1;
                    }
                    a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.j.x.2
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                            valueCallback.onReceiveValue(bitmap2);
                        }
                    });
                    return 1;
                }
            } else {
                sg.bigo.ads.bn.a.a(0, "PopupEndPageRender", "playableAdCompanion is not ResourceReady");
                cVar.o.f();
            }
        }
        i = 0;
        if (i == 0) {
        }
        if (i == 0) {
            f = tVar.f();
            if (f.bq() == null) {
            }
            i2 = 1;
            i = i2;
        }
        if (i == 0) {
        }
    }

    @Override // sg.bigo.ads.ad.f
    public final void a(Context context, final ViewGroup viewGroup) {
        final f.b bVar = new f.b(context, viewGroup);
        viewGroup.post(new Runnable() { // from class: sg.bigo.ads.j.x.5
            @Override // java.lang.Runnable
            public final void run() {
                bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                bVar.setBackgroundColor(Color.parseColor("#66000000"));
                sg.bigo.ads.common.utils.v.a(bVar, viewGroup, null, 1);
            }
        });
    }

    @Override // sg.bigo.ads.ad.f
    public void a(final AdCountDownButton adCountDownButton, ViewGroup viewGroup, f.a aVar) {
        super.a(adCountDownButton, viewGroup, aVar);
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() == 0) {
            adCountDownButton.clearAnimation();
            adCountDownButton.setVisibility(4);
        }
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.j.x.4
            @Override // java.lang.Runnable
            public final void run() {
                if (adCountDownButton.getVisibility() == 4) {
                    adCountDownButton.setVisibility(0);
                    AdCountDownButton adCountDownButton2 = adCountDownButton;
                    if (adCountDownButton2.c) {
                        return;
                    }
                    adCountDownButton2.c();
                }
            }
        }, m() * 1000);
    }

    public final void c(@NonNull ViewGroup viewGroup) {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.f) this).m;
        boolean z = oVar != null && oVar.c("endpage.media_view_clickable_switch");
        sg.bigo.ads.ai.o oVar2 = ((sg.bigo.ads.ad.f) this).m;
        boolean z2 = oVar2 != null && oVar2.c("endpage.ad_component_clickable_switch");
        sg.bigo.ads.ai.o oVar3 = ((sg.bigo.ads.ad.f) this).m;
        boolean z3 = oVar3 != null && oVar3.c("endpage.other_space_clickable_switch");
        sg.bigo.ads.ai.o oVar4 = ((sg.bigo.ads.ad.f) this).m;
        a(viewGroup, z, z2, z3, oVar4 != null ? oVar4.a("endpage.click_type") : 1);
    }

    @Override // sg.bigo.ads.ad.f
    public void d(ViewGroup viewGroup) {
        if (!this.l || viewGroup == null) {
            super.d(viewGroup);
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_warning);
        if (textView != null) {
            textView.setVisibility(8);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_msg);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }

    @Override // sg.bigo.ads.ad.f
    public final boolean j() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.f) this).m;
        if (oVar == null) {
            return false;
        }
        return oVar.c("endpage.is_widget");
    }

    @Override // sg.bigo.ads.ad.f
    public final int k() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.f) this).m;
        if (oVar == null) {
            return 1;
        }
        return oVar.a("endpage.close_button_style");
    }

    @Override // sg.bigo.ads.ad.f
    public final boolean l() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.f) this).m;
        if (oVar == null) {
            return false;
        }
        return oVar.c("endpage.is_cta_show_animation");
    }

    public final int m() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.f) this).m;
        if (oVar == null) {
            return 0;
        }
        return oVar.a("endpage.force_staying_time", 0);
    }

    public final int n() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.f) this).m;
        if (oVar != null) {
            return oVar.a("endpage.webview_layout");
        }
        return 0;
    }

    public final int o() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.f) this).m;
        if (oVar != null) {
            return oVar.a("endpage.webview_force_time");
        }
        return 0;
    }
}
