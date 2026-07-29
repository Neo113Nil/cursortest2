package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162v implements TextView.OnEditorActionListener {
    public final /* synthetic */ AbstractC0164w a;

    public C0162v(AbstractC0164w abstractC0164w) {
        this.a = abstractC0164w;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC0164w abstractC0164w = this.a;
            abstractC0164w.a(abstractC0164w.b(), false);
        }
        return false;
    }
}
