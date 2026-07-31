package io.bidmachine.util.time;

import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: SystemTimeManagerInstance.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/time/SystemTimeManagerInstance;", "Lio/bidmachine/util/time/TimeManagerInstance;", "()V", "currentTimeMillis", "", "getTimeZoneId", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class SystemTimeManagerInstance implements TimeManagerInstance {
    @Override // io.bidmachine.util.time.TimeManagerInstance
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // io.bidmachine.util.time.TimeManagerInstance
    @Nullable
    public String getTimeZoneId() {
        return TimeZone.getDefault().getID();
    }
}
