package q1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339e extends C0344j {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3893c = AtomicIntegerFieldUpdater.newUpdater(C0339e.class, "_resumed");
    private volatile int _resumed;

    public C0339e(C0338d c0338d, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
