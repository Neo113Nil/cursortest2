package sg.bigo.ads.ad.banner;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.InnerBannerAd;

/* loaded from: classes5.dex */
public final class d {
    @Nullable
    public static BannerAd a(@NonNull sg.bigo.ads.api.core.g gVar) {
        try {
            return new i(gVar);
        } catch (Exception e) {
            sg.bigo.ads.da.b.a(3000, 10100, Log.getStackTraceString(e));
            return null;
        }
    }

    @Nullable
    public static InnerBannerAd b(@NonNull sg.bigo.ads.api.core.g gVar) {
        if (gVar.a.x() == 3) {
            return new e(gVar);
        }
        if (gVar.a.x() == 2 || gVar.a.x() == 1) {
            return new sg.bigo.ads.ab.d(gVar);
        }
        return null;
    }
}
