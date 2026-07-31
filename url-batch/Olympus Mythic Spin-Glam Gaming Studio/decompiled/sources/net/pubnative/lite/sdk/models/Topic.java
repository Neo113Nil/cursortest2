package net.pubnative.lite.sdk.models;

import java.util.Objects;

/* loaded from: classes4.dex */
public class Topic {
    private final int id;
    private final long taxonomyVersion;
    private final String taxonomyVersionName;

    public Topic(int i, long j, String str) {
        this.id = i;
        this.taxonomyVersion = j;
        this.taxonomyVersionName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Topic topic = (Topic) obj;
            if (this.id == topic.id && this.taxonomyVersion == topic.taxonomyVersion) {
                return true;
            }
        }
        return false;
    }

    public int getId() {
        return this.id;
    }

    public Long getTaxonomyVersion() {
        return Long.valueOf(this.taxonomyVersion);
    }

    public String getTaxonomyVersionName() {
        return this.taxonomyVersionName;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), Long.valueOf(this.taxonomyVersion));
    }
}
