package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.buffering.BatchProcessor;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C5530n3 implements BatchProcessor, FunctionAdapter {
    public final /* synthetic */ C5556o3 a;

    public C5530n3(C5556o3 c5556o3) {
        this.a = c5556o3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof BatchProcessor) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, C5556o3.class, "processTasks", "processTasks(Ljava/util/List;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.buffering.BatchProcessor
    public final void processBatch(List list) {
        C5556o3 c5556o3 = this.a;
        c5556o3.getClass();
        try {
            c5556o3.a.invoke(list);
        } catch (Exception unused) {
        }
    }
}
