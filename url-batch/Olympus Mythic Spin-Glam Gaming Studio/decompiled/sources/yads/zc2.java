package yads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class zc2 implements ad2 {
    @Override // yads.ad2
    public final Map a(long j) {
        return MapsKt.mapOf(TuplesKt.to(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)));
    }
}
