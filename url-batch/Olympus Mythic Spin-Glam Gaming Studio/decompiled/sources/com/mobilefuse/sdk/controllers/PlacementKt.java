package com.mobilefuse.sdk.controllers;

import com.mobilefuse.sdk.MobileFuseDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Placement.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"parsePlacementId", "Lcom/mobilefuse/sdk/controllers/ParsedPlacementId;", "id", "", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class PlacementKt {
    @NotNull
    public static final ParsedPlacementId parsePlacementId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (!StringsKt.startsWith$default(id, MobileFuseDefaults.TEST_MODE_PLACEMENT_PREFIX, false, 2, (Object) null)) {
            return new ParsedPlacementId(id, false);
        }
        String substring = id.substring(5);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return new ParsedPlacementId(substring, true);
    }
}
