package S0;

import a1.EnumC0064a;
import b1.AbstractC0099h;
import com.luckycounter.drinkwater.WaterLogActivity;
import com.luckycounter.drinkwater.data.HydrationRepository;
import java.util.ArrayList;
import java.util.List;
import q1.InterfaceC0351q;

/* loaded from: classes.dex */
public final class p extends AbstractC0099h implements h1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WaterLogActivity f1099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(WaterLogActivity waterLogActivity, Z0.d dVar) {
        super(dVar);
        this.f1099c = waterLogActivity;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        return new p(this.f1099c, dVar);
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        return ((p) create((InterfaceC0351q) obj, (Z0.d) obj2)).invokeSuspend(V0.i.f1250a);
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        EnumC0064a enumC0064a = EnumC0064a.f1630a;
        int i = this.f1098b;
        WaterLogActivity waterLogActivity = this.f1099c;
        if (i == 0) {
            F1.l.n0(obj);
            HydrationRepository hydrationRepository = waterLogActivity.f2490z;
            if (hydrationRepository == null) {
                i1.f.h("repository");
                throw null;
            }
            this.f1098b = 1;
            obj = hydrationRepository.getTodayEntries(this);
            if (obj == enumC0064a) {
                return enumC0064a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F1.l.n0(obj);
        }
        List list = (List) obj;
        U0.g gVar = waterLogActivity.f2488A;
        if (gVar == null) {
            i1.f.h("adapter");
            throw null;
        }
        i1.f.e(list, "entries");
        ArrayList arrayList = gVar.f1242e;
        arrayList.clear();
        arrayList.addAll(list);
        gVar.f2764a.b();
        waterLogActivity.t().f1164c.setVisibility(list.isEmpty() ? 0 : 8);
        waterLogActivity.t().f1163b.setVisibility(list.isEmpty() ? 8 : 0);
        return V0.i.f1250a;
    }
}
