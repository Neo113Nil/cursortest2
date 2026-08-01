package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.ArrayDeckScreenKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class d8 implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d8(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 ArrayDeckScreen$lambda$7;
        ky0 CenterMessage$lambda$40;
        int i = this.d;
        ky0 ky0Var = ky0.a;
        int i2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ArrayDeckScreen$lambda$7 = ArrayDeckScreenKt.ArrayDeckScreen$lambda$7((RelayViewModel) obj4, (bu) obj3, i2, (ih) obj, ((Integer) obj2).intValue());
                return ArrayDeckScreen$lambda$7;
            case 1:
                ((Integer) obj2).getClass();
                ((eg) obj4).e(obj3, (ih) obj, yc0.v(i2) | 1);
                return ky0Var;
            case 2:
                ((Integer) obj2).getClass();
                nz.b((ki0) obj4, (qu) obj3, (ih) obj, yc0.v(i2 | 1));
                return ky0Var;
            case 3:
                ((Integer) obj2).getClass();
                nz.c((ki0[]) obj4, (qu) obj3, (ih) obj, yc0.v(i2 | 1));
                return ky0Var;
            default:
                CenterMessage$lambda$40 = RelayComponentsKt.CenterMessage$lambda$40((String) obj4, (String) obj3, i2, (ih) obj, ((Integer) obj2).intValue());
                return CenterMessage$lambda$40;
        }
    }
}
