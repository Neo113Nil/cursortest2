package o;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class WR extends ContextWrapper {
    public final WindowManagerC1536n10 a;
    public WindowManagerC1536n10 b;
    public final Context c;

    public WR(Context context, WindowManagerC1536n10 windowManagerC1536n10, Context context2) {
        super(context);
        this.a = windowManagerC1536n10;
        this.c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length && i < 11; i++) {
            if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                return this.c.getSystemService(str);
            }
        }
        if (this.b == null) {
            this.b = this.a;
        }
        return this.b;
    }
}
