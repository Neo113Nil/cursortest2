package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.RulesScreenKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class tj0 implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    public /* synthetic */ tj0(String str, String str2, long j, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ky0 StatPill_XO_JAsU$lambda$20;
        ky0 RulePanel_XO_JAsU$lambda$3;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                StatPill_XO_JAsU$lambda$20 = RelayComponentsKt.StatPill_XO_JAsU$lambda$20(this.e, this.f, this.g, this.h, (ih) obj, intValue);
                return StatPill_XO_JAsU$lambda$20;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                RulePanel_XO_JAsU$lambda$3 = RulesScreenKt.RulePanel_XO_JAsU$lambda$3(this.e, this.f, this.g, this.h, (ih) obj, intValue2);
                return RulePanel_XO_JAsU$lambda$3;
        }
    }
}
