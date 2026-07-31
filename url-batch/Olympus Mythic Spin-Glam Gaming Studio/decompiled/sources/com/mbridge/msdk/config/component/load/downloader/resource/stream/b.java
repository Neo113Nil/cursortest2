package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: FileDownloadRandomAccessDownloadFile.java */
/* loaded from: classes3.dex */
public class b implements a {
    private final BufferedOutputStream a;
    private final FileDescriptor b;
    private final RandomAccessFile c;

    public b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.c = randomAccessFile;
        this.b = randomAccessFile.getFD();
        this.a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void close() throws IOException {
        this.a.close();
        this.c.close();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void flushAndSync() throws IOException {
        this.a.flush();
        this.b.sync();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void seek(long j) throws IOException {
        this.c.seek(j);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
