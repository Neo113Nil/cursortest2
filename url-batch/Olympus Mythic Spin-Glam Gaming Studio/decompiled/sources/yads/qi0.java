package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class qi0 extends Lambda implements Function0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ ki0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(Context context, ki0 ki0Var) {
        super(0);
        this.b = context;
        this.c = ki0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        vw2 vw2Var;
        yh0 yh0Var = new yh0(this.b);
        kh0 kh0Var = new kh0(new mh0(), new qh0(), new ph0(), new lh0(), new rh0(), new nh0());
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
        bu2 a = vw2Var2.a(this.b);
        DivConfiguration.Builder typefaceProvider = new DivConfiguration.Builder(yh0Var).divCustomContainerViewAdapter(kh0Var).typefaceProvider(Intrinsics.areEqual(a != null ? Boolean.valueOf(fu2.a(a)) : null, Boolean.TRUE) ? new fj0(this.b) : new hj0(this.b));
        ki0 ki0Var = this.c;
        if (ki0Var != null) {
            typefaceProvider = typefaceProvider.extension(new mi0(ki0Var));
        }
        return typefaceProvider.extension(new yi0()).build();
    }
}
