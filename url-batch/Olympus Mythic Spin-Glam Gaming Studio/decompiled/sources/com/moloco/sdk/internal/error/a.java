package com.moloco.sdk.internal.error;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class a {
    public static final int b = 0;

    @Nullable
    public final String a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "ErrorMetadata(mtid=" + this.a + ')';
    }

    public a(@Nullable String str) {
        this.a = str;
    }

    @NotNull
    public final a a(@Nullable String str) {
        return new a(str);
    }

    public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.a;
        }
        return aVar.a(str);
    }
}
