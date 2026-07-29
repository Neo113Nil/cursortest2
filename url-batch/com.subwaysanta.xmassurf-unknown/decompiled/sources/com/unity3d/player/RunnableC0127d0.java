package com.unity3d.player;

import android.os.SystemClock;
import android.view.KeyEvent;
import androidx.core.view.InputDeviceCompat;

/* renamed from: com.unity3d.player.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0127d0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC0127d0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        KeyEvent keyEvent = new KeyEvent(uptimeMillis, uptimeMillis, 0, 4, 1, 0, -1, 0, 0, InputDeviceCompat.SOURCE_KEYBOARD);
        KeyEvent keyEvent2 = new KeyEvent(uptimeMillis, 1 + uptimeMillis, 1, 4, 1, 0, -1, 0, 0, InputDeviceCompat.SOURCE_KEYBOARD);
        this.a.getActivity().dispatchKeyEvent(keyEvent);
        this.a.getActivity().dispatchKeyEvent(keyEvent2);
    }
}
