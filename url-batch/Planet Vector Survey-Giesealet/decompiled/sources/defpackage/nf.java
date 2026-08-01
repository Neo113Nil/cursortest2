package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.vectorharbor.planetvectorsurvey.MainActivity;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements bu {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ nf(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.d;
        MainActivity mainActivity = this.e;
        switch (i) {
            case 0:
                mainActivity.reportFullyDrawn();
                return ky0.a;
            case 1:
                return zf.b(mainActivity);
            case 2:
                pm pmVar = new pm();
                mainActivity.getNavigationEventDispatcher().b(pmVar);
                return pmVar;
            case 3:
                return new mn0(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            default:
                int i2 = 0;
                eb0 eb0Var = new eb0(new mf(mainActivity, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (nz.l(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity.getLifecycle().a(new of(i2, eb0Var, mainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new c4(1, mainActivity, eb0Var));
                    }
                }
                return eb0Var;
        }
    }
}
