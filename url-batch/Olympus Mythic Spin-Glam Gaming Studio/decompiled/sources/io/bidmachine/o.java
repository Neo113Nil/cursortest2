package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdFormat;
import io.bidmachine.banner.BannerRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.internal.AbstractC6023s;
import io.bidmachine.internal.C6025u;
import io.bidmachine.interstitial.InterstitialRequest;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.nativead.NativeRequest;
import io.bidmachine.o;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.protobuf.TokenConfiguration;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.protobuf.sdk.Regs;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.rewarded.RewardedRequest;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
abstract class o {
    private static final TrackingObject a = new BidMachineTrackingObject();
    private static final Map b = new ConcurrentHashMap();
    private static final Map c = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements ExpirationListener {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a(BidToken bidToken) {
            return String.format("BidToken expired - %s", bidToken.getId());
        }

        @Override // io.bidmachine.ExpirationListener
        public void onExpired(final BidToken bidToken) {
            Logger.d("BidTokenManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.o$b$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String a;
                    a = o.b.a(BidToken.this);
                    return a;
                }
            });
            o.b(bidToken);
            bidToken.destroyAdRequest();
        }
    }

    static String a(Context context, AdPlacementConfig adPlacementConfig) {
        AdsType adsType = adPlacementConfig.getAdFormat().getAdsType();
        RequestTokenPayload b2 = b(context, adPlacementConfig);
        if (b2 == null) {
            a(adsType, BMError.internal("Failed to create RequestTokenPayload"));
            return "";
        }
        try {
            String encodeToString = Base64.encodeToString(b2.toByteArray(), 2);
            a(adsType);
            return encodeToString;
        } catch (Exception e) {
            a(adsType, BMError.throwable("Failed to encode RequestTokenPayload", e));
            c(b2.getTokenHashValue());
            return "";
        }
    }

    private static RequestTokenPayload b(Context context, AdPlacementConfig adPlacementConfig) {
        try {
            AdFormat adFormat = adPlacementConfig.getAdFormat();
            AdsType adsType = adFormat.getAdsType();
            k b2 = k.b();
            C6025u b3 = b2.b(context);
            io.bidmachine.internal.v c2 = b3.c();
            MaskedSignals.Builder newBuilder = MaskedSignals.newBuilder();
            RequestTokenPayload.Builder newBuilder2 = RequestTokenPayload.newBuilder();
            final Placement.Builder placementBuilder = newBuilder2.getPlacementBuilder();
            placementBuilder.setAdFormat(ProtoUtils.createAdFormatBuilder(adFormat));
            placementBuilder.setAdType(adsType.getName());
            Utils.ifNotNull(adPlacementConfig.getPlacementId(), new Executable() { // from class: io.bidmachine.o$$ExternalSyntheticLambda2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    o.a(Placement.Builder.this, (String) obj);
                }
            });
            Utils.ifNotNull(adPlacementConfig.getCustomParams(), new Executable() { // from class: io.bidmachine.o$$ExternalSyntheticLambda3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    o.a(Placement.Builder.this, (CustomParams) obj);
                }
            });
            App.Builder newBuilder3 = App.newBuilder();
            b2.e().build(context, newBuilder3);
            newBuilder2.setAppData(newBuilder3);
            SDK.Builder sdkver = SDK.newBuilder().setSdk(BidMachine.NAME).setSdkver("3.7.1");
            AbstractC6023s.a(sdkver);
            newBuilder2.setPlacementData(sdkver);
            b2.f().build(context, newBuilder2, newBuilder, b3.d(), c2);
            b2.o().a(context, newBuilder2, b3.h(), adsType);
            a(context, newBuilder2, adPlacementConfig);
            Regs.Builder newBuilder4 = Regs.newBuilder();
            io.bidmachine.internal.B.a(newBuilder4, newBuilder, b3);
            newBuilder2.setRegsData(newBuilder4);
            Struct.Builder newBuilder5 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                newBuilder5.putAllFields(privateStruct.getFieldsMap());
            }
            if (newBuilder5.getFieldsCount() > 0) {
                newBuilder2.setExt(newBuilder5.build());
            }
            return newBuilder2.build();
        } catch (Throwable th) {
            Logger.w(th);
            return null;
        }
    }

    static void c(BidToken bidToken) {
        c.put(bidToken.getId(), bidToken);
        bidToken.startExpiration();
    }

    static BidToken c(String str) {
        BidToken bidToken = (BidToken) c.remove(str);
        if (bidToken != null) {
            bidToken.stopExpiration();
        }
        return bidToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Placement.Builder builder, String str) {
        builder.setPlacementId(StringValue.of(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Placement.Builder builder, CustomParams customParams) {
        Struct.Builder newBuilder = Struct.newBuilder();
        customParams.fillStructBuilder(newBuilder);
        if (newBuilder.getFieldsCount() > 0) {
            builder.setCustomData(newBuilder);
        }
    }

    private static void a(Context context, RequestTokenPayload.Builder builder, AdPlacementConfig adPlacementConfig) {
        try {
            AdRequest a2 = a(adPlacementConfig);
            if (a2 == null) {
                return;
            }
            NetworkRegistry.registerAndInitializeCoreNetworks(context);
            TokenConfiguration b2 = b(adPlacementConfig.getAdFormat());
            HeaderBiddingPlacement.Builder newBuilder = HeaderBiddingPlacement.newBuilder();
            for (Message.Builder builder2 : a2.collectPlacementFormats(context, b2.getAdNetworksList(), null)) {
                if (builder2 instanceof Placement.DisplayPlacement.Builder) {
                    a(newBuilder, ((Placement.DisplayPlacement.Builder) builder2).getExtProtoList());
                } else if (builder2 instanceof Placement.VideoPlacement.Builder) {
                    a(newBuilder, ((Placement.VideoPlacement.Builder) builder2).getExtProtoList());
                }
            }
            if (newBuilder.getAdUnitsList().isEmpty()) {
                return;
            }
            final BidToken bidToken = new BidToken(a2, b2.getExpirationTime(), new b());
            c(bidToken);
            builder.getPlacementBuilder().setHbPlacement(newBuilder);
            builder.setTokenHashValue(bidToken.getId());
            Logger.d("BidTokenManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.o$$ExternalSyntheticLambda4
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String a3;
                    a3 = o.a(BidToken.this);
                    return a3;
                }
            });
        } catch (Throwable unused) {
            c(builder.getTokenHashValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(BidToken bidToken) {
        return String.format("BidTokenId - %s", bidToken.getId());
    }

    private static void a(HeaderBiddingPlacement.Builder builder, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                builder.addAllAdUnits(((HeaderBiddingPlacement) ((Any) it.next()).unpack(HeaderBiddingPlacement.class)).getAdUnitsList());
            } catch (Throwable unused) {
            }
        }
    }

    private static AdRequest a(AdPlacementConfig adPlacementConfig) {
        RequestBuilder builder;
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Banner) {
            builder = new BannerRequest.Builder(adPlacementConfig);
        } else if (adFormat instanceof AdFormat.Interstitial) {
            builder = new InterstitialRequest.Builder(adPlacementConfig);
        } else if (adFormat instanceof AdFormat.Rewarded) {
            builder = new RewardedRequest.Builder(adPlacementConfig);
        } else {
            builder = adFormat instanceof AdFormat.Native ? new NativeRequest.Builder(adPlacementConfig) : null;
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    private static TokenConfiguration b(AdFormat adFormat) {
        TokenConfiguration a2 = a(adFormat);
        return a2 == null ? TokenConfiguration.newBuilder().setExpirationTime(300).build() : a2;
    }

    private static void a(AdsType adsType) {
        b(adsType, (BMError) null);
    }

    private static void a(AdsType adsType, BMError bMError) {
        b(adsType, bMError);
    }

    static AdRequest a(ResponsePayload responsePayload) {
        if (responsePayload == null) {
            return null;
        }
        final String b2 = b(responsePayload);
        Logger.d("BidTokenManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.o$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String a2;
                a2 = o.a(b2);
                return a2;
            }
        });
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        BidToken c2 = c(b2);
        if (c2 == null) {
            Logger.d("BidTokenManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.o$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String b3;
                    b3 = o.b(b2);
                    return b3;
                }
            });
            return null;
        }
        return c2.getAdRequest();
    }

    private static void b(AdsType adsType, BMError bMError) {
        a.eventFinish(TrackEventType.GetBidToken, adsType, null, bMError);
    }

    static BidToken b(BidToken bidToken) {
        return c(bidToken.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(String str) {
        return String.format("BidToken is null by bidTokenId - %s", str);
    }

    private static String b(ResponsePayload responsePayload) {
        try {
            Value value = responsePayload.getResponseCache().getResponse().getExt().getFieldsMap().get("tokenHashValue");
            if (value == null) {
                return null;
            }
            return value.getStringValue();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(String str) {
        return String.format("BidTokenId from bidPayload - %s", str);
    }

    static void a(List list) {
        b.clear();
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TokenConfiguration tokenConfiguration = (TokenConfiguration) it.next();
            AdFormat byRemoteName = AdFormat.byRemoteName(tokenConfiguration.getType());
            if (byRemoteName != null) {
                b.put(byRemoteName, tokenConfiguration);
            }
        }
    }

    static TokenConfiguration a(AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        return (TokenConfiguration) b.get(adFormat);
    }
}
