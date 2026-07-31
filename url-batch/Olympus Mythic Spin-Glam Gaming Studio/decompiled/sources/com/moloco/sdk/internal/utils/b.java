package com.moloco.sdk.internal.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes15.dex */
public final class b {

    @NotNull
    public static final String a = "[ERROR_CODE]";

    @NotNull
    public static final String b = "[HAPPENED_AT_TS]";

    @NotNull
    public static final String c = "[SECONDS_LEFT]";

    @NotNull
    public static final String a(@NotNull String str, @NotNull String errorCode) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return StringsKt.replace$default(str, "[ERROR_CODE]", errorCode, false, 4, (Object) null);
    }

    @NotNull
    public static final String b(@NotNull String str, @Nullable String str2) {
        String replace$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (str2 == null || (replace$default = StringsKt.replace$default(str, "[MTID]", str2, false, 4, (Object) null)) == null) ? str : replace$default;
    }

    @NotNull
    public static final String a(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.replace$default(str, "[HAPPENED_AT_TS]", String.valueOf(j), false, 4, (Object) null);
    }

    @NotNull
    public static final String a(@NotNull String str, @NotNull String errorCode, long j) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return a(a(str, errorCode), j);
    }

    @NotNull
    public static final String a(@NotNull String substituteCountDownTimeLeftMacro, int i) {
        Intrinsics.checkNotNullParameter(substituteCountDownTimeLeftMacro, "$this$substituteCountDownTimeLeftMacro");
        return StringsKt.replace$default(substituteCountDownTimeLeftMacro, c, b$$ExternalSyntheticBackport0.m(i), false, 4, (Object) null);
    }
}
