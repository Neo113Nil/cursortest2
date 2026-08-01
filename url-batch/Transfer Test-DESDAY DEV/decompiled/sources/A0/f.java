package A0;

import K.C0002b;
import L.k;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.football.transfertrivia.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class f extends C0002b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23e;

    public /* synthetic */ f(int i, Object obj) {
        this.d = i;
        this.f23e = obj;
    }

    @Override // K.C0002b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f23e).d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // K.C0002b
    public final void d(View view, k kVar) {
        int i;
        Object obj = this.f23e;
        View.AccessibilityDelegate accessibilityDelegate = this.f386a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f482a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int i2 = MaterialButtonToggleGroup.f1840k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f1837o));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                i3++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f1837o));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f482a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f1954e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f482a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f1964x);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = kVar.f482a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                com.google.android.material.datepicker.k kVar2 = (com.google.android.material.datepicker.k) obj;
                accessibilityNodeInfo4.setHintText(kVar2.f1905e0.getVisibility() == 0 ? kVar2.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar2.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }
}
