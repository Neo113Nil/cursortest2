package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4571b8 extends Throwable {

    @NotNull
    private final IronSourceError a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4571b8(@NotNull IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
    }

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C4571b8.class, obj.getClass())) {
            return false;
        }
        C4571b8 c4571b8 = (C4571b8) obj;
        if (this.a.getErrorCode() != c4571b8.a.getErrorCode()) {
            return false;
        }
        return Intrinsics.areEqual(this.a.getErrorMessage(), c4571b8.a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a.getErrorCode()), this.a.getErrorMessage());
    }
}
