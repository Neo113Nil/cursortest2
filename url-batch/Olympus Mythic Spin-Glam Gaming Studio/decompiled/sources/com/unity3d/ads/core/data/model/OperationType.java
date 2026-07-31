package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OperationType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/model/OperationType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "INITIALIZATION", "LOAD", "LOAD_HEADER_BIDDING", "SHOW", "REFRESH", "PRIVACY_UPDATE", "INITIALIZATION_COMPLETED", "TRANSACTION_EVENT", "AD_REVENUE_EVENT", "LIFECYCLE_EVENT", "GET_TOKEN", "DIAGNOSTIC_EVENT", "OPERATIVE_EVENT", "UNIVERSAL_EVENT", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OperationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OperationType[] $VALUES;
    public static final OperationType UNKNOWN = new OperationType("UNKNOWN", 0);
    public static final OperationType INITIALIZATION = new OperationType("INITIALIZATION", 1);
    public static final OperationType LOAD = new OperationType("LOAD", 2);
    public static final OperationType LOAD_HEADER_BIDDING = new OperationType("LOAD_HEADER_BIDDING", 3);
    public static final OperationType SHOW = new OperationType("SHOW", 4);
    public static final OperationType REFRESH = new OperationType("REFRESH", 5);
    public static final OperationType PRIVACY_UPDATE = new OperationType("PRIVACY_UPDATE", 6);
    public static final OperationType INITIALIZATION_COMPLETED = new OperationType("INITIALIZATION_COMPLETED", 7);
    public static final OperationType TRANSACTION_EVENT = new OperationType("TRANSACTION_EVENT", 8);
    public static final OperationType AD_REVENUE_EVENT = new OperationType("AD_REVENUE_EVENT", 9);
    public static final OperationType LIFECYCLE_EVENT = new OperationType("LIFECYCLE_EVENT", 10);
    public static final OperationType GET_TOKEN = new OperationType("GET_TOKEN", 11);
    public static final OperationType DIAGNOSTIC_EVENT = new OperationType("DIAGNOSTIC_EVENT", 12);
    public static final OperationType OPERATIVE_EVENT = new OperationType("OPERATIVE_EVENT", 13);
    public static final OperationType UNIVERSAL_EVENT = new OperationType("UNIVERSAL_EVENT", 14);

    private static final /* synthetic */ OperationType[] $values() {
        return new OperationType[]{UNKNOWN, INITIALIZATION, LOAD, LOAD_HEADER_BIDDING, SHOW, REFRESH, PRIVACY_UPDATE, INITIALIZATION_COMPLETED, TRANSACTION_EVENT, AD_REVENUE_EVENT, LIFECYCLE_EVENT, GET_TOKEN, DIAGNOSTIC_EVENT, OPERATIVE_EVENT, UNIVERSAL_EVENT};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    private OperationType(String str, int i) {
    }

    static {
        OperationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        String str = super.toString();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static OperationType valueOf(String str) {
        return (OperationType) Enum.valueOf(OperationType.class, str);
    }

    public static OperationType[] values() {
        return (OperationType[]) $VALUES.clone();
    }
}
