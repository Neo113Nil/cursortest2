package com.my.target;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.my.target.common.models.ImageData;
import com.my.target.gb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class b6 {
    private static final WeakHashMap c = new WeakHashMap();
    private final List a;
    private b b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements gb.a {
        final /* synthetic */ ImageData a;
        final /* synthetic */ cb b;
        final /* synthetic */ String c;
        final /* synthetic */ AtomicInteger d;
        final /* synthetic */ b e;

        a(ImageData imageData, cb cbVar, String str, AtomicInteger atomicInteger, b bVar) {
            this.a = imageData;
            this.b = cbVar;
            this.c = str;
            this.d = atomicInteger;
            this.e = bVar;
        }

        private void b() {
            if (this.d.decrementAndGet() == 0) {
                this.e.a(true);
            }
        }

        @Override // com.my.target.gb.a
        public void a(Bitmap bitmap) {
            this.a.setData(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (this.a.getHeight() == 0 || this.a.getWidth() == 0) {
                this.a.setHeight(height);
                this.a.setWidth(width);
            }
            int width2 = this.a.getWidth();
            int height2 = this.a.getHeight();
            if (width2 != width || height2 != height) {
                mi.d(String.format(Locale.getDefault(), "JSON image params (%d x %d) differ than loaded bitmap params (%d x %d)", Integer.valueOf(width2), Integer.valueOf(height2), Integer.valueOf(width), Integer.valueOf(height)));
            }
            b();
        }

        @Override // com.my.target.gb.a
        public void a() {
            cb cbVar = this.b;
            cbVar.b.c(cbVar.c, 4001, "imageUrl=" + this.c);
            b();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void a(boolean z);
    }

    private b6(List list) {
        this.a = list;
    }

    public static b6 a(ImageData imageData, int i, w0 w0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageData);
        return a(arrayList, i, w0Var);
    }

    public static b6 b(ImageData imageData) {
        return a(imageData, 0, w0.d);
    }

    public void c() {
        if (o0.a()) {
            mi.b("ImageLoaderUtils: Method load called from main thread");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        a(new b() { // from class: com.my.target.b6$$ExternalSyntheticLambda0
            @Override // com.my.target.b6.b
            public final void a(boolean z) {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            mi.a("ImageLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            mi.a("ImageLoaderUtils: awaiting media files load failed");
        }
    }

    public void d() {
        if (this.a.isEmpty()) {
            a();
        } else {
            a(new b() { // from class: com.my.target.b6$$ExternalSyntheticLambda2
                @Override // com.my.target.b6.b
                public final void a(boolean z) {
                    b6.this.a(z);
                }
            });
        }
    }

    public static b6 b(List list) {
        return new b6(list);
    }

    public static void b(ImageData imageData, ImageView imageView) {
        a(imageData, imageView, (b) null);
    }

    public static b6 a(List list) {
        return a(list, 0, w0.d);
    }

    public b6 b(b bVar) {
        this.b = bVar;
        return this;
    }

    public static b6 a(List list, int i, w0 w0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cb((ImageData) it.next(), w0Var, i));
        }
        return b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.a(true);
            this.b = null;
        }
    }

    public static void a(final ImageData imageData, ImageView imageView, final b bVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            mi.b("ImageLoaderUtils: Method loadAndDisplay called from worker thread");
            return;
        }
        WeakHashMap weakHashMap = c;
        if (weakHashMap.get(imageView) == imageData) {
            return;
        }
        weakHashMap.remove(imageView);
        if (imageData.getBitmap() != null) {
            a(imageData.getBitmap(), imageView);
            return;
        }
        weakHashMap.put(imageView, imageData);
        final WeakReference weakReference = new WeakReference(imageView);
        b(imageData).b(new b() { // from class: com.my.target.b6$$ExternalSyntheticLambda3
            @Override // com.my.target.b6.b
            public final void a(boolean z) {
                b6.a(weakReference, imageData, bVar, z);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WeakReference weakReference, ImageData imageData, b bVar, boolean z) {
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            WeakHashMap weakHashMap = c;
            if (imageData == ((ImageData) weakHashMap.get(imageView))) {
                weakHashMap.remove(imageView);
                Bitmap bitmap = imageData.getBitmap();
                if (bitmap != null) {
                    a(bitmap, imageView);
                }
            }
        }
        if (bVar != null) {
            bVar.a(imageData.getBitmap() != null);
        }
    }

    public static void a(ImageData imageData, ImageView imageView) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            mi.b("ImageLoaderUtils: Method cancel called from worker thread");
            return;
        }
        WeakHashMap weakHashMap = c;
        if (weakHashMap.get(imageView) == imageData) {
            weakHashMap.remove(imageView);
        }
    }

    public static void a(ImageData imageData) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            mi.b("ImageLoaderUtils: Method cancel called from worker thread");
            return;
        }
        for (ImageView imageView : c.keySet()) {
            if (c.get(imageView) == imageData) {
                a(imageData, imageView);
                return;
            }
        }
    }

    private static void a(Bitmap bitmap, ImageView imageView) {
        if (imageView instanceof fh) {
            ((fh) imageView).setImageBitmap(bitmap, true);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        a();
    }

    void a() {
        if (this.b == null) {
            return;
        }
        o0.e(new Runnable() { // from class: com.my.target.b6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                b6.this.b();
            }
        });
    }

    private void a(b bVar) {
        AtomicInteger atomicInteger = new AtomicInteger(this.a.size());
        int i = 0;
        for (cb cbVar : this.a) {
            ImageData imageData = (ImageData) cbVar.a;
            if (imageData.getBitmap() != null) {
                atomicInteger.decrementAndGet();
                i++;
            } else {
                String url = imageData.getUrl();
                a6.a().c(url, new a(imageData, cbVar, url, atomicInteger, bVar));
            }
        }
        if (i == this.a.size()) {
            bVar.a(true);
        }
    }
}
