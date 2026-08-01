package androidx.profileinstaller;

import B.o;
import O0.e;
import android.content.Context;
import e0.i;
import java.util.Collections;
import java.util.List;
import m0.b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // m0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // m0.b
    public final Object b(Context context) {
        i.a(new o(this, 3, context.getApplicationContext()));
        return new e(24);
    }
}
