package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes11.dex */
public final class Lh extends SuspendLambda implements Function2 {
    public String a;
    public Ref$ObjectRef b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Mh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lh(Mh mh, Continuation continuation) {
        super(2, continuation);
        this.e = mh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Lh lh = new Lh(this.e, continuation);
        lh.d = obj;
        return lh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Lh lh = new Lh(this.e, (Continuation) obj2);
        lh.d = (FlowCollector) obj;
        return lh.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        String str;
        Ref$ObjectRef ref$ObjectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.d;
            str = AbstractC4002fj.c;
            if (str == null) {
                return Unit.INSTANCE;
            }
            ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = Mh.a(this.e);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = this.b;
            str = this.a;
            flowCollector = (FlowCollector) this.d;
            ResultKt.throwOnFailure(obj);
        }
        String accountId = str;
        FlowCollector flowCollector2 = flowCollector;
        while (!((Collection) ref$ObjectRef.element).isEmpty()) {
            List configRequestContexts = (List) ref$ObjectRef.element;
            ref$ObjectRef.element = CollectionsKt.emptyList();
            Sh sh = (Sh) this.e.b.getValue();
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig = (RootConfig) AbstractC4015g4.a.a(RootConfig.class);
            sh.getClass();
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(rootConfig, "rootConfig");
            Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
            Flow channelFlow = FlowKt.channelFlow(new Ph(configRequestContexts, sh, accountId, rootConfig, null));
            Kh kh = new Kh(this.e, flowCollector2, ref$ObjectRef);
            this.d = flowCollector2;
            this.a = accountId;
            this.b = ref$ObjectRef;
            this.c = 1;
            if (channelFlow.collect(kh, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
