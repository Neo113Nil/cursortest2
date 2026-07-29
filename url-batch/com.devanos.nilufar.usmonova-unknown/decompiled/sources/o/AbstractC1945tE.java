package o;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;

/* renamed from: o.tE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1945tE {
    public static final Moshi a;

    static {
        Moshi build = new Moshi.Builder().add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        AbstractC0048Bt.m(build, "build(...)");
        a = build;
    }
}
