package com.squareup.picasso;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.Response;

/* loaded from: classes3.dex */
public interface Downloader {
    @NonNull
    Response load(@NonNull okhttp3.Request request) throws IOException;

    void shutdown();
}
