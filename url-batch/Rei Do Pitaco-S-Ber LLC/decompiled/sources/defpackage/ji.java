package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ji extends j0 {
    public final /* synthetic */ aa h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(aa aaVar) {
        super(1);
        this.h = aaVar;
    }

    @Override // defpackage.j0
    public final k0 A(int i) {
        return new k0(AccessibilityNodeInfo.obtain(this.h.n(i).a));
    }

    @Override // defpackage.j0
    public final k0 B(int i) {
        aa aaVar = this.h;
        int i2 = i == 2 ? aaVar.k : aaVar.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return A(i2);
    }

    @Override // defpackage.j0
    public final boolean F(int i, int i2, Bundle bundle) {
        int i3;
        aa aaVar = this.h;
        Chip chip = aaVar.i;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return aaVar.p(i);
        }
        if (i2 == 2) {
            return aaVar.j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = aaVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = aaVar.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                aaVar.k = Integer.MIN_VALUE;
                chip.invalidate();
                aaVar.q(i3, 65536);
            }
            aaVar.k = i;
            chip.invalidate();
            aaVar.q(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (aaVar.k != i) {
                return false;
            }
            aaVar.k = Integer.MIN_VALUE;
            chip.invalidate();
            aaVar.q(i, 65536);
            return true;
        }
        Chip chip2 = aaVar.n;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.x) {
                    chip2.w.q(1, 1);
                }
            }
        }
        return z;
    }
}
