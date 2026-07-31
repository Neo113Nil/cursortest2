package com.mobilefuse.sdk;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "p1", "Lcom/mobilefuse/sdk/AdLifecycleEvent;", "p2", "Lcom/mobilefuse/sdk/ExtendedAdType;", "p3", "", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes8.dex */
final /* synthetic */ class AdController$createAdRenderer$3 extends FunctionReferenceImpl implements Function3 {
    AdController$createAdRenderer$3(AdController adController) {
        super(3, adController, AdController.class, "onAdLifecycleEvent", "onAdLifecycleEvent(Lcom/mobilefuse/sdk/AdLifecycleEvent;Lcom/mobilefuse/sdk/ExtendedAdType;Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AdLifecycleEvent) obj, (ExtendedAdType) obj2, (Map<String, String>) obj3);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull AdLifecycleEvent p1, @NotNull ExtendedAdType p2, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((AdController) this.receiver).onAdLifecycleEvent(p1, p2, map);
    }
}
