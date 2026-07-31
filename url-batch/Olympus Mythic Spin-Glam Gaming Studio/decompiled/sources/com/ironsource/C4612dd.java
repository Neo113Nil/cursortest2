package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4612dd {

    @NotNull
    private final String a;

    public C4612dd(@NotNull String baseControllerUrl) {
        Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.a = baseControllerUrl;
    }

    @NotNull
    public final String a() {
        String str = this.a;
        String substring = str.substring(0, StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
