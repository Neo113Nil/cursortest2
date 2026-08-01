package B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40c;

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.f38a = i2;
        this.f40c = obj;
        this.f39b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38a) {
            case 0:
                ((b) this.f40c).g(this.f39b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f40c;
                View view = (View) sideSheetBehavior.f1755p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f39b, false);
                    break;
                }
                break;
        }
    }
}
