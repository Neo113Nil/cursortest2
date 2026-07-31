package io.bidmachine.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import io.bidmachine.media3.common.util.GlUtil;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes3.dex */
public interface GlObjectsProvider {
    GlTextureInfo createBuffersForTexture(int i, int i2, int i3) throws GlUtil.GlException;

    EGLContext createEglContext(EGLDisplay eGLDisplay, @IntRange int i, int[] iArr) throws GlUtil.GlException;

    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException;

    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException;

    void release(EGLDisplay eGLDisplay) throws GlUtil.GlException;
}
