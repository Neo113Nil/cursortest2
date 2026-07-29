package o;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: o.Qs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436Qs extends InputConnectionWrapper {
    public final /* synthetic */ C1932t2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0436Qs(InputConnection inputConnection, C1932t2 c1932t2) {
        super(inputConnection, false);
        this.a = c1932t2;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C1590ns c1590ns = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c1590ns = new C1590ns(1, new C0488Ss(inputContentInfo));
        }
        if (this.a.c(c1590ns, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
