package com.ogury.core.internal.datastore.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$readAndInit$api$1", "Lcom/ogury/core/internal/datastore/datastore/core/InitializerApi;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ Ref$ObjectRef<T> $initData;
    final /* synthetic */ Ref$BooleanRef $initializationComplete;
    final /* synthetic */ Mutex $updateLock;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    public SingleProcessDataStore$readAndInit$api$1(Mutex mutex, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<T> ref$ObjectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.$updateLock = mutex;
        this.$initializationComplete = ref$BooleanRef;
        this.$initData = ref$ObjectRef;
        this.this$0 = singleProcessDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.ogury.core.internal.datastore.datastore.core.InitializerApi
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateData(@NotNull Function2 function2, @NotNull Continuation continuation) {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        int i;
        Mutex mutex;
        SingleProcessDataStore singleProcessDataStore;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef<T> ref$ObjectRef;
        Mutex mutex2;
        Mutex mutex3;
        SingleProcessDataStore singleProcessDataStore2;
        T t;
        Ref$ObjectRef<T> ref$ObjectRef2;
        try {
            if (continuation instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) continuation;
                int i2 = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$readAndInit$api$1$updateData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = singleProcessDataStore$readAndInit$api$1$updateData$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.$updateLock;
                        Ref$BooleanRef ref$BooleanRef2 = this.$initializationComplete;
                        Ref$ObjectRef<T> ref$ObjectRef3 = this.$initData;
                        singleProcessDataStore = this.this$0;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = function2;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = mutex;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = ref$BooleanRef2;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = ref$ObjectRef3;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = singleProcessDataStore;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.label = 1;
                        if (mutex.lock(null, singleProcessDataStore$readAndInit$api$1$updateData$1) != coroutine_suspended) {
                            ref$BooleanRef = ref$BooleanRef2;
                            ref$ObjectRef = ref$ObjectRef3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t = (T) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                            ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                            mutex2 = (Mutex) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                ref$ObjectRef2.element = t;
                                ref$ObjectRef = ref$ObjectRef2;
                                T t2 = ref$ObjectRef.element;
                                mutex2.unlock(null);
                                return t2;
                            } catch (Throwable th) {
                                th = th;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                        ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                        mutex3 = (Mutex) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            singleProcessDataStore2 = singleProcessDataStore3;
                            if (!Intrinsics.areEqual(obj, ref$ObjectRef.element)) {
                                mutex2 = mutex3;
                                T t22 = ref$ObjectRef.element;
                                mutex2.unlock(null);
                                return t22;
                            }
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = mutex3;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                            if (singleProcessDataStore2.writeData$sdk_core_prodRelease(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) != coroutine_suspended) {
                                t = (T) obj;
                                ref$ObjectRef2 = ref$ObjectRef;
                                mutex2 = mutex3;
                                ref$ObjectRef2.element = t;
                                ref$ObjectRef = ref$ObjectRef2;
                                T t222 = ref$ObjectRef.element;
                                mutex2.unlock(null);
                                return t222;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2 = mutex3;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$4;
                    ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$3;
                    ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                    Mutex mutex4 = (Mutex) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                    Function2 function22 = (Function2) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                    singleProcessDataStore = singleProcessDataStore4;
                    function2 = function22;
                    if (!ref$BooleanRef.element) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    T t3 = ref$ObjectRef.element;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = mutex;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = singleProcessDataStore;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = null;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = null;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.label = 2;
                    Object invoke = function2.invoke(t3, singleProcessDataStore$readAndInit$api$1$updateData$1);
                    if (invoke != coroutine_suspended) {
                        mutex3 = mutex;
                        obj = invoke;
                        singleProcessDataStore2 = singleProcessDataStore;
                        if (!Intrinsics.areEqual(obj, ref$ObjectRef.element)) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (!ref$BooleanRef.element) {
            }
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInit$api$1$updateData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
        if (i != 0) {
        }
    }
}
