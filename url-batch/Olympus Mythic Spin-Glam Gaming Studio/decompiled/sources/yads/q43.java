package yads;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes14.dex */
public final class q43 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context, String str) {
        lm0 lm0Var;
        byte[] bArr;
        byte[] decode;
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        if (a == null || (lm0Var = a.a0) == null) {
            lm0Var = lm0.c;
        }
        String str2 = lm0Var.a;
        wt1 wt1Var = new wt1(lm0Var.b, str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            decode = Base64.decode(str2, 0);
        } catch (Throwable unused) {
            boolean z = ob1.a;
        }
        if (decode != null) {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr2);
            bArr = wt1Var.a(bytes, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
            if (bArr == null) {
                return cm.a(bArr);
            }
            return null;
        }
        bArr = null;
        if (bArr == null) {
        }
    }
}
