package yads;

import android.content.Context;
import android.location.LocationManager;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;

/* loaded from: classes11.dex */
public final class t53 {
    public static final HashSet c = new HashSet(CollectionsKt.listOf("gps"));
    public static final HashSet d = new HashSet(CollectionsKt.listOf((Object[]) new String[]{"gps", "passive"}));
    public final LocationManager a;
    public final tc2 b;

    public t53(Context context, LocationManager locationManager) {
        tc2 tc2Var = new tc2(context);
        this.a = locationManager;
        this.b = tc2Var;
    }
}
