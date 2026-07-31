package sg.bigo.ads.bj;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class b {
    final ImageView a;
    public boolean b;
    public final List<WeakReference<g>> c;

    public b(ImageView imageView) {
        this.b = false;
        this.c = new ArrayList();
        this.a = imageView;
        imageView.setAdjustViewBounds(true);
    }

    public b(ImageView imageView, byte b) {
        this.b = false;
        this.c = new ArrayList();
        this.a = imageView;
        imageView.setAdjustViewBounds(true);
        this.b = true;
    }

    private void a(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            ImageView imageView = this.a;
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(imageView.getContext(), parseInt));
        } catch (NumberFormatException unused) {
        }
    }

    private void b(final String str) {
        final WeakReference weakReference = new WeakReference(this.a);
        final Context applicationContext = this.a.getContext().getApplicationContext();
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.bj.b.3
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap a = b.this.b ? sg.bigo.ads.common.utils.e.a(str) : sg.bigo.ads.common.utils.e.a(str, applicationContext);
                if (a == null) {
                    return;
                }
                sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.bj.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageView imageView = (ImageView) weakReference.get();
                        if (imageView != null) {
                            imageView.setImageBitmap(a);
                        }
                    }
                });
            }
        });
    }

    private void b(@Nullable final Executor executor, final String str, final boolean z) {
        final WeakReference weakReference = new WeakReference(this.a);
        sg.bigo.ads.bh.d.a(3, new Runnable() { // from class: sg.bigo.ads.bj.b.1
            @Override // java.lang.Runnable
            public final void run() {
                final b bVar = b.this;
                Executor executor2 = executor;
                String str2 = str;
                boolean z2 = z;
                final WeakReference weakReference2 = weakReference;
                g gVar = new g() { // from class: sg.bigo.ads.bj.b.2
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i, @NonNull String str3, @Nullable f fVar) {
                        Iterator<WeakReference<g>> it = b.this.c.iterator();
                        while (it.hasNext()) {
                            g gVar2 = it.next().get();
                            if (gVar2 != null) {
                                gVar2.a(i, str3, fVar);
                            }
                        }
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                        ImageView imageView = (ImageView) weakReference2.get();
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                        Iterator<WeakReference<g>> it = b.this.c.iterator();
                        while (it.hasNext()) {
                            g gVar2 = it.next().get();
                            if (gVar2 != null) {
                                gVar2.a(bitmap, fVar);
                            }
                        }
                    }
                };
                Context applicationContext = bVar.a.getContext().getApplicationContext();
                if (bVar.b) {
                    e.b(applicationContext, executor2, str2, z2, gVar);
                } else {
                    e.a(applicationContext, executor2, str2, z2, gVar);
                }
            }
        });
    }

    public final void a(@Nullable Executor executor, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("res".equalsIgnoreCase(scheme)) {
            a(parse.getHost());
            return;
        }
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            b(executor, str, z);
        } else if ("file".equalsIgnoreCase(scheme)) {
            b(parse.getPath());
        }
    }

    public final void a(g gVar) {
        if (gVar == null) {
            return;
        }
        this.c.add(new WeakReference<>(gVar));
    }
}
