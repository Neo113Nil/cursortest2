package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4846qe {

    @NotNull
    public static final a c = new a(null);
    public static final int d = 2070;
    public static final int e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;
    public static final int h = 2110;
    private final int a;

    @NotNull
    private final String b;

    /* renamed from: com.ironsource.qe$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4846qe(int i, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.a = i;
        this.b = errorMessage;
    }

    public final int a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4846qe)) {
            return false;
        }
        C4846qe c4846qe = (C4846qe) obj;
        return this.a == c4846qe.a && Intrinsics.areEqual(this.b, c4846qe.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4846qe(@NotNull IronSourceError error) {
        this(r0, r3);
        Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
    }

    @NotNull
    public final C4846qe a(int i, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new C4846qe(i, errorMessage);
    }

    public static /* synthetic */ C4846qe a(C4846qe c4846qe, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c4846qe.a;
        }
        if ((i2 & 2) != 0) {
            str = c4846qe.b;
        }
        return c4846qe.a(i, str);
    }
}
