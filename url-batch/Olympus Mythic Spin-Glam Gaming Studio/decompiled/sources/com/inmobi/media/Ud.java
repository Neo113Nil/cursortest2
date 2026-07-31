package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes12.dex */
public final class Ud implements FlowCollector {
    public final /* synthetic */ Wd a;
    public final /* synthetic */ ProducerScope b;

    public Ud(Wd wd, ProducerScope producerScope) {
        this.a = wd;
        this.b = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC4233oc abstractC4233oc = (AbstractC4233oc) obj;
        if (abstractC4233oc instanceof C4454wn) {
            Wd wd = this.a;
            C4454wn c4454wn = (C4454wn) abstractC4233oc;
            ProducerScope producerScope = this.b;
            if (!wd.c) {
                Long l = wd.d;
                if (l != null) {
                    if (c4454wn.a >= l.longValue() + wd.a.b && ChannelResult.m8226isSuccessimpl(producerScope.mo8216trySendJP2dKIU(Unit.INSTANCE))) {
                        wd.c = true;
                        wd.d = null;
                        wd.b.set(false);
                    }
                } else {
                    wd.d = Long.valueOf(c4454wn.a);
                    wd.b.set(true);
                }
            }
        } else if ((abstractC4233oc instanceof Jn) || (abstractC4233oc instanceof C4218nn)) {
            Wd wd2 = this.a;
            wd2.d = null;
            wd2.b.set(false);
        }
        return Unit.INSTANCE;
    }
}
