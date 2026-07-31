package sg.bigo.ads.ah;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ah.c;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes14.dex */
public final class a implements c {

    @NonNull
    protected final sg.bigo.ads.ad.splash.b a;

    @NonNull
    public final ViewGroup b;
    public int c;
    sg.bigo.ads.ax.b d;

    @Nullable
    private final o e;

    @NonNull
    private final ViewGroup f;
    private boolean g;

    public a(@NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.splash.b bVar, @Nullable o oVar, @Nullable sg.bigo.ads.ax.b bVar2) {
        ArrayList arrayList;
        final View view;
        final AdOptionsView adOptionsView;
        ImageView imageView;
        int i;
        int i2;
        char c;
        int i3;
        String str;
        this.c = c.a.a;
        this.e = oVar;
        this.f = viewGroup;
        this.a = bVar;
        this.d = bVar2;
        ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), (oVar == null || oVar.a("endpage.guide_click") != 4) ? R.layout.bigo_ad_splash_endpage1 : R.layout.bigo_ad_splash_endpage1_slide, null, false);
        this.b = viewGroup2;
        this.c = c.a.c;
        ArrayList arrayList2 = new ArrayList();
        final ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.inter_icon);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.inter_description);
        Button button = (Button) viewGroup2.findViewById(R.id.bigo_ad_splash_btn_cta);
        AdOptionsView adOptionsView2 = (AdOptionsView) viewGroup2.findViewById(R.id.inter_options);
        View findViewById = viewGroup2.findViewById(R.id.inter_ad_label);
        sg.bigo.ads.y.b bVar3 = bVar.z;
        b.d popPage = bVar3.getPopPage();
        if (textView != null) {
            textView.setTag(2);
            sg.bigo.ads.ad.splash.a.a(textView, bVar3.getTitle(), popPage == null ? "" : popPage.b());
            arrayList2.add(textView);
        }
        if (textView2 != null) {
            textView2.setTag(6);
            sg.bigo.ads.ad.splash.a.a(textView2, bVar3.getDescription(), popPage == null ? "" : popPage.c());
            arrayList2.add(textView2);
        }
        if (button != null) {
            button.setTag(7);
            sg.bigo.ads.ad.splash.a.a(button, bVar3.getCallToAction(), "");
            arrayList2.add(button);
            if (oVar != null) {
                int a = s.a(bVar3, oVar.a("endpage.cta_color"), null);
                if (button.getBackground() instanceof GradientDrawable) {
                    ((GradientDrawable) button.getBackground()).setColor(a);
                }
            }
        }
        if (adOptionsView2 != null) {
            adOptionsView2.setTag(4);
            adOptionsView2.a(bVar3.f(), ((sg.bigo.ads.cp.a) bVar3.f()).m());
        }
        if (imageView2 != null) {
            if (((sg.bigo.ads.cp.a) bVar3.f()).aD() != null) {
                str = ((sg.bigo.ads.cp.a) bVar3.f()).aD().c();
                i3 = 1;
            } else {
                i3 = 1;
                str = null;
            }
            imageView2.setTag(Integer.valueOf(i3));
            if (r.a((CharSequence) str) || !URLUtil.isNetworkUrl(str)) {
                a(imageView2);
            } else {
                sg.bigo.ads.bj.e.b(bVar.b.e, null, str, ((sg.bigo.ads.cp.a) bVar3.f()).am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ah.a.1
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i4, @NonNull String str2, @Nullable sg.bigo.ads.bj.f fVar) {
                        a.this.a(imageView2);
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                        imageView2.setImageBitmap(bitmap);
                    }
                });
            }
        }
        View findViewById2 = viewGroup2.findViewById(R.id.layout_contain_view);
        if (findViewById2 == null || oVar == null) {
            arrayList = arrayList2;
            view = findViewById;
            adOptionsView = adOptionsView2;
            imageView = imageView2;
            i = 4;
            i2 = 1;
        } else {
            i2 = oVar.a("endpage.click_type", 1);
            int a2 = oVar.a("endpage.below_area_dp");
            arrayList = arrayList2;
            view = findViewById;
            boolean z = oVar.a("endpage.below_area_clickable") == 1;
            adOptionsView = adOptionsView2;
            imageView = imageView2;
            sg.bigo.ads.ad.splash.a.a(viewGroup2, findViewById2, a2, z, oVar.a("endpage.up_area_dp"), oVar.a("endpage.up_area_clickable") == 1, 9, i2, bVar3);
            i = 4;
            if (imageView != null) {
                sg.bigo.ads.y.a.a(viewGroup, imageView, 4, bVar3, i2);
            }
        }
        if (oVar == null || 1 != oVar.a("endpage.other_space_clickable_switch", 1)) {
            c = 0;
            sg.bigo.ads.y.a.a(viewGroup, viewGroup2, i, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ah.a.2
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i4, int i5, int i6, int i7, int i8, int i9) {
                }

                @Override // sg.bigo.ads.core.adview.h
                public final void a(sg.bigo.ads.an.i iVar, int i4, int i5) {
                }
            }, 0);
        } else {
            sg.bigo.ads.y.a.a(viewGroup, viewGroup2, i, bVar3, i2);
            c = 0;
        }
        v.a(viewGroup2, new v.a() { // from class: sg.bigo.ads.ah.a.3
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view2, @NonNull Rect rect) {
                sg.bigo.ads.ax.b bVar4 = a.this.d;
                if (bVar4 != null) {
                    bVar4.a(adOptionsView, 0);
                    a.this.d.a(view, 0);
                }
            }
        });
        bVar3.H = 9;
        View[] viewArr = new View[1];
        viewArr[c] = viewGroup2;
        bVar3.a(viewGroup, (MediaView) null, imageView, adOptionsView, (List<View>) arrayList, 9, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ImageView imageView) {
        sg.bigo.ads.ad.splash.a.a(this.a.z, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ah.a.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ah.a.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap2);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ah.c
    public final void a() {
    }

    @Override // sg.bigo.ads.ah.c
    public final void a(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ah.c
    public final void a(boolean z, @NonNull ViewGroup viewGroup, int i) {
        g gVar;
        if (!this.g) {
            this.g = true;
            this.f.removeViewAt(1);
            this.f.addView(this.b, 1, new ViewGroup.LayoutParams(-1, -1));
            this.b.setVisibility(8);
        }
        this.c = z ? c.a.b : c.a.c;
        this.b.setVisibility(z ? 0 : 8);
        if (z) {
            sg.bigo.ads.ad.splash.a.b = true;
            o oVar = this.e;
            int a = oVar != null ? oVar.a("endpage.guide_click") : 0;
            ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(R.id.bigo_ad_splash_btn_cta_container);
            Button button = (Button) this.b.findViewById(R.id.bigo_ad_splash_btn_cta);
            if (viewGroup2 != null) {
                if (a == 4 && button != null) {
                    button.setTextSize(2, 15.0f);
                    button.setBackground(null);
                    View findViewById = this.b.findViewById(R.id.splash_footer_bg);
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                        findViewById.setTag(14);
                        sg.bigo.ads.y.a.a(viewGroup, findViewById, 8, this.a.z, 0);
                    }
                }
                sg.bigo.ads.ad.splash.a.b(viewGroup2, a);
            }
            View findViewById2 = this.b.findViewById(R.id.layout_playable_loading);
            if (findViewById2 != null && (gVar = this.a.y) != null && gVar.g != 0) {
                o oVar2 = this.e;
                int i2 = (k.a.p().a() && 2 == (oVar2 != null ? oVar2.a("endpage.ad_component_layout") : 1)) ? 1 : 0;
                findViewById2.setVisibility(i2 == 0 ? 4 : 0);
                r3 = i2;
            }
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) this.a.z.f(), r3 != 0 ? 4 : 1, i);
        }
    }

    @Override // sg.bigo.ads.ah.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ah.c
    public final void c() {
        this.c = c.a.d;
    }

    @Override // sg.bigo.ads.ah.c
    @NonNull
    public final int d() {
        return this.c;
    }
}
