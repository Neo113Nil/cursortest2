package com.sglib.easymobile.androidnative;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes14.dex */
public final class EMNativeUI {
    static final String NATIVEUI_ALERT_GAMEOBJECT = "MobileNativeAlert";
    static final String NATIVEUI_ALERT_METHOD = "OnNativeAlertCallback";
    private static DialogInterface.OnClickListener buttonClickListener = new DialogInterface.OnClickListener() { // from class: com.sglib.easymobile.androidnative.EMNativeUI.1
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -3) {
                UnityPlayer.UnitySendMessage(EMNativeUI.NATIVEUI_ALERT_GAMEOBJECT, EMNativeUI.NATIVEUI_ALERT_METHOD, "2");
            } else if (i == -2) {
                UnityPlayer.UnitySendMessage(EMNativeUI.NATIVEUI_ALERT_GAMEOBJECT, EMNativeUI.NATIVEUI_ALERT_METHOD, "1");
            } else {
                if (i != -1) {
                    return;
                }
                UnityPlayer.UnitySendMessage(EMNativeUI.NATIVEUI_ALERT_GAMEOBJECT, EMNativeUI.NATIVEUI_ALERT_METHOD, "0");
            }
        }
    };

    public static void ShowThreeButtonsAlert(final String str, final String str2, final String str3, final String str4, final String str5) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.EMNativeUI.2
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(UnityPlayer.currentActivity);
                builder.setTitle(str).setMessage(str2).setPositiveButton(str3, EMNativeUI.buttonClickListener).setNegativeButton(str4, EMNativeUI.buttonClickListener).setNeutralButton(str5, EMNativeUI.buttonClickListener).setCancelable(false);
                builder.show();
            }
        });
    }

    public static void ShowTwoButtonsAlert(final String str, final String str2, final String str3, final String str4) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.EMNativeUI.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(UnityPlayer.currentActivity);
                builder.setTitle(str).setMessage(str2).setPositiveButton(str3, EMNativeUI.buttonClickListener).setNegativeButton(str4, EMNativeUI.buttonClickListener).setCancelable(false);
                builder.show();
            }
        });
    }

    public static void ShowOneButtonAlert(final String str, final String str2, final String str3) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.EMNativeUI.4
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(UnityPlayer.currentActivity);
                builder.setTitle(str).setMessage(str2).setPositiveButton(str3, EMNativeUI.buttonClickListener).setCancelable(false);
                builder.show();
            }
        });
    }

    public static void ShowToast(final String str, final boolean z) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.sglib.easymobile.androidnative.EMNativeUI.5
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(UnityPlayer.currentActivity, str, z ? 1 : 0).show();
            }
        });
    }
}
