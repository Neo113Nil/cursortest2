package io.bidmachine.nativead.tasks;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.core.Logger;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import io.bidmachine.rendering.Repository;
import io.bidmachine.util.SdkDispatchers;
import io.bidmachine.util.UtilsKt;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u00150\u0014H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0011\u0010\u001f\u001a\u00020\u001eH\u0082@ø\u0001\u0002¢\u0006\u0002\u0010\u0019J!\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0017H\u0082@ø\u0001\u0002¢\u0006\u0002\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lio/bidmachine/nativead/tasks/DownloadVastVideoTask;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "assetsHolder", "", "repository", "Lio/bidmachine/rendering/Repository;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/bidmachine/nativead/tasks/DownloadVastVideoTask$OnLoadedListener;", "videoTag", "", "dispatchers", "Lio/bidmachine/util/SdkDispatchers;", "(Landroid/content/Context;Ljava/lang/Object;Lio/bidmachine/rendering/Repository;Lio/bidmachine/nativead/tasks/DownloadVastVideoTask$OnLoadedListener;Ljava/lang/String;Lio/bidmachine/util/SdkDispatchers;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "weakContext", "Ljava/lang/ref/WeakReference;", "execute", "Lkotlin/Result;", "Lkotlin/Pair;", "Landroid/net/Uri;", "Lio/bidmachine/iab/vast/VastRequest;", "execute-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoUrl", "getVideoUrl-d1pmJ48", "()Ljava/lang/Object;", "run", "", "sendFail", "sendSuccess", "videoFileUri", "vastRequest", "(Landroid/net/Uri;Lio/bidmachine/iab/vast/VastRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OnLoadedListener", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class DownloadVastVideoTask implements Runnable {

    @NotNull
    private final Object assetsHolder;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final SdkDispatchers dispatchers;

    @NotNull
    private final OnLoadedListener listener;

    @NotNull
    private final Repository repository;

    @NotNull
    private final String videoTag;

    @NotNull
    private final WeakReference<Context> weakContext;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/nativead/tasks/DownloadVastVideoTask$OnLoadedListener;", "", "onVideoLoaded", "", "task", "Lio/bidmachine/nativead/tasks/DownloadVastVideoTask;", "videoFileUri", "Landroid/net/Uri;", "vastRequest", "Lio/bidmachine/iab/vast/VastRequest;", "onVideoLoadingError", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnLoadedListener {
        void onVideoLoaded(@NotNull DownloadVastVideoTask task, @NotNull Uri videoFileUri, @NotNull VastRequest vastRequest);

        void onVideoLoadingError(@NotNull DownloadVastVideoTask task);
    }

    static final class a extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object m7853executeIoAF18A = DownloadVastVideoTask.this.m7853executeIoAF18A(this);
            return m7853executeIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7853executeIoAF18A : Result.m8022boximpl(m7853executeIoAF18A);
        }
    }

    static final class b extends SuspendLambda implements Function2 {
        int a;

        static final class a extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ DownloadVastVideoTask b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DownloadVastVideoTask downloadVastVideoTask, Continuation continuation) {
                super(2, continuation);
                this.b = downloadVastVideoTask;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m7853executeIoAF18A;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DownloadVastVideoTask downloadVastVideoTask = this.b;
                    this.a = 1;
                    m7853executeIoAF18A = downloadVastVideoTask.m7853executeIoAF18A(this);
                    if (m7853executeIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    m7853executeIoAF18A = ((Result) obj).getValue();
                }
                if (Result.m8028isFailureimpl(m7853executeIoAF18A)) {
                    return null;
                }
                return m7853executeIoAF18A;
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DownloadVastVideoTask.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = DownloadVastVideoTask.this.dispatchers.getIo();
                a aVar = new a(DownloadVastVideoTask.this, null);
                this.a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                DownloadVastVideoTask downloadVastVideoTask = DownloadVastVideoTask.this;
                Uri uri = (Uri) pair.getFirst();
                VastRequest vastRequest = (VastRequest) pair.getSecond();
                this.a = 2;
                if (downloadVastVideoTask.sendSuccess(uri, vastRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                DownloadVastVideoTask downloadVastVideoTask2 = DownloadVastVideoTask.this;
                this.a = 3;
                if (downloadVastVideoTask2.sendFail(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function1 {
        final /* synthetic */ CountDownLatch a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CountDownLatch countDownLatch) {
            super(1);
            this.a = countDownLatch;
        }

        public final void a(Throwable th) {
            this.a.countDown();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    static final class d extends SuspendLambda implements Function2 {
        int a;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DownloadVastVideoTask.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DownloadVastVideoTask.this.listener.onVideoLoadingError(DownloadVastVideoTask.this);
            return Unit.INSTANCE;
        }
    }

    static final class e extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Uri c;
        final /* synthetic */ VastRequest d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Uri uri, VastRequest vastRequest, Continuation continuation) {
            super(2, continuation);
            this.c = uri;
            this.d = vastRequest;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DownloadVastVideoTask.this.new e(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DownloadVastVideoTask.this.listener.onVideoLoaded(DownloadVastVideoTask.this, this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    public DownloadVastVideoTask(@NotNull Context context, @NotNull Object assetsHolder, @NotNull Repository repository, @NotNull OnLoadedListener listener, @NotNull String videoTag, @NotNull SdkDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(videoTag, "videoTag");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.assetsHolder = assetsHolder;
        this.repository = repository;
        this.listener = listener;
        this.videoTag = videoTag;
        this.dispatchers = dispatchers;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(dispatchers.getMain()));
        this.weakContext = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getVideoUrl-d1pmJ48, reason: not valid java name */
    public final Object m7852getVideoUrld1pmJ48() {
        MediaFileTag pickedMediaFileTag;
        Context context = this.weakContext.get();
        if (context == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Context is detached")));
        }
        try {
            VastRequest build = VastRequest.newBuilder().setCacheControl(CacheControl.Stream).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …\n                .build()");
            String str = null;
            build.loadVideoWithDataSync(context, this.videoTag, null);
            VastAd vastAd = build.getVastAd();
            if (vastAd != null && (pickedMediaFileTag = vastAd.getPickedMediaFileTag()) != null) {
                str = pickedMediaFileTag.getText();
            }
            String notEmptyOrNull = UtilsKt.notEmptyOrNull(str);
            if (notEmptyOrNull != null) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8023constructorimpl(new Pair(notEmptyOrNull, build));
            }
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Vast video url is empty")));
        } catch (Exception e2) {
            Logger.w(e2);
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendFail(Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getMain(), new d(null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendSuccess(Uri uri, VastRequest vastRequest, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getMain(), new e(uri, vastRequest, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /* renamed from: execute-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7853executeIoAF18A(@NotNull Continuation continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                Object obj = aVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = this.dispatchers.getIo();
                    DownloadVastVideoTask$execute$2 downloadVastVideoTask$execute$2 = new DownloadVastVideoTask$execute$2(this, null);
                    aVar.c = 1;
                    obj = BuildersKt.withContext(io2, downloadVastVideoTask$execute$2, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.c;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        Job launch$default;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new b(null), 3, null);
        launch$default.invokeOnCompletion(new c(countDownLatch));
        try {
            countDownLatch.await();
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ DownloadVastVideoTask(Context context, Object obj, Repository repository, OnLoadedListener onLoadedListener, String str, SdkDispatchers sdkDispatchers, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, repository, onLoadedListener, str, (i & 32) != 0 ? SdkDispatchers.INSTANCE.getDefault() : sdkDispatchers);
    }
}
