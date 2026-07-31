package com.vungle.ads.fpd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0007¢\u0006\u0004\b \u0010!Bo\b\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0001\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b \u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0007R\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "debug", "clearAll", "Lcom/vungle/ads/fpd/SessionContext;", "getSessionContext", "()Lcom/vungle/ads/fpd/SessionContext;", "sessionContext", "Lcom/vungle/ads/fpd/Demographic;", "getDemographic", "()Lcom/vungle/ads/fpd/Demographic;", "demographic", "Lcom/vungle/ads/fpd/Location;", "getLocation", "()Lcom/vungle/ads/fpd/Location;", "location", "Lcom/vungle/ads/fpd/Revenue;", "getRevenue", "()Lcom/vungle/ads/fpd/Revenue;", "revenue", "", "getCustomData", "()Ljava/util/Map;", "customData", "<init>", "()V", "", "seen1", "modelVersion", "_sessionContext", "_demographic", "_location", "_revenue", "_customData", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/fpd/SessionContext;Lcom/vungle/ads/fpd/Demographic;Lcom/vungle/ads/fpd/Location;Lcom/vungle/ads/fpd/Revenue;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@Serializable
/* loaded from: classes8.dex */
public final class FirstPartyData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final Json g = JsonKt.Json$default(null, new Function1() { // from class: com.vungle.ads.fpd.FirstPartyData$Companion$JSON$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JsonBuilder) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setPrettyPrint(true);
            Json.setExplicitNulls(false);
            Json.setEncodeDefaults(false);
        }
    }, 1, null);
    public final String a;
    public volatile SessionContext b;
    public volatile Demographic c;
    public volatile Location d;
    public volatile Revenue e;
    public Map f;

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/FirstPartyData;", "serializer", "Lkotlinx/serialization/json/Json;", "JSON", "Lkotlinx/serialization/json/Json;", "", "MODEL_VERSION", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }
    }

    public FirstPartyData() {
        this.a = "2.0";
    }

    public static final void write$Self(@NotNull FirstPartyData self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.a, "2.0")) {
            output.encodeStringElement(serialDesc, 0, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SessionContext$$serializer.INSTANCE, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Demographic$$serializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, Location$$serializer.INSTANCE, self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.e != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, Revenue$$serializer.INSTANCE, self.e);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.f == null) {
            return;
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.f);
    }

    public final synchronized void clearAll() {
        try {
            this.b = null;
            this.c = null;
            this.e = null;
            this.d = null;
            Map map = this.f;
            if (map != null) {
                map.clear();
            }
            this.f = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final String debug() {
        Json json = g;
        KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(FirstPartyData.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.encodeToString(serializer, this);
    }

    @NotNull
    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> map;
        map = this.f;
        if (map == null) {
            map = new ConcurrentHashMap<>();
            this.f = map;
        }
        return map;
    }

    @NotNull
    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this.c;
        if (demographic == null) {
            demographic = new Demographic();
            this.c = demographic;
        }
        return demographic;
    }

    @NotNull
    public final synchronized Location getLocation() {
        Location location;
        location = this.d;
        if (location == null) {
            location = new Location();
            this.d = location;
        }
        return location;
    }

    @NotNull
    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this.e;
        if (revenue == null) {
            revenue = new Revenue();
            this.e = revenue;
        }
        return revenue;
    }

    @NotNull
    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this.b;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this.b = sessionContext;
        }
        return sessionContext;
    }

    @Deprecated
    public /* synthetic */ FirstPartyData(int i, String str, SessionContext sessionContext, Demographic demographic, Location location, Revenue revenue, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.a = (i & 1) == 0 ? "2.0" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sessionContext;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = demographic;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = location;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = revenue;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map;
        }
    }
}
