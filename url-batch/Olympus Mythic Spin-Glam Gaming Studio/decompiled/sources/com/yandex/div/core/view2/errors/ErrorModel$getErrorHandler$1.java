package com.yandex.div.core.view2.errors;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class ErrorModel$getErrorHandler$1 extends FunctionReferenceImpl implements Function1 {
    ErrorModel$getErrorHandler$1(Object obj) {
        super(1, obj, DivActionTypedUtilsKt.class, "logError", "logError(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Throwable;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Throwable th) {
        DivActionTypedUtilsKt.logError((Div2View) this.receiver, th);
    }
}
