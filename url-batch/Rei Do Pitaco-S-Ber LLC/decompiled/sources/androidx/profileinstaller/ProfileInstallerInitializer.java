package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.fo;
import defpackage.iw;
import defpackage.w2;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements fo {
    @Override // defpackage.fo
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.fo
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new w2(this, context.getApplicationContext()));
        return new iw(5);
    }
}
