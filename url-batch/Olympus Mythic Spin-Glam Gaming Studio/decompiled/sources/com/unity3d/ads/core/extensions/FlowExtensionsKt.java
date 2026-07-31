package com.unity3d.ads.core.extensions;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: FlowExtensions.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a_\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "timeoutMillis", "", "active", "Lkotlin/Function2;", "Lkotlin/Function0;", "", "Lkotlin/coroutines/Continuation;", "", "block", "timeoutAfter", "(Lkotlinx/coroutines/flow/Flow;JZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowExtensionsKt {
    @NotNull
    public static final <T> Flow timeoutAfter(@NotNull Flow flow, long j, boolean z, @NotNull Function2 block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return FlowKt.channelFlow(new FlowExtensionsKt$timeoutAfter$1(j, z, block, flow, null));
    }

    public static /* synthetic */ Flow timeoutAfter$default(Flow flow, long j, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(flow, j, z, function2);
    }
}
