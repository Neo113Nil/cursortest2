package yads;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes5.dex */
public final class tb0 {
    public final long a;
    public final TimeUnit b;
    public final Lazy c = LazyKt.lazy(new sb0(this));

    public tb0(long j, TimeUnit timeUnit) {
        this.a = j;
        this.b = timeUnit;
    }
}
