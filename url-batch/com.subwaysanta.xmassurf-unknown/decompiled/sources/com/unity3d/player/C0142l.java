package com.unity3d.player;

import android.media.Image;
import android.media.ImageReader;
import com.unity3d.player.a.AbstractC0120t;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142l implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C0148o a;

    public C0142l(C0148o c0148o) {
        this.a = c0148o;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Semaphore semaphore = C0148o.D;
        if (semaphore.tryAcquire()) {
            Image acquireNextImage = imageReader.acquireNextImage();
            if (acquireNextImage != null) {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((Camera2Wrapper) this.a.a).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    AbstractC0120t.Log(6, "Camera2: Wrong image format.");
                }
                Image image = this.a.p;
                if (image != null) {
                    image.close();
                }
                this.a.p = acquireNextImage;
            }
            semaphore.release();
        }
    }
}
