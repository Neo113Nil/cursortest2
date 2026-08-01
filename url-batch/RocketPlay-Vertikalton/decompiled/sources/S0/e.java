package S0;

import a1.EnumC0064a;
import android.content.Intent;
import android.view.Choreographer;
import android.widget.TextView;
import b1.AbstractC0099h;
import com.luckycounter.drinkwater.DashboardActivity;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.TargetCrashActivity;
import com.luckycounter.drinkwater.data.HydrationRepository;
import com.luckycounter.drinkwater.data.LogResult;
import com.luckycounter.drinkwater.ui.PercentRingView;
import q1.InterfaceC0351q;

/* loaded from: classes.dex */
public final class e extends AbstractC0099h implements h1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f1076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f1077c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DashboardActivity dashboardActivity, int i, Z0.d dVar) {
        super(dVar);
        this.f1077c = dashboardActivity;
        this.d = i;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        return new e(this.f1077c, this.d, dVar);
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        return ((e) create((InterfaceC0351q) obj, (Z0.d) obj2)).invokeSuspend(V0.i.f1250a);
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        EnumC0064a enumC0064a = EnumC0064a.f1630a;
        int i = this.f1076b;
        DashboardActivity dashboardActivity = this.f1077c;
        if (i == 0) {
            F1.l.n0(obj);
            HydrationRepository hydrationRepository = dashboardActivity.f2471z;
            if (hydrationRepository == null) {
                i1.f.h("repository");
                throw null;
            }
            this.f1076b = 1;
            obj = hydrationRepository.logWater(this.d, this);
            if (obj == enumC0064a) {
                return enumC0064a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F1.l.n0(obj);
        }
        LogResult logResult = (LogResult) obj;
        int i2 = DashboardActivity.f2469A;
        dashboardActivity.t().f1151n.setText(dashboardActivity.getString(R.string.today_label, Integer.valueOf(logResult.getTodayMl())));
        dashboardActivity.t().f1148k.setText(dashboardActivity.getString(R.string.goal_label, Integer.valueOf(logResult.getGoalMl())));
        TextView textView = dashboardActivity.t().f1149l;
        HydrationRepository hydrationRepository2 = dashboardActivity.f2471z;
        if (hydrationRepository2 == null) {
            i1.f.h("repository");
            throw null;
        }
        textView.setText(dashboardActivity.getString(R.string.streak_label, Integer.valueOf(hydrationRepository2.getStreakDays())));
        dashboardActivity.t().f1150m.setText(dashboardActivity.getString(R.string.tier_label, dashboardActivity.v(logResult.getTierIndex())));
        dashboardActivity.t().i.a(logResult.getTodayMl(), logResult.getGoalMl(), logResult.getTierIndex());
        PercentRingView percentRingView = dashboardActivity.t().f1147j;
        int percent = logResult.getPercent();
        if (percentRingView.getWidth() > 0) {
            int width = percentRingView.getWidth();
            int height = percentRingView.getHeight();
            if (width > height) {
                width = height;
            }
            percentRingView.f2500a.add(new U0.b(width * 0.5f));
            percentRingView.d = percent + "%";
            percentRingView.f2503e = System.currentTimeMillis() + 1200;
            if (!percentRingView.f2504f) {
                percentRingView.f2504f = true;
                Choreographer.getInstance().postFrameCallback(percentRingView.f2505g);
            }
            percentRingView.invalidate();
        }
        if (logResult.getShouldCelebrate()) {
            dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) TargetCrashActivity.class));
        }
        return V0.i.f1250a;
    }
}
