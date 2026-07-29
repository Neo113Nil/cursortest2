package o;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* renamed from: o.he, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182he {
    public final Object a;
    public final View b;

    public C1182he(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final AutofillId a(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession g = AbstractC2196x2.g(this.a);
        M1 t = TM.t(this.b);
        Objects.requireNonNull(t);
        return AbstractC0984ee.a(g, K7.f(t.h), j);
    }
}
