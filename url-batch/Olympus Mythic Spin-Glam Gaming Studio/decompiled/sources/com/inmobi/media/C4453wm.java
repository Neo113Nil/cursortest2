package com.inmobi.media;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.inmobi.media.wm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4453wm implements FlowCollector {
    public final /* synthetic */ Nm a;

    public C4453wm(CoroutineScope coroutineScope, Nm nm) {
        this.a = nm;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Job launch$default;
        Job launch$default2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C4493y9 c4493y9 = this.a.e;
        if (c4493y9 != null) {
            c4493y9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + booleanValue);
        }
        if (booleanValue) {
            Nm nm = this.a;
            C4493y9 c4493y92 = nm.e;
            if (c4493y92 != null) {
                c4493y92.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            InterfaceC4311rc interfaceC4311rc = nm.h;
            if (interfaceC4311rc == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                interfaceC4311rc = null;
            }
            C4025ge c4025ge = (C4025ge) interfaceC4311rc;
            On on = c4025ge.m;
            on.d.set(true);
            Ng ng = (Ng) on.i.d.getValue();
            ng.b.setValue(EnumC4192mo.a);
            ng.f.set(true);
            P6.a(ng.e);
            ng.e = null;
            Ng ng2 = (Ng) on.i.d.getValue();
            ng2.a();
            launch$default = BuildersKt__Builders_commonKt.launch$default(on.a, Dispatchers.getMain(), null, new Mn(new C4402un(ng2.b), null, on), 2, null);
            ArrayList activeJobs = on.e;
            Intrinsics.checkNotNullParameter(launch$default, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
            on.a();
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(c4025ge.a, null, null, new Yd(new C3891be(c4025ge.o), null, c4025ge), 3, null);
            ArrayList activeJobs2 = c4025ge.d;
            Intrinsics.checkNotNullParameter(launch$default2, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs2, "activeJobs");
            activeJobs2.add(launch$default2);
            c4025ge.l.b();
            C4493y9 c4493y93 = nm.e;
            if (c4493y93 != null) {
                c4493y93.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            InterfaceC4311rc interfaceC4311rc2 = nm.h;
            if (interfaceC4311rc2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                interfaceC4311rc2 = null;
            }
            Job launchIn = FlowKt.launchIn(FlowKt.onEach(new Hm(FlowKt.onEach(((C4025ge) interfaceC4311rc2).o, new Im(nm, null))), new Jm(nm, null)), nm.b);
            ArrayList activeJobs3 = nm.f;
            Intrinsics.checkNotNullParameter(launchIn, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs3, "activeJobs");
            activeJobs3.add(launchIn);
            X4.a(nm.b, new Mm(nm, null));
            nm.c();
        } else {
            this.a.b();
        }
        return Unit.INSTANCE;
    }
}
