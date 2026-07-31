package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class J6 implements Xf {

    @NotNull
    public static final I6 b = new I6();
    public final Xf a;

    /* JADX WARN: Multi-variable type inference failed */
    public J6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Xf
    @Nullable
    public final String a() {
        return this.a.a();
    }

    public final boolean b() {
        try {
            String a = this.a.a();
            if (a != null && a.length() > 0) {
                return !StringsKt.contains$default((CharSequence) a, (CharSequence) ":", false, 2, (Object) null);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public J6(@NotNull Xf xf) {
        this.a = xf;
    }

    public final boolean a(@NotNull String str) {
        try {
            String a = this.a.a();
            if (a == null || a.length() <= 0) {
                return false;
            }
            StringBuilder sb = new StringBuilder(":");
            sb.append(str);
            return StringsKt.endsWith$default(a, sb.toString(), false, 2, (Object) null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ J6(Xf xf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xf);
        if ((i & 1) != 0) {
            b.getClass();
            xf = I6.a();
        }
    }
}
