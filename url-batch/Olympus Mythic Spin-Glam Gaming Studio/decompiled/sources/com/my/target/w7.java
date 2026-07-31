package com.my.target;

import com.my.target.b6;
import com.my.target.common.models.ImageData;
import com.my.target.internal.api.internalnativead.medialoader.Cancellable;
import com.my.target.internal.api.internalnativead.medialoader.InternalNativeMediaLoader;
import com.my.target.internal.api.internalnativead.medialoader.LoadError;
import com.my.target.internal.api.internalnativead.medialoader.MediaLoaderListener;
import com.my.target.internal.api.internalnativead.models.InternalImageData;
import com.my.target.internal.api.internalnativead.models.InternalNativeBanner;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class w7 implements InternalNativeMediaLoader {
    private w7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    public static w7 b() {
        return new w7();
    }

    public Cancellable load(final InternalNativeBanner internalNativeBanner, final InternalImageData internalImageData, final MediaLoaderListener mediaLoaderListener) {
        if (!(internalImageData instanceof i7) || !(internalNativeBanner instanceof v7)) {
            h7 h7Var = new h7(internalImageData, new Runnable() { // from class: com.my.target.w7$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    w7.a();
                }
            });
            mediaLoaderListener.onError(internalNativeBanner, internalImageData, LoadError.newLoadError(1, "Media has invalid format"));
            return h7Var;
        }
        final i7 i7Var = (i7) internalImageData;
        final j7 a = ((v7) internalNativeBanner).a();
        final h7 h7Var2 = new h7(internalImageData, new Runnable() { // from class: com.my.target.w7$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                w7.a(i7.this, mediaLoaderListener, internalNativeBanner, internalImageData);
            }
        });
        o0.a(new Runnable() { // from class: com.my.target.w7$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                w7.a(mediaLoaderListener, internalNativeBanner, internalImageData, i7Var, a, h7Var2);
            }
        });
        return h7Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(i7 i7Var, MediaLoaderListener mediaLoaderListener, InternalNativeBanner internalNativeBanner, InternalImageData internalImageData) {
        b6.a(i7Var.a());
        mediaLoaderListener.onError(internalNativeBanner, internalImageData, LoadError.newLoadError(4, "Loading was canceled"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(final MediaLoaderListener mediaLoaderListener, final InternalNativeBanner internalNativeBanner, final InternalImageData internalImageData, i7 i7Var, j7 j7Var, final h7 h7Var) {
        o0.e(new Runnable() { // from class: com.my.target.w7$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                mediaLoaderListener.onStart(internalNativeBanner, internalImageData);
            }
        });
        final ImageData a = i7Var.a();
        b6.a(a, 999, j7Var.f()).b(new b6.b() { // from class: com.my.target.w7$$ExternalSyntheticLambda4
            @Override // com.my.target.b6.b
            public final void a(boolean z) {
                w7.a(h7.this, a, mediaLoaderListener, internalNativeBanner, internalImageData, z);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(h7 h7Var, ImageData imageData, MediaLoaderListener mediaLoaderListener, InternalNativeBanner internalNativeBanner, InternalImageData internalImageData, boolean z) {
        if (h7Var.a()) {
            return;
        }
        if (imageData.getBitmap() != null) {
            mediaLoaderListener.onSuccess(internalNativeBanner, internalImageData);
        } else {
            mediaLoaderListener.onError(internalNativeBanner, internalImageData, LoadError.newLoadError(3, "Error while loading the media"));
        }
    }
}
