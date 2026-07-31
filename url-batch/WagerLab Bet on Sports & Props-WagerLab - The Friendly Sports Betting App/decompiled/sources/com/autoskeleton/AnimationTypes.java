package com.autoskeleton;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoSkeletonView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/autoskeleton/AnimationTypes;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GRADIENT", "PULSE", "NONE", "react-native-auto-skeleton_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimationTypes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnimationTypes[] $VALUES;
    private final String value;
    public static final AnimationTypes GRADIENT = new AnimationTypes("GRADIENT", 0, "gradient");
    public static final AnimationTypes PULSE = new AnimationTypes("PULSE", 1, "pulse");
    public static final AnimationTypes NONE = new AnimationTypes("NONE", 2, "none");

    private static final /* synthetic */ AnimationTypes[] $values() {
        return new AnimationTypes[]{GRADIENT, PULSE, NONE};
    }

    public static EnumEntries<AnimationTypes> getEntries() {
        return $ENTRIES;
    }

    private AnimationTypes(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        AnimationTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static AnimationTypes valueOf(String str) {
        return (AnimationTypes) Enum.valueOf(AnimationTypes.class, str);
    }

    public static AnimationTypes[] values() {
        return (AnimationTypes[]) $VALUES.clone();
    }
}
