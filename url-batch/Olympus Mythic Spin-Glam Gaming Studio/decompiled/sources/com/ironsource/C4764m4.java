package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4764m4 {

    @NotNull
    private final Throwable a;

    @NotNull
    private final String b;
    private final boolean c;

    public C4764m4(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.a = throwable;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            String stackTraceElement2 = stackTraceElement.toString();
            Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "elem.toString()");
            String e = C4782n4.d().e();
            Intrinsics.checkNotNullExpressionValue(e, "getInstance().keyword");
            if (StringsKt.contains$default((CharSequence) stackTraceElement2, (CharSequence) e, false, 2, (Object) null)) {
                z = true;
            }
        }
        Throwable cause = this.a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement3 : stackTrace2) {
                sb.append(stackTraceElement3.toString());
                sb.append(";" + System.lineSeparator());
                String stackTraceElement4 = stackTraceElement3.toString();
                Intrinsics.checkNotNullExpressionValue(stackTraceElement4, "elem.toString()");
                String e2 = C4782n4.d().e();
                Intrinsics.checkNotNullExpressionValue(e2, "getInstance().keyword");
                if (StringsKt.contains$default((CharSequence) stackTraceElement4, (CharSequence) e2, false, 2, (Object) null)) {
                    z = true;
                }
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        this.b = sb2;
        this.c = z;
    }

    @NotNull
    public final Throwable a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final Throwable c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4764m4) && Intrinsics.areEqual(this.a, ((C4764m4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrashReportWrapper(throwable=" + this.a + ")";
    }

    @NotNull
    public final C4764m4 a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C4764m4(throwable);
    }

    public static /* synthetic */ C4764m4 a(C4764m4 c4764m4, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c4764m4.a;
        }
        return c4764m4.a(th);
    }
}
