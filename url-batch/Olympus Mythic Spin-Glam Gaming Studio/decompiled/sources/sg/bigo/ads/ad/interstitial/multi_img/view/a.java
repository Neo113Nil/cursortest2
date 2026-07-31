package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.bj.g;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes15.dex */
public final class a extends d<AdImageView> implements g {
    private sg.bigo.ads.r.b a;
    private final ValueCallback<a> t;
    private final String u;

    public a(Context context, sg.bigo.ads.r.b bVar, sg.bigo.ads.r.c cVar, int i, int i2, String str, boolean z, ValueCallback<a> valueCallback) {
        super(context, cVar, false, i, i2, R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_item_layout, R.id.inter_media_item_layout, R.id.inter_media_item, R.id.inter_media_item_background);
        this.a = bVar;
        this.u = str;
        this.t = valueCallback;
        if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
            ((AdImageView) this.l).a(this);
            ((AdImageView) this.l).a(str, z);
            if (bVar != null) {
                bVar.a(str, 0);
            }
        }
        ((AdImageView) this.l).setFadeEnable(true);
        this.j.setStrokeWidth(f.a(context, 1));
        this.j.setStrokeColor(r.b("#08000000", -7829368));
        ((AdImageView) this.l).setBackgroundColor(r.b("#FFE1E1E6", -7829368));
        ((AdImageView) this.l).setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
    }

    static /* synthetic */ void a(a aVar, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            ViewGroup.LayoutParams layoutParams = aVar.j.getLayoutParams();
            if (layoutParams instanceof ViewFlow.b) {
                ViewFlow.b bVar = (ViewFlow.b) layoutParams;
                bVar.a = width;
                bVar.b = height;
            }
            aVar.j.setLayoutParams(layoutParams);
            aVar.a(width, height);
        }
        aVar.b(bitmap);
    }

    @Override // sg.bigo.ads.bj.g
    public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
        sg.bigo.ads.r.b bVar = this.a;
        if (bVar != null) {
            bVar.a(this.u, 2);
        }
        ((AdImageView) this.l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.t != null) {
                    a.this.t.onReceiveValue(a.this);
                }
            }
        });
    }

    public final void a(final Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((AdImageView) this.l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, bitmap);
                ((AdImageView) a.this.l).setImageBitmap(bitmap);
            }
        });
    }

    @Override // sg.bigo.ads.bj.g
    public final void a(@NonNull final Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
        sg.bigo.ads.r.b bVar = this.a;
        if (bVar != null) {
            bVar.a(this.u, 1);
        }
        ((AdImageView) this.l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, bitmap);
                ((AdImageView) a.this.l).setBackground(null);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d
    public final boolean a() {
        if (super.a()) {
            return true;
        }
        sg.bigo.ads.r.c cVar = this.g;
        if (cVar == null) {
            return false;
        }
        int i = cVar.d;
        return i == 3 || i == 2;
    }
}
