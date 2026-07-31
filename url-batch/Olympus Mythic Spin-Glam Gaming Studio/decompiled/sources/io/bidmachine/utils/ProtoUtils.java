package io.bidmachine.utils;

import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.EventType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFormat;
import io.bidmachine.BannerAdSize;
import io.bidmachine.MediaAssetType;
import io.bidmachine.TrackEventType;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.sdk.AdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J$\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0017H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0007J2\u0010&\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(H\u0007J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020%H\u0007J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u001a\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010(2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u001e\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J \u0010/\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0014\u00100\u001a\u0004\u0018\u00010\u00012\b\u00101\u001a\u0004\u0018\u000102H\u0007¨\u00063"}, d2 = {"Lio/bidmachine/utils/ProtoUtils;", "", "()V", "addEvent", "", "outMap", "", "Lio/bidmachine/TrackEventType;", "", "", "eventType", "url", "createAdFormatBuilder", "Lio/bidmachine/protobuf/sdk/AdFormat$Builder;", "adFormat", "Lio/bidmachine/AdFormat;", "encodeToString", "messageLite", "Lcom/explorestack/protobuf/MessageLite;", "fillStructWithPrimitiveValues", "structBuilder", "Lcom/explorestack/protobuf/Struct$Builder;", "source", "", "findFirstAdExtension", "Lio/bidmachine/protobuf/AdExtension;", "ad", "Lcom/explorestack/protobuf/adcom/Ad;", "isEmpty", "", "listValue", "Lcom/explorestack/protobuf/ListValue;", "struct", "Lcom/explorestack/protobuf/Struct;", "msToTimestamp", "Lcom/explorestack/protobuf/Timestamp;", "ms", "", "prepareEvents", "events", "", "Lcom/explorestack/protobuf/adcom/Ad$Event;", "secToTimestamp", CampaignEx.JSON_AD_IMP_KEY, "toList", "toListOrNull", "toMap", "toMapOrNull", "toObjectOrNull", "value", "Lcom/explorestack/protobuf/Value;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class ProtoUtils {

    @NotNull
    public static final ProtoUtils INSTANCE = new ProtoUtils();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Value.KindCase.values().length];
            try {
                iArr[Value.KindCase.NUMBER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Value.KindCase.STRING_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Value.KindCase.BOOL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Value.KindCase.STRUCT_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Value.KindCase.LIST_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ProtoUtils() {
    }

    public static final void addEvent(@NotNull Map<TrackEventType, List<String>> outMap, @NotNull TrackEventType eventType, @Nullable String url) {
        Intrinsics.checkNotNullParameter(outMap, "outMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (url == null || url.length() == 0) {
            return;
        }
        List<String> list = outMap.get(eventType);
        if (list == null) {
            list = new ArrayList<>(1);
            outMap.put(eventType, list);
        }
        list.add(url);
    }

    @NotNull
    public static final AdFormat.Builder createAdFormatBuilder(@NotNull io.bidmachine.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AdFormat.Builder builder = AdFormat.newBuilder();
        if (adFormat instanceof AdFormat.Banner) {
            BannerAdSize bannerAdSize = ((AdFormat.Banner) adFormat).getBannerAdSize();
            builder.setBanner(AdFormat.Banner.newBuilder().setWidth(bannerAdSize.getWidth()).setHeight(bannerAdSize.getHeight()).setIsAdaptive(bannerAdSize.getIsAdaptive()).build());
        } else {
            if (adFormat instanceof AdFormat.Interstitial) {
                AdContentType adContentType = ((AdFormat.Interstitial) adFormat).getAdContentType();
                boolean z = adContentType == AdContentType.All;
                builder.setInterstitial(AdFormat.Interstitial.newBuilder().setHasBanner(z || adContentType == AdContentType.Static).setHasVideo(z || adContentType == AdContentType.Video).build());
            } else if (adFormat instanceof AdFormat.Rewarded) {
                AdContentType adContentType2 = ((AdFormat.Rewarded) adFormat).getAdContentType();
                boolean z2 = adContentType2 == AdContentType.All;
                builder.setRewarded(AdFormat.Rewarded.newBuilder().setHasBanner(z2 || adContentType2 == AdContentType.Static).setHasVideo(z2 || adContentType2 == AdContentType.Video).build());
            } else if (adFormat instanceof AdFormat.Native) {
                List<MediaAssetType> mediaAssetTypes = ((AdFormat.Native) adFormat).getMediaAssetTypes();
                boolean isAll = MediaAssetType.isAll(mediaAssetTypes);
                builder.setNative(AdFormat.Native.newBuilder().setHasVideo(isAll || mediaAssetTypes.contains(MediaAssetType.Video)).setHasIcon(isAll || mediaAssetTypes.contains(MediaAssetType.Icon)).setHasImage(isAll || mediaAssetTypes.contains(MediaAssetType.Image)).build());
            }
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    @Nullable
    public static final String encodeToString(@Nullable MessageLite messageLite) {
        Object m8023constructorimpl;
        if (messageLite == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Base64.encodeToString(messageLite.toByteArray(), 2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    public static final void fillStructWithPrimitiveValues(@NotNull Struct.Builder structBuilder, @NotNull Map<String, ? extends Object> source) {
        Intrinsics.checkNotNullParameter(structBuilder, "structBuilder");
        Intrinsics.checkNotNullParameter(source, "source");
        for (Map.Entry<String, ? extends Object> entry : source.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                structBuilder.putFields(key, Value.newBuilder().setStringValue((String) value).build());
            } else if (value instanceof Boolean) {
                structBuilder.putFields(key, Value.newBuilder().setBoolValue(((Boolean) value).booleanValue()).build());
            } else if (value instanceof Number) {
                structBuilder.putFields(key, Value.newBuilder().setNumberValue(((Number) value).doubleValue()).build());
            }
        }
    }

    @Nullable
    public static final AdExtension findFirstAdExtension(@NotNull Ad ad) {
        Any extProto;
        Intrinsics.checkNotNullParameter(ad, "ad");
        int extProtoCount = ad.getExtProtoCount();
        for (int i = 0; i < extProtoCount; i++) {
            try {
                extProto = ad.getExtProto(i);
            } catch (Throwable th) {
                Logger.w(th);
            }
            if (extProto.is(AdExtension.class)) {
                return (AdExtension) extProto.unpack(AdExtension.class);
            }
            continue;
        }
        return null;
    }

    public static final boolean isEmpty(@Nullable Struct struct) {
        return struct == null || struct.getFieldsCount() <= 0;
    }

    @NotNull
    public static final Timestamp msToTimestamp(long ms) {
        long j = 1000;
        Timestamp build = Timestamp.newBuilder().setSeconds(ms / j).setNanos(((int) (ms % j)) * 1000000).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …000)\n            .build()");
        return build;
    }

    public static final void prepareEvents(@NotNull Map<TrackEventType, List<String>> outMap, @Nullable List<Ad.Event> events) {
        Intrinsics.checkNotNullParameter(outMap, "outMap");
        if (events == null || events.isEmpty()) {
            return;
        }
        for (Ad.Event event : events) {
            TrackEventType fromNumber = event.getType() == EventType.EVENT_TYPE_IMPRESSION ? TrackEventType.Show : TrackEventType.fromNumber(event.getTypeValue());
            if (fromNumber != null) {
                addEvent(outMap, fromNumber, event.getUrl());
            }
        }
    }

    @NotNull
    public static final Timestamp secToTimestamp(long sec) {
        Timestamp build = Timestamp.newBuilder().setSeconds(sec).setNanos(0).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …s(0)\n            .build()");
        return build;
    }

    @NotNull
    public static final List<Object> toList(@Nullable ListValue listValue) {
        List<Object> listOrNull = toListOrNull(listValue);
        return listOrNull == null ? new ArrayList() : listOrNull;
    }

    @Nullable
    public static final List<Object> toListOrNull(@Nullable ListValue listValue) {
        if (isEmpty(listValue)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(listValue);
        List<Value> valuesList = listValue.getValuesList();
        Intrinsics.checkNotNullExpressionValue(valuesList, "listValue!!.valuesList");
        Iterator<T> it = valuesList.iterator();
        while (it.hasNext()) {
            Object objectOrNull = toObjectOrNull((Value) it.next());
            if (objectOrNull != null) {
                arrayList.add(objectOrNull);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> toMap(@Nullable Struct struct) {
        Map<String, Object> mapOrNull = toMapOrNull(struct);
        return mapOrNull == null ? new HashMap() : mapOrNull;
    }

    @Nullable
    public static final Map<String, Object> toMapOrNull(@Nullable Struct struct) {
        Object objectOrNull;
        if (isEmpty(struct)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Intrinsics.checkNotNull(struct);
        Map<String, Value> fieldsMap = struct.getFieldsMap();
        Intrinsics.checkNotNullExpressionValue(fieldsMap, "struct!!.fieldsMap");
        for (Map.Entry<String, Value> entry : fieldsMap.entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (key.length() != 0 && (objectOrNull = toObjectOrNull(value)) != null) {
                hashMap.put(key, objectOrNull);
            }
        }
        return hashMap;
    }

    @Nullable
    public static final Object toObjectOrNull(@Nullable Value value) {
        if (value == null) {
            return null;
        }
        Value.KindCase kindCase = value.getKindCase();
        int i = kindCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kindCase.ordinal()];
        if (i == 1) {
            return Double.valueOf(value.getNumberValue());
        }
        if (i == 2) {
            return value.getStringValue();
        }
        if (i == 3) {
            return Boolean.valueOf(value.getBoolValue());
        }
        if (i == 4) {
            return toMapOrNull(value.getStructValue());
        }
        if (i != 5) {
            return null;
        }
        return toListOrNull(value.getListValue());
    }

    public static final boolean isEmpty(@Nullable ListValue listValue) {
        return listValue == null || listValue.getValuesCount() <= 0;
    }
}
