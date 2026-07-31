package yads;

import android.content.Context;
import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Map;

/* loaded from: classes5.dex */
public final class j21 {
    public final m31 a;
    public final l31 b;

    public j21(Context context, m31 m31Var) {
        l31 l31Var = new l31(context);
        this.a = m31Var;
        this.b = l31Var;
    }

    public final q31 a(Map map, MediatedNativeAdImage mediatedNativeAdImage) {
        if (mediatedNativeAdImage == null) {
            return null;
        }
        String url = mediatedNativeAdImage.getUrl();
        int width = mediatedNativeAdImage.getWidth();
        int height = mediatedNativeAdImage.getHeight();
        this.a.getClass();
        if (width > 0 && height > 0) {
            return new q31(width, height, url, this.b.a(width, height), 112);
        }
        Bitmap bitmap = (Bitmap) map.get(url);
        if (bitmap == null) {
            return null;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        return new q31(width2, height2, url, this.b.a(width2, height2), 112);
    }
}
