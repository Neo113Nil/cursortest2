package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class f8 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Runnable d;
    public final /* synthetic */ hd e;

    public f8(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new p1(13, this);
    }

    public final void a(int i) {
        int i2 = this.a;
        Runnable runnable = this.d;
        hd hdVar = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hdVar;
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((u6) runnable);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hdVar;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((p1) runnable);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    public f8(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new u6(1, this);
    }
}
