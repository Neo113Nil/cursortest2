package com.inmobi.media;

import android.app.ApplicationExitInfo;
import androidx.work.impl.utils.ForceStopRunnable$$ExternalSyntheticApiModelOutline1;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okio.Okio;
import okio.Source;

/* loaded from: classes11.dex */
public final class B1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ C1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(C1 c1, Continuation continuation) {
        super(1, continuation);
        this.a = c1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new B1(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new B1(this.a, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List historicalProcessExitReasons;
        long timestamp;
        int reason;
        String description;
        D1 d1;
        long timestamp2;
        int reason2;
        String description2;
        InputStream traceInputStream;
        Source source;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C1 c1 = this.a;
        historicalProcessExitReasons = c1.f.getHistoricalProcessExitReasons(c1.b.getPackageName(), 0, 10);
        Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        Qa qa = this.a.g;
        qa.getClass();
        Intrinsics.checkNotNullParameter("exitReasonTimestamp", "key");
        long j = qa.a.getLong("exitReasonTimestamp", 0L);
        C1 c12 = this.a;
        Iterator it = historicalProcessExitReasons.iterator();
        long j2 = j;
        while (it.hasNext()) {
            ApplicationExitInfo m = ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m(it.next());
            timestamp = m.getTimestamp();
            if (timestamp > j) {
                try {
                    reason2 = m.getReason();
                    description2 = m.getDescription();
                    traceInputStream = m.getTraceInputStream();
                    d1 = new D1(description2, reason2, N3.a((traceInputStream == null || (source = Okio.source(traceInputStream)) == null) ? null : Okio.buffer(source), c12.d));
                } catch (Exception e) {
                    Intrinsics.checkNotNullExpressionValue(c12.e, "access$getTAG$p(...)");
                    e.getMessage();
                    reason = m.getReason();
                    description = m.getDescription();
                    d1 = new D1(description, reason, ExceptionsKt.stackTraceToString(e));
                }
                long j3 = c12.c;
                A1 runnable = new A1(c12, d1, null);
                CoroutineScope coroutineScope = Hl.a;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                BuildersKt__Builders_commonKt.launch$default(Hl.a, null, null, new El(j3, null, runnable), 3, null);
                timestamp2 = m.getTimestamp();
                if (timestamp2 > j2) {
                    j2 = m.getTimestamp();
                }
            }
        }
        this.a.g.a("exitReasonTimestamp", j2, false);
        return Unit.INSTANCE;
    }
}
