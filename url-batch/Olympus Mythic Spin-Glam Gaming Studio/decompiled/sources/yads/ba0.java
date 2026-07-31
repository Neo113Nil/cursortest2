package yads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes15.dex */
public final class ba0 {
    public final IntegrationInspectorActivity a;

    public ba0(IntegrationInspectorActivity integrationInspectorActivity) {
        this.a = integrationInspectorActivity;
    }

    public static final void a(DialogInterface dialogInterface, int i) {
    }

    public static final void b(DialogInterface dialogInterface, int i) {
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.y);
        p0.startActivity(p1);
    }

    public final void a(z90 z90Var) {
        if (z90Var instanceof w90) {
            Toast.makeText(this.a, ((w90) z90Var).a, 0).show();
            return;
        }
        if (z90Var instanceof y90) {
            a(((y90) z90Var).a);
            return;
        }
        if (z90Var instanceof x90) {
            Uri uri = ((x90) z90Var).a;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("text/plain");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
            return;
        }
        if (z90Var instanceof v90) {
            a(this.a.getString(R$string.debug_panel_logging_is_disabled), this.a.getString(R$string.debug_panel_do_you_want_to_enable_logging), new aa0(this));
        } else if (z90Var instanceof u90) {
            this.a.finishAfterTransition();
        }
    }

    public final void a(String str) {
        new AlertDialog.Builder(this.a).setMessage(str).setPositiveButton(this.a.getString(R$string.debug_panel_ok), new DialogInterface.OnClickListener() { // from class: yads.ba0$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ba0.b(dialogInterface, i);
            }
        }).show();
    }

    public final void a(String str, String str2, final aa0 aa0Var) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setPositiveButton(this.a.getString(R$string.debug_panel_yes), new DialogInterface.OnClickListener() { // from class: yads.ba0$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ba0.a(Function0.this, dialogInterface, i);
            }
        }).setNegativeButton(this.a.getString(R$string.debug_panel_no), new DialogInterface.OnClickListener() { // from class: yads.ba0$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ba0.a(dialogInterface, i);
            }
        }).show();
    }

    public static final void a(Function0 function0, DialogInterface dialogInterface, int i) {
        if (function0 != null) {
            function0.mo4828invoke();
        }
    }
}
