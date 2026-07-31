package sg.bigo.ads.r;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes4.dex */
public final class a {
    final ViewGroup a;
    final ViewFlow d;
    final int e;
    private final sg.bigo.ads.ad.interstitial.d h;
    int b = -1;
    int c = -1;
    public boolean f = true;
    float g = Float.MIN_VALUE;

    public a(ViewGroup viewGroup, ViewFlow viewFlow, sg.bigo.ads.ad.interstitial.d dVar, int i) {
        this.a = viewGroup;
        this.d = viewFlow;
        this.h = dVar;
        this.e = i;
    }

    public static void a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        a(viewGroup, "adview_background_main_tag", bitmapDrawable);
        a(viewGroup, "adview_background_second_tag", bitmapDrawable2);
    }

    public static void a(ViewGroup viewGroup, Object obj, BitmapDrawable bitmapDrawable) {
        ImageView imageView;
        View findViewWithTag = viewGroup.findViewWithTag(obj);
        if (findViewWithTag instanceof ImageView) {
            imageView = (ImageView) findViewWithTag;
        } else {
            Context context = viewGroup.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag(obj);
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                v.a(imageView2, viewGroup, null, 0);
                imageView = imageView2;
            } else {
                imageView = null;
            }
        }
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    public final void a(final int i) {
        if (this.f) {
            sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.r.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i2 = i;
                    if (i2 == aVar.b && i2 == aVar.c) {
                        aVar.b(i2);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void a(sg.bigo.ads.ad.interstitial.multi_img.view.d dVar, float f, int i) {
        Integer num;
        if (i != this.b) {
            return;
        }
        boolean d = dVar.d(this.e);
        int i2 = d ? dVar.n : dVar.o;
        this.g = f;
        this.c = f > 0.0f ? i - 1 : i + 1;
        View a = this.d.a(this.c);
        if (a != null) {
            Object tag = a.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar2 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                num = Integer.valueOf(d ? dVar2.n : dVar2.o);
                int a2 = this.h.a(sg.bigo.ads.bv.b.a(Math.abs(f), i2, num != null ? i2 : num.intValue()));
                if (d) {
                    return;
                }
                this.a.setBackgroundColor(a2);
                return;
            }
        }
        num = null;
        int a22 = this.h.a(sg.bigo.ads.bv.b.a(Math.abs(f), i2, num != null ? i2 : num.intValue()));
        if (d) {
        }
    }

    public final void b(int i) {
        if (this.f) {
            View a = this.d.a(i);
            Object tag = a.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                this.b = i;
                this.g = Float.MIN_VALUE;
                this.c = i;
                if (dVar.d(this.e)) {
                    this.a.setBackgroundColor(this.h.a(dVar.n));
                    return;
                }
                if (dVar.c(this.e)) {
                    this.h.a(dVar.o);
                    Bitmap bitmap = dVar.p;
                    int i2 = dVar.q;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(a.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i2);
                    ViewGroup viewGroup = this.a;
                    if (bitmap == null) {
                        bitmapDrawable = null;
                    }
                    a(viewGroup, bitmapDrawable, (BitmapDrawable) null);
                }
            }
        }
    }
}
