package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InitializationState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/model/InitializationState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "INITIALIZING", "INITIALIZED", "FAILED", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InitializationState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InitializationState[] $VALUES;
    public static final InitializationState NOT_INITIALIZED = new InitializationState("NOT_INITIALIZED", 0);
    public static final InitializationState INITIALIZING = new InitializationState("INITIALIZING", 1);
    public static final InitializationState INITIALIZED = new InitializationState("INITIALIZED", 2);
    public static final InitializationState FAILED = new InitializationState("FAILED", 3);

    private static final /* synthetic */ InitializationState[] $values() {
        return new InitializationState[]{NOT_INITIALIZED, INITIALIZING, INITIALIZED, FAILED};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    private InitializationState(String str, int i) {
    }

    static {
        InitializationState[] $values = $values();
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

    public static InitializationState valueOf(String str) {
        return (InitializationState) Enum.valueOf(InitializationState.class, str);
    }

    public static InitializationState[] values() {
        return (InitializationState[]) $VALUES.clone();
    }
}
