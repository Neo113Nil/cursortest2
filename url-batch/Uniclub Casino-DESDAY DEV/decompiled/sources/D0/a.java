package D0;

import K.C0001b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class a extends C0001b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f80e;

    public /* synthetic */ a(int i, Object obj) {
        this.d = i;
        this.f80e = obj;
    }

    @Override // K.C0001b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f80e).d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // K.C0001b
    public final void d(View view, L.j jVar) {
        Object obj = this.f80e;
        View.AccessibilityDelegate accessibilityDelegate = this.f372a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = jVar.f482a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1729e);
                accessibilityNodeInfo.setChecked(checkableImageButton.d);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.f482a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f1739x);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = jVar.f482a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) obj;
                accessibilityNodeInfo3.setHintText(kVar.f1679e0.getVisibility() == 0 ? kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, jVar.f482a);
                int i = MaterialButtonToggleGroup.f1614k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                int i2 = -1;
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i3) == view) {
                                i2 = i4;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                                    i4++;
                                }
                                i3++;
                            }
                        }
                    }
                }
                jVar.h(L.i.a(((MaterialButton) view).f1611o, 0, 1, i2, 1));
                break;
        }
    }
}
