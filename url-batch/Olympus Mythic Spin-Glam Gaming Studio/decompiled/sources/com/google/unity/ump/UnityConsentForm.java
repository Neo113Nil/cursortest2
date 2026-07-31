package com.google.unity.ump;

import android.app.Activity;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.google.unity.ump.UnityConsentForm;
import java.util.Objects;

/* loaded from: classes3.dex */
public class UnityConsentForm {
    private final Activity activity;
    private final UnityConsentFormCallback callback;
    private final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = new AnonymousClass1(this);

    /* renamed from: com.google.unity.ump.UnityConsentForm$1, reason: invalid class name */
    class AnonymousClass1 implements ConsentForm.OnConsentFormDismissedListener {
        final /* synthetic */ UnityConsentForm this$0;

        AnonymousClass1(UnityConsentForm unityConsentForm) {
            Objects.requireNonNull(unityConsentForm);
            this.this$0 = unityConsentForm;
        }

        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
        public void onConsentFormDismissed(final FormError formError) {
            new Thread(new Runnable() { // from class: com.google.unity.ump.UnityConsentForm$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityConsentForm.AnonymousClass1.this.lambda$onConsentFormDismissed$0(formError);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConsentFormDismissed$0(FormError formError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onConsentFormDismissed(formError);
            }
        }
    }

    public UnityConsentForm(Activity activity, UnityConsentFormCallback unityConsentFormCallback) {
        this.activity = activity;
        this.callback = unityConsentFormCallback;
    }

    public void loadAndShowConsentFormIfRequired() {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(this.activity, this.onConsentFormDismissedListener);
    }

    public void show(ConsentForm consentForm) {
        consentForm.show(this.activity, this.onConsentFormDismissedListener);
    }

    public void showPrivacyOptionsForm() {
        UserMessagingPlatform.showPrivacyOptionsForm(this.activity, this.onConsentFormDismissedListener);
    }
}
