package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.UUID;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴹ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0983 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2353 = StringFog.decrypt("vCPAU4XyPHmqIspMiOd3eqYo\n", "z0yvPumTEh4=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4278(Context context) {
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), StringFog.decrypt("qgYIhS9q4+CiDA==\n", "y2hs90ADh78=\n"));
        if (string != null) {
            return string;
        }
        AbstractC0580.m4072(StringFog.decrypt("fbk0uodKxaV7iAyct27h4WeCHo2neNT3UYwajady5+BH\n", "NOp//8IchIU=\n"), StringFog.decrypt("g2FRCLNji6zgaEEQtGWMmY5KdiueSfORhCAEMaRkwr/gaUEKsn/NrKVqBA2zIw==\n", "wA4kZNcNrNg=\n"));
        SharedPreferences sharedPreferences = context.getSharedPreferences(StringFog.decrypt("8AGFp48qZHetEYg=\n", "g3Xq1eoEDwE=\n"), 0);
        String str = f2353;
        String string2 = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string2)) {
            string2 = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(str, string2).commit();
        }
        return string2;
    }
}
