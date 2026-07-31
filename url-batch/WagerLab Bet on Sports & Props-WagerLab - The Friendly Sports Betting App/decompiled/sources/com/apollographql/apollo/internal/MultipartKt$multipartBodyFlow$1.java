package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.http.HttpHeaders;
import com.apollographql.apollo.api.http.HttpResponse;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.internal.MultipartReader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import okio.BufferedSource;

/* compiled from: multipart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lokio/BufferedSource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", i = {0}, l = {29}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class MultipartKt$multipartBodyFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super BufferedSource>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<MultipartReader> $multipartReader;
    final /* synthetic */ HttpResponse $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$multipartBodyFlow$1(Ref.ObjectRef<MultipartReader> objectRef, HttpResponse httpResponse, Continuation<? super MultipartKt$multipartBodyFlow$1> continuation) {
        super(2, continuation);
        this.$multipartReader = objectRef;
        this.$response = httpResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MultipartKt$multipartBodyFlow$1 multipartKt$multipartBodyFlow$1 = new MultipartKt$multipartBodyFlow$1(this.$multipartReader, this.$response, continuation);
        multipartKt$multipartBodyFlow$1.L$0 = obj;
        return multipartKt$multipartBodyFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super BufferedSource> flowCollector, Continuation<? super Unit> continuation) {
        return ((MultipartKt$multipartBodyFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.apollographql.apollo.internal.MultipartReader] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String boundaryParameter;
        FlowCollector flowCollector;
        MultipartReader.Part nextPart;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Ref.ObjectRef<MultipartReader> objectRef = this.$multipartReader;
            BufferedSource body = this.$response.getBody();
            Intrinsics.checkNotNull(body);
            boundaryParameter = MultipartKt.getBoundaryParameter(HttpHeaders.valueOf(this.$response.getHeaders(), "Content-Type"));
            if (boundaryParameter != null) {
                objectRef.element = new MultipartReader(body, boundaryParameter);
                flowCollector = flowCollector2;
            } else {
                throw new DefaultApolloException("Expected the Content-Type to have a boundary parameter", null, 2, null);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        do {
            MultipartReader multipartReader = this.$multipartReader.element;
            Intrinsics.checkNotNull(multipartReader);
            nextPart = multipartReader.nextPart();
            if (nextPart == null) {
                return Unit.INSTANCE;
            }
            this.L$0 = flowCollector;
            this.label = 1;
        } while (flowCollector.emit(nextPart.getBody(), this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
