package o;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class C2 implements InterfaceC0186Hb {
    public final ClipboardManager a;

    public C2(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC0048Bt.l(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.a = (ClipboardManager) systemService;
    }
}
