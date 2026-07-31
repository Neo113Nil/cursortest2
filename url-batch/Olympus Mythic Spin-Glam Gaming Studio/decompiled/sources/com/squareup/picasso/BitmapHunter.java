package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* loaded from: classes15.dex */
class BitmapHunter implements Runnable {
    Action action;
    List<Action> actions;
    final Cache cache;
    final Request data;
    final Dispatcher dispatcher;
    Exception exception;
    int exifOrientation;
    Future<?> future;
    final String key;
    Picasso.LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final Picasso picasso;
    Picasso.Priority priority;
    final RequestHandler requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    final Stats stats;
    private static final Object DECODE_LOCK = new Object();
    private static final ThreadLocal<StringBuilder> NAME_BUILDER = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.BitmapHunter.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() { // from class: com.squareup.picasso.BitmapHunter.2
        @Override // com.squareup.picasso.RequestHandler
        public boolean canHandleRequest(Request request) {
            return true;
        }

        @Override // com.squareup.picasso.RequestHandler
        public RequestHandler.Result load(Request request, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    };

    static int getExifRotation(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int getExifTranslation(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    private static boolean shouldResize(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    BitmapHunter(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action, RequestHandler requestHandler) {
        this.picasso = picasso;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.stats = stats;
        this.action = action;
        this.key = action.getKey();
        this.data = action.getRequest();
        this.priority = action.getPriority();
        this.memoryPolicy = action.getMemoryPolicy();
        this.networkPolicy = action.getNetworkPolicy();
        this.requestHandler = requestHandler;
        this.retryCount = requestHandler.getRetryCount();
    }

    static Bitmap decodeStream(Source source, Request request) throws IOException {
        BufferedSource buffer = Okio.buffer(source);
        boolean isWebPFile = Utils.isWebPFile(buffer);
        boolean z = request.purgeable;
        BitmapFactory.Options createBitmapOptions = RequestHandler.createBitmapOptions(request);
        boolean requiresInSampleSize = RequestHandler.requiresInSampleSize(createBitmapOptions);
        if (isWebPFile) {
            byte[] readByteArray = buffer.readByteArray();
            if (requiresInSampleSize) {
                BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, createBitmapOptions);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
            }
            return BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, createBitmapOptions);
        }
        InputStream inputStream = buffer.inputStream();
        if (requiresInSampleSize) {
            MarkableInputStream markableInputStream = new MarkableInputStream(inputStream);
            markableInputStream.allowMarksToExpire(false);
            long savePosition = markableInputStream.savePosition(1024);
            BitmapFactory.decodeStream(markableInputStream, null, createBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
            markableInputStream.reset(savePosition);
            markableInputStream.allowMarksToExpire(true);
            inputStream = markableInputStream;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, createBitmapOptions);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        updateThreadName(this.data);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "executing", Utils.getLogIdsForHunter(this));
                        }
                        Bitmap hunt = hunt();
                        this.result = hunt;
                        if (hunt == null) {
                            this.dispatcher.dispatchFailed(this);
                        } else {
                            this.dispatcher.dispatchComplete(this);
                        }
                    } catch (IOException e) {
                        this.exception = e;
                        this.dispatcher.dispatchRetry(this);
                    }
                } catch (NetworkRequestHandler.ResponseException e2) {
                    if (!NetworkPolicy.isOfflineOnly(e2.networkPolicy) || e2.code != 504) {
                        this.exception = e2;
                    }
                    this.dispatcher.dispatchFailed(this);
                }
            } catch (Exception e3) {
                this.exception = e3;
                this.dispatcher.dispatchFailed(this);
            } catch (OutOfMemoryError e4) {
                StringWriter stringWriter = new StringWriter();
                this.stats.createSnapshot().dump(new PrintWriter(stringWriter));
                this.exception = new RuntimeException(stringWriter.toString(), e4);
                this.dispatcher.dispatchFailed(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:43:0x0098, B:45:0x00a0, B:48:0x00c2, B:50:0x00ca, B:52:0x00d8, B:53:0x00e7, B:57:0x00a7, B:59:0x00b5), top: B:42:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Bitmap hunt() throws IOException {
        Bitmap bitmap;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmap = this.cache.get(this.key);
            if (bitmap != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = Picasso.LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    Utils.log("Hunter", "decoded", this.data.logId(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i = this.retryCount == 0 ? NetworkPolicy.OFFLINE.index : this.networkPolicy;
        this.networkPolicy = i;
        RequestHandler.Result load = this.requestHandler.load(this.data, i);
        if (load != null) {
            this.loadedFrom = load.getLoadedFrom();
            this.exifOrientation = load.getExifOrientation();
            bitmap = load.getBitmap();
            if (bitmap == null) {
                Source source = load.getSource();
                try {
                    bitmap = decodeStream(source, this.data);
                } finally {
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.picasso.loggingEnabled) {
                Utils.log("Hunter", "decoded", this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmap);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    try {
                        if (!this.data.needsMatrixTransform()) {
                            if (this.exifOrientation != 0) {
                            }
                            if (this.data.hasCustomTransformations()) {
                                bitmap = applyCustomTransformations(this.data.transformations, bitmap);
                                if (this.picasso.loggingEnabled) {
                                    Utils.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
                                }
                            }
                        }
                        bitmap = transformResult(this.data, bitmap, this.exifOrientation);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "transformed", this.data.logId());
                        }
                        if (this.data.hasCustomTransformations()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmap != null) {
                    this.stats.dispatchBitmapTransformed(bitmap);
                }
            }
        }
        return bitmap;
    }

    void attach(Action action) {
        boolean z = this.picasso.loggingEnabled;
        Request request = action.request;
        if (this.action == null) {
            this.action = action;
            if (z) {
                List<Action> list = this.actions;
                if (list == null || list.isEmpty()) {
                    Utils.log("Hunter", "joined", request.logId(), "to empty hunter");
                    return;
                } else {
                    Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.actions == null) {
            this.actions = new ArrayList(3);
        }
        this.actions.add(action);
        if (z) {
            Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
        }
        Picasso.Priority priority = action.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    void detach(Action action) {
        boolean remove;
        if (this.action == action) {
            this.action = null;
            remove = true;
        } else {
            List<Action> list = this.actions;
            remove = list != null ? list.remove(action) : false;
        }
        if (remove && action.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
            Utils.log("Hunter", "removed", action.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
    }

    private Picasso.Priority computeNewPriority() {
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<Action> list = this.actions;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        Action action = this.action;
        if (action == null && !z) {
            return priority;
        }
        if (action != null) {
            priority = action.getPriority();
        }
        if (z) {
            int size = this.actions.size();
            for (int i = 0; i < size; i++) {
                Picasso.Priority priority2 = this.actions.get(i).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    boolean cancel() {
        Future<?> future;
        if (this.action != null) {
            return false;
        }
        List<Action> list = this.actions;
        return (list == null || list.isEmpty()) && (future = this.future) != null && future.cancel(false);
    }

    boolean isCancelled() {
        Future<?> future = this.future;
        return future != null && future.isCancelled();
    }

    boolean shouldRetry(boolean z, NetworkInfo networkInfo) {
        int i = this.retryCount;
        if (i <= 0) {
            return false;
        }
        this.retryCount = i - 1;
        return this.requestHandler.shouldRetry(z, networkInfo);
    }

    boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }

    Bitmap getResult() {
        return this.result;
    }

    String getKey() {
        return this.key;
    }

    int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    Request getData() {
        return this.data;
    }

    Action getAction() {
        return this.action;
    }

    Picasso getPicasso() {
        return this.picasso;
    }

    List<Action> getActions() {
        return this.actions;
    }

    Exception getException() {
        return this.exception;
    }

    Picasso.LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    Picasso.Priority getPriority() {
        return this.priority;
    }

    static void updateThreadName(Request request) {
        String name = request.getName();
        StringBuilder sb = NAME_BUILDER.get();
        sb.ensureCapacity(name.length() + 8);
        sb.replace(8, sb.length(), name);
        Thread.currentThread().setName(sb.toString());
    }

    static BitmapHunter forRequest(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action) {
        Request request = action.getRequest();
        List<RequestHandler> requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i = 0; i < size; i++) {
            RequestHandler requestHandler = requestHandlers.get(i);
            if (requestHandler.canHandleRequest(request)) {
                return new BitmapHunter(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new BitmapHunter(picasso, dispatcher, cache, stats, action, ERRORING_HANDLER);
    }

    static Bitmap applyCustomTransformations(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final Transformation transformation = list.get(i);
            try {
                Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(transformation.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<Transformation> it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next().key());
                        sb.append('\n');
                    }
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                }
                if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.5
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + Transformation.this.key() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                }
                if (transform != bitmap && !bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.6
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + Transformation.this.key() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
                i++;
                bitmap = transform;
            } catch (RuntimeException e) {
                Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException("Transformation " + Transformation.this.key() + " crashed with exception.", e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Bitmap transformResult(Request request, Bitmap bitmap, int i) {
        int i2;
        int i3;
        boolean z;
        Matrix matrix;
        int i4;
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i6;
        int i7;
        float f9;
        float f10;
        float f11;
        int i8;
        int i9;
        float f12;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z3 = request.onlyScaleDown;
        Matrix matrix2 = new Matrix();
        if (request.needsMatrixTransform() || i != 0) {
            int i18 = request.targetWidth;
            int i19 = request.targetHeight;
            float f13 = request.rotationDegrees;
            if (f13 != 0.0f) {
                double d = f13;
                double cos = Math.cos(Math.toRadians(d));
                double sin = Math.sin(Math.toRadians(d));
                if (request.hasRotationPivot) {
                    matrix2.setRotate(f13, request.rotationPivotX, request.rotationPivotY);
                    float f14 = request.rotationPivotX;
                    double d2 = 1.0d - cos;
                    float f15 = request.rotationPivotY;
                    i3 = height;
                    z = z3;
                    double d3 = (f14 * d2) + (f15 * sin);
                    double d4 = (f15 * d2) - (f14 * sin);
                    int i20 = request.targetWidth;
                    double d5 = (i20 * cos) + d3;
                    double d6 = (i20 * sin) + d4;
                    int i21 = request.targetHeight;
                    i2 = width;
                    double d7 = (d3 + (i20 * cos)) - (i21 * sin);
                    double d8 = (i20 * sin) + d4 + (i21 * cos);
                    double d9 = d3 - (i21 * sin);
                    double d10 = (i21 * cos) + d4;
                    double max = Math.max(d9, Math.max(d7, Math.max(d3, d5)));
                    double min = Math.min(d9, Math.min(d7, Math.min(d3, d5)));
                    double max2 = Math.max(d10, Math.max(d8, Math.max(d4, d6)));
                    double min2 = Math.min(d10, Math.min(d8, Math.min(d4, d6)));
                    i18 = (int) Math.floor(max - min);
                    i19 = (int) Math.floor(max2 - min2);
                    matrix = matrix2;
                } else {
                    i2 = width;
                    i3 = height;
                    z = z3;
                    matrix = matrix2;
                    matrix.setRotate(f13);
                    int i22 = request.targetWidth;
                    double d11 = i22 * cos;
                    double d12 = i22 * sin;
                    int i23 = request.targetHeight;
                    double d13 = (i22 * cos) - (i23 * sin);
                    double d14 = (i22 * sin) + (i23 * cos);
                    double d15 = -(i23 * sin);
                    double d16 = i23 * cos;
                    double max3 = Math.max(d15, Math.max(d13, Math.max(0.0d, d11)));
                    double min3 = Math.min(d15, Math.min(d13, Math.min(0.0d, d11)));
                    double max4 = Math.max(d16, Math.max(d14, Math.max(0.0d, d12)));
                    double min4 = Math.min(d16, Math.min(d14, Math.min(0.0d, d12)));
                    int floor = (int) Math.floor(max3 - min3);
                    i19 = (int) Math.floor(max4 - min4);
                    i18 = floor;
                }
            } else {
                i2 = width;
                i3 = height;
                z = z3;
                matrix = matrix2;
            }
            if (i != 0) {
                int exifRotation = getExifRotation(i);
                int exifTranslation = getExifTranslation(i);
                if (exifRotation != 0) {
                    matrix.preRotate(exifRotation);
                    if (exifRotation == 90 || exifRotation == 270) {
                        int i24 = i19;
                        i19 = i18;
                        i18 = i24;
                    }
                }
                if (exifTranslation != 1) {
                    matrix.postScale(exifTranslation, 1.0f);
                }
            }
            if (request.centerCrop) {
                if (i18 != 0) {
                    i6 = i2;
                    f9 = i18 / i6;
                    i7 = i3;
                } else {
                    i6 = i2;
                    i7 = i3;
                    f9 = i19 / i7;
                }
                if (i19 != 0) {
                    f10 = i19;
                    f11 = i7;
                } else {
                    f10 = i18;
                    f11 = i6;
                }
                float f16 = f10 / f11;
                if (f9 > f16) {
                    int ceil = (int) Math.ceil(i7 * (f16 / f9));
                    int i25 = request.centerCropGravity;
                    if ((i25 & 48) == 48) {
                        i17 = 0;
                    } else {
                        i17 = (i25 & 80) == 80 ? i7 - ceil : (i7 - ceil) / 2;
                    }
                    f12 = i19 / ceil;
                    i9 = ceil;
                    z2 = z;
                    i11 = 0;
                    i10 = i17;
                    i8 = i6;
                } else if (f9 < f16) {
                    int ceil2 = (int) Math.ceil(i6 * (f9 / f16));
                    int i26 = request.centerCropGravity;
                    if ((i26 & 3) == 3) {
                        i12 = 0;
                    } else {
                        i12 = (i26 & 5) == 5 ? i6 - ceil2 : (i6 - ceil2) / 2;
                    }
                    i11 = i12;
                    i8 = ceil2;
                    i9 = i7;
                    f9 = i18 / ceil2;
                    z2 = z;
                    f12 = f16;
                    i10 = 0;
                } else {
                    i8 = i6;
                    i9 = i7;
                    f9 = f16;
                    f12 = f9;
                    z2 = z;
                    i10 = 0;
                    i11 = 0;
                }
                if (shouldResize(z2, i6, i7, i18, i19)) {
                    matrix.preScale(f9, f12);
                }
                i13 = i10;
                i14 = i9;
                i15 = i11;
                i16 = i8;
                createBitmap = Bitmap.createBitmap(bitmap, i15, i13, i16, i14, matrix, true);
                if (createBitmap != bitmap) {
                    return bitmap;
                }
                bitmap.recycle();
                return createBitmap;
            }
            i4 = i3;
            boolean z4 = z;
            i5 = i2;
            if (request.centerInside) {
                if (i18 != 0) {
                    f5 = i18;
                    f6 = i5;
                } else {
                    f5 = i19;
                    f6 = i4;
                }
                float f17 = f5 / f6;
                if (i19 != 0) {
                    f7 = i19;
                    f8 = i4;
                } else {
                    f7 = i18;
                    f8 = i5;
                }
                float f18 = f7 / f8;
                if (f17 >= f18) {
                    f17 = f18;
                }
                if (shouldResize(z4, i5, i4, i18, i19)) {
                    matrix.preScale(f17, f17);
                }
            } else if ((i18 != 0 || i19 != 0) && (i18 != i5 || i19 != i4)) {
                if (i18 != 0) {
                    f = i18;
                    f2 = i5;
                } else {
                    f = i19;
                    f2 = i4;
                }
                float f19 = f / f2;
                if (i19 != 0) {
                    f3 = i19;
                    f4 = i4;
                } else {
                    f3 = i18;
                    f4 = i5;
                }
                float f20 = f3 / f4;
                if (shouldResize(z4, i5, i4, i18, i19)) {
                    matrix.preScale(f19, f20);
                }
            }
        } else {
            i5 = width;
            i4 = height;
            matrix = matrix2;
        }
        i16 = i5;
        i14 = i4;
        i15 = 0;
        i13 = 0;
        createBitmap = Bitmap.createBitmap(bitmap, i15, i13, i16, i14, matrix, true);
        if (createBitmap != bitmap) {
        }
    }
}
