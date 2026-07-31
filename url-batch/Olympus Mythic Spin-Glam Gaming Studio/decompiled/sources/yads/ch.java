package yads;

import androidx.work.impl.utils.ForceStopRunnable$$ExternalSyntheticApiModelOutline1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ch extends Lambda implements Function1 {
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(long j) {
        super(1);
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long timestamp;
        timestamp = ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m(obj).getTimestamp();
        return Boolean.valueOf(timestamp > this.b);
    }
}
