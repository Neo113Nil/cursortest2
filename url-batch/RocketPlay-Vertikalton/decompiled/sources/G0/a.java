package G0;

import K.C0007b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.luckycounter.drinkwater.R;

/* loaded from: classes.dex */
public final class a extends C0007b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f434e;

    public /* synthetic */ a(int i, Object obj) {
        this.d = i;
        this.f434e = obj;
    }

    @Override // K.C0007b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f434e).d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // K.C0007b
    public final void d(View view, L.j jVar) {
        int i;
        Object obj = this.f434e;
        View.AccessibilityDelegate accessibilityDelegate = this.f648a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = jVar.f795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2321e);
                accessibilityNodeInfo.setChecked(checkableImageButton.d);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.f795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2331x);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = jVar.f795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) obj;
                accessibilityNodeInfo3.setHintText(kVar.f2273e0.getVisibility() == 0 ? kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar.C().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = jVar.f795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                int i2 = MaterialButtonToggleGroup.f2208k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                            accessibilityNodeInfo4.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f2205o));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                i3++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo4.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f2205o));
                break;
        }
    }
}
