package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.telemetry.Telemetry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Telemetry.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p1", "", "p2", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
final /* synthetic */ class Telemetry$Companion$initialize$1 extends FunctionReferenceImpl implements Function2 {
    Telemetry$Companion$initialize$1(Telemetry.Companion companion) {
        super(2, companion, Telemetry.Companion.class, "logException", "logException(Ljava/lang/Object;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(obj, (Throwable) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Object p1, @NotNull Throwable p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((Telemetry.Companion) this.receiver).logException(p1, p2);
    }
}
