package com.inmobi.media;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.h8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC4045h8 {
    public static final /* synthetic */ EnumC4045h8[] a;

    static {
        EnumC4045h8[] enumC4045h8Arr = {new EnumC4045h8(POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, 0, "q0"), new EnumC4045h8("FIRST_QUARTILE", 1, "q1"), new EnumC4045h8("MIDPOINT", 2, "q2"), new EnumC4045h8("THIRD_QUARTILE", 3, "q3"), new EnumC4045h8("FOURTH_QUARTILE", 4, "q4")};
        a = enumC4045h8Arr;
        EnumEntriesKt.enumEntries(enumC4045h8Arr);
    }

    public EnumC4045h8(String str, int i, String str2) {
    }

    public static EnumC4045h8 valueOf(String str) {
        return (EnumC4045h8) Enum.valueOf(EnumC4045h8.class, str);
    }

    public static EnumC4045h8[] values() {
        return (EnumC4045h8[]) a.clone();
    }
}
