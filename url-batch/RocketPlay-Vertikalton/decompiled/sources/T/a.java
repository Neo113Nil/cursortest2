package T;

import K.T;
import L.j;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends A1.d {
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(8);
        this.d = bVar;
    }

    @Override // A1.d
    public final j q(int i) {
        return new j(AccessibilityNodeInfo.obtain(this.d.n(i).f795a));
    }

    @Override // A1.d
    public final j r(int i) {
        b bVar = this.d;
        int i2 = i == 2 ? bVar.f1109k : bVar.f1110l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return q(i2);
    }

    @Override // A1.d
    public final boolean v(int i, int i2, Bundle bundle) {
        int i3;
        b bVar = this.d;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = T.f633a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        boolean z2 = true;
        if (i2 == 1) {
            return bVar.p(i);
        }
        if (i2 == 2) {
            return bVar.j(i);
        }
        boolean z3 = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = bVar.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = bVar.f1109k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    bVar.f1109k = Integer.MIN_VALUE;
                    bVar.i.invalidate();
                    bVar.q(i3, 65536);
                }
                bVar.f1109k = i;
                chip.invalidate();
                bVar.q(i, 32768);
            }
            z2 = false;
        } else {
            if (i2 != 128) {
                B0.d dVar = (B0.d) bVar;
                if (i2 != 16) {
                    return false;
                }
                Chip chip2 = dVar.f100q;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (!chip2.f2234s) {
                    return z3;
                }
                chip2.f2233r.q(1, 1);
                return z3;
            }
            if (bVar.f1109k == i) {
                bVar.f1109k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i, 65536);
            }
            z2 = false;
        }
        return z2;
    }
}
