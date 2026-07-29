package o;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: o.ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2039ug extends C1097gL {
    @Override // o.C1097gL
    public final Signature[] n0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
