package defpackage;

import android.util.LongSparseArray;
import com.vectorharbor.planetvectorsurvey.MainActivity;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c4(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                px0.v((e4) obj2, (LongSparseArray) obj);
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.getLifecycle().a(new of(0, (eb0) obj, mainActivity));
                break;
        }
    }
}
