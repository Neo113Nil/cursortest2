package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiagnosticEventObserver.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0019\u001a\u00020\u001aH\u0086B¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getDiagnosticEventBatchRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "universalRequestDataSource", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "diagnosticRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;Lcom/unity3d/ads/core/domain/GetRequestPolicy;)V", "isRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DiagnosticEventObserver {

    @NotNull
    private final BackgroundWorker backgroundWorker;

    @NotNull
    private final DiagnosticEventRepository diagnosticEventRepository;

    @NotNull
    private final GetRequestPolicy diagnosticRequestPolicy;

    @NotNull
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final MutableStateFlow isRunning;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final UniversalRequestDataSource universalRequestDataSource;

    @NotNull
    private final UniversalRequestEventSender universalRequestEventSender;

    public DiagnosticEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, @NotNull CoroutineDispatcher defaultDispatcher, @NotNull DiagnosticEventRepository diagnosticEventRepository, @NotNull UniversalRequestDataSource universalRequestDataSource, @NotNull BackgroundWorker backgroundWorker, @NotNull UniversalRequestEventSender universalRequestEventSender, @NotNull GetRequestPolicy diagnosticRequestPolicy) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(getDiagnosticEventBatchRequest, "getDiagnosticEventBatchRequest");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        Intrinsics.checkNotNullParameter(universalRequestDataSource, "universalRequestDataSource");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(universalRequestEventSender, "universalRequestEventSender");
        Intrinsics.checkNotNullParameter(diagnosticRequestPolicy, "diagnosticRequestPolicy");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.diagnosticRequestPolicy = diagnosticRequestPolicy;
        this.isRunning = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.scope = CoroutineScopeKt.CoroutineScope(defaultDispatcher.plus(new DiagnosticEventObserver$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
    }

    @Nullable
    public final Object invoke(@NotNull Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.scope.getCoroutineContext(), new DiagnosticEventObserver$invoke$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
