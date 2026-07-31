package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HandlerType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/adplayer/HandlerType;", "", "jsPath", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsPath", "()Ljava/lang/String;", "CALLBACK", "INVOCATION", "EVENT", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HandlerType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HandlerType[] $VALUES;

    @NotNull
    private final String jsPath;
    public static final HandlerType CALLBACK = new HandlerType("CALLBACK", 0, "handleCallback");
    public static final HandlerType INVOCATION = new HandlerType("INVOCATION", 1, "handleInvocation");
    public static final HandlerType EVENT = new HandlerType("EVENT", 2, "handleEvent");

    private static final /* synthetic */ HandlerType[] $values() {
        return new HandlerType[]{CALLBACK, INVOCATION, EVENT};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    private HandlerType(String str, int i, String str2) {
        this.jsPath = str2;
    }

    @NotNull
    public final String getJsPath() {
        return this.jsPath;
    }

    static {
        HandlerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HandlerType valueOf(String str) {
        return (HandlerType) Enum.valueOf(HandlerType.class, str);
    }

    public static HandlerType[] values() {
        return (HandlerType[]) $VALUES.clone();
    }
}
