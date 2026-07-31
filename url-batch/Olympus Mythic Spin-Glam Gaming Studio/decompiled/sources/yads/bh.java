package yads;

import androidx.work.impl.utils.ForceStopRunnable$$ExternalSyntheticApiModelOutline1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class bh extends Lambda implements Function1 {
    public static final bh b = new bh();

    public bh() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int reason;
        reason = ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m(obj).getReason();
        return Boolean.valueOf(reason == 6);
    }
}
