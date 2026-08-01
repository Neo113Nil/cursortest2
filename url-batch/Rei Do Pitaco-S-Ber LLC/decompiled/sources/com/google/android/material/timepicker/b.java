package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import defpackage.a50;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class b extends a50 {
    public final /* synthetic */ ChipTextInputComboView f;

    public b(ChipTextInputComboView chipTextInputComboView) {
        this.f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f;
        if (isEmpty) {
            chipTextInputComboView.i = ChipTextInputComboView.a(chipTextInputComboView, "00");
            return;
        }
        String a = ChipTextInputComboView.a(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(a)) {
            a = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chipTextInputComboView.i = a;
    }
}
