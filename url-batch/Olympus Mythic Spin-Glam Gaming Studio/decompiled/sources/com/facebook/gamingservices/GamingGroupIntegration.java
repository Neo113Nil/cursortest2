package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import com.facebook.FacebookCallback;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.List;

@AutoHandleExceptions
/* loaded from: classes10.dex */
public class GamingGroupIntegration extends FacebookDialogBase<Void, Result> {
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingGroupIntegration.toRequestCode();
    private static final String ERROR_KEY = "error";

    public static class Result {
    }

    public static void safedk_FacebookDialogBase_startActivityForResult_8bc1142a9b49c8d7dd9e77376bcd65e1(FacebookDialogBase p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/internal/FacebookDialogBase;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected AppCall createBaseAppCall() {
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected List<FacebookDialogBase<Void, Result>.ModeHandler> getOrderedModeHandlers() {
        return null;
    }

    public GamingGroupIntegration(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public GamingGroupIntegration(Fragment fragment) {
        super(new FragmentWrapper(fragment), DEFAULT_REQUEST_CODE);
    }

    public GamingGroupIntegration(androidx.fragment.app.Fragment fragment) {
        super(new FragmentWrapper(fragment), DEFAULT_REQUEST_CODE);
    }

    public void show() {
        showImpl();
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public void show(Void r1) {
        showImpl();
    }

    protected void showImpl() {
        safedk_FacebookDialogBase_startActivityForResult_8bc1142a9b49c8d7dd9e77376bcd65e1(this, new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/community/" + FacebookSdk.getApplicationId())), getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.registerCallback(getRequestCodeField(), new CallbackManagerImpl.Callback() { // from class: com.facebook.gamingservices.GamingGroupIntegration.1
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public boolean onActivityResult(int i, Intent intent) {
                if (intent != null && intent.hasExtra("error")) {
                    facebookCallback.onError(((FacebookRequestError) intent.getParcelableExtra("error")).getException());
                    return true;
                }
                facebookCallback.onSuccess(new Result());
                return true;
            }
        });
    }
}
