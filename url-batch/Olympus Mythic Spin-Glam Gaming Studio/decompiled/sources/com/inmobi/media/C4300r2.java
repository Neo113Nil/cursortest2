package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.r2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4300r2 implements FlowCollector {
    public final /* synthetic */ AbstractC4459x2 a;

    public C4300r2(CoroutineScope coroutineScope, AbstractC4459x2 abstractC4459x2) {
        this.a = abstractC4459x2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.getClass();
        this.a.e.set(booleanValue);
        AbstractC4459x2 abstractC4459x2 = this.a;
        if (abstractC4459x2.e.get()) {
            Ng ng = abstractC4459x2.c().a;
            ng.f.set(false);
            ng.a();
        } else {
            Ng ng2 = abstractC4459x2.c().a;
            ng2.b.setValue(EnumC4192mo.a);
            ng2.f.set(true);
            P6.a(ng2.e);
            ng2.e = null;
        }
        AbstractC4459x2 abstractC4459x22 = this.a;
        if (abstractC4459x22.e.get()) {
            abstractC4459x22.g.a();
        } else {
            abstractC4459x22.g.b();
        }
        return Unit.INSTANCE;
    }
}
