package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.screens.CalibrationScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.DebriefScreenKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class yb implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ RelayViewModel e;
    public final /* synthetic */ bu f;
    public final /* synthetic */ bu g;
    public final /* synthetic */ int h;

    public /* synthetic */ yb(RelayViewModel relayViewModel, bu buVar, bu buVar2, int i, int i2) {
        this.d = i2;
        this.e = relayViewModel;
        this.f = buVar;
        this.g = buVar2;
        this.h = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 CalibrationScreen$lambda$24;
        ky0 DebriefScreen$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CalibrationScreen$lambda$24 = CalibrationScreenKt.CalibrationScreen$lambda$24(this.e, this.f, this.g, this.h, (ih) obj, intValue);
                return CalibrationScreen$lambda$24;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                DebriefScreen$lambda$5 = DebriefScreenKt.DebriefScreen$lambda$5(this.e, this.f, this.g, this.h, (ih) obj, intValue2);
                return DebriefScreen$lambda$5;
        }
    }
}
