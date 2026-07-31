package com.mobilefuse.sdk.mfx;

import com.facebook.login.widget.ToolTipPopup;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.RtbLossReason;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpFlowKt;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: BidLossService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/mfx/BidLossService;", "", "()V", "sendBidLoss", "", "lossUrl", "", "price", "", "reason", "Lcom/mobilefuse/sdk/internal/RtbLossReason;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public final class BidLossService {

    @NotNull
    public static final BidLossService INSTANCE = new BidLossService();

    private BidLossService() {
    }

    public static final void sendBidLoss(@NotNull String lossUrl, final float price, @NotNull final RtbLossReason reason) {
        Intrinsics.checkNotNullParameter(lossUrl, "lossUrl");
        Intrinsics.checkNotNullParameter(reason, "reason");
        final Flow flowSingle = FlowKt.flowSingle(lossUrl);
        final Flow flow = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.mfx.BidLossService$sendBidLoss$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mfx.BidLossService$sendBidLoss$$inlined$map$1.1
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
                        if (value instanceof SuccessResult) {
                            FlowCollector flowCollector = flow2;
                            try {
                                flowCollector.emit(new SuccessResult(StringsKt.replace$default((String) ((SuccessResult) value).getValue(), "${AUCTION_PRICE}", String.valueOf(price), false, 4, (Object) null)));
                                return;
                            } catch (Throwable th) {
                                flowCollector.emit(new ErrorResult(th));
                                return;
                            }
                        }
                        if (value instanceof ErrorResult) {
                            flow2.emit(value);
                        }
                    }
                });
            }
        });
        HttpFlowKt.requestHttpGet$default(FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.mfx.BidLossService$sendBidLoss$$inlined$map$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow2) {
                Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mfx.BidLossService$sendBidLoss$$inlined$map$2.1
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
                        if (value instanceof SuccessResult) {
                            FlowCollector flowCollector = flow2;
                            try {
                                flowCollector.emit(new SuccessResult(StringsKt.replace$default((String) ((SuccessResult) value).getValue(), "${AUCTION_LOSS}", String.valueOf(reason.getCode()), false, 4, (Object) null)));
                                return;
                            } catch (Throwable th) {
                                flowCollector.emit(new ErrorResult(th));
                                return;
                            }
                        }
                        if (value instanceof ErrorResult) {
                            flow2.emit(value);
                        }
                    }
                });
            }
        }), ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, null, false, null, 10, null).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.mfx.BidLossService$sendBidLoss$3
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends Either<? extends HttpError, HttpResponse>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }
        });
    }
}
