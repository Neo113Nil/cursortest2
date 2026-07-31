package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.ae;
import com.my.target.b6;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.g;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.pj;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public class xd implements g.a {
    final sc a;
    final pj b;
    final mj c;
    final zd d;
    private final ld e;
    private final b f;
    private final vc h;
    private ae k;
    boolean l;
    private final View.OnClickListener i = new View.OnClickListener() { // from class: com.my.target.xd$$ExternalSyntheticLambda1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            xd.this.a(view);
        }
    };
    private final View.OnClickListener j = new View.OnClickListener() { // from class: com.my.target.xd$$ExternalSyntheticLambda2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            xd.this.b(view);
        }
    };
    private final pj.a g = new a();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends pj.a {
        a() {
        }

        @Override // com.my.target.pj.a
        public void b() {
            xd.this.d();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b extends ge, b6.b {
        void a();

        void a(View view);

        void i();
    }

    private xd(sc scVar, b bVar, MenuFactory menuFactory) {
        this.f = bVar;
        this.a = scVar;
        this.h = vc.b(scVar.a(), menuFactory, bVar);
        this.b = pj.a(scVar.P(), scVar.H(), true, false, null, scVar.e0());
        this.c = mj.a(scVar.H(), null);
        this.d = new zd(scVar.H());
        th H = scVar.H();
        this.e = ld.a(H.a(1), H.a(2), scVar.f(), scVar.e0());
    }

    public static xd a(sc scVar, b bVar, MenuFactory menuFactory) {
        return new xd(scVar, bVar, menuFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(view, 2);
        }
    }

    public void c() {
        wh.b(this.a.H(), "closedByUser", 999);
        ae aeVar = this.k;
        ViewGroup o = aeVar != null ? aeVar.o() : null;
        this.b.e();
        this.b.a((pj.a) null);
        this.e.e();
        this.c.c();
        this.l = true;
        if (o != null) {
            o.setVisibility(4);
        }
    }

    void d() {
        ae aeVar = this.k;
        ViewGroup o = aeVar != null ? aeVar.o() : null;
        if (o != null) {
            this.f.a(o);
        }
    }

    public void e() {
        this.b.e();
        this.b.a((pj.a) null);
        this.e.e();
        this.c.a((View) null);
        ae aeVar = this.k;
        if (aeVar == null) {
            return;
        }
        IconAdView k = aeVar.k();
        if (k != null) {
            b(k);
        }
        ViewGroup o = this.k.o();
        if (o != null) {
            this.h.b(o);
            o.setVisibility(0);
        }
        a(this.k, (View.OnClickListener) null, (View.OnClickListener) null);
        this.k.a();
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(view, 1);
        }
    }

    @Override // com.my.target.g.a
    public void b() {
        this.f.i();
    }

    private void b(IconAdView iconAdView) {
        iconAdView.setOnClickListener(null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap(null);
        if (imageView instanceof fh) {
            ((fh) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData w = this.a.w();
        if (w != null) {
            b6.a(w, imageView);
        }
    }

    public void a(Context context) {
        this.h.a(context);
    }

    public void a(NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i) {
        if (this.l) {
            mi.b("Registering ad was disabled by user");
            nativeBannerAdViewBinder.getRootAdBannerView().setVisibility(4);
        } else {
            ae a2 = new ae.a().a(nativeBannerAdViewBinder).a(list).a();
            this.k = a2;
            a(a2, this.i, this.j);
            a(this.k, i);
        }
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void a(View view, List list, int i) {
        if (this.l) {
            mi.b("Registering ad was disabled by user");
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            mi.b("unable to register view for displaying NativeBannerAd " + view + ", should be instance of ViewGroup");
            return;
        }
        ae a2 = new ae.a().b((ViewGroup) view).a(list).a();
        this.k = a2;
        a(a2, this.i, this.j);
        a(this.k, i);
    }

    private void a(ae aeVar, int i) {
        ViewGroup o = aeVar.o();
        if (o == null) {
            mi.b("something wrong, root ad view is null");
            return;
        }
        IconAdView k = aeVar.k();
        if (k == null) {
            mi.b("IconAdView component not found in ad view  " + o + ". It's required");
            return;
        }
        kg.c();
        a(k);
        this.b.a(this.g);
        this.h.a(o, aeVar, this, i);
        kg.b(o.getContext());
        this.b.b(o);
        this.c.a(o);
        this.c.b();
        this.d.a(aeVar);
        this.e.a(aeVar.o(), aeVar.l());
    }

    private void a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof fh) {
            ImageData w = this.a.w();
            if (w != null) {
                Bitmap bitmap = w.getBitmap();
                int width = w.getWidth();
                int height = w.getHeight();
                if (width <= 0 || height <= 0) {
                    width = 100;
                    height = 100;
                }
                ((fh) imageView).setPlaceholderDimensions(width, height);
                if (bitmap == null) {
                    b6.a(w, imageView, new b6.b() { // from class: com.my.target.xd$$ExternalSyntheticLambda0
                        @Override // com.my.target.b6.b
                        public final void a(boolean z) {
                            xd.this.a(z);
                        }
                    });
                    return;
                } else {
                    imageView.setImageBitmap(bitmap);
                    return;
                }
            }
            imageView.setImageBitmap(null);
            ((fh) imageView).setPlaceholderDimensions(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        if (z) {
            this.f.a();
        }
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
        a(aeVar.d(), onClickListener);
        a(aeVar.c(), onClickListener);
        a(aeVar.k(), onClickListener);
        a(aeVar.q(), onClickListener);
        a(aeVar.j(), onClickListener);
        a(aeVar.r(), onClickListener);
        a(aeVar.p(), onClickListener);
        a(aeVar.i(), onClickListener);
        a(aeVar.g(), onClickListener2);
    }
}
