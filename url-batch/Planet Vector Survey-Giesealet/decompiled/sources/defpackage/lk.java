package defpackage;

import com.vectorharbor.planetvectorsurvey.model.RunResult;
import com.vectorharbor.planetvectorsurvey.ui.screens.DebriefScreenKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class lk implements ru {
    public final /* synthetic */ int d;
    public final /* synthetic */ RunResult e;
    public final /* synthetic */ bu f;
    public final /* synthetic */ bu g;
    public final /* synthetic */ bt0 h;

    public /* synthetic */ lk(RunResult runResult, bu buVar, bu buVar2, bt0 bt0Var, int i) {
        this.d = i;
        this.e = runResult;
        this.f = buVar;
        this.g = buVar2;
        this.h = bt0Var;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        ky0 DebriefScreen$lambda$4$lambda$3;
        ky0 DebriefScreen$lambda$4;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                DebriefScreen$lambda$4$lambda$3 = DebriefScreenKt.DebriefScreen$lambda$4$lambda$3(this.e, this.f, this.g, this.h, (xe) obj, (ih) obj2, intValue);
                return DebriefScreen$lambda$4$lambda$3;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                DebriefScreen$lambda$4 = DebriefScreenKt.DebriefScreen$lambda$4(this.e, this.f, this.g, this.h, (xe) obj, (ih) obj2, intValue2);
                return DebriefScreen$lambda$4;
        }
    }
}
