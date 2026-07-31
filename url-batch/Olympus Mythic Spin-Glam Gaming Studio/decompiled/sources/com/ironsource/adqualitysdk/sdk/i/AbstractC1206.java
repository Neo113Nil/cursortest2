package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭨ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public abstract class AbstractC1206 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final /* synthetic */ int f3135 = 0;

    static {
        StringFog.decrypt("pZXQhAfytiCIntCEGMSJLoeb1IAZ86gumonygQrAsCqb\n", "6fqz5WuwxE8=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m4449(Context context) {
        Class<?> cls;
        try {
            String decrypt = StringFog.decrypt("VORL0GMJMsEb5kDBbQw0y1rrS8FtEyLUVOROxWkSeNpa5FvHYhR49VrpTs5OEjnYUelO0XgtN9dU\n7UrQ\n", "NYovogxgVrk=\n");
            String str = AbstractC1226.f3226;
            try {
                cls = Class.forName(decrypt);
            } catch (Throwable unused) {
                cls = null;
            }
            return AbstractC1226.m4478(cls, StringFog.decrypt("X0BqHhyaWLdWRns=\n", "OCUeV3LpLNY=\n"), Arrays.asList(context)).invoke(null, context);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            return null;
        }
    }
}
