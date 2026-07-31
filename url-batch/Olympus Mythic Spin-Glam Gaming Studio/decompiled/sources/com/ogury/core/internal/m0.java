package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes6.dex */
public final class m0 implements FlowCollector {
    public final /* synthetic */ FlowCollector a;
    public final /* synthetic */ Ref$ObjectRef b;

    public m0(FlowCollector flowCollector, Ref$ObjectRef ref$ObjectRef) {
        this.a = flowCollector;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.AbstractMap, java.util.LinkedHashMap, java.util.Map] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        l0 l0Var;
        int i;
        if (continuation instanceof l0) {
            l0Var = (l0) continuation;
            int i2 = l0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0Var.b = i2 - Integer.MIN_VALUE;
                Object obj2 = l0Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = l0Var.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Map<Preferences.Key<?>, Object> asMap = ((Preferences) obj).asMap();
                    ?? linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Preferences.Key<?>, Object> entry : asMap.entrySet()) {
                        if (!Intrinsics.areEqual(entry.getKey().getName(), "migration_completed")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        Preferences.Key key = (Preferences.Key) entry2.getKey();
                        if (!Intrinsics.areEqual(((Map) this.b.element).get(key), entry2.getValue())) {
                            linkedHashSet.add(key.getName());
                        }
                    }
                    Iterator it = ((Map) this.b.element).entrySet().iterator();
                    while (it.hasNext()) {
                        Preferences.Key key2 = (Preferences.Key) ((Map.Entry) it.next()).getKey();
                        if (!linkedHashMap.containsKey(key2)) {
                            linkedHashSet.add(key2.getName());
                        }
                    }
                    this.b.element = linkedHashMap;
                    l0Var.b = 1;
                    if (flowCollector.emit(linkedHashSet, l0Var) == coroutine_suspended) {
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
        l0Var = new l0(this, continuation);
        Object obj22 = l0Var.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = l0Var.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
