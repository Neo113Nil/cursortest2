package com.inmobi.media;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC3953e {
    public static final boolean a() {
        return true;
    }

    public static void a(final N0 process, final Vg vg, Long l, final Function0 shouldProcess) {
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(shouldProcess, "shouldProcess");
        Lazy lazy = F0.a;
        long longValue = l != null ? l.longValue() : 0L;
        Function0 execute = new Function0() { // from class: com.inmobi.media.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return AbstractC3953e.a(Function0.this, process, vg);
            }
        };
        Intrinsics.checkNotNullParameter(execute, "execute");
        CoroutineScope coroutineScope = F0.e;
        if (coroutineScope == null) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
            F0.e = coroutineScope;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new E0(longValue, execute, null), 3, null);
    }

    public static final Unit a(Function0 function0, N0 n0, Vg vg) {
        try {
            if (((Boolean) function0.mo4828invoke()).booleanValue()) {
                Object a = n0.a();
                if (vg != null) {
                    vg.a(a);
                }
            } else if (vg != null) {
                vg.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e) {
            if (vg != null) {
                vg.onError(e);
            }
        }
        return Unit.INSTANCE;
    }
}
