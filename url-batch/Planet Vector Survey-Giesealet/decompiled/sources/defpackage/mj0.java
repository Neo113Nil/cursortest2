package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class mj0 implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ bu f;
    public final /* synthetic */ u50 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ mj0(String str, bu buVar, u50 u50Var, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = buVar;
        this.g = u50Var;
        this.h = z;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 RelaySecondaryButton$lambda$17;
        ky0 RelayPrimaryButton$lambda$15;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                RelaySecondaryButton$lambda$17 = RelayComponentsKt.RelaySecondaryButton$lambda$17(this.e, this.f, this.g, this.h, this.i, this.j, (ih) obj, intValue);
                return RelaySecondaryButton$lambda$17;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                RelayPrimaryButton$lambda$15 = RelayComponentsKt.RelayPrimaryButton$lambda$15(this.e, this.f, this.g, this.h, this.i, this.j, (ih) obj, intValue2);
                return RelayPrimaryButton$lambda$15;
        }
    }
}
