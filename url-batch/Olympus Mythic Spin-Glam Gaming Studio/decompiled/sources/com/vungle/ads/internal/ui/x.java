package com.vungle.ads.internal.ui;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class x extends Lambda implements Function0 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(0);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Requested range exceeds cached file: ");
        a.append(this.a);
        return a.toString();
    }
}
