package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class A extends EditText {
    public final /* synthetic */ AbstractC0164w a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, AbstractC0164w abstractC0164w) {
        super(context);
        this.a = abstractC0164w;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                AbstractC0164w abstractC0164w = this.a;
                abstractC0164w.a(abstractC0164w.b(), false);
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0164w abstractC0164w2 = this.a;
            abstractC0164w2.a(abstractC0164w2.b(), false);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        if (i == 6) {
            AbstractC0164w abstractC0164w = this.a;
            abstractC0164w.a(abstractC0164w.b(), false);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.a.b.reportSoftInputSelection(i, i2 - i);
    }
}
