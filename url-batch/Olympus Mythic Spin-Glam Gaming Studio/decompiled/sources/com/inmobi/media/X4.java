package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes13.dex */
public abstract class X4 {
    public static final CoroutineScope a(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        return CoroutineScopeKt.CoroutineScope(coroutineScope.getCoroutineContext().plus(JobKt.Job((Job) coroutineScope.getCoroutineContext().get(Job.Key))));
    }

    public static final CoroutineScope a(CoroutineScope coroutineScope, CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        CompletableJob SupervisorJob = job != null ? SupervisorKt.SupervisorJob(job) : SupervisorKt.SupervisorJob$default(null, 1, null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorJob.plus(Dispatchers.getMain().getImmediate()).plus(coroutineExceptionHandler));
        return CoroutineScope == null ? CoroutineScopeKt.CoroutineScope(SupervisorJob.plus(Dispatchers.getMain().getImmediate())) : CoroutineScope;
    }

    public static final Job a(CoroutineScope coroutineScope, Function2 block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, block, 2, null);
        return launch$default;
    }

    public static final void a(MutableSharedFlow mutableSharedFlow, CoroutineScope scope, AbstractC4233oc abstractC4233oc) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new W4(mutableSharedFlow, abstractC4233oc, null), 3, null);
    }

    public static final void a(CancellableContinuationImpl cancellableContinuationImpl, Object obj) {
        Intrinsics.checkNotNullParameter(cancellableContinuationImpl, "<this>");
        if (cancellableContinuationImpl.isActive()) {
            try {
                cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(obj));
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next(), null, 1, null);
        }
        list.clear();
    }
}
