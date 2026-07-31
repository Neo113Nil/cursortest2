package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes14.dex */
public final class Zj implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(((Image) obj).getWidth()), Integer.valueOf(((Image) obj2).getWidth()));
    }
}
