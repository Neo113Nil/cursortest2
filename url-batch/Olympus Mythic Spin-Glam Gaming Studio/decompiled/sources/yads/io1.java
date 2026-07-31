package yads;

import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdAssets;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdMedia;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes12.dex */
public final class io1 implements z31 {
    public final /* synthetic */ jo1 a;
    public final /* synthetic */ MediatedNativeAd b;
    public final /* synthetic */ dq2 c;
    public final /* synthetic */ ho1 d;

    public io1(jo1 jo1Var, MediatedNativeAd mediatedNativeAd, dq2 dq2Var, ho1 ho1Var) {
        this.a = jo1Var;
        this.b = mediatedNativeAd;
        this.c = dq2Var;
        this.d = ho1Var;
    }

    @Override // yads.z31
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.z31
    public final void a(Map map) {
        ij1 ij1Var;
        jo1 jo1Var = this.a;
        MediatedNativeAd mediatedNativeAd = this.b;
        dq2 dq2Var = this.c;
        ho1 ho1Var = this.d;
        tz1 tz1Var = jo1Var.c;
        tz1Var.getClass();
        MediatedNativeAdAssets mediatedNativeAdAssets = mediatedNativeAd.getMediatedNativeAdAssets();
        xy1 xy1Var = tz1Var.a;
        xy1Var.getClass();
        ph a = xy1Var.a(mediatedNativeAdAssets.getAge(), "age");
        ph a2 = xy1Var.a(mediatedNativeAdAssets.getBody(), "body");
        ph a3 = xy1Var.a(mediatedNativeAdAssets.getCallToAction(), "call_to_action");
        ph a4 = xy1Var.a(mediatedNativeAdAssets.getDomain(), "domain");
        ph a5 = xy1Var.a(xy1Var.a.a(map, mediatedNativeAdAssets.getFavicon()), "favicon");
        ph a6 = xy1Var.a(xy1Var.a.a(map, mediatedNativeAdAssets.getIcon()), "icon");
        mj1 mj1Var = xy1Var.b;
        MediatedNativeAdImage image = mediatedNativeAdAssets.getImage();
        MediatedNativeAdMedia media = mediatedNativeAdAssets.getMedia();
        if (media != null) {
            mj1Var.getClass();
            ij1Var = new ij1(null, media.getAspectRatio(), media.getHasVideo(), 1);
        } else {
            ij1Var = null;
        }
        q31 a7 = mj1Var.a.a(map, image);
        List mutableListOf = a7 != null ? CollectionsKt.mutableListOf(a7) : null;
        ho1Var.a(new t8(null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, new s12(CollectionsKt.listOf(new ry1(dq2Var, CollectionsKt.listOfNotNull((Object[]) new ph[]{a, a2, a3, a4, a5, a6, xy1Var.a((ij1Var == null && mutableListOf == null) ? null : new dn1(ij1Var, null, mutableListOf), "media"), xy1Var.a(mediatedNativeAdAssets.getPrice(), "price"), xy1Var.a(String.valueOf(mediatedNativeAdAssets.getRating()), "rating"), xy1Var.a(mediatedNativeAdAssets.getReviewCount(), "review_count"), xy1Var.a(mediatedNativeAdAssets.getSponsored(), "sponsored"), xy1Var.a(mediatedNativeAdAssets.getTitle(), "title"), xy1Var.a(mediatedNativeAdAssets.getWarning(), "warning"), xy1Var.a(xy1Var.a.a(map, mediatedNativeAdAssets.getFeedback()), "feedback")}), null, null, null, null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, x22.b)), CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, new HashMap(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null), null, null, null, false, false, 0, 0, 0, false, null, false, false, false, false, false, null, false, -8388609, 32767));
    }
}
