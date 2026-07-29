package com.unity3d.player;

import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Objects;

/* loaded from: classes.dex */
public final class M extends AccessibilityNodeProvider {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    public M(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.a = unityAccessibilityDelegate;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        SurfaceView surfaceView;
        boolean populateNodeInfo;
        SurfaceView surfaceView2;
        SurfaceView surfaceView3;
        int[] rootNodeIds;
        SurfaceView surfaceView4;
        if (i == -1) {
            surfaceView2 = this.a.b;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(surfaceView2);
            surfaceView3 = this.a.b;
            Object parent = surfaceView3.getParent();
            if (parent instanceof View) {
                obtain.setParent((View) parent);
            }
            rootNodeIds = UnityAccessibilityDelegate.getRootNodeIds();
            if (rootNodeIds != null) {
                for (int i2 : rootNodeIds) {
                    surfaceView4 = this.a.b;
                    obtain.addChild(surfaceView4, i2);
                }
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        surfaceView = this.a.b;
        populateNodeInfo = UnityAccessibilityDelegate.populateNodeInfo(obtain2, i, surfaceView);
        if (populateNodeInfo) {
            return obtain2;
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        boolean isNodeSlider;
        boolean isNodeScrollable;
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        UnityPlayer unityPlayer3;
        UnityPlayer unityPlayer4;
        boolean isNodeDismissable;
        UnityPlayer unityPlayer5;
        UnityPlayer unityPlayer6;
        boolean isNodeInvokable;
        UnityPlayer unityPlayer7;
        UnityPlayer unityPlayer8;
        if (i2 == 64) {
            return this.a.sendEventForVirtualViewId(i, 32768);
        }
        if (i2 == 128) {
            return this.a.sendEventForVirtualViewId(i, 65536);
        }
        if (i2 == 16) {
            isNodeInvokable = UnityAccessibilityDelegate.isNodeInvokable(i);
            if (!isNodeInvokable) {
                return false;
            }
            unityPlayer7 = this.a.a;
            Objects.requireNonNull(unityPlayer7);
            I i3 = new I(this, unityPlayer7, i);
            unityPlayer8 = this.a.a;
            unityPlayer8.invokeOnMainThread((Runnable) i3);
            return true;
        }
        if (i2 == 4096 || i2 == 8192) {
            isNodeSlider = UnityAccessibilityDelegate.isNodeSlider(i);
            if (isNodeSlider) {
                unityPlayer3 = this.a.a;
                Objects.requireNonNull(unityPlayer3);
                J j = new J(this, unityPlayer3, i2, i);
                unityPlayer4 = this.a.a;
                unityPlayer4.invokeOnMainThread((Runnable) j);
                return true;
            }
            isNodeScrollable = UnityAccessibilityDelegate.isNodeScrollable(i);
            if (isNodeScrollable) {
                unityPlayer = this.a.a;
                Objects.requireNonNull(unityPlayer);
                K k = new K(unityPlayer, i, i2);
                unityPlayer2 = this.a.a;
                unityPlayer2.invokeOnMainThread((Runnable) k);
                return true;
            }
        }
        if (i2 != 1048576) {
            return false;
        }
        isNodeDismissable = UnityAccessibilityDelegate.isNodeDismissable(i);
        if (!isNodeDismissable) {
            return false;
        }
        unityPlayer5 = this.a.a;
        Objects.requireNonNull(unityPlayer5);
        L l = new L(unityPlayer5, i);
        unityPlayer6 = this.a.a;
        unityPlayer6.invokeOnMainThread((Runnable) l);
        return true;
    }
}
