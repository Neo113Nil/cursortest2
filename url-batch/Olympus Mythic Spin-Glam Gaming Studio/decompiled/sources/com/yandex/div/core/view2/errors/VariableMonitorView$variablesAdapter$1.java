package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: VariableMonitorView.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class VariableMonitorView$variablesAdapter$1 extends FunctionReferenceImpl implements Function3 {
    VariableMonitorView$variablesAdapter$1(Object obj) {
        super(3, obj, VariableMonitor.class, "mutateVariable", "mutateVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, (String) obj2, (String) obj3);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ((VariableMonitor) this.receiver).mutateVariable(str, str2, str3);
    }
}
