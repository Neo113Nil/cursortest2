package yads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class em {
    public static final em a = new em();

    public static final byte[] a(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str == null) {
                str = "";
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] readBytes = ByteStreamsKt.readBytes(gZIPInputStream);
                    CloseableKt.closeFinally(gZIPInputStream, null);
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                    m8023constructorimpl = Result.m8023constructorimpl(readBytes);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            m8023constructorimpl = new byte[0];
        }
        return (byte[]) m8023constructorimpl;
    }

    public static final String b(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(new String(a(str), Charsets.UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            m8023constructorimpl = "";
        }
        return (String) m8023constructorimpl;
    }
}
