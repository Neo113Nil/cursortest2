package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.telemetry.TelemetryManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Telemetry.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p1", "p2", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
final /* synthetic */ class Telemetry$Companion$initialize$2 extends FunctionReferenceImpl implements Function2 {
    Telemetry$Companion$initialize$2(TelemetryManager.Companion companion) {
        super(2, companion, TelemetryManager.Companion.class, "registerVariable", "registerVariable(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String p1, @NotNull String p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((TelemetryManager.Companion) this.receiver).registerVariable(p1, p2);
    }
}
