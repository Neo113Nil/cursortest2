package defpackage;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class v7 extends ch0 {
    public static volatile v7 d;
    public final Object c;

    public v7(int i) {
        switch (i) {
            case 1:
                this.c = new Object();
                Executors.newFixedThreadPool(4, new kl());
                break;
            default:
                this.c = new v7(1);
                break;
        }
    }
}
