package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.screens.ArrayDeckScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.CalibrationScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.SectorsScreenKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class e8 implements ru {
    public final /* synthetic */ int d;
    public final /* synthetic */ bt0 e;

    public /* synthetic */ e8(bt0 bt0Var, int i) {
        this.d = i;
        this.e = bt0Var;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        ky0 ArrayDeckScreen$lambda$6$lambda$2;
        ky0 CalibrationScreen$lambda$23$lambda$5;
        ky0 CalibrationScreen$lambda$23$lambda$7;
        ky0 SectorsScreen$lambda$7$lambda$1;
        int i = this.d;
        xe xeVar = (xe) obj;
        ih ihVar = (ih) obj2;
        int intValue = ((Integer) obj3).intValue();
        bt0 bt0Var = this.e;
        switch (i) {
            case 0:
                ArrayDeckScreen$lambda$6$lambda$2 = ArrayDeckScreenKt.ArrayDeckScreen$lambda$6$lambda$2(bt0Var, xeVar, ihVar, intValue);
                return ArrayDeckScreen$lambda$6$lambda$2;
            case 1:
                CalibrationScreen$lambda$23$lambda$5 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$5(bt0Var, xeVar, ihVar, intValue);
                return CalibrationScreen$lambda$23$lambda$5;
            case 2:
                CalibrationScreen$lambda$23$lambda$7 = CalibrationScreenKt.CalibrationScreen$lambda$23$lambda$7(bt0Var, xeVar, ihVar, intValue);
                return CalibrationScreen$lambda$23$lambda$7;
            default:
                SectorsScreen$lambda$7$lambda$1 = SectorsScreenKt.SectorsScreen$lambda$7$lambda$1(bt0Var, xeVar, ihVar, intValue);
                return SectorsScreen$lambda$7$lambda$1;
        }
    }
}
