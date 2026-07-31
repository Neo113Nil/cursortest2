package yads;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;

/* loaded from: classes5.dex */
public final class q73 {
    public Point a;
    public final GestureDetector b;

    public q73(Context context) {
        this.b = new GestureDetector(context, new p73(this));
    }
}
