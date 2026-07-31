package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheSource;", "", "<init>", "(Ljava/lang/String;I)V", "LOCAL", "REMOTE", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CacheSource[] $VALUES;
    public static final CacheSource LOCAL = new CacheSource("LOCAL", 0);
    public static final CacheSource REMOTE = new CacheSource("REMOTE", 1);

    private static final /* synthetic */ CacheSource[] $values() {
        return new CacheSource[]{LOCAL, REMOTE};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    private CacheSource(String str, int i) {
    }

    static {
        CacheSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static CacheSource valueOf(String str) {
        return (CacheSource) Enum.valueOf(CacheSource.class, str);
    }

    public static CacheSource[] values() {
        return (CacheSource[]) $VALUES.clone();
    }
}
