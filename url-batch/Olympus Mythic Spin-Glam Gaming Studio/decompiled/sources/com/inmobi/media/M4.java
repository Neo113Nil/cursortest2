package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class M4 implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this) {
            try {
                S4 s4 = S4.a;
                Intrinsics.checkNotNullExpressionValue("S4", "access$getTAG$p(...)");
                S4 s42 = S4.a;
                String str = S4.f;
                List<String> skipFields = S4.c().getContextualData().getSkipFields();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(T4.j);
                arrayList.removeAll(skipFields);
                String joinToString$default = CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
                S4.f = joinToString$default;
                if (!Intrinsics.areEqual(joinToString$default, str)) {
                    s42.f();
                }
                S4.a();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
