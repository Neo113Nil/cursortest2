package sg.bigo.ads.api.popup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.a;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* loaded from: classes4.dex */
public class PopupAdLoader extends AbstractAdLoader<PopupAd, PopupAdRequest> {

    public static class Builder implements AdLoader.Builder<PopupAd, Builder, PopupAdLoader> {
        private AdLoadListener<PopupAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public PopupAdLoader build() {
            return new PopupAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<PopupAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public PopupAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ PopupAd a(g gVar) {
        Object obj;
        if (gVar.a.y() != 20) {
            return (PopupAd) super.a(gVar);
        }
        if (gVar.a.y() != 20) {
            return null;
        }
        int x = gVar.a.x();
        if (x == 1 || x == 2) {
            if (a.a == null) {
                a.a = (k.a) sg.bigo.ads.bl.a.a("sg.bigo.ads.api.INAdCreator", k.a.class);
            }
            k.a<?> aVar = a.a;
            if (aVar == null) {
                return null;
            }
            Object adInstance = aVar.getAdInstance(gVar);
            boolean z = adInstance instanceof PopupAd;
            obj = adInstance;
            if (!z) {
                return null;
            }
        } else {
            if (x != 3) {
                return null;
            }
            if (a.b == null) {
                a.b = (k.a) sg.bigo.ads.bl.a.a("sg.bigo.ads.api.IBAdCreator", k.a.class);
            }
            k.a<?> aVar2 = a.b;
            if (aVar2 == null) {
                return null;
            }
            Object adInstance2 = aVar2.getAdInstance(gVar);
            boolean z2 = adInstance2 instanceof PopupAd;
            obj = adInstance2;
            if (!z2) {
                return null;
            }
        }
        return (PopupAd) obj;
    }
}
