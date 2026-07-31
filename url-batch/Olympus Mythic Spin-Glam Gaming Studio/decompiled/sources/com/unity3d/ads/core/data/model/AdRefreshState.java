package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdRefreshState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRefreshState;", "", "<init>", "(Ljava/lang/String;I)V", "REUSE_RELOADED", "REUSE_NO_FILL", "REUSE_ERROR", "REUSE_DURING_RELOAD", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AdRefreshState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdRefreshState[] $VALUES;
    public static final AdRefreshState REUSE_RELOADED = new AdRefreshState("REUSE_RELOADED", 0);
    public static final AdRefreshState REUSE_NO_FILL = new AdRefreshState("REUSE_NO_FILL", 1);
    public static final AdRefreshState REUSE_ERROR = new AdRefreshState("REUSE_ERROR", 2);
    public static final AdRefreshState REUSE_DURING_RELOAD = new AdRefreshState("REUSE_DURING_RELOAD", 3);

    private static final /* synthetic */ AdRefreshState[] $values() {
        return new AdRefreshState[]{REUSE_RELOADED, REUSE_NO_FILL, REUSE_ERROR, REUSE_DURING_RELOAD};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    private AdRefreshState(String str, int i) {
    }

    static {
        AdRefreshState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static AdRefreshState valueOf(String str) {
        return (AdRefreshState) Enum.valueOf(AdRefreshState.class, str);
    }

    public static AdRefreshState[] values() {
        return (AdRefreshState[]) $VALUES.clone();
    }
}
