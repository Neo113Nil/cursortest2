package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class pk0 {
    public final kk0 a;

    public pk0(Context context) {
        this.a = new kk0(context.getApplicationContext());
    }

    public final Drawable a(byte[] bArr) {
        jk0 xpVar;
        o31 a = p31.a(bArr);
        kk0 kk0Var = this.a;
        kk0Var.getClass();
        int ordinal = a.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                xpVar = new qy0();
                return xpVar.a(bArr, kk0Var.a.getApplicationContext());
            }
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        xpVar = new xp();
        return xpVar.a(bArr, kk0Var.a.getApplicationContext());
    }
}
