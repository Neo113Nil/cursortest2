package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q7 {
    public final InterfaceC5383hb a;
    public String b = "";

    public Q7(InterfaceC5383hb interfaceC5383hb) {
        this.a = interfaceC5383hb;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || Intrinsics.areEqual(this.b, str)) {
                return;
            }
            this.b = str;
            this.a.a(str, z);
        }
    }
}
