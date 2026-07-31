package yads;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.ironsource.X3;
import com.yandex.div.R;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class fi0 {
    public final di0 a;

    public fi0(di0 di0Var) {
        this.a = di0Var;
    }

    public final Div2View a(Context context, ci0 ci0Var) {
        String lowerCase;
        vw2 vw2Var;
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
        Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R.style.Div), new DivConfiguration.Builder(new yh0(context)).actionHandler(this.a).typefaceProvider(Intrinsics.areEqual(a != null ? Boolean.valueOf(fu2.a(a)) : null, Boolean.TRUE) ? new fj0(context) : new hj0(context)).build(), 0, null, 4, null), null, 0, 6, null);
        div2View.setTag("");
        ri0 ri0Var = ci0Var.b;
        div2View.setData(ri0Var.e, ri0Var.f);
        hb2 b = pz.b(context);
        if (b == hb2.e) {
            lowerCase = "PORTRAIT".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = b.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        div2View.setVariable(X3.i.n, lowerCase);
        return div2View;
    }
}
