package com.ogury.ad.internal;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes10.dex */
public abstract class e5 {
    public static String a(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
            Charset forName = Charset.forName("US-ASCII");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            byte[] bytes = s.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes, 0, s.length());
            byte[] digest = messageDigest.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%0" + (digest.length << 1) + VastAttributes.HORIZONTAL_POSITION, Arrays.copyOf(new Object[]{bigInteger}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        } catch (NoSuchAlgorithmException e) {
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, e);
            return "";
        }
    }
}
