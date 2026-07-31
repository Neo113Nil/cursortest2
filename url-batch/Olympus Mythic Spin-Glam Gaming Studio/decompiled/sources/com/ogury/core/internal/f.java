package com.ogury.core.internal;

import com.ogury.core.internal.network.CloseableUtilKt;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public abstract class f {
    public static final byte[] a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            CloseableUtilKt.closeSafely(gZIPOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return byteArray;
        } catch (Throwable th) {
            CloseableUtilKt.closeSafely(gZIPOutputStream);
            throw th;
        }
    }
}
