package io.bidmachine.nativead.tasks;

import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.core.Utils;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.UrlMediaSource;
import io.bidmachine.util.SdkDispatchers;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0011\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0002¢\u0006\u0002\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0011H\u0082@ø\u0001\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lio/bidmachine/nativead/tasks/DownloadVideoTask;", "Ljava/lang/Runnable;", "assetsHolder", "", "repository", "Lio/bidmachine/rendering/Repository;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/bidmachine/nativead/tasks/DownloadVideoTask$OnLoadedListener;", "url", "", "dispatchers", "Lio/bidmachine/util/SdkDispatchers;", "(Ljava/lang/Object;Lio/bidmachine/rendering/Repository;Lio/bidmachine/nativead/tasks/DownloadVideoTask$OnLoadedListener;Ljava/lang/String;Lio/bidmachine/util/SdkDispatchers;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "execute", "Lkotlin/Result;", "Landroid/net/Uri;", "execute-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "run", "", "sendFail", "sendPathSuccess", ShareConstants.MEDIA_URI, "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OnLoadedListener", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DownloadVideoTask implements Runnable {

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
    private final String url;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/nativead/tasks/DownloadVideoTask$OnLoadedListener;", "", "onVideoLoaded", "", "task", "Lio/bidmachine/nativead/tasks/DownloadVideoTask;", "videoFileUri", "Landroid/net/Uri;", "onVideoLoadingError", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnLoadedListener {
        default void onVideoLoaded(@NotNull DownloadVideoTask task, @NotNull Uri videoFileUri) {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
        }

        default void onVideoLoadingError(@NotNull DownloadVideoTask task) {
            Intrinsics.checkNotNullParameter(task, "task");
        }
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
            Object m7854executeIoAF18A = DownloadVideoTask.this.m7854executeIoAF18A(this);
            return m7854executeIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m7854executeIoAF18A : Result.m8022boximpl(m7854executeIoAF18A);
        }
    }

    static final class b extends SuspendLambda implements Function2 {
        int a;

        static final class a extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ DownloadVideoTask b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DownloadVideoTask downloadVideoTask, Continuation continuation) {
                super(2, continuation);
                this.b = downloadVideoTask;
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
                Object m7854executeIoAF18A;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DownloadVideoTask downloadVideoTask = this.b;
                    this.a = 1;
                    m7854executeIoAF18A = downloadVideoTask.m7854executeIoAF18A(this);
                    if (m7854executeIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    m7854executeIoAF18A = ((Result) obj).getValue();
                }
                if (Result.m8028isFailureimpl(m7854executeIoAF18A)) {
                    return null;
                }
                return m7854executeIoAF18A;
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
            return DownloadVideoTask.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = DownloadVideoTask.this.dispatchers.getIo();
                a aVar = new a(DownloadVideoTask.this, null);
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
            Uri uri = (Uri) obj;
            if (uri != null) {
                DownloadVideoTask downloadVideoTask = DownloadVideoTask.this;
                this.a = 2;
                if (downloadVideoTask.sendPathSuccess(uri, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                DownloadVideoTask downloadVideoTask2 = DownloadVideoTask.this;
                this.a = 3;
                if (downloadVideoTask2.sendFail(this) == coroutine_suspended) {
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
            return DownloadVideoTask.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DownloadVideoTask.this.listener.onVideoLoadingError(DownloadVideoTask.this);
            return Unit.INSTANCE;
        }
    }

    static final class e extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Uri c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.c = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DownloadVideoTask.this.new e(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DownloadVideoTask.this.listener.onVideoLoaded(DownloadVideoTask.this, this.c);
            return Unit.INSTANCE;
        }
    }

    public DownloadVideoTask(@NotNull Object assetsHolder, @NotNull Repository repository, @NotNull OnLoadedListener listener, @NotNull String url, @NotNull SdkDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.assetsHolder = assetsHolder;
        this.repository = repository;
        this.listener = listener;
        this.url = url;
        this.dispatchers = dispatchers;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(dispatchers.getMain()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendFail(Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getMain(), new d(null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendPathSuccess(Uri uri, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.getMain(), new e(uri, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /* renamed from: execute-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7854executeIoAF18A(@NotNull Continuation continuation) {
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
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                if (!Utils.isHttpUrl(this.url)) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Invalid http url: " + this.url)));
                }
                Repository repository = this.repository;
                UrlMediaSource urlMediaSource = new UrlMediaSource(this.url, MediaSource.DeliveryType.PRELOAD);
                Object obj2 = this.assetsHolder;
                aVar.c = 1;
                Object mo7896getVideo0E7RQCE = repository.mo7896getVideo0E7RQCE(urlMediaSource, obj2, aVar);
                return mo7896getVideo0E7RQCE == coroutine_suspended ? coroutine_suspended : mo7896getVideo0E7RQCE;
            }
        }
        aVar = new a(continuation);
        Object obj3 = aVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.c;
        if (i == 0) {
        }
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

    public /* synthetic */ DownloadVideoTask(Object obj, Repository repository, OnLoadedListener onLoadedListener, String str, SdkDispatchers sdkDispatchers, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, repository, onLoadedListener, str, (i & 16) != 0 ? SdkDispatchers.INSTANCE.getDefault() : sdkDispatchers);
    }
}
