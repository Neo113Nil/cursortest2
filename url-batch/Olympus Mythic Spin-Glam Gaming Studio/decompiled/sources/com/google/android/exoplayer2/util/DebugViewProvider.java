package com.google.android.exoplayer2.util;

import android.view.SurfaceView;
import androidx.annotation.Nullable;

/* loaded from: classes13.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: com.google.android.exoplayer2.util.DebugViewProvider$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.util.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
            SurfaceView lambda$static$0;
            lambda$static$0 = DebugViewProvider.lambda$static$0(i, i2);
            return lambda$static$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ SurfaceView lambda$static$0(int i, int i2) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
