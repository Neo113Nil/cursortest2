package com.five_corp.ad.internal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes15.dex */
public final class E {
    public final v a;
    public final ViewGroup b;
    public final TextureView c;
    public final Handler d;
    public final q e;
    public final ImageView f;
    public final com.five_corp.ad.internal.hub.ad_instance.e g;

    public E(Context context, v vVar, ViewGroup viewGroup, com.five_corp.ad.internal.cache.f fVar, com.five_corp.ad.internal.ad.h hVar, TextureView textureView, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        System.identityHashCode(this);
        this.a = vVar;
        this.b = viewGroup;
        this.c = textureView;
        this.g = eVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.d = handler;
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setVisibility(8);
        q qVar = new q(context);
        this.e = qVar;
        qVar.setVisibility(8);
        if (hVar != null) {
            handler.post(new w(this, fVar.a(context, hVar)));
        }
        handler.post(new w(this, textureView));
        handler.post(new w(this, imageView));
        handler.post(new w(this, qVar));
    }

    public final void a() {
        Bitmap bitmap;
        try {
            bitmap = this.c.getBitmap(Bitmap.createBitmap(this.c.getWidth(), this.c.getHeight(), Bitmap.Config.RGB_565));
        } catch (Exception e) {
            this.g.a(com.five_corp.ad.internal.logger.b.a(e.getMessage() + "\n" + Log.getStackTraceString(e)));
            bitmap = null;
        }
        if (bitmap == null) {
            this.g.a(com.five_corp.ad.internal.logger.b.a("getBitmap returns null, ignored"));
        } else {
            this.f.setImageBitmap(bitmap);
            this.f.setVisibility(0);
        }
    }
}
