package yads;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class un1 extends Lambda implements Function1 {
    public final /* synthetic */ wn1 b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un1(wn1 wn1Var, Object obj) {
        super(1);
        this.b = wn1Var;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wn1 wn1Var = this.b;
        d4 d4Var = e8.f;
        Object obj2 = this.c;
        wn1Var.a();
        wn1Var.b();
        wn1Var.a(wn1Var.n, MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("error_code", Integer.valueOf(d4Var.a)), TuplesKt.to(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, d4Var.b)));
        Context context = wn1Var.n;
        wn1Var.a(context);
        wn1Var.a(context, obj2);
        return Unit.INSTANCE;
    }
}
