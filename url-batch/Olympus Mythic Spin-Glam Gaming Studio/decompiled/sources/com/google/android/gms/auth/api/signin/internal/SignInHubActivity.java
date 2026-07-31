package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
@KeepName
/* loaded from: classes12.dex */
public class SignInHubActivity extends FragmentActivity {
    private static boolean zba;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.auth");
        p0.startActivityForResult(p1, p2);
    }

    private final void zbc() {
        getSupportLoaderManager().initLoader(0, null, new zbw(this, null));
        zba = false;
    }

    private final void zbd(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.google.android.gms.auth", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount zba2 = signInAccount.zba();
                zbn zbc = zbn.zbc(this);
                GoogleSignInOptions zba3 = this.zbc.zba();
                zba2.getClass();
                zbc.zbe(zba3, zba2);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", zba2);
                this.zbd = true;
                this.zbe = i2;
                this.zbf = intent;
                zbc();
                return;
            }
            if (intent.hasExtra(IronSourceConstants.EVENTS_ERROR_CODE)) {
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zbd(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbd(12502);
                return;
            } else {
                zba = true;
                zbe(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.zbd = z;
        if (z) {
            this.zbe = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.zbf = intent2;
            zbc();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
