package com.pubmatic.sdk.common.utility;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public class POBAlertDialog {

    public interface POBDialogListener {
        void onCancel(DialogInterface dialogInterface, int i);

        void onSuccess(DialogInterface dialogInterface, int i);
    }

    class a implements DialogInterface.OnCancelListener {
        final /* synthetic */ POBDialogListener a;

        a(POBDialogListener pOBDialogListener) {
            this.a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.a.onCancel(dialogInterface, 0);
        }
    }

    class b implements DialogInterface.OnClickListener {
        final /* synthetic */ POBDialogListener a;

        b(POBDialogListener pOBDialogListener) {
            this.a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.onCancel(dialogInterface, i);
        }
    }

    class c implements DialogInterface.OnClickListener {
        final /* synthetic */ POBDialogListener a;

        c(POBDialogListener pOBDialogListener) {
            this.a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.onSuccess(dialogInterface, i);
        }
    }

    @Nullable
    public static AlertDialog.Builder build(Context context, String str, String str2, POBDialogListener pOBDialogListener) {
        boolean z;
        try {
            z = !((Activity) context).isFinishing();
        } catch (Exception unused) {
            z = true;
        }
        if (context == null || !z) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
        builder.setTitle(str).setMessage(str2).setCancelable(true).setPositiveButton("YES", new c(pOBDialogListener)).setNegativeButton("NO", new b(pOBDialogListener)).setOnCancelListener(new a(pOBDialogListener)).create();
        return builder;
    }
}
