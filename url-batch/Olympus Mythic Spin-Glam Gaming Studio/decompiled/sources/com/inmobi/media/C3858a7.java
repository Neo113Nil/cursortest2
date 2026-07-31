package com.inmobi.media;

import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3858a7 extends Pi {
    public final String a;

    public C3858a7(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter("application/json", "contentType");
        this.a = fileName;
    }

    @Override // com.inmobi.media.Pi
    public final void a(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        String filePath = this.a;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Buffer buffer = new Buffer();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        try {
            buffer.readFrom(fileInputStream);
            CloseableKt.closeFinally(fileInputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
        try {
            try {
                try {
                    bufferedSink.writeAll(buffer);
                    Intrinsics.checkNotNullParameter(buffer, "<this>");
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(buffer, th3);
                        throw th4;
                    }
                }
            } catch (IOException e) {
                throw e;
            } catch (Exception unused) {
                Unit unit = Unit.INSTANCE;
            }
            try {
                buffer.close();
            } catch (IOException unused2) {
            }
            CloseableKt.closeFinally(buffer, null);
        } finally {
            Intrinsics.checkNotNullParameter(buffer, "<this>");
            try {
                buffer.close();
            } catch (IOException unused3) {
            }
        }
    }

    @Override // com.inmobi.media.Pi
    public final String a() {
        return "application/json";
    }
}
