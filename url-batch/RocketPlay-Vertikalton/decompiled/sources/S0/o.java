package S0;

import androidx.lifecycle.J;
import com.luckycounter.drinkwater.WaterLogActivity;
import com.luckycounter.drinkwater.data.WaterEntry;
import q1.AbstractC0352s;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements h1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WaterLogActivity f1097a;

    public /* synthetic */ o(WaterLogActivity waterLogActivity) {
        this.f1097a = waterLogActivity;
    }

    @Override // h1.l
    public final Object g(Object obj) {
        WaterEntry waterEntry = (WaterEntry) obj;
        int i = WaterLogActivity.f2487B;
        i1.f.e(waterEntry, "entry");
        WaterLogActivity waterLogActivity = this.f1097a;
        AbstractC0352s.g(J.e(waterLogActivity), null, new q(waterLogActivity, waterEntry, null), 3);
        return V0.i.f1250a;
    }
}
