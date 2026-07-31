package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FunctionArgument.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/evaluable/FunctionArgument;", "", "type", "Lcom/yandex/div/evaluable/EvaluableType;", "isVariadic", "", "(Lcom/yandex/div/evaluable/EvaluableType;Z)V", "()Z", "getType", "()Lcom/yandex/div/evaluable/EvaluableType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FunctionArgument {
    private final boolean isVariadic;

    @NotNull
    private final EvaluableType type;

    public static /* synthetic */ FunctionArgument copy$default(FunctionArgument functionArgument, EvaluableType evaluableType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            evaluableType = functionArgument.type;
        }
        if ((i & 2) != 0) {
            z = functionArgument.isVariadic;
        }
        return functionArgument.copy(evaluableType, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EvaluableType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVariadic() {
        return this.isVariadic;
    }

    @NotNull
    public final FunctionArgument copy(@NotNull EvaluableType type, boolean isVariadic) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new FunctionArgument(type, isVariadic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) other;
        return this.type == functionArgument.type && this.isVariadic == functionArgument.isVariadic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        boolean z = this.isVariadic;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "FunctionArgument(type=" + this.type + ", isVariadic=" + this.isVariadic + ')';
    }

    public FunctionArgument(@NotNull EvaluableType type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.isVariadic = z;
    }

    public /* synthetic */ FunctionArgument(EvaluableType evaluableType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(evaluableType, (i & 2) != 0 ? false : z);
    }

    @NotNull
    public final EvaluableType getType() {
        return this.type;
    }

    public final boolean isVariadic() {
        return this.isVariadic;
    }
}
