package w0;

import L.j;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.linetic.luckycross.R;
import java.util.ArrayList;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333c extends S.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f4115q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0333c(Chip chip, Chip chip2) {
        super(chip2);
        this.f4115q = chip;
    }

    @Override // S.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f1619w;
        Chip chip = this.f4115q;
        if (chip.c()) {
            C0335e c0335e = chip.f1622e;
            if (c0335e != null && c0335e.f4131K) {
                z2 = true;
            }
            if (!z2 || chip.h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // S.b
    public final void o(int i, j jVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f608a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1619w);
            return;
        }
        Chip chip = this.f4115q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        jVar.b(L.e.f598e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
