package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.IOException;

/* compiled from: DownloadFileOutputStream.java */
/* loaded from: classes3.dex */
public interface a {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j) throws IOException, IllegalAccessException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
