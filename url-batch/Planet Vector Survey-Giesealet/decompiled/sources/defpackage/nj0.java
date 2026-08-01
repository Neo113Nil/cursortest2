package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class nj0 implements ru {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ nj0(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        String str = this.e;
        hm0 hm0Var = (hm0) obj;
        ih ihVar = (ih) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return RelayComponentsKt.RelayPrimaryButton$lambda$14(str, hm0Var, ihVar, intValue);
            default:
                return RelayComponentsKt.RelaySecondaryButton$lambda$16(str, hm0Var, ihVar, intValue);
        }
    }
}
