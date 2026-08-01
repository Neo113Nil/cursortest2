package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.screens.ArrayDeckScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.SectorsScreenKt;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements ru {
    public final /* synthetic */ int d;
    public final /* synthetic */ bu e;
    public final /* synthetic */ RelayViewModel f;
    public final /* synthetic */ bt0 g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c8(bu buVar, RelayViewModel relayViewModel, f70 f70Var, Object obj, int i) {
        this.d = i;
        this.e = buVar;
        this.f = relayViewModel;
        this.g = f70Var;
        this.h = obj;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        ky0 ArrayDeckScreen$lambda$6;
        ky0 SectorsScreen$lambda$7;
        int i = this.d;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ArrayDeckScreen$lambda$6 = ArrayDeckScreenKt.ArrayDeckScreen$lambda$6(this.e, this.f, this.g, (bt0) obj4, (xe) obj, (ih) obj2, intValue);
                return ArrayDeckScreen$lambda$6;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                SectorsScreen$lambda$7 = SectorsScreenKt.SectorsScreen$lambda$7(this.e, this.f, this.g, (mu) obj4, (xe) obj, (ih) obj2, intValue2);
                return SectorsScreen$lambda$7;
        }
    }
}
