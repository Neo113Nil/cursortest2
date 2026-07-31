package sg.bigo.ads.ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.y.a;

/* loaded from: classes9.dex */
public final class i extends sg.bigo.ads.ad.interstitial.e {
    static final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> j = new HashSet();
    ViewFlow c;
    Indicator d;
    RoundedFrameLayout e;
    sg.bigo.ads.r.a f;
    sg.bigo.ads.ad.interstitial.multi_img.view.b g;

    @NonNull
    final sg.bigo.ads.r.b h;

    @NonNull
    final x i;

    @NonNull
    final sg.bigo.ads.y.b l;

    @NonNull
    final ViewGroup m;
    sg.bigo.ads.ad.interstitial.multi_img.view.c o;
    sg.bigo.ads.ad.interstitial.multi_img.view.c p;
    final a.InterfaceC1919a k = new a.InterfaceC1919a() { // from class: sg.bigo.ads.ah.i.1
        @Override // sg.bigo.ads.y.a.InterfaceC1919a
        public final boolean a() {
            if (i.this.c != null) {
                return i.this.c.h;
            }
            return false;
        }
    };
    w q = new w() { // from class: sg.bigo.ads.ah.i.3
        @Override // sg.bigo.ads.ad.interstitial.w
        public final void a() {
            Bitmap bitmap = b.j;
            boolean aZ = ((sg.bigo.ads.cp.a) i.this.l.f()).aZ();
            if (bitmap != null) {
                if (aZ) {
                    synchronized (i.j) {
                        i.j.remove(i.this.g);
                    }
                }
                i.this.g.a(bitmap);
            }
        }
    };

    @NonNull
    final sg.bigo.ads.ad.interstitial.d n = new sg.bigo.ads.ad.interstitial.d();

    /* renamed from: sg.bigo.ads.ah.i$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sg.bigo.ads.r.d.values().length];
            a = iArr;
            try {
                iArr[sg.bigo.ads.r.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[sg.bigo.ads.r.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[sg.bigo.ads.r.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[sg.bigo.ads.r.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i(@NonNull sg.bigo.ads.y.b bVar, @NonNull ViewGroup viewGroup, @NonNull x xVar, @NonNull sg.bigo.ads.r.b bVar2) {
        this.l = bVar;
        this.m = viewGroup;
        this.h = bVar2;
        this.i = xVar;
    }

    static /* synthetic */ void a(i iVar, final long j2, long j3, final long j4) {
        if (j2 > 0) {
            ViewFlow viewFlow = iVar.c;
            if (!viewFlow.g && !viewFlow.e()) {
                iVar.c.setScrollEnabled(false);
                int a = sg.bigo.ads.common.utils.f.a(iVar.m.getContext(), 40);
                final int scrollX = iVar.c.getScrollX();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, a, 0);
                ofInt.setDuration(2 * j4);
                ofInt.setStartDelay(j3);
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ah.i.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        i.a(i.this, j2 - 1, 300L, j4);
                    }
                });
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ah.i.7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            i.this.c.scrollTo(scrollX + ((Integer) animatedValue).intValue(), i.this.c.getScrollY());
                        }
                    }
                });
                ofInt.start();
                return;
            }
        }
        iVar.c.setScrollEnabled(true);
    }

    final sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.r.c cVar, int i, String str, boolean z) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.h, cVar, d(), i, str, z, null);
        aVar.s = true;
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.a = -1;
        bVar.b = -1;
        bVar.c = false;
        bVar.d = cVar.d;
        this.c.addView(aVar.j, bVar);
        if (this.f != null) {
            aVar.r = new d.a() { // from class: sg.bigo.ads.ah.i.10
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    i.this.f.a(i.this.c.a(aVar.j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    final int d() {
        o oVar = this.h.a;
        if (oVar == null) {
            return 1;
        }
        return sg.bigo.ads.r.e.a(oVar.a("video_play_page.mediaview_colour"));
    }

    final boolean e() {
        return this.h.b == sg.bigo.ads.r.d.NONE;
    }

    final void f() {
        if (e()) {
        }
        int a = this.h.a.a("video_play_page.multi_guide");
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(a, new Runnable() { // from class: sg.bigo.ads.ah.i.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.this.c.post(new Runnable() { // from class: sg.bigo.ads.ah.i.8.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (i.this.c.g) {
                                    return;
                                }
                                i.a(i.this, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.c.setFlipInterval((a - 5) * 1000);
                this.c.c();
                break;
        }
    }
}
