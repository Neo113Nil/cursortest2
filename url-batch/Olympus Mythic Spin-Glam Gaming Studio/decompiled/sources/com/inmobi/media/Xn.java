package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes13.dex */
public final class Xn implements FlowCollector {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ C3875ao b;

    public Xn(CoroutineScope coroutineScope, C3875ao c3875ao) {
        this.b = c3875ao;
        this.a = coroutineScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Job launch$default;
        CoroutineScope coroutineScope = this.a;
        boolean z = true;
        if (((EnumC4192mo) obj) == EnumC4192mo.b) {
            C3901bo c3901bo = this.b.d;
            if (!c3901bo.b) {
                Job job = c3901bo.a;
                if (!(job != null ? job.isActive() : false)) {
                    z = false;
                }
            }
            if (!z) {
                C3875ao c3875ao = this.b;
                C3901bo c3901bo2 = c3875ao.d;
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Zn(c3875ao, null), 3, null);
                c3901bo2.a = launch$default;
            }
        } else {
            C3875ao c3875ao2 = this.b;
            Job job2 = c3875ao2.d.a;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
            c3875ao2.d.a = null;
        }
        return Unit.INSTANCE;
    }
}
