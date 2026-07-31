package com.mobilefuse.sdk.rx;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "invoke"}, k = 3, mv = {1, 4, 3}, xi = 128)
/* loaded from: classes.dex */
public final class FlowKt$transformOnThread$1 extends Lambda implements Function1 {
    final /* synthetic */ Schedulers $scheduler;
    final /* synthetic */ Flow $this_transformOnThread;
    final /* synthetic */ Function2 $transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$transformOnThread$1(Flow flow, Schedulers schedulers, Function2 function2) {
        super(1);
        this.$this_transformOnThread = flow;
        this.$scheduler = schedulers;
        this.$transform = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FlowCollector) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull final FlowCollector<? super R> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        SchedulersKt.runOnScheduler(this.$scheduler, new Function0() { // from class: com.mobilefuse.sdk.rx.FlowKt$transformOnThread$1.1
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
                FlowKt$transformOnThread$1.this.$this_transformOnThread.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt.transformOnThread.1.1.1
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
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        FlowKt$transformOnThread$1.this.$transform.invoke(flow, value);
                    }
                });
            }
        });
    }
}
