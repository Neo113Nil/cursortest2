package io.bidmachine.rendering.internal.adform.video.player;

import android.net.Uri;
import android.view.View;
import io.bidmachine.rendering.internal.m;
import io.bidmachine.rendering.internal.p;
import io.bidmachine.rendering.internal.s;

/* loaded from: classes15.dex */
public interface b extends m, p, s {
    void a(Uri uri);

    void a(d dVar);

    void destroy();

    long f();

    float getVolume();

    View l();

    void pause();

    void play();

    void prepare();
}
