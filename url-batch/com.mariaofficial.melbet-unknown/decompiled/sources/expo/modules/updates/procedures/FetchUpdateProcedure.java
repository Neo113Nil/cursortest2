package expo.modules.updates.procedures;

import android.content.Context;
import expo.modules.updates.IUpdatesController;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.DatabaseHolder;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.Loader;
import expo.modules.updates.loader.ProcessSuccessLoaderResult;
import expo.modules.updates.loader.RemoteLoader;
import expo.modules.updates.loader.UpdateDirective;
import expo.modules.updates.loader.UpdateResponse;
import expo.modules.updates.loader.UpdateResponsePart;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.manifest.ResponseHeaderData;
import expo.modules.updates.manifest.Update;
import expo.modules.updates.procedures.StateMachineProcedure;
import expo.modules.updates.selectionpolicy.SelectionPolicy;
import expo.modules.updates.statemachine.UpdatesStateEvent;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FetchUpdateProcedure.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lexpo/modules/updates/procedures/FetchUpdateProcedure;", "Lexpo/modules/updates/procedures/StateMachineProcedure;", "context", "Landroid/content/Context;", "updatesConfiguration", "Lexpo/modules/updates/UpdatesConfiguration;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "databaseHolder", "Lexpo/modules/updates/db/DatabaseHolder;", "updatesDirectory", "Ljava/io/File;", "fileDownloader", "Lexpo/modules/updates/loader/FileDownloader;", "selectionPolicy", "Lexpo/modules/updates/selectionpolicy/SelectionPolicy;", "launchedUpdate", "Lexpo/modules/updates/db/entity/UpdateEntity;", "callback", "Lkotlin/Function1;", "Lexpo/modules/updates/IUpdatesController$FetchUpdateResult;", "", "<init>", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/db/DatabaseHolder;Ljava/io/File;Lexpo/modules/updates/loader/FileDownloader;Lexpo/modules/updates/selectionpolicy/SelectionPolicy;Lexpo/modules/updates/db/entity/UpdateEntity;Lkotlin/jvm/functions/Function1;)V", "loggerTimerLabel", "", "getLoggerTimerLabel", "()Ljava/lang/String;", "run", "procedureContext", "Lexpo/modules/updates/procedures/StateMachineProcedure$ProcedureContext;", "(Lexpo/modules/updates/procedures/StateMachineProcedure$ProcedureContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startRemoteLoader", "Lexpo/modules/updates/loader/Loader$LoaderResult;", "database", "Lexpo/modules/updates/db/UpdatesDatabase;", "(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/procedures/StateMachineProcedure$ProcedureContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processSuccessLoaderResult", "loaderResult", "(Lexpo/modules/updates/loader/Loader$LoaderResult;Lexpo/modules/updates/procedures/StateMachineProcedure$ProcedureContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FetchUpdateProcedure extends StateMachineProcedure {
    private final Function1<IUpdatesController.FetchUpdateResult, Unit> callback;
    private final Context context;
    private final DatabaseHolder databaseHolder;
    private final FileDownloader fileDownloader;
    private final UpdateEntity launchedUpdate;
    private final UpdatesLogger logger;
    private final String loggerTimerLabel;
    private final SelectionPolicy selectionPolicy;
    private final UpdatesConfiguration updatesConfiguration;
    private final File updatesDirectory;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchUpdateProcedure(Context context, UpdatesConfiguration updatesConfiguration, UpdatesLogger logger, DatabaseHolder databaseHolder, File updatesDirectory, FileDownloader fileDownloader, SelectionPolicy selectionPolicy, UpdateEntity updateEntity, Function1<? super IUpdatesController.FetchUpdateResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updatesConfiguration, "updatesConfiguration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(databaseHolder, "databaseHolder");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(selectionPolicy, "selectionPolicy");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.context = context;
        this.updatesConfiguration = updatesConfiguration;
        this.logger = logger;
        this.databaseHolder = databaseHolder;
        this.updatesDirectory = updatesDirectory;
        this.fileDownloader = fileDownloader;
        this.selectionPolicy = selectionPolicy;
        this.launchedUpdate = updateEntity;
        this.callback = callback;
        this.loggerTimerLabel = "timer-fetch-update";
    }

    @Override // expo.modules.updates.procedures.StateMachineProcedure
    public String getLoggerTimerLabel() {
        return this.loggerTimerLabel;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:3|(5:5|6|7|(1:(1:(5:11|12|13|14|15)(2:17|18))(2:19|20))(3:24|25|(2:27|23))|21))|7|(0)(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (processSuccessLoaderResult((expo.modules.updates.loader.Loader.LoaderResult) r10, r9, r0) != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        expo.modules.updates.logging.UpdatesLogger.error$default(r8.logger, "Failed to download new update", r0, null, 4, null);
        r9.processStateEvent(new expo.modules.updates.statemachine.UpdatesStateEvent.DownloadError("Failed to download new update: " + r0.getMessage()));
        r8.callback.invoke(new expo.modules.updates.IUpdatesController.FetchUpdateResult.ErrorResult(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // expo.modules.updates.procedures.StateMachineProcedure
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object run(StateMachineProcedure.ProcedureContext procedureContext, Continuation<? super Unit> continuation) {
        FetchUpdateProcedure$run$1 fetchUpdateProcedure$run$1;
        int i;
        try {
            if (continuation instanceof FetchUpdateProcedure$run$1) {
                fetchUpdateProcedure$run$1 = (FetchUpdateProcedure$run$1) continuation;
                if ((fetchUpdateProcedure$run$1.label & Integer.MIN_VALUE) != 0) {
                    fetchUpdateProcedure$run$1.label -= Integer.MIN_VALUE;
                    Object obj = fetchUpdateProcedure$run$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fetchUpdateProcedure$run$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        procedureContext.processStateEvent(new UpdatesStateEvent.Download());
                        UpdatesDatabase database = this.databaseHolder.getDatabase();
                        fetchUpdateProcedure$run$1.L$0 = procedureContext;
                        fetchUpdateProcedure$run$1.label = 1;
                        obj = startRemoteLoader(database, procedureContext, fetchUpdateProcedure$run$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            procedureContext = (StateMachineProcedure.ProcedureContext) fetchUpdateProcedure$run$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            procedureContext.onComplete();
                            return Unit.INSTANCE;
                        }
                        procedureContext = (StateMachineProcedure.ProcedureContext) fetchUpdateProcedure$run$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    fetchUpdateProcedure$run$1.L$0 = procedureContext;
                    fetchUpdateProcedure$run$1.label = 2;
                }
            }
            if (i != 0) {
            }
            fetchUpdateProcedure$run$1.L$0 = procedureContext;
            fetchUpdateProcedure$run$1.label = 2;
        } catch (Throwable th) {
            procedureContext.onComplete();
            throw th;
        }
        fetchUpdateProcedure$run$1 = new FetchUpdateProcedure$run$1(this, continuation);
        Object obj2 = fetchUpdateProcedure$run$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchUpdateProcedure$run$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startRemoteLoader(UpdatesDatabase updatesDatabase, final StateMachineProcedure.ProcedureContext procedureContext, Continuation<? super Loader.LoaderResult> continuation) {
        FetchUpdateProcedure$startRemoteLoader$1 fetchUpdateProcedure$startRemoteLoader$1;
        int i;
        try {
            if (continuation instanceof FetchUpdateProcedure$startRemoteLoader$1) {
                fetchUpdateProcedure$startRemoteLoader$1 = (FetchUpdateProcedure$startRemoteLoader$1) continuation;
                if ((fetchUpdateProcedure$startRemoteLoader$1.label & Integer.MIN_VALUE) != 0) {
                    fetchUpdateProcedure$startRemoteLoader$1.label -= Integer.MIN_VALUE;
                    Object obj = fetchUpdateProcedure$startRemoteLoader$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fetchUpdateProcedure$startRemoteLoader$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        RemoteLoader remoteLoader = new RemoteLoader(this.context, this.updatesConfiguration, this.logger, updatesDatabase, this.fileDownloader, this.updatesDirectory, this.launchedUpdate);
                        remoteLoader.setAssetLoadProgressBlock$expo_updates_release(new Function1() { // from class: expo.modules.updates.procedures.FetchUpdateProcedure$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit startRemoteLoader$lambda$0;
                                startRemoteLoader$lambda$0 = FetchUpdateProcedure.startRemoteLoader$lambda$0(StateMachineProcedure.ProcedureContext.this, ((Double) obj2).doubleValue());
                                return startRemoteLoader$lambda$0;
                            }
                        });
                        Function1<? super UpdateResponse, Loader.OnUpdateResponseLoadedResult> function1 = new Function1() { // from class: expo.modules.updates.procedures.FetchUpdateProcedure$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Loader.OnUpdateResponseLoadedResult startRemoteLoader$lambda$1;
                                startRemoteLoader$lambda$1 = FetchUpdateProcedure.startRemoteLoader$lambda$1(FetchUpdateProcedure.this, (UpdateResponse) obj2);
                                return startRemoteLoader$lambda$1;
                            }
                        };
                        fetchUpdateProcedure$startRemoteLoader$1.label = 1;
                        obj = remoteLoader.load(function1, fetchUpdateProcedure$startRemoteLoader$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (Loader.LoaderResult) obj;
                }
            }
            if (i != 0) {
            }
            return (Loader.LoaderResult) obj;
        } catch (CancellationException e) {
            UpdatesLogger.info$default(this.logger, "Remote loader cancelled during fetch update procedure", null, 2, null);
            throw e;
        }
        fetchUpdateProcedure$startRemoteLoader$1 = new FetchUpdateProcedure$startRemoteLoader$1(this, continuation);
        Object obj2 = fetchUpdateProcedure$startRemoteLoader$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchUpdateProcedure$startRemoteLoader$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startRemoteLoader$lambda$0(StateMachineProcedure.ProcedureContext procedureContext, double d) {
        procedureContext.processStateEvent(new UpdatesStateEvent.DownloadProgress(d));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Loader.OnUpdateResponseLoadedResult startRemoteLoader$lambda$1(FetchUpdateProcedure fetchUpdateProcedure, UpdateResponse updateResponse) {
        Update update;
        Intrinsics.checkNotNullParameter(updateResponse, "updateResponse");
        UpdateResponsePart.DirectiveUpdateResponsePart directiveUpdateResponsePart = updateResponse.getDirectiveUpdateResponsePart();
        UpdateDirective updateDirective = directiveUpdateResponsePart != null ? directiveUpdateResponsePart.getUpdateDirective() : null;
        if (updateDirective != null) {
            if ((updateDirective instanceof UpdateDirective.RollBackToEmbeddedUpdateDirective) || (updateDirective instanceof UpdateDirective.NoUpdateAvailableUpdateDirective)) {
                return new Loader.OnUpdateResponseLoadedResult(false);
            }
            throw new NoWhenBranchMatchedException();
        }
        UpdateResponsePart.ManifestUpdateResponsePart manifestUpdateResponsePart = updateResponse.getManifestUpdateResponsePart();
        if (manifestUpdateResponsePart == null || (update = manifestUpdateResponsePart.getUpdate()) == null) {
            return new Loader.OnUpdateResponseLoadedResult(false);
        }
        SelectionPolicy selectionPolicy = fetchUpdateProcedure.selectionPolicy;
        UpdateEntity updateEntity = update.getUpdateEntity();
        UpdateEntity updateEntity2 = fetchUpdateProcedure.launchedUpdate;
        ResponseHeaderData responseHeaderData = updateResponse.getResponseHeaderData();
        return new Loader.OnUpdateResponseLoadedResult(selectionPolicy.shouldLoadNewUpdate(updateEntity, updateEntity2, responseHeaderData != null ? responseHeaderData.getManifestFilters() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processSuccessLoaderResult(Loader.LoaderResult loaderResult, StateMachineProcedure.ProcedureContext procedureContext, Continuation<? super Unit> continuation) {
        FetchUpdateProcedure$processSuccessLoaderResult$1 fetchUpdateProcedure$processSuccessLoaderResult$1;
        int i;
        ProcessSuccessLoaderResult processSuccessLoaderResult;
        if (continuation instanceof FetchUpdateProcedure$processSuccessLoaderResult$1) {
            fetchUpdateProcedure$processSuccessLoaderResult$1 = (FetchUpdateProcedure$processSuccessLoaderResult$1) continuation;
            if ((fetchUpdateProcedure$processSuccessLoaderResult$1.label & Integer.MIN_VALUE) != 0) {
                fetchUpdateProcedure$processSuccessLoaderResult$1.label -= Integer.MIN_VALUE;
                FetchUpdateProcedure$processSuccessLoaderResult$1 fetchUpdateProcedure$processSuccessLoaderResult$12 = fetchUpdateProcedure$processSuccessLoaderResult$1;
                Object obj = fetchUpdateProcedure$processSuccessLoaderResult$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchUpdateProcedure$processSuccessLoaderResult$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RemoteLoader.Companion companion = RemoteLoader.INSTANCE;
                    Context context = this.context;
                    UpdatesConfiguration updatesConfiguration = this.updatesConfiguration;
                    UpdatesLogger updatesLogger = this.logger;
                    UpdatesDatabase database = this.databaseHolder.getDatabase();
                    SelectionPolicy selectionPolicy = this.selectionPolicy;
                    File file = this.updatesDirectory;
                    UpdateEntity updateEntity = this.launchedUpdate;
                    fetchUpdateProcedure$processSuccessLoaderResult$12.L$0 = procedureContext;
                    fetchUpdateProcedure$processSuccessLoaderResult$12.label = 1;
                    obj = companion.processSuccessLoaderResult(context, updatesConfiguration, updatesLogger, database, selectionPolicy, file, updateEntity, loaderResult, fetchUpdateProcedure$processSuccessLoaderResult$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    procedureContext = (StateMachineProcedure.ProcedureContext) fetchUpdateProcedure$processSuccessLoaderResult$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                processSuccessLoaderResult = (ProcessSuccessLoaderResult) obj;
                UpdateEntity availableUpdate = processSuccessLoaderResult.getAvailableUpdate();
                if (!processSuccessLoaderResult.getDidRollBackToEmbedded()) {
                    procedureContext.processStateEvent(new UpdatesStateEvent.DownloadCompleteWithRollback());
                    this.callback.invoke(new IUpdatesController.FetchUpdateResult.RollBackToEmbedded());
                } else if (availableUpdate == null) {
                    procedureContext.processStateEvent(new UpdatesStateEvent.DownloadComplete());
                    this.callback.invoke(new IUpdatesController.FetchUpdateResult.Failure());
                } else {
                    procedureContext.processStateEvent(new UpdatesStateEvent.DownloadCompleteWithUpdate(availableUpdate.getManifest()));
                    this.callback.invoke(new IUpdatesController.FetchUpdateResult.Success(availableUpdate));
                }
                return Unit.INSTANCE;
            }
        }
        fetchUpdateProcedure$processSuccessLoaderResult$1 = new FetchUpdateProcedure$processSuccessLoaderResult$1(this, continuation);
        FetchUpdateProcedure$processSuccessLoaderResult$1 fetchUpdateProcedure$processSuccessLoaderResult$122 = fetchUpdateProcedure$processSuccessLoaderResult$1;
        Object obj2 = fetchUpdateProcedure$processSuccessLoaderResult$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchUpdateProcedure$processSuccessLoaderResult$122.label;
        if (i != 0) {
        }
        processSuccessLoaderResult = (ProcessSuccessLoaderResult) obj2;
        UpdateEntity availableUpdate2 = processSuccessLoaderResult.getAvailableUpdate();
        if (!processSuccessLoaderResult.getDidRollBackToEmbedded()) {
        }
        return Unit.INSTANCE;
    }
}
