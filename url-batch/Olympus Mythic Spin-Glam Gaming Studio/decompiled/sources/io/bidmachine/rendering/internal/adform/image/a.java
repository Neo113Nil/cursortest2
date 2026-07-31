package io.bidmachine.rendering.internal.adform.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.event.b;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.Base64ResourceSource;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.UrlResourceSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {
    private final ImageView s;

    /* renamed from: io.bidmachine.rendering.internal.adform.image.a$a, reason: collision with other inner class name */
    private final class C1780a implements Repository.ResultCallback {
        public C1780a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.util.ResultCallback
        public void onError(Error error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // io.bidmachine.rendering.Repository.ResultCallback, io.bidmachine.util.ResultCallback
        public void onSuccess(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            a.this.s.setImageBitmap(bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, Repository repository, AdElementParams adElementParams, c adFormListener, b eventCallback, io.bidmachine.rendering.internal.detector.brokencreative.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.s = new ImageView(context);
    }

    @Override // io.bidmachine.rendering.internal.b
    public void b() {
        MediaSource.Companion companion = MediaSource.INSTANCE;
        a(companion.fromDefaultSettings(g().getPlaceholder()));
        q().b(this);
        Resource resource = g().getResource();
        ResourceSource source = resource != null ? resource.getSource() : null;
        if (source == null) {
            a(companion.from(g().getSource()));
            return;
        }
        if (source instanceof Base64ResourceSource) {
            a(companion.fromBase64(((Base64ResourceSource) source).getBase64()));
            return;
        }
        if (source instanceof UrlResourceSource) {
            a(companion.fromUrls(((UrlResourceSource) source).getUrls()));
            return;
        }
        b("Invalid resource type (" + source.getClass().getSimpleName() + "), it should be Base64ResourceSource or UrlResourceSource");
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View v() {
        return this.s;
    }

    private final void a(MediaSource mediaSource) {
        if (mediaSource != null) {
            u().getImage(mediaSource, t(), new C1780a());
        }
    }
}
