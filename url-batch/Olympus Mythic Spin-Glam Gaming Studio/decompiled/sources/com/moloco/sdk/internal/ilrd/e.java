package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.Init;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.ilrd.g;
import com.moloco.sdk.internal.services.bidtoken.providers.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final a f = new a(null);
    public static final int g = 8;

    @NotNull
    public static final String h = "IlrdService";

    @NotNull
    public final CoroutineScope a;

    @NotNull
    public final IlrdEventsRepository b;

    @NotNull
    public final Lazy c;
    public final Set<com.moloco.sdk.internal.ilrd.c> d;

    @Nullable
    public Job e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdService$subscribe$1", f = "IlrdService.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<com.moloco.sdk.internal.ilrd.c> a = e.this.a();
            e eVar = e.this;
            for (com.moloco.sdk.internal.ilrd.c cVar : a) {
                g gVar = (g) cVar.getState().getValue();
                if (gVar instanceof g.a) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, e.h, "Failed to subscribe to " + cVar.a() + " ILRD: " + ((g.a) gVar).b(), null, false, 12, null);
                } else if (gVar instanceof g.c) {
                    eVar.a(cVar);
                } else if (!(gVar instanceof g.b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdService$subscribeToProvider$2$1", f = "IlrdService.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.a aVar, Continuation continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = e.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c.a aVar = (c.a) this.b;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e.h, "Revenue event: " + aVar, null, false, 12, null);
            e.this.b.b(aVar);
            return Unit.INSTANCE;
        }
    }

    public e(@NotNull CoroutineScope scope, @NotNull final Context context, @NotNull IlrdEventsRepository eventsRepository, @NotNull final List<? extends Init.SDKInitResponse.SupportedNetworks> supportedNetworksList) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventsRepository, "eventsRepository");
        Intrinsics.checkNotNullParameter(supportedNetworksList, "supportedNetworksList");
        this.a = scope;
        this.b = eventsRepository;
        this.c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return e.a(supportedNetworksList, context, this);
            }
        });
        this.d = Collections.synchronizedSet(new LinkedHashSet());
    }

    public final synchronized void c() {
        Job launch$default;
        Job job = this.e;
        if (job == null || !job.isActive()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new b(null), 3, null);
            this.e = launch$default;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0 = com.moloco.sdk.internal.ilrd.f.b(r0);
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p b() {
        p b2;
        IlrdEventsRepository ilrdEventsRepository = this.b;
        ilrdEventsRepository.i();
        com.moloco.sdk.internal.ilrd.a session = ilrdEventsRepository.getSession();
        if (session != null && b2 != null) {
            return b2;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, h, "provideDataForBidToken() Session is null", null, false, 12, null);
        return null;
    }

    public final List<com.moloco.sdk.internal.ilrd.c> a() {
        return (List) this.c.getValue();
    }

    public static final List a(List list, Context context, e eVar) {
        ArrayList arrayList = new ArrayList();
        if (list.contains(Init.SDKInitResponse.SupportedNetworks.MAX)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, h, "Adding AppLovin as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.a(context, eVar.a));
        }
        if (list.contains(Init.SDKInitResponse.SupportedNetworks.LEVEL_PLAY)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, h, "Adding IronSource as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.b(context, eVar.a));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final void a(com.moloco.sdk.internal.ilrd.c cVar) {
        Object b2 = cVar.b();
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(b2);
        if (m8026exceptionOrNullimpl != null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, h, "Failed to subscribe to " + cVar.a() + " ILRD: " + m8026exceptionOrNullimpl, null, false, 12, null);
        }
        if (Result.m8029isSuccessimpl(b2)) {
            this.d.add(cVar);
            FlowKt.launchIn(FlowKt.onEach(cVar.c(), new c(null)), this.a);
        }
    }
}
