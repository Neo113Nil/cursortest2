package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class d {
    public final ImageReader a;
    public final ArrayDeque b = new ArrayDeque();
    public boolean c = false;
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer d;

    public d(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.d = flutterRenderer$ImageReaderSurfaceProducer;
        this.a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.c
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image image;
                boolean z;
                d dVar = d.this;
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = dVar.d;
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e) {
                    Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                z = flutterRenderer$ImageReaderSurfaceProducer2.released;
                if (z || dVar.c) {
                    image.close();
                } else {
                    flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
