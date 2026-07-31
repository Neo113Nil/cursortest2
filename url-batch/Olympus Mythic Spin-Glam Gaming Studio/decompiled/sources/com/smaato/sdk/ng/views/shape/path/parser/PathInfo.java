package com.smaato.sdk.ng.views.shape.path.parser;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class PathInfo {
    private final float a;
    private final float b;
    private final Path c;

    PathInfo(Path path, float f, float f2) {
        this.c = path;
        path.computeBounds(new RectF(), true);
        if (f <= 0.0f && f2 <= 0.0f) {
            f = (float) Math.ceil(r0.width());
            f2 = (float) Math.ceil(r0.height());
            path.offset(((float) Math.floor(r0.left)) * (-1.0f), Math.round(r0.top) * (-1.0f));
        }
        this.a = f;
        this.b = f2;
    }

    public float getHeight() {
        return this.b;
    }

    public float getWidth() {
        return this.a;
    }

    public void transform(Matrix matrix, Path path) {
        this.c.transform(matrix, path);
    }
}
