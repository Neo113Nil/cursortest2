package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class u2 extends Lambda implements Function0 {
    public final /* synthetic */ w2 a;
    public final /* synthetic */ VungleError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(w2 w2Var, VungleError vungleError) {
        super(0);
        this.a = w2Var;
        this.b = vungleError;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", "onError");
        CopyOnWriteArrayList copyOnWriteArrayList = this.a.c;
        VungleError vungleError = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onError(vungleError);
        }
        this.a.c.clear();
        return Unit.INSTANCE;
    }
}
