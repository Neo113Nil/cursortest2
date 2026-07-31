package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.publisher.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5032h {
    public static final String a(Function0 function0) {
        String name;
        if (function0 == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i) function0.mo4828invoke();
        if (iVar != null && (name = iVar.name()) != null) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        String lowerCase2 = "UNKNOWN".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    @NotNull
    public static final CountEvent a(@NotNull CountEvent countEvent, @Nullable Function0 function0) {
        CountEvent withTag;
        Intrinsics.checkNotNullParameter(countEvent, "<this>");
        String a = a(function0);
        return (a == null || (withTag = countEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), a)) == null) ? countEvent : withTag;
    }

    @NotNull
    public static final TimerEvent a(@NotNull TimerEvent timerEvent, @Nullable Function0 function0) {
        TimerEvent withTag;
        Intrinsics.checkNotNullParameter(timerEvent, "<this>");
        String a = a(function0);
        return (a == null || (withTag = timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), a)) == null) ? timerEvent : withTag;
    }
}
