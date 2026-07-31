package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.nf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4793nf implements Jb<AbstractC4686hf, C4942w> {
    @Override // com.ironsource.Jb
    @NotNull
    public C4942w a(@NotNull AbstractC4686hf input) {
        S7 s7;
        String str;
        String g;
        String i;
        String h;
        Intrinsics.checkNotNullParameter(input, "input");
        EnumC4811of b = input.b();
        P a = input.a();
        String str2 = (a == null || (h = a.h()) == null) ? "0" : h;
        P a2 = input.a();
        String str3 = (a2 == null || (i = a2.i()) == null) ? "0" : i;
        P a3 = input.a();
        String str4 = (a3 == null || (g = a3.g()) == null) ? "0" : g;
        P a4 = input.a();
        if (a4 == null || (s7 = a4.e()) == null) {
            s7 = S7.UnknownProvider;
        }
        S7 s72 = s7;
        P a5 = input.a();
        if (a5 == null || (str = a5.c()) == null) {
            str = "0";
        }
        return new C4942w(b, str2, str3, str4, s72, str);
    }
}
