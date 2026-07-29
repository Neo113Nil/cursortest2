package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;
import o.AV;
import o.InterfaceC2358zV;

@Keep
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    SurfaceTexture surfaceTexture();

    default void setOnFrameConsumedListener(InterfaceC2358zV interfaceC2358zV) {
    }

    default void setOnTrimMemoryListener(AV av) {
    }
}
