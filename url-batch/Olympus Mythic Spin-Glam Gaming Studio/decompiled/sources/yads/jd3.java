package yads;

import android.content.Context;
import com.ironsource.B5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class jd3 extends Lambda implements Function1 {
    public final /* synthetic */ kd3 b;
    public final /* synthetic */ bd3 c;
    public final /* synthetic */ v3 d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd3(kd3 kd3Var, bd3 bd3Var, v3 v3Var, Context context) {
        super(1);
        this.b = kd3Var;
        this.c = bd3Var;
        this.d = v3Var;
        this.e = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rl2 rl2Var = (rl2) obj;
        kd3 kd3Var = this.b;
        bd3 bd3Var = this.c;
        v3 v3Var = this.d;
        Context context = this.e;
        rl2Var.a(B5.N, "UTF-8");
        kd3Var.a.getClass();
        rl2Var.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        Map a = bd3Var.a();
        if (a != null) {
            for (Map.Entry entry : a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!StringsKt.isBlank(str)) {
                    rl2Var.a(str, str2);
                }
            }
        }
        om0 om0Var = v3Var.b.a;
        kd3Var.c.getClass();
        if (!fy2.a(context)) {
            rl2Var.a(CommonUrlParts.UUID, om0Var.b());
            rl2Var.a("mauid", om0Var.d);
        }
        kd3Var.b.getClass();
        pw.a(context, new ow(rl2Var));
        new sm0(context, v3Var).a(context, new rm0(rl2Var));
        return rl2Var;
    }
}
