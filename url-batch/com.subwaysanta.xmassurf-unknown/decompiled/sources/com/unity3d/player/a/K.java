package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.unity3d.player.AbstractC0164w;

/* loaded from: classes.dex */
public final class K extends EditText {
    public final /* synthetic */ AbstractC0164w a;
    public final /* synthetic */ com.unity3d.player.C b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(com.unity3d.player.C c, Context context, AbstractC0164w abstractC0164w) {
        super(context);
        this.b = c;
        this.a = abstractC0164w;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        x xVar;
        w wVar;
        Runnable runnable;
        if (i == 4) {
            if (keyEvent.getAction() == 1 && (xVar = this.b.h.e) != null && (wVar = xVar.a) != null && (runnable = wVar.a) != null) {
                runnable.run();
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0164w abstractC0164w = this.a;
            abstractC0164w.a(abstractC0164w.b(), false);
            return true;
        }
        if (i == 111 && keyEvent.getAction() == 0) {
            AbstractC0164w abstractC0164w2 = this.a;
            abstractC0164w2.a(abstractC0164w2.b(), true);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            this.a.c();
        }
    }
}
