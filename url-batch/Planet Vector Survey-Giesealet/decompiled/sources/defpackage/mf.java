package defpackage;

import com.vectorharbor.planetvectorsurvey.MainActivity;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ mf(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        MainActivity mainActivity = this.e;
        switch (i) {
            case 0:
                zf.d(mainActivity);
                break;
            default:
                mainActivity.invalidateMenu();
                break;
        }
    }
}
