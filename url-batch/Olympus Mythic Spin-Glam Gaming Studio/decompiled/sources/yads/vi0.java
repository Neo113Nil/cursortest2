package yads;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.yandex.div.core.DivConfiguration;
import com.yandex.mobile.ads.R$layout;
import kotlin.LazyKt;

/* loaded from: classes12.dex */
public final class vi0 implements tx0 {
    public final ri0 a;
    public final v3 b;
    public final yu2 c;
    public final dy d;
    public final o2 e;
    public final ai0 f;
    public final int g;
    public final jh0 h;

    public vi0(ri0 ri0Var, v3 v3Var, yu2 yu2Var, dy dyVar, o2 o2Var, ai0 ai0Var, int i) {
        Context context = ((nt3) yu2Var).a;
        jh0 jh0Var = new jh0(pr.a(context, context));
        this.a = ri0Var;
        this.b = v3Var;
        this.c = yu2Var;
        this.d = dyVar;
        this.e = o2Var;
        this.f = ai0Var;
        this.g = i;
        this.h = jh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.tx0
    public final md1 a(Activity activity, t8 t8Var, m12 m12Var, d2 d2Var, x00 x00Var) {
        DivConfiguration divConfiguration;
        ri0 ri0Var = this.a;
        ku kuVar = new ku(ri0Var.h);
        ki0 ki0Var = new ki0(kuVar);
        jh0 jh0Var = this.h;
        jh0Var.getClass();
        if (m12Var instanceof k32) {
            mt1 mt1Var = jh0Var.a;
            h13 h13Var = new h13(mt1Var);
            h13Var.b.put(ri0Var.e, new j13((k32) m12Var, mt1Var, ri0Var.h));
            divConfiguration = i13.a(activity, h13Var, ki0Var);
        } else {
            divConfiguration = (DivConfiguration) LazyKt.lazy(new qi0(activity, ki0Var)).getValue();
        }
        DivConfiguration divConfiguration2 = divConfiguration;
        zh0 zh0Var = new zh0(activity, this.b, this.c, t8Var, d2Var, this.f, ki0Var);
        Context context = ((nt3) this.c).a;
        mt1 a = pr.a(context, context);
        return new md1(R$layout.monetization_ads_internal_divkit, new dy(new lp2(this.e, this.g), new ji0(this.a.e, zh0Var, divConfiguration2, a, activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null, 208), new nx0(m12Var, d2Var, x00Var, kuVar, a), this.d), new ui0(t8Var));
    }
}
