package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class z implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public z(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        y yVar;
        int i;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i2 = yVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = yVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = yVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Map<Preferences.Key<?>, Object> asMap = ((Preferences) obj).asMap();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Preferences.Key<?>, Object> entry : asMap.entrySet()) {
                        if (!Intrinsics.areEqual(entry.getKey().getName(), "migration_completed")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(((Preferences.Key) entry2.getKey()).getName(), entry2.getValue());
                    }
                    yVar.b = 1;
                    if (flowCollector.emit(linkedHashMap2, yVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        yVar = new y(this, continuation);
        Object obj22 = yVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = yVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
