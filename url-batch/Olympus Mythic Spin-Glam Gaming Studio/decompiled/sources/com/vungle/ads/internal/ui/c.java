package com.vungle.ads.internal.ui;

import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class c extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i2, Intent intent) {
        super(0);
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onActivityResult: ");
        a.append(this.a);
        a.append(", ");
        a.append(this.b);
        a.append(", ");
        a.append(this.c);
        return a.toString();
    }
}
