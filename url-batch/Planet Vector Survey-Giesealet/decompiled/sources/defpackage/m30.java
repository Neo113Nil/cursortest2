package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.screens.LoadingScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.RulesScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.theme.ThemeKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class m30 implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ yu e;
    public final /* synthetic */ int f;

    public /* synthetic */ m30(yu yuVar, int i, int i2) {
        this.d = i2;
        this.e = yuVar;
        this.f = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 LoadingScreen$lambda$6;
        ky0 RulesScreen$lambda$1;
        ky0 PlanetVectorSurveyTheme$lambda$0;
        int i = this.d;
        int i2 = this.f;
        yu yuVar = this.e;
        switch (i) {
            case 0:
                LoadingScreen$lambda$6 = LoadingScreenKt.LoadingScreen$lambda$6((bu) yuVar, i2, (ih) obj, ((Integer) obj2).intValue());
                return LoadingScreen$lambda$6;
            case 1:
                RulesScreen$lambda$1 = RulesScreenKt.RulesScreen$lambda$1((bu) yuVar, i2, (ih) obj, ((Integer) obj2).intValue());
                return RulesScreen$lambda$1;
            default:
                PlanetVectorSurveyTheme$lambda$0 = ThemeKt.PlanetVectorSurveyTheme$lambda$0((qu) yuVar, i2, (ih) obj, ((Integer) obj2).intValue());
                return PlanetVectorSurveyTheme$lambda$0;
        }
    }
}
