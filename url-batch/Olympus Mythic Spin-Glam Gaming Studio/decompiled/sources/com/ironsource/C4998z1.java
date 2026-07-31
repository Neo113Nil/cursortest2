package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4998z1 {

    @NotNull
    private final Map<LevelPlay.AdFormat, C4831q> a;

    public C4998z1(@NotNull JSONObject applicationAuctionSettings) {
        Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = applicationAuctionSettings.optJSONObject(Jf.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = IronSourceNetworkBridge.jsonObjectInit();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C4831q(optJSONObject));
        }
        this.a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4831q> a() {
        return this.a;
    }
}
