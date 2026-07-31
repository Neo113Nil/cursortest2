package sg.bigo.ads.t;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.R;
import sg.bigo.ads.aa.b;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.g;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes13.dex */
public class c extends sg.bigo.ads.ad.interstitial.a implements sg.bigo.ads.s.a {
    public static int J = 340;
    protected sg.bigo.ads.aa.b I;
    private LinearLayout K;
    private int L;
    private boolean M;
    private final WeakHashMap<d, View> R;
    private View S;
    private boolean T;
    private sg.bigo.ads.ad.interstitial.a U;
    private final AdCountDownButton.b V;

    /* renamed from: sg.bigo.ads.t.c$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<sg.bigo.ads.y.b> it = c.this.I.L.keySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (c.c(it.next())) {
                    i++;
                }
            }
            sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.t.c.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                    for (Map.Entry<sg.bigo.ads.y.b, b.a> entry : c.this.I.L.entrySet()) {
                        sg.bigo.ads.y.b key = entry.getKey();
                        final int i2 = entry.getValue().d;
                        s.a(key, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.t.c.4.1.1
                            @Override // android.webkit.ValueCallback
                            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                                Bitmap bitmap2 = bitmap;
                                if (bitmap2 != null) {
                                    concurrentHashMap.put(bitmap2, Integer.valueOf(i2));
                                }
                                if (concurrentHashMap.size() == c.this.I.L.size()) {
                                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                                        Integer a = sg.bigo.ads.bv.b.a((Bitmap) entry2.getKey());
                                        if (a != null) {
                                            concurrentHashMap2.put(entry2.getValue(), a);
                                            if (concurrentHashMap2.size() >= 2) {
                                                c.a(c.this, concurrentHashMap2);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            }, i == c.this.I.L.size() ? 0L : 800L);
        }
    }

    protected c(@NonNull Activity activity) {
        super(activity);
        this.R = new WeakHashMap<>();
        this.V = new AdCountDownButton.b() { // from class: sg.bigo.ads.t.c.1
            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
            public final void a() {
                c.a(c.this);
                c.this.au();
            }
        };
    }

    static /* synthetic */ void a(c cVar, final Map map) {
        if (cVar.S == null || map.size() < 2) {
            return;
        }
        cVar.S.post(new Runnable() { // from class: sg.bigo.ads.t.c.5
            @Override // java.lang.Runnable
            public final void run() {
                Integer num = (Integer) map.get(2);
                if (num == null) {
                    num = r2;
                }
                Integer num2 = (Integer) map.get(1);
                r2 = num2 != null ? num2 : -16777216;
                View view = c.this.S;
                int i = R.color.bigo_ad_black;
                int intValue = num.intValue();
                int intValue2 = r2.intValue();
                try {
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, i});
                    view.setBackground(gradientDrawable);
                    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(500L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.utils.b.3
                        final /* synthetic */ ArgbEvaluator a;
                        final /* synthetic */ int b;
                        final /* synthetic */ int c;
                        final /* synthetic */ int d;
                        final /* synthetic */ GradientDrawable e;

                        public AnonymousClass3(ArgbEvaluator argbEvaluator2, int i2, int intValue3, int intValue22, GradientDrawable gradientDrawable2) {
                            r1 = argbEvaluator2;
                            r2 = i2;
                            r3 = intValue3;
                            r4 = intValue22;
                            r5 = gradientDrawable2;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            r5.setColors(new int[]{((Integer) r1.evaluate(floatValue, Integer.valueOf(r2), Integer.valueOf(r3))).intValue(), ((Integer) r1.evaluate(floatValue, Integer.valueOf(r2), Integer.valueOf(r4))).intValue()});
                        }
                    });
                    ofFloat.start();
                } catch (Throwable unused) {
                }
            }
        });
    }

    static /* synthetic */ boolean a(c cVar) {
        cVar.M = true;
        return true;
    }

    private int av() {
        o oVar;
        String str;
        if (((sg.bigo.ads.ad.interstitial.a) this).c == null) {
            return 15;
        }
        if (this.L == this.R.size()) {
            oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
            str = "multi_ads_endpage.force_staying_time";
        } else {
            oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
            str = "multi_ads.force_staying_time";
        }
        return oVar.a(str, 15);
    }

    private void aw() {
        if (this.L < this.R.size()) {
            this.L++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        sg.bigo.ads.aa.b bVar = this.I;
        if (bVar == null || this.S == null) {
            return;
        }
        Iterator<Map.Entry<sg.bigo.ads.y.b, b.a>> it = bVar.L.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getValue().a && (i = i + 1) == this.I.L.size()) {
                sg.bigo.ads.bh.d.a(3, new AnonymousClass4());
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(sg.bigo.ads.y.b bVar) {
        String bb;
        if (bVar instanceof sg.bigo.ads.y.c) {
            return g.c(Uri.parse(sg.bigo.ads.an.o.b(bVar.b.e, ((sg.bigo.ads.cp.a) bVar.f()).aV())).getPath());
        }
        if (bVar != null && (bb = ((sg.bigo.ads.cp.a) bVar.f()).bb()) != null) {
            return g.c(sg.bigo.ads.an.o.e(bVar.b.e) + File.separator + String.valueOf(bb.hashCode()));
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void E() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || ((sg.bigo.ads.ad.interstitial.a) this).c == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.C.setVisibility(0);
            sg.bigo.ads.ad.interstitial.c.b((View) this.C);
        }
        u();
        int av = av();
        if (this.L == this.R.size()) {
            this.C.b(av, this.V);
        } else {
            this.C.a(av, this.V);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        sg.bigo.ads.ad.interstitial.a aVar = this.U;
        if (aVar != null) {
            aVar.J();
            this.U = null;
        }
        super.J();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void N() {
    }

    @Override // sg.bigo.ads.s.a
    public final ValueCallback<Double> a() {
        return null;
    }

    @Override // sg.bigo.ads.s.a
    public final void a(int i) {
        if (i == 11) {
            aw();
        }
    }

    @Override // sg.bigo.ads.s.a
    public final void a(int i, int i2) {
    }

    protected void a(sg.bigo.ads.y.b bVar) {
        if (bVar instanceof sg.bigo.ads.aa.c) {
            ((sg.bigo.ads.aa.c) bVar).I = true;
            a aVar = new a(this.N, as());
            this.I.I = bVar;
            aVar.E = bVar;
            aVar.X();
            this.U = aVar;
            return;
        }
        if (bVar instanceof sg.bigo.ads.aa.d) {
            ((sg.bigo.ads.aa.d) bVar).O = true;
            b bVar2 = new b(this.N, as());
            this.I.I = bVar;
            bVar2.E = bVar;
            bVar2.X();
            this.U = bVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.s.a
    public final void a(boolean z, int i, int i2, int i3, i iVar, final sg.bigo.ads.y.b bVar, r rVar) {
        View view;
        if (z || !(i3 == 35 || (((sg.bigo.ads.cp.a) bVar.f()).aZ() && 1 == i))) {
            bVar.a(iVar, i2, i3);
            return;
        }
        View view2 = this.R.get(rVar);
        Iterator<Map.Entry<d, View>> it = this.R.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry<d, View> next = it.next();
            if (next.getKey() != rVar) {
                view = next.getValue();
                break;
            }
        }
        if (view2 == null || view == null) {
            a(bVar);
            at();
        } else {
            b.c cVar = new b.c() { // from class: sg.bigo.ads.t.c.6
                @Override // sg.bigo.ads.common.utils.b.c, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    c.this.a(bVar);
                    c.this.at();
                }
            };
            View view3 = (View) new WeakReference(view2).get();
            if (view3 != null) {
                view3.animate().alpha(0.0f).scaleX(1.5f).scaleY(1.5f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(new b.c() { // from class: sg.bigo.ads.common.utils.b.2
                    public AnonymousClass2() {
                    }

                    @Override // sg.bigo.ads.common.utils.b.c, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        c cVar2 = c.this;
                        if (cVar2 != null) {
                            cVar2.onAnimationEnd(animator);
                        }
                    }
                }).start();
            }
            View view4 = (View) new WeakReference(view).get();
            if (view4 != null) {
                view4.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
            }
        }
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) bVar.f(), bVar.j(), iVar.a(), i3, i2);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        return R.layout.bigo_ad_activity_vertical_twins_owner;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ad() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.interstitial.i
    public final void ae() {
        sg.bigo.ads.y.b bVar;
        d dVar;
        super.ae();
        sg.bigo.ads.y.b K = ((t) this.A).K();
        if (!(K instanceof sg.bigo.ads.aa.b)) {
            aM();
            return;
        }
        this.I = (sg.bigo.ads.aa.b) K;
        f(0);
        D();
        aa();
        this.K = (LinearLayout) q(R.id.bigo_ad_twins_sub_ad_container);
        this.S = q(R.id.bigo_ad_background_view);
        this.I.J = new d.a<NativeAd>() { // from class: sg.bigo.ads.t.c.2
            @Override // sg.bigo.ads.aj.d.a
            public final /* synthetic */ void a(NativeAd nativeAd) {
                RoundedFrameLayout roundedFrameLayout;
                NativeAd nativeAd2 = nativeAd;
                Iterator it = c.this.R.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    final d dVar2 = (d) it.next();
                    if (dVar2.b == nativeAd2) {
                        if (dVar2.e != null && (roundedFrameLayout = dVar2.a) != null) {
                            roundedFrameLayout.post(new Runnable() { // from class: sg.bigo.ads.t.d.4
                                AnonymousClass4() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    d.this.a.removeView(d.this.e);
                                    d.e(d.this);
                                    d.this.c();
                                }
                            });
                        }
                    }
                }
                c.this.ax();
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(NativeAd nativeAd, int i, int i2, String str) {
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(NativeAd nativeAd, boolean z, int i, int i2, String str, boolean z2) {
            }
        };
        if (this.K == null) {
            aM();
            return;
        }
        int i = this.I.S;
        int a = f.a(this.N, 16);
        int a2 = f.a(this.N, 10);
        if (f.c(this.N) <= 2000) {
            J = 270;
        }
        int a3 = f.a(this.N, J);
        for (int i2 = 0; i2 < i; i2++) {
            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(this.N);
            roundedFrameLayout.setCornerRadius(a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a3);
            layoutParams.leftMargin = a2;
            layoutParams.rightMargin = a2;
            if (i2 % 2 == 0) {
                layoutParams.topMargin = a;
            }
            roundedFrameLayout.setLayoutParams(layoutParams);
            this.K.addView(roundedFrameLayout, 0);
            sg.bigo.ads.y.b e = this.I.e(i2);
            ((sg.bigo.ads.cp.a) e.f()).n(this.I.b((sg.bigo.ads.aj.a) e));
            b.a aVar = this.I.L.get(e);
            boolean z = aVar != null ? aVar.a : false;
            if (e instanceof sg.bigo.ads.y.c) {
                bVar = e;
                dVar = new e(this.N, this, roundedFrameLayout, e, i2, this.S, z);
            } else {
                bVar = e;
                dVar = new d(this.N, this, roundedFrameLayout, bVar, i2, this.S, z);
            }
            this.R.put(dVar, roundedFrameLayout);
            dVar.X();
            if (i2 == 0) {
                ?? f = bVar.f();
                TextView textView = (TextView) q(R.id.inter_warning);
                if (textView != null) {
                    textView.setTag(8);
                    if (TextUtils.isEmpty(bVar.getWarning())) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(bVar.getWarning());
                    }
                }
                AdOptionsView adOptionsView = (AdOptionsView) q(R.id.inter_options);
                if (adOptionsView != 0) {
                    adOptionsView.setTag(4);
                    adOptionsView.a((sg.bigo.ads.api.core.b) f, f.m());
                }
                String j = f.j();
                TextView textView2 = (TextView) q(R.id.inter_advertiser);
                TextView textView3 = (TextView) q(R.id.inter_ad_label);
                if (textView2 != null) {
                    if (TextUtils.isEmpty(j)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(j);
                        int a4 = f.a(textView2.getContext(), 4);
                        int a5 = f.a(textView2.getContext(), 1);
                        textView2.setPadding(a4, a5, a4, a5);
                    }
                    if (textView3 != null) {
                        textView3.setText(R.string.bigo_ad_tag);
                    }
                }
            }
        }
        v.a(this.B, new v.a() { // from class: sg.bigo.ads.t.c.3
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                if (c.this.P == null || view == null) {
                    return;
                }
                View findViewById = view.findViewById(R.id.inter_ad_tag_layout);
                View findViewById2 = view.findViewById(R.id.inter_options);
                c.this.P.a(findViewById, 1);
                c.this.P.a(findViewById2, 1);
            }
        });
        E();
        ax();
    }

    protected final int as() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.getMillisUntilFinished() <= 0) {
            return 0;
        }
        return Math.round(this.C.getMillisUntilFinished() / 1000.0f);
    }

    protected final void at() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            adCountDownButton.d();
            this.C = null;
        }
        sg.bigo.ads.aa.b bVar = this.I;
        synchronized (bVar.K) {
            try {
                Iterator<sg.bigo.ads.y.b> it = bVar.L.keySet().iterator();
                while (it.hasNext()) {
                    Ad ad = (sg.bigo.ads.y.b) it.next();
                    if ((ad instanceof sg.bigo.ads.aj.f) && !((sg.bigo.ads.aj.f) ad).i_()) {
                        ad.destroy();
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<d> it2 = this.R.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().J();
            it2.remove();
        }
    }

    protected void au() {
    }

    @Override // sg.bigo.ads.s.a
    public final View b() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final x c() {
        return new x();
    }

    @Override // sg.bigo.ads.s.a
    public final void d_() {
        this.T = true;
    }

    @Override // sg.bigo.ads.s.a
    public final boolean e_() {
        return this.T;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z) {
        if (this.L == this.R.size() && this.M) {
            return true;
        }
        if (this.L >= this.R.size()) {
            return false;
        }
        Iterator<d> it = this.R.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                aw();
            }
        }
        if (this.L != this.R.size()) {
            return false;
        }
        E();
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.c();
        }
        Iterator<d> it = this.R.keySet().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        Iterator<d> it = this.R.keySet().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void u() {
        o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar == null || this.C == null) {
            super.u();
            return;
        }
        int a = oVar.a("multi_ads.close_button_style", 1);
        if (this.L == this.R.size()) {
            a = ((sg.bigo.ads.ad.interstitial.a) this).c.a("multi_ads_endpage.close_button_style", 1);
        }
        s.a(a, this.C);
    }
}
