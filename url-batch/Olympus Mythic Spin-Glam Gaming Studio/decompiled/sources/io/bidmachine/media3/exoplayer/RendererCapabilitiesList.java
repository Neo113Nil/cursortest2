package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes5.dex */
public interface RendererCapabilitiesList {

    public interface Factory {
        RendererCapabilitiesList createRendererCapabilitiesList();
    }

    RendererCapabilities[] getRendererCapabilities();

    void release();

    int size();
}
