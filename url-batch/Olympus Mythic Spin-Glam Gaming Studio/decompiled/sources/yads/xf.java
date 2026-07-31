package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class xf extends Lambda implements Function0 {
    public final /* synthetic */ dq3 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ bg d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(dq3 dq3Var, Context context, bg bgVar, String str) {
        super(0);
        this.b = dq3Var;
        this.c = context;
        this.d = bgVar;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        dq3 dq3Var = this.b;
        dq3Var.a.a(this.c);
        bg bgVar = this.d;
        String str = this.e;
        if (bgVar.a.a()) {
            try {
                yb0 yb0Var = bgVar.b;
                yb0Var.getClass();
                AppMetrica.activateReporter(yb0Var.a, ReporterConfig.newConfigBuilder(str).build());
            } catch (Throwable unused) {
                boolean z = ob1.a;
            }
        }
        yb0 yb0Var2 = this.d.b;
        return new ac0(AppMetrica.getReporter(yb0Var2.a, this.e));
    }
}
