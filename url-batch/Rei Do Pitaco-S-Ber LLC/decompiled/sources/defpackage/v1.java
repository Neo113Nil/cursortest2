package defpackage;

import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements dl {
    public final /* synthetic */ int f;

    @Override // defpackage.dl
    public final Object a() {
        switch (this.f) {
            case 0:
                n nVar = nx.f;
                return Integer.valueOf(nx.f.a().nextInt(2147418112) + 65536);
            default:
                int i = ImmLeaksCleaner.a;
                try {
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    return new ao();
                } catch (NoSuchFieldException unused) {
                    return ao.k;
                }
        }
    }
}
