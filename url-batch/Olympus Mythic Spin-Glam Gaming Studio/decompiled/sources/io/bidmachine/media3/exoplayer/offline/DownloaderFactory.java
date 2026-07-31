package io.bidmachine.media3.exoplayer.offline;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes4.dex */
public interface DownloaderFactory {
    Downloader createDownloader(DownloadRequest downloadRequest);
}
