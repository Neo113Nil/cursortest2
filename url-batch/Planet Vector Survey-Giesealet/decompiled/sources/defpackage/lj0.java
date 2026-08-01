package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class lj0 implements ru {
    public final /* synthetic */ int d;
    public final /* synthetic */ ru e;

    public /* synthetic */ lj0(ru ruVar, int i) {
        this.d = i;
        this.e = ruVar;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        ky0 RelayScrollLayout$lambda$5;
        ky0 RelayPanel_3IgeMak$lambda$12;
        int i = this.d;
        ru ruVar = this.e;
        switch (i) {
            case 0:
                RelayScrollLayout$lambda$5 = RelayComponentsKt.RelayScrollLayout$lambda$5(ruVar, (ga) obj, (ih) obj2, ((Integer) obj3).intValue());
                return RelayScrollLayout$lambda$5;
            default:
                RelayPanel_3IgeMak$lambda$12 = RelayComponentsKt.RelayPanel_3IgeMak$lambda$12(ruVar, (xe) obj, (ih) obj2, ((Integer) obj3).intValue());
                return RelayPanel_3IgeMak$lambda$12;
        }
    }
}
