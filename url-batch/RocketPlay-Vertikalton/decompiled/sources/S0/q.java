package S0;

import a1.EnumC0064a;
import androidx.lifecycle.J;
import b1.AbstractC0099h;
import com.luckycounter.drinkwater.WaterLogActivity;
import com.luckycounter.drinkwater.data.HydrationRepository;
import com.luckycounter.drinkwater.data.WaterEntry;
import q1.AbstractC0352s;
import q1.InterfaceC0351q;

/* loaded from: classes.dex */
public final class q extends AbstractC0099h implements h1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WaterLogActivity f1101c;
    public final /* synthetic */ WaterEntry d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(WaterLogActivity waterLogActivity, WaterEntry waterEntry, Z0.d dVar) {
        super(dVar);
        this.f1101c = waterLogActivity;
        this.d = waterEntry;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        return new q(this.f1101c, this.d, dVar);
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        return ((q) create((InterfaceC0351q) obj, (Z0.d) obj2)).invokeSuspend(V0.i.f1250a);
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        EnumC0064a enumC0064a = EnumC0064a.f1630a;
        int i = this.f1100b;
        WaterLogActivity waterLogActivity = this.f1101c;
        if (i == 0) {
            F1.l.n0(obj);
            HydrationRepository hydrationRepository = waterLogActivity.f2490z;
            if (hydrationRepository == null) {
                i1.f.h("repository");
                throw null;
            }
            this.f1100b = 1;
            if (hydrationRepository.deleteEntry(this.d, this) == enumC0064a) {
                return enumC0064a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F1.l.n0(obj);
        }
        int i2 = WaterLogActivity.f2487B;
        waterLogActivity.getClass();
        AbstractC0352s.g(J.e(waterLogActivity), null, new p(waterLogActivity, null), 3);
        return V0.i.f1250a;
    }
}
