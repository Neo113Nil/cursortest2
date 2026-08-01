package S0;

import a1.AbstractC0067d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.TargetCrashActivity;
import com.luckycounter.drinkwater.ui.TargetCrashView;
import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC0173a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TargetCrashActivity f1091b;

    public /* synthetic */ m(TargetCrashActivity targetCrashActivity, int i) {
        this.f1090a = i;
        this.f1091b = targetCrashActivity;
    }

    @Override // h1.InterfaceC0173a
    public final Object c() {
        TargetCrashActivity targetCrashActivity = this.f1091b;
        switch (this.f1090a) {
            case 0:
                int i = TargetCrashActivity.f2485z;
                View inflate = targetCrashActivity.getLayoutInflater().inflate(R.layout.activity_target_crash, (ViewGroup) null, false);
                int i2 = R.id.btnContinue;
                Button button = (Button) AbstractC0067d.h(inflate, R.id.btnContinue);
                if (button != null) {
                    i2 = R.id.targetCrashView;
                    TargetCrashView targetCrashView = (TargetCrashView) AbstractC0067d.h(inflate, R.id.targetCrashView);
                    if (targetCrashView != null) {
                        return new T0.f((FrameLayout) inflate, button, targetCrashView);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            default:
                int i3 = TargetCrashActivity.f2485z;
                targetCrashActivity.t().f1160b.setVisibility(0);
                return V0.i.f1250a;
        }
    }
}
