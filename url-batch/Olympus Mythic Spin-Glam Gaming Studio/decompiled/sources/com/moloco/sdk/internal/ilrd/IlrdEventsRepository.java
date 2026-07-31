package com.moloco.sdk.internal.ilrd;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.IlrdRequest;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.services.AbstractC5040c;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.services.InterfaceC5041d;
import com.moloco.sdk.internal.services.w;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.ContentType;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u0000 W2\u00020\u0001:\u0001,B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b!\u0010 J\u001f\u0010!\u001a\n %*\u0004\u0018\u00010$0$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b!\u0010&J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010(J\u000f\u0010)\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b,\u0010 J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b-\u0010*J\u0015\u0010+\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010.J\u0017\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001eH\u0001¢\u0006\u0004\b3\u0010*J\u000f\u0010!\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010*J\u000f\u00104\u001a\u00020\u001eH\u0001¢\u0006\u0004\b4\u0010*J\u000f\u00105\u001a\u00020\u001eH\u0001¢\u0006\u0004\b5\u0010*J\u000f\u00107\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010BR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010:R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010CR\u0017\u0010\u0019\u001a\u00020\u00188G¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\b?\u0010ER\u0017\u0010\u001a\u001a\u00020\u00188G¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\b@\u0010ER\u0017\u0010\u001b\u001a\u00020\u00188G¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\b\u001f\u0010ER\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR(\u0010Q\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010L8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b=\u0010PR&\u0010V\u001a\b\u0012\u0004\u0012\u00020$0R8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010U¨\u0006X"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/IlrdEventsRepository;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "url", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;", "persistentHttpRequest", "Lkotlin/time/Duration;", "sessionExp", "", "maxBatchSize", "uploadInterval", "sessionMaxLength", "Lcom/moloco/sdk/internal/services/I;", "timeProvider", "Landroidx/lifecycle/Lifecycle;", "processLifeycle", "Lcom/moloco/sdk/internal/services/d;", "advertisingIdService", "pubId", "appId", "Lcom/moloco/sdk/internal/services/w;", "dataStoreService", "Lcom/moloco/sdk/internal/ilrd/d;", "sessionInactiveScheduler", "sessionMaxLengthScheduler", "scheduledUploadScheduler", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;JIJJLcom/moloco/sdk/internal/services/I;Landroidx/lifecycle/Lifecycle;Lcom/moloco/sdk/internal/services/d;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/services/w;Lcom/moloco/sdk/internal/ilrd/d;Lcom/moloco/sdk/internal/ilrd/d;Lcom/moloco/sdk/internal/ilrd/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/moloco/sdk/internal/ilrd/c$a;", "ilrdData", "Lcom/moloco/sdk/IlrdRequest$ImpressionLevelRevenue;", "kotlin.jvm.PlatformType", "(Lcom/moloco/sdk/internal/ilrd/c$a;)Lcom/moloco/sdk/IlrdRequest$ImpressionLevelRevenue;", IronSourceConstants.EVENTS_DURATION, "(J)V", CampaignEx.JSON_KEY_AD_K, "()V", "b", "c", "i", "(Lcom/moloco/sdk/internal/ilrd/c$a;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", X3.i.t0, "(Landroidx/lifecycle/LifecycleOwner;)V", "m", com.mbridge.msdk.foundation.same.report.j.b, "l", "", "h", "()Z", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/lang/String;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;", "J", EidRequestBuilder.REQUEST_FIELD_EMAIL, "I", InneractiveMediationDefs.GENDER_FEMALE, "g", "Lcom/moloco/sdk/internal/services/I;", "Lcom/moloco/sdk/internal/services/d;", "Lcom/moloco/sdk/internal/services/w;", "Lcom/moloco/sdk/internal/ilrd/d;", "()Lcom/moloco/sdk/internal/ilrd/d;", "n", "o", "Lkotlinx/coroutines/sync/Mutex;", "p", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lcom/moloco/sdk/internal/ilrd/a;", "value", CampaignEx.JSON_KEY_AD_Q, "Lcom/moloco/sdk/internal/ilrd/a;", "()Lcom/moloco/sdk/internal/ilrd/a;", "session", "", "r", "Ljava/util/List;", "()Ljava/util/List;", "events", "s", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes15.dex */
public final class IlrdEventsRepository implements DefaultLifecycleObserver {

    /* renamed from: s, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int t = 8;

    @NotNull
    public static final String u = "IlrdEventsRepository";

    @NotNull
    public static final String v = "ilrd_session_store";

    @NotNull
    public static final String w = "ilrd_events_store";

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope scope;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest;

    /* renamed from: d, reason: from kotlin metadata */
    public final long sessionExp;

    /* renamed from: e, reason: from kotlin metadata */
    public final int maxBatchSize;

    /* renamed from: f, reason: from kotlin metadata */
    public final long uploadInterval;

    /* renamed from: g, reason: from kotlin metadata */
    public final long sessionMaxLength;

    /* renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final I timeProvider;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5041d advertisingIdService;

    /* renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String pubId;

    /* renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String appId;

    /* renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final w dataStoreService;

    /* renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final com.moloco.sdk.internal.ilrd.d sessionInactiveScheduler;

    /* renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final com.moloco.sdk.internal.ilrd.d sessionMaxLengthScheduler;

    /* renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final com.moloco.sdk.internal.ilrd.d scheduledUploadScheduler;

    /* renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Mutex mutex;

    /* renamed from: q, reason: from kotlin metadata */
    @Nullable
    public com.moloco.sdk.internal.ilrd.a session;

    /* renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final List<IlrdRequest.ImpressionLevelRevenue> events;

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$1", f = "IlrdEventsRepository.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Lifecycle b;
        public final /* synthetic */ IlrdEventsRepository c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lifecycle lifecycle, IlrdEventsRepository ilrdEventsRepository, Continuation continuation) {
            super(2, continuation);
            this.b = lifecycle;
            this.c = ilrdEventsRepository;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.addObserver(this.c);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$2", f = "IlrdEventsRepository.kt", l = {499, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public int c;

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
            return IlrdEventsRepository.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            IlrdEventsRepository ilrdEventsRepository;
            Mutex mutex2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = IlrdEventsRepository.this.mutex;
                    ilrdEventsRepository = IlrdEventsRepository.this;
                    this.a = mutex;
                    this.b = ilrdEventsRepository;
                    this.c = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit;
                        } catch (Throwable th) {
                            Mutex mutex3 = mutex2;
                            th = th;
                            mutex = mutex3;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    ilrdEventsRepository = (IlrdEventsRepository) this.b;
                    Mutex mutex4 = (Mutex) this.a;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                }
                this.a = mutex;
                this.b = null;
                this.c = 2;
                if (ilrdEventsRepository.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return unit2;
            } catch (Throwable th2) {
                th = th2;
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* renamed from: com.moloco.sdk.internal.ilrd.IlrdEventsRepository$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void a() {
        }

        @VisibleForTesting
        public static /* synthetic */ void b() {
        }

        public Companion() {
        }

        public final byte[] a(byte[] bArr) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(gZIPOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                    return byteArray;
                } finally {
                }
            } finally {
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$onEvent$1", f = "IlrdEventsRepository.kt", l = {499, 251, 259, 267}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ c.a g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c.a aVar, Continuation continuation) {
            super(2, continuation);
            this.g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new d(this.g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0127 A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:15:0x0030, B:16:0x0121, B:18:0x0127, B:19:0x0129), top: B:14:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f8 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:31:0x0048, B:33:0x00ba, B:35:0x00f8, B:36:0x00fe), top: B:30:0x0048 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x011e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$BooleanRef ref$BooleanRef;
            IlrdEventsRepository ilrdEventsRepository;
            Mutex mutex;
            c.a aVar;
            Mutex mutex2;
            c.a aVar2;
            IlrdEventsRepository ilrdEventsRepository2;
            Ref$BooleanRef ref$BooleanRef2;
            Mutex mutex3;
            Ref$BooleanRef ref$BooleanRef3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ref$BooleanRef = new Ref$BooleanRef();
                    Mutex mutex4 = IlrdEventsRepository.this.mutex;
                    ilrdEventsRepository = IlrdEventsRepository.this;
                    c.a aVar3 = this.g;
                    this.a = ref$BooleanRef;
                    this.b = mutex4;
                    this.c = ilrdEventsRepository;
                    this.d = aVar3;
                    this.e = 1;
                    if (mutex4.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex4;
                    aVar = aVar3;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            ilrdEventsRepository2 = (IlrdEventsRepository) this.c;
                            mutex3 = (Mutex) this.b;
                            ref$BooleanRef3 = (Ref$BooleanRef) this.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                if (ilrdEventsRepository2.h()) {
                                    ref$BooleanRef3.element = true;
                                }
                                Unit unit = Unit.INSTANCE;
                                mutex3.unlock(null);
                                if (ref$BooleanRef3.element) {
                                    IlrdEventsRepository ilrdEventsRepository3 = IlrdEventsRepository.this;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.e = 4;
                                    if (ilrdEventsRepository3.b(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        c.a aVar4 = (c.a) this.d;
                        IlrdEventsRepository ilrdEventsRepository4 = (IlrdEventsRepository) this.c;
                        mutex2 = (Mutex) this.b;
                        ref$BooleanRef2 = (Ref$BooleanRef) this.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            aVar2 = aVar4;
                            ilrdEventsRepository2 = ilrdEventsRepository4;
                            IlrdRequest.ImpressionLevelRevenue a = ilrdEventsRepository2.a(aVar2);
                            List<IlrdRequest.ImpressionLevelRevenue> b = ilrdEventsRepository2.b();
                            Intrinsics.checkNotNull(a);
                            b.add(a);
                            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Event id ");
                            sb.append(a.getEventId());
                            sb.append(" added. Count: ");
                            sb.append(ilrdEventsRepository2.b().size());
                            sb.append(", current events in session: ");
                            com.moloco.sdk.internal.ilrd.a session = ilrdEventsRepository2.getSession();
                            sb.append(session == null ? session.b() : null);
                            MolocoLogger.info$default(molocoLogger, IlrdEventsRepository.u, sb.toString(), null, false, 12, null);
                            this.a = ref$BooleanRef2;
                            this.b = mutex2;
                            this.c = ilrdEventsRepository2;
                            this.d = null;
                            this.e = 3;
                            if (ilrdEventsRepository2.c(this) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex3 = mutex2;
                            ref$BooleanRef3 = ref$BooleanRef2;
                            if (ilrdEventsRepository2.h()) {
                            }
                            Unit unit2 = Unit.INSTANCE;
                            mutex3.unlock(null);
                            if (ref$BooleanRef3.element) {
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex3 = mutex2;
                            mutex3.unlock(null);
                            throw th;
                        }
                    }
                    aVar = (c.a) this.d;
                    ilrdEventsRepository = (IlrdEventsRepository) this.c;
                    mutex = (Mutex) this.b;
                    ref$BooleanRef = (Ref$BooleanRef) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                ilrdEventsRepository.a();
                ilrdEventsRepository.j();
                com.moloco.sdk.internal.ilrd.a session2 = ilrdEventsRepository.getSession();
                if (session2 != null) {
                    session2.a(aVar);
                }
                this.a = ref$BooleanRef;
                this.b = mutex;
                this.c = ilrdEventsRepository;
                this.d = aVar;
                this.e = 2;
                if (ilrdEventsRepository.d(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar2 = aVar;
                ilrdEventsRepository2 = ilrdEventsRepository;
                mutex2 = mutex;
                ref$BooleanRef2 = ref$BooleanRef;
                IlrdRequest.ImpressionLevelRevenue a2 = ilrdEventsRepository2.a(aVar2);
                List<IlrdRequest.ImpressionLevelRevenue> b2 = ilrdEventsRepository2.b();
                Intrinsics.checkNotNull(a2);
                b2.add(a2);
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Event id ");
                sb2.append(a2.getEventId());
                sb2.append(" added. Count: ");
                sb2.append(ilrdEventsRepository2.b().size());
                sb2.append(", current events in session: ");
                com.moloco.sdk.internal.ilrd.a session3 = ilrdEventsRepository2.getSession();
                sb2.append(session3 == null ? session3.b() : null);
                MolocoLogger.info$default(molocoLogger2, IlrdEventsRepository.u, sb2.toString(), null, false, 12, null);
                this.a = ref$BooleanRef2;
                this.b = mutex2;
                this.c = ilrdEventsRepository2;
                this.d = null;
                this.e = 3;
                if (ilrdEventsRepository2.c(this) != coroutine_suspended) {
                }
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
                mutex3 = mutex2;
                mutex3.unlock(null);
                throw th;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", l = {148, 150, 153, 166, 176, 194, 205, 209}, m = "restoreSavedSession")
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return IlrdEventsRepository.this.a(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$restoreSavedSession$restoredSession$1", f = "IlrdEventsRepository.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new com.moloco.sdk.internal.ilrd.a(IlrdEventsRepository.this.timeProvider, this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleInactiveSessionExpiry$1", f = "IlrdEventsRepository.kt", l = {358}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements Function1 {
        public int a;

        public g(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return IlrdEventsRepository.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.a session = IlrdEventsRepository.this.getSession();
                if (session != null) {
                    session.a();
                }
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.a = 1;
                if (ilrdEventsRepository.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleMaxSessionLength$1", f = "IlrdEventsRepository.kt", l = {377}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements Function1 {
        public int a;

        public h(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return IlrdEventsRepository.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.ilrd.a session = IlrdEventsRepository.this.getSession();
                if (session != null) {
                    session.a();
                }
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.a = 1;
                if (ilrdEventsRepository.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleUploadIntervalScheduler$1", f = "IlrdEventsRepository.kt", l = {392}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements Function1 {
        public int a;

        public i(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((i) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return IlrdEventsRepository.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.a = 1;
                if (ilrdEventsRepository.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$sendEvents$1", f = "IlrdEventsRepository.kt", l = {406}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements Function2 {
        public int a;

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.a = 1;
                if (ilrdEventsRepository.b(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", l = {499, 437}, m = "sendEventsSuspending")
    public static final class k extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return IlrdEventsRepository.this.b(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeEventsToPersistentStorage$2", f = "IlrdEventsRepository.kt", l = {448, 455}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements Function2 {
        public int a;

        public l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (IlrdEventsRepository.this.b().isEmpty()) {
                w wVar = IlrdEventsRepository.this.dataStoreService;
                this.a = 1;
                if (wVar.a(IlrdEventsRepository.w, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            String encodeToString = Base64.encodeToString(IlrdRequest.ImpressionRevenueRequest.newBuilder().addAllEvents(IlrdEventsRepository.this.b()).build().toByteArray(), 2);
            w wVar2 = IlrdEventsRepository.this.dataStoreService;
            this.a = 2;
            if (wVar2.a(IlrdEventsRepository.w, encodeToString, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeSessionToPersistentStorage$2", f = "IlrdEventsRepository.kt", l = {130}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.a b;
        public final /* synthetic */ IlrdEventsRepository c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.moloco.sdk.internal.ilrd.a aVar, IlrdEventsRepository ilrdEventsRepository, Continuation continuation) {
            super(2, continuation);
            this.b = aVar;
            this.c = ilrdEventsRepository;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new m(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String f = this.b.f();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, IlrdEventsRepository.u, "Storing current session: " + f, null, false, 12, null);
                w wVar = this.c.dataStoreService;
                this.a = 1;
                if (wVar.a(IlrdEventsRepository.v, f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ IlrdEventsRepository(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, long j2, int i2, long j3, long j4, I i3, Lifecycle lifecycle, InterfaceC5041d interfaceC5041d, String str2, String str3, w wVar, com.moloco.sdk.internal.ilrd.d dVar, com.moloco.sdk.internal.ilrd.d dVar2, com.moloco.sdk.internal.ilrd.d dVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, iVar, j2, i2, j3, j4, i3, lifecycle, interfaceC5041d, str2, str3, wVar, dVar, dVar2, dVar3);
    }

    @VisibleForTesting
    public static /* synthetic */ void c() {
    }

    @Nullable
    /* renamed from: e, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.a getSession() {
        return this.session;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: f, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.d getSessionInactiveScheduler() {
        return this.sessionInactiveScheduler;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: g, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.d getSessionMaxLengthScheduler() {
        return this.sessionMaxLengthScheduler;
    }

    @VisibleForTesting
    public final boolean h() {
        boolean z = this.events.size() >= this.maxBatchSize;
        if (z) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "batch size reached", null, false, 12, null);
        }
        return z;
    }

    public final synchronized void i() {
        a();
        j();
    }

    @VisibleForTesting
    public final void j() {
        this.sessionInactiveScheduler.a(this.sessionExp, new g(null));
    }

    public final void k() {
        this.scheduledUploadScheduler.a(this.uploadInterval, new i(null));
    }

    @VisibleForTesting
    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new j(null), 3, null);
    }

    @VisibleForTesting
    public final void m() {
        com.moloco.sdk.internal.ilrd.a aVar = new com.moloco.sdk.internal.ilrd.a(this.timeProvider, null, 2, null);
        this.session = aVar;
        a(this.sessionMaxLength);
        k();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "New session started: sessionId=" + aVar.c() + ", maxBatch=" + this.maxBatchSize + ", uploadInterval=" + ((Object) Duration.m8170toStringimpl(this.uploadInterval)) + ", sessionExp=" + ((Object) Duration.m8170toStringimpl(this.sessionExp)) + ", maxLength=" + ((Object) Duration.m8170toStringimpl(this.sessionMaxLength)), null, false, 12, null);
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
    public void onPause(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "onPause called, sending events", null, false, 12, null);
        l();
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
    public /* bridge */ /* synthetic */ void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        super.onStop(lifecycleOwner);
    }

    public IlrdEventsRepository(CoroutineScope scope, String url, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, long j2, int i2, long j3, long j4, I timeProvider, Lifecycle processLifeycle, InterfaceC5041d advertisingIdService, String pubId, String appId, w dataStoreService, com.moloco.sdk.internal.ilrd.d sessionInactiveScheduler, com.moloco.sdk.internal.ilrd.d sessionMaxLengthScheduler, com.moloco.sdk.internal.ilrd.d scheduledUploadScheduler) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(processLifeycle, "processLifeycle");
        Intrinsics.checkNotNullParameter(advertisingIdService, "advertisingIdService");
        Intrinsics.checkNotNullParameter(pubId, "pubId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        Intrinsics.checkNotNullParameter(sessionInactiveScheduler, "sessionInactiveScheduler");
        Intrinsics.checkNotNullParameter(sessionMaxLengthScheduler, "sessionMaxLengthScheduler");
        Intrinsics.checkNotNullParameter(scheduledUploadScheduler, "scheduledUploadScheduler");
        this.scope = scope;
        this.url = url;
        this.persistentHttpRequest = persistentHttpRequest;
        this.sessionExp = j2;
        this.maxBatchSize = i2;
        this.uploadInterval = j3;
        this.sessionMaxLength = j4;
        this.timeProvider = timeProvider;
        this.advertisingIdService = advertisingIdService;
        this.pubId = pubId;
        this.appId = appId;
        this.dataStoreService = dataStoreService;
        this.sessionInactiveScheduler = sessionInactiveScheduler;
        this.sessionMaxLengthScheduler = sessionMaxLengthScheduler;
        this.scheduledUploadScheduler = scheduledUploadScheduler;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.events = new ArrayList();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "ILRD repository initialized - url=" + url + ", uploadInterval=" + ((Object) Duration.m8170toStringimpl(j3)) + ", maxBatchSize=" + i2 + ", sessionExpiry=" + ((Object) Duration.m8170toStringimpl(j2)) + ", maxSessionLength=" + ((Object) Duration.m8170toStringimpl(j4)), null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(scope, com.moloco.sdk.internal.scheduling.b.a().getMainImmediate(), null, new a(processLifeycle, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(null), 3, null);
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: d, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.d getScheduledUploadScheduler() {
        return this.scheduledUploadScheduler;
    }

    @NotNull
    public final List<IlrdRequest.ImpressionLevelRevenue> b() {
        return this.events;
    }

    public final Object d(Continuation continuation) {
        Object withContext;
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        return (aVar != null && (withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new m(aVar, this, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|82|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0275, code lost:
    
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.ilrd.IlrdEventsRepository.u, "Failed to restore persisted ILRD events", r0, false, 8, null);
        r0 = r4.dataStoreService;
        r2.a = null;
        r2.b = null;
        r2.e = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0290, code lost:
    
        if (r0.a(com.moloco.sdk.internal.ilrd.IlrdEventsRepository.w, r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0292, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.moloco.sdk.internal.ilrd.IlrdEventsRepository, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        e eVar;
        ?? r4;
        IlrdEventsRepository ilrdEventsRepository;
        String str;
        long duration;
        com.moloco.sdk.internal.ilrd.a aVar;
        String str2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
                Object obj = eVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r4 = eVar.e;
                switch (r4) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        w wVar = this.dataStoreService;
                        eVar.a = this;
                        eVar.e = 1;
                        obj = wVar.d(v, eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ilrdEventsRepository = this;
                        str = (String) obj;
                        if (str != null) {
                            return Unit.INSTANCE;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Existing session found: " + str, null, false, 12, null);
                        w wVar2 = ilrdEventsRepository.dataStoreService;
                        eVar.a = ilrdEventsRepository;
                        eVar.b = str;
                        eVar.e = 2;
                        if (wVar2.a(v, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        f fVar = ilrdEventsRepository.new f(str, null);
                        eVar.a = ilrdEventsRepository;
                        eVar.b = null;
                        eVar.e = 3;
                        obj = BuildersKt.withContext(coroutineContext, fVar, eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.internal.ilrd.a aVar2 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a2 = ilrdEventsRepository.timeProvider.a();
                        Duration.Companion companion = Duration.Companion;
                        long d2 = a2 - aVar2.d();
                        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                        duration = DurationKt.toDuration(d2, durationUnit);
                        long i3 = aVar2.b().i();
                        if (Duration.m8138compareToLRDsOJo(duration, ilrdEventsRepository.sessionMaxLength) > 0) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Discarding restored session - exceeded maximum length.", null, false, 12, null);
                            w wVar3 = ilrdEventsRepository.dataStoreService;
                            eVar.a = null;
                            eVar.e = 4;
                            if (wVar3.a(w, eVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (i3 > 0 && a2 - i3 > Duration.m8147getInWholeMillisecondsimpl(ilrdEventsRepository.sessionExp)) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Discarding restored session - exceeded inactivity timeout", null, false, 12, null);
                            w wVar4 = ilrdEventsRepository.dataStoreService;
                            eVar.a = null;
                            eVar.e = 5;
                            if (wVar4.a(w, eVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        long duration2 = DurationKt.toDuration(a2 - aVar2.d(), durationUnit);
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "ILRD session restored successfully - sessionId=" + aVar2.c() + ", age=" + ((Object) Duration.m8170toStringimpl(duration2)) + ", impressions=" + aVar2.b(), null, false, 12, null);
                        ilrdEventsRepository.session = aVar2;
                        ilrdEventsRepository.k();
                        ilrdEventsRepository.a(Duration.m8163minusLRDsOJo(ilrdEventsRepository.sessionMaxLength, duration));
                        w wVar5 = ilrdEventsRepository.dataStoreService;
                        eVar.a = ilrdEventsRepository;
                        eVar.b = aVar2;
                        eVar.e = 6;
                        Object d3 = wVar5.d(w, eVar);
                        if (d3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = aVar2;
                        obj = d3;
                        str2 = (String) obj;
                        if (str2 != null) {
                            List<IlrdRequest.ImpressionLevelRevenue> eventsList = IlrdRequest.ImpressionRevenueRequest.parseFrom(Base64.decode(str2, 0)).getEventsList();
                            Intrinsics.checkNotNullExpressionValue(eventsList, "getEventsList(...)");
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : eventsList) {
                                if (Intrinsics.areEqual(((IlrdRequest.ImpressionLevelRevenue) obj2).getSessionId(), aVar.c())) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                ilrdEventsRepository.events.addAll(arrayList);
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Restored " + arrayList.size() + " pending ILRD events for sessionId=" + aVar.c(), null, false, 12, null);
                            } else {
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "No pending ILRD events matched restored sessionId=" + aVar.c() + "; clearing persisted events", null, false, 12, null);
                                w wVar6 = ilrdEventsRepository.dataStoreService;
                                eVar.a = ilrdEventsRepository;
                                eVar.b = null;
                                eVar.e = 7;
                                if (wVar6.a(w, eVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ilrdEventsRepository = (IlrdEventsRepository) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        if (str != null) {
                        }
                        break;
                    case 2:
                        String str3 = (String) eVar.b;
                        IlrdEventsRepository ilrdEventsRepository2 = (IlrdEventsRepository) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        str = str3;
                        ilrdEventsRepository = ilrdEventsRepository2;
                        CoroutineContext coroutineContext2 = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                        f fVar2 = ilrdEventsRepository.new f(str, null);
                        eVar.a = ilrdEventsRepository;
                        eVar.b = null;
                        eVar.e = 3;
                        obj = BuildersKt.withContext(coroutineContext2, fVar2, eVar);
                        if (obj == coroutine_suspended) {
                        }
                        com.moloco.sdk.internal.ilrd.a aVar22 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a22 = ilrdEventsRepository.timeProvider.a();
                        Duration.Companion companion2 = Duration.Companion;
                        long d22 = a22 - aVar22.d();
                        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
                        duration = DurationKt.toDuration(d22, durationUnit2);
                        long i32 = aVar22.b().i();
                        if (Duration.m8138compareToLRDsOJo(duration, ilrdEventsRepository.sessionMaxLength) > 0) {
                        }
                        break;
                    case 3:
                        ilrdEventsRepository = (IlrdEventsRepository) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.internal.ilrd.a aVar222 = (com.moloco.sdk.internal.ilrd.a) obj;
                        long a222 = ilrdEventsRepository.timeProvider.a();
                        Duration.Companion companion22 = Duration.Companion;
                        long d222 = a222 - aVar222.d();
                        DurationUnit durationUnit22 = DurationUnit.MILLISECONDS;
                        duration = DurationKt.toDuration(d222, durationUnit22);
                        long i322 = aVar222.b().i();
                        if (Duration.m8138compareToLRDsOJo(duration, ilrdEventsRepository.sessionMaxLength) > 0) {
                        }
                        break;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        com.moloco.sdk.internal.ilrd.a aVar3 = (com.moloco.sdk.internal.ilrd.a) eVar.b;
                        IlrdEventsRepository ilrdEventsRepository3 = (IlrdEventsRepository) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                        ilrdEventsRepository = ilrdEventsRepository3;
                        str2 = (String) obj;
                        if (str2 != null) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(continuation);
        Object obj3 = eVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = eVar.e;
        switch (r4) {
        }
    }

    public final void b(@NotNull c.a ilrdData) {
        Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        BuildersKt.launch(this.scope, EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new d(ilrdData, null));
    }

    public final Object c(Continuation continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getDefault(), new l(null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public /* synthetic */ IlrdEventsRepository(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, long j2, int i2, long j3, long j4, I i3, Lifecycle lifecycle, InterfaceC5041d interfaceC5041d, String str2, String str3, w wVar, com.moloco.sdk.internal.ilrd.d dVar, com.moloco.sdk.internal.ilrd.d dVar2, com.moloco.sdk.internal.ilrd.d dVar3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, iVar, j2, i2, j3, j4, i3, lifecycle, interfaceC5041d, str2, str3, wVar, (i4 & 8192) != 0 ? new com.moloco.sdk.internal.ilrd.d(coroutineScope, i3, "SessionInactiveScheduler") : dVar, (i4 & 16384) != 0 ? new com.moloco.sdk.internal.ilrd.d(coroutineScope, i3, "SessionMaxLengthScheduler") : dVar2, (i4 & 32768) != 0 ? new com.moloco.sdk.internal.ilrd.d(coroutineScope, i3, "UploadIntervalScheduler") : dVar3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0035, B:22:0x0068, B:24:0x0070, B:25:0x0082, B:27:0x009f, B:29:0x00a5, B:30:0x00ac), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0035, B:22:0x0068, B:24:0x0070, B:25:0x0082, B:27:0x009f, B:29:0x00a5, B:30:0x00ac), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        k kVar;
        ?? r2;
        IlrdEventsRepository ilrdEventsRepository;
        Mutex mutex;
        byte[] bArr;
        IlrdEventsRepository ilrdEventsRepository2;
        try {
            if (continuation instanceof k) {
                kVar = (k) continuation;
                int i2 = kVar.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kVar.f = i2 - Integer.MIN_VALUE;
                    Object obj = kVar.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = kVar.f;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        k();
                        Mutex mutex2 = this.mutex;
                        kVar.a = this;
                        kVar.b = mutex2;
                        kVar.f = 1;
                        if (mutex2.lock(null, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ilrdEventsRepository = this;
                        mutex = mutex2;
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bArr = (byte[]) kVar.c;
                            mutex = (Mutex) kVar.b;
                            ilrdEventsRepository2 = (IlrdEventsRepository) kVar.a;
                            ResultKt.throwOnFailure(obj);
                            mutex.unlock(null);
                            if (bArr != null) {
                                ilrdEventsRepository2.persistentHttpRequest.a(ilrdEventsRepository2.url, bArr, ContentType.Application.INSTANCE.getProtoBuf(), "gzip");
                            }
                            return Unit.INSTANCE;
                        }
                        mutex = (Mutex) kVar.b;
                        ilrdEventsRepository = (IlrdEventsRepository) kVar.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!ilrdEventsRepository.events.isEmpty()) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Request for sendEvent came, but event list is empty. Returning", null, false, 12, null);
                        ilrdEventsRepository2 = ilrdEventsRepository;
                        bArr = null;
                    } else {
                        IlrdRequest.ImpressionRevenueRequest.Builder newBuilder = IlrdRequest.ImpressionRevenueRequest.newBuilder();
                        newBuilder.setOs("Android");
                        newBuilder.setPublisherId(ilrdEventsRepository.pubId);
                        newBuilder.setPublisherAppId(ilrdEventsRepository.appId);
                        AbstractC5040c a2 = ilrdEventsRepository.advertisingIdService.a();
                        AbstractC5040c.a aVar = a2 instanceof AbstractC5040c.a ? (AbstractC5040c.a) a2 : null;
                        if (aVar != null) {
                            newBuilder.setDeviceId(aVar.b());
                        }
                        newBuilder.addAllEvents(ilrdEventsRepository.events);
                        IlrdRequest.ImpressionRevenueRequest build = newBuilder.build();
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Ilrd request created now sending it with " + build.getEventsList().size() + " events", null, false, 12, null);
                        Companion companion = INSTANCE;
                        byte[] byteArray = build.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                        byte[] a3 = companion.a(byteArray);
                        ilrdEventsRepository.events.clear();
                        w wVar = ilrdEventsRepository.dataStoreService;
                        kVar.a = ilrdEventsRepository;
                        kVar.b = mutex;
                        kVar.c = a3;
                        kVar.f = 2;
                        if (wVar.a(w, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bArr = a3;
                        ilrdEventsRepository2 = ilrdEventsRepository;
                    }
                    mutex.unlock(null);
                    if (bArr != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            if (r2 != 0) {
            }
            if (!ilrdEventsRepository.events.isEmpty()) {
            }
            mutex.unlock(null);
            if (bArr != null) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            r2.unlock(null);
            throw th;
        }
        kVar = new k(continuation);
        Object obj2 = kVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = kVar.f;
    }

    public final IlrdRequest.ImpressionLevelRevenue a(c.a ilrdData) {
        IlrdRequest.ImpressionLevelRevenue.Builder eventId = IlrdRequest.ImpressionLevelRevenue.newBuilder().setEventId(UUID.randomUUID().toString());
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        if (aVar != null) {
            eventId.setSessionId(aVar.c());
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(this.timeProvider.a() - aVar.d(), DurationUnit.MILLISECONDS);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Event created: sessionId=" + aVar.c() + ", sessionAge=" + ((Object) Duration.m8170toStringimpl(duration)), null, false, 12, null);
        }
        if (ilrdData instanceof c.a.b) {
            eventId.setMax(((c.a.b) ilrdData).b());
        } else {
            if (!(ilrdData instanceof c.a.C1532a)) {
                throw new NoWhenBranchMatchedException();
            }
            eventId.setLevelplay(((c.a.C1532a) ilrdData).b());
        }
        return eventId.build();
    }

    @VisibleForTesting
    public final void a() {
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        if (aVar != null && !aVar.e()) {
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(this.timeProvider.a() - aVar.d(), DurationUnit.MILLISECONDS);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, u, "Session validation - age: " + ((Object) Duration.m8170toStringimpl(duration)) + ", limit: " + ((Object) Duration.m8170toStringimpl(this.sessionMaxLength)), null, false, 12, null);
            return;
        }
        m();
    }

    public final void a(long duration) {
        this.sessionMaxLengthScheduler.a(duration, new h(null));
    }
}
