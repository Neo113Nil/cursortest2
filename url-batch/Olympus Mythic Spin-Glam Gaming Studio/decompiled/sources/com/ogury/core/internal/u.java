package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class u implements Flow {
    public final /* synthetic */ Flow a;
    public final /* synthetic */ Preferences.Key b;

    public u(Flow flow, Preferences.Key key) {
        this.a = flow;
        this.b = key;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.a.collect(new t(flowCollector, this.b), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
