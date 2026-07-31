package com.mobilefuse.sdk.rx;

import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.component.ParsingAbility;
import com.mobilefuse.sdk.component.ParsingError;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.repository.ParseAdmFromBidResponseKt;
import com.mobilefuse.sdk.internal.repository.ParsedAdMarkupResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdParserFlow.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\n"}, d2 = {"parse", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/internal/repository/ParsedAdMarkupResponse;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "parserFactory", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "Lcom/mobilefuse/sdk/component/AdmParser;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class AdParserFlowKt {
    @NotNull
    public static final Flow<Either<BaseError, ParsedAdMarkupResponse>> parse(@NotNull final Flow<? extends Either<? extends BaseError, MfxBidResponse>> parse, @NotNull final Function1 parserFactory) {
        Intrinsics.checkNotNullParameter(parse, "$this$parse");
        Intrinsics.checkNotNullParameter(parserFactory, "parserFactory");
        final Flow zip2 = FlowKt.zip2(FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$$inlined$mapEitherSuccessResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends MfxBidResponse, ? extends AdmParser>>>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends Pair<? extends MfxBidResponse, ? extends AdmParser>>> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$$inlined$mapEitherSuccessResult$1.1
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
                        Object successResult;
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!(value instanceof SuccessResult)) {
                            if (value instanceof ErrorResult) {
                                flow.emit(value);
                                return;
                            }
                            return;
                        }
                        FlowCollector flowCollector = flow;
                        Either either = (Either) ((SuccessResult) value).getValue();
                        try {
                            if (either instanceof ErrorResult) {
                                flowCollector.emit(new SuccessResult(either));
                                return;
                            }
                            if (either instanceof SuccessResult) {
                                MfxBidResponse mfxBidResponse = (MfxBidResponse) ((SuccessResult) either).getValue();
                                AdmParser admParser = (AdmParser) parserFactory.invoke(mfxBidResponse.getType());
                                if (admParser.getParsingAbility(mfxBidResponse.getAdm()) == ParsingAbility.INCAPABLE) {
                                    successResult = new ErrorResult(ParsingError.UNEXPECTED_MARKUP_FORMAT);
                                } else {
                                    successResult = new SuccessResult(new Pair(mfxBidResponse, admParser));
                                }
                                flowCollector.emit(new SuccessResult(successResult));
                            }
                        } catch (Throwable th) {
                            flowCollector.emit(new ErrorResult(th));
                        }
                    }
                });
            }
        }), new Function1() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Flow<Either<BaseError, ParsedAdMarkup>> invoke(@NotNull Pair<MfxBidResponse, ? extends AdmParser> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ParseAdmFromBidResponseKt.parseFromBidResponse(it.getSecond(), it.getFirst());
            }
        }, new Function2() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$3
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final ParsedAdMarkupResponse invoke(@NotNull Pair<MfxBidResponse, ? extends AdmParser> a, @NotNull ParsedAdMarkup b) {
                Intrinsics.checkNotNullParameter(a, "a");
                Intrinsics.checkNotNullParameter(b, "b");
                return new ParsedAdMarkupResponse(a.getFirst(), b);
            }
        });
        return FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super Either<? extends BaseError, ? extends ParsedAdMarkupResponse>>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends ParsedAdMarkupResponse>> flow) {
                Intrinsics.checkNotNullParameter(flow, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$$inlined$catchElse$1.1
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
                        FlowCollector flowCollector = flow;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) value).getValue()).getMessage()))));
                        } else if (value instanceof SuccessResult) {
                            flowCollector.emit(value);
                        }
                    }
                });
            }
        });
    }
}
