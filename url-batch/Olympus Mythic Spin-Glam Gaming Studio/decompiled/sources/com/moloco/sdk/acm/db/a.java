package com.moloco.sdk.acm.db;

import androidx.room.TypeConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class a {
    @TypeConverter
    @NotNull
    public final String a(@NotNull c eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return eventType.name();
    }

    @TypeConverter
    @NotNull
    public final List<String> b(@NotNull String tagsString) {
        Intrinsics.checkNotNullParameter(tagsString, "tagsString");
        return tagsString.length() == 0 ? CollectionsKt.emptyList() : StringsKt.split$default((CharSequence) tagsString, new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null);
    }

    @TypeConverter
    @NotNull
    public final c a(@NotNull String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return c.valueOf(eventType);
    }

    @TypeConverter
    @NotNull
    public final String a(@NotNull List<String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return CollectionsKt.joinToString$default(tags, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }
}
