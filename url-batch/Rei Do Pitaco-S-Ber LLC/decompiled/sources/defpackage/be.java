package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class be extends tg {
    @Override // defpackage.tg
    public final Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
