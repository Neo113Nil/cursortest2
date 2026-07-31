package com.mobilefuse.sdk.telemetry.devicelogs;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeviceLogIndex.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/devicelogs/DeviceLogIndex;", "", "()V", "_count", "Ljava/util/concurrent/atomic/AtomicInteger;", "value", "", "getValue", "()I", "increment", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class DeviceLogIndex {

    @NotNull
    public static final DeviceLogIndex INSTANCE = new DeviceLogIndex();
    private static final AtomicInteger _count = new AtomicInteger(0);

    private DeviceLogIndex() {
    }

    public final int getValue() {
        return _count.get();
    }

    public final int increment() {
        return _count.incrementAndGet();
    }
}
