package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.R;

/* loaded from: classes2.dex */
public class SideSheetDialog extends SheetDialog {
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = R.attr.sideSheetDialogTheme;
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = R.style.Theme_Material3_Light_SideSheetDialog;

    @Override // com.google.android.material.sidesheet.SheetDialog
    protected int getStateOnStart() {
        return 3;
    }

    public SideSheetDialog(Context context) {
        this(context, 0);
    }

    public SideSheetDialog(Context context, int i) {
        super(context, i, SIDE_SHEET_DIALOG_THEME_ATTR, SIDE_SHEET_DIALOG_DEFAULT_THEME_RES);
        supportRequestWindowFeature(1);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    protected int getLayoutResId() {
        return R.layout.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    protected int getDialogId() {
        return R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    protected Sheet getBehaviorFromSheet(FrameLayout frameLayout) {
        return SideSheetBehavior.from(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public SideSheetBehavior<? extends View> getBehavior() {
        Sheet behavior = super.getBehavior();
        if (!(behavior instanceof SideSheetBehavior)) {
            throw new IllegalStateException("The view is not associated with SideSheetBehavior");
        }
        return (SideSheetBehavior) behavior;
    }
}
