package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class v2 extends Lambda implements Function0 {
    public final /* synthetic */ w2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(w2 w2Var) {
        super(0);
        this.a = w2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onSuccess();
        }
        this.a.c.clear();
        return Unit.INSTANCE;
    }
}
