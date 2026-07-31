package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.banner.e;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* loaded from: classes14.dex */
public class NativeBannerAdLoader extends AbstractAdLoader<Ad, NativeBannerAdRequest> {

    public static class Builder implements AdLoader.Builder<Ad, Builder, NativeBannerAdLoader> {
        private AdLoadListener<BannerAd> mBannerAdLoader;
        private String mExt;
        private AdLoadListener<NativeAd> mNativeAdLoader;

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public AdLoadListener<Ad> createMixAdLoadListener() {
            return new AdLoadListener<Ad>() { // from class: sg.bigo.ads.api.NativeBannerAdLoader.Builder.1
                @Override // sg.bigo.ads.api.AdLoadListener
                public final void onAdLoaded(@NonNull Ad ad) {
                    if ((ad instanceof NativeAd) && Builder.this.mNativeAdLoader != null) {
                        Builder.this.mNativeAdLoader.onAdLoaded((NativeAd) ad);
                    } else {
                        if (!(ad instanceof BannerAd) || Builder.this.mBannerAdLoader == null) {
                            return;
                        }
                        Builder.this.mBannerAdLoader.onAdLoaded((BannerAd) ad);
                    }
                }

                @Override // sg.bigo.ads.api.AdLoadListener
                public final void onError(@NonNull AdError adError) {
                    if (Builder.this.mNativeAdLoader != null) {
                        Builder.this.mNativeAdLoader.onError(adError);
                    } else if (Builder.this.mBannerAdLoader != null) {
                        Builder.this.mBannerAdLoader.onError(adError);
                    }
                }
            };
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public NativeBannerAdLoader build() {
            return new NativeBannerAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        @Deprecated
        public Builder withAdLoadListener(@Nullable AdLoadListener<Ad> adLoadListener) {
            return this;
        }

        public Builder withBannerAdLoadListener(@Nullable AdLoadListener<BannerAd> adLoadListener) {
            this.mBannerAdLoader = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }

        public Builder withNativeAdLoadListener(@Nullable AdLoadListener<NativeAd> adLoadListener) {
            this.mNativeAdLoader = adLoadListener;
            return this;
        }
    }

    public NativeBannerAdLoader(Builder builder) {
        super(builder.createMixAdLoadListener(), builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final Ad a(g gVar) {
        int y = gVar.a.y();
        return (y == 2 || gVar.a.x() == 3) ? new e(gVar) : y == 1 ? sg.bigo.ads.y.a.a(gVar) : super.a(gVar);
    }
}
