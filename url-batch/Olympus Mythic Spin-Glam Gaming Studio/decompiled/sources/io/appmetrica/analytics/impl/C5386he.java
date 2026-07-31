package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: io.appmetrica.analytics.impl.he, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C5386he extends FunctionReferenceImpl implements Function1 {
    public C5386he(Object obj) {
        super(1, obj, C5412ie.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C5412ie c5412ie = (C5412ie) this.receiver;
        c5412ie.a.markCrashCompleted((String) obj);
        c5412ie.a.deleteCompletedCrashes();
        return Unit.INSTANCE;
    }
}
