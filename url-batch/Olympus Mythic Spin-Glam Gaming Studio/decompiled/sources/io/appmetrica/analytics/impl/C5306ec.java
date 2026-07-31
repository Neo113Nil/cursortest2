package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5306ec {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? AbstractC5332fc.a(configuration) : CollectionsKt.listOf(AbstractC5232bf.a(configuration.locale));
    }
}
