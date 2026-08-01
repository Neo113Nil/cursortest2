package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.screens.SectorsScreenKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class cg implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cg(wm0 wm0Var, Object obj, eg egVar, int i) {
        this.d = 2;
        this.h = wm0Var;
        this.g = obj;
        this.f = egVar;
        this.e = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 SectorsScreen$lambda$8;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        int i2 = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((eg) obj5).g(obj4, obj3, (ih) obj, yc0.v(i2) | 1);
                return ky0Var;
            case 1:
                ((Integer) obj2).intValue();
                mz.n((o20) obj5, (r20) obj4, (mu) obj3, (ih) obj, yc0.v(i2 | 1));
                return ky0Var;
            case 2:
                ((Integer) obj2).getClass();
                ((wm0) obj3).a(obj4, (eg) obj5, (ih) obj, yc0.v(i2 | 1));
                return ky0Var;
            default:
                int intValue = ((Integer) obj2).intValue();
                SectorsScreen$lambda$8 = SectorsScreenKt.SectorsScreen$lambda$8((RelayViewModel) obj5, (bu) obj4, (mu) obj3, this.e, (ih) obj, intValue);
                return SectorsScreen$lambda$8;
        }
    }

    public /* synthetic */ cg(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.e = i;
    }
}
