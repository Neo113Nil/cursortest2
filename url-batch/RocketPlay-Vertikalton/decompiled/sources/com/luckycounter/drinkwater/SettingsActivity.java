package com.luckycounter.drinkwater;

import P0.ViewOnClickListenerC0033a;
import S0.a;
import S0.l;
import T0.e;
import V0.g;
import android.os.Bundle;
import c1.AbstractC0104b;
import com.luckycounter.drinkwater.data.HydrationRepository;
import g.AbstractActivityC0129i;
import i1.f;

/* loaded from: classes.dex */
public final class SettingsActivity extends AbstractActivityC0129i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2482A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2483y = new g(new a(this, 3));

    /* renamed from: z, reason: collision with root package name */
    public HydrationRepository f2484z;

    @Override // g.AbstractActivityC0129i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1155a);
        HydrationRepository hydrationRepository = new HydrationRepository(this);
        this.f2484z = hydrationRepository;
        int maxGoalForCurrentTier = hydrationRepository.getMaxGoalForCurrentTier();
        HydrationRepository hydrationRepository2 = this.f2484z;
        if (hydrationRepository2 == null) {
            f.h("repository");
            throw null;
        }
        int dailyGoal = hydrationRepository2.getDailyGoal();
        t().f1157c.setMax(maxGoalForCurrentTier);
        t().f1157c.setProgress(AbstractC0104b.h(dailyGoal, 500, maxGoalForCurrentTier));
        t().d.setText(getString(R.string.goal_label, Integer.valueOf(t().f1157c.getProgress())));
        t().f1158e.setText(getString(R.string.max_goal, Integer.valueOf(maxGoalForCurrentTier)));
        t().f1157c.setOnSeekBarChangeListener(new l(this));
        t().f1156b.setOnClickListener(new ViewOnClickListenerC0033a(3, this));
    }

    public final e t() {
        return (e) this.f2483y.a();
    }
}
