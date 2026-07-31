package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseServices.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes13.dex */
final class MobileFuseServices$initServices$1 extends Lambda implements Function0 {
    final /* synthetic */ Function1 $completeAction;
    final /* synthetic */ Set $services;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileFuseServices$initServices$1(Set set, Function1 function1) {
        super(0);
        this.$services = set;
        this.$completeAction = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        boolean deviceMeetsMobileFuseSdkRequirements;
        boolean allInitialized;
        Map map;
        Map map2;
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices mobileFuseServices = MobileFuseServices.INSTANCE;
        MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices, "Require services: " + this.$services);
        deviceMeetsMobileFuseSdkRequirements = mobileFuseServices.deviceMeetsMobileFuseSdkRequirements();
        if (!deviceMeetsMobileFuseSdkRequirements) {
            DebuggingKt.logError$default(mobileFuseServices, "The MobileFuse SDK has been disabled because: " + MobileFuseServices.getSdkDisableReason(), null, null, 6, null);
            this.$completeAction.invoke(new ErrorResult(new ServicesInitError("The MobileFuse SDK has been disabled because: " + MobileFuseServices.getSdkDisableReason())));
            return;
        }
        if (!mobileFuseServices.getAllServicesInitialized()) {
            allInitialized = MobileFuseServicesKt.getAllInitialized(this.$services);
            if (allInitialized) {
                MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices, "Required services are initialized. Call the complete action");
                Function1 function1 = this.$completeAction;
                map = MobileFuseServices.servicesResultMap;
                function1.invoke(new SuccessResult(new ServicesInitResult(map)));
                return;
            }
            final Flow flow = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FlowCollector<? super Set<? extends MobileFuseService>>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FlowCollector<? super Set<? extends MobileFuseService>> receiver) {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    receiver.emit(new SuccessResult(MobileFuseServices$initServices$1.this.$services));
                }
            });
            final Schedulers schedulers = Schedulers.MAIN;
            final Flow flow2 = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$runOn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FlowCollector<? super Set<? extends MobileFuseService>>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull final FlowCollector<? super Set<? extends MobileFuseService>> flow3) {
                    Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                    Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$runOn$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            final FlowCollector flowCollector = flow3;
                            SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$.inlined.runOn.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                    invoke();
                                    return Unit.INSTANCE;
                                }

                                public final void invoke() {
                                    FlowCollector.this.emit(value);
                                }
                            });
                        }
                    });
                }
            });
            final Flow flow3 = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$transform$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FlowCollector<? super Map<MobileFuseService, ? extends Boolean>>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull final FlowCollector<? super Map<MobileFuseService, ? extends Boolean>> flow4) {
                    Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                    Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$transform$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!(value instanceof SuccessResult)) {
                                if (value instanceof ErrorResult) {
                                    flow4.emit(value);
                                    return;
                                }
                                return;
                            }
                            FlowCollector flowCollector = flow4;
                            Set<MobileFuseService> set = (Set) ((SuccessResult) value).getValue();
                            MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1 mobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1 = new MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1(flowCollector, new LinkedHashMap(), set);
                            for (MobileFuseService mobileFuseService : set) {
                                MobileFuseServices_LogsKt.logServiceDebug(MobileFuseServices.INSTANCE, "Request service to init: " + mobileFuseService);
                                mobileFuseService.initService(new MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$2(mobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1));
                            }
                        }
                    });
                }
            });
            FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$catchElse$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FlowCollector<? super Map<MobileFuseService, ? extends Boolean>>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull final FlowCollector<? super Map<MobileFuseService, ? extends Boolean>> flow4) {
                    Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                    Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$catchElse$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            FlowCollector flowCollector = flow4;
                            if (value instanceof ErrorResult) {
                                Throwable th = (Throwable) ((ErrorResult) value).getValue();
                                MobileFuseServices mobileFuseServices2 = MobileFuseServices.INSTANCE;
                                MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices2, "An exception has been caught. Use empty map.");
                                MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices2, "Exception: " + th);
                                flowCollector.emit(new SuccessResult(MapsKt.emptyMap()));
                                return;
                            }
                            if (value instanceof SuccessResult) {
                                flowCollector.emit(value);
                            }
                        }
                    });
                }
            }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$collectResult$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Map map3;
                    Map map4;
                    Map map5;
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        Map map6 = (Map) ((SuccessResult) result).getValue();
                        MobileFuseServices mobileFuseServices2 = MobileFuseServices.INSTANCE;
                        MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices2, "All services completed initialization. Call the complete action");
                        map3 = MobileFuseServices.servicesResultMap;
                        map3.putAll(map6);
                        map4 = MobileFuseServices.servicesResultMap;
                        if (Intrinsics.areEqual(map4.keySet(), mobileFuseServices2.getRegisteredServices$mobilefuse_sdk_core_release())) {
                            map5 = MobileFuseServices.servicesResultMap;
                            if (!map5.values().contains(Boolean.FALSE)) {
                                MobileFuseServices.allServicesInitialized = true;
                            }
                        }
                        MobileFuseServices$initServices$1.this.$completeAction.invoke(new SuccessResult(new ServicesInitResult(map6)));
                    }
                }
            });
            return;
        }
        MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices, "All services are initialized. Call the complete action");
        Function1 function12 = this.$completeAction;
        map2 = MobileFuseServices.servicesResultMap;
        function12.invoke(new SuccessResult(new ServicesInitResult(map2)));
    }
}
