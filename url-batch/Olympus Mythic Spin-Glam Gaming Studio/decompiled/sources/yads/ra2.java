package yads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class ra2 {
    public static xd3 a(rd3 rd3Var) {
        uc1 uc1Var = rd3Var.b;
        if (uc1Var == null || !Intrinsics.areEqual(uc1Var.b, CampaignEx.KEY_OMID)) {
            throw new td3(rd3Var, sd3.c);
        }
        try {
            URL url = new URL(uc1Var.c);
            String str = rd3Var.a;
            String str2 = rd3Var.c;
            if (str2 == null || str2.length() == 0) {
                return new xd3(null, url, null);
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("VendorKey is null or empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("VerificationParameters is null or empty");
            }
            return new xd3(str, url, str2);
        } catch (MalformedURLException unused) {
            throw new td3(rd3Var, sd3.d);
        }
    }
}
