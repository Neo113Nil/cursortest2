package com.mobilefuse.videoplayer.tracking;

import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3}, xi = 128)
/* loaded from: classes13.dex */
public final /* synthetic */ class VastEventTracker$parseMacro$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[ExceptionHandlingStrategy.values().length];
        $EnumSwitchMapping$2 = iArr;
        iArr[ExceptionHandlingStrategy.LogAndIgnore.ordinal()] = 1;
        iArr[ExceptionHandlingStrategy.Ignore.ordinal()] = 2;
    }
}
