package defpackage;

import com.vectorharbor.planetvectorsurvey.model.RunResult;
import com.vectorharbor.planetvectorsurvey.ui.screens.DebriefScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.RulesScreenKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class gc implements ru {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gc(u70 u70Var, t70 t70Var) {
        this.d = 2;
        this.e = u70Var;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        ky0 DebriefScreen$lambda$4$lambda$1;
        ky0 RulesScreen$lambda$0;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((h) obj4).c((Throwable) obj);
                return ky0Var;
            case 1:
                DebriefScreen$lambda$4$lambda$1 = DebriefScreenKt.DebriefScreen$lambda$4$lambda$1((RunResult) obj4, (xe) obj, (ih) obj2, ((Integer) obj3).intValue());
                return DebriefScreen$lambda$4$lambda$1;
            case 2:
                u70 u70Var = (u70) obj4;
                u70.g.set(u70Var, null);
                u70Var.d(null);
                return ky0Var;
            case 3:
                RulesScreen$lambda$0 = RulesScreenKt.RulesScreen$lambda$0((bu) obj4, (xe) obj, (ih) obj2, ((Integer) obj3).intValue());
                return RulesScreen$lambda$0;
            default:
                ((dq0) obj4).b();
                return ky0Var;
        }
    }

    public /* synthetic */ gc(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
