package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import o.BJ;
import o.C0218Ih;
import o.InterfaceC0229Is;
import o.R4;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0229Is {
    @Override // o.InterfaceC0229Is
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.InterfaceC0229Is
    public final Object b(Context context) {
        BJ.a(new R4(this, context.getApplicationContext()));
        return new C0218Ih(17);
    }
}
