package sg.bigo.ads.api;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.e;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.core.g;

@Keep
/* loaded from: classes9.dex */
public class INAdCreator implements k.a<t> {
    @Override // sg.bigo.ads.ad.interstitial.k.a
    public t getAdInstance(@NonNull g gVar) {
        return gVar.a.y() == 20 ? new e(gVar) : new t(gVar);
    }
}
