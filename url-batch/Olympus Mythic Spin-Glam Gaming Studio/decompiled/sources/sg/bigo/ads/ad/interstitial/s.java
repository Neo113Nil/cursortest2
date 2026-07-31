package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.core.o;

/* loaded from: classes14.dex */
public final class s {
    @LayoutRes
    public static int a(@NonNull sg.bigo.ads.an.p pVar, int i) {
        Objects.toString(pVar);
        return ((31 == i || 32 == i) && pVar.a()) ? pVar.getWidth() / pVar.getHeight() > 0 ? R.layout.bigo_ad_activity_interstitial_rich_video_land_material_31_32 : 31 == i ? R.layout.bigo_ad_activity_interstitial_rich_video_left_material_31 : R.layout.bigo_ad_activity_interstitial_rich_video_right_material_32 : R.layout.bigo_ad_activity_interstitial_native_center;
    }

    public static int a(NativeAd nativeAd, int i) {
        Integer a = a(nativeAd);
        return a != null ? a.intValue() : i;
    }

    public static int a(NativeAd nativeAd, int i, boolean[] zArr) {
        int i2;
        boolean z = true;
        if (i != 2) {
            if (i == 3) {
                Integer a = a(nativeAd);
                if (a != null) {
                    i2 = a.intValue();
                } else {
                    z = false;
                }
            }
            i2 = -16736769;
        } else {
            i2 = -14972829;
        }
        a(zArr, z);
        return i2;
    }

    public static Bitmap a(Context context, sg.bigo.ads.y.b bVar, f fVar, @NonNull g gVar) {
        return a(context, bVar, fVar, gVar, false);
    }

    public static Bitmap a(Context context, sg.bigo.ads.y.b bVar, f fVar, @NonNull g gVar, boolean z) {
        if (context == null || gVar == null) {
            return null;
        }
        String str = fVar != null ? fVar.c : "";
        if (bVar != null && sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            str = bVar.getCreativeId();
        }
        return sg.bigo.ads.common.utils.e.a(context, (sg.bigo.ads.y.e.a(str, 4) * 0.5f) + 3.5f, gVar.f, gVar.d, gVar.e, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static Integer a(NativeAd nativeAd) {
        Integer K;
        if (!(nativeAd instanceof sg.bigo.ads.y.d) || (K = ((sg.bigo.ads.y.d) nativeAd).K()) == null) {
            return null;
        }
        return K;
    }

    @NonNull
    public static sg.bigo.ads.an.p a(sg.bigo.ads.y.b bVar) {
        o.a aVar;
        if (bVar == null) {
            return new sg.bigo.ads.an.p(-1, -1);
        }
        sg.bigo.ads.api.core.n bd = ((sg.bigo.ads.cp.a) bVar.f()).bd();
        if (bd != null) {
            sg.bigo.ads.an.p pVar = new sg.bigo.ads.an.p(bd.a, bd.b);
            if (pVar.a()) {
                return pVar;
            }
        }
        if (bVar instanceof sg.bigo.ads.y.c) {
            sg.bigo.ads.dh.p pVar2 = ((sg.bigo.ads.y.c) bVar).J;
            if (pVar2 != null) {
                sg.bigo.ads.an.p pVar3 = new sg.bigo.ads.an.p(pVar2.x, pVar2.w);
                if (pVar3.a()) {
                    return pVar3;
                }
            }
            o.c aG = ((sg.bigo.ads.cp.a) bVar.f()).aG();
            if (aG != null) {
                sg.bigo.ads.an.p pVar4 = new sg.bigo.ads.an.p(aG.a(), aG.b());
                if (pVar4.a()) {
                    return pVar4;
                }
            }
        } else {
            o.a[] aF = ((sg.bigo.ads.cp.a) bVar.f()).aF();
            if (!sg.bigo.ads.common.utils.l.a(aF)) {
                for (int i = 0; i < aF.length && (aVar = aF[i]) != null; i++) {
                    sg.bigo.ads.an.p pVar5 = new sg.bigo.ads.an.p(aVar.a(), aF[i].b());
                    if (pVar5.a()) {
                        return pVar5;
                    }
                }
            }
        }
        return new sg.bigo.ads.an.p(-1, -1);
    }

    public static void a(int i, AdCountDownButton adCountDownButton) {
        int i2;
        boolean z;
        if (adCountDownButton == null) {
            return;
        }
        if (i != 2) {
            z = false;
            i2 = i != 3 ? i != 4 ? i != 5 ? i != 6 ? -1 : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close;
        } else {
            i2 = R.drawable.bigo_ad_ic_close3;
            z = true;
        }
        if (i2 == -1) {
            adCountDownButton.a(R.layout.bigo_ad_item_inter_default_countdown_bg);
            return;
        }
        adCountDownButton.a(R.layout.bigo_ad_item_inter_countdown_bg);
        adCountDownButton.setCloseImageResource(i2);
        if (!adCountDownButton.c) {
            adCountDownButton.b(z);
        }
        if (i != 2) {
            adCountDownButton.setShowCloseButtonInCountdown(true);
        }
    }

    public static void a(final sg.bigo.ads.y.b bVar, final ValueCallback<Bitmap> valueCallback) {
        if (bVar == null) {
            return;
        }
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) bVar.f();
        if (!aVar.aZ()) {
            String bb = aVar.bb();
            if (sg.bigo.ads.common.utils.r.a((CharSequence) bb)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                sg.bigo.ads.bj.e.a(bVar.b.e, bb, aVar.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.s.4
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                        valueCallback.onReceiveValue(null);
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                        valueCallback.onReceiveValue(bitmap);
                    }
                });
                return;
            }
        }
        String b = sg.bigo.ads.an.o.b(bVar.b.e, aVar.aV());
        if (sg.bigo.ads.common.utils.r.a((CharSequence) b)) {
            valueCallback.onReceiveValue(null);
        } else {
            final String path = Uri.parse(b).getPath();
            sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.s.3
                @Override // java.lang.Runnable
                public final void run() {
                    valueCallback.onReceiveValue(sg.bigo.ads.common.utils.e.a(Uri.parse(path).getPath(), bVar.b.e));
                }
            });
        }
    }

    private static void a(boolean[] zArr, boolean z) {
        if (sg.bigo.ads.common.utils.l.a(zArr)) {
            return;
        }
        zArr[0] = z;
    }
}
