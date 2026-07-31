package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import com.my.tracker.MyTracker;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.ApiRequest;
import io.bidmachine.B;
import io.bidmachine.C5998b;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.core.Utils;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.internal.AbstractC6023s;
import io.bidmachine.internal.C6025u;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.models.RequestParams;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.tracking.EventData;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoSerializerKt;
import io.bidmachine.utils.ProtoUtilsKt;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public abstract class AdRequest<SelfType extends AdRequest, AdRequestParametersType extends AdRequestParameters, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {

    @Nullable
    @VisibleForTesting
    List<AdRequestListener<SelfType>> adRequestListeners;

    @NonNull
    private final AdRequestParametersType adRequestParameters;

    @Nullable
    AdResponse adResponse;

    @NonNull
    private final C5998b adResponseLoader;

    @NonNull
    @VisibleForTesting
    final Queue<String> auctionUrlQueue;
    private final String id;

    @Nullable
    @VisibleForTesting
    List<e> internalAdRequestListeners;
    private final AtomicBoolean isApiRequestCanceled;
    private final AtomicBoolean isApiRequestCompleted;
    private final AtomicBoolean isDestroyed;
    private final AtomicBoolean isLoading;
    private final AtomicBoolean isRequestExpired;

    @Nullable
    private NetworkAdUnitManager networkAdUnitManager;
    private final Tag tag = new Tag("AdRequest");
    private final Runnable timeOutRunnable;

    @NonNull
    private final BidMachineTrackingObject trackingObject;

    @Nullable
    private UnifiedAdRequestParamsType unifiedAdRequestParams;

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class AdRequestBuilderImpl<SelfType extends RequestBuilder, ReturnType extends AdRequest<ReturnType, AdRequestParametersType, ?>, AdRequestParametersType extends AdRequestParameters> implements RequestBuilder<SelfType, ReturnType> {

        @NonNull
        protected AdPlacementConfig adPlacementConfig;

        @Nullable
        @VisibleForTesting
        ResponsePayload bidPayload;

        @Nullable
        @VisibleForTesting
        AdRequestListener<ReturnType> listener;

        @Nullable
        @VisibleForTesting
        List<NetworkConfig> networkConfigList;

        @Nullable
        @VisibleForTesting
        PriceFloorParams priceFloorParams;

        @Nullable
        @VisibleForTesting
        TargetingParams targetingParams;

        @Nullable
        @VisibleForTesting
        Integer timeOutMs;

        protected AdRequestBuilderImpl(@NonNull AdPlacementConfig adPlacementConfig) {
            this.adPlacementConfig = adPlacementConfig;
        }

        private void fillAdRequestParameters(@NonNull AdRequestParametersType adrequestparameterstype) {
            adrequestparameterstype.setAdPlacementConfig(this.adPlacementConfig);
            adrequestparameterstype.setPriceFloorParams(this.priceFloorParams);
            adrequestparameterstype.setTargetingParams(this.targetingParams);
            adrequestparameterstype.setNetworkConfigList(this.networkConfigList);
            adrequestparameterstype.setTimeOutMs(this.timeOutMs);
            adrequestparameterstype.setBidPayload(this.bidPayload);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public ReturnType build() {
            ReturnType returntype = (ReturnType) o.a(this.bidPayload);
            if (returntype == null) {
                returntype = (ReturnType) build(createAdRequestParameters());
            }
            fillAdRequestParameters(returntype.getAdRequestParameters());
            returntype.addListener(this.listener);
            return returntype;
        }

        @NonNull
        protected abstract ReturnType build(@NonNull AdRequestParametersType adrequestparameterstype);

        @NonNull
        protected abstract AdRequestParametersType createAdRequestParameters();

        @VisibleForTesting
        void fillNetworkConfigs(@Nullable List<NetworkConfig> list) {
            if (list == null) {
                this.networkConfigList = new ArrayList();
            } else {
                this.networkConfigList = list;
            }
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setBidPayload(@Nullable String str) {
            if (str == null) {
                this.bidPayload = null;
                return this;
            }
            try {
                this.bidPayload = ResponsePayload.parseFrom(Base64.decode(str, 0));
            } catch (Throwable th) {
                Logger.w(th);
            }
            if (this.bidPayload == null) {
                this.bidPayload = ResponsePayload.getDefaultInstance();
            }
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        @Deprecated(since = MyTracker.VERSION)
        public SelfType setCustomParams(@Nullable CustomParams customParams) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder().withCustomParams(customParams).build();
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setListener(@Nullable AdRequestListener<ReturnType> adRequestListener) {
            this.listener = adRequestListener;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setLoadingTimeOut(@Nullable Integer num) {
            this.timeOutMs = num;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setNetworks(@Nullable List<NetworkConfig> list) {
            fillNetworkConfigs(list);
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        @Deprecated(since = MyTracker.VERSION)
        public SelfType setPlacementId(@Nullable String str) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder().withPlacementId(str).build();
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
            this.priceFloorParams = priceFloorParams;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        @Deprecated
        public SelfType setSessionAdParams(@Nullable SessionAdParams sessionAdParams) {
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setTargetingParams(@Nullable TargetingParams targetingParams) {
            this.targetingParams = targetingParams;
            return this;
        }

        @Override // io.bidmachine.models.RequestBuilder
        @NonNull
        public SelfType setNetworks(@Nullable String str) {
            ArrayList arrayList = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            NetworkConfig a = y.a(k.b().d(), jSONArray.getJSONObject(i));
                            if (a != null) {
                                arrayList2.add(a);
                            }
                        }
                        arrayList = arrayList2;
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList2;
                        Logger.w(e);
                        fillNetworkConfigs(arrayList);
                        return this;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            fillNetworkConfigs(arrayList);
            return this;
        }
    }

    public interface AdRequestListener<AdRequestType extends AdRequest> {
        void onRequestExpired(@NonNull AdRequestType adrequesttype);

        void onRequestFailed(@NonNull AdRequestType adrequesttype, @NonNull BMError bMError);

        void onRequestSuccess(@NonNull AdRequestType adrequesttype, @NonNull AuctionResult auctionResult);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdResponse f = C5999c.a().f(AdRequest.this.adRequestParameters);
            if (f != null) {
                AdRequest.this.processApiRequestSuccess(f);
            } else {
                AdRequest.this.processApiRequestFail(BMError.TimeoutError, false);
                AdRequest.this.cancel();
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ Context a;

        b(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String a() {
            return "Request start";
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdRequest.this.cancel();
                AdRequest.this.unsubscribeTimeOut();
                AdRequest<?, ?, ?> adRequest = AdRequest.this;
                AdResponse adResponse = adRequest.adResponse;
                if (adResponse != null) {
                    adResponse.detachAdRequest(adRequest);
                    AdRequest.this.adResponse = null;
                }
                AdRequest.this.isApiRequestCanceled.set(false);
                AdRequest.this.isApiRequestCompleted.set(false);
                AdRequest.this.subscribeTimeOut();
                AdRequest.this.log(new LazyValue() { // from class: io.bidmachine.AdRequest$b$$ExternalSyntheticLambda0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String a;
                        a = AdRequest.b.a();
                        return a;
                    }
                });
                AdRequest.this.trackingObject.eventStart(TrackEventType.AuctionRequest);
                ResponsePayload bidPayload = AdRequest.this.adRequestParameters.getBidPayload();
                if (bidPayload != null) {
                    AdRequest.this.processBidPayload(bidPayload);
                } else {
                    AdRequest.this.processRequestObject(this.a);
                }
            } catch (Throwable th) {
                Logger.w(th);
                AdRequest.this.processRequestFail(BMError.throwable("Exception loading ad request", th));
            }
        }
    }

    class c implements B.a {
        c() {
        }

        @Override // io.bidmachine.B.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AdResponse adResponse) {
            AdRequest.this.processApiRequestSuccess(adResponse);
        }

        @Override // io.bidmachine.B.a
        public void a(BMError bMError) {
            AdRequest.this.processApiRequestFail(bMError);
        }
    }

    interface e {
        void a(AdRequest adRequest);
    }

    protected AdRequest(@NonNull AdRequestParametersType adrequestparameterstype) {
        String uuid = UUID.randomUUID().toString();
        this.id = uuid;
        this.isLoading = new AtomicBoolean(false);
        this.isApiRequestCanceled = new AtomicBoolean(false);
        this.isApiRequestCompleted = new AtomicBoolean(false);
        this.isRequestExpired = new AtomicBoolean(false);
        this.isDestroyed = new AtomicBoolean(false);
        this.timeOutRunnable = new a();
        this.trackingObject = new BidMachineTrackingObject(uuid);
        this.adRequestParameters = adrequestparameterstype;
        this.adResponseLoader = new C5998b(uuid);
        this.auctionUrlQueue = new LinkedList();
    }

    private boolean canProcessApiRequestResult() {
        return (isCompleted() || isCanceled() || isDestroyed()) ? false : true;
    }

    private boolean canSendApiRequest() {
        return !isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$build$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$build$2(k kVar, RequestExtension.Builder builder) {
        String g = kVar.g();
        if (TextUtils.isEmpty(g)) {
            return;
        }
        builder.setIfv(g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$build$3(k kVar, MaskedSignals.Builder builder, io.bidmachine.internal.v vVar) {
        String g = kVar.g();
        if (TextUtils.isEmpty(g)) {
            return;
        }
        builder.setIfv(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(g))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$build$4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$collectNetworkConfig$5(NetworkConfig networkConfig, String str) {
        return String.format("%s was removed from AdRequest: %s", networkConfig.getNetworkKey(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$destroy$8() {
        return "destroy";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$log$12(LazyValue lazyValue) {
        return String.format("%s - %s", this.adRequestParameters.getAdsType(), lazyValue.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$logError$13(LazyValue lazyValue) {
        return String.format("%s - %s", this.adRequestParameters.getAdsType(), lazyValue.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$notifyMediationLoss$7(String str, Double d2) {
        return String.format("notifyMediationLoss (winnerNetworkName - %s, winnerNetworkPrice - %s)", str, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$notifyMediationWin$6() {
        return "notifyMediationWin";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processApiRequestSuccess$10(AdResponse adResponse) {
        return String.format("Request success - %s", adResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processExpired$9() {
        return "Request expired";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processRequestFail$11(BMError bMError) {
        return String.format("Request fail - %s", bMError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(@NonNull final LazyValue<String> lazyValue) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda7
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$log$12;
                lambda$log$12 = AdRequest.this.lambda$log$12(lazyValue);
                return lambda$log$12;
            }
        });
    }

    private void logError(@NonNull final LazyValue<String> lazyValue) {
        Logger.e(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda11
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$logError$13;
                lambda$logError$13 = AdRequest.this.lambda$logError$13(lazyValue);
                return lambda$logError$13;
            }
        });
    }

    @NonNull
    private NetworkAdUnitManager obtainNetworkAdUnitManager() {
        if (this.networkAdUnitManager == null) {
            this.networkAdUnitManager = new NetworkAdUnitManager();
        }
        return this.networkAdUnitManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processApiRequestCancel() {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCanceled.set(true);
            unsubscribeTimeOut();
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestCancel, getAdsType(), null, null);
            this.trackingObject.clearEvent(TrackEventType.AuctionRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRequestObject(@NonNull Context context) {
        prepareUrls();
        Object build = build(context);
        if (build instanceof Request) {
            processRequestBuilder(new ApiRequest.Builder().setRequestData((Request) build).setDataBinder(getAdsType().getBinder()), pollUrl());
        } else {
            processRequestFail(build instanceof BMError ? (BMError) build : BMError.internal("Failed to create ad request"));
        }
    }

    private void setLoading(boolean z) {
        this.isLoading.set(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void subscribeTimeOut() {
        int obtainTimeOutMs = obtainTimeOutMs();
        if (obtainTimeOutMs > 0) {
            Utils.onBackgroundThread(this.timeOutRunnable, obtainTimeOutMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unsubscribeTimeOut() {
        Utils.cancelBackgroundThreadTask(this.timeOutRunnable);
    }

    void addInternalListener(@Nullable e eVar) {
        if (eVar != null) {
            if (this.internalAdRequestListeners == null) {
                this.internalAdRequestListeners = new CopyOnWriteArrayList();
            }
            this.internalAdRequestListeners.add(eVar);
        }
    }

    public void addListener(@Nullable AdRequestListener<SelfType> adRequestListener) {
        if (adRequestListener != null) {
            if (this.adRequestListeners == null) {
                this.adRequestListeners = new CopyOnWriteArrayList();
            }
            this.adRequestListeners.add(adRequestListener);
        }
    }

    @Nullable
    @VisibleForTesting
    Object build(@NonNull final Context context) {
        try {
            String n = k.b().n();
            if (TextUtils.isEmpty(n)) {
                return BMError.notFound("SellerId");
            }
            final k b2 = k.b();
            C6025u b3 = b2.b(context);
            io.bidmachine.internal.w d2 = b3.d();
            final io.bidmachine.internal.v c2 = b3.c();
            Runnable runnable = new Runnable() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AdvertisingDataManager.c(context);
                }
            };
            d2.a(runnable, runnable, new Runnable() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AdRequest.lambda$build$1();
                }
            });
            TargetingParams targetingParams = (TargetingParams) RequestParams.resolveParams(this.adRequestParameters.getTargetingParams(), b2.q());
            PriceFloorParams priceFloorParams = this.adRequestParameters.getPriceFloorParams();
            Map<String, Double> priceFloors = (priceFloorParams == null || priceFloorParams.getPriceFloors().isEmpty()) ? b2.j().getPriceFloors() : priceFloorParams.getPriceFloors();
            if (priceFloors.isEmpty()) {
                return BMError.notFound("PriceFloors");
            }
            Request.Builder newBuilder = Request.newBuilder();
            final MaskedSignals.Builder newBuilder2 = MaskedSignals.newBuilder();
            Request.Item.Builder newBuilder3 = Request.Item.newBuilder();
            newBuilder3.setId(UUID.randomUUID().toString());
            newBuilder3.setQty(1);
            for (Iterator<Map.Entry<String, Double>> it = priceFloors.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<String, Double> next = it.next();
                Request.Item.Deal.Builder newBuilder4 = Request.Item.Deal.newBuilder();
                newBuilder4.setId(next.getKey());
                newBuilder4.setFlr(next.getValue().doubleValue());
                newBuilder4.setFlrcur("USD");
                newBuilder3.addDeal(newBuilder4);
            }
            newBuilder.setContext(Any.pack(RequestDataRetriever.createContext(context, b2, b3, targetingParams, newBuilder2, null, getAdsType())));
            newBuilder.setTest(b2.u());
            newBuilder.addCur("USD");
            newBuilder.setAt(2);
            newBuilder.setTmax(10000);
            Placement.Builder newBuilder5 = Placement.newBuilder();
            newBuilder5.setSsai(0);
            newBuilder5.setSdk(BidMachine.NAME);
            newBuilder5.setSdkver("3.7.1");
            newBuilder5.setSecure(!Utils.canUseCleartextTraffic());
            for (Message.Builder builder : collectPlacementFormats(context, null, this.adRequestParameters.getAdPlacementConfig())) {
                if (builder instanceof Placement.DisplayPlacement.Builder) {
                    Placement.DisplayPlacement.Builder builder2 = (Placement.DisplayPlacement.Builder) builder;
                    onBeforeSetDisplayPlacementBuilder(builder2);
                    newBuilder5.setDisplay(builder2);
                } else {
                    if (!(builder instanceof Placement.VideoPlacement.Builder)) {
                        throw new IllegalArgumentException("Unsupported display type: " + builder);
                    }
                    Placement.VideoPlacement.Builder builder3 = (Placement.VideoPlacement.Builder) builder;
                    onBeforeSetVideoPlacementBuilder(builder3);
                    newBuilder5.setVideo(builder3);
                }
            }
            Struct.Builder newBuilder6 = Struct.newBuilder();
            AbstractC6023s.a(newBuilder6);
            ListValue.Builder newBuilder7 = ListValue.newBuilder();
            Iterator it2 = C5999c.a().e(this.adRequestParameters).iterator();
            while (it2.hasNext()) {
                newBuilder7.addValues(((AdResponse) it2.next()).createBidCacheExtensionValue());
            }
            if (newBuilder7.getValuesCount() > 0) {
                newBuilder6.putFields("bid_cache", Value.newBuilder().setListValue(newBuilder7).build());
            }
            if (newBuilder6.getFieldsCount() > 0) {
                newBuilder5.setExt(newBuilder6);
            }
            onBuildPlacement(newBuilder5);
            newBuilder3.setSpec(Any.pack(newBuilder5.build()));
            newBuilder.addItem(newBuilder3.build());
            Struct.Builder newBuilder8 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                newBuilder8.putAllFields(privateStruct.getFieldsMap());
            }
            if (newBuilder8.getFieldsCount() > 0) {
                newBuilder.setExt(newBuilder8.build());
            }
            final RequestExtension.Builder newBuilder9 = RequestExtension.newBuilder();
            newBuilder9.setSellerId(n);
            newBuilder9.setBmIfv(b2.g(context));
            d2.a(new Runnable() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AdRequest.lambda$build$2(k.this, newBuilder9);
                }
            }, new Runnable() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    AdRequest.lambda$build$3(k.this, newBuilder2, c2);
                }
            }, new Runnable() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AdRequest.lambda$build$4();
                }
            });
            newBuilder9.setSessionId(b3.h());
            newBuilder.addExtProto(Any.pack(newBuilder9.build()));
            return newBuilder.build();
        } catch (Throwable th) {
            Logger.w(th);
            return BMError.throwable("Exception creating ad request", th);
        }
    }

    void cancel() {
        this.adResponseLoader.a();
    }

    @Nullable
    @VisibleForTesting
    BMError checkBidPayload(@NonNull ResponsePayload responsePayload) {
        if (responsePayload == ResponsePayload.getDefaultInstance()) {
            return BMError.incorrectContent("BidPayload is default instance");
        }
        try {
            Placement requestItemSpec = responsePayload.getRequestItemSpec();
            if (requestItemSpec != Placement.getDefaultInstance()) {
                return this.adRequestParameters.checkPlacement(requestItemSpec);
            }
            return null;
        } catch (Throwable th) {
            Logger.w(th);
            return BMError.throwable("Exception validating BidPayload", th);
        }
    }

    void clearNetworkAdUnits() {
        obtainNetworkAdUnitManager().notifyNetworkClearAuction();
    }

    @NonNull
    @VisibleForTesting
    List<NetworkConfig> collectNetworkConfig(@NonNull Context context, @NonNull AdsType adsType, @Nullable List<String> list) {
        HashMap hashMap = new HashMap();
        List<NetworkConfig> networkConfigList = this.adRequestParameters.getNetworkConfigList();
        if (networkConfigList == null) {
            Utils.putAll(hashMap, NetworkRegistry.copyOrNullInitializedNetworkConfigs(adsType));
        } else {
            hashMap.putAll(NetworkRegistry.createInitNetworkConfigMap());
            for (final NetworkConfig networkConfig : networkConfigList) {
                final String checkAndPutNetwork = NetworkRegistry.checkAndPutNetwork(context, adsType, networkConfig, hashMap);
                if (checkAndPutNetwork != null) {
                    logError(new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda13
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String lambda$collectNetworkConfig$5;
                            lambda$collectNetworkConfig$5 = AdRequest.lambda$collectNetworkConfig$5(NetworkConfig.this, checkAndPutNetwork);
                            return lambda$collectNetworkConfig$5;
                        }
                    });
                }
            }
        }
        if (list != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!list.contains((String) ((Map.Entry) it.next()).getKey())) {
                    it.remove();
                }
            }
        }
        Utils.putAll(hashMap, NetworkRegistry.copyOrNullInitializedCoreNetworkConfigs(adsType));
        return new ArrayList(hashMap.values());
    }

    @NonNull
    List<Message.Builder> collectPlacementFormats(@NonNull Context context, @Nullable List<String> list, @Nullable AdPlacementConfig adPlacementConfig) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        AdsType adsType = getAdsType();
        adsType.collectPlacements(new SimpleContextProvider(context), this, obtainUnifiedRequestParams(context), collectNetworkConfig(context, adsType, list), arrayList, copyOnWriteArrayList, adPlacementConfig, k.b().i());
        this.networkAdUnitManager = new NetworkAdUnitManager(copyOnWriteArrayList);
        return arrayList;
    }

    @NonNull
    protected abstract UnifiedAdRequestParamsType createUnifiedAdRequestParams(@NonNull AdRequestParametersType adrequestparameterstype, @NonNull TargetingInfo targetingInfo, @NonNull DataRestrictions dataRestrictions);

    public void destroy() {
        if (this.isDestroyed.compareAndSet(false, true)) {
            log(new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda10
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$destroy$8;
                    lambda$destroy$8 = AdRequest.lambda$destroy$8();
                    return lambda$destroy$8;
                }
            });
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestDestroy, false, getAdsType(), this.adResponse, null);
            cancel();
            unsubscribeTimeOut();
            this.trackingObject.clear();
            BidMachineFetcher.release(this);
            notifyRequestDestroyed();
            this.unifiedAdRequestParams = null;
            AdResponse adResponse = this.adResponse;
            if (adResponse != null) {
                adResponse.detachAdRequest(this);
                this.adResponse = null;
            }
        }
    }

    @NonNull
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Nullable
    AdResponse getAdResponse() {
        return this.adResponse;
    }

    @NonNull
    protected final AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    @Nullable
    public AuctionResult getAuctionResult() {
        AdResponse adResponse = this.adResponse;
        if (adResponse != null) {
            return adResponse.getAuctionResult();
        }
        return null;
    }

    boolean isAdResponseExpired() {
        AdResponse adResponse = this.adResponse;
        return adResponse != null && adResponse.isExpired();
    }

    boolean isCanceled() {
        return this.isApiRequestCanceled.get();
    }

    boolean isCompleted() {
        return this.isApiRequestCompleted.get();
    }

    public boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    public boolean isExpired() {
        return isAdResponseExpired() || this.isRequestExpired.get();
    }

    boolean isLoading() {
        return this.isLoading.get();
    }

    boolean isPlacementBuilderMatch(@NonNull PlacementBuilder placementBuilder) {
        return true;
    }

    public void notifyMediationLoss() {
        notifyMediationLoss(null, null);
    }

    public void notifyMediationWin() {
        if (isCompleted()) {
            log(new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$notifyMediationWin$6;
                    lambda$notifyMediationWin$6 = AdRequest.lambda$notifyMediationWin$6();
                    return lambda$notifyMediationWin$6;
                }
            });
            this.trackingObject.eventFinish(TrackEventType.MediationWin, false, getAdsType(), this.adResponse, isDestroyed() ? BMError.RequestDestroyed : isExpired() ? BMError.RequestExpired : null);
        }
    }

    void notifyRequestDestroyed() {
        List<e> list = this.internalAdRequestListeners;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    @VisibleForTesting
    int obtainTimeOutMs() {
        Integer timeOutMs;
        int m = k.b().m();
        return (m > 0 || (timeOutMs = this.adRequestParameters.getTimeOutMs()) == null || timeOutMs.intValue() <= 0) ? m : timeOutMs.intValue();
    }

    @NonNull
    final UnifiedAdRequestParamsType obtainUnifiedRequestParams(@NonNull Context context) {
        if (this.unifiedAdRequestParams == null) {
            k b2 = k.b();
            TargetingParams targetingParams = (TargetingParams) RequestParams.resolveParams(this.adRequestParameters.getTargetingParams(), b2.q());
            C6025u b3 = b2.b(context);
            this.unifiedAdRequestParams = createUnifiedAdRequestParams(this.adRequestParameters, new TargetingInfoImpl(targetingParams), b3.a());
        }
        return this.unifiedAdRequestParams;
    }

    protected void onBeforeSetDisplayPlacementBuilder(@NonNull Placement.DisplayPlacement.Builder builder) {
    }

    protected void onBeforeSetVideoPlacementBuilder(@NonNull Placement.VideoPlacement.Builder builder) {
    }

    protected void onBuildPlacement(@NonNull Placement.Builder builder) {
    }

    @VisibleForTesting
    String pollUrl() {
        if (this.auctionUrlQueue.isEmpty()) {
            this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
        }
        return this.auctionUrlQueue.poll();
    }

    @VisibleForTesting
    void prepareUrls() {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
    }

    @VisibleForTesting
    void processApiRequestFail(@Nullable BMError bMError) {
        processApiRequestFail(bMError, true);
    }

    @VisibleForTesting
    void processApiRequestLoadedFail(@NonNull ApiRequest.Builder<Request, Response> builder, @Nullable BMError bMError) {
        String poll;
        if (canProcessApiRequestResult()) {
            if (bMError == BMError.BMServerNoFill || (poll = this.auctionUrlQueue.poll()) == null) {
                processApiRequestFail(bMError);
            } else {
                processRequestBuilder(builder, poll);
            }
        }
    }

    @VisibleForTesting
    void processApiRequestSuccess(@NonNull final AdResponse adResponse) {
        if (!canProcessApiRequestResult()) {
            adResponse.detachAdRequest(this);
            return;
        }
        setLoading(false);
        this.isApiRequestCompleted.set(true);
        unsubscribeTimeOut();
        log(new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda12
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$processApiRequestSuccess$10;
                lambda$processApiRequestSuccess$10 = AdRequest.lambda$processApiRequestSuccess$10(AdResponse.this);
                return lambda$processApiRequestSuccess$10;
            }
        });
        setAdResponse(adResponse);
        adResponse.attachAdRequest(this);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestSuccess(this, adResponse.getAuctionResult());
            }
        }
        Iterator it2 = k.b().c().iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestSuccess(this, adResponse.getAuctionResult());
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, false, getAdsType(), adResponse, null);
    }

    protected void processBidPayload(@NonNull ResponsePayload responsePayload) {
        BMError checkBidPayload = checkBidPayload(responsePayload);
        if (checkBidPayload != null) {
            processRequestFail(new BMError(BMError.incorrectContent("BidPayload does not match with AdRequest"), checkBidPayload));
            return;
        }
        Openrtb responseCache = responsePayload.getResponseCache();
        if (responseCache != null && responseCache != Openrtb.getDefaultInstance()) {
            B.a(this.adRequestParameters, obtainNetworkAdUnitManager(), responseCache.getResponse(), new c());
            return;
        }
        String responseCacheUrl = responsePayload.getResponseCacheUrl();
        if (TextUtils.isEmpty(responseCacheUrl) || !Utils.isHttpUrl(responseCacheUrl)) {
            processRequestFail(BMError.incorrectContent("BidPayload does not contain Response or URL"));
        } else {
            retrieveBody(responseCacheUrl);
        }
    }

    void processExpired() {
        log(new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda8
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$processExpired$9;
                lambda$processExpired$9 = AdRequest.lambda$processExpired$9();
                return lambda$processExpired$9;
            }
        });
        this.isRequestExpired.set(true);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestExpired(this);
            }
        }
        Iterator it2 = k.b().c().iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestExpired(this);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequestExpired, false, getAdsType(), this.adResponse, null);
    }

    @VisibleForTesting
    void processRequestBuilder(@NonNull ApiRequest.Builder<Request, Response> builder, @NonNull String str) {
        if (canSendApiRequest()) {
            builder.url(str);
            this.adResponseLoader.a(this.adRequestParameters, obtainNetworkAdUnitManager(), builder, new d(str, builder));
        }
    }

    @VisibleForTesting
    void processRequestFail(@NonNull BMError bMError) {
        processRequestFail(bMError, true);
    }

    void removeInternalListener(@Nullable e eVar) {
        List<e> list = this.internalAdRequestListeners;
        if (list == null || eVar == null) {
            return;
        }
        list.remove(eVar);
    }

    public void removeListener(@Nullable AdRequestListener<SelfType> adRequestListener) {
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list == null || adRequestListener == null) {
            return;
        }
        list.remove(adRequestListener);
    }

    public void request(@NonNull Context context) {
        if (!k.b().s()) {
            processRequestFail(BMError.internal("BidMachine not initialized"));
            return;
        }
        if (isDestroyed()) {
            processRequestFail(BMError.RequestDestroyed);
            return;
        }
        BMError verifyRequest = verifyRequest();
        if (verifyRequest != null) {
            processRequestFail(verifyRequest);
        } else {
            if (isLoading()) {
                return;
            }
            setLoading(true);
            C5889a.a().execute(new b(context.getApplicationContext()));
        }
    }

    @VisibleForTesting
    void retrieveBody(@NonNull String str) {
        processRequestBuilder(new ApiRequest.Builder().setMethod(NetworkRequest.Method.Get).setDataBinder(new ApiRequest.ApiResponseAuctionDataBinder()), str);
    }

    void setAdResponse(@Nullable AdResponse adResponse) {
        this.adResponse = adResponse;
        this.trackingObject.setAdResponse(adResponse);
    }

    void setAuctionUrl(@NonNull String str) {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.add(str);
    }

    @NonNull
    public String toString() {
        return this.tag.toString();
    }

    protected BMError verifyRequest() {
        return null;
    }

    class d implements C5998b.a {
        final /* synthetic */ String a;
        final /* synthetic */ ApiRequest.Builder b;

        d(String str, ApiRequest.Builder builder) {
            this.a = str;
            this.b = builder;
        }

        @Override // io.bidmachine.C5998b.a
        public void a(AdResponse adResponse) {
            AdRequest.this.setAuctionUrl(this.a);
            AdRequest.this.processApiRequestSuccess(adResponse);
        }

        @Override // io.bidmachine.C5998b.a
        public void a(BMError bMError) {
            AdRequest.this.processApiRequestLoadedFail(this.b, bMError);
        }

        @Override // io.bidmachine.C5998b.a
        public void a() {
            AdRequest.this.processApiRequestCancel();
        }
    }

    public void notifyMediationLoss(@Nullable final String str, @Nullable final Double d2) {
        if (isCompleted()) {
            log(new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda6
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$notifyMediationLoss$7;
                    lambda$notifyMediationLoss$7 = AdRequest.lambda$notifyMediationLoss$7(str, d2);
                    return lambda$notifyMediationLoss$7;
                }
            });
            AdResponse adResponse = this.adResponse;
            if (adResponse != null) {
                adResponse.processMediationLoss();
            }
            this.trackingObject.eventFinish(TrackEventType.MediationLoss, getAdsType(), new EventData().setNetworkName(str).setPrice(d2), isDestroyed() ? BMError.RequestDestroyed : isExpired() ? BMError.RequestExpired : null);
        }
    }

    @VisibleForTesting
    void processApiRequestFail(@Nullable BMError bMError, boolean z) {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCompleted.set(true);
            if (bMError == null) {
                bMError = BMError.BMServerNoFill;
            }
            processRequestFail(bMError, z);
        }
    }

    @VisibleForTesting
    void processRequestFail(@NonNull final BMError bMError, boolean z) {
        log(new LazyValue() { // from class: io.bidmachine.AdRequest$$ExternalSyntheticLambda9
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$processRequestFail$11;
                lambda$processRequestFail$11 = AdRequest.lambda$processRequestFail$11(BMError.this);
                return lambda$processRequestFail$11;
            }
        });
        unsubscribeTimeOut();
        if (z) {
            clearNetworkAdUnits();
        }
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestFailed(this, bMError);
            }
        }
        Iterator it2 = k.b().c().iterator();
        while (it2.hasNext()) {
            ((AdRequestListener) it2.next()).onRequestFailed(this, bMError);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, getAdsType(), null, bMError);
    }
}
