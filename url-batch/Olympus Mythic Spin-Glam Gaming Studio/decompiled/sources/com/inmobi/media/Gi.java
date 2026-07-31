package com.inmobi.media;

/* loaded from: classes10.dex */
public final class Gi {
    public final int a;

    public Gi(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gi) && this.a == ((Gi) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.a + ")";
    }
}
