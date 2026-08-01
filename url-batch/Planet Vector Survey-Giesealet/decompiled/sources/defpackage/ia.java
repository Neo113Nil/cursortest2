package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.screens.BriefingScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.CalibrationScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.LoadingScreenKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements ru {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ia(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        ky0 BriefingScreen$lambda$6$lambda$5;
        ky0 CalibrationScreen$lambda$23;
        ky0 LoadingScreen$lambda$5;
        int i = this.d;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                BriefingScreen$lambda$6$lambda$5 = BriefingScreenKt.BriefingScreen$lambda$6$lambda$5((bu) obj6, (bu) obj5, (bu) obj4, (xe) obj, (ih) obj2, ((Integer) obj3).intValue());
                return BriefingScreen$lambda$6$lambda$5;
            case 1:
                CalibrationScreen$lambda$23 = CalibrationScreenKt.CalibrationScreen$lambda$23((bu) obj6, (bt0) obj5, (RelayViewModel) obj4, (xe) obj, (ih) obj2, ((Integer) obj3).intValue());
                return CalibrationScreen$lambda$23;
            default:
                LoadingScreen$lambda$5 = LoadingScreenKt.LoadingScreen$lambda$5((bt0) obj6, (bt0) obj5, (String) obj4, (ga) obj, (ih) obj2, ((Integer) obj3).intValue());
                return LoadingScreen$lambda$5;
        }
    }
}
