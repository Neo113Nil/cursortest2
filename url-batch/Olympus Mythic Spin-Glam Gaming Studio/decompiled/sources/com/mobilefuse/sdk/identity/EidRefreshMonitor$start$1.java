package com.mobilefuse.sdk.identity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EidRefreshMonitor.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
final /* synthetic */ class EidRefreshMonitor$start$1 extends FunctionReferenceImpl implements Function0 {
    EidRefreshMonitor$start$1(EidRefreshMonitor eidRefreshMonitor) {
        super(0, eidRefreshMonitor, EidRefreshMonitor.class, "onTaskRunnerComplete", "onTaskRunnerComplete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        ((EidRefreshMonitor) this.receiver).onTaskRunnerComplete();
    }
}
