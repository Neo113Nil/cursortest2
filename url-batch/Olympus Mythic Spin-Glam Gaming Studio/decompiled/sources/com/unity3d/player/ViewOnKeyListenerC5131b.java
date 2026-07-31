package com.unity3d.player;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: com.unity3d.player.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class ViewOnKeyListenerC5131b implements View.OnKeyListener {
    ViewOnKeyListenerC5131b() {
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return i == 4 && keyEvent.getAction() == 1;
    }
}
