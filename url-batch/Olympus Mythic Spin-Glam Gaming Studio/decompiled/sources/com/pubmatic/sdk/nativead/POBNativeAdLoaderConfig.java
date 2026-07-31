package com.pubmatic.sdk.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeContextSubType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeContextType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativePlacementType;

/* loaded from: classes5.dex */
public class POBNativeAdLoaderConfig {
    private POBNativeContextType a = null;
    private POBNativeContextSubType b = null;
    private POBNativePlacementType c = null;

    @Nullable
    public POBNativeContextSubType getContextSubType() {
        return this.b;
    }

    @Nullable
    public POBNativeContextType getContextType() {
        return this.a;
    }

    @Nullable
    public POBNativePlacementType getPlacementType() {
        return this.c;
    }

    public void setContextSubType(@NonNull POBNativeContextSubType pOBNativeContextSubType) {
        this.b = pOBNativeContextSubType;
    }

    public void setContextType(@NonNull POBNativeContextType pOBNativeContextType) {
        this.a = pOBNativeContextType;
    }

    public void setPlacementType(@NonNull POBNativePlacementType pOBNativePlacementType) {
        this.c = pOBNativePlacementType;
    }
}
