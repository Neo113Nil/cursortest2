package com.smaato.sdk.ng.vpaid;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.viewability.baseom.BaseVerificationScriptResource;
import com.smaato.sdk.ng.vpaid.helpers.AssetsLoader;
import com.smaato.sdk.ng.vpaid.models.vpaid.AdSpotDimensions;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import com.smaato.sdk.ng.vpaid.response.VastProcessor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class VideoAdProcessor {
    private static final String a = "VideoAdProcessor";

    public interface Listener {
        void onCacheError(Throwable th);

        void onCacheSuccess(AdParams adParams, String str, EndCardData endCardData, String str2, List<String> list);
    }

    class a implements VastProcessor.Listener {
        final /* synthetic */ Context a;
        final /* synthetic */ Listener b;

        a(Context context, Listener listener) {
            this.a = context;
            this.b = listener;
        }

        @Override // com.smaato.sdk.ng.vpaid.response.VastProcessor.Listener
        public void onParseError(PlayerInfo playerInfo) {
            if (this.b != null) {
                Logger.e(VideoAdProcessor.a, playerInfo.getMessage());
                this.b.onCacheError(new NextGenError(NextGenErrorCode.VAST_PLAYER_ERROR, playerInfo.getMessage()));
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.response.VastProcessor.Listener
        public void onParseSuccess(AdParams adParams, String str) {
            VideoAdProcessor.this.a(this.a, adParams, this.b);
        }
    }

    class b implements AssetsLoader.OnAssetsLoaded {
        final /* synthetic */ Listener a;
        final /* synthetic */ AdParams b;

        b(Listener listener, AdParams adParams) {
            this.a = listener;
            this.b = adParams;
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.AssetsLoader.OnAssetsLoaded
        public void onAssetsLoaded(String str, EndCardData endCardData, String str2) {
            Listener listener = this.a;
            if (listener != null) {
                AdParams adParams = this.b;
                listener.onCacheSuccess(adParams, str, endCardData, str2, VideoAdProcessor.this.a(adParams));
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.AssetsLoader.OnAssetsLoaded
        public void onError(PlayerInfo playerInfo) {
            if (this.a != null) {
                Logger.e(VideoAdProcessor.a, playerInfo.getMessage());
                this.a.onCacheError(new NextGenError(NextGenErrorCode.VAST_PLAYER_ERROR, playerInfo.getMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, AdParams adParams, Listener listener) {
        new AssetsLoader().load(adParams, context, new b(listener, adParams));
    }

    public void process(Context context, String str, AdSize adSize, Listener listener) {
        new VastProcessor(context, a(context, adSize)).parseResponse(str, new a(context, listener));
    }

    private AdSpotDimensions a(Context context, AdSize adSize) {
        if (adSize != null && adSize != AdSize.SIZE_INTERSTITIAL) {
            return new AdSpotDimensions(adSize.getWidth(), adSize.getHeight());
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new AdSpotDimensions(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> a(AdParams adParams) {
        ArrayList arrayList = new ArrayList();
        if (adParams != null && adParams.getVerificationScriptResources() != null && !adParams.getVerificationScriptResources().isEmpty()) {
            for (BaseVerificationScriptResource baseVerificationScriptResource : adParams.getVerificationScriptResources()) {
                if (!TextUtils.isEmpty(baseVerificationScriptResource.getVendorKey())) {
                    arrayList.add(baseVerificationScriptResource.getVendorKey());
                }
            }
        }
        return arrayList;
    }
}
