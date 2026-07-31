package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5740v5 implements IExecutionPolicy {
    public final IExecutionPolicy[] a;
    public final String b;

    public C5740v5(@NotNull IExecutionPolicy... iExecutionPolicyArr) {
        this.a = iExecutionPolicyArr;
        this.b = "Composite of {" + ArraysKt.joinToString$default(iExecutionPolicyArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C5714u5.a, 30, (Object) null) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.b;
    }
}
