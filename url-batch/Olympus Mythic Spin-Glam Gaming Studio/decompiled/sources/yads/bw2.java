package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class bw2 extends ObservableProperty {
    public final /* synthetic */ cw2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw2(hn1 hn1Var, cw2 cw2Var) {
        super(hn1Var);
        this.a = cw2Var;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        hn1 hn1Var = (hn1) obj2;
        hn1 hn1Var2 = (hn1) obj;
        if (Intrinsics.areEqual(hn1Var, hn1Var2)) {
            return;
        }
        qm2 qm2Var = this.a.g;
        KProperty[] kPropertyArr = cw2.k;
        KProperty kProperty = kPropertyArr[0];
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) qm2Var.a.get();
        if (customizableMediaView == null) {
            return;
        }
        qm2 qm2Var2 = this.a.h;
        KProperty kProperty2 = kPropertyArr[1];
        dn1 dn1Var = (dn1) qm2Var2.a.get();
        if (dn1Var == null) {
            return;
        }
        hn1Var2.a(customizableMediaView);
        customizableMediaView.post(new aw2(hn1Var, customizableMediaView, dn1Var));
    }
}
