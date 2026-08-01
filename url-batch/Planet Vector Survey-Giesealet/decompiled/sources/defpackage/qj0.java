package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class qj0 implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ ru e;
    public final /* synthetic */ int f;

    public /* synthetic */ qj0(ru ruVar, int i, int i2) {
        this.d = i2;
        this.e = ruVar;
        this.f = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 RelayScene$lambda$3;
        ky0 RelayScrollLayout$lambda$6;
        int i = this.d;
        int i2 = this.f;
        ru ruVar = this.e;
        ih ihVar = (ih) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                RelayScene$lambda$3 = RelayComponentsKt.RelayScene$lambda$3(ruVar, i2, ihVar, intValue);
                return RelayScene$lambda$3;
            default:
                RelayScrollLayout$lambda$6 = RelayComponentsKt.RelayScrollLayout$lambda$6(ruVar, i2, ihVar, intValue);
                return RelayScrollLayout$lambda$6;
        }
    }
}
