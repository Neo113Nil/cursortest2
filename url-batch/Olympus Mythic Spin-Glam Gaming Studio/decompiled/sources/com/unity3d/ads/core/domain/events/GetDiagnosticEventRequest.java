package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticTagKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetDiagnosticEventRequest.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0094\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0086\u0002¢\u0006\u0002\u0010\u001dJ:\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0010H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "<init>", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;)V", "uniqueId", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "invoke", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "diagnosticEventType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "customEventName", "", "tags", "", "intTags", "value", "", CampaignEx.JSON_KEY_HB, "", "opportunityId", "Lcom/google/protobuf/ByteString;", "placement", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "tokenNumber", "errorToken", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Ljava/lang/Integer;Lcom/google/protobuf/ByteString;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "getTags", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;", "getTag", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;", "tagString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetDiagnosticEventRequest {

    @NotNull
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    @NotNull
    private final MutableStateFlow uniqueId;

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, @Nullable String customEventName, @Nullable Map<String, String> tags, @Nullable Map<String, Integer> intTags, @Nullable Double value, @Nullable Boolean hb, @Nullable ByteString opportunityId, @Nullable String placement, @Nullable DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @Nullable Integer tokenNumber, @Nullable ByteString errorToken) {
        Object value2;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(diagnosticEventType, "diagnosticEventType");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.INSTANCE;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        DiagnosticEventKt.Dsl _create = companion._create(newBuilder);
        Map<String, String> mutableMap = tags != null ? MapsKt.toMutableMap(tags) : null;
        String remove = mutableMap != null ? mutableMap.remove("reason") : null;
        String remove2 = mutableMap != null ? mutableMap.remove("reason_debug") : null;
        MutableStateFlow mutableStateFlow = this.uniqueId;
        do {
            value2 = mutableStateFlow.getValue();
            valueOf = Integer.valueOf(((Number) value2).intValue() + 1);
        } while (!mutableStateFlow.compareAndSet(value2, valueOf));
        _create.setEventId(valueOf.intValue());
        _create.setEventType(diagnosticEventType);
        if (customEventName != null) {
            _create.setCustomEventType(customEventName);
        }
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        if (value != null) {
            _create.setTimeValue(value.doubleValue());
        }
        if (hb != null) {
            _create.setIsHeaderBidding(hb.booleanValue());
        }
        if (opportunityId != null) {
            _create.setImpressionOpportunityId(opportunityId);
        }
        if (placement != null) {
            _create.setPlacementId(placement);
        }
        if (adType != null) {
            _create.setAdType(adType);
        }
        if (tokenNumber != null) {
            _create.setHeaderBiddingTokenNumber(tokenNumber.intValue());
        }
        if (remove != null) {
            _create.setReason(remove);
        }
        if (remove2 != null) {
            _create.setReasonDebug(remove2);
        }
        if (errorToken != null) {
            _create.setErrorToken(errorToken);
        }
        _create.addAllTags(_create.getTags(), getTags(mutableMap, intTags));
        return _create._build();
    }

    public GetDiagnosticEventRequest(@NotNull GetSharedDataTimestamps getSharedDataTimestamps) {
        Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = StateFlowKt.MutableStateFlow(-1);
    }

    private final List<DiagnosticEventRequestOuterClass.DiagnosticTag> getTags(Map<String, String> tags, Map<String, Integer> intTags) {
        ArrayList arrayList = new ArrayList();
        if (tags != null) {
            ArrayList arrayList2 = new ArrayList(tags.size());
            for (Map.Entry<String, String> entry : tags.entrySet()) {
                DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.INSTANCE;
                DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                DiagnosticTagKt.Dsl _create = companion._create(newBuilder);
                DiagnosticEventRequestOuterClass.DiagnosticTagType tag = getTag(entry.getKey());
                _create.setType(tag);
                if (tag == DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM) {
                    _create.setCustomTagType(entry.getKey());
                }
                _create.setStringValue(entry.getValue());
                arrayList2.add(_create._build());
            }
            arrayList.addAll(arrayList2);
        }
        if (intTags != null) {
            ArrayList arrayList3 = new ArrayList(intTags.size());
            for (Map.Entry<String, Integer> entry2 : intTags.entrySet()) {
                DiagnosticTagKt.Dsl.Companion companion2 = DiagnosticTagKt.Dsl.INSTANCE;
                DiagnosticEventRequestOuterClass.DiagnosticTag.Builder newBuilder2 = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
                DiagnosticTagKt.Dsl _create2 = companion2._create(newBuilder2);
                DiagnosticEventRequestOuterClass.DiagnosticTagType tag2 = getTag(entry2.getKey());
                _create2.setType(tag2);
                if (tag2 == DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM) {
                    _create2.setCustomTagType(entry2.getKey());
                }
                _create2.setIntValue(entry2.getValue().intValue());
                arrayList3.add(_create2._build());
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DiagnosticEventRequestOuterClass.DiagnosticTagType getTag(String tagString) {
        switch (tagString.hashCode()) {
            case -2140823688:
                if (tagString.equals("cache_source")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CACHE;
                }
                break;
            case -989163880:
                if (tagString.equals("protocol")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_PROTOCOL;
                }
                break;
            case -896505829:
                if (tagString.equals("source")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_SOURCE;
                }
                break;
            case 116079:
                if (tagString.equals("url")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_HOST;
                }
                break;
            case 109757585:
                if (tagString.equals("state")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_STATE;
                }
                break;
            case 123374419:
                if (tagString.equals("is_retry")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_IS_RETRY;
                }
                break;
            case 1439091211:
                if (tagString.equals("complete_state")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_COMPLETE_STATE;
                }
                break;
            case 2105542229:
                if (tagString.equals("size_kb")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_SIZE_KB;
                }
                break;
        }
        return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM;
    }
}
