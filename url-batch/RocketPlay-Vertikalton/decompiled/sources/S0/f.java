package S0;

import a1.EnumC0064a;
import b1.AbstractC0099h;
import com.luckycounter.drinkwater.DashboardActivity;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.data.HydrationRepository;
import q1.InterfaceC0351q;

/* loaded from: classes.dex */
public final class f extends AbstractC0099h implements h1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f1079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DashboardActivity dashboardActivity, Z0.d dVar) {
        super(dVar);
        this.f1079c = dashboardActivity;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        return new f(this.f1079c, dVar);
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        return ((f) create((InterfaceC0351q) obj, (Z0.d) obj2)).invokeSuspend(V0.i.f1250a);
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        EnumC0064a enumC0064a = EnumC0064a.f1630a;
        int i = this.f1078b;
        DashboardActivity dashboardActivity = this.f1079c;
        if (i == 0) {
            F1.l.n0(obj);
            HydrationRepository hydrationRepository = dashboardActivity.f2471z;
            if (hydrationRepository == null) {
                i1.f.h("repository");
                throw null;
            }
            this.f1078b = 1;
            obj = hydrationRepository.getTodayTotal(this);
            if (obj == enumC0064a) {
                return enumC0064a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F1.l.n0(obj);
        }
        int intValue = ((Number) obj).intValue();
        HydrationRepository hydrationRepository2 = dashboardActivity.f2471z;
        if (hydrationRepository2 == null) {
            i1.f.h("repository");
            throw null;
        }
        int dailyGoal = hydrationRepository2.getDailyGoal();
        HydrationRepository hydrationRepository3 = dashboardActivity.f2471z;
        if (hydrationRepository3 == null) {
            i1.f.h("repository");
            throw null;
        }
        int tierIndex = hydrationRepository3.getTierIndex();
        HydrationRepository hydrationRepository4 = dashboardActivity.f2471z;
        if (hydrationRepository4 == null) {
            i1.f.h("repository");
            throw null;
        }
        int streakDays = hydrationRepository4.getStreakDays();
        dashboardActivity.t().f1151n.setText(dashboardActivity.getString(R.string.today_label, new Integer(intValue)));
        dashboardActivity.t().f1148k.setText(dashboardActivity.getString(R.string.goal_label, new Integer(dailyGoal)));
        dashboardActivity.t().f1149l.setText(dashboardActivity.getString(R.string.streak_label, new Integer(streakDays)));
        dashboardActivity.t().f1150m.setText(dashboardActivity.getString(R.string.tier_label, dashboardActivity.v(tierIndex)));
        dashboardActivity.t().i.a(intValue, dailyGoal, tierIndex);
        return V0.i.f1250a;
    }
}
