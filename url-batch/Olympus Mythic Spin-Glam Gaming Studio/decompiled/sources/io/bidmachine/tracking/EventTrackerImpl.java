package io.bidmachine.tracking;

import com.explorestack.protobuf.Struct;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.TrackEventType;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.core.TimeManager;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.ProtoUtilsKt;
import io.bidmachine.utils.lazy.LazyValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0013\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J@\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016Ji\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010$J\f\u0010%\u001a\u00020&*\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lio/bidmachine/tracking/EventTrackerImpl;", "Lio/bidmachine/tracking/EventTracker;", "()V", "defaultEventConfiguration", "Lio/bidmachine/protobuf/AdExtension$EventConfiguration;", "(Lio/bidmachine/protobuf/AdExtension$EventConfiguration;)V", "setDefaultEventConfiguration", "", "trackEvent", "trackingObject", "Lio/bidmachine/tracking/TrackingObject;", "trackEventType", "Lio/bidmachine/TrackEventType;", "trackEventInfo", "Lio/bidmachine/tracking/TrackEventInfo;", "adsType", "Lio/bidmachine/AdsType;", "bmError", "Lio/bidmachine/utils/BMError;", "eventData", "Lio/bidmachine/tracking/EventData;", "trySendEvent", "", "eventConfiguration", "action", "", "isBillable", "startTimeMs", "", "finishTimeMs", "networkName", "", "price", "", "customParams", "Lcom/explorestack/protobuf/Struct;", "(Lio/bidmachine/protobuf/AdExtension$EventConfiguration;IZJJLio/bidmachine/AdsType;Ljava/lang/String;Ljava/lang/Double;Lcom/explorestack/protobuf/Struct;Lio/bidmachine/utils/BMError;)Z", "toErrorData", "Lio/bidmachine/protobuf/sdk/Error$Data;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public class EventTrackerImpl implements EventTracker {

    @Nullable
    private AdExtension.EventConfiguration defaultEventConfiguration;

    public EventTrackerImpl() {
        this(null);
    }

    private final Error.Data toErrorData(BMError bMError) {
        Error.Data build = Error.Data.newBuilder().setCode(bMError.getCode()).setDescription(bMError.getMessage()).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …age)\n            .build()");
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r4.setPrice(r13.doubleValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean trySendEvent(AdExtension.EventConfiguration eventConfiguration, final int action, boolean isBillable, long startTimeMs, long finishTimeMs, AdsType adsType, String networkName, Double price, Struct customParams, final BMError bmError) {
        String url;
        if (eventConfiguration != null) {
            try {
                if (eventConfiguration.getActionsList().contains(Integer.valueOf(action)) && (url = eventConfiguration.getUrl()) != null && url.length() != 0) {
                    if (bmError == null) {
                        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.tracking.EventTrackerImpl$$ExternalSyntheticLambda0
                            @Override // io.bidmachine.utils.lazy.LazyValue
                            public final Object get() {
                                String trySendEvent$lambda$0;
                                trySendEvent$lambda$0 = EventTrackerImpl.trySendEvent$lambda$0(action);
                                return trySendEvent$lambda$0;
                            }
                        });
                    } else {
                        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.tracking.EventTrackerImpl$$ExternalSyntheticLambda1
                            @Override // io.bidmachine.utils.lazy.LazyValue
                            public final Object get() {
                                String trySendEvent$lambda$1;
                                trySendEvent$lambda$1 = EventTrackerImpl.trySendEvent$lambda$1(action, bmError);
                                return trySendEvent$lambda$1;
                            }
                        });
                    }
                    SDKEvent.Builder finishTime = SDKEvent.newBuilder().setAction(action).setBillable(isBillable).setContext(eventConfiguration.getContext()).setStartTime(ProtoUtils.msToTimestamp(startTimeMs)).setFinishTime(ProtoUtils.msToTimestamp(finishTimeMs));
                    if (adsType != null) {
                        finishTime.setAdType(ProtoUtilsKt.toProtoStringValue(adsType.name()));
                    }
                    if (networkName != null && networkName.length() != 0) {
                        finishTime.setNetwork(ProtoUtilsKt.toProtoStringValue(networkName));
                    }
                    if (customParams != null) {
                        finishTime.setCustomParams(customParams);
                    }
                    if (bmError != null) {
                        Error.Builder error = Error.newBuilder().setError(toErrorData(bmError));
                        Intrinsics.checkNotNullExpressionValue(error, "newBuilder()\n           …or(bmError.toErrorData())");
                        BMError errorExtension = bmError.getErrorExtension();
                        if (errorExtension != null) {
                            error.setReason(toErrorData(errorExtension));
                        }
                        finishTime.setError(error);
                    }
                    new ApiRequest.Builder().url(url).setMethod(NetworkRequest.Method.Post).setDataBinder(new ApiRequest.ApiEventDataBinder()).setRequestData(finishTime.build()).request();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trySendEvent$lambda$0(int i) {
        return "Sending event to server - " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trySendEvent$lambda$1(int i, BMError bMError) {
        return "Sending error event to server - " + i + ", error - " + bMError;
    }

    public final void setDefaultEventConfiguration(@Nullable AdExtension.EventConfiguration defaultEventConfiguration) {
        if (defaultEventConfiguration == AdExtension.EventConfiguration.getDefaultInstance()) {
            defaultEventConfiguration = null;
        }
        this.defaultEventConfiguration = defaultEventConfiguration;
    }

    @Override // io.bidmachine.tracking.EventTracker
    public void trackEvent(@NotNull TrackingObject trackingObject, @NotNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo, @Nullable AdsType adsType, @Nullable BMError bmError, @Nullable EventData eventData) {
        long currentTimeMillis;
        long j;
        String str;
        Double d;
        Struct struct;
        boolean z;
        Intrinsics.checkNotNullParameter(trackingObject, "trackingObject");
        Intrinsics.checkNotNullParameter(trackEventType, "trackEventType");
        if (bmError == null || bmError.isTrackError()) {
            if (trackEventInfo != null) {
                currentTimeMillis = trackEventInfo.getStartTimeMs();
                j = trackEventInfo.getFinishTimeMs();
            } else {
                currentTimeMillis = TimeManager.currentTimeMillis();
                j = currentTimeMillis;
            }
            if (eventData != null) {
                z = eventData.getIsBillable();
                str = eventData.getNetworkName();
                d = eventData.getPrice();
                struct = eventData.getCustomParams();
            } else {
                str = null;
                d = null;
                struct = null;
                z = false;
            }
            int actionValue = trackEventType.getActionValue();
            if (trySendEvent(trackingObject.getEventConfiguration(), actionValue, z, currentTimeMillis, j, adsType, str, d, struct, bmError)) {
                return;
            }
            trySendEvent(this.defaultEventConfiguration, actionValue, z, currentTimeMillis, j, adsType, str, d, struct, bmError);
        }
    }

    public EventTrackerImpl(@Nullable AdExtension.EventConfiguration eventConfiguration) {
        setDefaultEventConfiguration(eventConfiguration);
    }

    public /* synthetic */ EventTrackerImpl(AdExtension.EventConfiguration eventConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eventConfiguration);
    }
}
