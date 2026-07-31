package com.mobilefuse.sdk;

import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdController.kt */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
/* loaded from: classes8.dex */
final class AdController$sam$com_mobilefuse_sdk_AdLifecycleEventListener$0 implements AdLifecycleEventListener, FunctionAdapter {
    private final /* synthetic */ Function3 function;

    AdController$sam$com_mobilefuse_sdk_AdLifecycleEventListener$0(Function3 function3) {
        this.function = function3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AdLifecycleEventListener) && (obj instanceof FunctionAdapter) && Intrinsics.areEqual(this.function, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public Function getFunctionDelegate() {
        return this.function;
    }

    public int hashCode() {
        return this.function.hashCode();
    }

    @Override // com.mobilefuse.sdk.AdLifecycleEventListener
    public final /* synthetic */ void onAdLifecycleEvent(AdLifecycleEvent event, ExtendedAdType extendedAdType, Map map) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(extendedAdType, "extendedAdType");
        Intrinsics.checkNotNullExpressionValue(this.function.invoke(event, extendedAdType, map), "invoke(...)");
    }
}
