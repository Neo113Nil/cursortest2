package defpackage;

import android.graphics.Typeface;
import com.vectorharbor.planetvectorsurvey.navigation.PlanetVectorSurveyAppKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class eg0 implements su {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eg0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.su
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$22;
        ky0 PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4;
        int i = this.d;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$22 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$22((s80) obj5, (k6) obj, (y70) obj2, (ih) obj3, ((Integer) obj4).intValue());
                return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$22;
            case 1:
                PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4 = PlanetVectorSurveyAppKt.PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4((s80) obj5, (k6) obj, (y70) obj2, (ih) obj3, ((Integer) obj4).intValue());
                return PlanetVectorSurveyApp$lambda$38$lambda$37$lambda$4;
            default:
                d5 d5Var = (d5) obj5;
                by0 b = ((dt) d5Var.h).b((qu0) obj, (ut) obj2, ((st) obj3).a, ((tt) obj4).a);
                if (b instanceof by0) {
                    Object obj6 = b.d;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                t7 t7Var = new t7(b, d5Var.m);
                d5Var.m = t7Var;
                Object obj7 = t7Var.g;
                obj7.getClass();
                return (Typeface) obj7;
        }
    }
}
