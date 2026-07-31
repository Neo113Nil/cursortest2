package yads;

import android.content.Context;
import android.widget.ImageView;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final class yh0 implements DivImageLoader {
    public final lh1 a;
    public final o03 b;

    public yh0(Context context) {
        au2.a.getClass();
        lh1 a = n51.a();
        o03 o03Var = k92.d.a(context).a;
        this.a = a;
        this.b = o03Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, yads.e31] */
    public static final void a(Ref$ObjectRef ref$ObjectRef, yh0 yh0Var, String str, ImageView imageView) {
        ref$ObjectRef.element = yh0Var.b.a(str, new wh0(imageView), 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Ref$ObjectRef ref$ObjectRef) {
        e31 e31Var = (e31) ref$ObjectRef.element;
        if (e31Var != null) {
            e31Var.a();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback) {
        return a(str, divImageDownloadCallback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback) {
        return a(str, divImageDownloadCallback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImage(final String str, final ImageView imageView) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.a.a(new Runnable() { // from class: yads.yh0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                yh0.a(Ref$ObjectRef.this, this, str, imageView);
            }
        });
        return new LoadReference() { // from class: yads.yh0$$ExternalSyntheticLambda3
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                yh0.a(Ref$ObjectRef.this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Ref$ObjectRef ref$ObjectRef) {
        e31 e31Var = (e31) ref$ObjectRef.element;
        if (e31Var != null) {
            e31Var.a();
        }
    }

    public final LoadReference a(final String str, final DivImageDownloadCallback divImageDownloadCallback) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.a.a(new Runnable() { // from class: yads.yh0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                yh0.a(Ref$ObjectRef.this, this, str, divImageDownloadCallback);
            }
        });
        return new LoadReference() { // from class: yads.yh0$$ExternalSyntheticLambda1
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                yh0.a(yh0.this, ref$ObjectRef);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, yads.e31] */
    public static final void a(Ref$ObjectRef ref$ObjectRef, yh0 yh0Var, String str, DivImageDownloadCallback divImageDownloadCallback) {
        ref$ObjectRef.element = yh0Var.b.a(str, new xh0(str, divImageDownloadCallback), 0, 0);
    }

    public static final void a(yh0 yh0Var, final Ref$ObjectRef ref$ObjectRef) {
        yh0Var.a.a(new Runnable() { // from class: yads.yh0$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                yh0.b(Ref$ObjectRef.this);
            }
        });
    }
}
