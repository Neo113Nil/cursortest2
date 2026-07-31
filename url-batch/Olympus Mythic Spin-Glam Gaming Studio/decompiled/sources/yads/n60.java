package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class n60 extends Lambda implements Function0 {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(Context context) {
        super(0);
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        pm0 pm0Var;
        Context context = this.b;
        pm0 pm0Var2 = pm0.c;
        if (pm0Var2 != null) {
            return pm0Var2;
        }
        synchronized (pm0.d) {
            pm0Var = pm0.c;
            if (pm0Var == null) {
                pm0Var = new pm0(context.getApplicationContext());
                pm0.c = pm0Var;
            }
        }
        return pm0Var;
    }
}
