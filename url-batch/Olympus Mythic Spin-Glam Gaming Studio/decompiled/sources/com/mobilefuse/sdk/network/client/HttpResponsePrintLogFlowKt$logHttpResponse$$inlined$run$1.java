package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "invoke", "com/mobilefuse/sdk/rx/FlowKt$run$1"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public final class HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1 extends Lambda implements Function1 {
    final /* synthetic */ Map $extras$inlined;
    final /* synthetic */ String $prefix$inlined;
    final /* synthetic */ Flow $this_logHttpResponse$inlined;
    final /* synthetic */ Flow $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1(Flow flow, Flow flow2, Map map, String str) {
        super(1);
        this.$this_run = flow;
        this.$this_logHttpResponse$inlined = flow2;
        this.$extras$inlined = map;
        this.$prefix$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>>) obj);
        return Unit.INSTANCE;
    }

    /* compiled from: Flow.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "value", "Lcom/mobilefuse/sdk/exception/Either;", "", "emit", "com/mobilefuse/sdk/rx/FlowKt$run$1$1"}, k = 3, mv = {1, 4, 3})
    /* renamed from: com.mobilefuse.sdk.network.client.HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_flow;

        public AnonymousClass1(FlowCollector flowCollector) {
            this.$this_flow = flowCollector;
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

        @Override // com.mobilefuse.sdk.rx.FlowCollector
        public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value instanceof SuccessResult) {
                final Either either = (Either) ((SuccessResult) value).getValue();
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    final StringBuilder sb = new StringBuilder();
                    Function0 function0 = new Function0() { // from class: com.mobilefuse.sdk.network.client.HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1$1$lambda$1
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
                            for (Map.Entry entry : HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$extras$inlined.entrySet()) {
                                StringBuilder sb2 = sb;
                                sb2.append(((String) entry.getKey()) + ": " + ((String) entry.getValue()));
                                Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                                sb2.append('\n');
                                Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                            }
                        }
                    };
                    sb.append("***** " + HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$prefix$inlined + " *****");
                    Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                    sb.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                    if (either instanceof SuccessResult) {
                        sb.append("Status: SUCCESS");
                        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                        sb.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                        function0.mo4828invoke();
                        sb.append("Status Code: " + ((HttpResponse) ((SuccessResult) either).getValue()).getStatusCode());
                        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                        sb.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                        sb.append("Request Time: " + ((((HttpResponse) ((SuccessResult) either).getValue()).getResponseTimestamp() - ((HttpResponse) ((SuccessResult) either).getValue()).getRequestTimestamp()) / 1000) + " seconds");
                        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                        sb.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                        sb.append("Body: " + ((HttpResponse) ((SuccessResult) either).getValue()).getBody());
                        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                        sb.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                    } else if (either instanceof ErrorResult) {
                        sb.append("Status: FAILED");
                        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                        sb.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                        function0.mo4828invoke();
                        HttpError httpError = (HttpError) ((ErrorResult) either).getValue();
                        if (httpError instanceof HttpError.ConnectionError) {
                            sb.append("Status Code: " + ((HttpError.ConnectionError) httpError).getStatusCode());
                            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                            sb.append('\n');
                            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                            String formattedMessage = HttpResponsePrintLogFlowKt.getFormattedMessage((HttpError.ConnectionError) httpError);
                            if (formattedMessage != null) {
                                sb.append(formattedMessage);
                                Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                                sb.append('\n');
                                Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                            }
                        } else {
                            String message = httpError.getMessage();
                            if (message != null) {
                                sb.append("Reason: " + message);
                                Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                                sb.append('\n');
                                Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                                StringsKt.trimEnd(sb);
                            }
                        }
                    }
                    sb.append("**********");
                    Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                    sb.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                    Flow flow = HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$this_logHttpResponse$inlined;
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
                    DebuggingKt.logDebug$default(flow, sb2, null, 2, null);
                } catch (Throwable th) {
                    int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            this.$this_flow.emit(value);
        }
    }

    public final void invoke(@NotNull FlowCollector<? super Either<? extends HttpError, ? extends HttpResponse>> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        this.$this_run.collect(new AnonymousClass1(receiver));
    }
}
