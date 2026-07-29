package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import com.unity3d.player.a.AbstractC0120t;

/* loaded from: classes.dex */
public class UnityPlayerForRenderService extends UnityPlayerForActivityOrService {
    private final com.unity3d.player.a.F a;

    @Override // com.unity3d.player.UnityPlayerForActivityOrService
    protected void resetSoftInput() {
    }

    public UnityPlayerForRenderService(Context context) {
        this(context, null, "");
    }

    public UnityPlayerForRenderService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        this(context, iUnityPlayerLifecycleEvents, "");
    }

    public UnityPlayerForRenderService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str) {
        super(context, iUnityPlayerLifecycleEvents, str, new com.unity3d.player.a.D());
        AbstractC0120t.Log(4, "Creating UnityPlayerForRenderService with cmdline: " + str);
        this.a = new com.unity3d.player.a.F();
    }

    public ISoftInputListener getSoftInputListener() {
        return this.a.b;
    }

    public void setSoftInputListener(ISoftInputListener iSoftInputListener) {
        this.a.b = iSoftInputListener;
    }

    public void mute(boolean z) {
        if (this.m_PhoneCallListener.a == 1) {
            return;
        }
        nativeMuteMasterAudio(z);
    }

    @Override // com.unity3d.player.UnityPlayer
    protected void saveFocusState(boolean z) {
        this.mState.a = true;
    }

    @Override // com.unity3d.player.UnityPlayerForActivityOrService, com.unity3d.player.UnityPlayer
    final boolean handleFocus(boolean z) {
        return super.handleFocus(true);
    }

    @Override // com.unity3d.player.UnityPlayerForActivityOrService
    protected void showSoftInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        this.a.a(str, i, z, z2, z3, z4, str2, i2, z5, z6);
    }

    @Override // com.unity3d.player.UnityPlayer
    protected boolean showVideoPlayer(String str, int i, int i2, int i3, boolean z, int i4, int i5) {
        AbstractC0120t.Log(5, "VideoPlayer Not Supported");
        return false;
    }

    public void forwardSoftInputStr(String str, int i, boolean z) {
        super.reportSoftInputStr(str, i, z);
    }

    public void forwardSoftInputSelection(int i, int i2) {
        super.reportSoftInputSelection(i, i2);
    }

    public void forwardSoftInputArea(Rect rect) {
        super.reportSoftInputArea(rect);
    }

    public void forwardSoftInputIsVisible(boolean z) {
        super.reportSoftInputIsVisible(z);
    }
}
