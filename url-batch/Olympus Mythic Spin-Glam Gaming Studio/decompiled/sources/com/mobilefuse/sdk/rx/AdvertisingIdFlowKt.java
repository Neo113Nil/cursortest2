package com.mobilefuse.sdk.rx;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.service.ServiceInitState;
import com.mobilefuse.sdk.service.impl.AdvertisingIdService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdvertisingIdFlow.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\u0003"}, d2 = {"waitForAdvertisingId", "Lcom/mobilefuse/sdk/rx/Flow;", "T", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class AdvertisingIdFlowKt {
    @NotNull
    public static final <T> Flow<T> waitForAdvertisingId(@NotNull final Flow<? extends T> waitForAdvertisingId) {
        Intrinsics.checkNotNullParameter(waitForAdvertisingId, "$this$waitForAdvertisingId");
        return FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.rx.AdvertisingIdFlowKt$waitForAdvertisingId$$inlined$transform$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super T> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.AdvertisingIdFlowKt$waitForAdvertisingId$$inlined$transform$1.1
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
                                flow.emit(value);
                                return;
                            }
                            return;
                        }
                        final FlowCollector flowCollector = flow;
                        final Object value2 = ((SuccessResult) value).getValue();
                        try {
                            AdvertisingIdService advertisingIdService = AdvertisingIdService.INSTANCE;
                            if (advertisingIdService.getState() != ServiceInitState.INITIALIZED) {
                                MobileFuseServices.requireServices(SetsKt.setOf(advertisingIdService), new Function0() { // from class: com.mobilefuse.sdk.rx.AdvertisingIdFlowKt$waitForAdvertisingId$$inlined$transform$1$1$lambda$1
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
                                        FlowKt.emit(FlowCollector.this, value2);
                                    }
                                });
                            } else {
                                FlowKt.emit(flowCollector, value2);
                            }
                        } catch (Throwable th) {
                            flowCollector.emit(new ErrorResult(th));
                        }
                    }
                });
            }
        });
    }
}
