package io.grpc;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public interface Decompressor {
    InputStream decompress(InputStream inputStream) throws IOException;

    String getMessageEncoding();
}
