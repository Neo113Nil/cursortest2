package yads;

import com.yandex.mobile.ads.common.AdActivity;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class z1 {
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public int d;

    public z1(AdActivity adActivity) {
        this.d = adActivity.getResources().getConfiguration().orientation;
    }
}
