package com.google.ads.consent;

/* loaded from: classes.dex */
public abstract class ConsentFormListener {
    public void onConsentFormClosed(ConsentStatus consentStatus, Boolean userPrefersAdFree) {
    }

    public void onConsentFormError(String reason) {
    }

    public void onConsentFormLoaded() {
    }

    public void onConsentFormOpened() {
    }
}
