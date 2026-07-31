package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: com.inmobi.media.ak, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3871ak implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(((Image) obj2).getWidth()), Integer.valueOf(((Image) obj).getWidth()));
    }
}
