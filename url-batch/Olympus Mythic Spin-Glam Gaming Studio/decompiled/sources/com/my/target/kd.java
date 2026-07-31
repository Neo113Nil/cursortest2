package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.my.target.ae;
import com.my.target.b6;
import com.my.target.bd;
import com.my.target.common.listeners.HtmlCustomEventListener;
import com.my.target.common.listeners.HtmlInteractionListener;
import com.my.target.common.listeners.HtmlInteractiveProgressListener;
import com.my.target.common.listeners.HtmlLoadingListener;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.core.ui.views.nativeslider.c;
import com.my.target.d7;
import com.my.target.g;
import com.my.target.jd;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.views.CollageView;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.pj;
import com.my.target.xc;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class kd implements g.a {
    private final View.OnClickListener A;
    private final View.OnClickListener B;
    private final boolean a;
    private final yd b;
    private final sc c;
    private final pj d;
    private final mj e;
    private final zd f;
    private final ld g;
    private final c h;
    private final pj.a i;
    private final vc j;
    boolean l;
    private boolean m;
    private boolean o;
    private jd p;
    private bd q;
    private Parcelable r;
    private ae s;
    private b t;
    private NativeAd.CollageItemsShowHandler u;
    private HtmlInteractionListener v;
    private HtmlLoadingListener w;
    private HtmlInteractiveProgressListener x;
    private HtmlCustomEventListener y;
    private long z;
    int k = 0;
    private boolean n = true;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends pj.a {
        a() {
        }

        @Override // com.my.target.pj.a
        public void a(boolean z) {
            kd.this.d(z);
        }

        @Override // com.my.target.pj.a
        public void b() {
            kd.this.h();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class b implements View.OnClickListener {
        private final wc a;
        private final c b;
        private xc c;

        public b(wc wcVar, c cVar) {
            this.a = wcVar;
            this.b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xc a = xc.a(this.a);
            this.c = a;
            a.a(this.b);
            this.c.a(view.getContext());
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface c extends jd.c, c.a, ge, xc.a, b6.b, bd.d {
        void a();

        void a(View view);

        void g();

        void h();
    }

    private kd(sc scVar, c cVar, yd ydVar, NativeAd.CollageItemsShowHandler collageItemsShowHandler, MenuFactory menuFactory, boolean z) {
        this.h = cVar;
        this.c = scVar;
        this.a = scVar.c0().size() > 0;
        this.b = ydVar;
        this.j = vc.b(scVar.a(), menuFactory, cVar);
        this.A = new View.OnClickListener() { // from class: com.my.target.kd$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kd.this.b(view);
            }
        };
        this.B = new View.OnClickListener() { // from class: com.my.target.kd$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kd.this.c(view);
            }
        };
        this.u = collageItemsShowHandler;
        eb d0 = scVar.d0();
        this.l = (d0 == null || d0.A0() == null) ? false : true;
        this.d = pj.a(scVar.P(), scVar.H(), d0 == null, z, null, scVar.e0());
        this.e = z ? null : mj.a(scVar.H(), null);
        this.f = new zd(scVar.H());
        this.i = new a();
        th H = scVar.H();
        this.g = ld.a(H.a(1), H.a(2), scVar.f(), scVar.e0());
    }

    public static kd a(sc scVar, c cVar, yd ydVar, NativeAd.CollageItemsShowHandler collageItemsShowHandler, MenuFactory menuFactory, boolean z) {
        return new kd(scVar, cVar, ydVar, collageItemsShowHandler, menuFactory, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.h.a(view, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.h.a(view, 2);
    }

    private void k() {
        bd bdVar = this.q;
        if (bdVar == null) {
            return;
        }
        bdVar.c();
    }

    private void l() {
        jd jdVar = this.p;
        if (jdVar == null) {
            return;
        }
        jdVar.A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        MediaAdView l;
        this.l = false;
        this.k = 0;
        jd jdVar = this.p;
        if (jdVar != null) {
            jdVar.A();
        }
        ae aeVar = this.s;
        if (aeVar == null || (l = aeVar.l()) == null) {
            return;
        }
        l.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        af b2 = b(l);
        if (b2 != 0) {
            this.r = b2.getState();
            b2.dispose();
            ((View) b2).setVisibility(8);
        }
        a(l, this.c.y());
        l.getImageView().setVisibility(0);
        l.getProgressBarView().setVisibility(8);
        l.getPlayButtonView().setVisibility(8);
        if (this.n) {
            l.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.kd$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kd.this.a(view);
                }
            });
        }
    }

    public int[] e() {
        com.my.target.core.ui.views.nativeslider.c cVar;
        ae aeVar = this.s;
        if (aeVar == null) {
            return null;
        }
        int i = this.k;
        if (i == 2) {
            cVar = aeVar.n();
        } else if (i == 3) {
            MediaAdView l = aeVar.l();
            if (l == null) {
                return null;
            }
            cVar = b(l);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        return cVar.getVisibleCardNumbers();
    }

    public boolean f() {
        bd bdVar = this.q;
        if (bdVar != null) {
            return bdVar.a();
        }
        return false;
    }

    public NativeAd.NativeAdVideoPlayer g() {
        jd jdVar = this.p;
        if (jdVar != null) {
            return jdVar.v();
        }
        return null;
    }

    void h() {
        ae aeVar = this.s;
        ViewGroup o = aeVar != null ? aeVar.o() : null;
        if (o != null) {
            this.h.a(o);
        }
    }

    void i() {
    }

    public void j() {
        bd bdVar = this.q;
        if (bdVar != null) {
            bdVar.b();
        }
    }

    public void m() {
        this.d.e();
        this.d.a((pj.a) null);
        mj mjVar = this.e;
        if (mjVar != null) {
            mjVar.a((View) null);
        }
        this.g.e();
        k();
        l();
        if (this.s == null) {
            return;
        }
        this.c.f().b(1, 5004);
        IconAdView k = this.s.k();
        if (k != null) {
            b(k);
        }
        MediaAdView l = this.s.l();
        if (l != null) {
            e(l);
        }
        com.my.target.core.ui.views.nativeslider.c n = this.s.n();
        if (n != null) {
            n.setPromoCardSliderListener(null);
            this.r = n.getState();
            n.dispose();
        }
        ViewGroup o = this.s.o();
        if (o != null) {
            this.j.b(o);
            o.setVisibility(0);
        }
        a(this.s, (View.OnClickListener) null, (View.OnClickListener) null);
        this.s.a();
        this.s = null;
        this.t = null;
    }

    public void a(Context context) {
        this.j.a(context);
    }

    @Override // com.my.target.g.a
    public void b() {
        this.h.g();
    }

    public void c() {
        wh.b(this.c.H(), "closedByUser", 999);
        this.d.e();
        this.d.a((pj.a) null);
        mj mjVar = this.e;
        if (mjVar != null) {
            mjVar.c();
        }
        this.g.e();
        a(false);
        this.o = true;
        ae aeVar = this.s;
        ViewGroup o = aeVar != null ? aeVar.o() : null;
        if (o != null) {
            o.setVisibility(4);
        }
    }

    private void b(IconAdView iconAdView) {
        iconAdView.setOnClickListener(null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap(null);
        if (imageView instanceof fh) {
            ((fh) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData w = this.c.w();
        if (w != null) {
            b6.a(w, imageView);
        }
    }

    public void a(NativeAdViewBinder nativeAdViewBinder, List list, int i) {
        this.c.f().b(1, 5000);
        ViewGroup rootAdView = nativeAdViewBinder.getRootAdView();
        if (this.o) {
            this.c.f().c(1, 5003);
            mi.b("NativeAdViewController: Registering ad was disabled by user");
            rootAdView.setVisibility(4);
        } else {
            ae a2 = new ae.a().a(nativeAdViewBinder).a(list).a();
            this.s = a2;
            a(a2, this.A, this.B);
            a(this.s, i);
        }
    }

    private af b(MediaAdView mediaAdView) {
        if (!this.a) {
            return null;
        }
        for (int i = 0; i < mediaAdView.getChildCount(); i++) {
            KeyEvent.Callback childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof com.my.target.core.ui.views.nativeslider.c) {
                return (af) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.p.b(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z) {
        if (z) {
            this.h.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(MediaAdView mediaAdView) {
        ImageData y = this.c.y();
        fh fhVar = (fh) mediaAdView.getImageView();
        if (y != null) {
            b6.a(y, fhVar);
        }
        fhVar.setImageData(null);
        mediaAdView.getProgressBarView().setVisibility(8);
        mediaAdView.getPlayButtonView().setVisibility(8);
        mediaAdView.setPlaceHolderDimension(0, 0);
        mediaAdView.setOnClickListener(null);
        af b2 = b(mediaAdView);
        if (b2 != 0) {
            this.r = b2.getState();
            b2.dispose();
            ((View) b2).setVisibility(8);
        }
        com.my.target.a a2 = a(mediaAdView);
        if (a2 != null) {
            mediaAdView.removeView(a2);
        }
        mediaAdView.getCollageView().setVisibility(8);
    }

    private void c(MediaAdView mediaAdView, ImageData imageData) {
        a(mediaAdView, imageData);
        if (this.k == 2) {
            return;
        }
        this.k = 3;
        Context context = mediaAdView.getContext();
        af b2 = b(mediaAdView);
        if (b2 == null) {
            b2 = new com.my.target.core.ui.views.nativeslider.b(context);
            mediaAdView.addView(b2.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        Parcelable parcelable = this.r;
        if (parcelable != null) {
            b2.restoreState(parcelable);
        }
        b2.getView().setClickable(this.n);
        b2.setupCards(this.c.c0());
        b2.setPromoCardSliderListener(this.h);
        b2.setVisibility(0);
        mediaAdView.setBackgroundColor(0);
    }

    private void b(MediaAdView mediaAdView, ImageData imageData) {
        fh fhVar = (fh) mediaAdView.getImageView();
        if (imageData == null) {
            fhVar.setImageBitmap(null);
            return;
        }
        Bitmap bitmap = imageData.getBitmap();
        if (bitmap != null) {
            fhVar.setImageBitmap(bitmap);
        } else {
            fhVar.setImageBitmap(null);
            b6.a(imageData, fhVar, new b6.b() { // from class: com.my.target.kd$$ExternalSyntheticLambda3
                @Override // com.my.target.b6.b
                public final void a(boolean z) {
                    kd.this.b(z);
                }
            });
        }
    }

    public void a(View view, List list, int i, MediaAdView mediaAdView) {
        this.c.f().b(1, 5000);
        if (!(view instanceof ViewGroup)) {
            this.c.f().a(1, 5001, "rootView is not ViewGroup");
            mi.b("NativeAdViewController: Unable to register view for displaying NativeAd " + view + ", should be instance of ViewGroup");
            return;
        }
        if (this.o) {
            this.c.f().c(1, 5003);
            mi.b("NativeAdViewController: Registering ad was disabled by user");
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
            ae a2 = new ae.a().b((ViewGroup) view).a(list).a(mediaAdView).a();
            this.s = a2;
            a(a2, this.A, this.B);
            a(this.s, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z) {
        if (z) {
            this.h.h();
        }
    }

    void d(boolean z) {
        ae aeVar = this.s;
        if (aeVar != null && aeVar.o() != null) {
            if (this.k == 1) {
                a(z);
                return;
            }
            return;
        }
        m();
    }

    private void d(MediaAdView mediaAdView) {
        ImageData y = this.c.y();
        if (this.a) {
            c(mediaAdView, y);
            return;
        }
        b(mediaAdView, y);
        com.my.target.a c2 = this.t != null ? c(mediaAdView) : null;
        if (this.c.b0() != null) {
            a(this.c.b0(), mediaAdView);
            return;
        }
        if (this.l) {
            a(mediaAdView, c2 != null, this.h);
        } else if (this.c.X() != null) {
            a(this.c.X(), mediaAdView);
        } else {
            d(mediaAdView, y);
        }
    }

    private com.my.target.a c(MediaAdView mediaAdView) {
        com.my.target.a a2 = a(mediaAdView);
        if (a2 == null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            com.my.target.a aVar = new com.my.target.a(mediaAdView.getContext());
            mediaAdView.addView(aVar, layoutParams);
            a2 = aVar;
        }
        a2.a(this.c.a0(), this.c.Z());
        a2.setOnClickListener(this.t);
        return a2;
    }

    private void a(ae aeVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        List e = aeVar.e();
        if (e != null && !e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                a((View) it.next(), onClickListener);
            }
            a(aeVar.g(), onClickListener2);
            return;
        }
        Iterator it2 = aeVar.m().iterator();
        while (it2.hasNext()) {
            a((View) it2.next(), onClickListener);
        }
        a(aeVar.c(), onClickListener);
        a(aeVar.d(), onClickListener);
        a(aeVar.h(), onClickListener);
        a(aeVar.i(), onClickListener);
        a(aeVar.j(), onClickListener);
        a(aeVar.k(), onClickListener);
        a(aeVar.p(), onClickListener);
        a(aeVar.q(), onClickListener);
        a(aeVar.r(), onClickListener);
        a(aeVar.g(), onClickListener2);
    }

    private void d(MediaAdView mediaAdView, ImageData imageData) {
        a(mediaAdView, imageData);
        this.k = 0;
        mediaAdView.getImageView().setVisibility(0);
        mediaAdView.getPlayButtonView().setVisibility(8);
        mediaAdView.getProgressBarView().setVisibility(8);
        if (this.n) {
            b bVar = this.t;
            if (bVar != null) {
                mediaAdView.setOnClickListener(bVar);
            } else {
                mediaAdView.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.kd$$ExternalSyntheticLambda5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        kd.this.d(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.h.a(view, 1);
    }

    private void a(ae aeVar, int i) {
        ViewGroup o = aeVar.o();
        if (o == null) {
            mi.b("NativeAdViewController: something wrong, adview is null");
            return;
        }
        com.my.target.core.ui.views.nativeslider.c n = aeVar.n();
        this.n = aeVar.s();
        wc Y = this.c.Y();
        if (Y != null) {
            this.t = new b(Y, this.h);
        }
        IconAdView k = aeVar.k();
        if (k == null) {
            this.c.f().c(1, 5001, "iconAdView is null");
            mi.b("NativeAdViewController: IconAdView component not found in ad view " + o.getClass().getName() + ". It will be required in future versions of sdk.");
        } else {
            kg.c();
        }
        MediaAdView l = aeVar.l();
        if (l == null) {
            mi.b("NativeAdViewController: MediaAdView component not found in ad view " + o.getClass().getName() + ". It will be required in future versions of sdk.");
        } else {
            kg.d();
        }
        this.d.a(this.i);
        this.j.a(o, aeVar, this, i);
        if (this.a && n != null) {
            a(n);
        } else if (l != null) {
            d(l);
        }
        if (k != null) {
            a(k);
        }
        kg.b(o.getContext());
        this.d.b(o);
        mj mjVar = this.e;
        if (mjVar != null) {
            mjVar.a(o);
            this.e.b();
        }
        this.f.a(aeVar);
        this.g.a(o, aeVar.l());
    }

    private void a(c7 c7Var, MediaAdView mediaAdView) {
        ImageData imageData;
        d7.b bVar;
        Context context = mediaAdView.getContext();
        List a2 = c7Var.a();
        CollageView collageView = mediaAdView.getCollageView();
        collageView.setCollageSize(a2.size());
        for (final int i = 0; i < a2.size() && i < 10; i++) {
            final d7 d7Var = (d7) a2.get(i);
            if (!"image".equals(d7Var.b) || (imageData = d7Var.c) == null) {
                imageData = (!"video".equals(d7Var.b) || (bVar = d7Var.d) == null) ? null : bVar.a;
            }
            if (imageData != null) {
                fh fhVar = new fh(context);
                fhVar.setImageData(imageData);
                fhVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                fhVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                fhVar.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.kd$$ExternalSyntheticLambda7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        kd.this.a(d7Var, i, view);
                    }
                });
                FrameLayout frame = collageView.getFrame(i);
                if (frame != null) {
                    frame.addView(fhVar);
                }
                if (imageData.getData() == null) {
                    b6.b(imageData, fhVar);
                }
            }
        }
        collageView.setVisibility(0);
        mediaAdView.getImageView().setVisibility(8);
        mediaAdView.setPlaceHolderDimension(collageView.getPlaceholderWidth(), collageView.getPlaceholderHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(d7 d7Var, int i, View view) {
        NativeAd.CollageItemsShowHandler collageItemsShowHandler = this.u;
        wh.b(d7Var.e, "click", 2);
        if (collageItemsShowHandler != null) {
            if (collageItemsShowHandler.showCollageItem(i, view)) {
                return;
            }
            i();
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.h.a(view, 1);
    }

    void a(boolean z) {
        jd jdVar = this.p;
        if (jdVar == null) {
            return;
        }
        if (z) {
            jdVar.x();
        } else {
            jdVar.w();
        }
    }

    private void a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof fh) {
            fh fhVar = (fh) imageView;
            ImageData w = this.c.w();
            if (w == null) {
                imageView.setImageBitmap(null);
                fhVar.setPlaceholderDimensions(0, 0);
                return;
            }
            int width = w.getWidth();
            int height = w.getHeight();
            if (width <= 0 || height <= 0) {
                width = 100;
                height = 100;
            }
            fhVar.setPlaceholderDimensions(width, height);
            Bitmap bitmap = w.getBitmap();
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                b6.a(w, imageView, new b6.b() { // from class: com.my.target.kd$$ExternalSyntheticLambda6
                    @Override // com.my.target.b6.b
                    public final void a(boolean z) {
                        kd.this.c(z);
                    }
                });
            }
        }
    }

    private void a(com.my.target.core.ui.views.nativeslider.c cVar) {
        this.k = 2;
        cVar.setPromoCardSliderListener(this.h);
        Parcelable parcelable = this.r;
        if (parcelable != null) {
            cVar.restoreState(parcelable);
        }
    }

    void a(ad adVar, MediaAdView mediaAdView) {
        if (this.q == null) {
            bd a2 = bd.a(adVar, 16, 9);
            this.q = a2;
            a2.a(this.h);
            this.q.a(this.v);
            this.q.a(this.w);
            this.q.a(this.x);
            this.q.a(this.y);
            this.q.a(this.z);
        }
        this.q.a(mediaAdView);
    }

    private void a(MediaAdView mediaAdView, jd jdVar) {
        jdVar.a(this.h);
        ae aeVar = this.s;
        if (aeVar == null) {
            return;
        }
        jdVar.a(mediaAdView, aeVar.f());
    }

    private void a(MediaAdView mediaAdView, boolean z, jd.c cVar) {
        dj djVar;
        this.k = 1;
        eb d0 = this.c.d0();
        if (d0 != null) {
            mediaAdView.setPlaceHolderDimension(d0.R(), d0.v());
            djVar = (dj) d0.A0();
        } else {
            djVar = null;
        }
        dj djVar2 = djVar;
        if (djVar2 == null) {
            return;
        }
        if (this.p == null) {
            this.p = new jd(this.c, d0, djVar2, cVar, this.b);
        }
        b bVar = this.t;
        if (bVar != null) {
            mediaAdView.setOnClickListener(bVar);
        } else {
            mediaAdView.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.kd$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kd.this.e(view);
                }
            });
        }
        this.p.c(z);
        this.p.a(z);
        a(mediaAdView, this.p);
    }

    private com.my.target.a a(MediaAdView mediaAdView) {
        int childCount = mediaAdView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof com.my.target.a) {
                return (com.my.target.a) childAt;
            }
        }
        return null;
    }

    private void a(MediaAdView mediaAdView, ImageData imageData) {
        if (imageData == null) {
            mediaAdView.setPlaceHolderDimension(0, 0);
            return;
        }
        int width = imageData.getWidth();
        int height = imageData.getHeight();
        if (!this.m && width > 0 && height > 0) {
            mediaAdView.setPlaceHolderDimension(width, height);
        } else {
            mediaAdView.setPlaceHolderDimension(16, 9);
            this.m = true;
        }
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void a(NativeAd.CollageItemsShowHandler collageItemsShowHandler) {
        this.u = collageItemsShowHandler;
    }

    public void a(HtmlInteractionListener htmlInteractionListener) {
        this.v = htmlInteractionListener;
    }

    public void a(HtmlLoadingListener htmlLoadingListener) {
        this.w = htmlLoadingListener;
    }

    public void a(HtmlInteractiveProgressListener htmlInteractiveProgressListener) {
        this.x = htmlInteractiveProgressListener;
    }

    public void a(HtmlCustomEventListener htmlCustomEventListener) {
        this.y = htmlCustomEventListener;
    }

    public void a(long j) {
        this.z = j;
        bd bdVar = this.q;
        if (bdVar != null) {
            bdVar.a(j);
        }
    }
}
