package com.apollographql.apollo.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.common.net.HttpHeaders;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Error.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002\u0016\u0017Ba\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/apollographql/apollo/api/Error;", "", "message", "", "locations", "", "Lcom/apollographql/apollo/api/Error$Location;", "path", "extensions", "", "nonStandardFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getMessage", "()Ljava/lang/String;", "getLocations", "()Ljava/util/List;", "getPath", "getExtensions", "()Ljava/util/Map;", "getNonStandardFields", InAppPurchaseConstants.METHOD_TO_STRING, "Builder", HttpHeaders.LOCATION, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Error {
    private final Map<String, Object> extensions;
    private final List<Location> locations;
    private final String message;
    private final Map<String, Object> nonStandardFields;
    private final List<Object> path;

    @Deprecated(message = "Use Error.Builder instead", replaceWith = @ReplaceWith(expression = "Builder(message = message).locations(locations).path(path).extensions(extensions)", imports = {}))
    public Error(String message, List<Location> list, List<? extends Object> list2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.locations = list;
        this.path = list2;
        this.extensions = map;
        this.nonStandardFields = map2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Location> getLocations() {
        return this.locations;
    }

    public final List<Object> getPath() {
        return this.path;
    }

    public final Map<String, Object> getExtensions() {
        return this.extensions;
    }

    public final Map<String, Object> getNonStandardFields() {
        return this.nonStandardFields;
    }

    /* compiled from: Error.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\tJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/apollographql/apollo/api/Error$Builder;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "locations", "", "Lcom/apollographql/apollo/api/Error$Location;", "getLocations", "()Ljava/util/List;", "setLocations", "(Ljava/util/List;)V", "path", "getPath", "setPath", "extensions", "", "getExtensions", "()Ljava/util/Map;", "putExtension", "name", "value", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/api/Error;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private final Map<String, Object> extensions;
        private List<Location> locations;
        private final String message;
        private List<? extends Object> path;

        public Builder(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.extensions = new LinkedHashMap();
        }

        public final String getMessage() {
            return this.message;
        }

        public final List<Location> getLocations() {
            return this.locations;
        }

        public final void setLocations(List<Location> list) {
            this.locations = list;
        }

        public final List<Object> getPath() {
            return this.path;
        }

        public final void setPath(List<? extends Object> list) {
            this.path = list;
        }

        public final Map<String, Object> getExtensions() {
            return this.extensions;
        }

        public final Builder locations(List<Location> locations) {
            Intrinsics.checkNotNullParameter(locations, "locations");
            this.locations = locations;
            return this;
        }

        public final Builder path(List<? extends Object> path) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
            return this;
        }

        public final Builder putExtension(String name, Object value) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.extensions.put(name, value);
            return this;
        }

        public final Error build() {
            return new Error(this.message, this.locations, this.path, this.extensions, null);
        }
    }

    public String toString() {
        return "Error(message = " + this.message + ", locations = " + this.locations + ", path=" + this.path + ", extensions = " + this.extensions + ", nonStandardFields = " + this.nonStandardFields + ')';
    }

    /* compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo/api/Error$Location;", "", "line", "", "column", "<init>", "(II)V", "getLine", "()I", "getColumn", InAppPurchaseConstants.METHOD_TO_STRING, "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Location {
        private final int column;
        private final int line;

        public Location(int i, int i2) {
            this.line = i;
            this.column = i2;
        }

        public final int getLine() {
            return this.line;
        }

        public final int getColumn() {
            return this.column;
        }

        public String toString() {
            return "Location(line = " + this.line + ", column = " + this.column + ')';
        }
    }
}
