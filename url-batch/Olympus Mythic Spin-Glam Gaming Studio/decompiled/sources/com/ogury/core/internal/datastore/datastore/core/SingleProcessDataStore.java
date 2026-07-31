package com.ogury.core.internal.datastore.datastore.core;

import android.util.Log;
import androidx.annotation.GuardedBy;
import com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore;
import com.ogury.core.internal.datastore.datastore.core.handlers.NoOpCorruptionHandler;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 O*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003OPQBy\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00120\b\u0002\u0010\u000e\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t0\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\fH\u0082@¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b$\u0010 J<\u0010(\u001a\u00028\u00002\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010+J4\u0010,\u001a\u00028\u00002\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u00020\f2\u0006\u0010.\u001a\u00028\u0000H\u0080@¢\u0006\u0004\b/\u00100R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00105R \u00107\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR&\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0C8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bE\u0010F\u0012\u0004\bG\u0010HR@\u0010I\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR \u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore;", "T", "Lcom/ogury/core/internal/datastore/datastore/core/DataStore;", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lcom/ogury/core/internal/datastore/datastore/core/Serializer;", "serializer", "", "Lkotlin/Function2;", "Lcom/ogury/core/internal/datastore/datastore/core/InitializerApi;", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Lcom/ogury/core/internal/datastore/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "temp", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/ogury/core/internal/datastore/datastore/core/Serializer;Ljava/util/List;Lcom/ogury/core/internal/datastore/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;I)V", "Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message$Read;", "read", "handleRead", "(Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message$Read;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message$Update;", "update", "handleUpdate", "(Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateFailure", "readAndInit", "readDataOrHandleCorruption", "readData", "transform", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "transformAndWrite", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "(Ljava/io/File;)V", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "writeData$sdk_core_prodRelease", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "Lkotlin/jvm/functions/Function0;", "Lcom/ogury/core/internal/datastore/datastore/core/Serializer;", "Lcom/ogury/core/internal/datastore/datastore/core/CorruptionHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "", "SCRATCH_SUFFIX", "Ljava/lang/String;", "file$delegate", "Lkotlin/Lazy;", "getFile", "()Ljava/io/File;", "file", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ogury/core/internal/datastore/datastore/core/State;", "downstreamFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getDownstreamFlow$annotations", "()V", "initTasks", "Ljava/util/List;", "Lcom/ogury/core/internal/datastore/datastore/core/SimpleActor;", "Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message;", "actor", "Lcom/ogury/core/internal/datastore/datastore/core/SimpleActor;", "Companion", "Message", "UncloseableOutputStream", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleProcessDataStore<T> implements DataStore<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @GuardedBy
    @NotNull
    private static final Set<String> activeFiles = new LinkedHashSet();

    @NotNull
    private static final Object activeFilesLock = new Object();

    @NotNull
    private final String SCRATCH_SUFFIX;

    @NotNull
    private final SimpleActor<Message<T>> actor;

    @NotNull
    private final CorruptionHandler<T> corruptionHandler;

    @NotNull
    private final Flow data;

    @NotNull
    private final MutableStateFlow downstreamFlow;

    /* renamed from: file$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy file;

    @Nullable
    private List<? extends Function2> initTasks;

    @NotNull
    private final Function0 produceFile;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final Serializer<T> serializer;

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$sdk_core_prodRelease", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$sdk_core_prodRelease", "()Ljava/lang/Object;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getActiveFiles$sdk_core_prodRelease() {
            return SingleProcessDataStore.activeFiles;
        }

        @NotNull
        public final Object getActiveFilesLock$sdk_core_prodRelease() {
            return SingleProcessDataStore.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message;", "T", "", "()V", "lastState", "Lcom/ogury/core/internal/datastore/datastore/core/State;", "getLastState", "()Lcom/ogury/core/internal/datastore/datastore/core/State;", "Read", "Update", "Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message$Read;", "Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message$Update;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Message<T> {

        /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message$Read;", "T", "Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message;", "lastState", "Lcom/ogury/core/internal/datastore/datastore/core/State;", "(Lcom/ogury/core/internal/datastore/datastore/core/State;)V", "getLastState", "()Lcom/ogury/core/internal/datastore/datastore/core/State;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Read<T> extends Message<T> {

            @Nullable
            private final State<T> lastState;

            public Read(@Nullable State<T> state) {
                super(null);
                this.lastState = state;
            }

            @Override // com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore.Message
            @Nullable
            public State<T> getLastState() {
                return this.lastState;
            }
        }

        /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002BQ\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message$Update;", "T", "Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "transform", "Lkotlinx/coroutines/CompletableDeferred;", "ack", "Lcom/ogury/core/internal/datastore/datastore/core/State;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Lcom/ogury/core/internal/datastore/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/jvm/functions/Function2;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Lkotlinx/coroutines/CompletableDeferred;", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", "Lcom/ogury/core/internal/datastore/datastore/core/State;", "getLastState", "()Lcom/ogury/core/internal/datastore/datastore/core/State;", "Lkotlin/coroutines/CoroutineContext;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Update<T> extends Message<T> {

            @NotNull
            private final CompletableDeferred ack;

            @NotNull
            private final CoroutineContext callerContext;

            @Nullable
            private final State<T> lastState;

            @NotNull
            private final Function2 transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Update(@NotNull Function2 transform, @NotNull CompletableDeferred ack, @Nullable State<T> state, @NotNull CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = state;
                this.callerContext = callerContext;
            }

            @NotNull
            public final CompletableDeferred getAck() {
                return this.ack;
            }

            @NotNull
            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            @Override // com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore.Message
            @Nullable
            public State<T> getLastState() {
                return this.lastState;
            }

            @NotNull
            public final Function2 getTransform() {
                return this.transform;
            }
        }

        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public abstract State<T> getLastState();

        private Message() {
        }
    }

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$UncloseableOutputStream;", "Ljava/io/OutputStream;", "fileOutputStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;)V", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "close", "", "flush", "write", "b", "", "bytes", "off", "", "len", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UncloseableOutputStream extends OutputStream {

        @NotNull
        private final FileOutputStream fileOutputStream;

        public UncloseableOutputStream(@NotNull FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.fileOutputStream.flush();
        }

        @NotNull
        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int b) {
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] b) {
            Intrinsics.checkNotNullParameter(b, "b");
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bytes, int off, int len) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.fileOutputStream.write(bytes, off, len);
        }
    }

    public SingleProcessDataStore(@NotNull Function0 produceFile, @NotNull Serializer<T> serializer, @NotNull List<? extends Function2> initTasksList, @NotNull CorruptionHandler<T> corruptionHandler, @NotNull CoroutineScope scope, int i) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        Log.d("SingleProcessDataStore", "init SingleProcessDataStore num " + i);
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = LazyKt.lazy(new Function0(this) { // from class: com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore$file$2
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final File mo4828invoke() {
                Function0 function0;
                function0 = ((SingleProcessDataStore) this.this$0).produceFile;
                File file = (File) function0.mo4828invoke();
                String absolutePath = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                synchronized (companion.getActiveFilesLock$sdk_core_prodRelease()) {
                    if (companion.getActiveFiles$sdk_core_prodRelease().contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> activeFiles$sdk_core_prodRelease = companion.getActiveFiles$sdk_core_prodRelease();
                    Intrinsics.checkNotNull(absolutePath);
                    activeFiles$sdk_core_prodRelease.add(absolutePath);
                }
                return file;
            }
        });
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        Intrinsics.checkNotNull(unInitialized, "null cannot be cast to non-null type com.ogury.core.internal.datastore.datastore.core.State<T of com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore>");
        this.downstreamFlow = StateFlowKt.MutableStateFlow(unInitialized);
        this.initTasks = CollectionsKt.toList(initTasksList);
        this.actor = new SimpleActor<>(scope, new Function1(this) { // from class: com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Throwable th) {
                File file;
                MutableStateFlow mutableStateFlow;
                if (th != null) {
                    mutableStateFlow = ((SingleProcessDataStore) this.this$0).downstreamFlow;
                    mutableStateFlow.setValue(new Final(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object activeFilesLock$sdk_core_prodRelease = companion.getActiveFilesLock$sdk_core_prodRelease();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (activeFilesLock$sdk_core_prodRelease) {
                    Set<String> activeFiles$sdk_core_prodRelease = companion.getActiveFiles$sdk_core_prodRelease();
                    file = singleProcessDataStore.getFile();
                    activeFiles$sdk_core_prodRelease.remove(file.getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }, new Function2() { // from class: com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore$actor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((SingleProcessDataStore.Message) obj, (Throwable) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SingleProcessDataStore.Message<T> msg, @Nullable Throwable th) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg instanceof SingleProcessDataStore.Message.Update) {
                    CompletableDeferred ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.completeExceptionally(th);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    private static /* synthetic */ void getDownstreamFlow$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read<T> read, Continuation continuation) {
        State<T> state = (State) this.downstreamFlow.getValue();
        if (!(state instanceof Data)) {
            if (state instanceof ReadException) {
                if (state == read.getLastState()) {
                    Object readAndInitOrPropagateFailure = readAndInitOrPropagateFailure(continuation);
                    return readAndInitOrPropagateFailure == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? readAndInitOrPropagateFailure : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.areEqual(state, UnInitialized.INSTANCE)) {
                    Object readAndInitOrPropagateFailure2 = readAndInitOrPropagateFailure(continuation);
                    return readAndInitOrPropagateFailure2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? readAndInitOrPropagateFailure2 : Unit.INSTANCE;
                }
                if (state instanceof Final) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(6:(1:(1:(2:12|13))(3:15|16|17))|24|25|20|21|22)(5:26|27|28|(2:30|(1:32)(4:33|20|21|22))(3:34|(1:36)(1:51)|(2:38|(2:40|(2:42|17))(2:43|44))(2:45|(2:47|48)(2:49|50)))|19)))|57|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        if (r10 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0044, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Message.Update<T> update, Continuation continuation) {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        int i;
        Object m8023constructorimpl;
        ?? r9;
        State<T> state;
        SingleProcessDataStore<T> singleProcessDataStore;
        Message.Update<T> update2;
        Message.Update<T> update3;
        if (continuation instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) continuation;
            int i2 = singleProcessDataStore$handleUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$handleUpdate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$handleUpdate$1.label;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Message.Update<T> update4 = (Message.Update<T>) ((CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$2);
                            singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$handleUpdate$1.L$1;
                            update2 = (Message.Update) singleProcessDataStore$handleUpdate$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            update3 = update4;
                            Function2 transform = update2.getTransform();
                            CoroutineContext callerContext = update2.getCallerContext();
                            singleProcessDataStore$handleUpdate$1.L$0 = update3;
                            singleProcessDataStore$handleUpdate$1.L$1 = null;
                            singleProcessDataStore$handleUpdate$1.L$2 = null;
                            singleProcessDataStore$handleUpdate$1.label = 3;
                            obj = singleProcessDataStore.transformAndWrite(transform, callerContext, singleProcessDataStore$handleUpdate$1);
                            update = update3;
                        } else if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    Message.Update<T> update5 = (Message.Update<T>) ((CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$0);
                    ResultKt.throwOnFailure(obj);
                    update = update5;
                    m8023constructorimpl = Result.m8023constructorimpl(obj);
                    r9 = update;
                    CompletableDeferredKt.completeWith(r9, m8023constructorimpl);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                ?? ack = update.getAck();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    state = (State) this.downstreamFlow.getValue();
                } catch (Throwable th) {
                    th = th;
                    update = ack;
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                    r9 = update;
                    CompletableDeferredKt.completeWith(r9, m8023constructorimpl);
                    return Unit.INSTANCE;
                }
                if (state instanceof Data) {
                    Function2 transform2 = update.getTransform();
                    CoroutineContext callerContext2 = update.getCallerContext();
                    singleProcessDataStore$handleUpdate$1.L$0 = ack;
                    singleProcessDataStore$handleUpdate$1.label = 1;
                    Object transformAndWrite = transformAndWrite(transform2, callerContext2, singleProcessDataStore$handleUpdate$1);
                    if (transformAndWrite != coroutine_suspended) {
                        obj = transformAndWrite;
                        update = ack;
                        m8023constructorimpl = Result.m8023constructorimpl(obj);
                        r9 = update;
                        CompletableDeferredKt.completeWith(r9, m8023constructorimpl);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (!(state instanceof ReadException)) {
                        z = state instanceof UnInitialized;
                    }
                    if (!z) {
                        if (state instanceof Final) {
                            throw ((Final) state).getFinalException();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (state != update.getLastState()) {
                        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.ogury.core.internal.datastore.datastore.core.ReadException<T of com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore.handleUpdate$lambda$0>");
                        throw ((ReadException) state).getReadException();
                    }
                    singleProcessDataStore$handleUpdate$1.L$0 = update;
                    singleProcessDataStore$handleUpdate$1.L$1 = this;
                    singleProcessDataStore$handleUpdate$1.L$2 = ack;
                    singleProcessDataStore$handleUpdate$1.label = 2;
                    if (readAndInitOrPropagateAndThrowFailure(singleProcessDataStore$handleUpdate$1) != coroutine_suspended) {
                        singleProcessDataStore = this;
                        update2 = update;
                        update3 = ack;
                        Function2 transform3 = update2.getTransform();
                        CoroutineContext callerContext3 = update2.getCallerContext();
                        singleProcessDataStore$handleUpdate$1.L$0 = update3;
                        singleProcessDataStore$handleUpdate$1.L$1 = null;
                        singleProcessDataStore$handleUpdate$1.L$2 = null;
                        singleProcessDataStore$handleUpdate$1.label = 3;
                        obj = singleProcessDataStore.transformAndWrite(transform3, callerContext3, singleProcessDataStore$handleUpdate$1);
                        update = update3;
                    }
                }
                return coroutine_suspended;
            }
        }
        singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(this, continuation);
        Object obj2 = singleProcessDataStore$handleUpdate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$handleUpdate$1.label;
        boolean z2 = true;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInit(Continuation continuation) {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        Object coroutine_suspended;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        SingleProcessDataStore<T> singleProcessDataStore;
        Mutex mutex;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        List<? extends Function2> list;
        Iterator<T> it;
        Ref$BooleanRef ref$BooleanRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Mutex mutex2;
        SingleProcessDataStore<T> singleProcessDataStore2;
        if (continuation instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) continuation;
            int i2 = singleProcessDataStore$readAndInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.label = i2 - Integer.MIN_VALUE;
                T t = (T) singleProcessDataStore$readAndInit$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(t);
                    if (!Intrinsics.areEqual(this.downstreamFlow.getValue(), UnInitialized.INSTANCE) && !(this.downstreamFlow.getValue() instanceof ReadException)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Mutex Mutex$default = MutexKt.Mutex$default(false, 1, null);
                    ref$ObjectRef = new Ref$ObjectRef();
                    singleProcessDataStore$readAndInit$1.L$0 = this;
                    singleProcessDataStore$readAndInit$1.L$1 = Mutex$default;
                    singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$1.L$3 = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$1.label = 1;
                    Object readDataOrHandleCorruption = readDataOrHandleCorruption(singleProcessDataStore$readAndInit$1);
                    if (readDataOrHandleCorruption != coroutine_suspended) {
                        singleProcessDataStore = this;
                        mutex = Mutex$default;
                        ref$ObjectRef2 = ref$ObjectRef;
                        t = (T) readDataOrHandleCorruption;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) singleProcessDataStore$readAndInit$1.L$3;
                        ref$BooleanRef2 = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.L$2;
                        ref$ObjectRef3 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$1;
                        singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                        ResultKt.throwOnFailure(t);
                        try {
                            ref$BooleanRef2.element = true;
                            Unit unit = Unit.INSTANCE;
                            mutex2.unlock(null);
                            MutableStateFlow mutableStateFlow = singleProcessDataStore2.downstreamFlow;
                            T t2 = ref$ObjectRef3.element;
                            mutableStateFlow.setValue(new Data(t2, t2 != null ? t2.hashCode() : 0));
                            return unit;
                        } catch (Throwable th) {
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    it = (Iterator) singleProcessDataStore$readAndInit$1.L$5;
                    singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) singleProcessDataStore$readAndInit$1.L$4;
                    ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.L$3;
                    ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                    mutex = (Mutex) singleProcessDataStore$readAndInit$1.L$1;
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                    ResultKt.throwOnFailure(t);
                    while (it.hasNext()) {
                        Function2 function2 = (Function2) it.next();
                        singleProcessDataStore$readAndInit$1.L$0 = singleProcessDataStore;
                        singleProcessDataStore$readAndInit$1.L$1 = mutex;
                        singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef2;
                        singleProcessDataStore$readAndInit$1.L$3 = ref$BooleanRef;
                        singleProcessDataStore$readAndInit$1.L$4 = singleProcessDataStore$readAndInit$api$1;
                        singleProcessDataStore$readAndInit$1.L$5 = it;
                        singleProcessDataStore$readAndInit$1.label = 2;
                        if (function2.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == coroutine_suspended) {
                            break;
                        }
                    }
                    ref$BooleanRef2 = ref$BooleanRef;
                    singleProcessDataStore.initTasks = null;
                    singleProcessDataStore$readAndInit$1.L$0 = singleProcessDataStore;
                    singleProcessDataStore$readAndInit$1.L$1 = ref$ObjectRef2;
                    singleProcessDataStore$readAndInit$1.L$2 = ref$BooleanRef2;
                    singleProcessDataStore$readAndInit$1.L$3 = mutex;
                    singleProcessDataStore$readAndInit$1.L$4 = null;
                    singleProcessDataStore$readAndInit$1.L$5 = null;
                    singleProcessDataStore$readAndInit$1.label = 3;
                    if (mutex.lock(null, singleProcessDataStore$readAndInit$1) != coroutine_suspended) {
                        ref$ObjectRef3 = ref$ObjectRef2;
                        mutex2 = mutex;
                        singleProcessDataStore2 = singleProcessDataStore;
                        ref$BooleanRef2.element = true;
                        Unit unit2 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        MutableStateFlow mutableStateFlow2 = singleProcessDataStore2.downstreamFlow;
                        T t22 = ref$ObjectRef3.element;
                        mutableStateFlow2.setValue(new Data(t22, t22 != null ? t22.hashCode() : 0));
                        return unit2;
                    }
                    return coroutine_suspended;
                }
                ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$3;
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                Mutex mutex3 = (Mutex) singleProcessDataStore$readAndInit$1.L$1;
                SingleProcessDataStore<T> singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                ResultKt.throwOnFailure(t);
                mutex = mutex3;
                singleProcessDataStore = singleProcessDataStore3;
                ref$ObjectRef2 = ref$ObjectRef4;
                ref$ObjectRef.element = t;
                ref$BooleanRef = new Ref$BooleanRef();
                singleProcessDataStore$readAndInit$api$1 = new SingleProcessDataStore$readAndInit$api$1(mutex, ref$BooleanRef, ref$ObjectRef2, singleProcessDataStore);
                list = singleProcessDataStore.initTasks;
                if (list != null) {
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                }
                ref$BooleanRef2 = ref$BooleanRef;
                singleProcessDataStore.initTasks = null;
                singleProcessDataStore$readAndInit$1.L$0 = singleProcessDataStore;
                singleProcessDataStore$readAndInit$1.L$1 = ref$ObjectRef2;
                singleProcessDataStore$readAndInit$1.L$2 = ref$BooleanRef2;
                singleProcessDataStore$readAndInit$1.L$3 = mutex;
                singleProcessDataStore$readAndInit$1.L$4 = null;
                singleProcessDataStore$readAndInit$1.L$5 = null;
                singleProcessDataStore$readAndInit$1.label = 3;
                if (mutex.lock(null, singleProcessDataStore$readAndInit$1) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, continuation);
        T t3 = (T) singleProcessDataStore$readAndInit$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInit$1.label;
        if (i != 0) {
        }
        ref$ObjectRef.element = t3;
        ref$BooleanRef = new Ref$BooleanRef();
        singleProcessDataStore$readAndInit$api$1 = new SingleProcessDataStore$readAndInit$api$1(mutex, ref$BooleanRef, ref$ObjectRef2, singleProcessDataStore);
        list = singleProcessDataStore.initTasks;
        if (list != null) {
        }
        ref$BooleanRef2 = ref$BooleanRef;
        singleProcessDataStore.initTasks = null;
        singleProcessDataStore$readAndInit$1.L$0 = singleProcessDataStore;
        singleProcessDataStore$readAndInit$1.L$1 = ref$ObjectRef2;
        singleProcessDataStore$readAndInit$1.L$2 = ref$BooleanRef2;
        singleProcessDataStore$readAndInit$1.L$3 = mutex;
        singleProcessDataStore$readAndInit$1.L$4 = null;
        singleProcessDataStore$readAndInit$1.L$5 = null;
        singleProcessDataStore$readAndInit$1.label = 3;
        if (mutex.lock(null, singleProcessDataStore$readAndInit$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation continuation) {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        int i;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) continuation;
            int i2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                        if (readAndInit(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateFailure(Continuation continuation) {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        int i;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) continuation;
            int i2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0 = this;
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.label = 1;
                        if (readAndInit(singleProcessDataStore$readAndInitOrPropagateFailure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readData(Continuation continuation) {
        ?? r0;
        int i;
        Closeable closeable;
        Throwable th;
        try {
            if (continuation instanceof SingleProcessDataStore$readData$1) {
                SingleProcessDataStore$readData$1 singleProcessDataStore$readData$1 = (SingleProcessDataStore$readData$1) continuation;
                int i2 = singleProcessDataStore$readData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$readData$1.label = i2 - Integer.MIN_VALUE;
                    r0 = singleProcessDataStore$readData$1;
                    Object obj = r0.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = r0.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            FileInputStream fileInputStream = new FileInputStream(getFile());
                            try {
                                Serializer<T> serializer = this.serializer;
                                r0.L$0 = this;
                                r0.L$1 = fileInputStream;
                                r0.label = 1;
                                Object readFrom = serializer.readFrom(fileInputStream, r0);
                                if (readFrom == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                closeable = fileInputStream;
                                obj = readFrom;
                            } catch (Throwable th2) {
                                closeable = fileInputStream;
                                th = th2;
                                r0 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e) {
                            e = e;
                            r0 = this;
                            if (r0.getFile().exists()) {
                                throw e;
                            }
                            return r0.serializer.getDefaultValue();
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) r0.L$1;
                        r0 = (SingleProcessDataStore) r0.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(closeable, th);
                                throw th4;
                            }
                        }
                    }
                    CloseableKt.closeFinally(closeable, null);
                    return obj;
                }
            }
            if (i != 0) {
            }
            CloseableKt.closeFinally(closeable, null);
            return obj;
        } catch (FileNotFoundException e2) {
            e = e2;
        }
        r0 = new SingleProcessDataStore$readData$1(this, continuation);
        Object obj2 = r0.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r0.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataOrHandleCorruption(Continuation continuation) {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        Object coroutine_suspended;
        int i;
        SingleProcessDataStore singleProcessDataStore;
        Object handleCorruption;
        CorruptionException corruptionException;
        SingleProcessDataStore singleProcessDataStore2;
        CorruptionException corruptionException2;
        if (continuation instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) continuation;
            int i2 = singleProcessDataStore$readDataOrHandleCorruption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 1;
                        Object readData = readData(singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (readData != coroutine_suspended) {
                            return readData;
                        }
                    } catch (CorruptionException e) {
                        e = e;
                        singleProcessDataStore = this;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj2 = singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                            corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                return obj2;
                            } catch (IOException e2) {
                                e = e2;
                                ExceptionsKt.addSuppressed(corruptionException2, e);
                                throw corruptionException2;
                            }
                        }
                        corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                        SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        singleProcessDataStore2 = singleProcessDataStore3;
                        try {
                            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                            singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                            singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                            return singleProcessDataStore2.writeData$sdk_core_prodRelease(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != coroutine_suspended ? coroutine_suspended : obj;
                        } catch (IOException e3) {
                            e = e3;
                            corruptionException2 = corruptionException;
                            ExceptionsKt.addSuppressed(corruptionException2, e);
                            throw corruptionException2;
                        }
                    }
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (CorruptionException e4) {
                        e = e4;
                    }
                }
                CorruptionHandler<T> corruptionHandler = singleProcessDataStore.corruptionHandler;
                singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = singleProcessDataStore;
                singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
                singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
                handleCorruption = corruptionHandler.handleCorruption(e, singleProcessDataStore$readDataOrHandleCorruption$1);
                if (handleCorruption != coroutine_suspended) {
                    SingleProcessDataStore singleProcessDataStore4 = singleProcessDataStore;
                    corruptionException = e;
                    obj = handleCorruption;
                    singleProcessDataStore2 = singleProcessDataStore4;
                    singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                    singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                    singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                    if (singleProcessDataStore2.writeData$sdk_core_prodRelease(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != coroutine_suspended) {
                    }
                }
            }
        }
        singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, continuation);
        Object obj3 = singleProcessDataStore$readDataOrHandleCorruption$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
        if (i != 0) {
        }
        CorruptionHandler<T> corruptionHandler2 = singleProcessDataStore.corruptionHandler;
        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = singleProcessDataStore;
        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
        singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
        handleCorruption = corruptionHandler2.handleCorruption(e, singleProcessDataStore$readDataOrHandleCorruption$1);
        if (handleCorruption != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transformAndWrite(Function2 function2, CoroutineContext coroutineContext, Continuation continuation) {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        Object obj;
        int i;
        Data data;
        Object obj2;
        SingleProcessDataStore singleProcessDataStore;
        Object obj3;
        SingleProcessDataStore singleProcessDataStore2;
        if (continuation instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) continuation;
            int i2 = singleProcessDataStore$transformAndWrite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.label = i2 - Integer.MIN_VALUE;
                obj = singleProcessDataStore$transformAndWrite$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$transformAndWrite$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object value = this.downstreamFlow.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.ogury.core.internal.datastore.datastore.core.Data<T of com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore>");
                    Data data2 = (Data) value;
                    data2.checkHashCode();
                    Object value2 = data2.getValue();
                    SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(function2, value2, null);
                    singleProcessDataStore$transformAndWrite$1.L$0 = this;
                    singleProcessDataStore$transformAndWrite$1.L$1 = data2;
                    singleProcessDataStore$transformAndWrite$1.L$2 = value2;
                    singleProcessDataStore$transformAndWrite$1.label = 1;
                    Object withContext = BuildersKt.withContext(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, singleProcessDataStore$transformAndWrite$1);
                    if (withContext != coroutine_suspended) {
                        data = data2;
                        obj = withContext;
                        obj2 = value2;
                        singleProcessDataStore = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = singleProcessDataStore$transformAndWrite$1.L$1;
                    singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    singleProcessDataStore2.downstreamFlow.setValue(new Data(obj3, obj3 == null ? obj3.hashCode() : 0));
                    return obj3;
                }
                obj2 = singleProcessDataStore$transformAndWrite$1.L$2;
                data = (Data) singleProcessDataStore$transformAndWrite$1.L$1;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
                ResultKt.throwOnFailure(obj);
                singleProcessDataStore = singleProcessDataStore3;
                data.checkHashCode();
                if (!Intrinsics.areEqual(obj2, obj)) {
                    return obj2;
                }
                singleProcessDataStore$transformAndWrite$1.L$0 = singleProcessDataStore;
                singleProcessDataStore$transformAndWrite$1.L$1 = obj;
                singleProcessDataStore$transformAndWrite$1.L$2 = null;
                singleProcessDataStore$transformAndWrite$1.label = 2;
                if (singleProcessDataStore.writeData$sdk_core_prodRelease(obj, singleProcessDataStore$transformAndWrite$1) != coroutine_suspended) {
                    obj3 = obj;
                    singleProcessDataStore2 = singleProcessDataStore;
                    singleProcessDataStore2.downstreamFlow.setValue(new Data(obj3, obj3 == null ? obj3.hashCode() : 0));
                    return obj3;
                }
                return coroutine_suspended;
            }
        }
        singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, continuation);
        obj = singleProcessDataStore$transformAndWrite$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$transformAndWrite$1.label;
        if (i != 0) {
        }
        data.checkHashCode();
        if (!Intrinsics.areEqual(obj2, obj)) {
        }
    }

    @Override // com.ogury.core.internal.datastore.datastore.core.DataStore
    @NotNull
    public Flow getData() {
        return this.data;
    }

    @Override // com.ogury.core.internal.datastore.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2 function2, @NotNull Continuation continuation) {
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.actor.offer(new Message.Update(function2, CompletableDeferred$default, (State) this.downstreamFlow.getValue(), continuation.getContext()));
        return CompletableDeferred$default.await(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4 A[Catch: IOException -> 0x00c0, TryCatch #3 {IOException -> 0x00c0, blocks: (B:14:0x0096, B:18:0x00a4, B:19:0x00bf, B:26:0x00c6, B:27:0x00c9, B:37:0x006c, B:23:0x00c4), top: B:36:0x006c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData$sdk_core_prodRelease(T t, @NotNull Continuation continuation) {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        int i;
        File file;
        Closeable closeable;
        SingleProcessDataStore<T> singleProcessDataStore;
        FileOutputStream fileOutputStream;
        if (continuation instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuation;
            int i2 = singleProcessDataStore$writeData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$writeData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$writeData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    createParentDirectories(getFile());
                    file = new File(getFile().getAbsolutePath() + this.SCRATCH_SUFFIX);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            Serializer<T> serializer = this.serializer;
                            UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream2);
                            singleProcessDataStore$writeData$1.L$0 = this;
                            singleProcessDataStore$writeData$1.L$1 = file;
                            singleProcessDataStore$writeData$1.L$2 = fileOutputStream2;
                            singleProcessDataStore$writeData$1.L$3 = fileOutputStream2;
                            singleProcessDataStore$writeData$1.label = 1;
                            if (serializer.writeTo(t, uncloseableOutputStream, singleProcessDataStore$writeData$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            singleProcessDataStore = this;
                            fileOutputStream = fileOutputStream2;
                            closeable = fileOutputStream;
                        } catch (Throwable th) {
                            th = th;
                            closeable = fileOutputStream2;
                            throw th;
                        }
                    } catch (IOException e) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (FileOutputStream) singleProcessDataStore$writeData$1.L$3;
                    closeable = (Closeable) singleProcessDataStore$writeData$1.L$2;
                    file = (File) singleProcessDataStore$writeData$1.L$1;
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(closeable, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(closeable, null);
                if (!file.renameTo(singleProcessDataStore.getFile())) {
                    return unit;
                }
                throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
        Object obj2 = singleProcessDataStore$writeData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$writeData$1.label;
        if (i != 0) {
        }
        fileOutputStream.getFD().sync();
        Unit unit2 = Unit.INSTANCE;
        CloseableKt.closeFinally(closeable, null);
        if (!file.renameTo(singleProcessDataStore.getFile())) {
        }
    }

    public /* synthetic */ SingleProcessDataStore(Function0 function0, Serializer serializer, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, serializer, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i2 & 16) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null))) : coroutineScope, (i2 & 32) != 0 ? 0 : i);
    }
}
