package io.ably.lib.types;

import java.util.Map;

/* loaded from: classes7.dex */
public class SummaryClientIdCounts {
    public final Map<String, Integer> clientIds;
    public final boolean clipped;
    public final int total;
    public final int totalClientIds;
    public final int totalUnidentified;

    public SummaryClientIdCounts(int i, Map<String, Integer> map, int i2, boolean z, int i3) {
        this.total = i;
        this.clientIds = map;
        this.totalUnidentified = i2;
        this.clipped = z;
        this.totalClientIds = i3;
    }
}
