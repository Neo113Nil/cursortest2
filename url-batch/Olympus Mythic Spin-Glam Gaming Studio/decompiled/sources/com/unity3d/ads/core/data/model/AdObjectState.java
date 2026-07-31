package com.unity3d.ads.core.data.model;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdObject.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObjectState;", "", "<init>", "(Ljava/lang/String;I)V", "INIT", POBOMSDKLogConstants.MSG_OMSDK_LOADED_EVENT, "SHOWING", "EXPIRED", "COMPLETED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AdObjectState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdObjectState[] $VALUES;
    public static final AdObjectState INIT = new AdObjectState("INIT", 0);
    public static final AdObjectState LOADED = new AdObjectState(POBOMSDKLogConstants.MSG_OMSDK_LOADED_EVENT, 1);
    public static final AdObjectState SHOWING = new AdObjectState("SHOWING", 2);
    public static final AdObjectState EXPIRED = new AdObjectState("EXPIRED", 3);
    public static final AdObjectState COMPLETED = new AdObjectState("COMPLETED", 4);

    private static final /* synthetic */ AdObjectState[] $values() {
        return new AdObjectState[]{INIT, LOADED, SHOWING, EXPIRED, COMPLETED};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    private AdObjectState(String str, int i) {
    }

    static {
        AdObjectState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static AdObjectState valueOf(String str) {
        return (AdObjectState) Enum.valueOf(AdObjectState.class, str);
    }

    public static AdObjectState[] values() {
        return (AdObjectState[]) $VALUES.clone();
    }
}
