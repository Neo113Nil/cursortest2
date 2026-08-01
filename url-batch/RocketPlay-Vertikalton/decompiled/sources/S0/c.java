package S0;

import a1.EnumC0064a;
import android.content.Intent;
import b1.AbstractC0099h;
import com.luckycounter.drinkwater.AddWaterActivity;
import com.luckycounter.drinkwater.TargetCrashActivity;
import com.luckycounter.drinkwater.data.HydrationRepository;
import com.luckycounter.drinkwater.data.LogResult;
import q1.InterfaceC0351q;

/* loaded from: classes.dex */
public final class c extends AbstractC0099h implements h1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddWaterActivity f1073c;
    public final /* synthetic */ Integer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddWaterActivity addWaterActivity, Integer num, Z0.d dVar) {
        super(dVar);
        this.f1073c = addWaterActivity;
        this.d = num;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        return new c(this.f1073c, this.d, dVar);
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        return ((c) create((InterfaceC0351q) obj, (Z0.d) obj2)).invokeSuspend(V0.i.f1250a);
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        EnumC0064a enumC0064a = EnumC0064a.f1630a;
        int i = this.f1072b;
        AddWaterActivity addWaterActivity = this.f1073c;
        if (i == 0) {
            F1.l.n0(obj);
            HydrationRepository hydrationRepository = addWaterActivity.f2468z;
            if (hydrationRepository == null) {
                i1.f.h("repository");
                throw null;
            }
            int intValue = this.d.intValue();
            this.f1072b = 1;
            obj = hydrationRepository.logWater(intValue, this);
            if (obj == enumC0064a) {
                return enumC0064a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F1.l.n0(obj);
        }
        if (((LogResult) obj).getShouldCelebrate()) {
            addWaterActivity.startActivity(new Intent(addWaterActivity, (Class<?>) TargetCrashActivity.class));
        }
        addWaterActivity.finish();
        return V0.i.f1250a;
    }
}
