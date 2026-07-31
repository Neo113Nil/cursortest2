package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes14.dex */
public final class Yj implements Comparator {
    public final /* synthetic */ int a;

    public Yj(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.a)));
    }
}
