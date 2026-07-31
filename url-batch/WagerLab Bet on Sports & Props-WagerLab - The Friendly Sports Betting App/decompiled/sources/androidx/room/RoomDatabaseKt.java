package androidx.room;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.ThreadContextElementKt;

/* compiled from: RoomDatabaseExt.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a9\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\u00020\b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"acquireTransactionThread", "Lkotlin/coroutines/ContinuationInterceptor;", "Ljava/util/concurrent/Executor;", "controlJob", "Lkotlinx/coroutines/Job;", "(Ljava/util/concurrent/Executor;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransactionContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransaction", "R", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class RoomDatabaseKt {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object withTransaction(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        RoomDatabaseKt$withTransaction$1 roomDatabaseKt$withTransaction$1;
        Object coroutine_suspended;
        int i;
        ContinuationInterceptor transactionDispatcher;
        ContinuationInterceptor continuationInterceptor;
        if (continuation instanceof RoomDatabaseKt$withTransaction$1) {
            roomDatabaseKt$withTransaction$1 = (RoomDatabaseKt$withTransaction$1) continuation;
            if ((roomDatabaseKt$withTransaction$1.label & Integer.MIN_VALUE) != 0) {
                roomDatabaseKt$withTransaction$1.label -= Integer.MIN_VALUE;
                Object obj = roomDatabaseKt$withTransaction$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = roomDatabaseKt$withTransaction$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TransactionElement transactionElement = (TransactionElement) roomDatabaseKt$withTransaction$1.getContext().get(TransactionElement.INSTANCE);
                    if (transactionElement != null && (transactionDispatcher = transactionElement.getTransactionDispatcher()) != null) {
                        continuationInterceptor = transactionDispatcher;
                        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$2(roomDatabase, function1, null);
                        roomDatabaseKt$withTransaction$1.L$0 = null;
                        roomDatabaseKt$withTransaction$1.L$1 = null;
                        roomDatabaseKt$withTransaction$1.label = 2;
                        Object withContext = BuildersKt.withContext(continuationInterceptor, roomDatabaseKt$withTransaction$2, roomDatabaseKt$withTransaction$1);
                        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
                    }
                    roomDatabaseKt$withTransaction$1.L$0 = roomDatabase;
                    roomDatabaseKt$withTransaction$1.L$1 = function1;
                    roomDatabaseKt$withTransaction$1.label = 1;
                    obj = createTransactionContext(roomDatabase, roomDatabaseKt$withTransaction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    function1 = (Function1) roomDatabaseKt$withTransaction$1.L$1;
                    roomDatabase = (RoomDatabase) roomDatabaseKt$withTransaction$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                continuationInterceptor = (CoroutineContext) obj;
                RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$22 = new RoomDatabaseKt$withTransaction$2(roomDatabase, function1, null);
                roomDatabaseKt$withTransaction$1.L$0 = null;
                roomDatabaseKt$withTransaction$1.L$1 = null;
                roomDatabaseKt$withTransaction$1.label = 2;
                Object withContext2 = BuildersKt.withContext(continuationInterceptor, roomDatabaseKt$withTransaction$22, roomDatabaseKt$withTransaction$1);
                if (withContext2 == coroutine_suspended) {
                }
            }
        }
        roomDatabaseKt$withTransaction$1 = new RoomDatabaseKt$withTransaction$1(continuation);
        Object obj2 = roomDatabaseKt$withTransaction$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = roomDatabaseKt$withTransaction$1.label;
        if (i != 0) {
        }
        continuationInterceptor = (CoroutineContext) obj2;
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$222 = new RoomDatabaseKt$withTransaction$2(roomDatabase, function1, null);
        roomDatabaseKt$withTransaction$1.L$0 = null;
        roomDatabaseKt$withTransaction$1.L$1 = null;
        roomDatabaseKt$withTransaction$1.label = 2;
        Object withContext22 = BuildersKt.withContext(continuationInterceptor, roomDatabaseKt$withTransaction$222, roomDatabaseKt$withTransaction$1);
        if (withContext22 == coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createTransactionContext(RoomDatabase roomDatabase, Continuation<? super CoroutineContext> continuation) {
        RoomDatabaseKt$createTransactionContext$1 roomDatabaseKt$createTransactionContext$1;
        int i;
        final CompletableJob Job$default;
        RoomDatabase roomDatabase2;
        CompletableJob completableJob;
        if (continuation instanceof RoomDatabaseKt$createTransactionContext$1) {
            roomDatabaseKt$createTransactionContext$1 = (RoomDatabaseKt$createTransactionContext$1) continuation;
            if ((roomDatabaseKt$createTransactionContext$1.label & Integer.MIN_VALUE) != 0) {
                roomDatabaseKt$createTransactionContext$1.label -= Integer.MIN_VALUE;
                Object obj = roomDatabaseKt$createTransactionContext$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = roomDatabaseKt$createTransactionContext$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
                    Job job = (Job) roomDatabaseKt$createTransactionContext$1.getContext().get(Job.INSTANCE);
                    if (job != null) {
                        job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.room.RoomDatabaseKt$createTransactionContext$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                invoke2(th);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th) {
                                Job.DefaultImpls.cancel$default((Job) CompletableJob.this, (CancellationException) null, 1, (Object) null);
                            }
                        });
                    }
                    roomDatabaseKt$createTransactionContext$1.L$0 = roomDatabase;
                    roomDatabaseKt$createTransactionContext$1.L$1 = Job$default;
                    roomDatabaseKt$createTransactionContext$1.label = 1;
                    Object acquireTransactionThread = acquireTransactionThread(roomDatabase.getTransactionExecutor(), Job$default, roomDatabaseKt$createTransactionContext$1);
                    if (acquireTransactionThread == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    roomDatabase2 = roomDatabase;
                    completableJob = Job$default;
                    obj = acquireTransactionThread;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableJob = (CompletableJob) roomDatabaseKt$createTransactionContext$1.L$1;
                    roomDatabase2 = (RoomDatabase) roomDatabaseKt$createTransactionContext$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) obj;
                return continuationInterceptor.plus(new TransactionElement(completableJob, continuationInterceptor)).plus(ThreadContextElementKt.asContextElement(roomDatabase2.getSuspendingTransactionId(), Boxing.boxInt(System.identityHashCode(completableJob))));
            }
        }
        roomDatabaseKt$createTransactionContext$1 = new RoomDatabaseKt$createTransactionContext$1(continuation);
        Object obj2 = roomDatabaseKt$createTransactionContext$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = roomDatabaseKt$createTransactionContext$1.label;
        if (i != 0) {
        }
        ContinuationInterceptor continuationInterceptor2 = (ContinuationInterceptor) obj2;
        return continuationInterceptor2.plus(new TransactionElement(completableJob, continuationInterceptor2)).plus(ThreadContextElementKt.asContextElement(roomDatabase2.getSuspendingTransactionId(), Boxing.boxInt(System.identityHashCode(completableJob))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object acquireTransactionThread(Executor executor, final Job job, Continuation<? super ContinuationInterceptor> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Job.DefaultImpls.cancel$default(Job.this, (CancellationException) null, 1, (Object) null);
            }
        });
        try {
            executor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2

                /* compiled from: RoomDatabaseExt.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabaseExt.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CancellableContinuation<ContinuationInterceptor> $continuation;
                    final /* synthetic */ Job $controlJob;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(CancellableContinuation<? super ContinuationInterceptor> cancellableContinuation, Job job, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$continuation = cancellableContinuation;
                        this.$controlJob = job;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$continuation, this.$controlJob, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                            CancellableContinuation<ContinuationInterceptor> cancellableContinuation = this.$continuation;
                            Result.Companion companion = Result.INSTANCE;
                            CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
                            Intrinsics.checkNotNull(element);
                            cancellableContinuation.resumeWith(Result.m12363constructorimpl(element));
                            this.label = 1;
                            if (this.$controlJob.join(this) == coroutine_suspended) {
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

                @Override // java.lang.Runnable
                public final void run() {
                    BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(cancellableContinuationImpl2, job, null), 1, null);
                }
            });
        } catch (RejectedExecutionException e) {
            cancellableContinuationImpl2.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
