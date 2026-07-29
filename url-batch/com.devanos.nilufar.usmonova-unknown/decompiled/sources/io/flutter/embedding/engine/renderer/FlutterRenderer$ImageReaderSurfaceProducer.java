package io.flutter.embedding.engine.renderer;

import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.AV;
import o.BV;
import o.K0;
import o.RunnableC1848rn;

@Keep
/* loaded from: classes.dex */
final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, AV {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 7;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    BV callback;
    private final long id;
    private boolean released;
    final /* synthetic */ e this$0;
    private boolean ignoringFence = false;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    boolean notifiedDestroy = false;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<d> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, d> perImageReaders = new HashMap<>();
    private ArrayList<b> lastDequeuedImage = new ArrayList<>();
    private d lastReaderDequeuedFrom = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(e eVar, long j) {
        this.this$0 = eVar;
        this.id = j;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (d dVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == dVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    dVar.c = true;
                    dVar.a.close();
                    dVar.b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<b> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                d dVar2 = this.lastReaderDequeuedFrom;
                if (dVar2 != null) {
                    dVar2.c = true;
                    dVar2.a.close();
                    dVar2.b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
        return newInstance;
    }

    private ImageReader createImageReader33() {
        ImageReader build;
        K0.l();
        ImageReader.Builder c = K0.c(this.requestedWidth, this.requestedHeight);
        c.setMaxImages(7);
        c.setImageFormat(34);
        c.setUsage(256L);
        build = c.build();
        return build;
    }

    private d getActiveReader() {
        synchronized (this.lock) {
            try {
                if (!this.createNewReader) {
                    d peekLast = this.imageReaderQueue.peekLast();
                    if (peekLast.a.getSurface().isValid()) {
                        return peekLast;
                    }
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private d getOrCreatePerImageReader(ImageReader imageReader) {
        d dVar = this.perImageReaders.get(imageReader);
        if (dVar != null) {
            return dVar;
        }
        d createPerImageReader = createPerImageReader(imageReader);
        this.perImageReaders.put(imageReader, createPerImageReader);
        this.imageReaderQueue.add(createPerImageReader);
        return createPerImageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dequeueImage$0() {
        if (this.released) {
            return;
        }
        this.this$0.a.scheduleFrame();
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        HashSet hashSet = this.this$0.e;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == this) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.this$0.f.remove(this);
    }

    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    public Image acquireLatestImage() {
        b dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.a;
        maybeWaitOnFence(image);
        return image;
    }

    public ImageReader createImageReader() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return createImageReader33();
        }
        if (i >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public d createPerImageReader(ImageReader imageReader) {
        return new d(this, imageReader);
    }

    public double deltaMillis(long j) {
        return j / 1000000.0d;
    }

    public b dequeueImage() {
        b bVar;
        boolean z;
        synchronized (this.lock) {
            try {
                Iterator<d> it = this.imageReaderQueue.iterator();
                bVar = null;
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    d next = it.next();
                    ArrayDeque arrayDeque = next.b;
                    b bVar2 = arrayDeque.isEmpty() ? null : (b) arrayDeque.removeFirst();
                    if (bVar2 == null) {
                        bVar = bVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).a.close();
                        }
                        this.lastDequeuedImage.add(bVar2);
                        this.lastReaderDequeuedFrom = next;
                        bVar = bVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<d> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().b.isEmpty()) {
                        z = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.this$0.d.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.a
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterRenderer$ImageReaderSurfaceProducer.this.lambda$dequeueImage$0();
                }
            });
        }
        return bVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            e eVar = this.this$0;
            eVar.d.post(new RunnableC1848rn(this.id, eVar.a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return false;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i;
        synchronized (this.lock) {
            try {
                Iterator<d> it = this.imageReaderQueue.iterator();
                i = 0;
                while (it.hasNext()) {
                    i += it.next().b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public int numTrims() {
        int i;
        synchronized (this.lock) {
            i = this.numTrims;
        }
        return i;
    }

    public void onImage(ImageReader imageReader, Image image) {
        b bVar;
        synchronized (this.lock) {
            d orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            ArrayDeque arrayDeque = orCreatePerImageReader.b;
            if (orCreatePerImageReader.c) {
                bVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.d;
                System.nanoTime();
                b bVar2 = new b(flutterRenderer$ImageReaderSurfaceProducer, image);
                arrayDeque.add(bVar2);
                while (arrayDeque.size() > 2) {
                    ((b) arrayDeque.removeFirst()).a.close();
                }
                bVar = bVar2;
            }
        }
        if (bVar == null) {
            return;
        }
        this.this$0.a.scheduleFrame();
    }

    @Override // o.AV
    public void onTrimMemory(int i) {
        if (i < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        d peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ImageReader imageReader = peekFirst.a;
            ArrayDeque arrayDeque = peekFirst.b;
            if (!arrayDeque.isEmpty() || peekFirst.d.lastReaderDequeuedFrom == peekFirst) {
                return;
            }
            this.imageReaderQueue.removeFirst();
            this.perImageReaders.remove(imageReader);
            peekFirst.c = true;
            imageReader.close();
            arrayDeque.clear();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        e eVar = this.this$0;
        eVar.a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i, int i2) {
        int max = Math.max(1, i);
        int max2 = Math.max(1, i2);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(BV bv) {
    }
}
