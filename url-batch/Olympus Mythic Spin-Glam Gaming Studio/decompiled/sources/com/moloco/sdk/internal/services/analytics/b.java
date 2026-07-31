package com.moloco.sdk.internal.services.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i;
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

@StabilityInferred
/* loaded from: classes12.dex */
public final class b implements com.moloco.sdk.internal.services.analytics.a {
    public static final int d = 0;

    @NotNull
    public final i a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c c;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.analytics.AnalyticsServiceImpl$recordApplicationBackground$1", f = "AnalyticsService.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, Continuation continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = b.this.b;
                long j = this.c;
                a.AbstractC1677a.C1678a c1678a = a.AbstractC1677a.C1678a.b;
                String a = b.this.c.a();
                this.a = 1;
                obj = aVar.a(j, c1678a, a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            b.this.a.a((String) obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.analytics.AnalyticsServiceImpl$recordApplicationForeground$1", f = "AnalyticsService.kt", l = {31}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.services.analytics.b$b, reason: collision with other inner class name */
    public static final class C1555b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1555b(long j, long j2, Continuation continuation) {
            super(2, continuation);
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1555b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C1555b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = b.this.b;
                long j = this.c;
                a.AbstractC1677a.b bVar = new a.AbstractC1677a.b(this.d);
                String d = b.this.c.d();
                this.a = 1;
                obj = aVar.a(j, bVar, d, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            b.this.a.a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public b(@NotNull i persistentHttpRequest, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c configService) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(configService, "configService");
        this.a = persistentHttpRequest;
        this.b = customUserEventBuilderService;
        this.c = configService;
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j, long j2) {
        if (!this.c.c() || this.c.d().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, c.a, "Recording applicationForeground with timestamp: " + j + ", lastBgTimestamp: " + j2, false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.c.a.b(), null, null, new C1555b(j, j2, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j) {
        if (!this.c.c() || this.c.a().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, c.a, "Recording applicationBackground with timestamp: " + j, false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.c.a.b(), null, null, new a(j, null), 3, null);
    }
}
