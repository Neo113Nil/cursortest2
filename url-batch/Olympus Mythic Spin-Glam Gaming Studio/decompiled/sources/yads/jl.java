package yads;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class jl extends Lambda implements Function0 {
    public final /* synthetic */ com.monetization.ads.mediation.banner.a b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(com.monetization.ads.mediation.banner.a aVar, View view) {
        super(0);
        this.b = aVar;
        this.c = view;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.b.a(this.c);
        return Unit.INSTANCE;
    }
}
