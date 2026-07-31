package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5059h {

    @NotNull
    public static final C5059h a = new C5059h();

    @NotNull
    public static final Regex b = new Regex("<meta\\s+name=[\"']templateName[\"']\\s+content=[\"']([^\"']+)[\"']", RegexOption.IGNORE_CASE);
    public static final int c = 8;

    public final boolean a(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return StringsKt.contains((CharSequence) adm, (CharSequence) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k, true);
    }

    public final boolean b(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return StringsKt.contains((CharSequence) adm, (CharSequence) "<VAST", true);
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i e = e(adm);
        return e == null ? d(adm) : e;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i d(String str) {
        return b(str) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.a : a(str) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i e(String str) {
        List groupValues;
        String str2;
        MatchResult find$default = Regex.find$default(b, str, 0, 2, null);
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str2 = (String) groupValues.get(1)) == null) {
            return null;
        }
        if (StringsKt.startsWith(str2, "video", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.d;
        }
        if (StringsKt.equals(str2, "mraid", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.e;
        }
        if (StringsKt.equals(str2, "static", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f;
        }
        MetricsRecorder.INSTANCE.withNoMediation().recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Y.c()).withTag("template_name", str2));
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f;
    }
}
