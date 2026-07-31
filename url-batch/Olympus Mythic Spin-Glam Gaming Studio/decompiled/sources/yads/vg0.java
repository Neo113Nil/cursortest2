package yads;

import android.app.Activity;
import android.app.Dialog;

/* loaded from: classes5.dex */
public abstract class vg0 {
    public static final void a(Dialog dialog) {
        Activity ownerActivity = dialog.getOwnerActivity();
        boolean z = ownerActivity == null || !(ownerActivity.isFinishing() || ownerActivity.isDestroyed());
        if (dialog.isShowing() && z) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
                boolean z2 = ob1.a;
            }
        }
    }
}
