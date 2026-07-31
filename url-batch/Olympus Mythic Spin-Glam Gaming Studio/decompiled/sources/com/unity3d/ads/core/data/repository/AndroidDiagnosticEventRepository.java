package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidDiagnosticEventRepository.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u0012\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0017\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "flushTimer", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "getDiagnosticEventRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/unity3d/ads/core/utils/CoroutineTimer;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;Lkotlinx/coroutines/CoroutineDispatcher;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "batch", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "maxBatchSize", "", "allowedEvents", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "kotlin.jvm.PlatformType", "", "blockedEvents", "enabled", "", "configured", "_diagnosticEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "diagnosticEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getDiagnosticEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "addDiagnosticEvent", "", "diagnosticEvent", "flush", "clear", "configure", "diagnosticsEventsConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {

    @NotNull
    private final MutableSharedFlow _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;

    @NotNull
    private final MutableStateFlow batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;

    @NotNull
    private final MutableStateFlow configured;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final SharedFlow diagnosticEvents;

    @NotNull
    private final MutableStateFlow enabled;

    @NotNull
    private final CoroutineTimer flushTimer;

    @NotNull
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(@NotNull CoroutineTimer flushTimer, @NotNull GetDiagnosticEventRequest getDiagnosticEventRequest, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(flushTimer, "flushTimer");
        Intrinsics.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = CoroutineScopeKt.plus(CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(dispatcher), new CoroutineName("DiagnosticEventRepository")), new AndroidDiagnosticEventRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
        this.batch = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = StateFlowKt.MutableStateFlow(bool);
        this.configured = StateFlowKt.MutableStateFlow(bool);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(100, 0, null, 6, null);
        this._diagnosticEvents = MutableSharedFlow$default;
        this.diagnosticEvents = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    @NotNull
    public SharedFlow getDiagnosticEvents() {
        return this.diagnosticEvents;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(diagnosticEvent, "diagnosticEvent");
        if (!((Boolean) this.configured.getValue()).booleanValue()) {
            MutableStateFlow mutableStateFlow = this.batch;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, CollectionsKt.plus((List) value2, diagnosticEvent)));
        } else if (((Boolean) this.enabled.getValue()).booleanValue()) {
            MutableStateFlow mutableStateFlow2 = this.batch;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, CollectionsKt.plus((List) value, diagnosticEvent)));
            if (((List) this.batch.getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        Object value;
        if (((Boolean) this.enabled.getValue()).booleanValue()) {
            MutableStateFlow mutableStateFlow = this.batch;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.emptyList()));
            final List list = SequencesKt.toList(SequencesKt.filter(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence((Iterable) value), new Function1() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4;
                    flush$lambda$4 = AndroidDiagnosticEventRepository.flush$lambda$4(AndroidDiagnosticEventRepository.this, (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj);
                    return flush$lambda$4;
                }
            }), new Function1() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean flush$lambda$5;
                    flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$5(AndroidDiagnosticEventRepository.this, (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj);
                    return Boolean.valueOf(flush$lambda$5);
                }
            }), new Function1() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean flush$lambda$6;
                    flush$lambda$6 = AndroidDiagnosticEventRepository.flush$lambda$6(AndroidDiagnosticEventRepository.this, (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj);
                    return Boolean.valueOf(flush$lambda$6);
                }
            }));
            if (list.isEmpty()) {
                return;
            }
            DeviceLog.debug((Callable<String>) new Callable() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$$ExternalSyntheticLambda4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String flush$lambda$7;
                    flush$lambda$7 = AndroidDiagnosticEventRepository.flush$lambda$7(AndroidDiagnosticEventRepository.this, list);
                    return flush$lambda$7;
                }
            });
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AndroidDiagnosticEventRepository$flush$2(this, list, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        DiagnosticEventRequestOuterClass.DiagnosticEvent invoke;
        if (diagnosticEvent != null) {
            return diagnosticEvent;
        }
        invoke = androidDiagnosticEventRepository.getDiagnosticEventRequest.invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM, "null_diagnostic_event", null, null, null, null, null, null, null, null, (r25 & 1024) != 0 ? null : null);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean flush$lambda$5(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return androidDiagnosticEventRepository.allowedEvents.isEmpty() || androidDiagnosticEventRepository.allowedEvents.contains(it.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean flush$lambda$6(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !androidDiagnosticEventRepository.blockedEvents.contains(it.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flush$lambda$7(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List list) {
        return "Unity Ads Sending diagnostic batch enabled: " + ((Boolean) androidDiagnosticEventRepository.enabled.getValue()).booleanValue() + " size: " + list.size() + " :: " + list;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        Object value;
        MutableStateFlow mutableStateFlow = this.batch;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.emptyList()));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(@NotNull NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        Intrinsics.checkNotNullParameter(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!((Boolean) this.enabled.getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        Intrinsics.checkNotNullExpressionValue(allowedEventsList, "getAllowedEventsList(...)");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        Intrinsics.checkNotNullExpressionValue(blockedEventsList, "getBlockedEventsList(...)");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new Function0() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit configure$lambda$9;
                configure$lambda$9 = AndroidDiagnosticEventRepository.configure$lambda$9(AndroidDiagnosticEventRepository.this);
                return configure$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configure$lambda$9(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        androidDiagnosticEventRepository.flush();
        return Unit.INSTANCE;
    }
}
