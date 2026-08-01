package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class j7 extends x {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j7(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.x
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).i);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.x
    public final void d(View view, k0 k0Var) {
        int i = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                k0Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.j);
                accessibilityNodeInfo2.setChecked(checkableImageButton.i);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, k0Var.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.x;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i3 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                k0Var.i(j0.D(((MaterialButton) view).z, 0, 1, i3, 1));
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, k0Var.a);
                as asVar = (as) obj;
                k0Var.b(new d0(asVar.j0.getVisibility() == 0 ? asVar.k(R.string.mtrl_picker_toggle_to_year_selection) : asVar.k(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo3.setCheckable(navigationMenuItemView.C);
                accessibilityNodeInfo3.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
        }
    }

    @Override // defpackage.x
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i != 1048576) {
                    break;
                } else {
                    ((g20) ((n7) this.e)).a(3);
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
