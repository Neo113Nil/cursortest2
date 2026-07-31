package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.se, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4339se implements FlowCollector {
    public final /* synthetic */ He a;

    public C4339se(CoroutineScope coroutineScope, He he) {
        this.a = he;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC4233oc mediaEvent = (AbstractC4233oc) obj;
        C3864ad c3864ad = this.a.b.f;
        c3864ad.getClass();
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof C3952dn) {
            c3864ad.a.d = Gl.a(((C3952dn) mediaEvent).a);
        } else if (mediaEvent instanceof C4454wn) {
            c3864ad.a.e = ((C4454wn) mediaEvent).a;
        }
        if (!(mediaEvent instanceof C4454wn)) {
            InterfaceC4466x9 l = this.a.l();
            if (l != null) {
                ((C4493y9) l).a("NativeRenderedState", "listenMediaEvents - processing media event: " + mediaEvent);
            }
            ((C3996fd) this.a.b.m.getValue()).a(mediaEvent);
            Ii ii = (Ii) this.a.b.n.getValue();
            ii.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "event");
            if (mediaEvent instanceof AbstractC4295qm) {
                ii.b.a((AbstractC4295qm) mediaEvent);
            }
            Ii ii2 = (Ii) this.a.b.n.getValue();
            ii2.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "event");
            Nc nc = ii2.c.c;
            if (mediaEvent instanceof Jn) {
                nc.f();
            } else if (mediaEvent instanceof Gn) {
                nc.i();
            } else if (mediaEvent instanceof C4218nn) {
                nc.b();
            } else if (mediaEvent instanceof C4243om) {
                nc.h();
            } else if (mediaEvent instanceof W1) {
                nc.a(((W1) mediaEvent).a);
            }
            Ii ii3 = (Ii) this.a.b.n.getValue();
            ii3.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof C4243om) {
                ii3.a.g();
            }
        }
        return Unit.INSTANCE;
    }
}
