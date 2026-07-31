package io.bidmachine.nativead.utils;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public class ImageHelper {
    private static final int MAX_IMAGE_HEIGHT = 700;
    private static final int MAX_IMAGE_WIDTH = 1200;

    public interface OnImageHelperListener {
        void onError(@NonNull String str);

        void onImagePrepared(@NonNull ImageView imageView, @NonNull Drawable drawable);
    }

    class a implements OnImageHelperListener {
        a() {
        }

        @Override // io.bidmachine.nativead.utils.ImageHelper.OnImageHelperListener
        public void onError(String str) {
            Logger.d(str);
        }

        @Override // io.bidmachine.nativead.utils.ImageHelper.OnImageHelperListener
        public void onImagePrepared(ImageView imageView, Drawable drawable) {
            imageView.setImageDrawable(drawable);
        }
    }

    private static class b implements Runnable {
        private final Uri a;
        private final Context b;
        private final WeakReference c;
        private final OnImageHelperListener d;
        private Drawable e;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageView imageView = (ImageView) b.this.c.get();
                if (imageView == null || b.this.e == null) {
                    b.this.d.onError("Target ImageView or Bitmap is invalid");
                } else {
                    b.this.d.onImagePrepared(imageView, b.this.e);
                }
            }
        }

        b(Context context, Uri uri, ImageView imageView, OnImageHelperListener onImageHelperListener) {
            this.b = context;
            this.a = uri;
            this.c = new WeakReference(imageView);
            this.d = onImageHelperListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream openInputStream = this.b.getContentResolver().openInputStream(this.a);
                try {
                    BitmapFactory.decodeStream(openInputStream, null, options);
                    Utils.close(openInputStream);
                    if (options.outWidth != 0 && options.outHeight != 0) {
                        int calculateReqWidth = ImageHelper.calculateReqWidth(this.b);
                        options.inSampleSize = ImageHelper.calculateInSamplesSize(options, calculateReqWidth, ImageHelper.calculateReqHeight(calculateReqWidth));
                        options.inJustDecodeBounds = false;
                        openInputStream = this.b.getContentResolver().openInputStream(this.a);
                        try {
                            this.e = new BitmapDrawable(this.b.getResources(), BitmapFactory.decodeStream(openInputStream, null, options));
                            Utils.close(openInputStream);
                            Utils.onUiThread(new a());
                            return;
                        } finally {
                        }
                    }
                    this.d.onError("Image size is (0;0)");
                } finally {
                }
            } catch (Throwable th) {
                String message = th.getMessage();
                OnImageHelperListener onImageHelperListener = this.d;
                if (message == null) {
                    message = "ImagePreparation error";
                }
                onImageHelperListener.onError(message);
            }
        }
    }

    public static int calculateInSamplesSize(@NonNull BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int i5 = 1;
        while (true) {
            if (i3 / i5 <= i && i4 / i5 <= i2) {
                return i5;
            }
            i5 *= 2;
        }
    }

    public static int calculateReqHeight(int i) {
        if (i > 700) {
            return 700;
        }
        return i;
    }

    public static int calculateReqWidth(@NonNull Context context) {
        Size screenSize = Utils.getScreenSize(context);
        return Math.min(1200, Math.min(screenSize.getWidth(), screenSize.getHeight()));
    }

    public static void fillImageView(@NonNull Context context, @NonNull ImageView imageView, @Nullable Uri uri, @Nullable Drawable drawable) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            loadImageByPath(context, uri, imageView, new a());
        }
    }

    private static void loadImageByPath(@NonNull Context context, @Nullable Uri uri, @Nullable ImageView imageView, @Nullable OnImageHelperListener onImageHelperListener) {
        if (onImageHelperListener == null) {
            return;
        }
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            onImageHelperListener.onError("ImagePath is invalid");
        } else if (imageView == null) {
            onImageHelperListener.onError("Target ImageView is null");
        } else {
            NativeNetworkExecutor.getInstance().execute(new b(context, uri, imageView, onImageHelperListener));
        }
    }
}
