package defpackage;

import com.vectorharbor.planetvectorsurvey.navigation.PlanetVectorSurveyAppKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class fg0 implements mu {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ RelayViewModel e;
    public final /* synthetic */ s80 f;

    public /* synthetic */ fg0(s80 s80Var, RelayViewModel relayViewModel) {
        this.f = s80Var;
        this.e = relayViewModel;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        ky0 PlanetVectorSurveyApp$lambda$38$lambda$37;
        ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16$lambda$15$lambda$14;
        switch (this.d) {
            case 0:
                PlanetVectorSurveyApp$lambda$38$lambda$37 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37(this.f, this.e, (q80) obj);
                return PlanetVectorSurveyApp$lambda$38$lambda$37;
            default:
                PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16$lambda$15$lambda$14 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16$lambda$15$lambda$14(this.e, this.f, ((Integer) obj).intValue());
                return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$16$lambda$15$lambda$14;
        }
    }

    public /* synthetic */ fg0(RelayViewModel relayViewModel, s80 s80Var) {
        this.e = relayViewModel;
        this.f = s80Var;
    }
}
