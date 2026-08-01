package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f82a = i2;
        this.f84c = obj;
        this.f83b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f82a) {
            case 0:
                ((b) this.f84c).g(this.f83b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f84c;
                View view = (View) sideSheetBehavior.f2347p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f83b, false);
                    break;
                }
                break;
        }
    }
}
