package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class i13 {
    public static DivConfiguration a(Context context, h13 h13Var, ki0 ki0Var) {
        vw2 vw2Var;
        yh0 yh0Var = new yh0(context);
        kh0 kh0Var = new kh0(new mh0(), new qh0(), new ph0(), new lh0(), new rh0(), new nh0());
        mi0 mi0Var = new mi0(ki0Var);
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        return new DivConfiguration.Builder(yh0Var).divCustomContainerViewAdapter(kh0Var).typefaceProvider(Intrinsics.areEqual(a != null ? Boolean.valueOf(fu2.a(a)) : null, Boolean.TRUE) ? new fj0(context) : new hj0(context)).extension(h13Var).extension(mi0Var).build();
    }
}
