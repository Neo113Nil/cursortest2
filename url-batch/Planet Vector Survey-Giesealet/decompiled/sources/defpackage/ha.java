package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import com.vectorharbor.planetvectorsurvey.model.SectorMission;
import com.vectorharbor.planetvectorsurvey.ui.screens.BriefingScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.RulesScreenKt;
import com.vectorharbor.planetvectorsurvey.ui.screens.SectorsScreenKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class ha implements ru {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ha(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        ky0 BriefingScreen$lambda$6$lambda$3;
        ky0 RulePanel_XO_JAsU$lambda$2;
        ky0 SectorsScreen$lambda$7$lambda$6$lambda$5;
        Typeface typeface;
        int i = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                BriefingScreen$lambda$6$lambda$3 = BriefingScreenKt.BriefingScreen$lambda$6$lambda$3((bt0) obj5, (bt0) obj4, (xe) obj, (ih) obj2, ((Integer) obj3).intValue());
                return BriefingScreen$lambda$6$lambda$3;
            case 1:
                RulePanel_XO_JAsU$lambda$2 = RulesScreenKt.RulePanel_XO_JAsU$lambda$2((String) obj5, (String) obj4, (xe) obj, (ih) obj2, ((Integer) obj3).intValue());
                return RulePanel_XO_JAsU$lambda$2;
            case 2:
                SectorsScreen$lambda$7$lambda$6$lambda$5 = SectorsScreenKt.SectorsScreen$lambda$7$lambda$6$lambda$5((SectorMission) obj5, (mu) obj4, (xe) obj, (ih) obj2, ((Integer) obj3).intValue());
                return SectorsScreen$lambda$7$lambda$6$lambda$5;
            default:
                Spannable spannable = (Spannable) obj5;
                eg0 eg0Var = (eg0) obj4;
                ns0 ns0Var = (ns0) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                qu0 qu0Var = ns0Var.f;
                ut utVar = ns0Var.c;
                if (utVar == null) {
                    utVar = ut.f;
                }
                st stVar = ns0Var.d;
                int i2 = stVar != null ? stVar.a : 0;
                tt ttVar = ns0Var.e;
                int i3 = ttVar != null ? ttVar.a : 65535;
                d5 d5Var = (d5) eg0Var.e;
                by0 b = ((dt) d5Var.h).b(qu0Var, utVar, i2, i3);
                if (b instanceof by0) {
                    Object obj6 = b.d;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    t7 t7Var = new t7(b, d5Var.m);
                    d5Var.m = t7Var;
                    Object obj7 = t7Var.g;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new ft(1, typeface), intValue, intValue2, 33);
                return ky0.a;
        }
    }
}
