package com.vectorharbor.planetvectorsurvey.ui.components;

import androidx.compose.foundation.layout.b;
import com.vectorharbor.planetvectorsurvey.ui.theme.ColorKt;
import defpackage.ax;
import defpackage.cy;
import defpackage.dy0;
import defpackage.eg;
import defpackage.ey0;
import defpackage.fz0;
import defpackage.ge;
import defpackage.ge0;
import defpackage.ie0;
import defpackage.ih;
import defpackage.iz0;
import defpackage.je0;
import defpackage.ke0;
import defpackage.ks0;
import defpackage.ky0;
import defpackage.pv0;
import defpackage.px0;
import defpackage.qh;
import defpackage.qu;
import defpackage.r50;
import defpackage.re0;
import defpackage.ut;
import defpackage.uw;
import defpackage.we0;
import defpackage.yw;
import defpackage.ze;
import defpackage.zw;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ComposableSingletons$RelayComponentsKt {
    public static final ComposableSingletons$RelayComponentsKt INSTANCE = new ComposableSingletons$RelayComponentsKt();
    private static qu lambda$1965612397 = new eg(1965612397, false, new ze(4));
    private static qu lambda$705031925 = new eg(705031925, false, new ze(5));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 lambda_1965612397$lambda$0(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 3) != 2)) {
            ax axVar = px0.h;
            if (axVar == null) {
                zw zwVar = new zw(24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i2 = fz0.a;
                ks0 ks0Var = new ks0(ge.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new ke0(20.0f, 11.0f));
                arrayList.add(new ie0(7.83f));
                arrayList.add(new re0(5.59f, -5.59f));
                arrayList.add(new je0(12.0f, 4.0f));
                arrayList.add(new re0(-8.0f, 8.0f));
                arrayList.add(new re0(8.0f, 8.0f));
                arrayList.add(new re0(1.41f, -1.41f));
                arrayList.add(new je0(7.83f, 13.0f));
                arrayList.add(new ie0(20.0f));
                arrayList.add(new we0(-2.0f));
                arrayList.add(ge0.c);
                if (zwVar.k) {
                    cy.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                ArrayList arrayList2 = zwVar.i;
                ((yw) arrayList2.get(arrayList2.size() - 1)).j.add(new iz0("", arrayList, 0, ks0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
                axVar = zwVar.a();
                px0.h = axVar;
            }
            uw.a(axVar, null, ColorKt.getSoftWhite(), qhVar, 3120);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 lambda_705031925$lambda$1(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 3) != 2)) {
            pv0.b("Active", b.c(r50.a, 10.0f, 6.0f), ColorKt.getNebulaInk(), 0L, ut.i, 0L, null, 0L, 0, false, 0, 0, ((dy0) qhVar.j(ey0.a)).m, qhVar, 197046, 65496);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    public final qu getLambda$1965612397$app() {
        return lambda$1965612397;
    }

    public final qu getLambda$705031925$app() {
        return lambda$705031925;
    }
}
