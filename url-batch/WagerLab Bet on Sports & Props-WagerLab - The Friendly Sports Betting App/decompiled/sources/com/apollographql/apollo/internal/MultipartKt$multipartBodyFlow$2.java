package com.apollographql.apollo.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import okio.BufferedSource;

/* compiled from: multipart.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lokio/BufferedSource;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MultipartKt$multipartBodyFlow$2 extends SuspendLambda implements Function3<FlowCollector<? super BufferedSource>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<MultipartReader> $multipartReader;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$multipartBodyFlow$2(Ref.ObjectRef<MultipartReader> objectRef, Continuation<? super MultipartKt$multipartBodyFlow$2> continuation) {
        super(3, continuation);
        this.$multipartReader = objectRef;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super BufferedSource> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        MultipartKt$multipartBodyFlow$2 multipartKt$multipartBodyFlow$2 = new MultipartKt$multipartBodyFlow$2(this.$multipartReader, continuation);
        multipartKt$multipartBodyFlow$2.L$0 = flowCollector;
        return multipartKt$multipartBodyFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef<MultipartReader> objectRef = this.$multipartReader;
        try {
            Result.Companion companion = Result.INSTANCE;
            MultipartReader multipartReader = objectRef.element;
            if (multipartReader != null) {
                multipartReader.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m12363constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m12363constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
