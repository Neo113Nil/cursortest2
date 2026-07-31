package com.moloco.sdk.acm.services;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/moloco/sdk/acm/services/ApplicationLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/moloco/sdk/acm/eventprocessing/c;", "dbWorkRequest", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/acm/services/f;", "screenStateService", "<init>", "(Lcom/moloco/sdk/acm/eventprocessing/c;Lkotlinx/coroutines/CoroutineScope;Lcom/moloco/sdk/acm/services/f;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "onStop", "(Landroidx/lifecycle/LifecycleOwner;)V", "a", "Lcom/moloco/sdk/acm/eventprocessing/c;", "b", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lcom/moloco/sdk/acm/services/f;", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class ApplicationLifecycleObserver implements DefaultLifecycleObserver {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final com.moloco.sdk.acm.eventprocessing.c dbWorkRequest;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope scope;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final f screenStateService;

    @DebugMetadata(c = "com.moloco.sdk.acm.services.ApplicationLifecycleObserver$onStop$1", f = "ApplicationLifecycleTracker.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ApplicationLifecycleObserver.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ApplicationLifecycleObserver.this.dbWorkRequest.a();
            return Unit.INSTANCE;
        }
    }

    public ApplicationLifecycleObserver(@NotNull com.moloco.sdk.acm.eventprocessing.c dbWorkRequest, @NotNull CoroutineScope scope, @NotNull f screenStateService) {
        Intrinsics.checkNotNullParameter(dbWorkRequest, "dbWorkRequest");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(screenStateService, "screenStateService");
        this.dbWorkRequest = dbWorkRequest;
        this.scope = scope;
        this.screenStateService = screenStateService;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        if (!this.screenStateService.a() && this.screenStateService.b()) {
            e.a(e.a, d.a, "Application onStop - skipping upload (device not interactive)", false, 4, null);
        } else {
            e.a(e.a, d.a, "Application onStop", false, 4, null);
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new a(null), 3, null);
        }
    }
}
