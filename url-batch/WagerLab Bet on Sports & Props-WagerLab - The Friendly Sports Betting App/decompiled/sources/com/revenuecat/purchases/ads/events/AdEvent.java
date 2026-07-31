package com.revenuecat.purchases.ads.events;

import com.revenuecat.purchases.common.events.FeatureEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdEvent.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u001d\u001e\u001f !R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0018\u0010\u000e\u001a\u00020\u000fX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R\u0012\u0010\u0011\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0005\"#$%&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "adUnitId", "", "getAdUnitId", "()Ljava/lang/String;", "eventVersion", "", "getEventVersion", "()I", "id", "getId", "impressionId", "getImpressionId", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "getMediatorName-GyoM_N4", "networkName", "getNetworkName", "placement", "getPlacement", "timestamp", "", "getTimestamp", "()J", "type", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "Displayed", "FailedToLoad", "Loaded", "Open", "Revenue", "Lcom/revenuecat/purchases/ads/events/AdEvent$Displayed;", "Lcom/revenuecat/purchases/ads/events/AdEvent$FailedToLoad;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Loaded;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Open;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Revenue;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AdEvent extends FeatureEvent {
    String getAdUnitId();

    int getEventVersion();

    String getId();

    String getImpressionId();

    /* renamed from: getMediatorName-GyoM_N4, reason: not valid java name */
    String getMediatorName();

    String getNetworkName();

    String getPlacement();

    long getTimestamp();

    AdEventType getType();

    /* compiled from: AdEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u000b\u001a\u00020\fX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$Displayed;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "id", "", "eventVersion", "", "type", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "timestamp", "", "networkName", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "placement", "adUnitId", "impressionId", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdUnitId", "()Ljava/lang/String;", "getEventVersion", "()I", "getId", "getImpressionId", "getMediatorName-GyoM_N4", "Ljava/lang/String;", "getNetworkName", "getPlacement", "getTimestamp", "()J", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Displayed implements AdEvent {
        private final String adUnitId;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Displayed(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6);
        }

        private Displayed(String id, int i, AdEventType type, long j, String networkName, String mediatorName, String str, String adUnitId, String impressionId) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            this.id = id;
            this.eventVersion = i;
            this.type = type;
            this.timestamp = j;
            this.networkName = networkName;
            this.mediatorName = mediatorName;
            this.placement = str;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Displayed(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.DISPLAYED : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, str6, null);
            if ((i2 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }
    }

    /* compiled from: AdEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u000b\u001a\u00020\fX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$Open;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "id", "", "eventVersion", "", "type", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "timestamp", "", "networkName", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "placement", "adUnitId", "impressionId", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdUnitId", "()Ljava/lang/String;", "getEventVersion", "()I", "getId", "getImpressionId", "getMediatorName-GyoM_N4", "Ljava/lang/String;", "getNetworkName", "getPlacement", "getTimestamp", "()J", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Open implements AdEvent {
        private final String adUnitId;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Open(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6);
        }

        private Open(String id, int i, AdEventType type, long j, String networkName, String mediatorName, String str, String adUnitId, String impressionId) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            this.id = id;
            this.eventVersion = i;
            this.type = type;
            this.timestamp = j;
            this.networkName = networkName;
            this.mediatorName = mediatorName;
            this.placement = str;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Open(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.OPENED : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, str6, null);
            if ((i2 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }
    }

    /* compiled from: AdEvent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u000b\u001a\u00020\fX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$Revenue;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "id", "", "eventVersion", "", "type", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "timestamp", "", "networkName", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "placement", "adUnitId", "impressionId", "revenueMicros", "currency", "precision", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdUnitId", "()Ljava/lang/String;", "getCurrency", "getEventVersion", "()I", "getId", "getImpressionId", "getMediatorName-GyoM_N4", "Ljava/lang/String;", "getNetworkName", "getPlacement", "getPrecision-rAcPn4k", "getRevenueMicros", "()J", "getTimestamp", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Revenue implements AdEvent {
        private final String adUnitId;
        private final String currency;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final String precision;
        private final long revenueMicros;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Revenue(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, long j2, String str7, String str8, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6, j2, str7, str8);
        }

        private Revenue(String id, int i, AdEventType type, long j, String networkName, String mediatorName, String str, String adUnitId, String impressionId, long j2, String currency, String precision) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(precision, "precision");
            this.id = id;
            this.eventVersion = i;
            this.type = type;
            this.timestamp = j;
            this.networkName = networkName;
            this.mediatorName = mediatorName;
            this.placement = str;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.revenueMicros = j2;
            this.currency = currency;
            this.precision = precision;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Revenue(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, long j2, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(r3, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.REVENUE : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, str6, j2, str7, str8, null);
            String str9;
            if ((i2 & 1) != 0) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                str9 = uuid;
            } else {
                str9 = str;
            }
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        public final long getRevenueMicros() {
            return this.revenueMicros;
        }

        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: getPrecision-rAcPn4k, reason: not valid java name and from getter */
        public final String getPrecision() {
            return this.precision;
        }
    }

    /* compiled from: AdEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u000b\u001a\u00020\fX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$Loaded;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "id", "", "eventVersion", "", "type", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "timestamp", "", "networkName", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "placement", "adUnitId", "impressionId", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdUnitId", "()Ljava/lang/String;", "getEventVersion", "()I", "getId", "getImpressionId", "getMediatorName-GyoM_N4", "Ljava/lang/String;", "getNetworkName", "getPlacement", "getTimestamp", "()J", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Loaded implements AdEvent {
        private final String adUnitId;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ Loaded(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6);
        }

        private Loaded(String id, int i, AdEventType type, long j, String networkName, String mediatorName, String str, String adUnitId, String impressionId) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            Intrinsics.checkNotNullParameter(impressionId, "impressionId");
            this.id = id;
            this.eventVersion = i;
            this.type = type;
            this.timestamp = j;
            this.networkName = networkName;
            this.mediatorName = mediatorName;
            this.placement = str;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Loaded(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.LOADED : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, str6, null);
            if ((i2 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }
    }

    /* compiled from: AdEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\fX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$FailedToLoad;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "id", "", "eventVersion", "", "type", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "timestamp", "", "networkName", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "placement", "adUnitId", "impressionId", "mediatorErrorCode", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdUnitId", "()Ljava/lang/String;", "getEventVersion", "()I", "getId", "getImpressionId", "getMediatorErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediatorName-GyoM_N4", "Ljava/lang/String;", "getNetworkName", "getPlacement", "getTimestamp", "()J", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FailedToLoad implements AdEvent {
        private final String adUnitId;
        private final int eventVersion;
        private final String id;
        private final String impressionId;
        private final Integer mediatorErrorCode;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final long timestamp;
        private final AdEventType type;

        public /* synthetic */ FailedToLoad(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, adEventType, j, str2, str3, str4, str5, str6, num);
        }

        private FailedToLoad(String id, int i, AdEventType type, long j, String networkName, String mediatorName, String str, String adUnitId, String str2, Integer num) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.id = id;
            this.eventVersion = i;
            this.type = type;
            this.timestamp = j;
            this.networkName = networkName;
            this.mediatorName = mediatorName;
            this.placement = str;
            this.adUnitId = adUnitId;
            this.impressionId = str2;
            this.mediatorErrorCode = num;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ FailedToLoad(String str, int i, AdEventType adEventType, long j, String str2, String str3, String str4, String str5, String str6, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(r4, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? AdEventType.FAILED_TO_LOAD : adEventType, (i2 & 8) != 0 ? System.currentTimeMillis() : j, str2, str3, str4, str5, (i2 & 256) != 0 ? null : str6, num, null);
            String str7;
            if ((i2 & 1) != 0) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                str7 = uuid;
            } else {
                str7 = str;
            }
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public AdEventType getType() {
            return this.type;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public String getImpressionId() {
            return this.impressionId;
        }

        public final Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }
    }
}
