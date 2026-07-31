package com.google.firebase.storage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Storage.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0012\b\u0000\u0010\u0002*\f0\u0003R\b\u0012\u0004\u0012\u0002H\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lcom/google/firebase/storage/StorageTask$SnapshotBase;", "Lcom/google/firebase/storage/StorageTask;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/firebase/storage/TaskState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.storage.StorageKt$taskState$1", f = "Storage.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class StorageKt$taskState$1<T> extends SuspendLambda implements Function2<ProducerScope<? super TaskState<T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ StorageTask<T> $this_taskState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StorageKt$taskState$1(StorageTask<T> storageTask, Continuation<? super StorageKt$taskState$1> continuation) {
        super(2, continuation);
        this.$this_taskState = storageTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StorageKt$taskState$1 storageKt$taskState$1 = new StorageKt$taskState$1(this.$this_taskState, continuation);
        storageKt$taskState$1.L$0 = obj;
        return storageKt$taskState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super TaskState<T>> producerScope, Continuation<? super Unit> continuation) {
        return ((StorageKt$taskState$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final OnProgressListener<? super T> onProgressListener = new OnProgressListener() { // from class: com.google.firebase.storage.StorageKt$taskState$1$$ExternalSyntheticLambda1
                @Override // com.google.firebase.storage.OnProgressListener
                public final void onProgress(Object obj2) {
                    StorageKt$taskState$1.invokeSuspend$lambda$1(ProducerScope.this, (StorageTask.SnapshotBase) obj2);
                }
            };
            final OnPausedListener<? super T> onPausedListener = new OnPausedListener() { // from class: com.google.firebase.storage.StorageKt$taskState$1$$ExternalSyntheticLambda2
                @Override // com.google.firebase.storage.OnPausedListener
                public final void onPaused(Object obj2) {
                    StorageKt$taskState$1.invokeSuspend$lambda$3(ProducerScope.this, (StorageTask.SnapshotBase) obj2);
                }
            };
            final OnCompleteListener<T> onCompleteListener = new OnCompleteListener() { // from class: com.google.firebase.storage.StorageKt$taskState$1$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    StorageKt$taskState$1.invokeSuspend$lambda$4(ProducerScope.this, task);
                }
            };
            this.$this_taskState.addOnProgressListener(onProgressListener);
            this.$this_taskState.addOnPausedListener(onPausedListener);
            this.$this_taskState.addOnCompleteListener(onCompleteListener);
            final StorageTask<T> storageTask = this.$this_taskState;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.google.firebase.storage.StorageKt$taskState$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$5;
                    invokeSuspend$lambda$5 = StorageKt$taskState$1.invokeSuspend$lambda$5(StorageTask.this, onProgressListener, onPausedListener, onCompleteListener);
                    return invokeSuspend$lambda$5;
                }
            }, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(final ProducerScope producerScope, final StorageTask.SnapshotBase snapshotBase) {
        StorageTaskScheduler.getInstance().scheduleCallback(new Runnable() { // from class: com.google.firebase.storage.StorageKt$taskState$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                StorageKt$taskState$1.invokeSuspend$lambda$1$lambda$0(ProducerScope.this, snapshotBase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(ProducerScope producerScope, StorageTask.SnapshotBase snapshotBase) {
        ChannelsKt.trySendBlocking(producerScope, new TaskState.InProgress(snapshotBase));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(final ProducerScope producerScope, final StorageTask.SnapshotBase snapshotBase) {
        StorageTaskScheduler.getInstance().scheduleCallback(new Runnable() { // from class: com.google.firebase.storage.StorageKt$taskState$1$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                StorageKt$taskState$1.invokeSuspend$lambda$3$lambda$2(ProducerScope.this, snapshotBase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(ProducerScope producerScope, StorageTask.SnapshotBase snapshotBase) {
        ChannelsKt.trySendBlocking(producerScope, new TaskState.Paused(snapshotBase));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(ProducerScope producerScope, Task task) {
        if (task.isSuccessful()) {
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        } else {
            CoroutineScopeKt.cancel(producerScope, "Error getting the TaskState", task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(StorageTask storageTask, OnProgressListener onProgressListener, OnPausedListener onPausedListener, OnCompleteListener onCompleteListener) {
        storageTask.removeOnProgressListener(onProgressListener);
        storageTask.removeOnPausedListener(onPausedListener);
        storageTask.removeOnCompleteListener(onCompleteListener);
        return Unit.INSTANCE;
    }
}
