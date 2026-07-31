package com.sglib.easymobile.androidnative.gdpr;

import com.sglib.easymobile.androidnative.Helper;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes4.dex */
public class ConsentDialogUnityFacade {
    private ConsentDialog dialog;

    public void Show(final String str, final String str2, final boolean z) {
        if (Helper.IsNullOrEmptyString(str2)) {
            Helper.Log("There is no content to display in consent dialog!!!");
        } else {
            UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialogUnityFacade.1
                @Override // java.lang.Runnable
                public void run() {
                    ConsentDialogUnityFacade.this.dialog = ConsentDialog.newInstance(str, str2, z);
                    ConsentDialogUnityFacade.this.dialog.show(UnityPlayer.currentActivity.getFragmentManager());
                }
            });
        }
    }

    public void SetButtonInteractable(final String str, final boolean z) {
        if (this.dialog == null) {
            return;
        }
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialogUnityFacade.2
            @Override // java.lang.Runnable
            public void run() {
                ConsentDialogUnityFacade.this.dialog.setButtonInteractable(str, Boolean.valueOf(z));
            }
        });
    }

    public void SetToggleInteractable(final String str, final boolean z) {
        if (this.dialog == null) {
            return;
        }
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialogUnityFacade.3
            @Override // java.lang.Runnable
            public void run() {
                ConsentDialogUnityFacade.this.dialog.setToggleInteractable(str, z);
            }
        });
    }

    public void SetToggleIsOn(final String str, final boolean z, final boolean z2) {
        if (this.dialog == null) {
            return;
        }
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.gdpr.ConsentDialogUnityFacade.4
            @Override // java.lang.Runnable
            public void run() {
                ConsentDialogUnityFacade.this.dialog.setToggleIsOn(str, z, z2);
            }
        });
    }
}
