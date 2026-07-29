package o;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: o.u20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1999u20 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int h;
    public final /* synthetic */ Intent i;
    public final /* synthetic */ Object j;

    public /* synthetic */ DialogInterfaceOnClickListenerC1999u20(Intent intent, Object obj, int i) {
        this.h = i;
        this.i = intent;
        this.j = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o.Lz] */
    public final void a() {
        switch (this.h) {
            case 0:
                Intent intent = this.i;
                if (intent != null) {
                    ((GoogleApiActivity) this.j).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.i;
                if (intent2 != null) {
                    this.j.a(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
