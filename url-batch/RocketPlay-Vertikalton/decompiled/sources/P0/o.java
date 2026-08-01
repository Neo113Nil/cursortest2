package P0;

import K.C0019l;
import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f957a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final p f958b;

    /* renamed from: c, reason: collision with root package name */
    public final int f959c;
    public final int d;

    public o(p pVar, C0019l c0019l) {
        this.f958b = pVar;
        TypedArray typedArray = (TypedArray) c0019l.f684b;
        this.f959c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(52, 0);
    }
}
