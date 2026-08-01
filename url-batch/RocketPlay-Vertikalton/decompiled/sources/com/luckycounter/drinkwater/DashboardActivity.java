package com.luckycounter.drinkwater;

import S0.a;
import S0.e;
import S0.f;
import T0.b;
import V0.g;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.J;
import com.luckycounter.drinkwater.AddWaterActivity;
import com.luckycounter.drinkwater.DashboardActivity;
import com.luckycounter.drinkwater.PyramidActivity;
import com.luckycounter.drinkwater.SettingsActivity;
import com.luckycounter.drinkwater.WaterLogActivity;
import com.luckycounter.drinkwater.data.HydrationRepository;
import g.AbstractActivityC0129i;
import q1.AbstractC0352s;

/* loaded from: classes.dex */
public final class DashboardActivity extends AbstractActivityC0129i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2469A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2470y = new g(new a(this, 1));

    /* renamed from: z, reason: collision with root package name */
    public HydrationRepository f2471z;

    @Override // g.AbstractActivityC0129i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f1141a);
        this.f2471z = new HydrationRepository(this);
        final int i = 0;
        t().f1142b.setOnClickListener(new View.OnClickListener(this) { // from class: S0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1075b;

            {
                this.f1075b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardActivity dashboardActivity = this.f1075b;
                switch (i) {
                    case 0:
                        int i2 = DashboardActivity.f2469A;
                        dashboardActivity.u(150);
                        break;
                    case 1:
                        int i3 = DashboardActivity.f2469A;
                        dashboardActivity.u(250);
                        break;
                    case 2:
                        int i4 = DashboardActivity.f2469A;
                        dashboardActivity.u(500);
                        break;
                    case 3:
                        int i5 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddWaterActivity.class));
                        break;
                    case 4:
                        int i6 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) WaterLogActivity.class));
                        break;
                    case 5:
                        int i7 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) PyramidActivity.class));
                        break;
                    default:
                        int i8 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i2 = 1;
        t().f1143c.setOnClickListener(new View.OnClickListener(this) { // from class: S0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1075b;

            {
                this.f1075b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardActivity dashboardActivity = this.f1075b;
                switch (i2) {
                    case 0:
                        int i22 = DashboardActivity.f2469A;
                        dashboardActivity.u(150);
                        break;
                    case 1:
                        int i3 = DashboardActivity.f2469A;
                        dashboardActivity.u(250);
                        break;
                    case 2:
                        int i4 = DashboardActivity.f2469A;
                        dashboardActivity.u(500);
                        break;
                    case 3:
                        int i5 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddWaterActivity.class));
                        break;
                    case 4:
                        int i6 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) WaterLogActivity.class));
                        break;
                    case 5:
                        int i7 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) PyramidActivity.class));
                        break;
                    default:
                        int i8 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i3 = 2;
        t().d.setOnClickListener(new View.OnClickListener(this) { // from class: S0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1075b;

            {
                this.f1075b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardActivity dashboardActivity = this.f1075b;
                switch (i3) {
                    case 0:
                        int i22 = DashboardActivity.f2469A;
                        dashboardActivity.u(150);
                        break;
                    case 1:
                        int i32 = DashboardActivity.f2469A;
                        dashboardActivity.u(250);
                        break;
                    case 2:
                        int i4 = DashboardActivity.f2469A;
                        dashboardActivity.u(500);
                        break;
                    case 3:
                        int i5 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddWaterActivity.class));
                        break;
                    case 4:
                        int i6 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) WaterLogActivity.class));
                        break;
                    case 5:
                        int i7 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) PyramidActivity.class));
                        break;
                    default:
                        int i8 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i4 = 3;
        t().f1144e.setOnClickListener(new View.OnClickListener(this) { // from class: S0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1075b;

            {
                this.f1075b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardActivity dashboardActivity = this.f1075b;
                switch (i4) {
                    case 0:
                        int i22 = DashboardActivity.f2469A;
                        dashboardActivity.u(150);
                        break;
                    case 1:
                        int i32 = DashboardActivity.f2469A;
                        dashboardActivity.u(250);
                        break;
                    case 2:
                        int i42 = DashboardActivity.f2469A;
                        dashboardActivity.u(500);
                        break;
                    case 3:
                        int i5 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddWaterActivity.class));
                        break;
                    case 4:
                        int i6 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) WaterLogActivity.class));
                        break;
                    case 5:
                        int i7 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) PyramidActivity.class));
                        break;
                    default:
                        int i8 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i5 = 4;
        t().f1145f.setOnClickListener(new View.OnClickListener(this) { // from class: S0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1075b;

            {
                this.f1075b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardActivity dashboardActivity = this.f1075b;
                switch (i5) {
                    case 0:
                        int i22 = DashboardActivity.f2469A;
                        dashboardActivity.u(150);
                        break;
                    case 1:
                        int i32 = DashboardActivity.f2469A;
                        dashboardActivity.u(250);
                        break;
                    case 2:
                        int i42 = DashboardActivity.f2469A;
                        dashboardActivity.u(500);
                        break;
                    case 3:
                        int i52 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddWaterActivity.class));
                        break;
                    case 4:
                        int i6 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) WaterLogActivity.class));
                        break;
                    case 5:
                        int i7 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) PyramidActivity.class));
                        break;
                    default:
                        int i8 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i6 = 5;
        t().f1146g.setOnClickListener(new View.OnClickListener(this) { // from class: S0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1075b;

            {
                this.f1075b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardActivity dashboardActivity = this.f1075b;
                switch (i6) {
                    case 0:
                        int i22 = DashboardActivity.f2469A;
                        dashboardActivity.u(150);
                        break;
                    case 1:
                        int i32 = DashboardActivity.f2469A;
                        dashboardActivity.u(250);
                        break;
                    case 2:
                        int i42 = DashboardActivity.f2469A;
                        dashboardActivity.u(500);
                        break;
                    case 3:
                        int i52 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddWaterActivity.class));
                        break;
                    case 4:
                        int i62 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) WaterLogActivity.class));
                        break;
                    case 5:
                        int i7 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) PyramidActivity.class));
                        break;
                    default:
                        int i8 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i7 = 6;
        t().h.setOnClickListener(new View.OnClickListener(this) { // from class: S0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f1075b;

            {
                this.f1075b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashboardActivity dashboardActivity = this.f1075b;
                switch (i7) {
                    case 0:
                        int i22 = DashboardActivity.f2469A;
                        dashboardActivity.u(150);
                        break;
                    case 1:
                        int i32 = DashboardActivity.f2469A;
                        dashboardActivity.u(250);
                        break;
                    case 2:
                        int i42 = DashboardActivity.f2469A;
                        dashboardActivity.u(500);
                        break;
                    case 3:
                        int i52 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) AddWaterActivity.class));
                        break;
                    case 4:
                        int i62 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) WaterLogActivity.class));
                        break;
                    case 5:
                        int i72 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) PyramidActivity.class));
                        break;
                    default:
                        int i8 = DashboardActivity.f2469A;
                        dashboardActivity.startActivity(new Intent(dashboardActivity, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
    }

    @Override // g.AbstractActivityC0129i, android.app.Activity
    public final void onResume() {
        super.onResume();
        AbstractC0352s.g(J.e(this), null, new f(this, null), 3);
    }

    public final b t() {
        return (b) this.f2470y.a();
    }

    public final void u(int i) {
        AbstractC0352s.g(J.e(this), null, new e(this, i, null), 3);
    }

    public final String v(int i) {
        int i2 = R.string.tier_spark;
        if (i != 0) {
            if (i == 1) {
                i2 = R.string.tier_pulse;
            } else if (i == 2) {
                i2 = R.string.tier_blaze;
            } else if (i == 3) {
                i2 = R.string.tier_nova;
            } else if (i == 4) {
                i2 = R.string.tier_apex;
            }
        }
        String string = getString(i2);
        i1.f.d(string, "getString(...)");
        return string;
    }
}
