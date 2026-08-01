package com.vectorharbor.planetvectorsurvey;

import com.vectorharbor.planetvectorsurvey.navigation.PlanetVectorSurveyAppKt;
import com.vectorharbor.planetvectorsurvey.ui.theme.ThemeKt;
import defpackage.au0;
import defpackage.eg;
import defpackage.ih;
import defpackage.ky0;
import defpackage.qh;
import defpackage.qu;
import defpackage.ze;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();
    private static qu lambda$402480579 = new eg(402480579, false, new ze(1));
    private static qu lambda$1299297320 = new eg(1299297320, false, new ze(2));

    /* renamed from: lambda$-998255631, reason: not valid java name */
    private static qu f0lambda$998255631 = new eg(-998255631, false, new ze(3));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 lambda_1299297320$lambda$1(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 3) != 2)) {
            au0.a(null, null, 0L, 0L, 0.0f, null, lambda$402480579, qhVar, 12582912, 127);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 lambda_402480579$lambda$0(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 3) != 2)) {
            PlanetVectorSurveyAppKt.PlanetVectorSurveyApp(qhVar, 0);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 lambda__998255631$lambda$2(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        if (qhVar.N(i & 1, (i & 3) != 2)) {
            ThemeKt.PlanetVectorSurveyTheme(lambda$1299297320, qhVar, 6);
        } else {
            qhVar.Q();
        }
        return ky0.a;
    }

    /* renamed from: getLambda$-998255631$app, reason: not valid java name */
    public final qu m6getLambda$998255631$app() {
        return f0lambda$998255631;
    }

    public final qu getLambda$1299297320$app() {
        return lambda$1299297320;
    }

    public final qu getLambda$402480579$app() {
        return lambda$402480579;
    }
}
