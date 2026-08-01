package defpackage;

import com.vectorharbor.planetvectorsurvey.model.GaugeState;
import com.vectorharbor.planetvectorsurvey.model.TargetProfile;
import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.BriefingScreenKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class ka implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ka(GaugeState gaugeState, TargetProfile targetProfile, bu buVar, bu buVar2, int i) {
        this.d = 2;
        this.f = gaugeState;
        this.i = targetProfile;
        this.g = buVar;
        this.h = buVar2;
        this.e = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 BriefingScreen$lambda$7;
        ky0 GaugeControlCard$lambda$28;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.h;
        Object obj5 = this.i;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BriefingScreen$lambda$7 = BriefingScreenKt.BriefingScreen$lambda$7((RelayViewModel) obj6, (bu) obj3, (bu) obj4, (bu) obj5, this.e, (ih) obj, intValue);
                return BriefingScreen$lambda$7;
            case 1:
                ((Integer) obj2).getClass();
                int v = yc0.v(this.e | 1);
                Object obj7 = this.g;
                mz.m((Boolean) obj6, obj7, (o20) obj4, (mu) obj5, (ih) obj, v);
                return ky0.a;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                GaugeControlCard$lambda$28 = RelayComponentsKt.GaugeControlCard$lambda$28((GaugeState) obj6, (TargetProfile) obj5, (bu) obj3, (bu) obj4, this.e, (ih) obj, intValue2);
                return GaugeControlCard$lambda$28;
        }
    }

    public /* synthetic */ ka(Object obj, Object obj2, Object obj3, yu yuVar, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = yuVar;
        this.e = i;
    }
}
