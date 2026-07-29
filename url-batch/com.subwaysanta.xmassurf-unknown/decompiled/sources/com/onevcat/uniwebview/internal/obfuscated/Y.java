package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Y implements O2 {
    @Override // com.onevcat.uniwebview.internal.obfuscated.O2
    public final void a(String name, P2 method, D2 payload) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        a(name, method, payload.a());
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.O2
    public final void a(String name, P2 method, String parameters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
