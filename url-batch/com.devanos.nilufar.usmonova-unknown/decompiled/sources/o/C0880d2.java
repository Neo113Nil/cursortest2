package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: o.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880d2 {
    public final ContextThemeWrapper a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public DialogInterfaceOnKeyListenerC0891dC f;
    public Object g;
    public DialogInterface.OnClickListener h;
    public boolean i;
    public int j = -1;

    public C0880d2(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
