package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;

/* loaded from: classes11.dex */
public final class Bl implements Function1 {
    public final /* synthetic */ Call a;

    public Bl(Call call) {
        this.a = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.cancel();
        return Unit.INSTANCE;
    }
}
