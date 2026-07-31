package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.DebuggingKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseServices_Logs.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"logServiceDebug", "", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "msg", "", "Lcom/mobilefuse/sdk/service/MobileFuseServices;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public final class MobileFuseServices_LogsKt {
    public static final void logServiceDebug(@NotNull MobileFuseServices logServiceDebug, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(logServiceDebug, "$this$logServiceDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringBuilder sb = new StringBuilder();
        sb.append(msg);
        sb.append(" on thread: ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        DebuggingKt.logDebug(logServiceDebug, sb.toString(), "MobileFuseServices");
    }

    public static final void logServiceDebug(@NotNull MobileFuseService logServiceDebug, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(logServiceDebug, "$this$logServiceDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringBuilder sb = new StringBuilder();
        sb.append("** Service ");
        sb.append(logServiceDebug);
        sb.append(": ");
        sb.append(msg);
        sb.append(" on thread: ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        DebuggingKt.logDebug(logServiceDebug, sb.toString(), "MobileFuseService");
    }
}
