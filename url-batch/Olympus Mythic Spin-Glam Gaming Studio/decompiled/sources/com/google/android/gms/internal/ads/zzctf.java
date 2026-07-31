package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzctf implements zzcsm {
    private final DeviceTierManager zza;

    zzctf(DeviceTierManager deviceTierManager) {
        this.zza = deviceTierManager;
    }

    @Override // com.google.android.gms.internal.ads.zzcsm
    public final void zza(JSONObject jSONObject) {
        DeviceTierManager.AdvertisedMemoryTier fromValue;
        DeviceTierManager.AvailableProcessorTier fromValue2;
        DeviceTierManager.AvailableMemoryTier fromValue3;
        if (jSONObject.has("AvailableMemoryTier") && (fromValue3 = DeviceTierManager.AvailableMemoryTier.fromValue(jSONObject.optInt("AvailableMemoryTier", -1))) != null) {
            this.zza.setAvailableMemoryTier(fromValue3);
        }
        if (jSONObject.has("AvailableProcessorTier") && (fromValue2 = DeviceTierManager.AvailableProcessorTier.fromValue(jSONObject.optInt("AvailableProcessorTier", -1))) != null) {
            this.zza.setAvailableProcessorTier(fromValue2);
        }
        if (!jSONObject.has("AdvertisedMemoryTier") || (fromValue = DeviceTierManager.AdvertisedMemoryTier.fromValue(jSONObject.optInt("AdvertisedMemoryTier", -1))) == null) {
            return;
        }
        this.zza.setAdvertisedMemoryTier(fromValue);
    }
}
